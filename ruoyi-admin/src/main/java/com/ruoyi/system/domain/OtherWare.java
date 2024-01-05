package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 其他出库对象 other_ware
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class OtherWare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 入库单号 */
    @Excel(name = "入库单号")
    private String wareNumb;

    /** 入库人员 */
    @Excel(name = "入库人员")
    private String pers;

    /** 入库时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "入库时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 入库类型 */
    @Excel(name = "入库类型")
    private String wareType;

    /** 关联合同订单id */
    @Excel(name = "关联合同订单id")
    private Long contordeId;

    /** 入库总数量 */
    @Excel(name = "入库总数量")
    private String totalinboQuan;

    /** 入库总金额 */
    @Excel(name = "入库总金额")
    private String toatalAmou;

    /** 子表入库明细关联产品信息id */
    @Excel(name = "子表入库明细关联产品信息id")
    private Long prodId;

    /** 入库数量 */
    @Excel(name = "入库数量")
    private String wareQuan;

    /** 入库仓库 */
    @Excel(name = "入库仓库")
    private String warehouse;

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
    public void setWareNumb(String wareNumb) 
    {
        this.wareNumb = wareNumb;
    }

    public String getWareNumb() 
    {
        return wareNumb;
    }
    public void setPers(String pers) 
    {
        this.pers = pers;
    }

    public String getPers() 
    {
        return pers;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setWareType(String wareType) 
    {
        this.wareType = wareType;
    }

    public String getWareType() 
    {
        return wareType;
    }
    public void setContordeId(Long contordeId) 
    {
        this.contordeId = contordeId;
    }

    public Long getContordeId() 
    {
        return contordeId;
    }
    public void setTotalinboQuan(String totalinboQuan) 
    {
        this.totalinboQuan = totalinboQuan;
    }

    public String getTotalinboQuan() 
    {
        return totalinboQuan;
    }
    public void setToatalAmou(String toatalAmou) 
    {
        this.toatalAmou = toatalAmou;
    }

    public String getToatalAmou() 
    {
        return toatalAmou;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setWareQuan(String wareQuan) 
    {
        this.wareQuan = wareQuan;
    }

    public String getWareQuan() 
    {
        return wareQuan;
    }
    public void setWarehouse(String warehouse) 
    {
        this.warehouse = warehouse;
    }

    public String getWarehouse() 
    {
        return warehouse;
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
            .append("wareNumb", getWareNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("wareType", getWareType())
            .append("remark", getRemark())
            .append("contordeId", getContordeId())
            .append("totalinboQuan", getTotalinboQuan())
            .append("toatalAmou", getToatalAmou())
            .append("prodId", getProdId())
            .append("wareQuan", getWareQuan())
            .append("warehouse", getWarehouse())
            .append("json", getJson())
            .toString();
    }
}
