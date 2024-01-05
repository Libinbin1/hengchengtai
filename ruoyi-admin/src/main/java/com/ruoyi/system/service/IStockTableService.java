package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.StockTable;

/**
 * 库存Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IStockTableService 
{
    /**
     * 查询库存
     * 
     * @param id 库存主键
     * @return 库存
     */
    public StockTable selectStockTableById(Long id);

    /**
     * 查询库存列表
     * 
     * @param stockTable 库存
     * @return 库存集合
     */
    public List<StockTable> selectStockTableList(StockTable stockTable);

    /**
     * 新增库存
     * 
     * @param stockTable 库存
     * @return 结果
     */
    public int insertStockTable(StockTable stockTable);

    /**
     * 修改库存
     * 
     * @param stockTable 库存
     * @return 结果
     */
    public int updateStockTable(StockTable stockTable);

    /**
     * 批量删除库存
     * 
     * @param ids 需要删除的库存主键集合
     * @return 结果
     */
    public int deleteStockTableByIds(String ids);

    /**
     * 删除库存信息
     * 
     * @param id 库存主键
     * @return 结果
     */
    public int deleteStockTableById(Long id);
}
