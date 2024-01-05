package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Saleorder;

/**
 * 销售订单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface SaleorderMapper 
{
    /**
     * 查询销售订单
     * 
     * @param id 销售订单主键
     * @return 销售订单
     */
    public Saleorder selectSaleorderById(Long id);

    /**
     * 查询销售订单列表
     * 
     * @param saleorder 销售订单
     * @return 销售订单集合
     */
    public List<Saleorder> selectSaleorderList(Saleorder saleorder);

    /**
     * 新增销售订单
     * 
     * @param saleorder 销售订单
     * @return 结果
     */
    public int insertSaleorder(Saleorder saleorder);

    /**
     * 修改销售订单
     * 
     * @param saleorder 销售订单
     * @return 结果
     */
    public int updateSaleorder(Saleorder saleorder);

    /**
     * 删除销售订单
     * 
     * @param id 销售订单主键
     * @return 结果
     */
    public int deleteSaleorderById(Long id);

    /**
     * 批量删除销售订单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSaleorderByIds(String[] ids);
}
