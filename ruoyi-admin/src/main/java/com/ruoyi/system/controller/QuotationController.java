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
import com.ruoyi.system.domain.Quotation;
import com.ruoyi.system.service.IQuotationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 报价单Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/quotation")
public class QuotationController extends BaseController
{
    private String prefix = "system/quotation";

    @Autowired
    private IQuotationService quotationService;

    @RequiresPermissions("system:quotation:view")
    @GetMapping()
    public String quotation()
    {
        return prefix + "/quotation";
    }

    /**
     * 查询报价单列表
     */
    @RequiresPermissions("system:quotation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Quotation quotation)
    {
        startPage();
        List<Quotation> list = quotationService.selectQuotationList(quotation);
        return getDataTable(list);
    }

    /**
     * 导出报价单列表
     */
    @RequiresPermissions("system:quotation:export")
    @Log(title = "报价单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Quotation quotation)
    {
        List<Quotation> list = quotationService.selectQuotationList(quotation);
        ExcelUtil<Quotation> util = new ExcelUtil<Quotation>(Quotation.class);
        return util.exportExcel(list, "报价单数据");
    }

    /**
     * 新增报价单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存报价单
     */
    @RequiresPermissions("system:quotation:add")
    @Log(title = "报价单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Quotation quotation)
    {
        return toAjax(quotationService.insertQuotation(quotation));
    }

    /**
     * 修改报价单
     */
    @RequiresPermissions("system:quotation:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Quotation quotation = quotationService.selectQuotationById(id);
        mmap.put("quotation", quotation);
        return prefix + "/edit";
    }

    /**
     * 修改保存报价单
     */
    @RequiresPermissions("system:quotation:edit")
    @Log(title = "报价单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Quotation quotation)
    {
        return toAjax(quotationService.updateQuotation(quotation));
    }

    /**
     * 删除报价单
     */
    @RequiresPermissions("system:quotation:remove")
    @Log(title = "报价单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(quotationService.deleteQuotationByIds(ids));
    }
}
