package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 出库检验对象 oqc
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Oqc extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 检验单号 */
    @Excel(name = "检验单号")
    private String oqcNumb;

    /** 检验人员 */
    @Excel(name = "检验人员")
    private String pers;

    /** 检验时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检验时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date date;

    /** 关联销售出库单id */
    @Excel(name = "关联销售出库单id")
    private Long saleoutbId;

    /** 不合格数量 */
    @Excel(name = "不合格数量")
    private String unquQuan;

    /** 合格率 */
    @Excel(name = "合格率")
    private String passRate;

    /** 结果处理 */
    @Excel(name = "结果处理")
    private String procResu;

    /** 子表关联产品信息id */
    @Excel(name = "子表关联产品信息id")
    private Long productId;

    /** 出库数量 */
    @Excel(name = "出库数量")
    private String quanOutb;

    /** 检验数量 */
    @Excel(name = "检验数量")
    private String inspQuan;

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
    public void setOqcNumb(String oqcNumb) 
    {
        this.oqcNumb = oqcNumb;
    }

    public String getOqcNumb() 
    {
        return oqcNumb;
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
    public void setSaleoutbId(Long saleoutbId) 
    {
        this.saleoutbId = saleoutbId;
    }

    public Long getSaleoutbId() 
    {
        return saleoutbId;
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
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
    }
    public void setQuanOutb(String quanOutb) 
    {
        this.quanOutb = quanOutb;
    }

    public String getQuanOutb() 
    {
        return quanOutb;
    }
    public void setInspQuan(String inspQuan) 
    {
        this.inspQuan = inspQuan;
    }

    public String getInspQuan() 
    {
        return inspQuan;
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
            .append("oqcNumb", getOqcNumb())
            .append("pers", getPers())
            .append("date", getDate())
            .append("saleoutbId", getSaleoutbId())
            .append("remark", getRemark())
            .append("unquQuan", getUnquQuan())
            .append("passRate", getPassRate())
            .append("procResu", getProcResu())
            .append("productId", getProductId())
            .append("quanOutb", getQuanOutb())
            .append("inspQuan", getInspQuan())
            .append("json", getJson())
            .toString();
    }
}
