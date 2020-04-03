package com.dongtu.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 积分记录表
 */
public class TbIntegral implements Serializable {
    private Long moOrderNum;

    private String userName;

    private Date createTime;

    private Long payIntegral;

    private Integer integralStatus;

    private Long userId;

    public Long getMoOrderNum() {
        return moOrderNum;
    }

    public void setMoOrderNum(Long moOrderNum) {
        this.moOrderNum = moOrderNum;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getPayIntegral() {
        return payIntegral;
    }

    public void setPayIntegral(Long payIntegral) {
        this.payIntegral = payIntegral;
    }

    public Integer getIntegralStatus() {
        return integralStatus;
    }

    public void setIntegralStatus(Integer integralStatus) {
        this.integralStatus = integralStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}