package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出入库对象 access_storage
 * 
 * @author bin
 * @date 2024-01-12
 */
public class AccessStorage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 类型 */
    @Excel(name = "类型")
    private String type;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date datetime;

    /** 票号 */
    @Excel(name = "票号")
    private String ticketNumber;

    /** 税额 */
    @Excel(name = "税额")
    private String tax;

    /** 金额 */
    @Excel(name = "金额")
    private String price;

    /** 关联订单 */
    @Excel(name = "关联订单")
    private String orderId;

    /**  */
    @Excel(name = "")
    private String json;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }
    public void setDatetime(Date datetime) 
    {
        this.datetime = datetime;
    }

    public Date getDatetime() 
    {
        return datetime;
    }
    public void setTicketNumber(String ticketNumber) 
    {
        this.ticketNumber = ticketNumber;
    }

    public String getTicketNumber() 
    {
        return ticketNumber;
    }
    public void setTax(String tax) 
    {
        this.tax = tax;
    }

    public String getTax() 
    {
        return tax;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setOrderId(String orderId) 
    {
        this.orderId = orderId;
    }

    public String getOrderId() 
    {
        return orderId;
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
            .append("type", getType())
            .append("datetime", getDatetime())
            .append("ticketNumber", getTicketNumber())
            .append("tax", getTax())
            .append("price", getPrice())
            .append("orderId", getOrderId())
            .append("json", getJson())
            .toString();
    }
}
