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
import com.ruoyi.system.domain.RequInvo;
import com.ruoyi.system.service.IRequInvoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 发票申请单Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/invo")
public class RequInvoController extends BaseController
{
    private String prefix = "system/invo";

    @Autowired
    private IRequInvoService requInvoService;

    @RequiresPermissions("system:invo:view")
    @GetMapping()
    public String invo()
    {
        return prefix + "/invo";
    }

    /**
     * 查询发票申请单列表
     */
    @RequiresPermissions("system:invo:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RequInvo requInvo)
    {
        startPage();
        List<RequInvo> list = requInvoService.selectRequInvoList(requInvo);
        return getDataTable(list);
    }

    /**
     * 导出发票申请单列表
     */
    @RequiresPermissions("system:invo:export")
    @Log(title = "发票申请单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RequInvo requInvo)
    {
        List<RequInvo> list = requInvoService.selectRequInvoList(requInvo);
        ExcelUtil<RequInvo> util = new ExcelUtil<RequInvo>(RequInvo.class);
        return util.exportExcel(list, "发票申请单数据");
    }

    /**
     * 新增发票申请单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存发票申请单
     */
    @RequiresPermissions("system:invo:add")
    @Log(title = "发票申请单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RequInvo requInvo)
    {
        return toAjax(requInvoService.insertRequInvo(requInvo));
    }

    /**
     * 修改发票申请单
     */
    @RequiresPermissions("system:invo:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RequInvo requInvo = requInvoService.selectRequInvoById(id);
        mmap.put("requInvo", requInvo);
        return prefix + "/edit";
    }

    /**
     * 修改保存发票申请单
     */
    @RequiresPermissions("system:invo:edit")
    @Log(title = "发票申请单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RequInvo requInvo)
    {
        return toAjax(requInvoService.updateRequInvo(requInvo));
    }

    /**
     * 删除发票申请单
     */
    @RequiresPermissions("system:invo:remove")
    @Log(title = "发票申请单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(requInvoService.deleteRequInvoByIds(ids));
    }
}
