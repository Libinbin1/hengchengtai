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
import com.ruoyi.system.domain.OtherOutb;
import com.ruoyi.system.service.IOtherOutbService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 其他出库Controller
 * 
 * @author bin
 * @date 2024-01-11
 */
@Controller
@RequestMapping("/system/outb")
public class OtherOutbController extends BaseController
{
    private String prefix = "system/outb";

    @Autowired
    private IOtherOutbService otherOutbService;

    @RequiresPermissions("system:outb:view")
    @GetMapping()
    public String outb()
    {
        return prefix + "/outb";
    }

    /**
     * 查询其他出库列表
     */
    @RequiresPermissions("system:outb:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OtherOutb otherOutb)
    {
        startPage();
        List<OtherOutb> list = otherOutbService.selectOtherOutbList(otherOutb);
        return getDataTable(list);
    }

    /**
     * 导出其他出库列表
     */
    @RequiresPermissions("system:outb:export")
    @Log(title = "其他出库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OtherOutb otherOutb)
    {
        List<OtherOutb> list = otherOutbService.selectOtherOutbList(otherOutb);
        ExcelUtil<OtherOutb> util = new ExcelUtil<OtherOutb>(OtherOutb.class);
        return util.exportExcel(list, "其他出库数据");
    }

    /**
     * 新增其他出库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存其他出库
     */
    @RequiresPermissions("system:outb:add")
    @Log(title = "其他出库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OtherOutb otherOutb)
    {
        return toAjax(otherOutbService.insertOtherOutb(otherOutb));
    }

    /**
     * 修改其他出库
     */
    @RequiresPermissions("system:outb:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        OtherOutb otherOutb = otherOutbService.selectOtherOutbById(id);
        mmap.put("otherOutb", otherOutb);
        return prefix + "/edit";
    }

    /**
     * 修改保存其他出库
     */
    @RequiresPermissions("system:outb:edit")
    @Log(title = "其他出库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OtherOutb otherOutb)
    {
        return toAjax(otherOutbService.updateOtherOutb(otherOutb));
    }

    /**
     * 删除其他出库
     */
    @RequiresPermissions("system:outb:remove")
    @Log(title = "其他出库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(otherOutbService.deleteOtherOutbByIds(ids));
    }
}
