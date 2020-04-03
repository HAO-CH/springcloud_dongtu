package com.dongtu.pojo;

import java.io.Serializable;

/**
 * 跟团游套餐表
 */
public class TbSetMeal implements Serializable {
    private Long smId;

    private String smSetmealsmSetmeal;

    public Long getSmId() {
        return smId;
    }

    public void setSmId(Long smId) {
        this.smId = smId;
    }

    public String getSmSetmealsmSetmeal() {
        return smSetmealsmSetmeal;
    }

    public void setSmSetmealsmSetmeal(String smSetmealsmSetmeal) {
        this.smSetmealsmSetmeal = smSetmealsmSetmeal == null ? null : smSetmealsmSetmeal.trim();
    }
}