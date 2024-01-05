package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.PaymentMapper;
import com.ruoyi.system.domain.Payment;
import com.ruoyi.system.service.IPaymentService;
import com.ruoyi.common.core.text.Convert;

/**
 * 付款Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class PaymentServiceImpl implements IPaymentService 
{
    @Autowired
    private PaymentMapper paymentMapper;

    /**
     * 查询付款
     * 
     * @param id 付款主键
     * @return 付款
     */
    @Override
    public Payment selectPaymentById(Long id)
    {
        return paymentMapper.selectPaymentById(id);
    }

    /**
     * 查询付款列表
     * 
     * @param payment 付款
     * @return 付款
     */
    @Override
    public List<Payment> selectPaymentList(Payment payment)
    {
        return paymentMapper.selectPaymentList(payment);
    }

    /**
     * 新增付款
     * 
     * @param payment 付款
     * @return 结果
     */
    @Override
    public int insertPayment(Payment payment)
    {
        return paymentMapper.insertPayment(payment);
    }

    /**
     * 修改付款
     * 
     * @param payment 付款
     * @return 结果
     */
    @Override
    public int updatePayment(Payment payment)
    {
        return paymentMapper.updatePayment(payment);
    }

    /**
     * 批量删除付款
     * 
     * @param ids 需要删除的付款主键
     * @return 结果
     */
    @Override
    public int deletePaymentByIds(String ids)
    {
        return paymentMapper.deletePaymentByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除付款信息
     * 
     * @param id 付款主键
     * @return 结果
     */
    @Override
    public int deletePaymentById(Long id)
    {
        return paymentMapper.deletePaymentById(id);
    }
}
