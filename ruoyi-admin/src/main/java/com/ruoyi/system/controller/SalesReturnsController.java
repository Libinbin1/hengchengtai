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
import com.ruoyi.system.domain.SalesReturns;
import com.ruoyi.system.service.ISalesReturnsService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 销售退货Controller
 * 
 * @author bin
 * @date 2024-01-11
 */
@Controller
@RequestMapping("/system/returns")
public class SalesReturnsController extends BaseController
{
    private String prefix = "system/returns";

    @Autowired
    private ISalesReturnsService salesReturnsService;

    @RequiresPermissions("system:returns:view")
    @GetMapping()
    public String returns()
    {
        return prefix + "/returns";
    }

    /**
     * 查询销售退货列表
     */
    @RequiresPermissions("system:returns:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SalesReturns salesReturns)
    {
        startPage();
        List<SalesReturns> list = salesReturnsService.selectSalesReturnsList(salesReturns);
        return getDataTable(list);
    }

    /**
     * 导出销售退货列表
     */
    @RequiresPermissions("system:returns:export")
    @Log(title = "销售退货", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SalesReturns salesReturns)
    {
        List<SalesReturns> list = salesReturnsService.selectSalesReturnsList(salesReturns);
        ExcelUtil<SalesReturns> util = new ExcelUtil<SalesReturns>(SalesReturns.class);
        return util.exportExcel(list, "销售退货数据");
    }

    /**
     * 新增销售退货
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存销售退货
     */
    @RequiresPermissions("system:returns:add")
    @Log(title = "销售退货", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SalesReturns salesReturns)
    {
        return toAjax(salesReturnsService.insertSalesReturns(salesReturns));
    }

    /**
     * 修改销售退货
     */
    @RequiresPermissions("system:returns:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SalesReturns salesReturns = salesReturnsService.selectSalesReturnsById(id);
        mmap.put("salesReturns", salesReturns);
        return prefix + "/edit";
    }

    /**
     * 修改保存销售退货
     */
    @RequiresPermissions("system:returns:edit")
    @Log(title = "销售退货", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SalesReturns salesReturns)
    {
        return toAjax(salesReturnsService.updateSalesReturns(salesReturns));
    }

    /**
     * 删除销售退货
     */
    @RequiresPermissions("system:returns:remove")
    @Log(title = "销售退货", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(salesReturnsService.deleteSalesReturnsByIds(ids));
    }
}
