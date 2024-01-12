package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 凭证对象 voucher
 * 
 * @author bin
 * @date 2024-01-12
 */
public class Voucher extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 关联出入库 */
    @Excel(name = "关联出入库")
    private String accessId;

    /** 票号 */
    @Excel(name = "票号")
    private String ticketNum;

    /** 关联供应商 */
    @Excel(name = "关联供应商")
    private String supplierId;

    /** 其他费用 */
    @Excel(name = "其他费用")
    private String otherPrice;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplierName;

    /** 销售金额 */
    @Excel(name = "销售金额")
    private String salePrice;

    /** 关联客户 */
    @Excel(name = "关联客户")
    private String customId;

    /** 关联销售单 */
    @Excel(name = "关联销售单")
    private String saleorderId;

    /** 采购费用 */
    @Excel(name = "采购费用")
    private String procurePrice;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAccessId(String accessId) 
    {
        this.accessId = accessId;
    }

    public String getAccessId() 
    {
        return accessId;
    }
    public void setTicketNum(String ticketNum) 
    {
        this.ticketNum = ticketNum;
    }

    public String getTicketNum() 
    {
        return ticketNum;
    }
    public void setSupplierId(String supplierId) 
    {
        this.supplierId = supplierId;
    }

    public String getSupplierId() 
    {
        return supplierId;
    }
    public void setOtherPrice(String otherPrice) 
    {
        this.otherPrice = otherPrice;
    }

    public String getOtherPrice() 
    {
        return otherPrice;
    }
    public void setSupplierName(String supplierName) 
    {
        this.supplierName = supplierName;
    }

    public String getSupplierName() 
    {
        return supplierName;
    }
    public void setSalePrice(String salePrice) 
    {
        this.salePrice = salePrice;
    }

    public String getSalePrice() 
    {
        return salePrice;
    }
    public void setCustomId(String customId) 
    {
        this.customId = customId;
    }

    public String getCustomId() 
    {
        return customId;
    }
    public void setSaleorderId(String saleorderId) 
    {
        this.saleorderId = saleorderId;
    }

    public String getSaleorderId() 
    {
        return saleorderId;
    }
    public void setProcurePrice(String procurePrice) 
    {
        this.procurePrice = procurePrice;
    }

    public String getProcurePrice() 
    {
        return procurePrice;
    }
    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("accessId", getAccessId())
            .append("ticketNum", getTicketNum())
            .append("supplierId", getSupplierId())
            .append("otherPrice", getOtherPrice())
            .append("supplierName", getSupplierName())
            .append("salePrice", getSalePrice())
            .append("customId", getCustomId())
            .append("saleorderId", getSaleorderId())
            .append("procurePrice", getProcurePrice())
            .append("dateTime", getDateTime())
            .append("remark", getRemark())
            .toString();
    }
}
