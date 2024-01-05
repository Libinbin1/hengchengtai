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
import com.ruoyi.system.domain.PurchaseReceipt;
import com.ruoyi.system.service.IPurchaseReceiptService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 采购入库Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/purchasereceipt")
public class PurchaseReceiptController extends BaseController
{
    private String prefix = "system/purchasereceipt";

    @Autowired
    private IPurchaseReceiptService purchaseReceiptService;

    @RequiresPermissions("system:receipt:view")
    @GetMapping()
    public String receipt()
    {
        return prefix + "/receipt";
    }

    /**
     * 查询采购入库列表
     */
    @RequiresPermissions("system:receipt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PurchaseReceipt purchaseReceipt)
    {
        startPage();
        List<PurchaseReceipt> list = purchaseReceiptService.selectPurchaseReceiptList(purchaseReceipt);
        return getDataTable(list);
    }

    /**
     * 导出采购入库列表
     */
    @RequiresPermissions("system:receipt:export")
    @Log(title = "采购入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PurchaseReceipt purchaseReceipt)
    {
        List<PurchaseReceipt> list = purchaseReceiptService.selectPurchaseReceiptList(purchaseReceipt);
        ExcelUtil<PurchaseReceipt> util = new ExcelUtil<PurchaseReceipt>(PurchaseReceipt.class);
        return util.exportExcel(list, "采购入库数据");
    }

    /**
     * 新增采购入库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存采购入库
     */
    @RequiresPermissions("system:receipt:add")
    @Log(title = "采购入库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PurchaseReceipt purchaseReceipt)
    {
        return toAjax(purchaseReceiptService.insertPurchaseReceipt(purchaseReceipt));
    }

    /**
     * 修改采购入库
     */
    @RequiresPermissions("system:receipt:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        PurchaseReceipt purchaseReceipt = purchaseReceiptService.selectPurchaseReceiptById(id);
        mmap.put("purchaseReceipt", purchaseReceipt);
        return prefix + "/edit";
    }

    /**
     * 修改保存采购入库
     */
    @RequiresPermissions("system:receipt:edit")
    @Log(title = "采购入库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PurchaseReceipt purchaseReceipt)
    {
        return toAjax(purchaseReceiptService.updatePurchaseReceipt(purchaseReceipt));
    }

    /**
     * 删除采购入库
     */
    @RequiresPermissions("system:receipt:remove")
    @Log(title = "采购入库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(purchaseReceiptService.deletePurchaseReceiptByIds(ids));
    }
}
