package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbSeckillOrder implements Serializable {
    private Long seckillOrderId;

    private Long seckillId;

    private Long userId;

    private Long travelSellerId;

    private String userName;

    private String userPhone;

    private Long seckillOrderAdultNum;

    private Long seckillOrderChildNum;

    private Long seckillOrderRoomNum;

    private BigDecimal seckillOrderPrice;

    private BigDecimal seckillOrderCostPrice;

    private BigDecimal seckillOrderTotalMoney;

    private Date seckillOrderCreateTime;

    private Date seckillOrderPayTime;

    private Integer seckillOrderStatus;

    private String transactionId;

    private Long pubsId;

    private BigDecimal seckillOrderPubsCost;

    private Long insureId;

    private BigDecimal seckillOrderInsureCost;

    private Date tpGoTime;

    public Long getSeckillOrderId() {
        return seckillOrderId;
    }

    public void setSeckillOrderId(Long seckillOrderId) {
        this.seckillOrderId = seckillOrderId;
    }

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTravelSellerId() {
        return travelSellerId;
    }

    public void setTravelSellerId(Long travelSellerId) {
        this.travelSellerId = travelSellerId;
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

    public Long getSeckillOrderAdultNum() {
        return seckillOrderAdultNum;
    }

    public void setSeckillOrderAdultNum(Long seckillOrderAdultNum) {
        this.seckillOrderAdultNum = seckillOrderAdultNum;
    }

    public Long getSeckillOrderChildNum() {
        return seckillOrderChildNum;
    }

    public void setSeckillOrderChildNum(Long seckillOrderChildNum) {
        this.seckillOrderChildNum = seckillOrderChildNum;
    }

    public Long getSeckillOrderRoomNum() {
        return seckillOrderRoomNum;
    }

    public void setSeckillOrderRoomNum(Long seckillOrderRoomNum) {
        this.seckillOrderRoomNum = seckillOrderRoomNum;
    }

    public BigDecimal getSeckillOrderPrice() {
        return seckillOrderPrice;
    }

    public void setSeckillOrderPrice(BigDecimal seckillOrderPrice) {
        this.seckillOrderPrice = seckillOrderPrice;
    }

    public BigDecimal getSeckillOrderCostPrice() {
        return seckillOrderCostPrice;
    }

    public void setSeckillOrderCostPrice(BigDecimal seckillOrderCostPrice) {
        this.seckillOrderCostPrice = seckillOrderCostPrice;
    }

    public BigDecimal getSeckillOrderTotalMoney() {
        return seckillOrderTotalMoney;
    }

    public void setSeckillOrderTotalMoney(BigDecimal seckillOrderTotalMoney) {
        this.seckillOrderTotalMoney = seckillOrderTotalMoney;
    }

    public Date getSeckillOrderCreateTime() {
        return seckillOrderCreateTime;
    }

    public void setSeckillOrderCreateTime(Date seckillOrderCreateTime) {
        this.seckillOrderCreateTime = seckillOrderCreateTime;
    }

    public Date getSeckillOrderPayTime() {
        return seckillOrderPayTime;
    }

    public void setSeckillOrderPayTime(Date seckillOrderPayTime) {
        this.seckillOrderPayTime = seckillOrderPayTime;
    }

    public Integer getSeckillOrderStatus() {
        return seckillOrderStatus;
    }

    public void setSeckillOrderStatus(Integer seckillOrderStatus) {
        this.seckillOrderStatus = seckillOrderStatus;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId == null ? null : transactionId.trim();
    }

    public Long getPubsId() {
        return pubsId;
    }

    public void setPubsId(Long pubsId) {
        this.pubsId = pubsId;
    }

    public BigDecimal getSeckillOrderPubsCost() {
        return seckillOrderPubsCost;
    }

    public void setSeckillOrderPubsCost(BigDecimal seckillOrderPubsCost) {
        this.seckillOrderPubsCost = seckillOrderPubsCost;
    }

    public Long getInsureId() {
        return insureId;
    }

    public void setInsureId(Long insureId) {
        this.insureId = insureId;
    }

    public BigDecimal getSeckillOrderInsureCost() {
        return seckillOrderInsureCost;
    }

    public void setSeckillOrderInsureCost(BigDecimal seckillOrderInsureCost) {
        this.seckillOrderInsureCost = seckillOrderInsureCost;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }
}