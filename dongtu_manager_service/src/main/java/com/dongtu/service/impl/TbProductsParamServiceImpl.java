package com.dongtu.service.impl;

import com.dongtu.mapper.TbProductsParamMapper;
import com.dongtu.pojo.TbProductsParam;
import com.dongtu.service.TbProductsParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: TbProductsParamServiceImpl
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 20:42
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 20:42
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class TbProductsParamServiceImpl implements TbProductsParamService {
    @Autowired
    private TbProductsParamMapper tbProductsParamMapper;

    @Override
    public TbProductsParam findProductParamByTpId(Long tpId) {
        return tbProductsParamMapper.selectByPrimaryKey(tpId);
    }
}
