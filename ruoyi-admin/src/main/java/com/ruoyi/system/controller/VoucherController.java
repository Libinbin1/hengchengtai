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
import com.ruoyi.system.domain.Voucher;
import com.ruoyi.system.service.IVoucherService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 凭证Controller
 * 
 * @author bin
 * @date 2024-01-12
 */
@Controller
@RequestMapping("/system/voucher")
public class VoucherController extends BaseController
{
    private String prefix = "system/voucher";

    @Autowired
    private IVoucherService voucherService;

    @RequiresPermissions("system:voucher:view")
    @GetMapping()
    public String voucher()
    {
        return prefix + "/voucher";
    }

    /**
     * 查询凭证列表
     */
    @RequiresPermissions("system:voucher:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Voucher voucher)
    {
        startPage();
        List<Voucher> list = voucherService.selectVoucherList(voucher);
        return getDataTable(list);
    }

    /**
     * 导出凭证列表
     */
    @RequiresPermissions("system:voucher:export")
    @Log(title = "凭证", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Voucher voucher)
    {
        List<Voucher> list = voucherService.selectVoucherList(voucher);
        ExcelUtil<Voucher> util = new ExcelUtil<Voucher>(Voucher.class);
        return util.exportExcel(list, "凭证数据");
    }

    /**
     * 新增凭证
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存凭证
     */
    @RequiresPermissions("system:voucher:add")
    @Log(title = "凭证", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Voucher voucher)
    {
        return toAjax(voucherService.insertVoucher(voucher));
    }

    /**
     * 修改凭证
     */
    @RequiresPermissions("system:voucher:edit")
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Voucher voucher = voucherService.selectVoucherById(id);
        mmap.put("voucher", voucher);
        return prefix + "/edit";
    }

    /**
     * 修改保存凭证
     */
    @RequiresPermissions("system:voucher:edit")
    @Log(title = "凭证", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Voucher voucher)
    {
        return toAjax(voucherService.updateVoucher(voucher));
    }

    /**
     * 删除凭证
     */
    @RequiresPermissions("system:voucher:remove")
    @Log(title = "凭证", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(voucherService.deleteVoucherByIds(ids));
    }
}
