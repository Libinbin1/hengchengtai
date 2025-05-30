package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Custom;

/**
 * 客户Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface CustomMapper 
{
    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    public Custom selectCustomById(Long id);

    /**
     * 查询客户列表
     * 
     * @param custom 客户
     * @return 客户集合
     */
    public List<Custom> selectCustomList(Custom custom);

    /**
     * 新增客户
     * 
     * @param custom 客户
     * @return 结果
     */
    public int insertCustom(Custom custom);

    /**
     * 修改客户
     * 
     * @param custom 客户
     * @return 结果
     */
    public int updateCustom(Custom custom);

    /**
     * 删除客户
     * 
     * @param id 客户主键
     * @return 结果
     */
    public int deleteCustomById(Long id);

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCustomByIds(String[] ids);
}
