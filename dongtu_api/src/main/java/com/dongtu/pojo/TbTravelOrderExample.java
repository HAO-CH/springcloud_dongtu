package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbTravelOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTravelOrderExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andTrOrderIdIsNull() {
            addCriterion("tr_order_id is null");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdIsNotNull() {
            addCriterion("tr_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdEqualTo(Long value) {
            addCriterion("tr_order_id =", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdNotEqualTo(Long value) {
            addCriterion("tr_order_id <>", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdGreaterThan(Long value) {
            addCriterion("tr_order_id >", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_order_id >=", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdLessThan(Long value) {
            addCriterion("tr_order_id <", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_order_id <=", value, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdIn(List<Long> values) {
            addCriterion("tr_order_id in", values, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdNotIn(List<Long> values) {
            addCriterion("tr_order_id not in", values, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdBetween(Long value1, Long value2) {
            addCriterion("tr_order_id between", value1, value2, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_order_id not between", value1, value2, "trOrderId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdIsNull() {
            addCriterion("tr_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTrUserIdIsNotNull() {
            addCriterion("tr_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrUserIdEqualTo(Long value) {
            addCriterion("tr_user_id =", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdNotEqualTo(Long value) {
            addCriterion("tr_user_id <>", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdGreaterThan(Long value) {
            addCriterion("tr_user_id >", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_user_id >=", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdLessThan(Long value) {
            addCriterion("tr_user_id <", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_user_id <=", value, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdIn(List<Long> values) {
            addCriterion("tr_user_id in", values, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdNotIn(List<Long> values) {
            addCriterion("tr_user_id not in", values, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdBetween(Long value1, Long value2) {
            addCriterion("tr_user_id between", value1, value2, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrUserIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_user_id not between", value1, value2, "trUserId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdIsNull() {
            addCriterion("tr_travel_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdIsNotNull() {
            addCriterion("tr_travel_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdEqualTo(Long value) {
            addCriterion("tr_travel_seller_id =", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdNotEqualTo(Long value) {
            addCriterion("tr_travel_seller_id <>", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdGreaterThan(Long value) {
            addCriterion("tr_travel_seller_id >", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_travel_seller_id >=", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdLessThan(Long value) {
            addCriterion("tr_travel_seller_id <", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_travel_seller_id <=", value, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdIn(List<Long> values) {
            addCriterion("tr_travel_seller_id in", values, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdNotIn(List<Long> values) {
            addCriterion("tr_travel_seller_id not in", values, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdBetween(Long value1, Long value2) {
            addCriterion("tr_travel_seller_id between", value1, value2, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrTravelSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_travel_seller_id not between", value1, value2, "trTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andTrUserNameIsNull() {
            addCriterion("tr_user_name is null");
            return (Criteria) this;
        }

        public Criteria andTrUserNameIsNotNull() {
            addCriterion("tr_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andTrUserNameEqualTo(String value) {
            addCriterion("tr_user_name =", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameNotEqualTo(String value) {
            addCriterion("tr_user_name <>", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameGreaterThan(String value) {
            addCriterion("tr_user_name >", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("tr_user_name >=", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameLessThan(String value) {
            addCriterion("tr_user_name <", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameLessThanOrEqualTo(String value) {
            addCriterion("tr_user_name <=", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameLike(String value) {
            addCriterion("tr_user_name like", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameNotLike(String value) {
            addCriterion("tr_user_name not like", value, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameIn(List<String> values) {
            addCriterion("tr_user_name in", values, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameNotIn(List<String> values) {
            addCriterion("tr_user_name not in", values, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameBetween(String value1, String value2) {
            addCriterion("tr_user_name between", value1, value2, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserNameNotBetween(String value1, String value2) {
            addCriterion("tr_user_name not between", value1, value2, "trUserName");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneIsNull() {
            addCriterion("tr_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneIsNotNull() {
            addCriterion("tr_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneEqualTo(String value) {
            addCriterion("tr_user_phone =", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneNotEqualTo(String value) {
            addCriterion("tr_user_phone <>", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneGreaterThan(String value) {
            addCriterion("tr_user_phone >", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tr_user_phone >=", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneLessThan(String value) {
            addCriterion("tr_user_phone <", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("tr_user_phone <=", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneLike(String value) {
            addCriterion("tr_user_phone like", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneNotLike(String value) {
            addCriterion("tr_user_phone not like", value, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneIn(List<String> values) {
            addCriterion("tr_user_phone in", values, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneNotIn(List<String> values) {
            addCriterion("tr_user_phone not in", values, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneBetween(String value1, String value2) {
            addCriterion("tr_user_phone between", value1, value2, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrUserPhoneNotBetween(String value1, String value2) {
            addCriterion("tr_user_phone not between", value1, value2, "trUserPhone");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumIsNull() {
            addCriterion("tr_travel_num is null");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumIsNotNull() {
            addCriterion("tr_travel_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumEqualTo(Long value) {
            addCriterion("tr_travel_num =", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumNotEqualTo(Long value) {
            addCriterion("tr_travel_num <>", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumGreaterThan(Long value) {
            addCriterion("tr_travel_num >", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_travel_num >=", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumLessThan(Long value) {
            addCriterion("tr_travel_num <", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumLessThanOrEqualTo(Long value) {
            addCriterion("tr_travel_num <=", value, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumIn(List<Long> values) {
            addCriterion("tr_travel_num in", values, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumNotIn(List<Long> values) {
            addCriterion("tr_travel_num not in", values, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumBetween(Long value1, Long value2) {
            addCriterion("tr_travel_num between", value1, value2, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelNumNotBetween(Long value1, Long value2) {
            addCriterion("tr_travel_num not between", value1, value2, "trTravelNum");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceIsNull() {
            addCriterion("tr_travel_price is null");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceIsNotNull() {
            addCriterion("tr_travel_price is not null");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceEqualTo(BigDecimal value) {
            addCriterion("tr_travel_price =", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceNotEqualTo(BigDecimal value) {
            addCriterion("tr_travel_price <>", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceGreaterThan(BigDecimal value) {
            addCriterion("tr_travel_price >", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tr_travel_price >=", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceLessThan(BigDecimal value) {
            addCriterion("tr_travel_price <", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tr_travel_price <=", value, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceIn(List<BigDecimal> values) {
            addCriterion("tr_travel_price in", values, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceNotIn(List<BigDecimal> values) {
            addCriterion("tr_travel_price not in", values, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tr_travel_price between", value1, value2, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tr_travel_price not between", value1, value2, "trTravelPrice");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdIsNull() {
            addCriterion("tr_travel_id is null");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdIsNotNull() {
            addCriterion("tr_travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdEqualTo(Long value) {
            addCriterion("tr_travel_id =", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdNotEqualTo(Long value) {
            addCriterion("tr_travel_id <>", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdGreaterThan(Long value) {
            addCriterion("tr_travel_id >", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tr_travel_id >=", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdLessThan(Long value) {
            addCriterion("tr_travel_id <", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdLessThanOrEqualTo(Long value) {
            addCriterion("tr_travel_id <=", value, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdIn(List<Long> values) {
            addCriterion("tr_travel_id in", values, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdNotIn(List<Long> values) {
            addCriterion("tr_travel_id not in", values, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdBetween(Long value1, Long value2) {
            addCriterion("tr_travel_id between", value1, value2, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrTravelIdNotBetween(Long value1, Long value2) {
            addCriterion("tr_travel_id not between", value1, value2, "trTravelId");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeIsNull() {
            addCriterion("tr_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeIsNotNull() {
            addCriterion("tr_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeEqualTo(Date value) {
            addCriterion("tr_create_time =", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeNotEqualTo(Date value) {
            addCriterion("tr_create_time <>", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeGreaterThan(Date value) {
            addCriterion("tr_create_time >", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tr_create_time >=", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeLessThan(Date value) {
            addCriterion("tr_create_time <", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tr_create_time <=", value, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeIn(List<Date> values) {
            addCriterion("tr_create_time in", values, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeNotIn(List<Date> values) {
            addCriterion("tr_create_time not in", values, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tr_create_time between", value1, value2, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tr_create_time not between", value1, value2, "trCreateTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeIsNull() {
            addCriterion("tr_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeIsNotNull() {
            addCriterion("tr_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeEqualTo(Date value) {
            addCriterion("tr_pay_time =", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeNotEqualTo(Date value) {
            addCriterion("tr_pay_time <>", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeGreaterThan(Date value) {
            addCriterion("tr_pay_time >", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tr_pay_time >=", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeLessThan(Date value) {
            addCriterion("tr_pay_time <", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("tr_pay_time <=", value, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeIn(List<Date> values) {
            addCriterion("tr_pay_time in", values, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeNotIn(List<Date> values) {
            addCriterion("tr_pay_time not in", values, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeBetween(Date value1, Date value2) {
            addCriterion("tr_pay_time between", value1, value2, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("tr_pay_time not between", value1, value2, "trPayTime");
            return (Criteria) this;
        }

        public Criteria andTrStatusIsNull() {
            addCriterion("tr_status is null");
            return (Criteria) this;
        }

        public Criteria andTrStatusIsNotNull() {
            addCriterion("tr_status is not null");
            return (Criteria) this;
        }

        public Criteria andTrStatusEqualTo(Integer value) {
            addCriterion("tr_status =", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusNotEqualTo(Integer value) {
            addCriterion("tr_status <>", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusGreaterThan(Integer value) {
            addCriterion("tr_status >", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("tr_status >=", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusLessThan(Integer value) {
            addCriterion("tr_status <", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusLessThanOrEqualTo(Integer value) {
            addCriterion("tr_status <=", value, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusIn(List<Integer> values) {
            addCriterion("tr_status in", values, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusNotIn(List<Integer> values) {
            addCriterion("tr_status not in", values, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusBetween(Integer value1, Integer value2) {
            addCriterion("tr_status between", value1, value2, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("tr_status not between", value1, value2, "trStatus");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdIsNull() {
            addCriterion("tr_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdIsNotNull() {
            addCriterion("tr_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdEqualTo(String value) {
            addCriterion("tr_transaction_id =", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdNotEqualTo(String value) {
            addCriterion("tr_transaction_id <>", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdGreaterThan(String value) {
            addCriterion("tr_transaction_id >", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("tr_transaction_id >=", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdLessThan(String value) {
            addCriterion("tr_transaction_id <", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("tr_transaction_id <=", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdLike(String value) {
            addCriterion("tr_transaction_id like", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdNotLike(String value) {
            addCriterion("tr_transaction_id not like", value, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdIn(List<String> values) {
            addCriterion("tr_transaction_id in", values, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdNotIn(List<String> values) {
            addCriterion("tr_transaction_id not in", values, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdBetween(String value1, String value2) {
            addCriterion("tr_transaction_id between", value1, value2, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTransactionIdNotBetween(String value1, String value2) {
            addCriterion("tr_transaction_id not between", value1, value2, "trTransactionId");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeIsNull() {
            addCriterion("tr_travel_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeIsNotNull() {
            addCriterion("tr_travel_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeEqualTo(BigDecimal value) {
            addCriterion("tr_travel_total_fee =", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("tr_travel_total_fee <>", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("tr_travel_total_fee >", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tr_travel_total_fee >=", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeLessThan(BigDecimal value) {
            addCriterion("tr_travel_total_fee <", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tr_travel_total_fee <=", value, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeIn(List<BigDecimal> values) {
            addCriterion("tr_travel_total_fee in", values, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("tr_travel_total_fee not in", values, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tr_travel_total_fee between", value1, value2, "trTravelTotalFee");
            return (Criteria) this;
        }

        public Criteria andTrTravelTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tr_travel_total_fee not between", value1, value2, "trTravelTotalFee");
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
            addCriterionForJDBCDate("tp_go_time =", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("tp_go_time <>", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("tp_go_time >", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tp_go_time >=", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeLessThan(Date value) {
            addCriterionForJDBCDate("tp_go_time <", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("tp_go_time <=", value, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeIn(List<Date> values) {
            addCriterionForJDBCDate("tp_go_time in", values, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("tp_go_time not in", values, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tp_go_time between", value1, value2, "tpGoTime");
            return (Criteria) this;
        }

        public Criteria andTpGoTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("tp_go_time not between", value1, value2, "tpGoTime");
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