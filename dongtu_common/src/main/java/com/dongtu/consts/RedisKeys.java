package com.dongtu.consts;

/**
 * @Author: HAO
 * @Date: 2019-12-31 09:45
 * @Desc:
 */
public class RedisKeys {

    // "order:" userId + 商品id 还未生成订单 类型:String ttl:30min
    public static final String UNFINNISHED_ORDER = "unfinnishedOrder:";

    // 用户订单信息
    public static final String ORDER_USER = "user:";

    // 用户订单信息
    public static final String ORDER_TYPE = "orderType:";

    // 用户类型
    public static final String ORDER_USER_TYPE = "userType:";

    // 支付、退款
    public static final String ORDER_PAY_REFUND = "orderPayRefund:";

    // 判断是否已经生成该订单，防止重复下单 key:userId+商品id+金额
    public static final String ORDER_IS_CREATED = "createOrder:";

    // 统计卖出商品数量  + 商品id
    public static final String PROD_SOLD_NUM = "prodSoldNum:";

    // 统计商家某个时间段 卖出商品数量
    public static final String COUNT_GOODS_SOLD = "countGoodsSold:";

    //秒杀库存  key：商品id
    public static final String NUM_ORDER = "inventory:";

    //广告扣费
    public static final String ADV_DEDUCTION = "advDeduction";

    //游记浏览
    public static final String TRAVEL_PAGE_VIEWS = "TravelPageViews";

    //收藏个数
    public static final String COLLECT_NUM = "collectNum";

    //打卡
    public static final String DA_KA = "daka";

    //积分商品库存
    public static final String NUM_INTEGRAL = "integral:";

    //积分商品
    public static final String INTEGRAL_JF = "goods:";

    //标签存放时间
    public static final String NOW_TIME = "nowTime:";

    //标签的存放数量
    public static final String LABLE_NUM = "lableNum";

    //标签的推送
    public static final String LAST_VALUE = "lastValue";

    // 用户登录
    public static final String LOGIN_USER = "loginUser";

}
