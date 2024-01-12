package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.CommAccount;

/**
 * 往来账目Mapper接口
 * 
 * @author bin
 * @date 2024-01-12
 */
public interface CommAccountMapper 
{
    /**
     * 查询往来账目
     * 
     * @param id 往来账目主键
     * @return 往来账目
     */
    public CommAccount selectCommAccountById(Long id);

    /**
     * 查询往来账目列表
     * 
     * @param commAccount 往来账目
     * @return 往来账目集合
     */
    public List<CommAccount> selectCommAccountList(CommAccount commAccount);

    /**
     * 新增往来账目
     * 
     * @param commAccount 往来账目
     * @return 结果
     */
    public int insertCommAccount(CommAccount commAccount);

    /**
     * 修改往来账目
     * 
     * @param commAccount 往来账目
     * @return 结果
     */
    public int updateCommAccount(CommAccount commAccount);

    /**
     * 删除往来账目
     * 
     * @param id 往来账目主键
     * @return 结果
     */
    public int deleteCommAccountById(Long id);

    /**
     * 批量删除往来账目
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCommAccountByIds(String[] ids);
}
