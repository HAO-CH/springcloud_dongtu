package com.dongtu.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 酒店商家表
 */
public class TbPubSeller implements Serializable {
    private Long pubSellerId;

    private String pubName;

    private String pubPassword;

    private Integer pubStatus;

    private String pubPic;

    private String pubAddress;

    private String pubLinkmanName;

    private String pubTelephone;

    private String pubBrief;

    private Date pubCreateTime;

    private String pubSalt;

    public Long getPubSellerId() {
        return pubSellerId;
    }

    public void setPubSellerId(Long pubSellerId) {
        this.pubSellerId = pubSellerId;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName == null ? null : pubName.trim();
    }

    public String getPubPassword() {
        return pubPassword;
    }

    public void setPubPassword(String pubPassword) {
        this.pubPassword = pubPassword == null ? null : pubPassword.trim();
    }

    public Integer getPubStatus() {
        return pubStatus;
    }

    public void setPubStatus(Integer pubStatus) {
        this.pubStatus = pubStatus;
    }

    public String getPubPic() {
        return pubPic;
    }

    public void setPubPic(String pubPic) {
        this.pubPic = pubPic == null ? null : pubPic.trim();
    }

    public String getPubAddress() {
        return pubAddress;
    }

    public void setPubAddress(String pubAddress) {
        this.pubAddress = pubAddress == null ? null : pubAddress.trim();
    }

    public String getPubLinkmanName() {
        return pubLinkmanName;
    }

    public void setPubLinkmanName(String pubLinkmanName) {
        this.pubLinkmanName = pubLinkmanName == null ? null : pubLinkmanName.trim();
    }

    public String getPubTelephone() {
        return pubTelephone;
    }

    public void setPubTelephone(String pubTelephone) {
        this.pubTelephone = pubTelephone == null ? null : pubTelephone.trim();
    }

    public String getPubBrief() {
        return pubBrief;
    }

    public void setPubBrief(String pubBrief) {
        this.pubBrief = pubBrief == null ? null : pubBrief.trim();
    }

    public Date getPubCreateTime() {
        return pubCreateTime;
    }

    public void setPubCreateTime(Date pubCreateTime) {
        this.pubCreateTime = pubCreateTime;
    }

    public String getPubSalt() {
        return pubSalt;
    }

    public void setPubSalt(String pubSalt) {
        this.pubSalt = pubSalt == null ? null : pubSalt.trim();
    }
}