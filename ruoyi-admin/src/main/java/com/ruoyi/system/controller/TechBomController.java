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
import com.ruoyi.system.domain.TechBom;
import com.ruoyi.system.service.ITechBomService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工艺bomController
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/bom")
public class TechBomController extends BaseController
{
    private String prefix = "system/bom";

    @Autowired
    private ITechBomService techBomService;

    @RequiresPermissions("system:bom:view")
    @GetMapping()
    public String bom()
    {
        return prefix + "/bom";
    }

    /**
     * 查询工艺bom列表
     */
    @RequiresPermissions("system:bom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TechBom techBom)
    {
        startPage();
        List<TechBom> list = techBomService.selectTechBomList(techBom);
        return getDataTable(list);
    }

    /**
     * 导出工艺bom列表
     */
    @RequiresPermissions("system:bom:export")
    @Log(title = "工艺bom", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TechBom techBom)
    {
        List<TechBom> list = techBomService.selectTechBomList(techBom);
        ExcelUtil<TechBom> util = new ExcelUtil<TechBom>(TechBom.class);
        return util.exportExcel(list, "工艺bom数据");
    }

    /**
     * 新增工艺bom
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工艺bom
     */
    @RequiresPermissions("system:bom:add")
    @Log(title = "工艺bom", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TechBom techBom)
    {
        return toAjax(techBomService.insertTechBom(techBom));
    }

    /**
     * 修改工艺bom
     */
    @RequiresPermissions("system:bom:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TechBom techBom = techBomService.selectTechBomById(id);
        mmap.put("techBom", techBom);
        return prefix + "/edit";
    }

    /**
     * 修改保存工艺bom
     */
    @RequiresPermissions("system:bom:edit")
    @Log(title = "工艺bom", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TechBom techBom)
    {
        return toAjax(techBomService.updateTechBom(techBom));
    }

    /**
     * 删除工艺bom
     */
    @RequiresPermissions("system:bom:remove")
    @Log(title = "工艺bom", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(techBomService.deleteTechBomByIds(ids));
    }
}
