package com.dongtu.service;

import com.dongtu.pojo.EsPojo;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: EsService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/1 19:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/1 19:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface EsService {

    void save(EsPojo esPojo);

    List<EsPojo> findByEs(String str, Integer page, Integer size);
}
