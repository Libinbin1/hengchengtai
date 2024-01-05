package com.ruoyi.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售订单对象 saleorder
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Saleorder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 合同编号 */
    @Excel(name = "合同编号")
    private String code;

    /** 销售时期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "销售时期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date saledate;

    /** 业务员编号 */
    @Excel(name = "业务员编号")
    private String staffcode;

    /** 报价单编号 */
    @Excel(name = "报价单编号")
    private String quotationCode;

    /** 用户编号 */
    @Excel(name = "用户编号")
    private String customCode;

    /** 付款方式 */
    @Excel(name = "付款方式")
    private String paymentMethod;

    /** 用户id */
    @Excel(name = "用户id")
    private Long customId;

    /** 报价单id */
    @Excel(name = "报价单id")
    private Long quotationId;

    /** 业务员id */
    @Excel(name = "业务员id")
    private Long staffId;

    /** 总合同金额 */
    @Excel(name = "总合同金额")
    private String totalContractamount;

    /** 总合同数量 */
    @Excel(name = "总合同数量")
    private String totalContractquantity;

    /** 产品编码 */
    @Excel(name = "产品编码")
    private String productCode;

    /** 生产计划编码 */
    @Excel(name = "生产计划编码")
    private String schedulingCode;

    /** 生产计划id */
    @Excel(name = "生产计划id")
    private Long schedulingId;

    /** 产品id */
    @Excel(name = "产品id")
    private Long productId;

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
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setSaledate(Date saledate) 
    {
        this.saledate = saledate;
    }

    public Date getSaledate() 
    {
        return saledate;
    }
    public void setStaffcode(String staffcode) 
    {
        this.staffcode = staffcode;
    }

    public String getStaffcode() 
    {
        return staffcode;
    }
    public void setQuotationCode(String quotationCode) 
    {
        this.quotationCode = quotationCode;
    }

    public String getQuotationCode() 
    {
        return quotationCode;
    }
    public void setCustomCode(String customCode) 
    {
        this.customCode = customCode;
    }

    public String getCustomCode() 
    {
        return customCode;
    }
    public void setPaymentMethod(String paymentMethod) 
    {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() 
    {
        return paymentMethod;
    }
    public void setCustomId(Long customId) 
    {
        this.customId = customId;
    }

    public Long getCustomId() 
    {
        return customId;
    }
    public void setQuotationId(Long quotationId) 
    {
        this.quotationId = quotationId;
    }

    public Long getQuotationId() 
    {
        return quotationId;
    }
    public void setStaffId(Long staffId) 
    {
        this.staffId = staffId;
    }

    public Long getStaffId() 
    {
        return staffId;
    }
    public void setTotalContractamount(String totalContractamount) 
    {
        this.totalContractamount = totalContractamount;
    }

    public String getTotalContractamount() 
    {
        return totalContractamount;
    }
    public void setTotalContractquantity(String totalContractquantity) 
    {
        this.totalContractquantity = totalContractquantity;
    }

    public String getTotalContractquantity() 
    {
        return totalContractquantity;
    }
    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
    }
    public void setSchedulingCode(String schedulingCode) 
    {
        this.schedulingCode = schedulingCode;
    }

    public String getSchedulingCode() 
    {
        return schedulingCode;
    }
    public void setSchedulingId(Long schedulingId) 
    {
        this.schedulingId = schedulingId;
    }

    public Long getSchedulingId() 
    {
        return schedulingId;
    }
    public void setProductId(Long productId) 
    {
        this.productId = productId;
    }

    public Long getProductId() 
    {
        return productId;
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
            .append("code", getCode())
            .append("saledate", getSaledate())
            .append("staffcode", getStaffcode())
            .append("quotationCode", getQuotationCode())
            .append("customCode", getCustomCode())
            .append("paymentMethod", getPaymentMethod())
            .append("customId", getCustomId())
            .append("quotationId", getQuotationId())
            .append("staffId", getStaffId())
            .append("totalContractamount", getTotalContractamount())
            .append("totalContractquantity", getTotalContractquantity())
            .append("remark", getRemark())
            .append("productCode", getProductCode())
            .append("schedulingCode", getSchedulingCode())
            .append("schedulingId", getSchedulingId())
            .append("productId", getProductId())
            .append("json", getJson())
            .toString();
    }
}
