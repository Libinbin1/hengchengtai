package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 采购入库对象 purchase_receipt
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class PurchaseReceipt extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 入库单号id */
    @Excel(name = "入库单号id")
    private Long wareId;

    /** 入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date wareDate;

    /** 入库员 */
    @Excel(name = "入库员")
    private String warePers;

    /** 关联采购订单id */
    @Excel(name = "关联采购订单id")
    private String purcorderId;

    /** 供应商 */
    @Excel(name = "供应商")
    private String supp;

    /** 入库总数量 */
    @Excel(name = "入库总数量")
    private String totalinboQuan;

    /** 入库总金额 */
    @Excel(name = "入库总金额")
    private String totalamouRece;

    /** 质检状态 */
    @Excel(name = "质检状态")
    private String qualStat;

    /** 子表关联产品信息id */
    @Excel(name = "子表关联产品信息id")
    private Long prodId;

    /** 是否开启质检后入库 */
    @Excel(name = "是否开启质检后入库")
    private String allowstorageafterQualityinsp;

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
    public void setWareId(Long wareId) 
    {
        this.wareId = wareId;
    }

    public Long getWareId() 
    {
        return wareId;
    }
    public void setWareDate(Date wareDate) 
    {
        this.wareDate = wareDate;
    }

    public Date getWareDate() 
    {
        return wareDate;
    }
    public void setWarePers(String warePers) 
    {
        this.warePers = warePers;
    }

    public String getWarePers() 
    {
        return warePers;
    }
    public void setPurcorderId(String purcorderId) 
    {
        this.purcorderId = purcorderId;
    }

    public String getPurcorderId() 
    {
        return purcorderId;
    }
    public void setSupp(String supp) 
    {
        this.supp = supp;
    }

    public String getSupp() 
    {
        return supp;
    }
    public void setTotalinboQuan(String totalinboQuan) 
    {
        this.totalinboQuan = totalinboQuan;
    }

    public String getTotalinboQuan() 
    {
        return totalinboQuan;
    }
    public void setTotalamouRece(String totalamouRece) 
    {
        this.totalamouRece = totalamouRece;
    }

    public String getTotalamouRece() 
    {
        return totalamouRece;
    }
    public void setQualStat(String qualStat) 
    {
        this.qualStat = qualStat;
    }

    public String getQualStat() 
    {
        return qualStat;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setAllowstorageafterQualityinsp(String allowstorageafterQualityinsp) 
    {
        this.allowstorageafterQualityinsp = allowstorageafterQualityinsp;
    }

    public String getAllowstorageafterQualityinsp() 
    {
        return allowstorageafterQualityinsp;
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
            .append("wareId", getWareId())
            .append("wareDate", getWareDate())
            .append("warePers", getWarePers())
            .append("purcorderId", getPurcorderId())
            .append("supp", getSupp())
            .append("remark", getRemark())
            .append("totalinboQuan", getTotalinboQuan())
            .append("totalamouRece", getTotalamouRece())
            .append("qualStat", getQualStat())
            .append("prodId", getProdId())
            .append("allowstorageafterQualityinsp", getAllowstorageafterQualityinsp())
            .append("json", getJson())
            .toString();
    }
}
