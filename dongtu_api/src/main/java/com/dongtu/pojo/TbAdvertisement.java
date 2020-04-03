package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class TbAdvertisement implements Serializable {
    private Long adId;

    private String adName;

    private Long adMediaTypeId;

    private Long adFieldId;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CMT+8")
    private Date adStartTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "CMT+8")
    private Date adEndTime;

    private String adLink;

    private String adImg;

    private String adImgurl;

    private Integer isOpen;

    private String adLinkMan;

    private String adEmail;

    private String adPhone;

    private Long adTraverlSellerId;

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public String getAdName() {
        return adName;
    }

    public void setAdName(String adName) {
        this.adName = adName == null ? null : adName.trim();
    }

    public Long getAdMediaTypeId() {
        return adMediaTypeId;
    }

    public void setAdMediaTypeId(Long adMediaTypeId) {
        this.adMediaTypeId = adMediaTypeId;
    }

    public Long getAdFieldId() {
        return adFieldId;
    }

    public void setAdFieldId(Long adFieldId) {
        this.adFieldId = adFieldId;
    }

    public Date getAdStartTime() {
        return adStartTime;
    }

    public void setAdStartTime(Date adStartTime) {
        this.adStartTime = adStartTime;
    }

    public Date getAdEndTime() {
        return adEndTime;
    }

    public void setAdEndTime(Date adEndTime) {
        this.adEndTime = adEndTime;
    }

    public String getAdLink() {
        return adLink;
    }

    public void setAdLink(String adLink) {
        this.adLink = adLink == null ? null : adLink.trim();
    }

    public String getAdImg() {
        return adImg;
    }

    public void setAdImg(String adImg) {
        this.adImg = adImg == null ? null : adImg.trim();
    }

    public String getAdImgurl() {
        return adImgurl;
    }

    public void setAdImgurl(String adImgurl) {
        this.adImgurl = adImgurl == null ? null : adImgurl.trim();
    }

    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }

    public String getAdLinkMan() {
        return adLinkMan;
    }

    public void setAdLinkMan(String adLinkMan) {
        this.adLinkMan = adLinkMan == null ? null : adLinkMan.trim();
    }

    public String getAdEmail() {
        return adEmail;
    }

    public void setAdEmail(String adEmail) {
        this.adEmail = adEmail == null ? null : adEmail.trim();
    }

    public String getAdPhone() {
        return adPhone;
    }

    public void setAdPhone(String adPhone) {
        this.adPhone = adPhone == null ? null : adPhone.trim();
    }

    public Long getAdTraverlSellerId() {
        return adTraverlSellerId;
    }

    public void setAdTraverlSellerId(Long adTraverlSellerId) {
        this.adTraverlSellerId = adTraverlSellerId;
    }
}