package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 地区表
 */
public class TbArea implements Serializable {
    private Long areaId;

    private String areaName;

    private Long areaPid;

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public Long getAreaPid() {
        return areaPid;
    }

    public void setAreaPid(Long areaPid) {
        this.areaPid = areaPid;
    }
}