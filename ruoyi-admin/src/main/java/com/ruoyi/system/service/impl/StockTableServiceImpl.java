package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.StockTableMapper;
import com.ruoyi.system.domain.StockTable;
import com.ruoyi.system.service.IStockTableService;
import com.ruoyi.common.core.text.Convert;

/**
 * 库存Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class StockTableServiceImpl implements IStockTableService 
{
    @Autowired
    private StockTableMapper stockTableMapper;

    /**
     * 查询库存
     * 
     * @param id 库存主键
     * @return 库存
     */
    @Override
    public StockTable selectStockTableById(Long id)
    {
        return stockTableMapper.selectStockTableById(id);
    }

    /**
     * 查询库存列表
     * 
     * @param stockTable 库存
     * @return 库存
     */
    @Override
    public List<StockTable> selectStockTableList(StockTable stockTable)
    {
        return stockTableMapper.selectStockTableList(stockTable);
    }

    /**
     * 新增库存
     * 
     * @param stockTable 库存
     * @return 结果
     */
    @Override
    public int insertStockTable(StockTable stockTable)
    {
        return stockTableMapper.insertStockTable(stockTable);
    }

    /**
     * 修改库存
     * 
     * @param stockTable 库存
     * @return 结果
     */
    @Override
    public int updateStockTable(StockTable stockTable)
    {
        return stockTableMapper.updateStockTable(stockTable);
    }

    /**
     * 批量删除库存
     * 
     * @param ids 需要删除的库存主键
     * @return 结果
     */
    @Override
    public int deleteStockTableByIds(String ids)
    {
        return stockTableMapper.deleteStockTableByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存信息
     * 
     * @param id 库存主键
     * @return 结果
     */
    @Override
    public int deleteStockTableById(Long id)
    {
        return stockTableMapper.deleteStockTableById(id);
    }
}
