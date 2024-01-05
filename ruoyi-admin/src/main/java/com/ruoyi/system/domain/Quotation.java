package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 报价单对象 quotation
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Quotation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String json;

    /** $column.columnComment */
    private Long id;

    /** 保价单号 */
    @Excel(name = "保价单号")
    private String code;

    /** 报价时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报价时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date qutoDate;

    /** 客户编号 */
    @Excel(name = "客户编号")
    private String customcode;

    /** 业务员编号 */
    @Excel(name = "业务员编号")
    private String staffcode;

    /** 产品编号 */
    @Excel(name = "产品编号")
    private String productcode;

    /** 产品id */
    @Excel(name = "产品id")
    private Long productId;

    /** 业务员id */
    @Excel(name = "业务员id")
    private Long staffcId;

    /** 客户id */
    @Excel(name = "客户id")
    private Long customId;

    /** 折扣类型 */
    @Excel(name = "折扣类型")
    private String discountType;

    /** 订单原价 */
    @Excel(name = "订单原价")
    private String originalPrice;

    /** 折后价格 */
    @Excel(name = "折后价格")
    private String discountQuotation;

    /** 订单状态
 */
    @Excel(name = "订单状态")
    private String state;

    public void setJson(String json) 
    {
        this.json = json;
    }

    public String getJson() 
    {
        return json;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setQutoDate(Date qutoDate) 
    {
        this.qutoDate = qutoDate;
    }

    public Date getQutoDate() 
    {
        return qutoDate;
    }
    public void setCustomcode(String customcode) 
    {
        this.customcode = customcode;
    }

    public String getCustomcode() 
    {
        return customcode;
    }
    public void setStaffcode(String staffcode) 
    {
        this.staffcode = staffcode;
    }

    public String getStaffcode() 
    {
        return staffcode;
    }
    public void setProductcode(String productcode) 
    {
        this.productcode = productcode;
    }

    public String getProductcode() 
    {
        return productcode;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setStaffcId(Long staffcId) 
    {
        this.staffcId = staffcId;
    }

    public Long getStaffcId() 
    {
        return staffcId;
    }
    public void setCustomId(Long customId) 
    {
        this.customId = customId;
    }

    public Long getCustomId() 
    {
        return customId;
    }
    public void setDiscountType(String discountType) 
    {
        this.discountType = discountType;
    }

    public String getDiscountType() 
    {
        return discountType;
    }
    public void setOriginalPrice(String originalPrice) 
    {
        this.originalPrice = originalPrice;
    }

    public String getOriginalPrice() 
    {
        return originalPrice;
    }
    public void setDiscountQuotation(String discountQuotation) 
    {
        this.discountQuotation = discountQuotation;
    }

    public String getDiscountQuotation() 
    {
        return discountQuotation;
    }
    public void setState(String state) 
    {
        this.state = state;
    }

    public String getState() 
    {
        return state;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("json", getJson())
            .append("id", getId())
            .append("code", getCode())
            .append("qutoDate", getQutoDate())
            .append("customcode", getCustomcode())
            .append("staffcode", getStaffcode())
            .append("remark", getRemark())
            .append("productcode", getProductcode())
            .append("productId", getProductId())
            .append("staffcId", getStaffcId())
            .append("customId", getCustomId())
            .append("discountType", getDiscountType())
            .append("originalPrice", getOriginalPrice())
            .append("discountQuotation", getDiscountQuotation())
            .append("state", getState())
            .toString();
    }
}
