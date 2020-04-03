package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbInsureOrder implements Serializable {
    private Long insureOrderId;

    private String insure1Name;

    private String userName;

    private String userPhone;

    private Date createTime;

    private Date payTime;

    private Integer insureStatus;

    private String transactionId;

    private String insure2Name;

    private BigDecimal insureTotalFee;

    public Long getInsureOrderId() {
        return insureOrderId;
    }

    public void setInsureOrderId(Long insureOrderId) {
        this.insureOrderId = insureOrderId;
    }

    public String getInsure1Name() {
        return insure1Name;
    }

    public void setInsure1Name(String insure1Name) {
        this.insure1Name = insure1Name == null ? null : insure1Name.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getInsureStatus() {
        return insureStatus;
    }

    public void setInsureStatus(Integer insureStatus) {
        this.insureStatus = insureStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public String getInsure2Name() {
        return insure2Name;
    }

    public void setInsure2Name(String insure2Name) {
        this.insure2Name = insure2Name == null ? null : insure2Name.trim();
    }

    public BigDecimal getInsureTotalFee() {
        return insureTotalFee;
    }

    public void setInsureTotalFee(BigDecimal insureTotalFee) {
        this.insureTotalFee = insureTotalFee;
    }
}