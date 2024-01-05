package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商对象 supplier
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Supplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 供应商编号id */
    @Excel(name = "供应商编号id")
    private String supplierId;

    /** 联系人 */
    @Excel(name = "联系人")
    private String contacts;

    /** 联系人角色 */
    @Excel(name = "联系人角色")
    private String contRole;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String tel;

    /** 联系地址 */
    @Excel(name = "联系地址")
    private String addr;

    /** 合作状态 */
    @Excel(name = "合作状态")
    private String coopStat;

    /** 备注 */
    @Excel(name = "备注")
    private String remarks;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String json;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setContacts(String contacts) 
    {
        this.contacts = contacts;
    }

    public String getContacts() 
    {
        return contacts;
    }
    public void setContRole(String contRole) 
    {
        this.contRole = contRole;
    }

    public String getContRole() 
    {
        return contRole;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setAddr(String addr) 
    {
        this.addr = addr;
    }

    public String getAddr() 
    {
        return addr;
    }
    public void setCoopStat(String coopStat) 
    {
        this.coopStat = coopStat;
    }

    public String getCoopStat() 
    {
        return coopStat;
    }
    public void setRemarks(String remarks) 
    {
        this.remarks = remarks;
    }

    public String getRemarks() 
    {
        return remarks;
    }
    public void setJson(String json) 
    {
        this.json = json;
    }

    public String getJson() 
    {
        return json;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("supplierName", getSupplierName())
            .append("supplierId", getSupplierId())
            .append("contacts", getContacts())
            .append("contRole", getContRole())
            .append("tel", getTel())
            .append("addr", getAddr())
            .append("coopStat", getCoopStat())
            .append("remarks", getRemarks())
            .append("json", getJson())
            .toString();
    }
}
