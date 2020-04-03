package com.dongtu.service.impl;

import com.dongtu.pojo.TbComments;
import com.dongtu.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service.impl
 * @ClassName: CommentsServiceImpl
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 14:07
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 14:07
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Service
public class CommentsServiceImpl implements CommentsService {
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public void saveComments(TbComments tbComments) {
        mongoTemplate.save(tbComments);
    }
}
