package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: SeckillVOOrder
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/11 0:26
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/11 0:26
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class SeckillVOOrder {
    //商品id
    private Long id;
    //商品图片
    private String seckillSmallPic;
    //商品名称
    private String seckillTitle;
    //订单id
    private Long seckillOrderId;
    //支付时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date seckillOrderPayTime;
    //支付总金额
    private BigDecimal seckillOrderTotalMoney;
    //支付状态
    private Integer seckillOrderStatus;

    private String trade_no;

    public String getTrade_no() {
        return trade_no;
    }

    public void setTrade_no(String trade_no) {
        this.trade_no = trade_no;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeckillSmallPic() {
        return seckillSmallPic;
    }

    public void setSeckillSmallPic(String seckillSmallPic) {
        this.seckillSmallPic = seckillSmallPic;
    }

    public String getSeckillTitle() {
        return seckillTitle;
    }

    public void setSeckillTitle(String seckillTitle) {
        this.seckillTitle = seckillTitle;
    }

    public Long getSeckillOrderId() {
        return seckillOrderId;
    }

    public void setSeckillOrderId(Long seckillOrderId) {
        this.seckillOrderId = seckillOrderId;
    }

    public Date getSeckillOrderPayTime() {
        return seckillOrderPayTime;
    }

    public void setSeckillOrderPayTime(Date seckillOrderPayTime) {
        this.seckillOrderPayTime = seckillOrderPayTime;
    }

    public BigDecimal getSeckillOrderTotalMoney() {
        return seckillOrderTotalMoney;
    }

    public void setSeckillOrderTotalMoney(BigDecimal seckillOrderTotalMoney) {
        this.seckillOrderTotalMoney = seckillOrderTotalMoney;
    }

    public Integer getSeckillOrderStatus() {
        return seckillOrderStatus;
    }

    public void setSeckillOrderStatus(Integer seckillOrderStatus) {
        this.seckillOrderStatus = seckillOrderStatus;
    }
}
