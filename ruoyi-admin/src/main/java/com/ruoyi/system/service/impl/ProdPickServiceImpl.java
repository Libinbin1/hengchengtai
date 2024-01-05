package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProdPickMapper;
import com.ruoyi.system.domain.ProdPick;
import com.ruoyi.system.service.IProdPickService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产领料Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class ProdPickServiceImpl implements IProdPickService 
{
    @Autowired
    private ProdPickMapper prodPickMapper;

    /**
     * 查询生产领料
     * 
     * @param id 生产领料主键
     * @return 生产领料
     */
    @Override
    public ProdPick selectProdPickById(Long id)
    {
        return prodPickMapper.selectProdPickById(id);
    }

    /**
     * 查询生产领料列表
     * 
     * @param prodPick 生产领料
     * @return 生产领料
     */
    @Override
    public List<ProdPick> selectProdPickList(ProdPick prodPick)
    {
        return prodPickMapper.selectProdPickList(prodPick);
    }

    /**
     * 新增生产领料
     * 
     * @param prodPick 生产领料
     * @return 结果
     */
    @Override
    public int insertProdPick(ProdPick prodPick)
    {
        return prodPickMapper.insertProdPick(prodPick);
    }

    /**
     * 修改生产领料
     * 
     * @param prodPick 生产领料
     * @return 结果
     */
    @Override
    public int updateProdPick(ProdPick prodPick)
    {
        return prodPickMapper.updateProdPick(prodPick);
    }

    /**
     * 批量删除生产领料
     * 
     * @param ids 需要删除的生产领料主键
     * @return 结果
     */
    @Override
    public int deleteProdPickByIds(String ids)
    {
        return prodPickMapper.deleteProdPickByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产领料信息
     * 
     * @param id 生产领料主键
     * @return 结果
     */
    @Override
    public int deleteProdPickById(Long id)
    {
        return prodPickMapper.deleteProdPickById(id);
    }
}
