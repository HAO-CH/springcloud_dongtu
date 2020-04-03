package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TbSeckillProduct implements Serializable {
    private Long id;

    private Long seckillSpId;

    private String seckillTitle;

    private String seckillSmallPic;

    private String seckillDescPic;

    private BigDecimal seckillAdultPrice;

    private BigDecimal seckillAdultCostPrice;

    private BigDecimal seckillChildPrice;

    private BigDecimal seckillChildCostPrice;

    private Long seckillTravelSellerId;

    private Long seckillArea;

    private Long seckillType;

    private Integer seckillStatus;

    private Long seckillNum;

    private Long seckillStockCount;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date seckillStartDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date seckillEndDate;

    private String seckillProductDesc;

    private Long seckillPubId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tpGoTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeckillSpId() {
        return seckillSpId;
    }

    public void setSeckillSpId(Long seckillSpId) {
        this.seckillSpId = seckillSpId;
    }

    public String getSeckillTitle() {
        return seckillTitle;
    }

    public void setSeckillTitle(String seckillTitle) {
        this.seckillTitle = seckillTitle == null ? null : seckillTitle.trim();
    }

    public String getSeckillSmallPic() {
        return seckillSmallPic;
    }

    public void setSeckillSmallPic(String seckillSmallPic) {
        this.seckillSmallPic = seckillSmallPic == null ? null : seckillSmallPic.trim();
    }

    public String getSeckillDescPic() {
        return seckillDescPic;
    }

    public void setSeckillDescPic(String seckillDescPic) {
        this.seckillDescPic = seckillDescPic == null ? null : seckillDescPic.trim();
    }

    public BigDecimal getSeckillAdultPrice() {
        return seckillAdultPrice;
    }

    public void setSeckillAdultPrice(BigDecimal seckillAdultPrice) {
        this.seckillAdultPrice = seckillAdultPrice;
    }

    public BigDecimal getSeckillAdultCostPrice() {
        return seckillAdultCostPrice;
    }

    public void setSeckillAdultCostPrice(BigDecimal seckillAdultCostPrice) {
        this.seckillAdultCostPrice = seckillAdultCostPrice;
    }

    public BigDecimal getSeckillChildPrice() {
        return seckillChildPrice;
    }

    public void setSeckillChildPrice(BigDecimal seckillChildPrice) {
        this.seckillChildPrice = seckillChildPrice;
    }

    public BigDecimal getSeckillChildCostPrice() {
        return seckillChildCostPrice;
    }

    public void setSeckillChildCostPrice(BigDecimal seckillChildCostPrice) {
        this.seckillChildCostPrice = seckillChildCostPrice;
    }

    public Long getSeckillTravelSellerId() {
        return seckillTravelSellerId;
    }

    public void setSeckillTravelSellerId(Long seckillTravelSellerId) {
        this.seckillTravelSellerId = seckillTravelSellerId;
    }

    public Long getSeckillArea() {
        return seckillArea;
    }

    public void setSeckillArea(Long seckillArea) {
        this.seckillArea = seckillArea;
    }

    public Long getSeckillType() {
        return seckillType;
    }

    public void setSeckillType(Long seckillType) {
        this.seckillType = seckillType;
    }

    public Integer getSeckillStatus() {
        return seckillStatus;
    }

    public void setSeckillStatus(Integer seckillStatus) {
        this.seckillStatus = seckillStatus;
    }

    public Long getSeckillNum() {
        return seckillNum;
    }

    public void setSeckillNum(Long seckillNum) {
        this.seckillNum = seckillNum;
    }

    public Long getSeckillStockCount() {
        return seckillStockCount;
    }

    public void setSeckillStockCount(Long seckillStockCount) {
        this.seckillStockCount = seckillStockCount;
    }

    public Date getSeckillStartDate() {
        return seckillStartDate;
    }

    public void setSeckillStartDate(Date seckillStartDate) {
        this.seckillStartDate = seckillStartDate;
    }

    public Date getSeckillEndDate() {
        return seckillEndDate;
    }

    public void setSeckillEndDate(Date seckillEndDate) {
        this.seckillEndDate = seckillEndDate;
    }

    public String getSeckillProductDesc() {
        return seckillProductDesc;
    }

    public void setSeckillProductDesc(String seckillProductDesc) {
        this.seckillProductDesc = seckillProductDesc == null ? null : seckillProductDesc.trim();
    }

    public Long getSeckillPubId() {
        return seckillPubId;
    }

    public void setSeckillPubId(Long seckillPubId) {
        this.seckillPubId = seckillPubId;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }
}