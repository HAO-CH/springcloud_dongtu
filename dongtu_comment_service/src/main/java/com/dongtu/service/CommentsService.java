package com.dongtu.service;

import com.dongtu.pojo.TbComments;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: CommentsService
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/7 14:06
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 14:06
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface CommentsService {
    void saveComments(TbComments tbComments);
}
