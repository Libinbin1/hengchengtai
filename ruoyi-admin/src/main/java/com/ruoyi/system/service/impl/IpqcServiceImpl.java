package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.IpqcMapper;
import com.ruoyi.system.domain.Ipqc;
import com.ruoyi.system.service.IIpqcService;
import com.ruoyi.common.core.text.Convert;

/**
 * 制程检验Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class IpqcServiceImpl implements IIpqcService 
{
    @Autowired
    private IpqcMapper ipqcMapper;

    /**
     * 查询制程检验
     * 
     * @param id 制程检验主键
     * @return 制程检验
     */
    @Override
    public Ipqc selectIpqcById(Long id)
    {
        return ipqcMapper.selectIpqcById(id);
    }

    /**
     * 查询制程检验列表
     * 
     * @param ipqc 制程检验
     * @return 制程检验
     */
    @Override
    public List<Ipqc> selectIpqcList(Ipqc ipqc)
    {
        return ipqcMapper.selectIpqcList(ipqc);
    }

    /**
     * 新增制程检验
     * 
     * @param ipqc 制程检验
     * @return 结果
     */
    @Override
    public int insertIpqc(Ipqc ipqc)
    {
        return ipqcMapper.insertIpqc(ipqc);
    }

    /**
     * 修改制程检验
     * 
     * @param ipqc 制程检验
     * @return 结果
     */
    @Override
    public int updateIpqc(Ipqc ipqc)
    {
        return ipqcMapper.updateIpqc(ipqc);
    }

    /**
     * 批量删除制程检验
     * 
     * @param ids 需要删除的制程检验主键
     * @return 结果
     */
    @Override
    public int deleteIpqcByIds(String ids)
    {
        return ipqcMapper.deleteIpqcByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除制程检验信息
     * 
     * @param id 制程检验主键
     * @return 结果
     */
    @Override
    public int deleteIpqcById(Long id)
    {
        return ipqcMapper.deleteIpqcById(id);
    }
}
