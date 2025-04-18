package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.WarehourseInfo;

/**
 * 仓库信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface WarehourseInfoMapper 
{
    /**
     * 查询仓库信息
     * 
     * @param id 仓库信息主键
     * @return 仓库信息
     */
    public WarehourseInfo selectWarehourseInfoById(Long id);

    /**
     * 查询仓库信息列表
     * 
     * @param warehourseInfo 仓库信息
     * @return 仓库信息集合
     */
    public List<WarehourseInfo> selectWarehourseInfoList(WarehourseInfo warehourseInfo);

    /**
     * 新增仓库信息
     * 
     * @param warehourseInfo 仓库信息
     * @return 结果
     */
    public int insertWarehourseInfo(WarehourseInfo warehourseInfo);

    /**
     * 修改仓库信息
     * 
     * @param warehourseInfo 仓库信息
     * @return 结果
     */
    public int updateWarehourseInfo(WarehourseInfo warehourseInfo);

    /**
     * 删除仓库信息
     * 
     * @param id 仓库信息主键
     * @return 结果
     */
    public int deleteWarehourseInfoById(Long id);

    /**
     * 批量删除仓库信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehourseInfoByIds(String[] ids);
}
