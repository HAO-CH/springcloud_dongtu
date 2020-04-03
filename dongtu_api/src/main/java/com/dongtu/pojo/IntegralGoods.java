package com.dongtu.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 积分表
 */
public class IntegralGoods implements Serializable {
    private Long goodsId;

    private String goodsName;

    private BigDecimal goodsIntegral;

    private String goodsImage;

    private Long goodsNum;

    private String goodsText;

    private Long goodsInt;

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public BigDecimal getGoodsIntegral() {
        return goodsIntegral;
    }

    public void setGoodsIntegral(BigDecimal goodsIntegral) {
        this.goodsIntegral = goodsIntegral;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage == null ? null : goodsImage.trim();
    }

    public Long getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Long goodsNum) {
        this.goodsNum = goodsNum;
    }

    public String getGoodsText() {
        return goodsText;
    }

    public void setGoodsText(String goodsText) {
        this.goodsText = goodsText == null ? null : goodsText.trim();
    }

    public Long getGoodsInt() {
        return goodsInt;
    }

    public void setGoodsInt(Long goodsInt) {
        this.goodsInt = goodsInt;
    }
}