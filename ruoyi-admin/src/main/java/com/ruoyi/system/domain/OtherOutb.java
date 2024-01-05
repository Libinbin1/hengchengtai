package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 其他出库对象 other_outb
 * 
 * @author bin
 * @date 2024-01-04
 */
public class OtherOutb extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 出库单号 */
    @Excel(name = "出库单号")
    private String outbNumb;

    /** 出库人员 */
    @Excel(name = "出库人员")
    private String pers;

    /** 出库日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出库日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 出库类型 */
    @Excel(name = "出库类型")
    private String outbType;

    /** 出库总数量 */
    @Excel(name = "出库总数量")
    private String totalOutbQuan;

    /** 关联采购订单id */
    @Excel(name = "关联采购订单id")
    private Long purcordeId;

    /** 子表出库明细关联产品信息id */
    @Excel(name = "子表出库明细关联产品信息id")
    private Long prodId;

    /** 出库数量 */
    @Excel(name = "出库数量")
    private String outbQuan;

    /** 出库仓库 */
    @Excel(name = "出库仓库")
    private String outbWare;

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
    public void setOutbNumb(String outbNumb) 
    {
        this.outbNumb = outbNumb;
    }

    public String getOutbNumb() 
    {
        return outbNumb;
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
    public void setOutbType(String outbType) 
    {
        this.outbType = outbType;
    }

    public String getOutbType() 
    {
        return outbType;
    }
    public void setTotalOutbQuan(String totalOutbQuan) 
    {
        this.totalOutbQuan = totalOutbQuan;
    }

    public String getTotalOutbQuan() 
    {
        return totalOutbQuan;
    }
    public void setPurcordeId(Long purcordeId) 
    {
        this.purcordeId = purcordeId;
    }

    public Long getPurcordeId() 
    {
        return purcordeId;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setOutbQuan(String outbQuan) 
    {
        this.outbQuan = outbQuan;
    }

    public String getOutbQuan() 
    {
        return outbQuan;
    }
    public void setOutbWare(String outbWare) 
    {
        this.outbWare = outbWare;
    }

    public String getOutbWare() 
    {
        return outbWare;
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
            .append("outbNumb", getOutbNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("outbType", getOutbType())
            .append("totalOutbQuan", getTotalOutbQuan())
            .append("remark", getRemark())
            .append("purcordeId", getPurcordeId())
            .append("prodId", getProdId())
            .append("outbQuan", getOutbQuan())
            .append("outbWare", getOutbWare())
            .append("json", getJson())
            .toString();
    }
}
