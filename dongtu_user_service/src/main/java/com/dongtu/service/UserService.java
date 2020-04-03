package com.dongtu.service;

import com.dongtu.pojo.TbUser;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.service
 * @ClassName: Uservice
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2019/12/30 11:23
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/12/30 11:23
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public interface UserService {
    TbUser findById(Long id);

    void updateTbUser(TbUser tbUser);

    void saveTbUser(TbUser tbUser);

    TbUser findByUserName(String userName);

    void integralProcessing(String score, TbUser user);
}
