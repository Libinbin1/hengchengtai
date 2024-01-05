package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 分类对象 classification
 * 
 * @author bin
 * @date 2024-01-04
 */
public class Classification extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 分类名称 */
    @Excel(name = "分类名称")
    private String classificationname;

    /** 默认仓库 */
    @Excel(name = "默认仓库")
    private String defaultwarehouse;

    /** 分类编码 */
    @Excel(name = "分类编码")
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
    public void setClassificationname(String classificationname) 
    {
        this.classificationname = classificationname;
    }

    public String getClassificationname() 
    {
        return classificationname;
    }
    public void setDefaultwarehouse(String defaultwarehouse) 
    {
        this.defaultwarehouse = defaultwarehouse;
    }

    public String getDefaultwarehouse() 
    {
        return defaultwarehouse;
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
            .append("classificationname", getClassificationname())
            .append("defaultwarehouse", getDefaultwarehouse())
            .append("code", getCode())
            .append("json", getJson())
            .toString();
    }
}
