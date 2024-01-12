package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SalesoutbOrder;

/**
 * 销售出库Mapper接口
 * 
 * @author bin
 * @date 2024-01-11
 */
public interface SalesoutbOrderMapper 
{
    /**
     * 查询销售出库
     * 
     * @param id 销售出库主键
     * @return 销售出库
     */
    public SalesoutbOrder selectSalesoutbOrderById(Long id);

    /**
     * 查询销售出库列表
     * 
     * @param salesoutbOrder 销售出库
     * @return 销售出库集合
     */
    public List<SalesoutbOrder> selectSalesoutbOrderList(SalesoutbOrder salesoutbOrder);

    /**
     * 新增销售出库
     * 
     * @param salesoutbOrder 销售出库
     * @return 结果
     */
    public int insertSalesoutbOrder(SalesoutbOrder salesoutbOrder);

    /**
     * 修改销售出库
     * 
     * @param salesoutbOrder 销售出库
     * @return 结果
     */
    public int updateSalesoutbOrder(SalesoutbOrder salesoutbOrder);

    /**
     * 删除销售出库
     * 
     * @param id 销售出库主键
     * @return 结果
     */
    public int deleteSalesoutbOrderById(Long id);

    /**
     * 批量删除销售出库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSalesoutbOrderByIds(String[] ids);
}
