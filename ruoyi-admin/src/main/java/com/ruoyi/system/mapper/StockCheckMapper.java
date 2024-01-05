package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.StockCheck;

/**
 * 库存盘点Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface StockCheckMapper 
{
    /**
     * 查询库存盘点
     * 
     * @param id 库存盘点主键
     * @return 库存盘点
     */
    public StockCheck selectStockCheckById(Long id);

    /**
     * 查询库存盘点列表
     * 
     * @param stockCheck 库存盘点
     * @return 库存盘点集合
     */
    public List<StockCheck> selectStockCheckList(StockCheck stockCheck);

    /**
     * 新增库存盘点
     * 
     * @param stockCheck 库存盘点
     * @return 结果
     */
    public int insertStockCheck(StockCheck stockCheck);

    /**
     * 修改库存盘点
     * 
     * @param stockCheck 库存盘点
     * @return 结果
     */
    public int updateStockCheck(StockCheck stockCheck);

    /**
     * 删除库存盘点
     * 
     * @param id 库存盘点主键
     * @return 结果
     */
    public int deleteStockCheckById(Long id);

    /**
     * 批量删除库存盘点
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteStockCheckByIds(String[] ids);
}
