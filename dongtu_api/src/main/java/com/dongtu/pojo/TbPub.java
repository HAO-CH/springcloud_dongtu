package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbPub implements Serializable {
    private Long pubsId;

    private Long pubsAreaId;

    private String pubsName;

    private BigDecimal pubsPrice;

    private String pubsPhone;

    private String pubsLinkman;

    private Integer pubsSatus;

    private Integer isDelete;

    private Long pubsSellerId;

    private String pubImg;

    public Long getPubsId() {
        return pubsId;
    }

    public void setPubsId(Long pubsId) {
        this.pubsId = pubsId;
    }

    public Long getPubsAreaId() {
        return pubsAreaId;
    }

    public void setPubsAreaId(Long pubsAreaId) {
        this.pubsAreaId = pubsAreaId;
    }

    public String getPubsName() {
        return pubsName;
    }

    public void setPubsName(String pubsName) {
        this.pubsName = pubsName == null ? null : pubsName.trim();
    }

    public BigDecimal getPubsPrice() {
        return pubsPrice;
    }

    public void setPubsPrice(BigDecimal pubsPrice) {
        this.pubsPrice = pubsPrice;
    }

    public String getPubsPhone() {
        return pubsPhone;
    }

    public void setPubsPhone(String pubsPhone) {
        this.pubsPhone = pubsPhone == null ? null : pubsPhone.trim();
    }

    public String getPubsLinkman() {
        return pubsLinkman;
    }

    public void setPubsLinkman(String pubsLinkman) {
        this.pubsLinkman = pubsLinkman == null ? null : pubsLinkman.trim();
    }

    public Integer getPubsSatus() {
        return pubsSatus;
    }

    public void setPubsSatus(Integer pubsSatus) {
        this.pubsSatus = pubsSatus;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Long getPubsSellerId() {
        return pubsSellerId;
    }

    public void setPubsSellerId(Long pubsSellerId) {
        this.pubsSellerId = pubsSellerId;
    }

    public String getPubImg() {
        return pubImg;
    }

    public void setPubImg(String pubImg) {
        this.pubImg = pubImg == null ? null : pubImg.trim();
    }
}