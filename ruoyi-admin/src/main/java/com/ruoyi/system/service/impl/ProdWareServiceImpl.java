package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProdWareMapper;
import com.ruoyi.system.domain.ProdWare;
import com.ruoyi.system.service.IProdWareService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产入库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class ProdWareServiceImpl implements IProdWareService 
{
    @Autowired
    private ProdWareMapper prodWareMapper;

    /**
     * 查询生产入库
     * 
     * @param id 生产入库主键
     * @return 生产入库
     */
    @Override
    public ProdWare selectProdWareById(Long id)
    {
        return prodWareMapper.selectProdWareById(id);
    }

    /**
     * 查询生产入库列表
     * 
     * @param prodWare 生产入库
     * @return 生产入库
     */
    @Override
    public List<ProdWare> selectProdWareList(ProdWare prodWare)
    {
        return prodWareMapper.selectProdWareList(prodWare);
    }

    /**
     * 新增生产入库
     * 
     * @param prodWare 生产入库
     * @return 结果
     */
    @Override
    public int insertProdWare(ProdWare prodWare)
    {
        return prodWareMapper.insertProdWare(prodWare);
    }

    /**
     * 修改生产入库
     * 
     * @param prodWare 生产入库
     * @return 结果
     */
    @Override
    public int updateProdWare(ProdWare prodWare)
    {
        return prodWareMapper.updateProdWare(prodWare);
    }

    /**
     * 批量删除生产入库
     * 
     * @param ids 需要删除的生产入库主键
     * @return 结果
     */
    @Override
    public int deleteProdWareByIds(String ids)
    {
        return prodWareMapper.deleteProdWareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产入库信息
     * 
     * @param id 生产入库主键
     * @return 结果
     */
    @Override
    public int deleteProdWareById(Long id)
    {
        return prodWareMapper.deleteProdWareById(id);
    }
}
