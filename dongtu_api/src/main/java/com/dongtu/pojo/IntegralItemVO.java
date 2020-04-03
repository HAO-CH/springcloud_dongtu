package com.dongtu.pojo;

import java.math.BigDecimal;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: IntegralItemVO
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/11 9:52
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/11 9:52
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class IntegralItemVO {
    //订单号
    private String integralIdwork;
    //收货人
    private String intemName;
    //收货人手机号
    private String intemPhone;
    //购买数量
    private Integer integralNum;
    //总价
    private BigDecimal integralTotalPrice;
    //商品图片
    private String goodsImage;
    //商品名称
    private String goodsName;

    public String getIntegralIdwork() {
        return integralIdwork;
    }

    public void setIntegralIdwork(String integralIdwork) {
        this.integralIdwork = integralIdwork;
    }

    public String getIntemName() {
        return intemName;
    }

    public void setIntemName(String intemName) {
        this.intemName = intemName;
    }

    public String getIntemPhone() {
        return intemPhone;
    }

    public void setIntemPhone(String intemPhone) {
        this.intemPhone = intemPhone;
    }

    public Integer getIntegralNum() {
        return integralNum;
    }

    public void setIntegralNum(Integer integralNum) {
        this.integralNum = integralNum;
    }

    public BigDecimal getIntegralTotalPrice() {
        return integralTotalPrice;
    }

    public void setIntegralTotalPrice(BigDecimal integralTotalPrice) {
        this.integralTotalPrice = integralTotalPrice;
    }

    public String getGoodsImage() {
        return goodsImage;
    }

    public void setGoodsImage(String goodsImage) {
        this.goodsImage = goodsImage;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }
}
