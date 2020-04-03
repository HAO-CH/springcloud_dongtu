package com.dongtu.dao;

import com.dongtu.pojo.EsPojo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu
 * @ClassName: EsDao
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/1 19:17
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/1 19:17
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface EsDao extends ElasticsearchRepository<EsPojo,Long> {
}
