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
import com.ruoyi.system.domain.Oqc;
import com.ruoyi.system.service.IOqcService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出库检验Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/oqc")
public class OqcController extends BaseController
{
    private String prefix = "system/oqc";

    @Autowired
    private IOqcService oqcService;

    @RequiresPermissions("system:oqc:view")
    @GetMapping()
    public String oqc()
    {
        return prefix + "/oqc";
    }

    /**
     * 查询出库检验列表
     */
    @RequiresPermissions("system:oqc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Oqc oqc)
    {
        startPage();
        List<Oqc> list = oqcService.selectOqcList(oqc);
        return getDataTable(list);
    }

    /**
     * 导出出库检验列表
     */
    @RequiresPermissions("system:oqc:export")
    @Log(title = "出库检验", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Oqc oqc)
    {
        List<Oqc> list = oqcService.selectOqcList(oqc);
        ExcelUtil<Oqc> util = new ExcelUtil<Oqc>(Oqc.class);
        return util.exportExcel(list, "出库检验数据");
    }

    /**
     * 新增出库检验
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出库检验
     */
    @RequiresPermissions("system:oqc:add")
    @Log(title = "出库检验", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Oqc oqc)
    {
        return toAjax(oqcService.insertOqc(oqc));
    }

    /**
     * 修改出库检验
     */
    @RequiresPermissions("system:oqc:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Oqc oqc = oqcService.selectOqcById(id);
        mmap.put("oqc", oqc);
        return prefix + "/edit";
    }

    /**
     * 修改保存出库检验
     */
    @RequiresPermissions("system:oqc:edit")
    @Log(title = "出库检验", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Oqc oqc)
    {
        return toAjax(oqcService.updateOqc(oqc));
    }

    /**
     * 删除出库检验
     */
    @RequiresPermissions("system:oqc:remove")
    @Log(title = "出库检验", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(oqcService.deleteOqcByIds(ids));
    }
}
