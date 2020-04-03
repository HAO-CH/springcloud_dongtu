package com.dongtu.consts;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author: HAO
 * @Date: 2019-12-25 21:45
 * @Desc:
 */

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ResultEnum {

    // 成功状态码
    SUCCESS(10000, "成功"),

    // 失败状态码
    FAILED(20000, "失败"),

    // 商品状态
    ORDER(30000,"商品"),

    // 查询成功
    FIND_SUCCESS(10000, "查询成功"),

    // 增加成功
    INSERT_SUCCESS(10000, "增加成功"),

    // 增加失败
    INSERT_FAILED(20000, "增加失败"),

    // 修改成功
    UPDATE_SUCCESS(10000, "修改成功"),

    // 删除成功
    DELETE_SUCCESS(10000, "删除成功"),

    // 登录成功
    LOGIN_SUCCESS(10000, "登录成功"),

    // 注册成功
    REGISTER_SUCCESS(10000, "注册成功"),

    // 短信发送成功
    SEND_MESSAGE_SUCCESS(10000, "短信发送成功"),

    // 秒杀成功
    SECKILL_SUCCESS(10000, "秒杀成功"),

    // 支付成功
    PAID_SUCCESS(10000, "支付成功"),

    // 退款成功
    REFUND_SUCCESS(10000, "支付成功"),

    // 评论成功
    COMMENT_SUCCESS(10000, "评论成功"),

    // 订单生成成功
    CREATE_ORDER_SUCCESS(10000, "订单生成成功"),

    // 查询失败
    FIND_FAILED(20000, "查询失败"),

    // 修改失败
    UPDATE_FAILED(20000, "修改失败"),

    // 删除失败
    DELETE_FAILED(20000, "删除失败"),

    // 登录失败
    LOGIN_FAILED(20000, "登录失败"),

    // 注册失败
    REGISTER_FAILED(20000, "注册失败"),

    // 短信发送失败
    SEND_MESSAGE_FAILED(20000, "短信发送失败"),

    // 秒杀失败
    SECKILL_FAILED(20000, "秒杀失败"),

    // 支付失败
    PAID_FAILED(20000, "支付失败"),

    // 退款成功
    REFUND_FAILED(20000, "退款失败"),

    // 评论失败
    COMMENT_FAILED(20000, "评论失败"),

    // 订单生成失败
    CREATE_ORDER_FAILED(20000, "订单生成失败"),

    //账号或密码未填写
    PASSNULL_REGISTER(20000,"账号或密码未填写"),

    //请登录
    PLEASE_LOG_IN(20000,"请登录"),

    //购买成功
    PURCHASE_SUCCEEDS(10000,"购买成功"),

    //不可重复购买
    IN_ORDER_TO_BUY_A(30000,"不可重复购买"),

    //已经卖光
    HAS_BEEN_SOLD_OUT(30000,"已经卖光"),

    //商品不存在
    GOODS_DO_NET_EXIST(30000,"商品不存在"),

    //积分不足
    LACK_OF_INTEGRAL(30000,"积分不足"),
    // 用户不存在
    USER_NOT_EXISTS(20000,"用户不存在"),

    //已打卡
    HAS_CLOCK_DAKA(20000,"已打卡,请明天继续坚持"),
    //已打卡
    DAKA_SUCCESS(10000,"打卡成功,增加10积分");

    private Integer code;

    private String message;

}
