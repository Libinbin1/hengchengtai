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
import com.ruoyi.system.domain.Unit;
import com.ruoyi.system.service.IUnitService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 单位Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/unit")
public class UnitController extends BaseController
{
    private String prefix = "system/unit";

    @Autowired
    private IUnitService unitService;

    @RequiresPermissions("system:unit:view")
    @GetMapping()
    public String unit()
    {
        return prefix + "/unit";
    }

    /**
     * 查询单位列表
     */
    @RequiresPermissions("system:unit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Unit unit)
    {
        startPage();
        List<Unit> list = unitService.selectUnitList(unit);
        return getDataTable(list);
    }

    /**
     * 导出单位列表
     */
    @RequiresPermissions("system:unit:export")
    @Log(title = "单位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Unit unit)
    {
        List<Unit> list = unitService.selectUnitList(unit);
        ExcelUtil<Unit> util = new ExcelUtil<Unit>(Unit.class);
        return util.exportExcel(list, "单位数据");
    }

    /**
     * 新增单位
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存单位
     */
    @RequiresPermissions("system:unit:add")
    @Log(title = "单位", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Unit unit)
    {
        return toAjax(unitService.insertUnit(unit));
    }

    /**
     * 修改单位
     */
    @RequiresPermissions("system:unit:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Unit unit = unitService.selectUnitById(id);
        mmap.put("unit", unit);
        return prefix + "/edit";
    }

    /**
     * 修改保存单位
     */
    @RequiresPermissions("system:unit:edit")
    @Log(title = "单位", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Unit unit)
    {
        return toAjax(unitService.updateUnit(unit));
    }

    /**
     * 删除单位
     */
    @RequiresPermissions("system:unit:remove")
    @Log(title = "单位", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(unitService.deleteUnitByIds(ids));
    }
}
