package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 库存盘点对象 stock_check
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class StockCheck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 盘点单号 */
    @Excel(name = "盘点单号")
    private String checkNumb;

    /** 盘点人 */
    @Excel(name = "盘点人")
    private String pers;

    /** 盘点日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "盘点日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 盘点总数量 */
    @Excel(name = "盘点总数量")
    private String totalcheckQuan;

    /** 差异总数量 */
    @Excel(name = "差异总数量")
    private String totalDiff;

    /** 子表盘点明细关联产品信息id */
    @Excel(name = "子表盘点明细关联产品信息id")
    private Long prodId;

    /** 库存数量 */
    @Excel(name = "库存数量")
    private String wareQuan;

    /** 盘点数量 */
    @Excel(name = "盘点数量")
    private String checkQuan;

    /** 盘盈盘亏 */
    @Excel(name = "盘盈盘亏")
    private String resultStat;

    /** 差异数量 */
    @Excel(name = "差异数量")
    private String diffQuan;

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
    public void setCheckNumb(String checkNumb) 
    {
        this.checkNumb = checkNumb;
    }

    public String getCheckNumb() 
    {
        return checkNumb;
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
    public void setTotalcheckQuan(String totalcheckQuan) 
    {
        this.totalcheckQuan = totalcheckQuan;
    }

    public String getTotalcheckQuan() 
    {
        return totalcheckQuan;
    }
    public void setTotalDiff(String totalDiff) 
    {
        this.totalDiff = totalDiff;
    }

    public String getTotalDiff() 
    {
        return totalDiff;
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
    public void setCheckQuan(String checkQuan) 
    {
        this.checkQuan = checkQuan;
    }

    public String getCheckQuan() 
    {
        return checkQuan;
    }
    public void setResultStat(String result_stat)
    {
        this.resultStat = result_stat;
    }

    public String getResultStat()
    {
        return resultStat;
    }
    public void setDiffQuan(String diffQuan) 
    {
        this.diffQuan = diffQuan;
    }

    public String getDiffQuan() 
    {
        return diffQuan;
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
            .append("checkNumb", getCheckNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("totalcheckQuan", getTotalcheckQuan())
            .append("totalDiff", getTotalDiff())
            .append("remark", getRemark())
            .append("prodId", getProdId())
            .append("wareQuan", getWareQuan())
            .append("checkQuan", getCheckQuan())
            .append("result_stat", getResultStat())
            .append("diffQuan", getDiffQuan())
            .append("json", getJson())
            .toString();
    }
}
