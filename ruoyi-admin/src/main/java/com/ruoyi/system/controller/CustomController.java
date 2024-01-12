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
import com.ruoyi.system.domain.Custom;
import com.ruoyi.system.service.ICustomService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 客户Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/custom")
public class CustomController extends BaseController
{
    private String prefix = "system/custom";

    @Autowired
    private ICustomService customService;

    @RequiresPermissions("system:custom:view")
    @GetMapping()
    public String custom()
    {
        return prefix + "/custom";
    }

    /**
     * 查询客户列表
     */
    @RequiresPermissions("system:custom:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Custom custom)
    {
        startPage();
        List<Custom> list = customService.selectCustomList(custom);
        return getDataTable(list);
    }

    /**
     * 导出客户列表
     */
    @RequiresPermissions("system:custom:export")
    @Log(title = "客户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Custom custom)
    {
        List<Custom> list = customService.selectCustomList(custom);
        ExcelUtil<Custom> util = new ExcelUtil<Custom>(Custom.class);
        return util.exportExcel(list, "客户数据");
    }

    /**
     * 新增客户
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存客户
     */
    @RequiresPermissions("system:custom:add")
    @Log(title = "客户", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Custom custom)
    {
        return toAjax(customService.insertCustom(custom));
    }

    /**
     * 修改客户
     */
    @RequiresPermissions("system:custom:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Custom custom = customService.selectCustomById(id);
        mmap.put("custom", custom);
        return prefix + "/edit";
    }

    /**
     * 修改保存客户
     */
    @RequiresPermissions("system:custom:edit")
    @Log(title = "客户", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Custom custom)
    {
        return toAjax(customService.updateCustom(custom));
    }

    /**
     * 删除客户
     */
    @RequiresPermissions("system:custom:remove")
    @Log(title = "客户", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(customService.deleteCustomByIds(ids));
    }

    /**
     * 欠款审批
     */
    @RequiresPermissions("system:custom:Approval")
    @PostMapping( "/Approval")
    @ResponseBody
    public AjaxResult Approval(String id,String arrApproval)
    {
        int approval = customService.toApproval(id, arrApproval);
        if(approval!=0){
            return success();
        }else {
            return error("更改失败,请联系管理员");
        }

    }
}
