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
import com.ruoyi.system.domain.Payment;
import com.ruoyi.system.service.IPaymentService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 付款Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/payment")
public class PaymentController extends BaseController
{
    private String prefix = "system/payment";

    @Autowired
    private IPaymentService paymentService;

    @RequiresPermissions("system:payment:view")
    @GetMapping()
    public String payment()
    {
        return prefix + "/payment";
    }

    /**
     * 查询付款列表
     */
    @RequiresPermissions("system:payment:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Payment payment)
    {
        startPage();
        List<Payment> list = paymentService.selectPaymentList(payment);
        return getDataTable(list);
    }

    /**
     * 导出付款列表
     */
    @RequiresPermissions("system:payment:export")
    @Log(title = "付款", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Payment payment)
    {
        List<Payment> list = paymentService.selectPaymentList(payment);
        ExcelUtil<Payment> util = new ExcelUtil<Payment>(Payment.class);
        return util.exportExcel(list, "付款数据");
    }

    /**
     * 新增付款
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存付款
     */
    @RequiresPermissions("system:payment:add")
    @Log(title = "付款", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Payment payment)
    {
        return toAjax(paymentService.insertPayment(payment));
    }

    /**
     * 修改付款
     */
    @RequiresPermissions("system:payment:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Payment payment = paymentService.selectPaymentById(id);
        mmap.put("payment", payment);
        return prefix + "/edit";
    }

    /**
     * 修改保存付款
     */
    @RequiresPermissions("system:payment:edit")
    @Log(title = "付款", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Payment payment)
    {
        return toAjax(paymentService.updatePayment(payment));
    }

    /**
     * 删除付款
     */
    @RequiresPermissions("system:payment:remove")
    @Log(title = "付款", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(paymentService.deletePaymentByIds(ids));
    }
}
