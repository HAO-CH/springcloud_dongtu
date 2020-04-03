package com.dongtu.pojo;

import java.io.Serializable;

/*
* 城市图片表
* */
public class TbAreaImg implements Serializable {
    private Long areaId;

    private String areaNameImg;

    private String areaName;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaNameImg() {
        return areaNameImg;
    }

    public void setAreaNameImg(String areaNameImg) {
        this.areaNameImg = areaNameImg == null ? null : areaNameImg.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }
}