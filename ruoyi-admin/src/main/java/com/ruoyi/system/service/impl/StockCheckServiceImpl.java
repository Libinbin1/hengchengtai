package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StockCheckMapper;
import com.ruoyi.system.domain.StockCheck;
import com.ruoyi.system.service.IStockCheckService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存盘点Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class StockCheckServiceImpl implements IStockCheckService 
{
    @Autowired
    private StockCheckMapper stockCheckMapper;

    /**
     * 查询库存盘点
     * 
     * @param id 库存盘点主键
     * @return 库存盘点
     */
    @Override
    public StockCheck selectStockCheckById(Long id)
    {
        return stockCheckMapper.selectStockCheckById(id);
    }

    /**
     * 查询库存盘点列表
     * 
     * @param stockCheck 库存盘点
     * @return 库存盘点
     */
    @Override
    public List<StockCheck> selectStockCheckList(StockCheck stockCheck)
    {
        return stockCheckMapper.selectStockCheckList(stockCheck);
    }

    /**
     * 新增库存盘点
     * 
     * @param stockCheck 库存盘点
     * @return 结果
     */
    @Override
    public int insertStockCheck(StockCheck stockCheck)
    {
        return stockCheckMapper.insertStockCheck(stockCheck);
    }

    /**
     * 修改库存盘点
     * 
     * @param stockCheck 库存盘点
     * @return 结果
     */
    @Override
    public int updateStockCheck(StockCheck stockCheck)
    {
        return stockCheckMapper.updateStockCheck(stockCheck);
    }

    /**
     * 批量删除库存盘点
     * 
     * @param ids 需要删除的库存盘点主键
     * @return 结果
     */
    @Override
    public int deleteStockCheckByIds(String ids)
    {
        return stockCheckMapper.deleteStockCheckByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存盘点信息
     * 
     * @param id 库存盘点主键
     * @return 结果
     */
    @Override
    public int deleteStockCheckById(Long id)
    {
        return stockCheckMapper.deleteStockCheckById(id);
    }
}
