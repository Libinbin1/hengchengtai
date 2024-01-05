package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.QuotationMapper;
import com.ruoyi.system.domain.Quotation;
import com.ruoyi.system.service.IQuotationService;
import com.ruoyi.common.core.text.Convert;

/**
 * 报价单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class QuotationServiceImpl implements IQuotationService 
{
    @Autowired
    private QuotationMapper quotationMapper;

    /**
     * 查询报价单
     * 
     * @param id 报价单主键
     * @return 报价单
     */
    @Override
    public Quotation selectQuotationById(Long id)
    {
        return quotationMapper.selectQuotationById(id);
    }

    /**
     * 查询报价单列表
     * 
     * @param quotation 报价单
     * @return 报价单
     */
    @Override
    public List<Quotation> selectQuotationList(Quotation quotation)
    {
        return quotationMapper.selectQuotationList(quotation);
    }

    /**
     * 新增报价单
     * 
     * @param quotation 报价单
     * @return 结果
     */
    @Override
    public int insertQuotation(Quotation quotation)
    {
        return quotationMapper.insertQuotation(quotation);
    }

    /**
     * 修改报价单
     * 
     * @param quotation 报价单
     * @return 结果
     */
    @Override
    public int updateQuotation(Quotation quotation)
    {
        return quotationMapper.updateQuotation(quotation);
    }

    /**
     * 批量删除报价单
     * 
     * @param ids 需要删除的报价单主键
     * @return 结果
     */
    @Override
    public int deleteQuotationByIds(String ids)
    {
        return quotationMapper.deleteQuotationByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除报价单信息
     * 
     * @param id 报价单主键
     * @return 结果
     */
    @Override
    public int deleteQuotationById(Long id)
    {
        return quotationMapper.deleteQuotationById(id);
    }
}
