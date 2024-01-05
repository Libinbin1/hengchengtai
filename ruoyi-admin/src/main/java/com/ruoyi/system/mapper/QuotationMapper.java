package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Quotation;

/**
 * 报价单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface QuotationMapper 
{
    /**
     * 查询报价单
     * 
     * @param id 报价单主键
     * @return 报价单
     */
    public Quotation selectQuotationById(Long id);

    /**
     * 查询报价单列表
     * 
     * @param quotation 报价单
     * @return 报价单集合
     */
    public List<Quotation> selectQuotationList(Quotation quotation);

    /**
     * 新增报价单
     * 
     * @param quotation 报价单
     * @return 结果
     */
    public int insertQuotation(Quotation quotation);

    /**
     * 修改报价单
     * 
     * @param quotation 报价单
     * @return 结果
     */
    public int updateQuotation(Quotation quotation);

    /**
     * 删除报价单
     * 
     * @param id 报价单主键
     * @return 结果
     */
    public int deleteQuotationById(Long id);

    /**
     * 批量删除报价单
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQuotationByIds(String[] ids);
}
