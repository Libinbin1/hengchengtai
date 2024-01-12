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
import com.ruoyi.system.domain.PurchaseOrder;
import com.ruoyi.system.service.IPurchaseOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采购订单Controller
 * 
 * @author bin
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/purchaseorder")
public class PurchaseOrderController extends BaseController
{
    private String prefix = "system/purchaseorder";

    @Autowired
    private IPurchaseOrderService purchaseOrderService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/purchaseorder";
    }

    /**
     * 查询采购订单列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PurchaseOrder purchaseOrder)
    {
        startPage();
        List<PurchaseOrder> list = purchaseOrderService.selectPurchaseOrderList(purchaseOrder);
        return getDataTable(list);
    }

    /**
     * 导出采购订单列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "采购订单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurchaseOrder purchaseOrder)
    {
        List<PurchaseOrder> list = purchaseOrderService.selectPurchaseOrderList(purchaseOrder);
        ExcelUtil<PurchaseOrder> util = new ExcelUtil<PurchaseOrder>(PurchaseOrder.class);
        return util.exportExcel(list, "采购订单数据");
    }

    /**
     * 新增采购订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存采购订单
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "采购订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PurchaseOrder purchaseOrder)
    {
        return toAjax(purchaseOrderService.insertPurchaseOrder(purchaseOrder));
    }

    /**
     * 修改采购订单
     */
    @RequiresPermissions("system:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PurchaseOrder purchaseOrder = purchaseOrderService.selectPurchaseOrderById(id);
        mmap.put("purchaseOrder", purchaseOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存采购订单
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "采购订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PurchaseOrder purchaseOrder)
    {
        return toAjax(purchaseOrderService.updatePurchaseOrder(purchaseOrder));
    }

    /**
     * 删除采购订单
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "采购订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purchaseOrderService.deletePurchaseOrderByIds(ids));
    }
}
