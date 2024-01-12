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
import com.ruoyi.system.domain.AccessStorage;
import com.ruoyi.system.service.IAccessStorageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 出入库Controller
 * 
 * @author bin
 * @date 2024-01-12
 */
@Controller
@RequestMapping("/system/storage")
public class AccessStorageController extends BaseController
{
    private String prefix = "system/storage";

    @Autowired
    private IAccessStorageService accessStorageService;

    @RequiresPermissions("system:storage:view")
    @GetMapping()
    public String storage()
    {
        return prefix + "/storage";
    }

    /**
     * 查询出入库列表
     */
    @RequiresPermissions("system:storage:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AccessStorage accessStorage)
    {
        startPage();
        List<AccessStorage> list = accessStorageService.selectAccessStorageList(accessStorage);
        return getDataTable(list);
    }

    /**
     * 导出出入库列表
     */
    @RequiresPermissions("system:storage:export")
    @Log(title = "出入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AccessStorage accessStorage)
    {
        List<AccessStorage> list = accessStorageService.selectAccessStorageList(accessStorage);
        ExcelUtil<AccessStorage> util = new ExcelUtil<AccessStorage>(AccessStorage.class);
        return util.exportExcel(list, "出入库数据");
    }

    /**
     * 新增出入库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存出入库
     */
    @RequiresPermissions("system:storage:add")
    @Log(title = "出入库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AccessStorage accessStorage)
    {
        return toAjax(accessStorageService.insertAccessStorage(accessStorage));
    }

    /**
     * 修改出入库
     */
    @RequiresPermissions("system:storage:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        AccessStorage accessStorage = accessStorageService.selectAccessStorageById(id);
        mmap.put("accessStorage", accessStorage);
        return prefix + "/edit";
    }

    /**
     * 修改保存出入库
     */
    @RequiresPermissions("system:storage:edit")
    @Log(title = "出入库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AccessStorage accessStorage)
    {
        return toAjax(accessStorageService.updateAccessStorage(accessStorage));
    }

    /**
     * 删除出入库
     */
    @RequiresPermissions("system:storage:remove")
    @Log(title = "出入库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(accessStorageService.deleteAccessStorageByIds(ids));
    }
}
