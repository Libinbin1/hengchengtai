package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OtherWareMapper;
import com.ruoyi.system.domain.OtherWare;
import com.ruoyi.system.service.IOtherWareService;
import com.ruoyi.common.core.text.Convert;

/**
 * 其他入库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class OtherWareServiceImpl implements IOtherWareService 
{
    @Autowired
    private OtherWareMapper otherWareMapper;

    /**
     * 查询其他出库
     * 
     * @param id 其他出库主键
     * @return 其他出库
     */
    @Override
    public OtherWare selectOtherWareById(Long id)
    {
        return otherWareMapper.selectOtherWareById(id);
    }

    /**
     * 查询其他出库列表
     * 
     * @param otherWare 其他出库
     * @return 其他出库
     */
    @Override
    public List<OtherWare> selectOtherWareList(OtherWare otherWare)
    {
        return otherWareMapper.selectOtherWareList(otherWare);
    }

    /**
     * 新增其他出库
     * 
     * @param otherWare 其他出库
     * @return 结果
     */
    @Override
    public int insertOtherWare(OtherWare otherWare)
    {
        return otherWareMapper.insertOtherWare(otherWare);
    }

    /**
     * 修改其他出库
     * 
     * @param otherWare 其他出库
     * @return 结果
     */
    @Override
    public int updateOtherWare(OtherWare otherWare)
    {
        return otherWareMapper.updateOtherWare(otherWare);
    }

    /**
     * 批量删除其他出库
     * 
     * @param ids 需要删除的其他出库主键
     * @return 结果
     */
    @Override
    public int deleteOtherWareByIds(String ids)
    {
        return otherWareMapper.deleteOtherWareByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除其他出库信息
     * 
     * @param id 其他出库主键
     * @return 结果
     */
    @Override
    public int deleteOtherWareById(Long id)
    {
        return otherWareMapper.deleteOtherWareById(id);
    }
}
