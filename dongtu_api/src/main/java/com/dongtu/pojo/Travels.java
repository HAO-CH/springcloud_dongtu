package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Document(collection = "Travels")
public class Travels{
    private  String travelsId;
    private  String titleImg;
    private Integer flags;
    private String userName;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date postedTime;

    private String trvelsContent;

    public String getTravelsId() {
        return travelsId;
    }

    public void setTravelsId(String travelsId) {
        this.travelsId = travelsId;
    }

    public String getTitleImg() {
        return titleImg;
    }

    public void setTitleImg(String titleImg) {
        this.titleImg = titleImg;
    }

    public Integer getFlags() {
        return flags;
    }

    public void setFlags(Integer flags) {
        this.flags = flags;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getPostedTime() {
        return postedTime;
    }

    public void setPostedTime(Date postedTime) {
        this.postedTime = postedTime;
    }

    public String getTrvelsContent() {
        return trvelsContent;
    }

    public void setTrvelsContent(String trvelsContent) {
        this.trvelsContent = trvelsContent;
    }
}
