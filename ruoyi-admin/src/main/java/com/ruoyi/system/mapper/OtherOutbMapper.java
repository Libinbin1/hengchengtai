package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.OtherOutb;

/**
 * 其他出库Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface OtherOutbMapper 
{
    /**
     * 查询其他出库
     * 
     * @param id 其他出库主键
     * @return 其他出库
     */
    public OtherOutb selectOtherOutbById(Long id);

    /**
     * 查询其他出库列表
     * 
     * @param otherOutb 其他出库
     * @return 其他出库集合
     */
    public List<OtherOutb> selectOtherOutbList(OtherOutb otherOutb);

    /**
     * 新增其他出库
     * 
     * @param otherOutb 其他出库
     * @return 结果
     */
    public int insertOtherOutb(OtherOutb otherOutb);

    /**
     * 修改其他出库
     * 
     * @param otherOutb 其他出库
     * @return 结果
     */
    public int updateOtherOutb(OtherOutb otherOutb);

    /**
     * 删除其他出库
     * 
     * @param id 其他出库主键
     * @return 结果
     */
    public int deleteOtherOutbById(Long id);

    /**
     * 批量删除其他出库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOtherOutbByIds(String[] ids);
}
