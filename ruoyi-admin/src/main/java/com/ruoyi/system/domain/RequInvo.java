package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 发票申请单对象 requ_invo
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class RequInvo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 申请单号 */
    @Excel(name = "申请单号")
    private String requNumb;

    /** 申请时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "申请时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 客户 */
    @Excel(name = "客户")
    private String cust;

    /** 客户经理 */
    @Excel(name = "客户经理")
    private String custMana;

    /** 子表开票明细关联合同订单id */
    @Excel(name = "子表开票明细关联合同订单id")
    private Long contId;

    /** 合同总金额 */
    @Excel(name = "合同总金额")
    private String contAmou;

    /** 已开票金额 */
    @Excel(name = "已开票金额")
    private String invoAmou;

    /** 待开票金额 */
    @Excel(name = "待开票金额")
    private String uninAmou;

    /** 申请开票金额 */
    @Excel(name = "申请开票金额")
    private String requAmou;

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
    public void setRequNumb(String requNumb) 
    {
        this.requNumb = requNumb;
    }

    public String getRequNumb() 
    {
        return requNumb;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setCust(String cust) 
    {
        this.cust = cust;
    }

    public String getCust() 
    {
        return cust;
    }
    public void setCustMana(String custMana) 
    {
        this.custMana = custMana;
    }

    public String getCustMana() 
    {
        return custMana;
    }
    public void setContId(Long contId) 
    {
        this.contId = contId;
    }

    public Long getContId() 
    {
        return contId;
    }
    public void setContAmou(String contAmou) 
    {
        this.contAmou = contAmou;
    }

    public String getContAmou() 
    {
        return contAmou;
    }
    public void setInvoAmou(String invoAmou) 
    {
        this.invoAmou = invoAmou;
    }

    public String getInvoAmou() 
    {
        return invoAmou;
    }
    public void setUninAmou(String uninAmou) 
    {
        this.uninAmou = uninAmou;
    }

    public String getUninAmou() 
    {
        return uninAmou;
    }
    public void setRequAmou(String requAmou) 
    {
        this.requAmou = requAmou;
    }

    public String getRequAmou() 
    {
        return requAmou;
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
            .append("requNumb", getRequNumb())
            .append("date", getDate())
            .append("cust", getCust())
            .append("custMana", getCustMana())
            .append("contId", getContId())
            .append("contAmou", getContAmou())
            .append("invoAmou", getInvoAmou())
            .append("uninAmou", getUninAmou())
            .append("requAmou", getRequAmou())
            .append("json", getJson())
            .toString();
    }
}
