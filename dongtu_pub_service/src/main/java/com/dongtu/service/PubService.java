package com.dongtu.service;

import com.dongtu.pojo.TbPub;
import com.dongtu.pojo.TbPubVO;

import java.util.List;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: PubService
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/27 19:21
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/27 19:21
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface PubService {
    List<TbPubVO> findAll();

    void addTbPub(TbPub tbPub);



    List<TbPub> findByArea(Long pubsAreaId);

    void deleteBatch(TbPub tbPub);

    TbPub findById(Long pubsId);
}
