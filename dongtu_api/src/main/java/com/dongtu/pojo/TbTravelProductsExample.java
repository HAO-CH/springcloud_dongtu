package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTravelProductsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTravelProductsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTpIdIsNull() {
            addCriterion("tp_id is null");
            return (Criteria) this;
        }

        public Criteria andTpIdIsNotNull() {
            addCriterion("tp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpIdEqualTo(Long value) {
            addCriterion("tp_id =", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotEqualTo(Long value) {
            addCriterion("tp_id <>", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThan(Long value) {
            addCriterion("tp_id >", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_id >=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThan(Long value) {
            addCriterion("tp_id <", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThanOrEqualTo(Long value) {
            addCriterion("tp_id <=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdIn(List<Long> values) {
            addCriterion("tp_id in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotIn(List<Long> values) {
            addCriterion("tp_id not in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdBetween(Long value1, Long value2) {
            addCriterion("tp_id between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotBetween(Long value1, Long value2) {
            addCriterion("tp_id not between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpTitleIsNull() {
            addCriterion("tp_title is null");
            return (Criteria) this;
        }

        public Criteria andTpTitleIsNotNull() {
            addCriterion("tp_title is not null");
            return (Criteria) this;
        }

        public Criteria andTpTitleEqualTo(String value) {
            addCriterion("tp_title =", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleNotEqualTo(String value) {
            addCriterion("tp_title <>", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleGreaterThan(String value) {
            addCriterion("tp_title >", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleGreaterThanOrEqualTo(String value) {
            addCriterion("tp_title >=", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleLessThan(String value) {
            addCriterion("tp_title <", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleLessThanOrEqualTo(String value) {
            addCriterion("tp_title <=", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleLike(String value) {
            addCriterion("tp_title like", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleNotLike(String value) {
            addCriterion("tp_title not like", value, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleIn(List<String> values) {
            addCriterion("tp_title in", values, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleNotIn(List<String> values) {
            addCriterion("tp_title not in", values, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleBetween(String value1, String value2) {
            addCriterion("tp_title between", value1, value2, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTpTitleNotBetween(String value1, String value2) {
            addCriterion("tp_title not between", value1, value2, "tpTitle");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdIsNull() {
            addCriterion("travel_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdIsNotNull() {
            addCriterion("travel_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdEqualTo(Long value) {
            addCriterion("travel_type_id =", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdNotEqualTo(Long value) {
            addCriterion("travel_type_id <>", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdGreaterThan(Long value) {
            addCriterion("travel_type_id >", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("travel_type_id >=", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdLessThan(Long value) {
            addCriterion("travel_type_id <", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("travel_type_id <=", value, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdIn(List<Long> values) {
            addCriterion("travel_type_id in", values, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdNotIn(List<Long> values) {
            addCriterion("travel_type_id not in", values, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdBetween(Long value1, Long value2) {
            addCriterion("travel_type_id between", value1, value2, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("travel_type_id not between", value1, value2, "travelTypeId");
            return (Criteria) this;
        }

        public Criteria andTpNumIsNull() {
            addCriterion("tp_num is null");
            return (Criteria) this;
        }

        public Criteria andTpNumIsNotNull() {
            addCriterion("tp_num is not null");
            return (Criteria) this;
        }

        public Criteria andTpNumEqualTo(Long value) {
            addCriterion("tp_num =", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumNotEqualTo(Long value) {
            addCriterion("tp_num <>", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumGreaterThan(Long value) {
            addCriterion("tp_num >", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_num >=", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumLessThan(Long value) {
            addCriterion("tp_num <", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumLessThanOrEqualTo(Long value) {
            addCriterion("tp_num <=", value, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumIn(List<Long> values) {
            addCriterion("tp_num in", values, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumNotIn(List<Long> values) {
            addCriterion("tp_num not in", values, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumBetween(Long value1, Long value2) {
            addCriterion("tp_num between", value1, value2, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpNumNotBetween(Long value1, Long value2) {
            addCriterion("tp_num not between", value1, value2, "tpNum");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceIsNull() {
            addCriterion("tp_adult_price is null");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceIsNotNull() {
            addCriterion("tp_adult_price is not null");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceEqualTo(BigDecimal value) {
            addCriterion("tp_adult_price =", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceNotEqualTo(BigDecimal value) {
            addCriterion("tp_adult_price <>", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceGreaterThan(BigDecimal value) {
            addCriterion("tp_adult_price >", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_adult_price >=", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceLessThan(BigDecimal value) {
            addCriterion("tp_adult_price <", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_adult_price <=", value, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceIn(List<BigDecimal> values) {
            addCriterion("tp_adult_price in", values, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceNotIn(List<BigDecimal> values) {
            addCriterion("tp_adult_price not in", values, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_adult_price between", value1, value2, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpAdultPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_adult_price not between", value1, value2, "tpAdultPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceIsNull() {
            addCriterion("tp_child_price is null");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceIsNotNull() {
            addCriterion("tp_child_price is not null");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceEqualTo(BigDecimal value) {
            addCriterion("tp_child_price =", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceNotEqualTo(BigDecimal value) {
            addCriterion("tp_child_price <>", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceGreaterThan(BigDecimal value) {
            addCriterion("tp_child_price >", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_child_price >=", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceLessThan(BigDecimal value) {
            addCriterion("tp_child_price <", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tp_child_price <=", value, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceIn(List<BigDecimal> values) {
            addCriterion("tp_child_price in", values, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceNotIn(List<BigDecimal> values) {
            addCriterion("tp_child_price not in", values, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_child_price between", value1, value2, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpChildPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tp_child_price not between", value1, value2, "tpChildPrice");
            return (Criteria) this;
        }

        public Criteria andTpImgIsNull() {
            addCriterion("tp_img is null");
            return (Criteria) this;
        }

        public Criteria andTpImgIsNotNull() {
            addCriterion("tp_img is not null");
            return (Criteria) this;
        }

        public Criteria andTpImgEqualTo(String value) {
            addCriterion("tp_img =", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgNotEqualTo(String value) {
            addCriterion("tp_img <>", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgGreaterThan(String value) {
            addCriterion("tp_img >", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgGreaterThanOrEqualTo(String value) {
            addCriterion("tp_img >=", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgLessThan(String value) {
            addCriterion("tp_img <", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgLessThanOrEqualTo(String value) {
            addCriterion("tp_img <=", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgLike(String value) {
            addCriterion("tp_img like", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgNotLike(String value) {
            addCriterion("tp_img not like", value, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgIn(List<String> values) {
            addCriterion("tp_img in", values, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgNotIn(List<String> values) {
            addCriterion("tp_img not in", values, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgBetween(String value1, String value2) {
            addCriterion("tp_img between", value1, value2, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpImgNotBetween(String value1, String value2) {
            addCriterion("tp_img not between", value1, value2, "tpImg");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameIsNull() {
            addCriterion("tp_seller_name is null");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameIsNotNull() {
            addCriterion("tp_seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameEqualTo(String value) {
            addCriterion("tp_seller_name =", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameNotEqualTo(String value) {
            addCriterion("tp_seller_name <>", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameGreaterThan(String value) {
            addCriterion("tp_seller_name >", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("tp_seller_name >=", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameLessThan(String value) {
            addCriterion("tp_seller_name <", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameLessThanOrEqualTo(String value) {
            addCriterion("tp_seller_name <=", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameLike(String value) {
            addCriterion("tp_seller_name like", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameNotLike(String value) {
            addCriterion("tp_seller_name not like", value, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameIn(List<String> values) {
            addCriterion("tp_seller_name in", values, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameNotIn(List<String> values) {
            addCriterion("tp_seller_name not in", values, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameBetween(String value1, String value2) {
            addCriterion("tp_seller_name between", value1, value2, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpSellerNameNotBetween(String value1, String value2) {
            addCriterion("tp_seller_name not between", value1, value2, "tpSellerName");
            return (Criteria) this;
        }

        public Criteria andTpStatusIsNull() {
            addCriterion("tp_status is null");
            return (Criteria) this;
        }

        public Criteria andTpStatusIsNotNull() {
            addCriterion("tp_status is not null");
            return (Criteria) this;
        }

        public Criteria andTpStatusEqualTo(Integer value) {
            addCriterion("tp_status =", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusNotEqualTo(Integer value) {
            addCriterion("tp_status <>", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusGreaterThan(Integer value) {
            addCriterion("tp_status >", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tp_status >=", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusLessThan(Integer value) {
            addCriterion("tp_status <", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tp_status <=", value, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusIn(List<Integer> values) {
            addCriterion("tp_status in", values, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusNotIn(List<Integer> values) {
            addCriterion("tp_status not in", values, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusBetween(Integer value1, Integer value2) {
            addCriterion("tp_status between", value1, value2, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tp_status not between", value1, value2, "tpStatus");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdIsNull() {
            addCriterion("tp_area_id is null");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdIsNotNull() {
            addCriterion("tp_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdEqualTo(Long value) {
            addCriterion("tp_area_id =", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdNotEqualTo(Long value) {
            addCriterion("tp_area_id <>", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdGreaterThan(Long value) {
            addCriterion("tp_area_id >", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_area_id >=", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdLessThan(Long value) {
            addCriterion("tp_area_id <", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("tp_area_id <=", value, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdIn(List<Long> values) {
            addCriterion("tp_area_id in", values, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdNotIn(List<Long> values) {
            addCriterion("tp_area_id not in", values, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdBetween(Long value1, Long value2) {
            addCriterion("tp_area_id between", value1, value2, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andTpAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("tp_area_id not between", value1, value2, "tpAreaId");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNull() {
            addCriterion("min_price is null");
            return (Criteria) this;
        }

        public Criteria andMinPriceIsNotNull() {
            addCriterion("min_price is not null");
            return (Criteria) this;
        }

        public Criteria andMinPriceEqualTo(BigDecimal value) {
            addCriterion("min_price =", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotEqualTo(BigDecimal value) {
            addCriterion("min_price <>", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThan(BigDecimal value) {
            addCriterion("min_price >", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price >=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThan(BigDecimal value) {
            addCriterion("min_price <", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("min_price <=", value, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceIn(List<BigDecimal> values) {
            addCriterion("min_price in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotIn(List<BigDecimal> values) {
            addCriterion("min_price not in", values, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMinPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("min_price not between", value1, value2, "minPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNull() {
            addCriterion("max_price is null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIsNotNull() {
            addCriterion("max_price is not null");
            return (Criteria) this;
        }

        public Criteria andMaxPriceEqualTo(BigDecimal value) {
            addCriterion("max_price =", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotEqualTo(BigDecimal value) {
            addCriterion("max_price <>", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThan(BigDecimal value) {
            addCriterion("max_price >", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price >=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThan(BigDecimal value) {
            addCriterion("max_price <", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("max_price <=", value, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceIn(List<BigDecimal> values) {
            addCriterion("max_price in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotIn(List<BigDecimal> values) {
            addCriterion("max_price not in", values, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andMaxPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("max_price not between", value1, value2, "maxPrice");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdIsNull() {
            addCriterion("tp_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdIsNotNull() {
            addCriterion("tp_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdEqualTo(Long value) {
            addCriterion("tp_seller_id =", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdNotEqualTo(Long value) {
            addCriterion("tp_seller_id <>", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdGreaterThan(Long value) {
            addCriterion("tp_seller_id >", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_seller_id >=", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdLessThan(Long value) {
            addCriterion("tp_seller_id <", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("tp_seller_id <=", value, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdIn(List<Long> values) {
            addCriterion("tp_seller_id in", values, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdNotIn(List<Long> values) {
            addCriterion("tp_seller_id not in", values, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdBetween(Long value1, Long value2) {
            addCriterion("tp_seller_id between", value1, value2, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("tp_seller_id not between", value1, value2, "tpSellerId");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeIsNull() {
            addCriterion("tp_go_time is null");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeIsNotNull() {
            addCriterion("tp_go_time is not null");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeEqualTo(Date value) {
            addCriterion("tp_go_time =", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotEqualTo(Date value) {
            addCriterion("tp_go_time <>", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeGreaterThan(Date value) {
            addCriterion("tp_go_time >", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tp_go_time >=", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeLessThan(Date value) {
            addCriterion("tp_go_time <", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeLessThanOrEqualTo(Date value) {
            addCriterion("tp_go_time <=", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeIn(List<Date> values) {
            addCriterion("tp_go_time in", values, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotIn(List<Date> values) {
            addCriterion("tp_go_time not in", values, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeBetween(Date value1, Date value2) {
            addCriterion("tp_go_time between", value1, value2, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotBetween(Date value1, Date value2) {
            addCriterion("tp_go_time not between", value1, value2, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Long value) {
            addCriterion("nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Long value) {
            addCriterion("nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Long value) {
            addCriterion("nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Long value) {
            addCriterion("nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Long value) {
            addCriterion("nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Long value) {
            addCriterion("nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Long> values) {
            addCriterion("nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Long> values) {
            addCriterion("nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Long value1, Long value2) {
            addCriterion("nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Long value1, Long value2) {
            addCriterion("nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andTpPubIdIsNull() {
            addCriterion("tp_pub_id is null");
            return (Criteria) this;
        }

        public Criteria andTpPubIdIsNotNull() {
            addCriterion("tp_pub_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpPubIdEqualTo(Long value) {
            addCriterion("tp_pub_id =", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdNotEqualTo(Long value) {
            addCriterion("tp_pub_id <>", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdGreaterThan(Long value) {
            addCriterion("tp_pub_id >", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_pub_id >=", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdLessThan(Long value) {
            addCriterion("tp_pub_id <", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdLessThanOrEqualTo(Long value) {
            addCriterion("tp_pub_id <=", value, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdIn(List<Long> values) {
            addCriterion("tp_pub_id in", values, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdNotIn(List<Long> values) {
            addCriterion("tp_pub_id not in", values, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdBetween(Long value1, Long value2) {
            addCriterion("tp_pub_id between", value1, value2, "tpPubId");
            return (Criteria) this;
        }

        public Criteria andTpPubIdNotBetween(Long value1, Long value2) {
            addCriterion("tp_pub_id not between", value1, value2, "tpPubId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}