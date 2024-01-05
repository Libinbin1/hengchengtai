package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.OtherWare;

/**
 * 其他入库Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IOtherWareService 
{
    /**
     * 查询其他出库
     * 
     * @param id 其他出库主键
     * @return 其他出库
     */
    public OtherWare selectOtherWareById(Long id);

    /**
     * 查询其他出库列表
     * 
     * @param otherWare 其他出库
     * @return 其他出库集合
     */
    public List<OtherWare> selectOtherWareList(OtherWare otherWare);

    /**
     * 新增其他出库
     * 
     * @param otherWare 其他出库
     * @return 结果
     */
    public int insertOtherWare(OtherWare otherWare);

    /**
     * 修改其他出库
     * 
     * @param otherWare 其他出库
     * @return 结果
     */
    public int updateOtherWare(OtherWare otherWare);

    /**
     * 批量删除其他出库
     * 
     * @param ids 需要删除的其他出库主键集合
     * @return 结果
     */
    public int deleteOtherWareByIds(String ids);

    /**
     * 删除其他出库信息
     * 
     * @param id 其他出库主键
     * @return 结果
     */
    public int deleteOtherWareById(Long id);
}
