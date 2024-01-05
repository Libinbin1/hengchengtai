package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FqcMapper;
import com.ruoyi.system.domain.Fqc;
import com.ruoyi.system.service.IFqcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 成品检验Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class FqcServiceImpl implements IFqcService 
{
    @Autowired
    private FqcMapper fqcMapper;

    /**
     * 查询成品检验
     * 
     * @param id 成品检验主键
     * @return 成品检验
     */
    @Override
    public Fqc selectFqcById(Long id)
    {
        return fqcMapper.selectFqcById(id);
    }

    /**
     * 查询成品检验列表
     * 
     * @param fqc 成品检验
     * @return 成品检验
     */
    @Override
    public List<Fqc> selectFqcList(Fqc fqc)
    {
        return fqcMapper.selectFqcList(fqc);
    }

    /**
     * 新增成品检验
     * 
     * @param fqc 成品检验
     * @return 结果
     */
    @Override
    public int insertFqc(Fqc fqc)
    {
        return fqcMapper.insertFqc(fqc);
    }

    /**
     * 修改成品检验
     * 
     * @param fqc 成品检验
     * @return 结果
     */
    @Override
    public int updateFqc(Fqc fqc)
    {
        return fqcMapper.updateFqc(fqc);
    }

    /**
     * 批量删除成品检验
     * 
     * @param ids 需要删除的成品检验主键
     * @return 结果
     */
    @Override
    public int deleteFqcByIds(String ids)
    {
        return fqcMapper.deleteFqcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除成品检验信息
     * 
     * @param id 成品检验主键
     * @return 结果
     */
    @Override
    public int deleteFqcById(Long id)
    {
        return fqcMapper.deleteFqcById(id);
    }
}
