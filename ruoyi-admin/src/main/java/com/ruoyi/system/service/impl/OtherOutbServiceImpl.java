package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.OtherOutbMapper;
import com.ruoyi.system.domain.OtherOutb;
import com.ruoyi.system.service.IOtherOutbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 其他出库Service业务层处理
 * 
 * @author bin
 * @date 2024-01-11
 */
@Service
public class OtherOutbServiceImpl implements IOtherOutbService 
{
    @Autowired
    private OtherOutbMapper otherOutbMapper;

    /**
     * 查询其他出库
     * 
     * @param id 其他出库主键
     * @return 其他出库
     */
    @Override
    public OtherOutb selectOtherOutbById(Long id)
    {
        return otherOutbMapper.selectOtherOutbById(id);
    }

    /**
     * 查询其他出库列表
     * 
     * @param otherOutb 其他出库
     * @return 其他出库
     */
    @Override
    public List<OtherOutb> selectOtherOutbList(OtherOutb otherOutb)
    {
        return otherOutbMapper.selectOtherOutbList(otherOutb);
    }

    /**
     * 新增其他出库
     * 
     * @param otherOutb 其他出库
     * @return 结果
     */
    @Override
    public int insertOtherOutb(OtherOutb otherOutb)
    {
        return otherOutbMapper.insertOtherOutb(otherOutb);
    }

    /**
     * 修改其他出库
     * 
     * @param otherOutb 其他出库
     * @return 结果
     */
    @Override
    public int updateOtherOutb(OtherOutb otherOutb)
    {
        return otherOutbMapper.updateOtherOutb(otherOutb);
    }

    /**
     * 批量删除其他出库
     * 
     * @param ids 需要删除的其他出库主键
     * @return 结果
     */
    @Override
    public int deleteOtherOutbByIds(String ids)
    {
        return otherOutbMapper.deleteOtherOutbByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除其他出库信息
     * 
     * @param id 其他出库主键
     * @return 结果
     */
    @Override
    public int deleteOtherOutbById(Long id)
    {
        return otherOutbMapper.deleteOtherOutbById(id);
    }
}
