package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbTravelOrder implements Serializable {
    private Long trOrderId;

    private Long trUserId;

    private Long trTravelSellerId;

    private String trUserName;

    private String trUserPhone;

    private Long trTravelNum;

    private BigDecimal trTravelPrice;

    private Long trTravelId;

    private Date trCreateTime;

    private Date trPayTime;

    private Integer trStatus;

    private String trTransactionId;

    private BigDecimal trTravelTotalFee;

    private Date tpGoTime;

    public Long getTrOrderId() {
        return trOrderId;
    }

    public void setTrOrderId(Long trOrderId) {
        this.trOrderId = trOrderId;
    }

    public Long getTrUserId() {
        return trUserId;
    }

    public void setTrUserId(Long trUserId) {
        this.trUserId = trUserId;
    }

    public Long getTrTravelSellerId() {
        return trTravelSellerId;
    }

    public void setTrTravelSellerId(Long trTravelSellerId) {
        this.trTravelSellerId = trTravelSellerId;
    }

    public String getTrUserName() {
        return trUserName;
    }

    public void setTrUserName(String trUserName) {
        this.trUserName = trUserName == null ? null : trUserName.trim();
    }

    public String getTrUserPhone() {
        return trUserPhone;
    }

    public void setTrUserPhone(String trUserPhone) {
        this.trUserPhone = trUserPhone == null ? null : trUserPhone.trim();
    }

    public Long getTrTravelNum() {
        return trTravelNum;
    }

    public void setTrTravelNum(Long trTravelNum) {
        this.trTravelNum = trTravelNum;
    }

    public BigDecimal getTrTravelPrice() {
        return trTravelPrice;
    }

    public void setTrTravelPrice(BigDecimal trTravelPrice) {
        this.trTravelPrice = trTravelPrice;
    }

    public Long getTrTravelId() {
        return trTravelId;
    }

    public void setTrTravelId(Long trTravelId) {
        this.trTravelId = trTravelId;
    }

    public Date getTrCreateTime() {
        return trCreateTime;
    }

    public void setTrCreateTime(Date trCreateTime) {
        this.trCreateTime = trCreateTime;
    }

    public Date getTrPayTime() {
        return trPayTime;
    }

    public void setTrPayTime(Date trPayTime) {
        this.trPayTime = trPayTime;
    }

    public Integer getTrStatus() {
        return trStatus;
    }

    public void setTrStatus(Integer trStatus) {
        this.trStatus = trStatus;
    }

    public String getTrTransactionId() {
        return trTransactionId;
    }

    public void setTrTransactionId(String trTransactionId) {
        this.trTransactionId = trTransactionId == null ? null : trTransactionId.trim();
    }

    public BigDecimal getTrTravelTotalFee() {
        return trTravelTotalFee;
    }

    public void setTrTravelTotalFee(BigDecimal trTravelTotalFee) {
        this.trTravelTotalFee = trTravelTotalFee;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }
}