package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 仓库信息对象 warehourse_info
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class WarehourseInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 仓库名称 */
    @Excel(name = "仓库名称")
    private String warehousename;

    /** 仓库编号 */
    @Excel(name = "仓库编号")
    private String code;

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
    public void setWarehousename(String warehousename) 
    {
        this.warehousename = warehousename;
    }

    public String getWarehousename() 
    {
        return warehousename;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
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
            .append("warehousename", getWarehousename())
            .append("code", getCode())
            .append("remark", getRemark())
            .append("json", getJson())
            .toString();
    }
}
