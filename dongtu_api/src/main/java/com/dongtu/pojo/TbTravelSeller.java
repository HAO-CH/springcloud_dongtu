package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
/**
 * 旅游商家表
 */

public class TbTravelSeller implements Serializable {
    private Long travelSellerId;

    private String travelName;

    private String travelPassword;

    private Integer travelStatus;

    private BigDecimal travelBalence;

    private String travelPic;

    private String travelAddress;

    private String travelLinkmanName;

    private String travelTelephone;

    private String travelBrief;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date travelCreateTime;

    private String travelSalt;

    public Long getTravelSellerId() {
        return travelSellerId;
    }

    public void setTravelSellerId(Long travelSellerId) {
        this.travelSellerId = travelSellerId;
    }

    public String getTravelName() {
        return travelName;
    }

    public void setTravelName(String travelName) {
        this.travelName = travelName == null ? null : travelName.trim();
    }

    public String getTravelPassword() {
        return travelPassword;
    }

    public void setTravelPassword(String travelPassword) {
        this.travelPassword = travelPassword == null ? null : travelPassword.trim();
    }

    public Integer getTravelStatus() {
        return travelStatus;
    }

    public void setTravelStatus(Integer travelStatus) {
        this.travelStatus = travelStatus;
    }

    public BigDecimal getTravelBalence() {
        return travelBalence;
    }

    public void setTravelBalence(BigDecimal travelBalence) {
        this.travelBalence = travelBalence;
    }

    public String getTravelPic() {
        return travelPic;
    }

    public void setTravelPic(String travelPic) {
        this.travelPic = travelPic == null ? null : travelPic.trim();
    }

    public String getTravelAddress() {
        return travelAddress;
    }

    public void setTravelAddress(String travelAddress) {
        this.travelAddress = travelAddress == null ? null : travelAddress.trim();
    }

    public String getTravelLinkmanName() {
        return travelLinkmanName;
    }

    public void setTravelLinkmanName(String travelLinkmanName) {
        this.travelLinkmanName = travelLinkmanName == null ? null : travelLinkmanName.trim();
    }

    public String getTravelTelephone() {
        return travelTelephone;
    }

    public void setTravelTelephone(String travelTelephone) {
        this.travelTelephone = travelTelephone == null ? null : travelTelephone.trim();
    }

    public String getTravelBrief() {
        return travelBrief;
    }

    public void setTravelBrief(String travelBrief) {
        this.travelBrief = travelBrief == null ? null : travelBrief.trim();
    }

    public Date getTravelCreateTime() {
        return travelCreateTime;
    }

    public void setTravelCreateTime(Date travelCreateTime) {
        this.travelCreateTime = travelCreateTime;
    }

    public String getTravelSalt() {
        return travelSalt;
    }

    public void setTravelSalt(String travelSalt) {
        this.travelSalt = travelSalt == null ? null : travelSalt.trim();
    }
}