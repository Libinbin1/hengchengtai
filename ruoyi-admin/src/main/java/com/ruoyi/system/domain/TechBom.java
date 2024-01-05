package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工艺bom对象 tech_bom
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class TechBom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** bom编码 */
    @Excel(name = "bom编码")
    private String bomCode;

    /** bom名称 */
    @Excel(name = "bom名称")
    private String bomName;

    /** 是否开启工序 */
    @Excel(name = "是否开启工序")
    private String allowprodProce;

    /** bom启用状态 */
    @Excel(name = "bom启用状态")
    private String bomenableStatus;

    /** 关联产品信息id */
    @Excel(name = "关联产品信息id")
    private Long prodId;

    /** 子表子件关联产品信息id */
    @Excel(name = "子表子件关联产品信息id")
    private String subprodId;

    /** 子表关联工序id */
    @Excel(name = "子表关联工序id")
    private Long prodprocId;

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
    public void setBomCode(String bomCode) 
    {
        this.bomCode = bomCode;
    }

    public String getBomCode() 
    {
        return bomCode;
    }
    public void setBomName(String bomName) 
    {
        this.bomName = bomName;
    }

    public String getBomName() 
    {
        return bomName;
    }
    public void setAllowprodProce(String allowprodProce) 
    {
        this.allowprodProce = allowprodProce;
    }

    public String getAllowprodProce() 
    {
        return allowprodProce;
    }
    public void setBomenableStatus(String bomenableStatus) 
    {
        this.bomenableStatus = bomenableStatus;
    }

    public String getBomenableStatus() 
    {
        return bomenableStatus;
    }
    public void setProdId(Long prodId) 
    {
        this.prodId = prodId;
    }

    public Long getProdId() 
    {
        return prodId;
    }
    public void setSubprodId(String subprodId) 
    {
        this.subprodId = subprodId;
    }

    public String getSubprodId() 
    {
        return subprodId;
    }
    public void setProdprocId(Long prodprocId) 
    {
        this.prodprocId = prodprocId;
    }

    public Long getProdprocId() 
    {
        return prodprocId;
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
            .append("bomCode", getBomCode())
            .append("bomName", getBomName())
            .append("allowprodProce", getAllowprodProce())
            .append("bomenableStatus", getBomenableStatus())
            .append("prodId", getProdId())
            .append("subprodId", getSubprodId())
            .append("prodprocId", getProdprocId())
            .append("json", getJson())
            .toString();
    }
}
