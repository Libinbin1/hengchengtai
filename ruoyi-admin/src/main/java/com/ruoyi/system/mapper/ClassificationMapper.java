package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Classification;

/**
 * 分类Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface ClassificationMapper 
{
    /**
     * 查询分类
     * 
     * @param id 分类主键
     * @return 分类
     */
    public Classification selectClassificationById(Long id);

    /**
     * 查询分类列表
     * 
     * @param classification 分类
     * @return 分类集合
     */
    public List<Classification> selectClassificationList(Classification classification);

    /**
     * 新增分类
     * 
     * @param classification 分类
     * @return 结果
     */
    public int insertClassification(Classification classification);

    /**
     * 修改分类
     * 
     * @param classification 分类
     * @return 结果
     */
    public int updateClassification(Classification classification);

    /**
     * 删除分类
     * 
     * @param id 分类主键
     * @return 结果
     */
    public int deleteClassificationById(Long id);

    /**
     * 批量删除分类
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteClassificationByIds(String[] ids);
}
