package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Payment;

/**
 * 付款Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface PaymentMapper 
{
    /**
     * 查询付款
     * 
     * @param id 付款主键
     * @return 付款
     */
    public Payment selectPaymentById(Long id);

    /**
     * 查询付款列表
     * 
     * @param payment 付款
     * @return 付款集合
     */
    public List<Payment> selectPaymentList(Payment payment);

    /**
     * 新增付款
     * 
     * @param payment 付款
     * @return 结果
     */
    public int insertPayment(Payment payment);

    /**
     * 修改付款
     * 
     * @param payment 付款
     * @return 结果
     */
    public int updatePayment(Payment payment);

    /**
     * 删除付款
     * 
     * @param id 付款主键
     * @return 结果
     */
    public int deletePaymentById(Long id);

    /**
     * 批量删除付款
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePaymentByIds(String[] ids);
}
