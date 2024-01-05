package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SalesoutbOrderMapper;
import com.ruoyi.system.domain.SalesoutbOrder;
import com.ruoyi.system.service.ISalesoutbOrderService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售出库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class SalesoutbOrderServiceImpl implements ISalesoutbOrderService 
{
    @Autowired
    private SalesoutbOrderMapper salesoutbOrderMapper;

    /**
     * 查询销售出库
     * 
     * @param id 销售出库主键
     * @return 销售出库
     */
    @Override
    public SalesoutbOrder selectSalesoutbOrderById(Long id)
    {
        return salesoutbOrderMapper.selectSalesoutbOrderById(id);
    }

    /**
     * 查询销售出库列表
     * 
     * @param salesoutbOrder 销售出库
     * @return 销售出库
     */
    @Override
    public List<SalesoutbOrder> selectSalesoutbOrderList(SalesoutbOrder salesoutbOrder)
    {
        return salesoutbOrderMapper.selectSalesoutbOrderList(salesoutbOrder);
    }

    /**
     * 新增销售出库
     * 
     * @param salesoutbOrder 销售出库
     * @return 结果
     */
    @Override
    public int insertSalesoutbOrder(SalesoutbOrder salesoutbOrder)
    {
        return salesoutbOrderMapper.insertSalesoutbOrder(salesoutbOrder);
    }

    /**
     * 修改销售出库
     * 
     * @param salesoutbOrder 销售出库
     * @return 结果
     */
    @Override
    public int updateSalesoutbOrder(SalesoutbOrder salesoutbOrder)
    {
        return salesoutbOrderMapper.updateSalesoutbOrder(salesoutbOrder);
    }

    /**
     * 批量删除销售出库
     * 
     * @param ids 需要删除的销售出库主键
     * @return 结果
     */
    @Override
    public int deleteSalesoutbOrderByIds(String ids)
    {
        return salesoutbOrderMapper.deleteSalesoutbOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售出库信息
     * 
     * @param id 销售出库主键
     * @return 结果
     */
    @Override
    public int deleteSalesoutbOrderById(Long id)
    {
        return salesoutbOrderMapper.deleteSalesoutbOrderById(id);
    }
}
