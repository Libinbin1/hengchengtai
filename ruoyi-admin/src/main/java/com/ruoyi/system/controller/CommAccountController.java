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
import com.ruoyi.system.domain.CommAccount;
import com.ruoyi.system.service.ICommAccountService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 往来账目Controller
 * 
 * @author bin
 * @date 2024-01-12
 */
@Controller
@RequestMapping("/system/account")
public class CommAccountController extends BaseController
{
    private String prefix = "system/account";

    @Autowired
    private ICommAccountService commAccountService;

    @RequiresPermissions("system:account:view")
    @GetMapping()
    public String account()
    {
        return prefix + "/account";
    }

    /**
     * 查询往来账目列表
     */
    @RequiresPermissions("system:account:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CommAccount commAccount)
    {
        startPage();
        List<CommAccount> list = commAccountService.selectCommAccountList(commAccount);
        return getDataTable(list);
    }

    /**
     * 导出往来账目列表
     */
    @RequiresPermissions("system:account:export")
    @Log(title = "往来账目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CommAccount commAccount)
    {
        List<CommAccount> list = commAccountService.selectCommAccountList(commAccount);
        ExcelUtil<CommAccount> util = new ExcelUtil<CommAccount>(CommAccount.class);
        return util.exportExcel(list, "往来账目数据");
    }

    /**
     * 新增往来账目
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存往来账目
     */
    @RequiresPermissions("system:account:add")
    @Log(title = "往来账目", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CommAccount commAccount)
    {
        return toAjax(commAccountService.insertCommAccount(commAccount));
    }

    /**
     * 修改往来账目
     */
    @RequiresPermissions("system:account:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        CommAccount commAccount = commAccountService.selectCommAccountById(id);
        mmap.put("commAccount", commAccount);
        return prefix + "/edit";
    }

    /**
     * 修改保存往来账目
     */
    @RequiresPermissions("system:account:edit")
    @Log(title = "往来账目", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CommAccount commAccount)
    {
        return toAjax(commAccountService.updateCommAccount(commAccount));
    }

    /**
     * 删除往来账目
     */
    @RequiresPermissions("system:account:remove")
    @Log(title = "往来账目", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(commAccountService.deleteCommAccountByIds(ids));
    }
}
