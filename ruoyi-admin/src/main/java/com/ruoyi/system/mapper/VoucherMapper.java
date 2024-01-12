package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Voucher;

/**
 * 凭证Mapper接口
 * 
 * @author bin
 * @date 2024-01-12
 */
public interface VoucherMapper 
{
    /**
     * 查询凭证
     * 
     * @param id 凭证主键
     * @return 凭证
     */
    public Voucher selectVoucherById(Long id);

    /**
     * 查询凭证列表
     * 
     * @param voucher 凭证
     * @return 凭证集合
     */
    public List<Voucher> selectVoucherList(Voucher voucher);

    /**
     * 新增凭证
     * 
     * @param voucher 凭证
     * @return 结果
     */
    public int insertVoucher(Voucher voucher);

    /**
     * 修改凭证
     * 
     * @param voucher 凭证
     * @return 结果
     */
    public int updateVoucher(Voucher voucher);

    /**
     * 删除凭证
     * 
     * @param id 凭证主键
     * @return 结果
     */
    public int deleteVoucherById(Long id);

    /**
     * 批量删除凭证
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVoucherByIds(String[] ids);
}
