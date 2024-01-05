package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PurchaseReceiptMapper;
import com.ruoyi.system.domain.PurchaseReceipt;
import com.ruoyi.system.service.IPurchaseReceiptService;
import com.ruoyi.common.core.text.Convert;

/**
 * 采购入库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class PurchaseReceiptServiceImpl implements IPurchaseReceiptService 
{
    @Autowired
    private PurchaseReceiptMapper purchaseReceiptMapper;

    /**
     * 查询采购入库
     * 
     * @param id 采购入库主键
     * @return 采购入库
     */
    @Override
    public PurchaseReceipt selectPurchaseReceiptById(Long id)
    {
        return purchaseReceiptMapper.selectPurchaseReceiptById(id);
    }

    /**
     * 查询采购入库列表
     * 
     * @param purchaseReceipt 采购入库
     * @return 采购入库
     */
    @Override
    public List<PurchaseReceipt> selectPurchaseReceiptList(PurchaseReceipt purchaseReceipt)
    {
        return purchaseReceiptMapper.selectPurchaseReceiptList(purchaseReceipt);
    }

    /**
     * 新增采购入库
     * 
     * @param purchaseReceipt 采购入库
     * @return 结果
     */
    @Override
    public int insertPurchaseReceipt(PurchaseReceipt purchaseReceipt)
    {
        return purchaseReceiptMapper.insertPurchaseReceipt(purchaseReceipt);
    }

    /**
     * 修改采购入库
     * 
     * @param purchaseReceipt 采购入库
     * @return 结果
     */
    @Override
    public int updatePurchaseReceipt(PurchaseReceipt purchaseReceipt)
    {
        return purchaseReceiptMapper.updatePurchaseReceipt(purchaseReceipt);
    }

    /**
     * 批量删除采购入库
     * 
     * @param ids 需要删除的采购入库主键
     * @return 结果
     */
    @Override
    public int deletePurchaseReceiptByIds(String ids)
    {
        return purchaseReceiptMapper.deletePurchaseReceiptByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除采购入库信息
     * 
     * @param id 采购入库主键
     * @return 结果
     */
    @Override
    public int deletePurchaseReceiptById(Long id)
    {
        return purchaseReceiptMapper.deletePurchaseReceiptById(id);
    }
}
