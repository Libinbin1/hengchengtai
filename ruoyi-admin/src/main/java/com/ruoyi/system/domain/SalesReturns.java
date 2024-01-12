package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售退货对象 sales_returns
 * 
 * @author bin
 * @date 2024-01-11
 */
public class SalesReturns extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 销售单号 */
    @Excel(name = "销售单号")
    private String saleorderCode;

    /** 关联销售订单 */
    @Excel(name = "关联销售订单")
    private String saleorderId;

    /** 关联客户 */
    @Excel(name = "关联客户")
    private String customId;

    /** 退货数量 */
    @Excel(name = "退货数量")
    private String returnQuantity;

    /** 退货产品 */
    @Excel(name = "退货产品")
    private String productId;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setSaleorderCode(String saleorderCode) 
    {
        this.saleorderCode = saleorderCode;
    }

    public String getSaleorderCode() 
    {
        return saleorderCode;
    }
    public void setSaleorderId(String saleorderId) 
    {
        this.saleorderId = saleorderId;
    }

    public String getSaleorderId() 
    {
        return saleorderId;
    }
    public void setCustomId(String customId) 
    {
        this.customId = customId;
    }

    public String getCustomId() 
    {
        return customId;
    }
    public void setReturnQuantity(String returnQuantity) 
    {
        this.returnQuantity = returnQuantity;
    }

    public String getReturnQuantity() 
    {
        return returnQuantity;
    }
    public void setProductId(String productId) 
    {
        this.productId = productId;
    }

    public String getProductId() 
    {
        return productId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("saleorderCode", getSaleorderCode())
            .append("saleorderId", getSaleorderId())
            .append("customId", getCustomId())
            .append("returnQuantity", getReturnQuantity())
            .append("productId", getProductId())
            .toString();
    }
}
