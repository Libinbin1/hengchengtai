package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.WarehourseInfoMapper;
import com.ruoyi.system.domain.WarehourseInfo;
import com.ruoyi.system.service.IWarehourseInfoService;
import com.ruoyi.common.core.text.Convert;

/**
 * 仓库信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class WarehourseInfoServiceImpl implements IWarehourseInfoService 
{
    @Autowired
    private WarehourseInfoMapper warehourseInfoMapper;

    /**
     * 查询仓库信息
     * 
     * @param id 仓库信息主键
     * @return 仓库信息
     */
    @Override
    public WarehourseInfo selectWarehourseInfoById(Long id)
    {
        return warehourseInfoMapper.selectWarehourseInfoById(id);
    }

    /**
     * 查询仓库信息列表
     * 
     * @param warehourseInfo 仓库信息
     * @return 仓库信息
     */
    @Override
    public List<WarehourseInfo> selectWarehourseInfoList(WarehourseInfo warehourseInfo)
    {
        return warehourseInfoMapper.selectWarehourseInfoList(warehourseInfo);
    }

    /**
     * 新增仓库信息
     * 
     * @param warehourseInfo 仓库信息
     * @return 结果
     */
    @Override
    public int insertWarehourseInfo(WarehourseInfo warehourseInfo)
    {
        return warehourseInfoMapper.insertWarehourseInfo(warehourseInfo);
    }

    /**
     * 修改仓库信息
     * 
     * @param warehourseInfo 仓库信息
     * @return 结果
     */
    @Override
    public int updateWarehourseInfo(WarehourseInfo warehourseInfo)
    {
        return warehourseInfoMapper.updateWarehourseInfo(warehourseInfo);
    }

    /**
     * 批量删除仓库信息
     * 
     * @param ids 需要删除的仓库信息主键
     * @return 结果
     */
    @Override
    public int deleteWarehourseInfoByIds(String ids)
    {
        return warehourseInfoMapper.deleteWarehourseInfoByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除仓库信息信息
     * 
     * @param id 仓库信息主键
     * @return 结果
     */
    @Override
    public int deleteWarehourseInfoById(Long id)
    {
        return warehourseInfoMapper.deleteWarehourseInfoById(id);
    }
}
