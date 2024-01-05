package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ProdWare;

/**
 * 生产入库Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IProdWareService 
{
    /**
     * 查询生产入库
     * 
     * @param id 生产入库主键
     * @return 生产入库
     */
    public ProdWare selectProdWareById(Long id);

    /**
     * 查询生产入库列表
     * 
     * @param prodWare 生产入库
     * @return 生产入库集合
     */
    public List<ProdWare> selectProdWareList(ProdWare prodWare);

    /**
     * 新增生产入库
     * 
     * @param prodWare 生产入库
     * @return 结果
     */
    public int insertProdWare(ProdWare prodWare);

    /**
     * 修改生产入库
     * 
     * @param prodWare 生产入库
     * @return 结果
     */
    public int updateProdWare(ProdWare prodWare);

    /**
     * 批量删除生产入库
     * 
     * @param ids 需要删除的生产入库主键集合
     * @return 结果
     */
    public int deleteProdWareByIds(String ids);

    /**
     * 删除生产入库信息
     * 
     * @param id 生产入库主键
     * @return 结果
     */
    public int deleteProdWareById(Long id);
}
