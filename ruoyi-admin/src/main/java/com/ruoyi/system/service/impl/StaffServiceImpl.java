package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StaffMapper;
import com.ruoyi.system.domain.Staff;
import com.ruoyi.system.service.IStaffService;
import com.ruoyi.common.core.text.Convert;

/**
 * 员工信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class StaffServiceImpl implements IStaffService 
{
    @Autowired
    private StaffMapper staffMapper;

    /**
     * 查询员工信息
     * 
     * @param id 员工信息主键
     * @return 员工信息
     */
    @Override
    public Staff selectStaffById(Long id)
    {
        return staffMapper.selectStaffById(id);
    }

    /**
     * 查询员工信息列表
     * 
     * @param staff 员工信息
     * @return 员工信息
     */
    @Override
    public List<Staff> selectStaffList(Staff staff)
    {
        return staffMapper.selectStaffList(staff);
    }

    /**
     * 新增员工信息
     * 
     * @param staff 员工信息
     * @return 结果
     */
    @Override
    public int insertStaff(Staff staff)
    {
        return staffMapper.insertStaff(staff);
    }

    /**
     * 修改员工信息
     * 
     * @param staff 员工信息
     * @return 结果
     */
    @Override
    public int updateStaff(Staff staff)
    {
        return staffMapper.updateStaff(staff);
    }

    /**
     * 批量删除员工信息
     * 
     * @param ids 需要删除的员工信息主键
     * @return 结果
     */
    @Override
    public int deleteStaffByIds(String ids)
    {
        return staffMapper.deleteStaffByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除员工信息信息
     * 
     * @param id 员工信息主键
     * @return 结果
     */
    @Override
    public int deleteStaffById(Long id)
    {
        return staffMapper.deleteStaffById(id);
    }
}
