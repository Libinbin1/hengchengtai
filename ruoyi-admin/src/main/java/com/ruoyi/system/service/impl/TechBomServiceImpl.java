package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TechBomMapper;
import com.ruoyi.system.domain.TechBom;
import com.ruoyi.system.service.ITechBomService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工艺bomService业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class TechBomServiceImpl implements ITechBomService 
{
    @Autowired
    private TechBomMapper techBomMapper;

    /**
     * 查询工艺bom
     * 
     * @param id 工艺bom主键
     * @return 工艺bom
     */
    @Override
    public TechBom selectTechBomById(Long id)
    {
        return techBomMapper.selectTechBomById(id);
    }

    /**
     * 查询工艺bom列表
     * 
     * @param techBom 工艺bom
     * @return 工艺bom
     */
    @Override
    public List<TechBom> selectTechBomList(TechBom techBom)
    {
        return techBomMapper.selectTechBomList(techBom);
    }

    /**
     * 新增工艺bom
     * 
     * @param techBom 工艺bom
     * @return 结果
     */
    @Override
    public int insertTechBom(TechBom techBom)
    {
        return techBomMapper.insertTechBom(techBom);
    }

    /**
     * 修改工艺bom
     * 
     * @param techBom 工艺bom
     * @return 结果
     */
    @Override
    public int updateTechBom(TechBom techBom)
    {
        return techBomMapper.updateTechBom(techBom);
    }

    /**
     * 批量删除工艺bom
     * 
     * @param ids 需要删除的工艺bom主键
     * @return 结果
     */
    @Override
    public int deleteTechBomByIds(String ids)
    {
        return techBomMapper.deleteTechBomByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工艺bom信息
     * 
     * @param id 工艺bom主键
     * @return 结果
     */
    @Override
    public int deleteTechBomById(Long id)
    {
        return techBomMapper.deleteTechBomById(id);
    }
}
