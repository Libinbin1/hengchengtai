package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 客户对象 custom
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Custom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String custname;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String code;

    /** 客户经理 */
    @Excel(name = "客户经理")
    private String accoMana;

    /** 地址 */
    @Excel(name = "地址")
    private String addr;

    /** 客户分类 */
    @Excel(name = "客户分类")
    private String custClas;

    /** 联系人姓名 */
    @Excel(name = "联系人姓名")
    private String contactname;

    /** 职务 */
    @Excel(name = "职务")
    private String duties;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String contactInfo;

    /** 开票单位 */
    @Excel(name = "开票单位")
    private String orgname;

    /** 纳税人识别号 */
    @Excel(name = "纳税人识别号")
    private String taxpIdennum;

    /** 开户银行 */
    @Excel(name = "开户银行")
    private String bankOfdepo;

    /** 银行账户 */
    @Excel(name = "银行账户")
    private String bankAcco;

    /** 开票地址 */
    @Excel(name = "开票地址")
    private String address;

    /** 开票电话 */
    @Excel(name = "开票电话")
    private String tel;

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
    public void setCustname(String custname) 
    {
        this.custname = custname;
    }

    public String getCustname() 
    {
        return custname;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setAccoMana(String accoMana) 
    {
        this.accoMana = accoMana;
    }

    public String getAccoMana() 
    {
        return accoMana;
    }
    public void setAddr(String addr)
    {
        this.addr = addr;
    }

    public String getAddr()
    {
        return addr;
    }
    public void setCustClas(String custClas) 
    {
        this.custClas = custClas;
    }

    public String getCustClas() 
    {
        return custClas;
    }
    public void setContactname(String contactname) 
    {
        this.contactname = contactname;
    }

    public String getContactname() 
    {
        return contactname;
    }
    public void setDuties(String duties) 
    {
        this.duties = duties;
    }

    public String getDuties() 
    {
        return duties;
    }
    public void setContactInfo(String contactInfo) 
    {
        this.contactInfo = contactInfo;
    }

    public String getContactInfo() 
    {
        return contactInfo;
    }
    public void setOrgname(String orgname) 
    {
        this.orgname = orgname;
    }

    public String getOrgname() 
    {
        return orgname;
    }
    public void setTaxpIdennum(String taxpIdennum) 
    {
        this.taxpIdennum = taxpIdennum;
    }

    public String getTaxpIdennum() 
    {
        return taxpIdennum;
    }
    public void setBankOfdepo(String bankOfdepo) 
    {
        this.bankOfdepo = bankOfdepo;
    }

    public String getBankOfdepo() 
    {
        return bankOfdepo;
    }
    public void setBankAcco(String bankAcco) 
    {
        this.bankAcco = bankAcco;
    }

    public String getBankAcco() 
    {
        return bankAcco;
    }
    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
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
            .append("custname", getCustname())
            .append("code", getCode())
            .append("accoMana", getAccoMana())
            .append("remark", getRemark())
            .append("add", getAddr())
            .append("custClas", getCustClas())
            .append("contactname", getContactname())
            .append("duties", getDuties())
            .append("contactInfo", getContactInfo())
            .append("orgname", getOrgname())
            .append("taxpIdennum", getTaxpIdennum())
            .append("bankOfdepo", getBankOfdepo())
            .append("bankAcco", getBankAcco())
            .append("address", getAddress())
            .append("tel", getTel())
            .append("json", getJson())
            .toString();
    }
}
