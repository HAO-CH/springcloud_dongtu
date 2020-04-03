package com.dongtu.service.impl;

import com.dongtu.mapper.IntegralGoodsMapper;
import com.dongtu.pojo.IntegralGoods;
import com.dongtu.pojo.IntegralGoodsExample;
import com.dongtu.service.IntegralService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: IntegralServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/9 21:14
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/9 21:14
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class IntegralServiceimpl implements IntegralService {
    @Resource
    private IntegralGoodsMapper integralGoodsMapper;

    @Override
    public List<IntegralGoods> findAll() {
        return integralGoodsMapper.selectByExample(new IntegralGoodsExample());
    }

    @Override
    public void addIntegralGoods(IntegralGoods integralGoods) {
        integralGoodsMapper.insertSelective(integralGoods);
    }

    @Override
    public void updateIntegralGoods(IntegralGoods integralGoods) {
        integralGoodsMapper.updateByPrimaryKeySelective(integralGoods);
    }

    @Override
    public IntegralGoods findByGoodsId(Long goodsId) {
        return integralGoodsMapper.selectByPrimaryKey(goodsId);
    }
}
