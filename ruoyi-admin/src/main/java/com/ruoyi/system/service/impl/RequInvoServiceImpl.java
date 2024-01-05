package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.RequInvoMapper;
import com.ruoyi.system.domain.RequInvo;
import com.ruoyi.system.service.IRequInvoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 发票申请单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class RequInvoServiceImpl implements IRequInvoService 
{
    @Autowired
    private RequInvoMapper requInvoMapper;

    /**
     * 查询发票申请单
     * 
     * @param id 发票申请单主键
     * @return 发票申请单
     */
    @Override
    public RequInvo selectRequInvoById(Long id)
    {
        return requInvoMapper.selectRequInvoById(id);
    }

    /**
     * 查询发票申请单列表
     * 
     * @param requInvo 发票申请单
     * @return 发票申请单
     */
    @Override
    public List<RequInvo> selectRequInvoList(RequInvo requInvo)
    {
        return requInvoMapper.selectRequInvoList(requInvo);
    }

    /**
     * 新增发票申请单
     * 
     * @param requInvo 发票申请单
     * @return 结果
     */
    @Override
    public int insertRequInvo(RequInvo requInvo)
    {
        return requInvoMapper.insertRequInvo(requInvo);
    }

    /**
     * 修改发票申请单
     * 
     * @param requInvo 发票申请单
     * @return 结果
     */
    @Override
    public int updateRequInvo(RequInvo requInvo)
    {
        return requInvoMapper.updateRequInvo(requInvo);
    }

    /**
     * 批量删除发票申请单
     * 
     * @param ids 需要删除的发票申请单主键
     * @return 结果
     */
    @Override
    public int deleteRequInvoByIds(String ids)
    {
        return requInvoMapper.deleteRequInvoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除发票申请单信息
     * 
     * @param id 发票申请单主键
     * @return 结果
     */
    @Override
    public int deleteRequInvoById(Long id)
    {
        return requInvoMapper.deleteRequInvoById(id);
    }
}
