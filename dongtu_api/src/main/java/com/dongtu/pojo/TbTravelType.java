package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 旅游类型
 */
public class TbTravelType implements Serializable {
    private Long travelTypeId;

    private String travelTypeName;

    public Long getTravelTypeId() {
        return travelTypeId;
    }

    public void setTravelTypeId(Long travelTypeId) {
        this.travelTypeId = travelTypeId;
    }

    public String getTravelTypeName() {
        return travelTypeName;
    }

    public void setTravelTypeName(String travelTypeName) {
        this.travelTypeName = travelTypeName == null ? null : travelTypeName.trim();
    }
}