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
import com.ruoyi.system.domain.WarehourseInfo;
import com.ruoyi.system.service.IWarehourseInfoService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 仓库信息Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/info")
public class WarehourseInfoController extends BaseController
{
    private String prefix = "system/info";

    @Autowired
    private IWarehourseInfoService warehourseInfoService;

    @RequiresPermissions("system:info:view")
    @GetMapping()
    public String info()
    {
        return prefix + "/info";
    }

    /**
     * 查询仓库信息列表
     */
    @RequiresPermissions("system:info:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(WarehourseInfo warehourseInfo)
    {
        startPage();
        List<WarehourseInfo> list = warehourseInfoService.selectWarehourseInfoList(warehourseInfo);
        return getDataTable(list);
    }

    /**
     * 导出仓库信息列表
     */
    @RequiresPermissions("system:info:export")
    @Log(title = "仓库信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(WarehourseInfo warehourseInfo)
    {
        List<WarehourseInfo> list = warehourseInfoService.selectWarehourseInfoList(warehourseInfo);
        ExcelUtil<WarehourseInfo> util = new ExcelUtil<WarehourseInfo>(WarehourseInfo.class);
        return util.exportExcel(list, "仓库信息数据");
    }

    /**
     * 新增仓库信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存仓库信息
     */
    @RequiresPermissions("system:info:add")
    @Log(title = "仓库信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(WarehourseInfo warehourseInfo)
    {
        return toAjax(warehourseInfoService.insertWarehourseInfo(warehourseInfo));
    }

    /**
     * 修改仓库信息
     */
    @RequiresPermissions("system:info:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        WarehourseInfo warehourseInfo = warehourseInfoService.selectWarehourseInfoById(id);
        mmap.put("warehourseInfo", warehourseInfo);
        return prefix + "/edit";
    }

    /**
     * 修改保存仓库信息
     */
    @RequiresPermissions("system:info:edit")
    @Log(title = "仓库信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(WarehourseInfo warehourseInfo)
    {
        return toAjax(warehourseInfoService.updateWarehourseInfo(warehourseInfo));
    }

    /**
     * 删除仓库信息
     */
    @RequiresPermissions("system:info:remove")
    @Log(title = "仓库信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(warehourseInfoService.deleteWarehourseInfoByIds(ids));
    }
}
