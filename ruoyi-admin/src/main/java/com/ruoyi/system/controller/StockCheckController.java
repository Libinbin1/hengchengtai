package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.StockCheck;
import com.ruoyi.system.service.IStockCheckService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存盘点Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/check")
public class StockCheckController extends BaseController
{
    private String prefix = "system/check";

    @Autowired
    private IStockCheckService stockCheckService;

    @RequiresPermissions("system:check:view")
    @GetMapping()
    public String check()
    {
        return prefix + "/check";
    }

    /**
     * 查询库存盘点列表
     */
    @RequiresPermissions("system:check:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockCheck stockCheck)
    {
        startPage();
        List<StockCheck> list = stockCheckService.selectStockCheckList(stockCheck);
        return getDataTable(list);
    }

    /**
     * 导出库存盘点列表
     */
    @RequiresPermissions("system:check:export")
    @Log(title = "库存盘点", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockCheck stockCheck)
    {
        List<StockCheck> list = stockCheckService.selectStockCheckList(stockCheck);
        ExcelUtil<StockCheck> util = new ExcelUtil<StockCheck>(StockCheck.class);
        return util.exportExcel(list, "库存盘点数据");
    }

    /**
     * 新增库存盘点
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存盘点
     */
    @RequiresPermissions("system:check:add")
    @Log(title = "库存盘点", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockCheck stockCheck)
    {
        return toAjax(stockCheckService.insertStockCheck(stockCheck));
    }

    /**
     * 修改库存盘点
     */
    @RequiresPermissions("system:check:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        StockCheck stockCheck = stockCheckService.selectStockCheckById(id);
        mmap.put("stockCheck", stockCheck);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存盘点
     */
    @RequiresPermissions("system:check:edit")
    @Log(title = "库存盘点", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockCheck stockCheck)
    {
        return toAjax(stockCheckService.updateStockCheck(stockCheck));
    }

    /**
     * 删除库存盘点
     */
    @RequiresPermissions("system:check:remove")
    @Log(title = "库存盘点", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockCheckService.deleteStockCheckByIds(ids));
    }
}
