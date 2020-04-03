package com.dongtu.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbSkillGoods implements Serializable {
    private Long sid;

    private Long travelId;

    private String title;

    private Long price;

    private Long costPrice;

    private Long travelSellerId;

    private Date createTime;

    private Date checkTime;

    private Date startTime;

    private Date endTime;

    private Long num;

    private Long stockCount;

    private String introduction;

    private Long pubId;

    private Long areaId;

    private String insureIds;

    private Integer skillStatus;

    private byte[] smallPic;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getTravelId() {
        return travelId;
    }

    public void setTravelId(Long travelId) {
        this.travelId = travelId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Long costPrice) {
        this.costPrice = costPrice;
    }

    public Long getTravelSellerId() {
        return travelSellerId;
    }

    public void setTravelSellerId(Long travelSellerId) {
        this.travelSellerId = travelSellerId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getStockCount() {
        return stockCount;
    }

    public void setStockCount(Long stockCount) {
        this.stockCount = stockCount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Long getPubId() {
        return pubId;
    }

    public void setPubId(Long pubId) {
        this.pubId = pubId;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getInsureIds() {
        return insureIds;
    }

    public void setInsureIds(String insureIds) {
        this.insureIds = insureIds == null ? null : insureIds.trim();
    }

    public Integer getSkillStatus() {
        return skillStatus;
    }

    public void setSkillStatus(Integer skillStatus) {
        this.skillStatus = skillStatus;
    }

    public byte[] getSmallPic() {
        return smallPic;
    }

    public void setSmallPic(byte[] smallPic) {
        this.smallPic = smallPic;
    }
}