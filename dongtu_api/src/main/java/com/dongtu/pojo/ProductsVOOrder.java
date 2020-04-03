package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: ProductsVOOrder
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/4 15:54
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/4 15:54
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class ProductsVOOrder {
    //商品id
    private Long tpId;
    //支付时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date trPayTime;
    //支付总金额
    private BigDecimal trTravelTotalFee;
    //支付状态
    private Integer trStatus;
    //出游时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tpGoTime;
    //商品图片
    private String tpImg;
    //商品名称
    private String tpTitle;
    //订单id
    private Long trOrderId;

    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public Date getTrPayTime() {
        return trPayTime;
    }

    public void setTrPayTime(Date trPayTime) {
        this.trPayTime = trPayTime;
    }

    public BigDecimal getTrTravelTotalFee() {
        return trTravelTotalFee;
    }

    public void setTrTravelTotalFee(BigDecimal trTravelTotalFee) {
        this.trTravelTotalFee = trTravelTotalFee;
    }

    public Integer getTrStatus() {
        return trStatus;
    }

    public void setTrStatus(Integer trStatus) {
        this.trStatus = trStatus;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }

    public String getTpImg() {
        return tpImg;
    }

    public void setTpImg(String tpImg) {
        this.tpImg = tpImg;
    }

    public String getTpTitle() {
        return tpTitle;
    }

    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle;
    }

    public Long getTrOrderId() {
        return trOrderId;
    }

    public void setTrOrderId(Long trOrderId) {
        this.trOrderId = trOrderId;
    }
}
