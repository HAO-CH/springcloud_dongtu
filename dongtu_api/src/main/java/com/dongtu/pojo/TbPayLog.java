package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbPayLog implements Serializable {
    private Long moOrderNum;

    private String userName;

    private Long userId;

    private Date crateTime;

    private BigDecimal totalFee;

    private Integer logStatus;

    private Long travelOrderId;

    private Long pubOrderId;

    private Long insureOrderId;

    private String transactionId;

    private Integer payType;

    private Date payTime;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getCrateTime() {
        return crateTime;
    }

    public void setCrateTime(Date crateTime) {
        this.crateTime = crateTime;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public Long getTravelOrderId() {
        return travelOrderId;
    }

    public void setTravelOrderId(Long travelOrderId) {
        this.travelOrderId = travelOrderId;
    }

    public Long getPubOrderId() {
        return pubOrderId;
    }

    public void setPubOrderId(Long pubOrderId) {
        this.pubOrderId = pubOrderId;
    }

    public Long getInsureOrderId() {
        return insureOrderId;
    }

    public void setInsureOrderId(Long insureOrderId) {
        this.insureOrderId = insureOrderId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }
}