package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产退库对象 return_warehouse
 * 
 * @author bin
 * @date 2024-01-11
 */
public class ReturnWarehouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 退库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "退库时间", width = 30, dateFormat = "yyyy-MM-dd HH:mm:ss")
    private Date dateTime;

    /** 关联产品 */
    @Excel(name = "关联产品")
    private String productId;

    /** 仓库 */
    @Excel(name = "仓库")
    private String warehouseId;

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
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setDateTime(Date dateTime) 
    {
        this.dateTime = dateTime;
    }

    public Date getDateTime() 
    {
        return dateTime;
    }
    public void setProductId(String productId) 
    {
        this.productId = productId;
    }

    public String getProductId() 
    {
        return productId;
    }
    public void setWarehouseId(String warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseId() 
    {
        return warehouseId;
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
            .append("productName", getProductName())
            .append("dateTime", getDateTime())
            .append("productId", getProductId())
            .append("remark", getRemark())
            .append("warehouseId", getWarehouseId())
            .append("json", getJson())
            .toString();
    }
}
