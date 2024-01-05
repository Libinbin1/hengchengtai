package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OqcMapper;
import com.ruoyi.system.domain.Oqc;
import com.ruoyi.system.service.IOqcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出库检验Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class OqcServiceImpl implements IOqcService 
{
    @Autowired
    private OqcMapper oqcMapper;

    /**
     * 查询出库检验
     * 
     * @param id 出库检验主键
     * @return 出库检验
     */
    @Override
    public Oqc selectOqcById(Long id)
    {
        return oqcMapper.selectOqcById(id);
    }

    /**
     * 查询出库检验列表
     * 
     * @param oqc 出库检验
     * @return 出库检验
     */
    @Override
    public List<Oqc> selectOqcList(Oqc oqc)
    {
        return oqcMapper.selectOqcList(oqc);
    }

    /**
     * 新增出库检验
     * 
     * @param oqc 出库检验
     * @return 结果
     */
    @Override
    public int insertOqc(Oqc oqc)
    {
        return oqcMapper.insertOqc(oqc);
    }

    /**
     * 修改出库检验
     * 
     * @param oqc 出库检验
     * @return 结果
     */
    @Override
    public int updateOqc(Oqc oqc)
    {
        return oqcMapper.updateOqc(oqc);
    }

    /**
     * 批量删除出库检验
     * 
     * @param ids 需要删除的出库检验主键
     * @return 结果
     */
    @Override
    public int deleteOqcByIds(String ids)
    {
        return oqcMapper.deleteOqcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出库检验信息
     * 
     * @param id 出库检验主键
     * @return 结果
     */
    @Override
    public int deleteOqcById(Long id)
    {
        return oqcMapper.deleteOqcById(id);
    }
}
