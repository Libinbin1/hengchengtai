package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 销售出库对象 salesoutb_order
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class SalesoutbOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 出库单号 */
    @Excel(name = "出库单号")
    private String deliNumb;

    /** 出库日期 */
    @Excel(name = "出库日期")
    private String deliDate;

    /** 出库人员 */
    @Excel(name = "出库人员")
    private String deliPers;

    /** 关联销售订单 */
    @Excel(name = "关联销售订单")
    private String saleorder;

    /** 客户名称id */
    @Excel(name = "客户名称id")
    private Long custId;

    /** 业务员id */
    @Excel(name = "业务员id")
    private Long staffId;

    /** 出库总数量 */
    @Excel(name = "出库总数量")
    private String totaloutbQuan;

    /** 发货总金额 */
    @Excel(name = "发货总金额")
    private String totalshipAmou;

    /** 子表关联产品信息 */
    @Excel(name = "子表关联产品信息")
    private String products;

    /** 是否允许超订单出库 */
    @Excel(name = "是否允许超订单出库")
    private Long allowoverOrder;

    /** 是否允许超库存出库 */
    @Excel(name = "是否允许超库存出库")
    private String allowoverStock;

    /** 超订单出库校验 */
    @Excel(name = "超订单出库校验")
    private String overorderoutbVeri;

    /** 库存校验 */
    @Excel(name = "库存校验")
    private String stockCheck;

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
    public void setDeliNumb(String deliNumb) 
    {
        this.deliNumb = deliNumb;
    }

    public String getDeliNumb() 
    {
        return deliNumb;
    }
    public void setDeliDate(String deliDate) 
    {
        this.deliDate = deliDate;
    }

    public String getDeliDate() 
    {
        return deliDate;
    }
    public void setDeliPers(String deliPers) 
    {
        this.deliPers = deliPers;
    }

    public String getDeliPers() 
    {
        return deliPers;
    }
    public void setSaleorder(String saleorder) 
    {
        this.saleorder = saleorder;
    }

    public String getSaleorder() 
    {
        return saleorder;
    }
    public void setCustId(Long custId) 
    {
        this.custId = custId;
    }

    public Long getCustId() 
    {
        return custId;
    }
    public void setStaffId(Long staffId) 
    {
        this.staffId = staffId;
    }

    public Long getStaffId() 
    {
        return staffId;
    }
    public void setTotaloutbQuan(String totaloutbQuan) 
    {
        this.totaloutbQuan = totaloutbQuan;
    }

    public String getTotaloutbQuan() 
    {
        return totaloutbQuan;
    }
    public void setTotalshipAmou(String totalshipAmou) 
    {
        this.totalshipAmou = totalshipAmou;
    }

    public String getTotalshipAmou() 
    {
        return totalshipAmou;
    }
    public void setProducts(String products) 
    {
        this.products = products;
    }

    public String getProducts() 
    {
        return products;
    }
    public void setAllowoverOrder(Long allowoverOrder) 
    {
        this.allowoverOrder = allowoverOrder;
    }

    public Long getAllowoverOrder() 
    {
        return allowoverOrder;
    }
    public void setAllowoverStock(String allowoverStock) 
    {
        this.allowoverStock = allowoverStock;
    }

    public String getAllowoverStock() 
    {
        return allowoverStock;
    }
    public void setOverorderoutbVeri(String overorderoutbVeri) 
    {
        this.overorderoutbVeri = overorderoutbVeri;
    }

    public String getOverorderoutbVeri() 
    {
        return overorderoutbVeri;
    }
    public void setStockCheck(String stockCheck) 
    {
        this.stockCheck = stockCheck;
    }

    public String getStockCheck() 
    {
        return stockCheck;
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
            .append("deliNumb", getDeliNumb())
            .append("deliDate", getDeliDate())
            .append("deliPers", getDeliPers())
            .append("saleorder", getSaleorder())
            .append("custId", getCustId())
            .append("staffId", getStaffId())
            .append("totaloutbQuan", getTotaloutbQuan())
            .append("totalshipAmou", getTotalshipAmou())
            .append("remark", getRemark())
            .append("products", getProducts())
            .append("allowoverOrder", getAllowoverOrder())
            .append("allowoverStock", getAllowoverStock())
            .append("overorderoutbVeri", getOverorderoutbVeri())
            .append("stockCheck", getStockCheck())
            .append("json", getJson())
            .toString();
    }
}
