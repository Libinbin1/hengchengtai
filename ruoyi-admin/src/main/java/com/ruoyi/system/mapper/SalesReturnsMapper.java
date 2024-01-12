package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.SalesReturns;

/**
 * 销售退货Mapper接口
 * 
 * @author bin
 * @date 2024-01-11
 */
public interface SalesReturnsMapper 
{
    /**
     * 查询销售退货
     * 
     * @param id 销售退货主键
     * @return 销售退货
     */
    public SalesReturns selectSalesReturnsById(Long id);

    /**
     * 查询销售退货列表
     * 
     * @param salesReturns 销售退货
     * @return 销售退货集合
     */
    public List<SalesReturns> selectSalesReturnsList(SalesReturns salesReturns);

    /**
     * 新增销售退货
     * 
     * @param salesReturns 销售退货
     * @return 结果
     */
    public int insertSalesReturns(SalesReturns salesReturns);

    /**
     * 修改销售退货
     * 
     * @param salesReturns 销售退货
     * @return 结果
     */
    public int updateSalesReturns(SalesReturns salesReturns);

    /**
     * 删除销售退货
     * 
     * @param id 销售退货主键
     * @return 结果
     */
    public int deleteSalesReturnsById(Long id);

    /**
     * 批量删除销售退货
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSalesReturnsByIds(String[] ids);
}
