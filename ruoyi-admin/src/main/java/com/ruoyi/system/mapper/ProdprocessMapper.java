package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Prodprocess;

/**
 * 工序Mapper接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface ProdprocessMapper 
{
    /**
     * 查询工序
     * 
     * @param id 工序主键
     * @return 工序
     */
    public Prodprocess selectProdprocessById(Long id);

    /**
     * 查询工序列表
     * 
     * @param prodprocess 工序
     * @return 工序集合
     */
    public List<Prodprocess> selectProdprocessList(Prodprocess prodprocess);

    /**
     * 新增工序
     * 
     * @param prodprocess 工序
     * @return 结果
     */
    public int insertProdprocess(Prodprocess prodprocess);

    /**
     * 修改工序
     * 
     * @param prodprocess 工序
     * @return 结果
     */
    public int updateProdprocess(Prodprocess prodprocess);

    /**
     * 删除工序
     * 
     * @param id 工序主键
     * @return 结果
     */
    public int deleteProdprocessById(Long id);

    /**
     * 批量删除工序
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteProdprocessByIds(String[] ids);
}
