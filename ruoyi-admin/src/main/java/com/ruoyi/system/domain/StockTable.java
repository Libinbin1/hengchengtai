package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存对象 stock_table
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class StockTable extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 库存编码id */
    @Excel(name = "库存编码id")
    private Long stockId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String prodName;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private Long prodId;

    /** 产品规格 */
    @Excel(name = "产品规格")
    private String prodSpec;

    /** 产品分类 */
    @Excel(name = "产品分类")
    private String prodClas;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 仓库id */
    @Excel(name = "仓库id")
    private String wareId;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private String stockQuan;

    /** 库存金额 */
    @Excel(name = "库存金额")
    private String stockAmou;

    /** 库存单价 */
    @Excel(name = "库存单价")
    private Long stockUnitprice;

    /** 最低库存 */
    @Excel(name = "最低库存")
    private String stockMin;

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
    public void setStockId(Long stockId) 
    {
        this.stockId = stockId;
    }

    public Long getStockId() 
    {
        return stockId;
    }
    public void setProdName(String prodName) 
    {
        this.prodName = prodName;
    }

    public String getProdName() 
    {
        return prodName;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setProdSpec(String prodSpec) 
    {
        this.prodSpec = prodSpec;
    }

    public String getProdSpec() 
    {
        return prodSpec;
    }
    public void setProdClas(String prodClas) 
    {
        this.prodClas = prodClas;
    }

    public String getProdClas() 
    {
        return prodClas;
    }
    public void setUnit(String unit) 
    {
        this.unit = unit;
    }

    public String getUnit() 
    {
        return unit;
    }
    public void setWareId(String wareId) 
    {
        this.wareId = wareId;
    }

    public String getWareId() 
    {
        return wareId;
    }
    public void setStockQuan(String stockQuan) 
    {
        this.stockQuan = stockQuan;
    }

    public String getStockQuan() 
    {
        return stockQuan;
    }
    public void setStockAmou(String stockAmou) 
    {
        this.stockAmou = stockAmou;
    }

    public String getStockAmou() 
    {
        return stockAmou;
    }
    public void setStockUnitprice(Long stockUnitprice) 
    {
        this.stockUnitprice = stockUnitprice;
    }

    public Long getStockUnitprice() 
    {
        return stockUnitprice;
    }
    public void setStockMin(String stockMin) 
    {
        this.stockMin = stockMin;
    }

    public String getStockMin() 
    {
        return stockMin;
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
            .append("stockId", getStockId())
            .append("prodName", getProdName())
            .append("prodId", getProdId())
            .append("prodSpec", getProdSpec())
            .append("prodClas", getProdClas())
            .append("unit", getUnit())
            .append("wareId", getWareId())
            .append("stockQuan", getStockQuan())
            .append("stockAmou", getStockAmou())
            .append("stockUnitprice", getStockUnitprice())
            .append("stockMin", getStockMin())
            .append("json", getJson())
            .toString();
    }
}
