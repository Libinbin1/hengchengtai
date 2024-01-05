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
import com.ruoyi.system.domain.Receipt;
import com.ruoyi.system.service.IReceiptService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收款单Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/receipt")
public class ReceiptController extends BaseController
{
    private String prefix = "system/receipt";

    @Autowired
    private IReceiptService receiptService;

    @RequiresPermissions("system:receipt:view")
    @GetMapping()
    public String receipt()
    {
        return prefix + "/receipt";
    }

    /**
     * 查询收款单列表
     */
    @RequiresPermissions("system:receipt:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Receipt receipt)
    {
        startPage();
        List<Receipt> list = receiptService.selectReceiptList(receipt);
        return getDataTable(list);
    }

    /**
     * 导出收款单列表
     */
    @RequiresPermissions("system:receipt:export")
    @Log(title = "收款单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Receipt receipt)
    {
        List<Receipt> list = receiptService.selectReceiptList(receipt);
        ExcelUtil<Receipt> util = new ExcelUtil<Receipt>(Receipt.class);
        return util.exportExcel(list, "收款单数据");
    }

    /**
     * 新增收款单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存收款单
     */
    @RequiresPermissions("system:receipt:add")
    @Log(title = "收款单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Receipt receipt)
    {
        return toAjax(receiptService.insertReceipt(receipt));
    }

    /**
     * 修改收款单
     */
    @RequiresPermissions("system:receipt:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Receipt receipt = receiptService.selectReceiptById(id);
        mmap.put("receipt", receipt);
        return prefix + "/edit";
    }

    /**
     * 修改保存收款单
     */
    @RequiresPermissions("system:receipt:edit")
    @Log(title = "收款单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Receipt receipt)
    {
        return toAjax(receiptService.updateReceipt(receipt));
    }

    /**
     * 删除收款单
     */
    @RequiresPermissions("system:receipt:remove")
    @Log(title = "收款单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(receiptService.deleteReceiptByIds(ids));
    }
}
