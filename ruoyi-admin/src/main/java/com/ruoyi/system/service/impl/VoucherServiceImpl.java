package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VoucherMapper;
import com.ruoyi.system.domain.Voucher;
import com.ruoyi.system.service.IVoucherService;
import com.ruoyi.common.core.text.Convert;

/**
 * 凭证Service业务层处理
 * 
 * @author bin
 * @date 2024-01-12
 */
@Service
public class VoucherServiceImpl implements IVoucherService 
{
    @Autowired
    private VoucherMapper voucherMapper;

    /**
     * 查询凭证
     * 
     * @param id 凭证主键
     * @return 凭证
     */
    @Override
    public Voucher selectVoucherById(Long id)
    {
        return voucherMapper.selectVoucherById(id);
    }

    /**
     * 查询凭证列表
     * 
     * @param voucher 凭证
     * @return 凭证
     */
    @Override
    public List<Voucher> selectVoucherList(Voucher voucher)
    {
        return voucherMapper.selectVoucherList(voucher);
    }

    /**
     * 新增凭证
     * 
     * @param voucher 凭证
     * @return 结果
     */
    @Override
    public int insertVoucher(Voucher voucher)
    {
        return voucherMapper.insertVoucher(voucher);
    }

    /**
     * 修改凭证
     * 
     * @param voucher 凭证
     * @return 结果
     */
    @Override
    public int updateVoucher(Voucher voucher)
    {
        return voucherMapper.updateVoucher(voucher);
    }

    /**
     * 批量删除凭证
     * 
     * @param ids 需要删除的凭证主键
     * @return 结果
     */
    @Override
    public int deleteVoucherByIds(String ids)
    {
        return voucherMapper.deleteVoucherByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除凭证信息
     * 
     * @param id 凭证主键
     * @return 结果
     */
    @Override
    public int deleteVoucherById(Long id)
    {
        return voucherMapper.deleteVoucherById(id);
    }
}
