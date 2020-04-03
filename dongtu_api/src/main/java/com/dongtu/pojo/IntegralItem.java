package com.dongtu.pojo;

import java.math.BigDecimal;

public class IntegralItem {
    private String integralIdwork;

    private String intemName;

    private String intemPhone;

    private Long userId;

    private BigDecimal integralTotalPrice;

    private Integer integralNum;

    private String integralSite;

    private Long goodsId;

    public String getIntegralIdwork() {
        return integralIdwork;
    }

    public void setIntegralIdwork(String integralIdwork) {
        this.integralIdwork = integralIdwork == null ? null : integralIdwork.trim();
    }

    public String getIntemName() {
        return intemName;
    }

    public void setIntemName(String intemName) {
        this.intemName = intemName == null ? null : intemName.trim();
    }

    public String getIntemPhone() {
        return intemPhone;
    }

    public void setIntemPhone(String intemPhone) {
        this.intemPhone = intemPhone == null ? null : intemPhone.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public BigDecimal getIntegralTotalPrice() {
        return integralTotalPrice;
    }

    public void setIntegralTotalPrice(BigDecimal integralTotalPrice) {
        this.integralTotalPrice = integralTotalPrice;
    }

    public Integer getIntegralNum() {
        return integralNum;
    }

    public void setIntegralNum(Integer integralNum) {
        this.integralNum = integralNum;
    }

    public String getIntegralSite() {
        return integralSite;
    }

    public void setIntegralSite(String integralSite) {
        this.integralSite = integralSite == null ? null : integralSite.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }
}