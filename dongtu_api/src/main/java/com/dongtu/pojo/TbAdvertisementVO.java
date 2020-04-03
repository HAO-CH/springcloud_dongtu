package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class TbAdvertisementVO extends TbAdvertisement implements Serializable {

    private String mediaName;
    private String fieldName;
    private BigDecimal travelBalence;

    public BigDecimal getTravelBalence() {
        return travelBalence;
    }

    public void setTravelBalence(BigDecimal travelBalence) {
        this.travelBalence = travelBalence;
    }

    public String getMediaName() {
        return mediaName;
    }

    public void setMediaName(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }
}
