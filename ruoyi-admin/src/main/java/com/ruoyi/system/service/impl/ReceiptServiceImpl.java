package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ReceiptMapper;
import com.ruoyi.system.domain.Receipt;
import com.ruoyi.system.service.IReceiptService;
import com.ruoyi.common.core.text.Convert;

/**
 * 收款单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class ReceiptServiceImpl implements IReceiptService 
{
    @Autowired
    private ReceiptMapper receiptMapper;

    /**
     * 查询收款单
     * 
     * @param id 收款单主键
     * @return 收款单
     */
    @Override
    public Receipt selectReceiptById(Long id)
    {
        return receiptMapper.selectReceiptById(id);
    }

    /**
     * 查询收款单列表
     * 
     * @param receipt 收款单
     * @return 收款单
     */
    @Override
    public List<Receipt> selectReceiptList(Receipt receipt)
    {
        return receiptMapper.selectReceiptList(receipt);
    }

    /**
     * 新增收款单
     * 
     * @param receipt 收款单
     * @return 结果
     */
    @Override
    public int insertReceipt(Receipt receipt)
    {
        return receiptMapper.insertReceipt(receipt);
    }

    /**
     * 修改收款单
     * 
     * @param receipt 收款单
     * @return 结果
     */
    @Override
    public int updateReceipt(Receipt receipt)
    {
        return receiptMapper.updateReceipt(receipt);
    }

    /**
     * 批量删除收款单
     * 
     * @param ids 需要删除的收款单主键
     * @return 结果
     */
    @Override
    public int deleteReceiptByIds(String ids)
    {
        return receiptMapper.deleteReceiptByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除收款单信息
     * 
     * @param id 收款单主键
     * @return 结果
     */
    @Override
    public int deleteReceiptById(Long id)
    {
        return receiptMapper.deleteReceiptById(id);
    }
}
