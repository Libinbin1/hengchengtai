package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.ProdprocessMapper;
import com.ruoyi.system.domain.Prodprocess;
import com.ruoyi.system.service.IProdprocessService;
import com.ruoyi.common.core.text.Convert;

/**
 * 工序Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-01-04
 */
@Service
public class ProdprocessServiceImpl implements IProdprocessService 
{
    @Autowired
    private ProdprocessMapper prodprocessMapper;

    /**
     * 查询工序
     * 
     * @param id 工序主键
     * @return 工序
     */
    @Override
    public Prodprocess selectProdprocessById(Long id)
    {
        return prodprocessMapper.selectProdprocessById(id);
    }

    /**
     * 查询工序列表
     * 
     * @param prodprocess 工序
     * @return 工序
     */
    @Override
    public List<Prodprocess> selectProdprocessList(Prodprocess prodprocess)
    {
        return prodprocessMapper.selectProdprocessList(prodprocess);
    }

    /**
     * 新增工序
     * 
     * @param prodprocess 工序
     * @return 结果
     */
    @Override
    public int insertProdprocess(Prodprocess prodprocess)
    {
        return prodprocessMapper.insertProdprocess(prodprocess);
    }

    /**
     * 修改工序
     * 
     * @param prodprocess 工序
     * @return 结果
     */
    @Override
    public int updateProdprocess(Prodprocess prodprocess)
    {
        return prodprocessMapper.updateProdprocess(prodprocess);
    }

    /**
     * 批量删除工序
     * 
     * @param ids 需要删除的工序主键
     * @return 结果
     */
    @Override
    public int deleteProdprocessByIds(String ids)
    {
        return prodprocessMapper.deleteProdprocessByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除工序信息
     * 
     * @param id 工序主键
     * @return 结果
     */
    @Override
    public int deleteProdprocessById(Long id)
    {
        return prodprocessMapper.deleteProdprocessById(id);
    }
}
