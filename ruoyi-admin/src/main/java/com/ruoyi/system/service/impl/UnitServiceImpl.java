package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.UnitMapper;
import com.ruoyi.system.domain.Unit;
import com.ruoyi.system.service.IUnitService;
import com.ruoyi.common.core.text.Convert;

/**
 * 单位Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class UnitServiceImpl implements IUnitService 
{
    @Autowired
    private UnitMapper unitMapper;

    /**
     * 查询单位
     * 
     * @param id 单位主键
     * @return 单位
     */
    @Override
    public Unit selectUnitById(Long id)
    {
        return unitMapper.selectUnitById(id);
    }

    /**
     * 查询单位列表
     * 
     * @param unit 单位
     * @return 单位
     */
    @Override
    public List<Unit> selectUnitList(Unit unit)
    {
        return unitMapper.selectUnitList(unit);
    }

    /**
     * 新增单位
     * 
     * @param unit 单位
     * @return 结果
     */
    @Override
    public int insertUnit(Unit unit)
    {
        return unitMapper.insertUnit(unit);
    }

    /**
     * 修改单位
     * 
     * @param unit 单位
     * @return 结果
     */
    @Override
    public int updateUnit(Unit unit)
    {
        return unitMapper.updateUnit(unit);
    }

    /**
     * 批量删除单位
     * 
     * @param ids 需要删除的单位主键
     * @return 结果
     */
    @Override
    public int deleteUnitByIds(String ids)
    {
        return unitMapper.deleteUnitByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除单位信息
     * 
     * @param id 单位主键
     * @return 结果
     */
    @Override
    public int deleteUnitById(Long id)
    {
        return unitMapper.deleteUnitById(id);
    }
}
