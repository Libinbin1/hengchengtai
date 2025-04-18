package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.RequInvo;

/**
 * 发票申请单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface RequInvoMapper 
{
    /**
     * 查询发票申请单
     * 
     * @param id 发票申请单主键
     * @return 发票申请单
     */
    public RequInvo selectRequInvoById(Long id);

    /**
     * 查询发票申请单列表
     * 
     * @param requInvo 发票申请单
     * @return 发票申请单集合
     */
    public List<RequInvo> selectRequInvoList(RequInvo requInvo);

    /**
     * 新增发票申请单
     * 
     * @param requInvo 发票申请单
     * @return 结果
     */
    public int insertRequInvo(RequInvo requInvo);

    /**
     * 修改发票申请单
     * 
     * @param requInvo 发票申请单
     * @return 结果
     */
    public int updateRequInvo(RequInvo requInvo);

    /**
     * 删除发票申请单
     * 
     * @param id 发票申请单主键
     * @return 结果
     */
    public int deleteRequInvoById(Long id);

    /**
     * 批量删除发票申请单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRequInvoByIds(String[] ids);
}
