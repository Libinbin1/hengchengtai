package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 付款对象 payment
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Payment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 付款单号 */
    @Excel(name = "付款单号")
    private String paymNumb;

    /** 付款时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "付款时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 付款人 */
    @Excel(name = "付款人")
    private String pers;

    /** 付款类型 */
    @Excel(name = "付款类型")
    private String paymType;

    /** 本次付款总金额 */
    @Excel(name = "本次付款总金额")
    private String paymAmou;

    /** 备注1 */
    @Excel(name = "备注1")
    private String remark1;

    /** 子表付款明细关联合同订单id */
    @Excel(name = "子表付款明细关联合同订单id")
    private Long contId;

    /** 关联供应商id */
    @Excel(name = "关联供应商id")
    private Long suppId;

    /** 子表关联采购订单id */
    @Excel(name = "子表关联采购订单id")
    private Long purcId;

    /** 合同总金额 */
    @Excel(name = "合同总金额")
    private String contAmou;

    /** 已付款金额 */
    @Excel(name = "已付款金额")
    private String paidAmou;

    /** 待付款金额 */
    @Excel(name = "待付款金额")
    private Long unpaidAmou;

    /** 本次付款金额 */
    @Excel(name = "本次付款金额")
    private String paidAmouThistime;

    /** 备注2 */
    @Excel(name = "备注2")
    private String remark2;

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
    public void setPaymNumb(String paymNumb) 
    {
        this.paymNumb = paymNumb;
    }

    public String getPaymNumb() 
    {
        return paymNumb;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setPers(String pers) 
    {
        this.pers = pers;
    }

    public String getPers() 
    {
        return pers;
    }
    public void setPaymType(String paymType) 
    {
        this.paymType = paymType;
    }

    public String getPaymType() 
    {
        return paymType;
    }
    public void setPaymAmou(String paymAmou) 
    {
        this.paymAmou = paymAmou;
    }

    public String getPaymAmou() 
    {
        return paymAmou;
    }
    public void setRemark1(String remark1) 
    {
        this.remark1 = remark1;
    }

    public String getRemark1() 
    {
        return remark1;
    }
    public void setContId(Long contId) 
    {
        this.contId = contId;
    }

    public Long getContId() 
    {
        return contId;
    }
    public void setSuppId(Long suppId) 
    {
        this.suppId = suppId;
    }

    public Long getSuppId() 
    {
        return suppId;
    }
    public void setPurcId(Long purcId) 
    {
        this.purcId = purcId;
    }

    public Long getPurcId() 
    {
        return purcId;
    }
    public void setContAmou(String contAmou) 
    {
        this.contAmou = contAmou;
    }

    public String getContAmou() 
    {
        return contAmou;
    }
    public void setPaidAmou(String paidAmou) 
    {
        this.paidAmou = paidAmou;
    }

    public String getPaidAmou() 
    {
        return paidAmou;
    }
    public void setUnpaidAmou(Long unpaidAmou) 
    {
        this.unpaidAmou = unpaidAmou;
    }

    public Long getUnpaidAmou() 
    {
        return unpaidAmou;
    }
    public void setPaidAmouThistime(String paidAmouThistime) 
    {
        this.paidAmouThistime = paidAmouThistime;
    }

    public String getPaidAmouThistime() 
    {
        return paidAmouThistime;
    }
    public void setRemark2(String remark2) 
    {
        this.remark2 = remark2;
    }

    public String getRemark2() 
    {
        return remark2;
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
            .append("paymNumb", getPaymNumb())
            .append("date", getDate())
            .append("pers", getPers())
            .append("paymType", getPaymType())
            .append("paymAmou", getPaymAmou())
            .append("remark1", getRemark1())
            .append("contId", getContId())
            .append("suppId", getSuppId())
            .append("purcId", getPurcId())
            .append("contAmou", getContAmou())
            .append("paidAmou", getPaidAmou())
            .append("unpaidAmou", getUnpaidAmou())
            .append("paidAmouThistime", getPaidAmouThistime())
            .append("remark2", getRemark2())
            .append("json", getJson())
            .toString();
    }
}
