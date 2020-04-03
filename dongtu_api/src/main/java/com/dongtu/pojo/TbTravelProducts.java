package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbTravelProducts implements Serializable {
    private Long tpId;

    private String tpTitle;

    private Long travelTypeId;

    private Long tpNum;

    private BigDecimal tpAdultPrice;

    private BigDecimal tpChildPrice;

    private String tpImg;

    private String tpSellerName;

    private Integer tpStatus;

    private Long tpAreaId;

    private Integer isDelete;

    private BigDecimal minPrice;

    private BigDecimal maxPrice;

    private Long tpSellerId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tpGoTime;

    private Long nid;

    private Long tpPubId;

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getTpTitle() {
        return tpTitle;
    }

    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle == null ? null : tpTitle.trim();
    }

    public Long getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(Long travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public Long getTpNum() {
        return tpNum;
    }

    public void setTpNum(Long tpNum) {
        this.tpNum = tpNum;
    }

    public BigDecimal getTpAdultPrice() {
        return tpAdultPrice;
    }

    public void setTpAdultPrice(BigDecimal tpAdultPrice) {
        this.tpAdultPrice = tpAdultPrice;
    }

    public BigDecimal getTpChildPrice() {
        return tpChildPrice;
    }

    public void setTpChildPrice(BigDecimal tpChildPrice) {
        this.tpChildPrice = tpChildPrice;
    }

    public String getTpImg() {
        return tpImg;
    }

    public void setTpImg(String tpImg) {
        this.tpImg = tpImg == null ? null : tpImg.trim();
    }

    public String getTpSellerName() {
        return tpSellerName;
    }

    public void setTpSellerName(String tpSellerName) {
        this.tpSellerName = tpSellerName == null ? null : tpSellerName.trim();
    }

    public Integer getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(Integer tpStatus) {
        this.tpStatus = tpStatus;
    }

    public Long getTpAreaId() {
        return tpAreaId;
    }

    public void setTpAreaId(Long tpAreaId) {
        this.tpAreaId = tpAreaId;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Long getTpSellerId() {
        return tpSellerId;
    }

    public void setTpSellerId(Long tpSellerId) {
        this.tpSellerId = tpSellerId;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }

    public Long getNid() {
        return nid;
    }

    public void setNid(Long nid) {
        this.nid = nid;
    }
}