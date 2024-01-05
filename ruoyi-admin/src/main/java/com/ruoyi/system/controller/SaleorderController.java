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
import com.ruoyi.system.domain.Saleorder;
import com.ruoyi.system.service.ISaleorderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售订单Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/saleorder")
public class SaleorderController extends BaseController
{
    private String prefix = "system/saleorder";

    @Autowired
    private ISaleorderService saleorderService;

    @RequiresPermissions("system:saleorder:view")
    @GetMapping()
    public String saleorder()
    {
        return prefix + "/saleorder";
    }

    /**
     * 查询销售订单列表
     */
    @RequiresPermissions("system:saleorder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Saleorder saleorder)
    {
        startPage();
        List<Saleorder> list = saleorderService.selectSaleorderList(saleorder);
        return getDataTable(list);
    }

    /**
     * 导出销售订单列表
     */
    @RequiresPermissions("system:saleorder:export")
    @Log(title = "销售订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Saleorder saleorder)
    {
        List<Saleorder> list = saleorderService.selectSaleorderList(saleorder);
        ExcelUtil<Saleorder> util = new ExcelUtil<Saleorder>(Saleorder.class);
        return util.exportExcel(list, "销售订单数据");
    }

    /**
     * 新增销售订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售订单
     */
    @RequiresPermissions("system:saleorder:add")
    @Log(title = "销售订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Saleorder saleorder)
    {
        return toAjax(saleorderService.insertSaleorder(saleorder));
    }

    /**
     * 修改销售订单
     */
    @RequiresPermissions("system:saleorder:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Saleorder saleorder = saleorderService.selectSaleorderById(id);
        mmap.put("saleorder", saleorder);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售订单
     */
    @RequiresPermissions("system:saleorder:edit")
    @Log(title = "销售订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Saleorder saleorder)
    {
        return toAjax(saleorderService.updateSaleorder(saleorder));
    }

    /**
     * 删除销售订单
     */
    @RequiresPermissions("system:saleorder:remove")
    @Log(title = "销售订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(saleorderService.deleteSaleorderByIds(ids));
    }
}
