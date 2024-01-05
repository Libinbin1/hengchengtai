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
import com.ruoyi.system.domain.StockTable;
import com.ruoyi.system.service.IStockTableService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 库存Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/table")
public class StockTableController extends BaseController
{
    private String prefix = "system/table";

    @Autowired
    private IStockTableService stockTableService;

    @RequiresPermissions("system:table:view")
    @GetMapping()
    public String table()
    {
        return prefix + "/table";
    }

    /**
     * 查询库存列表
     */
    @RequiresPermissions("system:table:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(StockTable stockTable)
    {
        startPage();
        List<StockTable> list = stockTableService.selectStockTableList(stockTable);
        return getDataTable(list);
    }

    /**
     * 导出库存列表
     */
    @RequiresPermissions("system:table:export")
    @Log(title = "库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(StockTable stockTable)
    {
        List<StockTable> list = stockTableService.selectStockTableList(stockTable);
        ExcelUtil<StockTable> util = new ExcelUtil<StockTable>(StockTable.class);
        return util.exportExcel(list, "库存数据");
    }

    /**
     * 新增库存
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存
     */
    @RequiresPermissions("system:table:add")
    @Log(title = "库存", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(StockTable stockTable)
    {
        return toAjax(stockTableService.insertStockTable(stockTable));
    }

    /**
     * 修改库存
     */
    @RequiresPermissions("system:table:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        StockTable stockTable = stockTableService.selectStockTableById(id);
        mmap.put("stockTable", stockTable);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存
     */
    @RequiresPermissions("system:table:edit")
    @Log(title = "库存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(StockTable stockTable)
    {
        return toAjax(stockTableService.updateStockTable(stockTable));
    }

    /**
     * 删除库存
     */
    @RequiresPermissions("system:table:remove")
    @Log(title = "库存", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(stockTableService.deleteStockTableByIds(ids));
    }
}
