package com.dongtu.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: HAO
 * @Date: 2019-12-18 12:42
 * @Desc:
 */
@Component
@ConfigurationProperties(prefix = "pay.alipay")
public class AlipayConfig {
    Logger logger = LoggerFactory.getLogger(getClass());
    /** 支付宝gatewayUrl */
    private String gatewayUrl;
    /** 商户应用id */
    private String app_id;
    /** RSA私钥，用于对商户请求报文加签 */
    private String merchant_private_key;
    /** 支付宝RSA公钥，用于验签支付宝应答 */
    private String alipay_public_key;
    /** 签名类型 */
    private String sign_type = "RSA2";
    /** 格式 */
    private String formate = "json";
    /** 编码 */
    private String charset = "UTF-8";
    /** 同步地址 */
    private String return_url;
    /** 异步地址 */
    private String notify_url;

    public Logger getLogger() {
        return logger;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    public String getGatewayUrl() {
        return gatewayUrl;
    }

    public void setGatewayUrl(String gatewayUrl) {
        this.gatewayUrl = gatewayUrl;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public String getMerchant_private_key() {
        return merchant_private_key;
    }

    public void setMerchant_private_key(String merchant_private_key) {
        this.merchant_private_key = merchant_private_key;
    }

    public String getAlipay_public_key() {
        return alipay_public_key;
    }

    public void setAlipay_public_key(String alipay_public_key) {
        this.alipay_public_key = alipay_public_key;
    }

    public String getSign_type() {
        return sign_type;
    }

    public void setSign_type(String sign_type) {
        this.sign_type = sign_type;
    }

    public String getFormate() {
        return formate;
    }

    public void setFormate(String formate) {
        this.formate = formate;
    }

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }
}
