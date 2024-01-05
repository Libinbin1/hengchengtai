package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Oqc;

/**
 * 出库检验Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface OqcMapper 
{
    /**
     * 查询出库检验
     * 
     * @param id 出库检验主键
     * @return 出库检验
     */
    public Oqc selectOqcById(Long id);

    /**
     * 查询出库检验列表
     * 
     * @param oqc 出库检验
     * @return 出库检验集合
     */
    public List<Oqc> selectOqcList(Oqc oqc);

    /**
     * 新增出库检验
     * 
     * @param oqc 出库检验
     * @return 结果
     */
    public int insertOqc(Oqc oqc);

    /**
     * 修改出库检验
     * 
     * @param oqc 出库检验
     * @return 结果
     */
    public int updateOqc(Oqc oqc);

    /**
     * 删除出库检验
     * 
     * @param id 出库检验主键
     * @return 结果
     */
    public int deleteOqcById(Long id);

    /**
     * 批量删除出库检验
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOqcByIds(String[] ids);
}
