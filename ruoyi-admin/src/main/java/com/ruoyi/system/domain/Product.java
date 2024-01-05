package com.ruoyi.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 产品对象 product
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Product extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productname;

    /** 产品编号 */
    @Excel(name = "产品编号")
    private String prodCode;

    /** 产品规格 */
    @Excel(name = "产品规格")
    private String specifications;

    /** 产品分类 */
    @Excel(name = "产品分类")
    private String clas;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 采购单价 */
    @Excel(name = "采购单价")
    private String purchasePrice;

    /** 销售单价 */
    @Excel(name = "销售单价")
    private BigDecimal salesPrice;

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
    public void setProductname(String productname) 
    {
        this.productname = productname;
    }

    public String getProductname() 
    {
        return productname;
    }
    public void setProdCode(String prodCode) 
    {
        this.prodCode = prodCode;
    }

    public String getProdCode() 
    {
        return prodCode;
    }
    public void setSpecifications(String specifications) 
    {
        this.specifications = specifications;
    }

    public String getSpecifications() 
    {
        return specifications;
    }
    public void setClas(String clas) 
    {
        this.clas = clas;
    }

    public String getClas() 
    {
        return clas;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setPurchasePrice(String purchasePrice) 
    {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchasePrice() 
    {
        return purchasePrice;
    }
    public void setSalesPrice(BigDecimal salesPrice) 
    {
        this.salesPrice = salesPrice;
    }

    public BigDecimal getSalesPrice() 
    {
        return salesPrice;
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
            .append("productname", getProductname())
            .append("prodCode", getProdCode())
            .append("specifications", getSpecifications())
            .append("clas", getClas())
            .append("unit", getUnit())
            .append("remark", getRemark())
            .append("purchasePrice", getPurchasePrice())
            .append("salesPrice", getSalesPrice())
            .append("json", getJson())
            .toString();
    }
}
