package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CustomMapper;
import com.ruoyi.system.domain.Custom;
import com.ruoyi.system.service.ICustomService;
import com.ruoyi.common.core.text.Convert;

/**
 * 客户Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service("custom")
public class CustomServiceImpl implements ICustomService 
{
    @Autowired
    private CustomMapper customMapper;

    /**
     * 查询客户
     * 
     * @param id 客户主键
     * @return 客户
     */
    @Override
    public Custom selectCustomById(Long id)
    {
        return customMapper.selectCustomById(id);
    }

    /**
     * 查询客户列表
     * 
     * @param custom 客户
     * @return 客户
     */
    @Override
    public List<Custom> selectCustomList(Custom custom)
    {
        return customMapper.selectCustomList(custom);
    }

    /**
     * 新增客户
     * 
     * @param custom 客户
     * @return 结果
     */
    @Override
    public int insertCustom(Custom custom)
    {
        return customMapper.insertCustom(custom);
    }

    /**
     * 修改客户
     * 
     * @param custom 客户
     * @return 结果
     */
    @Override
    public int updateCustom(Custom custom)
    {
        return customMapper.updateCustom(custom);
    }

    /**
     * 批量删除客户
     * 
     * @param ids 需要删除的客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomByIds(String ids)
    {
        return customMapper.deleteCustomByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除客户信息
     * 
     * @param id 客户主键
     * @return 结果
     */
    @Override
    public int deleteCustomById(Long id)
    {
        return customMapper.deleteCustomById(id);
    }

    @Override
    public int toApproval(String id,String arrApproval) {

        Custom custom = new Custom();
        custom.setId(Long.valueOf(id));
        custom.setArrApproval(arrApproval);


        return customMapper.updateCustom(custom);
    }

    /**
     * 查询所有客户列表
     *
     * @return 客户
     */
    @Override
    public List<Custom> selectCustomAllList()
    {
        Custom custom = new Custom();
        return customMapper.selectCustomList(custom);
    }
}
