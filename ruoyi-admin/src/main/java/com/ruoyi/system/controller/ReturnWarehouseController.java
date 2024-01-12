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
import com.ruoyi.system.domain.ReturnWarehouse;
import com.ruoyi.system.service.IReturnWarehouseService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产退库Controller
 * 
 * @author bin
 * @date 2024-01-11
 */
@Controller
@RequestMapping("/system/returnhouse")
public class ReturnWarehouseController extends BaseController
{
    private String prefix = "system/returnhouse";

    @Autowired
    private IReturnWarehouseService returnWarehouseService;

    @RequiresPermissions("system:returnhouse:view")
    @GetMapping()
    public String returnhouse()
    {
        return prefix + "/returnhouse";
    }

    /**
     * 查询生产退库列表
     */
    @RequiresPermissions("system:returnhouse:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ReturnWarehouse returnWarehouse)
    {
        startPage();
        List<ReturnWarehouse> list = returnWarehouseService.selectReturnWarehouseList(returnWarehouse);
        return getDataTable(list);
    }

    /**
     * 导出生产退库列表
     */
    @RequiresPermissions("system:returnhouse:export")
    @Log(title = "生产退库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ReturnWarehouse returnWarehouse)
    {
        List<ReturnWarehouse> list = returnWarehouseService.selectReturnWarehouseList(returnWarehouse);
        ExcelUtil<ReturnWarehouse> util = new ExcelUtil<ReturnWarehouse>(ReturnWarehouse.class);
        return util.exportExcel(list, "生产退库数据");
    }

    /**
     * 新增生产退库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产退库
     */
    @RequiresPermissions("system:returnhouse:add")
    @Log(title = "生产退库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ReturnWarehouse returnWarehouse)
    {
        return toAjax(returnWarehouseService.insertReturnWarehouse(returnWarehouse));
    }

    /**
     * 修改生产退库
     */
    @RequiresPermissions("system:returnhouse:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ReturnWarehouse returnWarehouse = returnWarehouseService.selectReturnWarehouseById(id);
        mmap.put("returnWarehouse", returnWarehouse);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产退库
     */
    @RequiresPermissions("system:returnhouse:edit")
    @Log(title = "生产退库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ReturnWarehouse returnWarehouse)
    {
        return toAjax(returnWarehouseService.updateReturnWarehouse(returnWarehouse));
    }

    /**
     * 删除生产退库
     */
    @RequiresPermissions("system:returnhouse:remove")
    @Log(title = "生产退库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(returnWarehouseService.deleteReturnWarehouseByIds(ids));
    }
}
