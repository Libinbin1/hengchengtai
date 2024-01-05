package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProdOrderMapper;
import com.ruoyi.system.domain.ProdOrder;
import com.ruoyi.system.service.IProdOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产工单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class ProdOrderServiceImpl implements IProdOrderService 
{
    @Autowired
    private ProdOrderMapper prodOrderMapper;

    /**
     * 查询生产工单
     * 
     * @param id 生产工单主键
     * @return 生产工单
     */
    @Override
    public ProdOrder selectProdOrderById(Long id)
    {
        return prodOrderMapper.selectProdOrderById(id);
    }

    /**
     * 查询生产工单列表
     * 
     * @param prodOrder 生产工单
     * @return 生产工单
     */
    @Override
    public List<ProdOrder> selectProdOrderList(ProdOrder prodOrder)
    {
        return prodOrderMapper.selectProdOrderList(prodOrder);
    }

    /**
     * 新增生产工单
     * 
     * @param prodOrder 生产工单
     * @return 结果
     */
    @Override
    public int insertProdOrder(ProdOrder prodOrder)
    {
        return prodOrderMapper.insertProdOrder(prodOrder);
    }

    /**
     * 修改生产工单
     * 
     * @param prodOrder 生产工单
     * @return 结果
     */
    @Override
    public int updateProdOrder(ProdOrder prodOrder)
    {
        return prodOrderMapper.updateProdOrder(prodOrder);
    }

    /**
     * 批量删除生产工单
     * 
     * @param ids 需要删除的生产工单主键
     * @return 结果
     */
    @Override
    public int deleteProdOrderByIds(String ids)
    {
        return prodOrderMapper.deleteProdOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产工单信息
     * 
     * @param id 生产工单主键
     * @return 结果
     */
    @Override
    public int deleteProdOrderById(Long id)
    {
        return prodOrderMapper.deleteProdOrderById(id);
    }
}
