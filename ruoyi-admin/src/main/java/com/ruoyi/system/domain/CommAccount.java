package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 往来账目对象 comm_account
 * 
 * @author bin
 * @date 2024-01-12
 */
public class CommAccount extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date dateTime;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 关联客户 */
    @Excel(name = "关联客户")
    private String customId;

    /** 关联订单 */
    @Excel(name = "关联订单")
    private String saleorderId;

    /** 关联金额 */
    @Excel(name = "关联金额")
    private String price;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
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
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dateTime", getDateTime())
            .append("type", getType())
            .append("customId", getCustomId())
            .append("saleorderId", getSaleorderId())
            .append("price", getPrice())
            .append("remark", getRemark())
            .toString();
    }
}
