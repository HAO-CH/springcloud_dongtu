package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 保险表
 */
public class TbInsure implements Serializable {
    private Integer insureId;

    private String insureName;

    private Long insurePrice;

    private String insureContent;

    public Integer getInsureId() {
        return insureId;
    }

    public void setInsureId(Integer insureId) {
        this.insureId = insureId;
    }

    public String getInsureName() {
        return insureName;
    }

    public void setInsureName(String insureName) {
        this.insureName = insureName == null ? null : insureName.trim();
    }

    public Long getInsurePrice() {
        return insurePrice;
    }

    public void setInsurePrice(Long insurePrice) {
        this.insurePrice = insurePrice;
    }

    public String getInsureContent() {
        return insureContent;
    }

    public void setInsureContent(String insureContent) {
        this.insureContent = insureContent == null ? null : insureContent.trim();
    }
}