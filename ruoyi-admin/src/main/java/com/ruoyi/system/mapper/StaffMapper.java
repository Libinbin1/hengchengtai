package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Staff;

/**
 * 员工信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface StaffMapper 
{
    /**
     * 查询员工信息
     * 
     * @param id 员工信息主键
     * @return 员工信息
     */
    public Staff selectStaffById(Long id);

    /**
     * 查询员工信息列表
     * 
     * @param staff 员工信息
     * @return 员工信息集合
     */
    public List<Staff> selectStaffList(Staff staff);

    /**
     * 新增员工信息
     * 
     * @param staff 员工信息
     * @return 结果
     */
    public int insertStaff(Staff staff);

    /**
     * 修改员工信息
     * 
     * @param staff 员工信息
     * @return 结果
     */
    public int updateStaff(Staff staff);

    /**
     * 删除员工信息
     * 
     * @param id 员工信息主键
     * @return 结果
     */
    public int deleteStaffById(Long id);

    /**
     * 批量删除员工信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStaffByIds(String[] ids);
}
