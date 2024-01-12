package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产工单对象 prod_order
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class ProdOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 生产单号 */
    @Excel(name = "生产单号")
    private String prodorderNumb;

    /** 日期 */
    @Excel(name = "日期")
    private String date;

    /** 下单人 */
    @Excel(name = "下单人")
    private String pers;

    /** 关联生产计划id */
    @Excel(name = "关联生产计划id")
    private Long prodplanId;

    /** 关联产品信息id */
    @Excel(name = "关联产品信息id")
    private Long prodprodId;

    /** 生产开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Excel(name = "生产开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date prodstartDate;

    /** 生产截止日期 */
    @Excel(name = "生产截止日期")
    private String prodDeadline;

    /** 子表关联产品信息id */
    @Excel(name = "子表关联产品信息id")
    private Long materialprodId;

    /** 子表关联工序id */
    @Excel(name = "子表关联工序id")
    private Long prodproceId;

    /** 领料状态 */
    @Excel(name = "领料状态")
    private String pickingStatus;

    /** 已领料总数 */
    @Excel(name = "已领料总数")
    private String totalPicking;

    /** 未领料总数 */
    @Excel(name = "未领料总数")
    private String totalUncla;

    /** 生产入库状态 */
    @Excel(name = "生产入库状态")
    private String wareStatus;

    /** 已生产入库总数 */
    @Excel(name = "已生产入库总数")
    private String totalWare;

    /** 未生产入库总数 */
    @Excel(name = "未生产入库总数")
    private String totalUnware;

    /** 关联合同订单id */
    @Excel(name = "关联合同订单id")
    private Long contorderId;

    /** 物料需求总数 */
    @Excel(name = "物料需求总数")
    private String totalmaterRequ;

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
    public void setProdorderNumb(String prodorderNumb) 
    {
        this.prodorderNumb = prodorderNumb;
    }

    public String getProdorderNumb() 
    {
        return prodorderNumb;
    }
    public void setDate(String date) 
    {
        this.date = date;
    }

    public String getDate() 
    {
        return date;
    }
    public void setPers(String pers) 
    {
        this.pers = pers;
    }

    public String getPers() 
    {
        return pers;
    }
    public void setProdplanId(Long prodplanId) 
    {
        this.prodplanId = prodplanId;
    }

    public Long getProdplanId() 
    {
        return prodplanId;
    }
    public void setProdprodId(Long prodprodId) 
    {
        this.prodprodId = prodprodId;
    }

    public Long getProdprodId() 
    {
        return prodprodId;
    }
    public void setProdstartDate(Date prodstartDate) 
    {
        this.prodstartDate = prodstartDate;
    }

    public Date getProdstartDate() 
    {
        return prodstartDate;
    }
    public void setProdDeadline(String prodDeadline) 
    {
        this.prodDeadline = prodDeadline;
    }

    public String getProdDeadline() 
    {
        return prodDeadline;
    }
    public void setMaterialprodId(Long materialprodId) 
    {
        this.materialprodId = materialprodId;
    }

    public Long getMaterialprodId() 
    {
        return materialprodId;
    }
    public void setProdproceId(Long prodproceId) 
    {
        this.prodproceId = prodproceId;
    }

    public Long getProdproceId() 
    {
        return prodproceId;
    }
    public void setPickingStatus(String pickingStatus) 
    {
        this.pickingStatus = pickingStatus;
    }

    public String getPickingStatus() 
    {
        return pickingStatus;
    }
    public void setTotalPicking(String totalPicking) 
    {
        this.totalPicking = totalPicking;
    }

    public String getTotalPicking() 
    {
        return totalPicking;
    }
    public void setTotalUncla(String totalUncla) 
    {
        this.totalUncla = totalUncla;
    }

    public String getTotalUncla() 
    {
        return totalUncla;
    }
    public void setWareStatus(String wareStatus) 
    {
        this.wareStatus = wareStatus;
    }

    public String getWareStatus() 
    {
        return wareStatus;
    }
    public void setTotalWare(String totalWare) 
    {
        this.totalWare = totalWare;
    }

    public String getTotalWare() 
    {
        return totalWare;
    }
    public void setTotalUnware(String totalUnware) 
    {
        this.totalUnware = totalUnware;
    }

    public String getTotalUnware() 
    {
        return totalUnware;
    }
    public void setContorderId(Long contorderId) 
    {
        this.contorderId = contorderId;
    }

    public Long getContorderId() 
    {
        return contorderId;
    }
    public void setTotalmaterRequ(String totalmaterRequ) 
    {
        this.totalmaterRequ = totalmaterRequ;
    }

    public String getTotalmaterRequ() 
    {
        return totalmaterRequ;
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
            .append("prodorderNumb", getProdorderNumb())
            .append("date", getDate())
            .append("pers", getPers())
            .append("prodplanId", getProdplanId())
            .append("prodprodId", getProdprodId())
            .append("prodstartDate", getProdstartDate())
            .append("prodDeadline", getProdDeadline())
            .append("materialprodId", getMaterialprodId())
            .append("prodproceId", getProdproceId())
            .append("pickingStatus", getPickingStatus())
            .append("totalPicking", getTotalPicking())
            .append("totalUncla", getTotalUncla())
            .append("wareStatus", getWareStatus())
            .append("totalWare", getTotalWare())
            .append("totalUnware", getTotalUnware())
            .append("contorderId", getContorderId())
            .append("totalmaterRequ", getTotalmaterRequ())
            .append("json", getJson())
            .toString();
    }
}
