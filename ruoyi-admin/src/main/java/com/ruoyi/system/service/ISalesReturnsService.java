package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.SalesReturns;

/**
 * 销售退货Service接口
 * 
 * @author bin
 * @date 2024-01-11
 */
public interface ISalesReturnsService 
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
     * 批量删除销售退货
     * 
     * @param ids 需要删除的销售退货主键集合
     * @return 结果
     */
    public int deleteSalesReturnsByIds(String ids);

    /**
     * 删除销售退货信息
     * 
     * @param id 销售退货主键
     * @return 结果
     */
    public int deleteSalesReturnsById(Long id);
}
