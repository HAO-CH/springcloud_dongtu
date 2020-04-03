package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbPubOrder implements Serializable {
    private Long poOrderId;

    private Long poUserId;

    private Long poTravelSellerId;

    private String poUserName;

    private String poUserPhone;

    private Long poNum;

    private BigDecimal poPrice;

    private Long poTravelId;

    private Date poCreateTime;

    private Date poPayTime;

    private String poTransactionId;

    private Integer poStatus;

    private BigDecimal poTotalFee;

    public Long getPoOrderId() {
        return poOrderId;
    }

    public void setPoOrderId(Long poOrderId) {
        this.poOrderId = poOrderId;
    }

    public Long getPoUserId() {
        return poUserId;
    }

    public void setPoUserId(Long poUserId) {
        this.poUserId = poUserId;
    }

    public Long getPoTravelSellerId() {
        return poTravelSellerId;
    }

    public void setPoTravelSellerId(Long poTravelSellerId) {
        this.poTravelSellerId = poTravelSellerId;
    }

    public String getPoUserName() {
        return poUserName;
    }

    public void setPoUserName(String poUserName) {
        this.poUserName = poUserName == null ? null : poUserName.trim();
    }

    public String getPoUserPhone() {
        return poUserPhone;
    }

    public void setPoUserPhone(String poUserPhone) {
        this.poUserPhone = poUserPhone == null ? null : poUserPhone.trim();
    }

    public Long getPoNum() {
        return poNum;
    }

    public void setPoNum(Long poNum) {
        this.poNum = poNum;
    }

    public BigDecimal getPoPrice() {
        return poPrice;
    }

    public void setPoPrice(BigDecimal poPrice) {
        this.poPrice = poPrice;
    }

    public Long getPoTravelId() {
        return poTravelId;
    }

    public void setPoTravelId(Long poTravelId) {
        this.poTravelId = poTravelId;
    }

    public Date getPoCreateTime() {
        return poCreateTime;
    }

    public void setPoCreateTime(Date poCreateTime) {
        this.poCreateTime = poCreateTime;
    }

    public Date getPoPayTime() {
        return poPayTime;
    }

    public void setPoPayTime(Date poPayTime) {
        this.poPayTime = poPayTime;
    }

    public String getPoTransactionId() {
        return poTransactionId;
    }

    public void setPoTransactionId(String poTransactionId) {
        this.poTransactionId = poTransactionId == null ? null : poTransactionId.trim();
    }

    public Integer getPoStatus() {
        return poStatus;
    }

    public void setPoStatus(Integer poStatus) {
        this.poStatus = poStatus;
    }

    public BigDecimal getPoTotalFee() {
        return poTotalFee;
    }

    public void setPoTotalFee(BigDecimal poTotalFee) {
        this.poTotalFee = poTotalFee;
    }
}