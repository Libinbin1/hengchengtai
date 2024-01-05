package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.TechBom;

/**
 * 工艺bomMapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface TechBomMapper 
{
    /**
     * 查询工艺bom
     * 
     * @param id 工艺bom主键
     * @return 工艺bom
     */
    public TechBom selectTechBomById(Long id);

    /**
     * 查询工艺bom列表
     * 
     * @param techBom 工艺bom
     * @return 工艺bom集合
     */
    public List<TechBom> selectTechBomList(TechBom techBom);

    /**
     * 新增工艺bom
     * 
     * @param techBom 工艺bom
     * @return 结果
     */
    public int insertTechBom(TechBom techBom);

    /**
     * 修改工艺bom
     * 
     * @param techBom 工艺bom
     * @return 结果
     */
    public int updateTechBom(TechBom techBom);

    /**
     * 删除工艺bom
     * 
     * @param id 工艺bom主键
     * @return 结果
     */
    public int deleteTechBomById(Long id);

    /**
     * 批量删除工艺bom
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTechBomByIds(String[] ids);
}
