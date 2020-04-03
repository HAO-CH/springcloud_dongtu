package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: LuckyDraw
 * @Description: java类作用描述
 * @Author: DengQing
 * @CreateDate: 2020/1/10 17:00
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/10 17:00
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * 抽奖 用户中奖纪录
 */
@Document(value = "LuckyDraw")
public class LuckyDraw {
    //用户名
    private String userName;
    //中奖时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date winningTime;
    //抽奖内容
    private String award;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getWinningTime() {
        return winningTime;
    }

    public void setWinningTime(Date winningTime) {
        this.winningTime = winningTime;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
