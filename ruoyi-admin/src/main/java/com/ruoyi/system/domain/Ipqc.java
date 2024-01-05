package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 制程检验对象 ipqc
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Ipqc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 检验单号 */
    @Excel(name = "检验单号")
    private String ipqcNumb;

    /** 检验人员 */
    @Excel(name = "检验人员")
    private String pers;

    /** 检验时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 关联检验工单id */
    @Excel(name = "关联检验工单id")
    private Long prodordeId;

    /** 关联产品信息id */
    @Excel(name = "关联产品信息id")
    private String prodId;

    /** 关联检验工序id */
    @Excel(name = "关联检验工序id")
    private Long techbomId;

    /** 检验类型 */
    @Excel(name = "检验类型")
    private String inspType;

    /** 检验项目 */
    @Excel(name = "检验项目")
    private String inspItems;

    /** 测量单位 */
    @Excel(name = "测量单位")
    private String measUnit;

    /** 标准上限值 */
    @Excel(name = "标准上限值")
    private String stanUppe;

    /** 标准下限值 */
    @Excel(name = "标准下限值")
    private String stanLowe;

    /** 检验总数 */
    @Excel(name = "检验总数")
    private String checkSum;

    /** 不合格数 */
    @Excel(name = "不合格数")
    private String unquQuan;

    /** 合格率 */
    @Excel(name = "合格率")
    private String passRate;

    /** 检验结果 */
    @Excel(name = "检验结果")
    private String inspResu;

    /** 子表实测值 */
    @Excel(name = "子表实测值")
    private String actual;

    /** 是否合格 */
    @Excel(name = "是否合格")
    private String isQualified;

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
    public void setIpqcNumb(String ipqcNumb) 
    {
        this.ipqcNumb = ipqcNumb;
    }

    public String getIpqcNumb() 
    {
        return ipqcNumb;
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
    public void setProdId(String prodId) 
    {
        this.prodId = prodId;
    }

    public String getProdId() 
    {
        return prodId;
    }
    public void setTechbomId(Long techbomId) 
    {
        this.techbomId = techbomId;
    }

    public Long getTechbomId() 
    {
        return techbomId;
    }
    public void setInspType(String inspType) 
    {
        this.inspType = inspType;
    }

    public String getInspType() 
    {
        return inspType;
    }
    public void setInspItems(String inspItems) 
    {
        this.inspItems = inspItems;
    }

    public String getInspItems() 
    {
        return inspItems;
    }
    public void setMeasUnit(String measUnit) 
    {
        this.measUnit = measUnit;
    }

    public String getMeasUnit() 
    {
        return measUnit;
    }
    public void setStanUppe(String stanUppe) 
    {
        this.stanUppe = stanUppe;
    }

    public String getStanUppe() 
    {
        return stanUppe;
    }
    public void setStanLowe(String stanLowe) 
    {
        this.stanLowe = stanLowe;
    }

    public String getStanLowe() 
    {
        return stanLowe;
    }
    public void setCheckSum(String checkSum) 
    {
        this.checkSum = checkSum;
    }

    public String getCheckSum() 
    {
        return checkSum;
    }
    public void setUnquQuan(String unquQuan) 
    {
        this.unquQuan = unquQuan;
    }

    public String getUnquQuan() 
    {
        return unquQuan;
    }
    public void setPassRate(String passRate) 
    {
        this.passRate = passRate;
    }

    public String getPassRate() 
    {
        return passRate;
    }
    public void setInspResu(String inspResu) 
    {
        this.inspResu = inspResu;
    }

    public String getInspResu() 
    {
        return inspResu;
    }
    public void setActual(String actual) 
    {
        this.actual = actual;
    }

    public String getActual() 
    {
        return actual;
    }
    public void setIsQualified(String isQualified) 
    {
        this.isQualified = isQualified;
    }

    public String getIsQualified() 
    {
        return isQualified;
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
            .append("ipqcNumb", getIpqcNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("prodordeId", getProdordeId())
            .append("prodId", getProdId())
            .append("techbomId", getTechbomId())
            .append("inspType", getInspType())
            .append("inspItems", getInspItems())
            .append("measUnit", getMeasUnit())
            .append("stanUppe", getStanUppe())
            .append("stanLowe", getStanLowe())
            .append("checkSum", getCheckSum())
            .append("unquQuan", getUnquQuan())
            .append("passRate", getPassRate())
            .append("inspResu", getInspResu())
            .append("remark", getRemark())
            .append("actual", getActual())
            .append("isQualified", getIsQualified())
            .append("json", getJson())
            .toString();
    }
}
