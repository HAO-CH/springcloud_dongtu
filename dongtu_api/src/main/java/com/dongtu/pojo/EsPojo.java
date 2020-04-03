package com.dongtu.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ProjectName: springcloud_dongtu
 * @Package: com.dongtu.pojo
 * @ClassName: EsPojo
 * @Description: java类作用描述
 * @Author: 刘自豪
 * @CreateDate: 2020/1/2 9:10
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/1/2 9:10
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
@Document(indexName = "dongtu", type = "_doc")
public class EsPojo implements Serializable {
    @Id
    private Long tpId;
    @Field(type = FieldType.Text,searchAnalyzer = "ik_smart",analyzer = "ik_max_work")
    private String tpTitle;
    @Field(type = FieldType.Long)
    private Long tpNum;
    @Field(type = FieldType.Auto)
    private BigDecimal tpAdultPrice;
    @Field(type = FieldType.Auto)
    private BigDecimal tpChildPrice;
    @Field(type = FieldType.Text)
    private String tpImg;
    @Field(type = FieldType.Text,searchAnalyzer = "ik_smart",analyzer = "ik_max_work")
    private String tpAreaName;
    @Field(type = FieldType.Auto)
    private BigDecimal minPrice;
    @Field(type = FieldType.Auto)
    private BigDecimal maxPrice;
    @Field(type = FieldType.Text)
    private String tpSellerName;
    @Field(type = FieldType.Date)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tpGoTime;

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getTpTitle() {
        return tpTitle;
    }

    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle;
    }

    public Long getTpNum() {
        return tpNum;
    }

    public void setTpNum(Long tpNum) {
        this.tpNum = tpNum;
    }

    public BigDecimal getTpAdultPrice() {
        return tpAdultPrice;
    }

    public void setTpAdultPrice(BigDecimal tpAdultPrice) {
        this.tpAdultPrice = tpAdultPrice;
    }

    public BigDecimal getTpChildPrice() {
        return tpChildPrice;
    }

    public void setTpChildPrice(BigDecimal tpChildPrice) {
        this.tpChildPrice = tpChildPrice;
    }

    public String getTpImg() {
        return tpImg;
    }

    public void setTpImg(String tpImg) {
        this.tpImg = tpImg;
    }

    public String getTpAreaName() {
        return tpAreaName;
    }

    public void setTpAreaName(String tpAreaName) {
        this.tpAreaName = tpAreaName;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public Date getTpGoTime() {
        return tpGoTime;
    }

    public void setTpGoTime(Date tpGoTime) {
        this.tpGoTime = tpGoTime;
    }

    public String getTpSellerName() {
        return tpSellerName;
    }

    public void setTpSellerName(String tpSellerName) {
        this.tpSellerName = tpSellerName;
    }
}
