package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.CommAccountMapper;
import com.ruoyi.system.domain.CommAccount;
import com.ruoyi.system.service.ICommAccountService;
import com.ruoyi.common.core.text.Convert;

/**
 * 往来账目Service业务层处理
 * 
 * @author bin
 * @date 2024-01-12
 */
@Service
public class CommAccountServiceImpl implements ICommAccountService 
{
    @Autowired
    private CommAccountMapper commAccountMapper;

    /**
     * 查询往来账目
     * 
     * @param id 往来账目主键
     * @return 往来账目
     */
    @Override
    public CommAccount selectCommAccountById(Long id)
    {
        return commAccountMapper.selectCommAccountById(id);
    }

    /**
     * 查询往来账目列表
     * 
     * @param commAccount 往来账目
     * @return 往来账目
     */
    @Override
    public List<CommAccount> selectCommAccountList(CommAccount commAccount)
    {
        return commAccountMapper.selectCommAccountList(commAccount);
    }

    /**
     * 新增往来账目
     * 
     * @param commAccount 往来账目
     * @return 结果
     */
    @Override
    public int insertCommAccount(CommAccount commAccount)
    {
        return commAccountMapper.insertCommAccount(commAccount);
    }

    /**
     * 修改往来账目
     * 
     * @param commAccount 往来账目
     * @return 结果
     */
    @Override
    public int updateCommAccount(CommAccount commAccount)
    {
        return commAccountMapper.updateCommAccount(commAccount);
    }

    /**
     * 批量删除往来账目
     * 
     * @param ids 需要删除的往来账目主键
     * @return 结果
     */
    @Override
    public int deleteCommAccountByIds(String ids)
    {
        return commAccountMapper.deleteCommAccountByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除往来账目信息
     * 
     * @param id 往来账目主键
     * @return 结果
     */
    @Override
    public int deleteCommAccountById(Long id)
    {
        return commAccountMapper.deleteCommAccountById(id);
    }
}
