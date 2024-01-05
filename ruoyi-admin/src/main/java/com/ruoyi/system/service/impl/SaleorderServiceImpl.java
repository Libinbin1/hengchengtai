package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SaleorderMapper;
import com.ruoyi.system.domain.Saleorder;
import com.ruoyi.system.service.ISaleorderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售订单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class SaleorderServiceImpl implements ISaleorderService 
{
    @Autowired
    private SaleorderMapper saleorderMapper;

    /**
     * 查询销售订单
     * 
     * @param id 销售订单主键
     * @return 销售订单
     */
    @Override
    public Saleorder selectSaleorderById(Long id)
    {
        return saleorderMapper.selectSaleorderById(id);
    }

    /**
     * 查询销售订单列表
     * 
     * @param saleorder 销售订单
     * @return 销售订单
     */
    @Override
    public List<Saleorder> selectSaleorderList(Saleorder saleorder)
    {
        return saleorderMapper.selectSaleorderList(saleorder);
    }

    /**
     * 新增销售订单
     * 
     * @param saleorder 销售订单
     * @return 结果
     */
    @Override
    public int insertSaleorder(Saleorder saleorder)
    {
        return saleorderMapper.insertSaleorder(saleorder);
    }

    /**
     * 修改销售订单
     * 
     * @param saleorder 销售订单
     * @return 结果
     */
    @Override
    public int updateSaleorder(Saleorder saleorder)
    {
        return saleorderMapper.updateSaleorder(saleorder);
    }

    /**
     * 批量删除销售订单
     * 
     * @param ids 需要删除的销售订单主键
     * @return 结果
     */
    @Override
    public int deleteSaleorderByIds(String ids)
    {
        return saleorderMapper.deleteSaleorderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售订单信息
     * 
     * @param id 销售订单主键
     * @return 结果
     */
    @Override
    public int deleteSaleorderById(Long id)
    {
        return saleorderMapper.deleteSaleorderById(id);
    }
}
