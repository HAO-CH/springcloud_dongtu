package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbSellerPayLog implements Serializable {
    private Long spOrderId;

    private Long sellerId;

    private Date payTime;

    private BigDecimal payPrice;

    private Long payOrderId;

    private String payTransactionId;

    private Integer payStatus;

    public Long getSpOrderId() {
        return spOrderId;
    }

    public void setSpOrderId(Long spOrderId) {
        this.spOrderId = spOrderId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public BigDecimal getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(BigDecimal payPrice) {
        this.payPrice = payPrice;
    }

    public Long getPayOrderId() {
        return payOrderId;
    }

    public void setPayOrderId(Long payOrderId) {
        this.payOrderId = payOrderId;
    }

    public String getPayTransactionId() {
        return payTransactionId;
    }

    public void setPayTransactionId(String payTransactionId) {
        this.payTransactionId = payTransactionId == null ? null : payTransactionId.trim();
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
}