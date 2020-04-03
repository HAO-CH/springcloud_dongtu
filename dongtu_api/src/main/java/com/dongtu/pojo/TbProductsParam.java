package com.dongtu.pojo;

import java.io.Serializable;

public class TbProductsParam implements Serializable {
    private Long tpId;

    private String tpIntroduce;

    private String tpBuyNotes;

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getTpIntroduce() {
        return tpIntroduce;
    }

    public void setTpIntroduce(String tpIntroduce) {
        this.tpIntroduce = tpIntroduce == null ? null : tpIntroduce.trim();
    }

    public String getTpBuyNotes() {
        return tpBuyNotes;
    }

    public void setTpBuyNotes(String tpBuyNotes) {
        this.tpBuyNotes = tpBuyNotes == null ? null : tpBuyNotes.trim();
    }
}