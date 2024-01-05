package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 员工信息对象 staff
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public class Staff extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 员工姓名 */
    @Excel(name = "员工姓名")
    private String staffname;

    /** 性别 */
    @Excel(name = "性别")
    private String gender;

    /** 电话 */
    @Excel(name = "电话")
    private String tel;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String depart;

    /** 职责 */
    @Excel(name = "职责")
    private String duties;

    /** 角色 */
    @Excel(name = "角色")
    private String role;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String json;

    public void setStaffname(String staffname) 
    {
        this.staffname = staffname;
    }

    public String getStaffname() 
    {
        return staffname;
    }
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public String getGender() 
    {
        return gender;
    }
    public void setTel(String tel) 
    {
        this.tel = tel;
    }

    public String getTel() 
    {
        return tel;
    }
    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDepart(String depart) 
    {
        this.depart = depart;
    }

    public String getDepart() 
    {
        return depart;
    }
    public void setDuties(String duties) 
    {
        this.duties = duties;
    }

    public String getDuties() 
    {
        return duties;
    }
    public void setRole(String role) 
    {
        this.role = role;
    }

    public String getRole() 
    {
        return role;
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
            .append("staffname", getStaffname())
            .append("gender", getGender())
            .append("tel", getTel())
            .append("id", getId())
            .append("depart", getDepart())
            .append("duties", getDuties())
            .append("role", getRole())
            .append("json", getJson())
            .toString();
    }
}
