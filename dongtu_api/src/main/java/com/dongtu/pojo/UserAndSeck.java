package com.dongtu.pojo;

import java.io.Serializable;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: UserAndSeck
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/7 17:41
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/7 17:41
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class UserAndSeck implements Serializable {
    private Long userIdAndId;

    public Long getUserIdAndId() {
        return userIdAndId;
    }

    public void setUserIdAndId(Long userIdAndId) {
        this.userIdAndId = userIdAndId;
    }
}
