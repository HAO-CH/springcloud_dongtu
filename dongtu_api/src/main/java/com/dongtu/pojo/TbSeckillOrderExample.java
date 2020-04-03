package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbSeckillOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSeckillOrderExample() {
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

        public Criteria andSeckillOrderIdIsNull() {
            addCriterion("seckill_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdIsNotNull() {
            addCriterion("seckill_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdEqualTo(Long value) {
            addCriterion("seckill_order_id =", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdNotEqualTo(Long value) {
            addCriterion("seckill_order_id <>", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdGreaterThan(Long value) {
            addCriterion("seckill_order_id >", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_order_id >=", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdLessThan(Long value) {
            addCriterion("seckill_order_id <", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_order_id <=", value, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdIn(List<Long> values) {
            addCriterion("seckill_order_id in", values, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdNotIn(List<Long> values) {
            addCriterion("seckill_order_id not in", values, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdBetween(Long value1, Long value2) {
            addCriterion("seckill_order_id between", value1, value2, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_order_id not between", value1, value2, "seckillOrderId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIsNull() {
            addCriterion("seckill_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIsNotNull() {
            addCriterion("seckill_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillIdEqualTo(Long value) {
            addCriterion("seckill_id =", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotEqualTo(Long value) {
            addCriterion("seckill_id <>", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdGreaterThan(Long value) {
            addCriterion("seckill_id >", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_id >=", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdLessThan(Long value) {
            addCriterion("seckill_id <", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_id <=", value, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdIn(List<Long> values) {
            addCriterion("seckill_id in", values, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotIn(List<Long> values) {
            addCriterion("seckill_id not in", values, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdBetween(Long value1, Long value2) {
            addCriterion("seckill_id between", value1, value2, "seckillId");
            return (Criteria) this;
        }

        public Criteria andSeckillIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_id not between", value1, value2, "seckillId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdIsNull() {
            addCriterion("travel_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdIsNotNull() {
            addCriterion("travel_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdEqualTo(Long value) {
            addCriterion("travel_seller_id =", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotEqualTo(Long value) {
            addCriterion("travel_seller_id <>", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdGreaterThan(Long value) {
            addCriterion("travel_seller_id >", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("travel_seller_id >=", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdLessThan(Long value) {
            addCriterion("travel_seller_id <", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("travel_seller_id <=", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdIn(List<Long> values) {
            addCriterion("travel_seller_id in", values, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotIn(List<Long> values) {
            addCriterion("travel_seller_id not in", values, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdBetween(Long value1, Long value2) {
            addCriterion("travel_seller_id between", value1, value2, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("travel_seller_id not between", value1, value2, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumIsNull() {
            addCriterion("seckill_order_adult_num is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumIsNotNull() {
            addCriterion("seckill_order_adult_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumEqualTo(Long value) {
            addCriterion("seckill_order_adult_num =", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumNotEqualTo(Long value) {
            addCriterion("seckill_order_adult_num <>", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumGreaterThan(Long value) {
            addCriterion("seckill_order_adult_num >", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_order_adult_num >=", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumLessThan(Long value) {
            addCriterion("seckill_order_adult_num <", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumLessThanOrEqualTo(Long value) {
            addCriterion("seckill_order_adult_num <=", value, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumIn(List<Long> values) {
            addCriterion("seckill_order_adult_num in", values, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumNotIn(List<Long> values) {
            addCriterion("seckill_order_adult_num not in", values, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumBetween(Long value1, Long value2) {
            addCriterion("seckill_order_adult_num between", value1, value2, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderAdultNumNotBetween(Long value1, Long value2) {
            addCriterion("seckill_order_adult_num not between", value1, value2, "seckillOrderAdultNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumIsNull() {
            addCriterion("seckill_order_child_num is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumIsNotNull() {
            addCriterion("seckill_order_child_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumEqualTo(Long value) {
            addCriterion("seckill_order_child_num =", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumNotEqualTo(Long value) {
            addCriterion("seckill_order_child_num <>", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumGreaterThan(Long value) {
            addCriterion("seckill_order_child_num >", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_order_child_num >=", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumLessThan(Long value) {
            addCriterion("seckill_order_child_num <", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumLessThanOrEqualTo(Long value) {
            addCriterion("seckill_order_child_num <=", value, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumIn(List<Long> values) {
            addCriterion("seckill_order_child_num in", values, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumNotIn(List<Long> values) {
            addCriterion("seckill_order_child_num not in", values, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumBetween(Long value1, Long value2) {
            addCriterion("seckill_order_child_num between", value1, value2, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderChildNumNotBetween(Long value1, Long value2) {
            addCriterion("seckill_order_child_num not between", value1, value2, "seckillOrderChildNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumIsNull() {
            addCriterion("seckill_order_room_num is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumIsNotNull() {
            addCriterion("seckill_order_room_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumEqualTo(Long value) {
            addCriterion("seckill_order_room_num =", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumNotEqualTo(Long value) {
            addCriterion("seckill_order_room_num <>", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumGreaterThan(Long value) {
            addCriterion("seckill_order_room_num >", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_order_room_num >=", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumLessThan(Long value) {
            addCriterion("seckill_order_room_num <", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumLessThanOrEqualTo(Long value) {
            addCriterion("seckill_order_room_num <=", value, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumIn(List<Long> values) {
            addCriterion("seckill_order_room_num in", values, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumNotIn(List<Long> values) {
            addCriterion("seckill_order_room_num not in", values, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumBetween(Long value1, Long value2) {
            addCriterion("seckill_order_room_num between", value1, value2, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderRoomNumNotBetween(Long value1, Long value2) {
            addCriterion("seckill_order_room_num not between", value1, value2, "seckillOrderRoomNum");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceIsNull() {
            addCriterion("seckill_order_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceIsNotNull() {
            addCriterion("seckill_order_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_order_price =", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_order_price <>", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_order_price >", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_price >=", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceLessThan(BigDecimal value) {
            addCriterion("seckill_order_price <", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_price <=", value, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_order_price in", values, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_order_price not in", values, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_price between", value1, value2, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_price not between", value1, value2, "seckillOrderPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceIsNull() {
            addCriterion("seckill_order_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceIsNotNull() {
            addCriterion("seckill_order_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_order_cost_price =", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_order_cost_price <>", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_order_cost_price >", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_cost_price >=", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceLessThan(BigDecimal value) {
            addCriterion("seckill_order_cost_price <", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_cost_price <=", value, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_order_cost_price in", values, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_order_cost_price not in", values, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_cost_price between", value1, value2, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_cost_price not between", value1, value2, "seckillOrderCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyIsNull() {
            addCriterion("seckill_order_total_money is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyIsNotNull() {
            addCriterion("seckill_order_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("seckill_order_total_money =", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("seckill_order_total_money <>", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("seckill_order_total_money >", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_total_money >=", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyLessThan(BigDecimal value) {
            addCriterion("seckill_order_total_money <", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_total_money <=", value, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("seckill_order_total_money in", values, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("seckill_order_total_money not in", values, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_total_money between", value1, value2, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_total_money not between", value1, value2, "seckillOrderTotalMoney");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeIsNull() {
            addCriterion("seckill_order_create_time is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeIsNotNull() {
            addCriterion("seckill_order_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeEqualTo(Date value) {
            addCriterion("seckill_order_create_time =", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeNotEqualTo(Date value) {
            addCriterion("seckill_order_create_time <>", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeGreaterThan(Date value) {
            addCriterion("seckill_order_create_time >", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seckill_order_create_time >=", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeLessThan(Date value) {
            addCriterion("seckill_order_create_time <", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("seckill_order_create_time <=", value, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeIn(List<Date> values) {
            addCriterion("seckill_order_create_time in", values, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeNotIn(List<Date> values) {
            addCriterion("seckill_order_create_time not in", values, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeBetween(Date value1, Date value2) {
            addCriterion("seckill_order_create_time between", value1, value2, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("seckill_order_create_time not between", value1, value2, "seckillOrderCreateTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeIsNull() {
            addCriterion("seckill_order_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeIsNotNull() {
            addCriterion("seckill_order_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeEqualTo(Date value) {
            addCriterion("seckill_order_pay_time =", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeNotEqualTo(Date value) {
            addCriterion("seckill_order_pay_time <>", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeGreaterThan(Date value) {
            addCriterion("seckill_order_pay_time >", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("seckill_order_pay_time >=", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeLessThan(Date value) {
            addCriterion("seckill_order_pay_time <", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("seckill_order_pay_time <=", value, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeIn(List<Date> values) {
            addCriterion("seckill_order_pay_time in", values, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeNotIn(List<Date> values) {
            addCriterion("seckill_order_pay_time not in", values, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeBetween(Date value1, Date value2) {
            addCriterion("seckill_order_pay_time between", value1, value2, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("seckill_order_pay_time not between", value1, value2, "seckillOrderPayTime");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusIsNull() {
            addCriterion("seckill_order_status is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusIsNotNull() {
            addCriterion("seckill_order_status is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusEqualTo(Integer value) {
            addCriterion("seckill_order_status =", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusNotEqualTo(Integer value) {
            addCriterion("seckill_order_status <>", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusGreaterThan(Integer value) {
            addCriterion("seckill_order_status >", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_order_status >=", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusLessThan(Integer value) {
            addCriterion("seckill_order_status <", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_order_status <=", value, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusIn(List<Integer> values) {
            addCriterion("seckill_order_status in", values, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusNotIn(List<Integer> values) {
            addCriterion("seckill_order_status not in", values, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("seckill_order_status between", value1, value2, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_order_status not between", value1, value2, "seckillOrderStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andPubsIdIsNull() {
            addCriterion("pubs_id is null");
            return (Criteria) this;
        }

        public Criteria andPubsIdIsNotNull() {
            addCriterion("pubs_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubsIdEqualTo(Long value) {
            addCriterion("pubs_id =", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotEqualTo(Long value) {
            addCriterion("pubs_id <>", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdGreaterThan(Long value) {
            addCriterion("pubs_id >", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pubs_id >=", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdLessThan(Long value) {
            addCriterion("pubs_id <", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdLessThanOrEqualTo(Long value) {
            addCriterion("pubs_id <=", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdIn(List<Long> values) {
            addCriterion("pubs_id in", values, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotIn(List<Long> values) {
            addCriterion("pubs_id not in", values, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdBetween(Long value1, Long value2) {
            addCriterion("pubs_id between", value1, value2, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotBetween(Long value1, Long value2) {
            addCriterion("pubs_id not between", value1, value2, "pubsId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostIsNull() {
            addCriterion("seckill_order_pubs_cost is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostIsNotNull() {
            addCriterion("seckill_order_pubs_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostEqualTo(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost =", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostNotEqualTo(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost <>", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostGreaterThan(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost >", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost >=", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostLessThan(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost <", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_pubs_cost <=", value, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostIn(List<BigDecimal> values) {
            addCriterion("seckill_order_pubs_cost in", values, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostNotIn(List<BigDecimal> values) {
            addCriterion("seckill_order_pubs_cost not in", values, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_pubs_cost between", value1, value2, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderPubsCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_pubs_cost not between", value1, value2, "seckillOrderPubsCost");
            return (Criteria) this;
        }

        public Criteria andInsureIdIsNull() {
            addCriterion("insure_id is null");
            return (Criteria) this;
        }

        public Criteria andInsureIdIsNotNull() {
            addCriterion("insure_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsureIdEqualTo(Long value) {
            addCriterion("insure_id =", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotEqualTo(Long value) {
            addCriterion("insure_id <>", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThan(Long value) {
            addCriterion("insure_id >", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThanOrEqualTo(Long value) {
            addCriterion("insure_id >=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThan(Long value) {
            addCriterion("insure_id <", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThanOrEqualTo(Long value) {
            addCriterion("insure_id <=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdIn(List<Long> values) {
            addCriterion("insure_id in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotIn(List<Long> values) {
            addCriterion("insure_id not in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdBetween(Long value1, Long value2) {
            addCriterion("insure_id between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotBetween(Long value1, Long value2) {
            addCriterion("insure_id not between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostIsNull() {
            addCriterion("seckill_order_insure_cost is null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostIsNotNull() {
            addCriterion("seckill_order_insure_cost is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostEqualTo(BigDecimal value) {
            addCriterion("seckill_order_insure_cost =", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostNotEqualTo(BigDecimal value) {
            addCriterion("seckill_order_insure_cost <>", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostGreaterThan(BigDecimal value) {
            addCriterion("seckill_order_insure_cost >", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_insure_cost >=", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostLessThan(BigDecimal value) {
            addCriterion("seckill_order_insure_cost <", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_order_insure_cost <=", value, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostIn(List<BigDecimal> values) {
            addCriterion("seckill_order_insure_cost in", values, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostNotIn(List<BigDecimal> values) {
            addCriterion("seckill_order_insure_cost not in", values, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_insure_cost between", value1, value2, "seckillOrderInsureCost");
            return (Criteria) this;
        }

        public Criteria andSeckillOrderInsureCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_order_insure_cost not between", value1, value2, "seckillOrderInsureCost");
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