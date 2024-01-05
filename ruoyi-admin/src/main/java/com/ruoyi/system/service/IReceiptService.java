package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Receipt;

/**
 * 收款单Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IReceiptService 
{
    /**
     * 查询收款单
     * 
     * @param id 收款单主键
     * @return 收款单
     */
    public Receipt selectReceiptById(Long id);

    /**
     * 查询收款单列表
     * 
     * @param receipt 收款单
     * @return 收款单集合
     */
    public List<Receipt> selectReceiptList(Receipt receipt);

    /**
     * 新增收款单
     * 
     * @param receipt 收款单
     * @return 结果
     */
    public int insertReceipt(Receipt receipt);

    /**
     * 修改收款单
     * 
     * @param receipt 收款单
     * @return 结果
     */
    public int updateReceipt(Receipt receipt);

    /**
     * 批量删除收款单
     * 
     * @param ids 需要删除的收款单主键集合
     * @return 结果
     */
    public int deleteReceiptByIds(String ids);

    /**
     * 删除收款单信息
     * 
     * @param id 收款单主键
     * @return 结果
     */
    public int deleteReceiptById(Long id);
}
