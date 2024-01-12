package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.SalesReturnsMapper;
import com.ruoyi.system.domain.SalesReturns;
import com.ruoyi.system.service.ISalesReturnsService;
import com.ruoyi.common.core.text.Convert;

/**
 * 销售退货Service业务层处理
 * 
 * @author bin
 * @date 2024-01-11
 */
@Service
public class SalesReturnsServiceImpl implements ISalesReturnsService 
{
    @Autowired
    private SalesReturnsMapper salesReturnsMapper;

    /**
     * 查询销售退货
     * 
     * @param id 销售退货主键
     * @return 销售退货
     */
    @Override
    public SalesReturns selectSalesReturnsById(Long id)
    {
        return salesReturnsMapper.selectSalesReturnsById(id);
    }

    /**
     * 查询销售退货列表
     * 
     * @param salesReturns 销售退货
     * @return 销售退货
     */
    @Override
    public List<SalesReturns> selectSalesReturnsList(SalesReturns salesReturns)
    {
        return salesReturnsMapper.selectSalesReturnsList(salesReturns);
    }

    /**
     * 新增销售退货
     * 
     * @param salesReturns 销售退货
     * @return 结果
     */
    @Override
    public int insertSalesReturns(SalesReturns salesReturns)
    {
        return salesReturnsMapper.insertSalesReturns(salesReturns);
    }

    /**
     * 修改销售退货
     * 
     * @param salesReturns 销售退货
     * @return 结果
     */
    @Override
    public int updateSalesReturns(SalesReturns salesReturns)
    {
        return salesReturnsMapper.updateSalesReturns(salesReturns);
    }

    /**
     * 批量删除销售退货
     * 
     * @param ids 需要删除的销售退货主键
     * @return 结果
     */
    @Override
    public int deleteSalesReturnsByIds(String ids)
    {
        return salesReturnsMapper.deleteSalesReturnsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除销售退货信息
     * 
     * @param id 销售退货主键
     * @return 结果
     */
    @Override
    public int deleteSalesReturnsById(Long id)
    {
        return salesReturnsMapper.deleteSalesReturnsById(id);
    }
}
