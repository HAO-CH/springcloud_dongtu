package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author: HAO
 * @Date: 2019-12-31 14:02
 * @Desc:
 */
public class OrderParams implements Serializable {

    //1
    private Long sellerId;

    private String pubName;

    //2
    private Long prodId;

    private Long userId;

    private String uesrName;

    private String userPhone;

    private BigDecimal pionts;

    private Integer pointsToMoney;

    //3
    // 商品数量  统计卖出数量
    private Long travelNum;

    //4
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tpGoTime;

    //5
    // 旅游单价
    private BigDecimal prodPrice;

    //6
    private BigDecimal skillPrice;

    //7
    private BigDecimal pubPrice;

    private BigDecimal insurePrice;

    //8
    // 旅游花费金额
    private BigDecimal prodCost;

    //9
    private BigDecimal pubCost;

    private BigDecimal insureCost;

    // 总费用
    private BigDecimal totalFee;

    //10
    private Integer adultNum;

    //11
    private Integer childNum;

    //12
    private Integer pubNum;

    //13
    private Long pubId;

    private Long insureId;

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName;
    }

    public Integer getPointsToMoney() {
        return pointsToMoney;
    }

    public void setPointsToMoney(Integer pointsToMoney) {
        this.pointsToMoney = pointsToMoney;
    }

    public BigDecimal getPionts() {
        return pionts;
    }

    public void setPionts(BigDecimal pionts) {
        this.pionts = pionts;
    }

    public BigDecimal getSkillPrice() {
        return skillPrice;
    }

    public void setSkillPrice(BigDecimal skillPrice) {
        this.skillPrice = skillPrice;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public Long getProdId() {
        return prodId;
    }

    public void setProdId(Long prodId) {
        this.prodId = prodId;
    }

    public String getUesrName() {
        return uesrName;
    }

    public void setUesrName(String uesrName) {
        this.uesrName = uesrName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Long getTravelNum() {
        return travelNum;
    }

    public void setTravelNum(Long travelNum) {
        this.travelNum = travelNum;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }

    public BigDecimal getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(BigDecimal prodPrice) {
        this.prodPrice = prodPrice;
    }

    public BigDecimal getPubPrice() {
        return pubPrice;
    }

    public void setPubPrice(BigDecimal pubPrice) {
        this.pubPrice = pubPrice;
    }

    public BigDecimal getInsurePrice() {
        return insurePrice;
    }

    public void setInsurePrice(BigDecimal insurePrice) {
        this.insurePrice = insurePrice;
    }

    public BigDecimal getProdCost() {
        return prodCost;
    }

    public void setProdCost(BigDecimal prodCost) {
        this.prodCost = prodCost;
    }

    public BigDecimal getPubCost() {
        return pubCost;
    }

    public void setPubCost(BigDecimal pubCost) {
        this.pubCost = pubCost;
    }

    public BigDecimal getInsureCost() {
        return insureCost;
    }

    public void setInsureCost(BigDecimal insureCost) {
        this.insureCost = insureCost;
    }

    public BigDecimal getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
    }

    public Integer getAdultNum() {
        return adultNum;
    }

    public void setAdultNum(Integer adultNum) {
        this.adultNum = adultNum;
    }

    public Integer getChildNum() {
        return childNum;
    }

    public void setChildNum(Integer childNum) {
        this.childNum = childNum;
    }

    public Integer getPubNum() {
        return pubNum;
    }

    public void setPubNum(Integer pubNum) {
        this.pubNum = pubNum;
    }

    public Long getPubId() {
        return pubId;
    }

    public void setPubId(Long pubId) {
        this.pubId = pubId;
    }

    public Long getInsureId() {
        return insureId;
    }

    public void setInsureId(Long insureId) {
        this.insureId = insureId;
    }
}
