package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.ProdPick;

/**
 * 生产领料Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface ProdPickMapper 
{
    /**
     * 查询生产领料
     * 
     * @param id 生产领料主键
     * @return 生产领料
     */
    public ProdPick selectProdPickById(Long id);

    /**
     * 查询生产领料列表
     * 
     * @param prodPick 生产领料
     * @return 生产领料集合
     */
    public List<ProdPick> selectProdPickList(ProdPick prodPick);

    /**
     * 新增生产领料
     * 
     * @param prodPick 生产领料
     * @return 结果
     */
    public int insertProdPick(ProdPick prodPick);

    /**
     * 修改生产领料
     * 
     * @param prodPick 生产领料
     * @return 结果
     */
    public int updateProdPick(ProdPick prodPick);

    /**
     * 删除生产领料
     * 
     * @param id 生产领料主键
     * @return 结果
     */
    public int deleteProdPickById(Long id);

    /**
     * 批量删除生产领料
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProdPickByIds(String[] ids);
}
