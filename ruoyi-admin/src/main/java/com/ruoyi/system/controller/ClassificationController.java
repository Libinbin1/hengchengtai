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
import com.ruoyi.system.domain.Classification;
import com.ruoyi.system.service.IClassificationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 分类Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/classification")
public class ClassificationController extends BaseController
{
    private String prefix = "system/classification";

    @Autowired
    private IClassificationService classificationService;

    @RequiresPermissions("system:classification:view")
    @GetMapping()
    public String classification()
    {
        return prefix + "/classification";
    }

    /**
     * 查询分类列表
     */
    @RequiresPermissions("system:classification:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Classification classification)
    {
        startPage();
        List<Classification> list = classificationService.selectClassificationList(classification);
        return getDataTable(list);
    }

    /**
     * 导出分类列表
     */
    @RequiresPermissions("system:classification:export")
    @Log(title = "分类", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Classification classification)
    {
        List<Classification> list = classificationService.selectClassificationList(classification);
        ExcelUtil<Classification> util = new ExcelUtil<Classification>(Classification.class);
        return util.exportExcel(list, "分类数据");
    }

    /**
     * 新增分类
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存分类
     */
    @RequiresPermissions("system:classification:add")
    @Log(title = "分类", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Classification classification)
    {
        return toAjax(classificationService.insertClassification(classification));
    }

    /**
     * 修改分类
     */
    @RequiresPermissions("system:classification:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Classification classification = classificationService.selectClassificationById(id);
        mmap.put("classification", classification);
        return prefix + "/edit";
    }

    /**
     * 修改保存分类
     */
    @RequiresPermissions("system:classification:edit")
    @Log(title = "分类", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Classification classification)
    {
        return toAjax(classificationService.updateClassification(classification));
    }

    /**
     * 删除分类
     */
    @RequiresPermissions("system:classification:remove")
    @Log(title = "分类", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(classificationService.deleteClassificationByIds(ids));
    }
}
