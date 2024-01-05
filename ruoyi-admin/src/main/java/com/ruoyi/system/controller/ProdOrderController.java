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
import com.ruoyi.system.domain.ProdOrder;
import com.ruoyi.system.service.IProdOrderService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产工单Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/order")
public class ProdOrderController extends BaseController
{
    private String prefix = "system/order";

    @Autowired
    private IProdOrderService prodOrderService;

    @RequiresPermissions("system:order:view")
    @GetMapping()
    public String order()
    {
        return prefix + "/order";
    }

    /**
     * 查询生产工单列表
     */
    @RequiresPermissions("system:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProdOrder prodOrder)
    {
        startPage();
        List<ProdOrder> list = prodOrderService.selectProdOrderList(prodOrder);
        return getDataTable(list);
    }

    /**
     * 导出生产工单列表
     */
    @RequiresPermissions("system:order:export")
    @Log(title = "生产工单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProdOrder prodOrder)
    {
        List<ProdOrder> list = prodOrderService.selectProdOrderList(prodOrder);
        ExcelUtil<ProdOrder> util = new ExcelUtil<ProdOrder>(ProdOrder.class);
        return util.exportExcel(list, "生产工单数据");
    }

    /**
     * 新增生产工单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产工单
     */
    @RequiresPermissions("system:order:add")
    @Log(title = "生产工单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProdOrder prodOrder)
    {
        return toAjax(prodOrderService.insertProdOrder(prodOrder));
    }

    /**
     * 修改生产工单
     */
    @RequiresPermissions("system:order:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProdOrder prodOrder = prodOrderService.selectProdOrderById(id);
        mmap.put("prodOrder", prodOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产工单
     */
    @RequiresPermissions("system:order:edit")
    @Log(title = "生产工单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProdOrder prodOrder)
    {
        return toAjax(prodOrderService.updateProdOrder(prodOrder));
    }

    /**
     * 删除生产工单
     */
    @RequiresPermissions("system:order:remove")
    @Log(title = "生产工单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prodOrderService.deleteProdOrderByIds(ids));
    }
}
