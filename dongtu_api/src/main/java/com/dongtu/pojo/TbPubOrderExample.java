package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPubOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPubOrderExample() {
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

        public Criteria andPoOrderIdIsNull() {
            addCriterion("po_order_id is null");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdIsNotNull() {
            addCriterion("po_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdEqualTo(Long value) {
            addCriterion("po_order_id =", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdNotEqualTo(Long value) {
            addCriterion("po_order_id <>", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdGreaterThan(Long value) {
            addCriterion("po_order_id >", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("po_order_id >=", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdLessThan(Long value) {
            addCriterion("po_order_id <", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("po_order_id <=", value, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdIn(List<Long> values) {
            addCriterion("po_order_id in", values, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdNotIn(List<Long> values) {
            addCriterion("po_order_id not in", values, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdBetween(Long value1, Long value2) {
            addCriterion("po_order_id between", value1, value2, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("po_order_id not between", value1, value2, "poOrderId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdIsNull() {
            addCriterion("po_user_id is null");
            return (Criteria) this;
        }

        public Criteria andPoUserIdIsNotNull() {
            addCriterion("po_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoUserIdEqualTo(Long value) {
            addCriterion("po_user_id =", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdNotEqualTo(Long value) {
            addCriterion("po_user_id <>", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdGreaterThan(Long value) {
            addCriterion("po_user_id >", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("po_user_id >=", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdLessThan(Long value) {
            addCriterion("po_user_id <", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdLessThanOrEqualTo(Long value) {
            addCriterion("po_user_id <=", value, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdIn(List<Long> values) {
            addCriterion("po_user_id in", values, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdNotIn(List<Long> values) {
            addCriterion("po_user_id not in", values, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdBetween(Long value1, Long value2) {
            addCriterion("po_user_id between", value1, value2, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoUserIdNotBetween(Long value1, Long value2) {
            addCriterion("po_user_id not between", value1, value2, "poUserId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdIsNull() {
            addCriterion("po_travel_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdIsNotNull() {
            addCriterion("po_travel_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdEqualTo(Long value) {
            addCriterion("po_travel_seller_id =", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdNotEqualTo(Long value) {
            addCriterion("po_travel_seller_id <>", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdGreaterThan(Long value) {
            addCriterion("po_travel_seller_id >", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("po_travel_seller_id >=", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdLessThan(Long value) {
            addCriterion("po_travel_seller_id <", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("po_travel_seller_id <=", value, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdIn(List<Long> values) {
            addCriterion("po_travel_seller_id in", values, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdNotIn(List<Long> values) {
            addCriterion("po_travel_seller_id not in", values, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdBetween(Long value1, Long value2) {
            addCriterion("po_travel_seller_id between", value1, value2, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoTravelSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("po_travel_seller_id not between", value1, value2, "poTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andPoUserNameIsNull() {
            addCriterion("po_user_name is null");
            return (Criteria) this;
        }

        public Criteria andPoUserNameIsNotNull() {
            addCriterion("po_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andPoUserNameEqualTo(String value) {
            addCriterion("po_user_name =", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameNotEqualTo(String value) {
            addCriterion("po_user_name <>", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameGreaterThan(String value) {
            addCriterion("po_user_name >", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("po_user_name >=", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameLessThan(String value) {
            addCriterion("po_user_name <", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameLessThanOrEqualTo(String value) {
            addCriterion("po_user_name <=", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameLike(String value) {
            addCriterion("po_user_name like", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameNotLike(String value) {
            addCriterion("po_user_name not like", value, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameIn(List<String> values) {
            addCriterion("po_user_name in", values, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameNotIn(List<String> values) {
            addCriterion("po_user_name not in", values, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameBetween(String value1, String value2) {
            addCriterion("po_user_name between", value1, value2, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserNameNotBetween(String value1, String value2) {
            addCriterion("po_user_name not between", value1, value2, "poUserName");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneIsNull() {
            addCriterion("po_user_phone is null");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneIsNotNull() {
            addCriterion("po_user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneEqualTo(String value) {
            addCriterion("po_user_phone =", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneNotEqualTo(String value) {
            addCriterion("po_user_phone <>", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneGreaterThan(String value) {
            addCriterion("po_user_phone >", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("po_user_phone >=", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneLessThan(String value) {
            addCriterion("po_user_phone <", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("po_user_phone <=", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneLike(String value) {
            addCriterion("po_user_phone like", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneNotLike(String value) {
            addCriterion("po_user_phone not like", value, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneIn(List<String> values) {
            addCriterion("po_user_phone in", values, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneNotIn(List<String> values) {
            addCriterion("po_user_phone not in", values, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneBetween(String value1, String value2) {
            addCriterion("po_user_phone between", value1, value2, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoUserPhoneNotBetween(String value1, String value2) {
            addCriterion("po_user_phone not between", value1, value2, "poUserPhone");
            return (Criteria) this;
        }

        public Criteria andPoNumIsNull() {
            addCriterion("po_num is null");
            return (Criteria) this;
        }

        public Criteria andPoNumIsNotNull() {
            addCriterion("po_num is not null");
            return (Criteria) this;
        }

        public Criteria andPoNumEqualTo(Long value) {
            addCriterion("po_num =", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumNotEqualTo(Long value) {
            addCriterion("po_num <>", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumGreaterThan(Long value) {
            addCriterion("po_num >", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("po_num >=", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumLessThan(Long value) {
            addCriterion("po_num <", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumLessThanOrEqualTo(Long value) {
            addCriterion("po_num <=", value, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumIn(List<Long> values) {
            addCriterion("po_num in", values, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumNotIn(List<Long> values) {
            addCriterion("po_num not in", values, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumBetween(Long value1, Long value2) {
            addCriterion("po_num between", value1, value2, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoNumNotBetween(Long value1, Long value2) {
            addCriterion("po_num not between", value1, value2, "poNum");
            return (Criteria) this;
        }

        public Criteria andPoPriceIsNull() {
            addCriterion("po_price is null");
            return (Criteria) this;
        }

        public Criteria andPoPriceIsNotNull() {
            addCriterion("po_price is not null");
            return (Criteria) this;
        }

        public Criteria andPoPriceEqualTo(BigDecimal value) {
            addCriterion("po_price =", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotEqualTo(BigDecimal value) {
            addCriterion("po_price <>", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceGreaterThan(BigDecimal value) {
            addCriterion("po_price >", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("po_price >=", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceLessThan(BigDecimal value) {
            addCriterion("po_price <", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("po_price <=", value, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceIn(List<BigDecimal> values) {
            addCriterion("po_price in", values, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotIn(List<BigDecimal> values) {
            addCriterion("po_price not in", values, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po_price between", value1, value2, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po_price not between", value1, value2, "poPrice");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdIsNull() {
            addCriterion("po_travel_id is null");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdIsNotNull() {
            addCriterion("po_travel_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdEqualTo(Long value) {
            addCriterion("po_travel_id =", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdNotEqualTo(Long value) {
            addCriterion("po_travel_id <>", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdGreaterThan(Long value) {
            addCriterion("po_travel_id >", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("po_travel_id >=", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdLessThan(Long value) {
            addCriterion("po_travel_id <", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdLessThanOrEqualTo(Long value) {
            addCriterion("po_travel_id <=", value, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdIn(List<Long> values) {
            addCriterion("po_travel_id in", values, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdNotIn(List<Long> values) {
            addCriterion("po_travel_id not in", values, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdBetween(Long value1, Long value2) {
            addCriterion("po_travel_id between", value1, value2, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoTravelIdNotBetween(Long value1, Long value2) {
            addCriterion("po_travel_id not between", value1, value2, "poTravelId");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeIsNull() {
            addCriterion("po_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeIsNotNull() {
            addCriterion("po_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeEqualTo(Date value) {
            addCriterion("po_create_time =", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeNotEqualTo(Date value) {
            addCriterion("po_create_time <>", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeGreaterThan(Date value) {
            addCriterion("po_create_time >", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("po_create_time >=", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeLessThan(Date value) {
            addCriterion("po_create_time <", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("po_create_time <=", value, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeIn(List<Date> values) {
            addCriterion("po_create_time in", values, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeNotIn(List<Date> values) {
            addCriterion("po_create_time not in", values, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("po_create_time between", value1, value2, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("po_create_time not between", value1, value2, "poCreateTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeIsNull() {
            addCriterion("po_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeIsNotNull() {
            addCriterion("po_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeEqualTo(Date value) {
            addCriterion("po_pay_time =", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeNotEqualTo(Date value) {
            addCriterion("po_pay_time <>", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeGreaterThan(Date value) {
            addCriterion("po_pay_time >", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("po_pay_time >=", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeLessThan(Date value) {
            addCriterion("po_pay_time <", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("po_pay_time <=", value, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeIn(List<Date> values) {
            addCriterion("po_pay_time in", values, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeNotIn(List<Date> values) {
            addCriterion("po_pay_time not in", values, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeBetween(Date value1, Date value2) {
            addCriterion("po_pay_time between", value1, value2, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("po_pay_time not between", value1, value2, "poPayTime");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdIsNull() {
            addCriterion("po_transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdIsNotNull() {
            addCriterion("po_transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdEqualTo(String value) {
            addCriterion("po_transaction_id =", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdNotEqualTo(String value) {
            addCriterion("po_transaction_id <>", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdGreaterThan(String value) {
            addCriterion("po_transaction_id >", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("po_transaction_id >=", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdLessThan(String value) {
            addCriterion("po_transaction_id <", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("po_transaction_id <=", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdLike(String value) {
            addCriterion("po_transaction_id like", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdNotLike(String value) {
            addCriterion("po_transaction_id not like", value, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdIn(List<String> values) {
            addCriterion("po_transaction_id in", values, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdNotIn(List<String> values) {
            addCriterion("po_transaction_id not in", values, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdBetween(String value1, String value2) {
            addCriterion("po_transaction_id between", value1, value2, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoTransactionIdNotBetween(String value1, String value2) {
            addCriterion("po_transaction_id not between", value1, value2, "poTransactionId");
            return (Criteria) this;
        }

        public Criteria andPoStatusIsNull() {
            addCriterion("po_status is null");
            return (Criteria) this;
        }

        public Criteria andPoStatusIsNotNull() {
            addCriterion("po_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoStatusEqualTo(Integer value) {
            addCriterion("po_status =", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotEqualTo(Integer value) {
            addCriterion("po_status <>", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusGreaterThan(Integer value) {
            addCriterion("po_status >", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("po_status >=", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusLessThan(Integer value) {
            addCriterion("po_status <", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("po_status <=", value, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusIn(List<Integer> values) {
            addCriterion("po_status in", values, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotIn(List<Integer> values) {
            addCriterion("po_status not in", values, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusBetween(Integer value1, Integer value2) {
            addCriterion("po_status between", value1, value2, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("po_status not between", value1, value2, "poStatus");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeIsNull() {
            addCriterion("po_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeIsNotNull() {
            addCriterion("po_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeEqualTo(BigDecimal value) {
            addCriterion("po_total_fee =", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("po_total_fee <>", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("po_total_fee >", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("po_total_fee >=", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeLessThan(BigDecimal value) {
            addCriterion("po_total_fee <", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("po_total_fee <=", value, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeIn(List<BigDecimal> values) {
            addCriterion("po_total_fee in", values, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("po_total_fee not in", values, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po_total_fee between", value1, value2, "poTotalFee");
            return (Criteria) this;
        }

        public Criteria andPoTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("po_total_fee not between", value1, value2, "poTotalFee");
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