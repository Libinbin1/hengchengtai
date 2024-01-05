package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.Fqc;

/**
 * 成品检验Service接口
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
public interface IFqcService 
{
    /**
     * 查询成品检验
     * 
     * @param id 成品检验主键
     * @return 成品检验
     */
    public Fqc selectFqcById(Long id);

    /**
     * 查询成品检验列表
     * 
     * @param fqc 成品检验
     * @return 成品检验集合
     */
    public List<Fqc> selectFqcList(Fqc fqc);

    /**
     * 新增成品检验
     * 
     * @param fqc 成品检验
     * @return 结果
     */
    public int insertFqc(Fqc fqc);

    /**
     * 修改成品检验
     * 
     * @param fqc 成品检验
     * @return 结果
     */
    public int updateFqc(Fqc fqc);

    /**
     * 批量删除成品检验
     * 
     * @param ids 需要删除的成品检验主键集合
     * @return 结果
     */
    public int deleteFqcByIds(String ids);

    /**
     * 删除成品检验信息
     * 
     * @param id 成品检验主键
     * @return 结果
     */
    public int deleteFqcById(Long id);
}
