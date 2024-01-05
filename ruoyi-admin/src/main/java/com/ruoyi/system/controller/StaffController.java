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
import com.ruoyi.system.domain.Staff;
import com.ruoyi.system.service.IStaffService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 员工信息Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/staff")
public class StaffController extends BaseController
{
    private String prefix = "system/staff";

    @Autowired
    private IStaffService staffService;

    @RequiresPermissions("system:staff:view")
    @GetMapping()
    public String staff()
    {
        return prefix + "/staff";
    }

    /**
     * 查询员工信息列表
     */
    @RequiresPermissions("system:staff:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Staff staff)
    {
        startPage();
        List<Staff> list = staffService.selectStaffList(staff);
        return getDataTable(list);
    }

    /**
     * 导出员工信息列表
     */
    @RequiresPermissions("system:staff:export")
    @Log(title = "员工信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Staff staff)
    {
        List<Staff> list = staffService.selectStaffList(staff);
        ExcelUtil<Staff> util = new ExcelUtil<Staff>(Staff.class);
        return util.exportExcel(list, "员工信息数据");
    }

    /**
     * 新增员工信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存员工信息
     */
    @RequiresPermissions("system:staff:add")
    @Log(title = "员工信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Staff staff)
    {
        return toAjax(staffService.insertStaff(staff));
    }

    /**
     * 修改员工信息
     */
    @RequiresPermissions("system:staff:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Staff staff = staffService.selectStaffById(id);
        mmap.put("staff", staff);
        return prefix + "/edit";
    }

    /**
     * 修改保存员工信息
     */
    @RequiresPermissions("system:staff:edit")
    @Log(title = "员工信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Staff staff)
    {
        return toAjax(staffService.updateStaff(staff));
    }

    /**
     * 删除员工信息
     */
    @RequiresPermissions("system:staff:remove")
    @Log(title = "员工信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(staffService.deleteStaffByIds(ids));
    }
}
