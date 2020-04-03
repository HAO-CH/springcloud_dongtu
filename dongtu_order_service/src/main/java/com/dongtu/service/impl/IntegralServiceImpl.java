package com.dongtu.service.impl;

import com.dongtu.mapper.IntegralItemMapper;
import com.dongtu.pojo.IntegralItem;
import com.dongtu.service.IntegralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: IntegralServiceImpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/10 17:37
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 17:37
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class IntegralServiceImpl implements IntegralService {
    @Resource
    private IntegralItemMapper integralItemMapper;
    @Override
    public void addOrderIntegral(IntegralItem integralItem) {
        integralItemMapper.insertSelective(integralItem);
    }

    @Override
    public List<IntegralItem> findByUserIdOrder(Long userId) {
        return integralItemMapper.findByUserIdOrder(userId);
    }
}
