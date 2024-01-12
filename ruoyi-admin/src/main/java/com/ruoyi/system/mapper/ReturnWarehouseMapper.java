package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ReturnWarehouse;

/**
 * 生产退库Mapper接口
 * 
 * @author bin
 * @date 2024-01-11
 */
public interface ReturnWarehouseMapper 
{
    /**
     * 查询生产退库
     * 
     * @param id 生产退库主键
     * @return 生产退库
     */
    public ReturnWarehouse selectReturnWarehouseById(Long id);

    /**
     * 查询生产退库列表
     * 
     * @param returnWarehouse 生产退库
     * @return 生产退库集合
     */
    public List<ReturnWarehouse> selectReturnWarehouseList(ReturnWarehouse returnWarehouse);

    /**
     * 新增生产退库
     * 
     * @param returnWarehouse 生产退库
     * @return 结果
     */
    public int insertReturnWarehouse(ReturnWarehouse returnWarehouse);

    /**
     * 修改生产退库
     * 
     * @param returnWarehouse 生产退库
     * @return 结果
     */
    public int updateReturnWarehouse(ReturnWarehouse returnWarehouse);

    /**
     * 删除生产退库
     * 
     * @param id 生产退库主键
     * @return 结果
     */
    public int deleteReturnWarehouseById(Long id);

    /**
     * 批量删除生产退库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReturnWarehouseByIds(String[] ids);
}
