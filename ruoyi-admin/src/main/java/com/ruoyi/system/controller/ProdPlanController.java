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
import com.ruoyi.system.domain.ProdPlan;
import com.ruoyi.system.service.IProdPlanService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产计划Controller
 * 
 * @author bin
 * @date 2024-01-11
 */
@Controller
@RequestMapping("/system/plan")
public class ProdPlanController extends BaseController
{
    private String prefix = "system/plan";

    @Autowired
    private IProdPlanService prodPlanService;

    @RequiresPermissions("system:plan:view")
    @GetMapping()
    public String plan()
    {
        return prefix + "/plan";
    }

    /**
     * 查询生产计划列表
     */
    @RequiresPermissions("system:plan:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProdPlan prodPlan)
    {
        startPage();
        List<ProdPlan> list = prodPlanService.selectProdPlanList(prodPlan);
        return getDataTable(list);
    }

    /**
     * 导出生产计划列表
     */
    @RequiresPermissions("system:plan:export")
    @Log(title = "生产计划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProdPlan prodPlan)
    {
        List<ProdPlan> list = prodPlanService.selectProdPlanList(prodPlan);
        ExcelUtil<ProdPlan> util = new ExcelUtil<ProdPlan>(ProdPlan.class);
        return util.exportExcel(list, "生产计划数据");
    }

    /**
     * 新增生产计划
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产计划
     */
    @RequiresPermissions("system:plan:add")
    @Log(title = "生产计划", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProdPlan prodPlan)
    {
        return toAjax(prodPlanService.insertProdPlan(prodPlan));
    }

    /**
     * 修改生产计划
     */
    @RequiresPermissions("system:plan:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProdPlan prodPlan = prodPlanService.selectProdPlanById(id);
        mmap.put("prodPlan", prodPlan);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产计划
     */
    @RequiresPermissions("system:plan:edit")
    @Log(title = "生产计划", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProdPlan prodPlan)
    {
        return toAjax(prodPlanService.updateProdPlan(prodPlan));
    }

    /**
     * 删除生产计划
     */
    @RequiresPermissions("system:plan:remove")
    @Log(title = "生产计划", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prodPlanService.deleteProdPlanByIds(ids));
    }
}
