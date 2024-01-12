package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 生产计划对象 prod_plan
 * 
 * @author bin
 * @date 2024-01-11
 */
public class ProdPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /** 计划编号id */
    @Excel(name = "计划编号id")
    private Long planId;

    /** 计划人 */
    @Excel(name = "计划人")
    private String planPers;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 计划来源 */
    @Excel(name = "计划来源")
    private String planSour;

    /** 关联销售订单id */
    @Excel(name = "关联销售订单id")
    private Long saleOrderId;

    /** 选择产品id */
    @Excel(name = "选择产品id")
    private Long prodId;

    /** 计划产品id */
    @Excel(name = "计划产品id")
    private Long planprodId;

    /** 计划数量 */
    @Excel(name = "计划数量")
    private String planQuan;

    /** 计划开始日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "计划开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startDate;

    /** 计划截止日期 */
    @Excel(name = "计划截止日期")
    private String planDeadline;

    /** 选择BOM */
    @Excel(name = "选择BOM")
    private String chooBom;

    /** 子表物料明细关联产品信息 */
    @Excel(name = "子表物料明细关联产品信息")
    private String materialdetaProd;

    /** 需求数量 */
    @Excel(name = "需求数量")
    private String demandQuan;

    /** 排产完成率 */
    @Excel(name = "排产完成率")
    private String prodscheComprate;

    /** 生产入库完成率 */
    @Excel(name = "生产入库完成率")
    private String warecompRate;

    /** 排产状态 */
    @Excel(name = "排产状态")
    private String prodscheStatus;

    /** 已排产总数 */
    @Excel(name = "已排产总数")
    private String totalprodSche;

    /** 未排产总数 */
    @Excel(name = "未排产总数")
    private String totalprodUnsche;

    /** 生产入库状态 */
    @Excel(name = "生产入库状态")
    private String wareStatus;

    /** 已生产入库总数 */
    @Excel(name = "已生产入库总数")
    private String totalWare;

    /** 未生产入库总数 */
    @Excel(name = "未生产入库总数")
    private String totalUnware;

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
    public void setPlanId(Long planId) 
    {
        this.planId = planId;
    }

    public Long getPlanId() 
    {
        return planId;
    }
    public void setPlanPers(String planPers) 
    {
        this.planPers = planPers;
    }

    public String getPlanPers() 
    {
        return planPers;
    }
    public void setDate(Date date) 
    {
        this.date = date;
    }

    public Date getDate() 
    {
        return date;
    }
    public void setPlanSour(String planSour) 
    {
        this.planSour = planSour;
    }

    public String getPlanSour() 
    {
        return planSour;
    }
    public void setSaleOrderId(Long saleOrderId) 
    {
        this.saleOrderId = saleOrderId;
    }

    public Long getSaleOrderId() 
    {
        return saleOrderId;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setPlanprodId(Long planprodId) 
    {
        this.planprodId = planprodId;
    }

    public Long getPlanprodId() 
    {
        return planprodId;
    }
    public void setPlanQuan(String planQuan) 
    {
        this.planQuan = planQuan;
    }

    public String getPlanQuan() 
    {
        return planQuan;
    }
    public void setStartDate(Date startDate) 
    {
        this.startDate = startDate;
    }

    public Date getStartDate() 
    {
        return startDate;
    }
    public void setPlanDeadline(String planDeadline) 
    {
        this.planDeadline = planDeadline;
    }

    public String getPlanDeadline() 
    {
        return planDeadline;
    }
    public void setChooBom(String chooBom) 
    {
        this.chooBom = chooBom;
    }

    public String getChooBom() 
    {
        return chooBom;
    }
    public void setMaterialdetaProd(String materialdetaProd) 
    {
        this.materialdetaProd = materialdetaProd;
    }

    public String getMaterialdetaProd() 
    {
        return materialdetaProd;
    }
    public void setDemandQuan(String demandQuan) 
    {
        this.demandQuan = demandQuan;
    }

    public String getDemandQuan() 
    {
        return demandQuan;
    }
    public void setProdscheComprate(String prodscheComprate) 
    {
        this.prodscheComprate = prodscheComprate;
    }

    public String getProdscheComprate() 
    {
        return prodscheComprate;
    }
    public void setWarecompRate(String warecompRate) 
    {
        this.warecompRate = warecompRate;
    }

    public String getWarecompRate() 
    {
        return warecompRate;
    }
    public void setProdscheStatus(String prodscheStatus) 
    {
        this.prodscheStatus = prodscheStatus;
    }

    public String getProdscheStatus() 
    {
        return prodscheStatus;
    }
    public void setTotalprodSche(String totalprodSche) 
    {
        this.totalprodSche = totalprodSche;
    }

    public String getTotalprodSche() 
    {
        return totalprodSche;
    }
    public void setTotalprodUnsche(String totalprodUnsche) 
    {
        this.totalprodUnsche = totalprodUnsche;
    }

    public String getTotalprodUnsche() 
    {
        return totalprodUnsche;
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
            .append("planId", getPlanId())
            .append("planPers", getPlanPers())
            .append("date", getDate())
            .append("planSour", getPlanSour())
            .append("saleOrderId", getSaleOrderId())
            .append("prodId", getProdId())
            .append("planprodId", getPlanprodId())
            .append("planQuan", getPlanQuan())
            .append("startDate", getStartDate())
            .append("planDeadline", getPlanDeadline())
            .append("chooBom", getChooBom())
            .append("remark", getRemark())
            .append("materialdetaProd", getMaterialdetaProd())
            .append("demandQuan", getDemandQuan())
            .append("prodscheComprate", getProdscheComprate())
            .append("warecompRate", getWarecompRate())
            .append("prodscheStatus", getProdscheStatus())
            .append("totalprodSche", getTotalprodSche())
            .append("totalprodUnsche", getTotalprodUnsche())
            .append("wareStatus", getWareStatus())
            .append("totalWare", getTotalWare())
            .append("totalUnware", getTotalUnware())
            .append("json", getJson())
            .toString();
    }
}
