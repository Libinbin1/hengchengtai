package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ProdOrder;

/**
 * 生产工单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface ProdOrderMapper 
{
    /**
     * 查询生产工单
     * 
     * @param id 生产工单主键
     * @return 生产工单
     */
    public ProdOrder selectProdOrderById(Long id);

    /**
     * 查询生产工单列表
     * 
     * @param prodOrder 生产工单
     * @return 生产工单集合
     */
    public List<ProdOrder> selectProdOrderList(ProdOrder prodOrder);

    /**
     * 新增生产工单
     * 
     * @param prodOrder 生产工单
     * @return 结果
     */
    public int insertProdOrder(ProdOrder prodOrder);

    /**
     * 修改生产工单
     * 
     * @param prodOrder 生产工单
     * @return 结果
     */
    public int updateProdOrder(ProdOrder prodOrder);

    /**
     * 删除生产工单
     * 
     * @param id 生产工单主键
     * @return 结果
     */
    public int deleteProdOrderById(Long id);

    /**
     * 批量删除生产工单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProdOrderByIds(String[] ids);
}
