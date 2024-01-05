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
import com.ruoyi.system.domain.ProdWare;
import com.ruoyi.system.service.IProdWareService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产入库Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/ware")
public class ProdWareController extends BaseController
{
    private String prefix = "system/ware";

    @Autowired
    private IProdWareService prodWareService;

    @RequiresPermissions("system:ware:view")
    @GetMapping()
    public String ware()
    {
        return prefix + "/ware";
    }

    /**
     * 查询生产入库列表
     */
    @RequiresPermissions("system:ware:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProdWare prodWare)
    {
        startPage();
        List<ProdWare> list = prodWareService.selectProdWareList(prodWare);
        return getDataTable(list);
    }

    /**
     * 导出生产入库列表
     */
    @RequiresPermissions("system:ware:export")
    @Log(title = "生产入库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProdWare prodWare)
    {
        List<ProdWare> list = prodWareService.selectProdWareList(prodWare);
        ExcelUtil<ProdWare> util = new ExcelUtil<ProdWare>(ProdWare.class);
        return util.exportExcel(list, "生产入库数据");
    }

    /**
     * 新增生产入库
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产入库
     */
    @RequiresPermissions("system:ware:add")
    @Log(title = "生产入库", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProdWare prodWare)
    {
        return toAjax(prodWareService.insertProdWare(prodWare));
    }

    /**
     * 修改生产入库
     */
    @RequiresPermissions("system:ware:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProdWare prodWare = prodWareService.selectProdWareById(id);
        mmap.put("prodWare", prodWare);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产入库
     */
    @RequiresPermissions("system:ware:edit")
    @Log(title = "生产入库", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProdWare prodWare)
    {
        return toAjax(prodWareService.updateProdWare(prodWare));
    }

    /**
     * 删除生产入库
     */
    @RequiresPermissions("system:ware:remove")
    @Log(title = "生产入库", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prodWareService.deleteProdWareByIds(ids));
    }
}
