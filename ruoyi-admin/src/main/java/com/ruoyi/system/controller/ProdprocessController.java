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
import com.ruoyi.system.domain.Prodprocess;
import com.ruoyi.system.service.IProdprocessService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工序Controller
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Controller
@RequestMapping("/system/prodprocess")
public class ProdprocessController extends BaseController
{
    private String prefix = "system/prodprocess";

    @Autowired
    private IProdprocessService prodprocessService;

    @RequiresPermissions("system:prodprocess:view")
    @GetMapping()
    public String prodprocess()
    {
        return prefix + "/prodprocess";
    }

    /**
     * 查询工序列表
     */
    @RequiresPermissions("system:prodprocess:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Prodprocess prodprocess)
    {
        startPage();
        List<Prodprocess> list = prodprocessService.selectProdprocessList(prodprocess);
        return getDataTable(list);
    }

    /**
     * 导出工序列表
     */
    @RequiresPermissions("system:prodprocess:export")
    @Log(title = "工序", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Prodprocess prodprocess)
    {
        List<Prodprocess> list = prodprocessService.selectProdprocessList(prodprocess);
        ExcelUtil<Prodprocess> util = new ExcelUtil<Prodprocess>(Prodprocess.class);
        return util.exportExcel(list, "工序数据");
    }

    /**
     * 新增工序
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存工序
     */
    @RequiresPermissions("system:prodprocess:add")
    @Log(title = "工序", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Prodprocess prodprocess)
    {
        return toAjax(prodprocessService.insertProdprocess(prodprocess));
    }

    /**
     * 修改工序
     */
    @RequiresPermissions("system:prodprocess:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Prodprocess prodprocess = prodprocessService.selectProdprocessById(id);
        mmap.put("prodprocess", prodprocess);
        return prefix + "/edit";
    }

    /**
     * 修改保存工序
     */
    @RequiresPermissions("system:prodprocess:edit")
    @Log(title = "工序", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Prodprocess prodprocess)
    {
        return toAjax(prodprocessService.updateProdprocess(prodprocess));
    }

    /**
     * 删除工序
     */
    @RequiresPermissions("system:prodprocess:remove")
    @Log(title = "工序", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(prodprocessService.deleteProdprocessByIds(ids));
    }
}
