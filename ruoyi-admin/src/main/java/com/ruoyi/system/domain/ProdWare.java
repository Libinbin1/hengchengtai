package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产入库对象 prod_ware
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class ProdWare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 生产入库单号 */
    @Excel(name = "生产入库单号")
    private String wareentrNumb;

    /** 入库人员 */
    @Excel(name = "入库人员")
    private String pers;

    /** 关联生产工单id */
    @Excel(name = "关联生产工单id")
    private Long prodordeId;

    /** 入库日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 入库产品关联产品信息id */
    @Excel(name = "入库产品关联产品信息id")
    private Long prodId;

    /** 入库仓库id */
    @Excel(name = "入库仓库id")
    private Long wareId;

    /** 入库数量 */
    @Excel(name = "入库数量")
    private String wareQuan;

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
    public void setWareentrNumb(String wareentrNumb) 
    {
        this.wareentrNumb = wareentrNumb;
    }

    public String getWareentrNumb() 
    {
        return wareentrNumb;
    }
    public void setPers(String pers) 
    {
        this.pers = pers;
    }

    public String getPers() 
    {
        return pers;
    }
    public void setProdordeId(Long prodordeId) 
    {
        this.prodordeId = prodordeId;
    }

    public Long getProdordeId() 
    {
        return prodordeId;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setWareId(Long wareId) 
    {
        this.wareId = wareId;
    }

    public Long getWareId() 
    {
        return wareId;
    }
    public void setWareQuan(String wareQuan) 
    {
        this.wareQuan = wareQuan;
    }

    public String getWareQuan() 
    {
        return wareQuan;
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
            .append("wareentrNumb", getWareentrNumb())
            .append("pers", getPers())
            .append("prodordeId", getProdordeId())
            .append("date", getDate())
            .append("prodId", getProdId())
            .append("wareId", getWareId())
            .append("wareQuan", getWareQuan())
            .append("remark", getRemark())
            .append("json", getJson())
            .toString();
    }
}
