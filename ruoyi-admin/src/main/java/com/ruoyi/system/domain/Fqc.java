package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 成品检验对象 fqc
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Fqc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 检验单号 */
    @Excel(name = "检验单号")
    private String fqcNumb;

    /** 检验人员 */
    @Excel(name = "检验人员")
    private String pers;

    /** 检验时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 关联生产工单id
 */
    @Excel(name = "关联生产工单id")
    private Long prodordeId;

    /** 关联生产入库单id */
    @Excel(name = "关联生产入库单id")
    private Long prodwareId;

    /** 检验总数 */
    @Excel(name = "检验总数")
    private String checkSum;

    /** 不合格数量 */
    @Excel(name = "不合格数量")
    private String unquQuan;

    /** 合格率 */
    @Excel(name = "合格率")
    private String passRate;

    /** 结果处理 */
    @Excel(name = "结果处理")
    private String procResu;

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
    public void setFqcNumb(String fqcNumb) 
    {
        this.fqcNumb = fqcNumb;
    }

    public String getFqcNumb() 
    {
        return fqcNumb;
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
    public void setProdwareId(Long prodwareId) 
    {
        this.prodwareId = prodwareId;
    }

    public Long getProdwareId() 
    {
        return prodwareId;
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
    public void setProcResu(String procResu) 
    {
        this.procResu = procResu;
    }

    public String getProcResu() 
    {
        return procResu;
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
            .append("fqcNumb", getFqcNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("prodordeId", getProdordeId())
            .append("prodwareId", getProdwareId())
            .append("checkSum", getCheckSum())
            .append("unquQuan", getUnquQuan())
            .append("passRate", getPassRate())
            .append("procResu", getProcResu())
            .append("remark", getRemark())
            .append("json", getJson())
            .toString();
    }
}
