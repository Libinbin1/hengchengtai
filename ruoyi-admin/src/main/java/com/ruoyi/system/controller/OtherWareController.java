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
import com.ruoyi.system.domain.OtherWare;
import com.ruoyi.system.service.IOtherWareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 其他入库Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/otherware")
public class OtherWareController extends BaseController
{
    private String prefix = "system/otherware";

    @Autowired
    private IOtherWareService otherWareService;

    @RequiresPermissions("system:ware:view")
    @GetMapping()
    public String ware()
    {
        return prefix + "/ware";
    }

    /**
     * 查询其他入库列表
     */
    @RequiresPermissions("system:ware:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OtherWare otherWare)
    {
        startPage();
        List<OtherWare> list = otherWareService.selectOtherWareList(otherWare);
        return getDataTable(list);
    }

    /**
     * 导出其他入库列表
     */
    @RequiresPermissions("system:ware:export")
    @Log(title = "其他入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OtherWare otherWare)
    {
        List<OtherWare> list = otherWareService.selectOtherWareList(otherWare);
        ExcelUtil<OtherWare> util = new ExcelUtil<OtherWare>(OtherWare.class);
        return util.exportExcel(list, "其他入库数据");
    }

    /**
     * 新增其他入库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存其他入库
     */
    @RequiresPermissions("system:ware:add")
    @Log(title = "其他入库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OtherWare otherWare)
    {
        return toAjax(otherWareService.insertOtherWare(otherWare));
    }

    /**
     * 修改其他入库
     */
    @RequiresPermissions("system:ware:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OtherWare otherWare = otherWareService.selectOtherWareById(id);
        mmap.put("otherWare", otherWare);
        return prefix + "/edit";
    }

    /**
     * 修改保存其他入库
     */
    @RequiresPermissions("system:ware:edit")
    @Log(title = "其他入库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OtherWare otherWare)
    {
        return toAjax(otherWareService.updateOtherWare(otherWare));
    }

    /**
     * 删除其他入库
     */
    @RequiresPermissions("system:ware:remove")
    @Log(title = "其他入库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(otherWareService.deleteOtherWareByIds(ids));
    }
}
