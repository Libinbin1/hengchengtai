package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.AccessStorage;

/**
 * 出入库Mapper接口
 * 
 * @author bin
 * @date 2024-01-12
 */
public interface AccessStorageMapper 
{
    /**
     * 查询出入库
     * 
     * @param id 出入库主键
     * @return 出入库
     */
    public AccessStorage selectAccessStorageById(Long id);

    /**
     * 查询出入库列表
     * 
     * @param accessStorage 出入库
     * @return 出入库集合
     */
    public List<AccessStorage> selectAccessStorageList(AccessStorage accessStorage);

    /**
     * 新增出入库
     * 
     * @param accessStorage 出入库
     * @return 结果
     */
    public int insertAccessStorage(AccessStorage accessStorage);

    /**
     * 修改出入库
     * 
     * @param accessStorage 出入库
     * @return 结果
     */
    public int updateAccessStorage(AccessStorage accessStorage);

    /**
     * 删除出入库
     * 
     * @param id 出入库主键
     * @return 结果
     */
    public int deleteAccessStorageById(Long id);

    /**
     * 批量删除出入库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteAccessStorageByIds(String[] ids);
}
