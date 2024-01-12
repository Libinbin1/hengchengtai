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
import com.ruoyi.system.domain.SalesoutbOrder;
import com.ruoyi.system.service.ISalesoutbOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售出库Controller
 * 
 * @author bin
 * @date 2024-01-11
 */
@Controller
@RequestMapping("/system/salesoutborder")
public class SalesoutbOrderController extends BaseController
{
    private String prefix = "system/salesoutborder";

    @Autowired
    private ISalesoutbOrderService salesoutbOrderService;

    @RequiresPermissions("system:salesoutborder:view")
    @GetMapping()
    public String salesoutborder()
    {
        return prefix + "/salesoutborder";
    }

    /**
     * 查询销售出库列表
     */
    @RequiresPermissions("system:salesoutborder:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SalesoutbOrder salesoutbOrder)
    {
        startPage();
        List<SalesoutbOrder> list = salesoutbOrderService.selectSalesoutbOrderList(salesoutbOrder);
        return getDataTable(list);
    }

    /**
     * 导出销售出库列表
     */
    @RequiresPermissions("system:salesoutborder:export")
    @Log(title = "销售出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SalesoutbOrder salesoutbOrder)
    {
        List<SalesoutbOrder> list = salesoutbOrderService.selectSalesoutbOrderList(salesoutbOrder);
        ExcelUtil<SalesoutbOrder> util = new ExcelUtil<SalesoutbOrder>(SalesoutbOrder.class);
        return util.exportExcel(list, "销售出库数据");
    }

    /**
     * 新增销售出库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售出库
     */
    @RequiresPermissions("system:salesoutborder:add")
    @Log(title = "销售出库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SalesoutbOrder salesoutbOrder)
    {
        return toAjax(salesoutbOrderService.insertSalesoutbOrder(salesoutbOrder));
    }

    /**
     * 修改销售出库
     */
    @RequiresPermissions("system:salesoutborder:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SalesoutbOrder salesoutbOrder = salesoutbOrderService.selectSalesoutbOrderById(id);
        mmap.put("salesoutbOrder", salesoutbOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售出库
     */
    @RequiresPermissions("system:salesoutborder:edit")
    @Log(title = "销售出库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SalesoutbOrder salesoutbOrder)
    {
        return toAjax(salesoutbOrderService.updateSalesoutbOrder(salesoutbOrder));
    }

    /**
     * 删除销售出库
     */
    @RequiresPermissions("system:salesoutborder:remove")
    @Log(title = "销售出库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesoutbOrderService.deleteSalesoutbOrderByIds(ids));
    }
}
