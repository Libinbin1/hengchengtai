package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采购订单对象 purchase_order
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class PurchaseOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 订单编码 */
    @Excel(name = "订单编码")
    private Long purcId;

    /** 采购员 */
    @Excel(name = "采购员")
    private String purchaser;

    /** 采购日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "采购日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date purcDate;

    /** 订单类型 */
    @Excel(name = "订单类型")
    private String orderType;

    /** 供应商id */
    @Excel(name = "供应商id")
    private Long suppId;

    /** 要求到货日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "要求到货日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date requdeliDate;

    /** 子表关联产品信息id */
    @Excel(name = "子表关联产品信息id")
    private String prodId;

    /** 采购总金额 */
    @Excel(name = "采购总金额")
    private String totalpurcAmou;

    /** 采购总数量 */
    @Excel(name = "采购总数量")
    private String totalprocQuan;

    /** 已退货数量 */
    @Excel(name = "已退货数量")
    private String retuQuan;

    /** 入库状态 */
    @Excel(name = "入库状态")
    private String entryStat;

    /** 已入库数量 */
    @Excel(name = "已入库数量")
    private String receQuan;

    /** 待入库数量 */
    @Excel(name = "待入库数量")
    private String unreQuan;

    /** 付款状态 */
    @Excel(name = "付款状态")
    private String paymStat;

    /** 已付款金额 */
    @Excel(name = "已付款金额")
    private String paidAmou;

    /** 待付款金额 */
    @Excel(name = "待付款金额")
    private String unpaAmou;

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
    public void setPurcId(Long purcId) 
    {
        this.purcId = purcId;
    }

    public Long getPurcId() 
    {
        return purcId;
    }
    public void setPurchaser(String purchaser) 
    {
        this.purchaser = purchaser;
    }

    public String getPurchaser() 
    {
        return purchaser;
    }
    public void setPurcDate(Date purcDate) 
    {
        this.purcDate = purcDate;
    }

    public Date getPurcDate() 
    {
        return purcDate;
    }
    public void setOrderType(String orderType) 
    {
        this.orderType = orderType;
    }

    public String getOrderType() 
    {
        return orderType;
    }
    public void setSuppId(Long suppId) 
    {
        this.suppId = suppId;
    }

    public Long getSuppId() 
    {
        return suppId;
    }
    public void setRequdeliDate(Date requdeliDate) 
    {
        this.requdeliDate = requdeliDate;
    }

    public Date getRequdeliDate() 
    {
        return requdeliDate;
    }
    public void setProdId(String prodId) 
    {
        this.prodId = prodId;
    }

    public String getProdId() 
    {
        return prodId;
    }
    public void setTotalpurcAmou(String totalpurcAmou) 
    {
        this.totalpurcAmou = totalpurcAmou;
    }

    public String getTotalpurcAmou() 
    {
        return totalpurcAmou;
    }
    public void setTotalprocQuan(String totalprocQuan) 
    {
        this.totalprocQuan = totalprocQuan;
    }

    public String getTotalprocQuan() 
    {
        return totalprocQuan;
    }
    public void setRetuQuan(String retuQuan) 
    {
        this.retuQuan = retuQuan;
    }

    public String getRetuQuan() 
    {
        return retuQuan;
    }
    public void setEntryStat(String entryStat) 
    {
        this.entryStat = entryStat;
    }

    public String getEntryStat() 
    {
        return entryStat;
    }
    public void setReceQuan(String receQuan) 
    {
        this.receQuan = receQuan;
    }

    public String getReceQuan() 
    {
        return receQuan;
    }
    public void setUnreQuan(String unreQuan) 
    {
        this.unreQuan = unreQuan;
    }

    public String getUnreQuan() 
    {
        return unreQuan;
    }
    public void setPaymStat(String paymStat) 
    {
        this.paymStat = paymStat;
    }

    public String getPaymStat() 
    {
        return paymStat;
    }
    public void setPaidAmou(String paidAmou) 
    {
        this.paidAmou = paidAmou;
    }

    public String getPaidAmou() 
    {
        return paidAmou;
    }
    public void setUnpaAmou(String unpaAmou) 
    {
        this.unpaAmou = unpaAmou;
    }

    public String getUnpaAmou() 
    {
        return unpaAmou;
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
            .append("purcId", getPurcId())
            .append("purchaser", getPurchaser())
            .append("purcDate", getPurcDate())
            .append("orderType", getOrderType())
            .append("suppId", getSuppId())
            .append("requdeliDate", getRequdeliDate())
            .append("prodId", getProdId())
            .append("totalpurcAmou", getTotalpurcAmou())
            .append("totalprocQuan", getTotalprocQuan())
            .append("retuQuan", getRetuQuan())
            .append("entryStat", getEntryStat())
            .append("receQuan", getReceQuan())
            .append("unreQuan", getUnreQuan())
            .append("paymStat", getPaymStat())
            .append("paidAmou", getPaidAmou())
            .append("unpaAmou", getUnpaAmou())
            .append("remark", getRemark())
            .append("json", getJson())
            .toString();
    }
}
