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
import com.ruoyi.system.domain.ProdPick;
import com.ruoyi.system.service.IProdPickService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 生产领料Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/pick")
public class ProdPickController extends BaseController
{
    private String prefix = "system/pick";

    @Autowired
    private IProdPickService prodPickService;

    @RequiresPermissions("system:pick:view")
    @GetMapping()
    public String pick()
    {
        return prefix + "/pick";
    }

    /**
     * 查询生产领料列表
     */
    @RequiresPermissions("system:pick:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(ProdPick prodPick)
    {
        startPage();
        List<ProdPick> list = prodPickService.selectProdPickList(prodPick);
        return getDataTable(list);
    }

    /**
     * 导出生产领料列表
     */
    @RequiresPermissions("system:pick:export")
    @Log(title = "生产领料", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(ProdPick prodPick)
    {
        List<ProdPick> list = prodPickService.selectProdPickList(prodPick);
        ExcelUtil<ProdPick> util = new ExcelUtil<ProdPick>(ProdPick.class);
        return util.exportExcel(list, "生产领料数据");
    }

    /**
     * 新增生产领料
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存生产领料
     */
    @RequiresPermissions("system:pick:add")
    @Log(title = "生产领料", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(ProdPick prodPick)
    {
        return toAjax(prodPickService.insertProdPick(prodPick));
    }

    /**
     * 修改生产领料
     */
    @RequiresPermissions("system:pick:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        ProdPick prodPick = prodPickService.selectProdPickById(id);
        mmap.put("prodPick", prodPick);
        return prefix + "/edit";
    }

    /**
     * 修改保存生产领料
     */
    @RequiresPermissions("system:pick:edit")
    @Log(title = "生产领料", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(ProdPick prodPick)
    {
        return toAjax(prodPickService.updateProdPick(prodPick));
    }

    /**
     * 删除生产领料
     */
    @RequiresPermissions("system:pick:remove")
    @Log(title = "生产领料", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prodPickService.deleteProdPickByIds(ids));
    }
}
