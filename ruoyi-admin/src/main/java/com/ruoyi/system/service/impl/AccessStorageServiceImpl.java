package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.AccessStorageMapper;
import com.ruoyi.system.domain.AccessStorage;
import com.ruoyi.system.service.IAccessStorageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 出入库Service业务层处理
 * 
 * @author bin
 * @date 2024-01-12
 */
@Service
public class AccessStorageServiceImpl implements IAccessStorageService 
{
    @Autowired
    private AccessStorageMapper accessStorageMapper;

    /**
     * 查询出入库
     * 
     * @param id 出入库主键
     * @return 出入库
     */
    @Override
    public AccessStorage selectAccessStorageById(Long id)
    {
        return accessStorageMapper.selectAccessStorageById(id);
    }

    /**
     * 查询出入库列表
     * 
     * @param accessStorage 出入库
     * @return 出入库
     */
    @Override
    public List<AccessStorage> selectAccessStorageList(AccessStorage accessStorage)
    {
        return accessStorageMapper.selectAccessStorageList(accessStorage);
    }

    /**
     * 新增出入库
     * 
     * @param accessStorage 出入库
     * @return 结果
     */
    @Override
    public int insertAccessStorage(AccessStorage accessStorage)
    {
        return accessStorageMapper.insertAccessStorage(accessStorage);
    }

    /**
     * 修改出入库
     * 
     * @param accessStorage 出入库
     * @return 结果
     */
    @Override
    public int updateAccessStorage(AccessStorage accessStorage)
    {
        return accessStorageMapper.updateAccessStorage(accessStorage);
    }

    /**
     * 批量删除出入库
     * 
     * @param ids 需要删除的出入库主键
     * @return 结果
     */
    @Override
    public int deleteAccessStorageByIds(String ids)
    {
        return accessStorageMapper.deleteAccessStorageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除出入库信息
     * 
     * @param id 出入库主键
     * @return 结果
     */
    @Override
    public int deleteAccessStorageById(Long id)
    {
        return accessStorageMapper.deleteAccessStorageById(id);
    }
}
