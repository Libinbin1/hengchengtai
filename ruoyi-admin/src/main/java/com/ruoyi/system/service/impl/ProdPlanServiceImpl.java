package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProdPlanMapper;
import com.ruoyi.system.domain.ProdPlan;
import com.ruoyi.system.service.IProdPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 生产计划Service业务层处理
 * 
 * @author bin
 * @date 2024-01-11
 */
@Service
public class ProdPlanServiceImpl implements IProdPlanService 
{
    @Autowired
    private ProdPlanMapper prodPlanMapper;

    /**
     * 查询生产计划
     * 
     * @param id 生产计划主键
     * @return 生产计划
     */
    @Override
    public ProdPlan selectProdPlanById(Long id)
    {
        return prodPlanMapper.selectProdPlanById(id);
    }

    /**
     * 查询生产计划列表
     * 
     * @param prodPlan 生产计划
     * @return 生产计划
     */
    @Override
    public List<ProdPlan> selectProdPlanList(ProdPlan prodPlan)
    {
        return prodPlanMapper.selectProdPlanList(prodPlan);
    }

    /**
     * 新增生产计划
     * 
     * @param prodPlan 生产计划
     * @return 结果
     */
    @Override
    public int insertProdPlan(ProdPlan prodPlan)
    {
        return prodPlanMapper.insertProdPlan(prodPlan);
    }

    /**
     * 修改生产计划
     * 
     * @param prodPlan 生产计划
     * @return 结果
     */
    @Override
    public int updateProdPlan(ProdPlan prodPlan)
    {
        return prodPlanMapper.updateProdPlan(prodPlan);
    }

    /**
     * 批量删除生产计划
     * 
     * @param ids 需要删除的生产计划主键
     * @return 结果
     */
    @Override
    public int deleteProdPlanByIds(String ids)
    {
        return prodPlanMapper.deleteProdPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除生产计划信息
     * 
     * @param id 生产计划主键
     * @return 结果
     */
    @Override
    public int deleteProdPlanById(Long id)
    {
        return prodPlanMapper.deleteProdPlanById(id);
    }
}
