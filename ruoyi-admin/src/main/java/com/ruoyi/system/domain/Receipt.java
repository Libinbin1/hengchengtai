package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收款单对象 receipt
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Receipt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 收款单号 */
    @Excel(name = "收款单号")
    private String receiptNumb;

    /** 收款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "收款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 收款客户id */
    @Excel(name = "收款客户id")
    private Long custId;

    /** 客户经理 */
    @Excel(name = "客户经理")
    private String custMana;

    /** 本次收款总金额 */
    @Excel(name = "本次收款总金额")
    private String receAmou;

    /** 子表收款明细关联合同订单id */
    @Excel(name = "子表收款明细关联合同订单id")
    private Long contId;

    /** 付款方式 */
    @Excel(name = "付款方式")
    private String paymMeth;

    /** 收款阶段 */
    @Excel(name = "收款阶段")
    private String paymStage;

    /** 收款比例 */
    @Excel(name = "收款比例")
    private String receRatio;

    /** 待收款金额 */
    @Excel(name = "待收款金额")
    private Long unpaid;

    /** 本次收款金额 */
    @Excel(name = "本次收款金额")
    private String receamouThistime;

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
    public void setReceiptNumb(String receiptNumb) 
    {
        this.receiptNumb = receiptNumb;
    }

    public String getReceiptNumb() 
    {
        return receiptNumb;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }
    public void setCustMana(String custMana) 
    {
        this.custMana = custMana;
    }

    public String getCustMana() 
    {
        return custMana;
    }
    public void setReceAmou(String receAmou) 
    {
        this.receAmou = receAmou;
    }

    public String getReceAmou() 
    {
        return receAmou;
    }
    public void setContId(Long contId) 
    {
        this.contId = contId;
    }

    public Long getContId() 
    {
        return contId;
    }
    public void setPaymMeth(String paymMeth) 
    {
        this.paymMeth = paymMeth;
    }

    public String getPaymMeth() 
    {
        return paymMeth;
    }
    public void setPaymStage(String paymStage) 
    {
        this.paymStage = paymStage;
    }

    public String getPaymStage() 
    {
        return paymStage;
    }
    public void setReceRatio(String receRatio) 
    {
        this.receRatio = receRatio;
    }

    public String getReceRatio() 
    {
        return receRatio;
    }
    public void setUnpaid(Long unpaid) 
    {
        this.unpaid = unpaid;
    }

    public Long getUnpaid() 
    {
        return unpaid;
    }
    public void setReceamouThistime(String receamouThistime) 
    {
        this.receamouThistime = receamouThistime;
    }

    public String getReceamouThistime() 
    {
        return receamouThistime;
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
            .append("receiptNumb", getReceiptNumb())
            .append("date", getDate())
            .append("custId", getCustId())
            .append("custMana", getCustMana())
            .append("receAmou", getReceAmou())
            .append("remark", getRemark())
            .append("contId", getContId())
            .append("paymMeth", getPaymMeth())
            .append("paymStage", getPaymStage())
            .append("receRatio", getReceRatio())
            .append("unpaid", getUnpaid())
            .append("receamouThistime", getReceamouThistime())
            .append("json", getJson())
            .toString();
    }
}
