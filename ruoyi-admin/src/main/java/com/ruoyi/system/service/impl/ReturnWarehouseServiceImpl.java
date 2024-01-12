package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ReturnWarehouseMapper;
import com.ruoyi.system.domain.ReturnWarehouse;
import com.ruoyi.system.service.IReturnWarehouseService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产退库Service业务层处理
 * 
 * @author bin
 * @date 2024-01-11
 */
@Service
public class ReturnWarehouseServiceImpl implements IReturnWarehouseService 
{
    @Autowired
    private ReturnWarehouseMapper returnWarehouseMapper;

    /**
     * 查询生产退库
     * 
     * @param id 生产退库主键
     * @return 生产退库
     */
    @Override
    public ReturnWarehouse selectReturnWarehouseById(Long id)
    {
        return returnWarehouseMapper.selectReturnWarehouseById(id);
    }

    /**
     * 查询生产退库列表
     * 
     * @param returnWarehouse 生产退库
     * @return 生产退库
     */
    @Override
    public List<ReturnWarehouse> selectReturnWarehouseList(ReturnWarehouse returnWarehouse)
    {
        return returnWarehouseMapper.selectReturnWarehouseList(returnWarehouse);
    }

    /**
     * 新增生产退库
     * 
     * @param returnWarehouse 生产退库
     * @return 结果
     */
    @Override
    public int insertReturnWarehouse(ReturnWarehouse returnWarehouse)
    {
        return returnWarehouseMapper.insertReturnWarehouse(returnWarehouse);
    }

    /**
     * 修改生产退库
     * 
     * @param returnWarehouse 生产退库
     * @return 结果
     */
    @Override
    public int updateReturnWarehouse(ReturnWarehouse returnWarehouse)
    {
        return returnWarehouseMapper.updateReturnWarehouse(returnWarehouse);
    }

    /**
     * 批量删除生产退库
     * 
     * @param ids 需要删除的生产退库主键
     * @return 结果
     */
    @Override
    public int deleteReturnWarehouseByIds(String ids)
    {
        return returnWarehouseMapper.deleteReturnWarehouseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产退库信息
     * 
     * @param id 生产退库主键
     * @return 结果
     */
    @Override
    public int deleteReturnWarehouseById(Long id)
    {
        return returnWarehouseMapper.deleteReturnWarehouseById(id);
    }
}
