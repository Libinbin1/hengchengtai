package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产领料对象 prod_pick
 * 
 * @author bin
 * @date 2024-01-04
 */
public class ProdPick extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 领料单号 */
    @Excel(name = "领料单号")
    private String materequNumb;

    /** 领料人 */
    @Excel(name = "领料人")
    private String pers;

    /** 领料日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "领料日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 关联生产工单id */
    @Excel(name = "关联生产工单id")
    private Long prodordeId;

    /** 领料总数量 */
    @Excel(name = "领料总数量")
    private String totalPick;

    /** 子表领料明细关联产品信息id */
    @Excel(name = "子表领料明细关联产品信息id")
    private Long pickprodId;

    /** 领料数量 */
    @Excel(name = "领料数量")
    private String quanmateRequ;

    /** 领料仓库 */
    @Excel(name = "领料仓库")
    private String warehousemateRequ;

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
    public void setMaterequNumb(String materequNumb) 
    {
        this.materequNumb = materequNumb;
    }

    public String getMaterequNumb() 
    {
        return materequNumb;
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
    public void setProdordeId(Long prodordeId) 
    {
        this.prodordeId = prodordeId;
    }

    public Long getProdordeId() 
    {
        return prodordeId;
    }
    public void setTotalPick(String totalPick) 
    {
        this.totalPick = totalPick;
    }

    public String getTotalPick() 
    {
        return totalPick;
    }
    public void setPickprodId(Long pickprodId) 
    {
        this.pickprodId = pickprodId;
    }

    public Long getPickprodId() 
    {
        return pickprodId;
    }
    public void setQuanmateRequ(String quanmateRequ) 
    {
        this.quanmateRequ = quanmateRequ;
    }

    public String getQuanmateRequ() 
    {
        return quanmateRequ;
    }
    public void setWarehousemateRequ(String warehousemateRequ) 
    {
        this.warehousemateRequ = warehousemateRequ;
    }

    public String getWarehousemateRequ() 
    {
        return warehousemateRequ;
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
            .append("materequNumb", getMaterequNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("prodordeId", getProdordeId())
            .append("totalPick", getTotalPick())
            .append("remark", getRemark())
            .append("pickprodId", getPickprodId())
            .append("quanmateRequ", getQuanmateRequ())
            .append("warehousemateRequ", getWarehousemateRequ())
            .append("json", getJson())
            .toString();
    }
}
