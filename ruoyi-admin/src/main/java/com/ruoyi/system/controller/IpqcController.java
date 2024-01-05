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
import com.ruoyi.system.domain.Ipqc;
import com.ruoyi.system.service.IIpqcService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 制程检验Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/ipqc")
public class IpqcController extends BaseController
{
    private String prefix = "system/ipqc";

    @Autowired
    private IIpqcService ipqcService;

    @RequiresPermissions("system:ipqc:view")
    @GetMapping()
    public String ipqc()
    {
        return prefix + "/ipqc";
    }

    /**
     * 查询制程检验列表
     */
    @RequiresPermissions("system:ipqc:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Ipqc ipqc)
    {
        startPage();
        List<Ipqc> list = ipqcService.selectIpqcList(ipqc);
        return getDataTable(list);
    }

    /**
     * 导出制程检验列表
     */
    @RequiresPermissions("system:ipqc:export")
    @Log(title = "制程检验", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Ipqc ipqc)
    {
        List<Ipqc> list = ipqcService.selectIpqcList(ipqc);
        ExcelUtil<Ipqc> util = new ExcelUtil<Ipqc>(Ipqc.class);
        return util.exportExcel(list, "制程检验数据");
    }

    /**
     * 新增制程检验
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存制程检验
     */
    @RequiresPermissions("system:ipqc:add")
    @Log(title = "制程检验", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Ipqc ipqc)
    {
        return toAjax(ipqcService.insertIpqc(ipqc));
    }

    /**
     * 修改制程检验
     */
    @RequiresPermissions("system:ipqc:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Ipqc ipqc = ipqcService.selectIpqcById(id);
        mmap.put("ipqc", ipqc);
        return prefix + "/edit";
    }

    /**
     * 修改保存制程检验
     */
    @RequiresPermissions("system:ipqc:edit")
    @Log(title = "制程检验", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Ipqc ipqc)
    {
        return toAjax(ipqcService.updateIpqc(ipqc));
    }

    /**
     * 删除制程检验
     */
    @RequiresPermissions("system:ipqc:remove")
    @Log(title = "制程检验", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(ipqcService.deleteIpqcByIds(ids));
    }
}
