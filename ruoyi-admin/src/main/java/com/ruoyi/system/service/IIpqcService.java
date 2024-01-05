package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Ipqc;

/**
 * 制程检验Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IIpqcService 
{
    /**
     * 查询制程检验
     * 
     * @param id 制程检验主键
     * @return 制程检验
     */
    public Ipqc selectIpqcById(Long id);

    /**
     * 查询制程检验列表
     * 
     * @param ipqc 制程检验
     * @return 制程检验集合
     */
    public List<Ipqc> selectIpqcList(Ipqc ipqc);

    /**
     * 新增制程检验
     * 
     * @param ipqc 制程检验
     * @return 结果
     */
    public int insertIpqc(Ipqc ipqc);

    /**
     * 修改制程检验
     * 
     * @param ipqc 制程检验
     * @return 结果
     */
    public int updateIpqc(Ipqc ipqc);

    /**
     * 批量删除制程检验
     * 
     * @param ids 需要删除的制程检验主键集合
     * @return 结果
     */
    public int deleteIpqcByIds(String ids);

    /**
     * 删除制程检验信息
     * 
     * @param id 制程检验主键
     * @return 结果
     */
    public int deleteIpqcById(Long id);
}
