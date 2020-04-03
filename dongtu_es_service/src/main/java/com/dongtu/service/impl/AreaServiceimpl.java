package com.dongtu.service.impl;

import com.dongtu.mapper.TbAreaMapper;
import com.dongtu.pojo.TbArea;
import com.dongtu.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: AreaServiceimpl
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 10:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 10:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class AreaServiceimpl implements AreaService {
    @Resource
    private TbAreaMapper tbAreaMapper;

    @Override
    public TbArea findByAreaId(Long tpAreaId) {
        return tbAreaMapper.selectByPrimaryKey(tpAreaId);
    }
}
