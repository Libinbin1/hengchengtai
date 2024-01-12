package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.ProdPlan;

/**
 * 生产计划Service接口
 * 
 * @author bin
 * @date 2024-01-11
 */
public interface IProdPlanService 
{
    /**
     * 查询生产计划
     * 
     * @param id 生产计划主键
     * @return 生产计划
     */
    public ProdPlan selectProdPlanById(Long id);

    /**
     * 查询生产计划列表
     * 
     * @param prodPlan 生产计划
     * @return 生产计划集合
     */
    public List<ProdPlan> selectProdPlanList(ProdPlan prodPlan);

    /**
     * 新增生产计划
     * 
     * @param prodPlan 生产计划
     * @return 结果
     */
    public int insertProdPlan(ProdPlan prodPlan);

    /**
     * 修改生产计划
     * 
     * @param prodPlan 生产计划
     * @return 结果
     */
    public int updateProdPlan(ProdPlan prodPlan);

    /**
     * 批量删除生产计划
     * 
     * @param ids 需要删除的生产计划主键集合
     * @return 结果
     */
    public int deleteProdPlanByIds(String ids);

    /**
     * 删除生产计划信息
     * 
     * @param id 生产计划主键
     * @return 结果
     */
    public int deleteProdPlanById(Long id);
}
