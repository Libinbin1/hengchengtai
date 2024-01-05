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
import com.ruoyi.system.domain.Fqc;
import com.ruoyi.system.service.IFqcService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成品检验Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/fqc")
public class FqcController extends BaseController
{
    private String prefix = "system/fqc";

    @Autowired
    private IFqcService fqcService;

    @RequiresPermissions("system:fqc:view")
    @GetMapping()
    public String fqc()
    {
        return prefix + "/fqc";
    }

    /**
     * 查询成品检验列表
     */
    @RequiresPermissions("system:fqc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Fqc fqc)
    {
        startPage();
        List<Fqc> list = fqcService.selectFqcList(fqc);
        return getDataTable(list);
    }

    /**
     * 导出成品检验列表
     */
    @RequiresPermissions("system:fqc:export")
    @Log(title = "成品检验", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Fqc fqc)
    {
        List<Fqc> list = fqcService.selectFqcList(fqc);
        ExcelUtil<Fqc> util = new ExcelUtil<Fqc>(Fqc.class);
        return util.exportExcel(list, "成品检验数据");
    }

    /**
     * 新增成品检验
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存成品检验
     */
    @RequiresPermissions("system:fqc:add")
    @Log(title = "成品检验", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Fqc fqc)
    {
        return toAjax(fqcService.insertFqc(fqc));
    }

    /**
     * 修改成品检验
     */
    @RequiresPermissions("system:fqc:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Fqc fqc = fqcService.selectFqcById(id);
        mmap.put("fqc", fqc);
        return prefix + "/edit";
    }

    /**
     * 修改保存成品检验
     */
    @RequiresPermissions("system:fqc:edit")
    @Log(title = "成品检验", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Fqc fqc)
    {
        return toAjax(fqcService.updateFqc(fqc));
    }

    /**
     * 删除成品检验
     */
    @RequiresPermissions("system:fqc:remove")
    @Log(title = "成品检验", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(fqcService.deleteFqcByIds(ids));
    }
}
