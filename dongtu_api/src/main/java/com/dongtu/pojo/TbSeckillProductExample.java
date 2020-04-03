package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TbSeckillProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSeckillProductExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdIsNull() {
            addCriterion("seckill_sp_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdIsNotNull() {
            addCriterion("seckill_sp_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdEqualTo(Long value) {
            addCriterion("seckill_sp_id =", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdNotEqualTo(Long value) {
            addCriterion("seckill_sp_id <>", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdGreaterThan(Long value) {
            addCriterion("seckill_sp_id >", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_sp_id >=", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdLessThan(Long value) {
            addCriterion("seckill_sp_id <", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_sp_id <=", value, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdIn(List<Long> values) {
            addCriterion("seckill_sp_id in", values, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdNotIn(List<Long> values) {
            addCriterion("seckill_sp_id not in", values, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdBetween(Long value1, Long value2) {
            addCriterion("seckill_sp_id between", value1, value2, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillSpIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_sp_id not between", value1, value2, "seckillSpId");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleIsNull() {
            addCriterion("seckill_title is null");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleIsNotNull() {
            addCriterion("seckill_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleEqualTo(String value) {
            addCriterion("seckill_title =", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleNotEqualTo(String value) {
            addCriterion("seckill_title <>", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleGreaterThan(String value) {
            addCriterion("seckill_title >", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleGreaterThanOrEqualTo(String value) {
            addCriterion("seckill_title >=", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleLessThan(String value) {
            addCriterion("seckill_title <", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleLessThanOrEqualTo(String value) {
            addCriterion("seckill_title <=", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleLike(String value) {
            addCriterion("seckill_title like", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleNotLike(String value) {
            addCriterion("seckill_title not like", value, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleIn(List<String> values) {
            addCriterion("seckill_title in", values, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleNotIn(List<String> values) {
            addCriterion("seckill_title not in", values, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleBetween(String value1, String value2) {
            addCriterion("seckill_title between", value1, value2, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillTitleNotBetween(String value1, String value2) {
            addCriterion("seckill_title not between", value1, value2, "seckillTitle");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicIsNull() {
            addCriterion("seckill_small_pic is null");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicIsNotNull() {
            addCriterion("seckill_small_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicEqualTo(String value) {
            addCriterion("seckill_small_pic =", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicNotEqualTo(String value) {
            addCriterion("seckill_small_pic <>", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicGreaterThan(String value) {
            addCriterion("seckill_small_pic >", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicGreaterThanOrEqualTo(String value) {
            addCriterion("seckill_small_pic >=", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicLessThan(String value) {
            addCriterion("seckill_small_pic <", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicLessThanOrEqualTo(String value) {
            addCriterion("seckill_small_pic <=", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicLike(String value) {
            addCriterion("seckill_small_pic like", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicNotLike(String value) {
            addCriterion("seckill_small_pic not like", value, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicIn(List<String> values) {
            addCriterion("seckill_small_pic in", values, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicNotIn(List<String> values) {
            addCriterion("seckill_small_pic not in", values, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicBetween(String value1, String value2) {
            addCriterion("seckill_small_pic between", value1, value2, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillSmallPicNotBetween(String value1, String value2) {
            addCriterion("seckill_small_pic not between", value1, value2, "seckillSmallPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicIsNull() {
            addCriterion("seckill_desc_pic is null");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicIsNotNull() {
            addCriterion("seckill_desc_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicEqualTo(String value) {
            addCriterion("seckill_desc_pic =", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicNotEqualTo(String value) {
            addCriterion("seckill_desc_pic <>", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicGreaterThan(String value) {
            addCriterion("seckill_desc_pic >", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicGreaterThanOrEqualTo(String value) {
            addCriterion("seckill_desc_pic >=", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicLessThan(String value) {
            addCriterion("seckill_desc_pic <", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicLessThanOrEqualTo(String value) {
            addCriterion("seckill_desc_pic <=", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicLike(String value) {
            addCriterion("seckill_desc_pic like", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicNotLike(String value) {
            addCriterion("seckill_desc_pic not like", value, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicIn(List<String> values) {
            addCriterion("seckill_desc_pic in", values, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicNotIn(List<String> values) {
            addCriterion("seckill_desc_pic not in", values, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicBetween(String value1, String value2) {
            addCriterion("seckill_desc_pic between", value1, value2, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillDescPicNotBetween(String value1, String value2) {
            addCriterion("seckill_desc_pic not between", value1, value2, "seckillDescPic");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceIsNull() {
            addCriterion("seckill_adult_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceIsNotNull() {
            addCriterion("seckill_adult_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_price =", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_price <>", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_adult_price >", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_price >=", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceLessThan(BigDecimal value) {
            addCriterion("seckill_adult_price <", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_price <=", value, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_adult_price in", values, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_adult_price not in", values, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_adult_price between", value1, value2, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_adult_price not between", value1, value2, "seckillAdultPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceIsNull() {
            addCriterion("seckill_adult_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceIsNotNull() {
            addCriterion("seckill_adult_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_cost_price =", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_cost_price <>", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_adult_cost_price >", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_cost_price >=", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceLessThan(BigDecimal value) {
            addCriterion("seckill_adult_cost_price <", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_adult_cost_price <=", value, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_adult_cost_price in", values, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_adult_cost_price not in", values, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_adult_cost_price between", value1, value2, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillAdultCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_adult_cost_price not between", value1, value2, "seckillAdultCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceIsNull() {
            addCriterion("seckill_child_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceIsNotNull() {
            addCriterion("seckill_child_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_child_price =", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_child_price <>", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_child_price >", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_child_price >=", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceLessThan(BigDecimal value) {
            addCriterion("seckill_child_price <", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_child_price <=", value, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_child_price in", values, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_child_price not in", values, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_child_price between", value1, value2, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_child_price not between", value1, value2, "seckillChildPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceIsNull() {
            addCriterion("seckill_child_cost_price is null");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceIsNotNull() {
            addCriterion("seckill_child_cost_price is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceEqualTo(BigDecimal value) {
            addCriterion("seckill_child_cost_price =", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("seckill_child_cost_price <>", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceGreaterThan(BigDecimal value) {
            addCriterion("seckill_child_cost_price >", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_child_cost_price >=", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceLessThan(BigDecimal value) {
            addCriterion("seckill_child_cost_price <", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("seckill_child_cost_price <=", value, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceIn(List<BigDecimal> values) {
            addCriterion("seckill_child_cost_price in", values, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("seckill_child_cost_price not in", values, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_child_cost_price between", value1, value2, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillChildCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("seckill_child_cost_price not between", value1, value2, "seckillChildCostPrice");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdIsNull() {
            addCriterion("seckill_travel_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdIsNotNull() {
            addCriterion("seckill_travel_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdEqualTo(Long value) {
            addCriterion("seckill_travel_seller_id =", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdNotEqualTo(Long value) {
            addCriterion("seckill_travel_seller_id <>", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdGreaterThan(Long value) {
            addCriterion("seckill_travel_seller_id >", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_travel_seller_id >=", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdLessThan(Long value) {
            addCriterion("seckill_travel_seller_id <", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_travel_seller_id <=", value, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdIn(List<Long> values) {
            addCriterion("seckill_travel_seller_id in", values, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdNotIn(List<Long> values) {
            addCriterion("seckill_travel_seller_id not in", values, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdBetween(Long value1, Long value2) {
            addCriterion("seckill_travel_seller_id between", value1, value2, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillTravelSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_travel_seller_id not between", value1, value2, "seckillTravelSellerId");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaIsNull() {
            addCriterion("seckill_area is null");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaIsNotNull() {
            addCriterion("seckill_area is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaEqualTo(Long value) {
            addCriterion("seckill_area =", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaNotEqualTo(Long value) {
            addCriterion("seckill_area <>", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaGreaterThan(Long value) {
            addCriterion("seckill_area >", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_area >=", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaLessThan(Long value) {
            addCriterion("seckill_area <", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaLessThanOrEqualTo(Long value) {
            addCriterion("seckill_area <=", value, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaIn(List<Long> values) {
            addCriterion("seckill_area in", values, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaNotIn(List<Long> values) {
            addCriterion("seckill_area not in", values, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaBetween(Long value1, Long value2) {
            addCriterion("seckill_area between", value1, value2, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillAreaNotBetween(Long value1, Long value2) {
            addCriterion("seckill_area not between", value1, value2, "seckillArea");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeIsNull() {
            addCriterion("seckill_type is null");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeIsNotNull() {
            addCriterion("seckill_type is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeEqualTo(Long value) {
            addCriterion("seckill_type =", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeNotEqualTo(Long value) {
            addCriterion("seckill_type <>", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeGreaterThan(Long value) {
            addCriterion("seckill_type >", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_type >=", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeLessThan(Long value) {
            addCriterion("seckill_type <", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeLessThanOrEqualTo(Long value) {
            addCriterion("seckill_type <=", value, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeIn(List<Long> values) {
            addCriterion("seckill_type in", values, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeNotIn(List<Long> values) {
            addCriterion("seckill_type not in", values, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeBetween(Long value1, Long value2) {
            addCriterion("seckill_type between", value1, value2, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillTypeNotBetween(Long value1, Long value2) {
            addCriterion("seckill_type not between", value1, value2, "seckillType");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusIsNull() {
            addCriterion("seckill_status is null");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusIsNotNull() {
            addCriterion("seckill_status is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusEqualTo(Integer value) {
            addCriterion("seckill_status =", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusNotEqualTo(Integer value) {
            addCriterion("seckill_status <>", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusGreaterThan(Integer value) {
            addCriterion("seckill_status >", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("seckill_status >=", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusLessThan(Integer value) {
            addCriterion("seckill_status <", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusLessThanOrEqualTo(Integer value) {
            addCriterion("seckill_status <=", value, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusIn(List<Integer> values) {
            addCriterion("seckill_status in", values, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusNotIn(List<Integer> values) {
            addCriterion("seckill_status not in", values, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusBetween(Integer value1, Integer value2) {
            addCriterion("seckill_status between", value1, value2, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("seckill_status not between", value1, value2, "seckillStatus");
            return (Criteria) this;
        }

        public Criteria andSeckillNumIsNull() {
            addCriterion("seckill_num is null");
            return (Criteria) this;
        }

        public Criteria andSeckillNumIsNotNull() {
            addCriterion("seckill_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillNumEqualTo(Long value) {
            addCriterion("seckill_num =", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumNotEqualTo(Long value) {
            addCriterion("seckill_num <>", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumGreaterThan(Long value) {
            addCriterion("seckill_num >", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_num >=", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumLessThan(Long value) {
            addCriterion("seckill_num <", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumLessThanOrEqualTo(Long value) {
            addCriterion("seckill_num <=", value, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumIn(List<Long> values) {
            addCriterion("seckill_num in", values, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumNotIn(List<Long> values) {
            addCriterion("seckill_num not in", values, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumBetween(Long value1, Long value2) {
            addCriterion("seckill_num between", value1, value2, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillNumNotBetween(Long value1, Long value2) {
            addCriterion("seckill_num not between", value1, value2, "seckillNum");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountIsNull() {
            addCriterion("seckill_stock_count is null");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountIsNotNull() {
            addCriterion("seckill_stock_count is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountEqualTo(Long value) {
            addCriterion("seckill_stock_count =", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountNotEqualTo(Long value) {
            addCriterion("seckill_stock_count <>", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountGreaterThan(Long value) {
            addCriterion("seckill_stock_count >", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_stock_count >=", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountLessThan(Long value) {
            addCriterion("seckill_stock_count <", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountLessThanOrEqualTo(Long value) {
            addCriterion("seckill_stock_count <=", value, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountIn(List<Long> values) {
            addCriterion("seckill_stock_count in", values, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountNotIn(List<Long> values) {
            addCriterion("seckill_stock_count not in", values, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountBetween(Long value1, Long value2) {
            addCriterion("seckill_stock_count between", value1, value2, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStockCountNotBetween(Long value1, Long value2) {
            addCriterion("seckill_stock_count not between", value1, value2, "seckillStockCount");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateIsNull() {
            addCriterion("seckill_start_date is null");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateIsNotNull() {
            addCriterion("seckill_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateEqualTo(Date value) {
            addCriterion("seckill_start_date =", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateNotEqualTo(Date value) {
            addCriterion("seckill_start_date <>", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateGreaterThan(Date value) {
            addCriterion("seckill_start_date >", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("seckill_start_date >=", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateLessThan(Date value) {
            addCriterion("seckill_start_date <", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateLessThanOrEqualTo(Date value) {
            addCriterion("seckill_start_date <=", value, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateIn(List<Date> values) {
            addCriterion("seckill_start_date in", values, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateNotIn(List<Date> values) {
            addCriterion("seckill_start_date not in", values, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateBetween(Date value1, Date value2) {
            addCriterion("seckill_start_date between", value1, value2, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillStartDateNotBetween(Date value1, Date value2) {
            addCriterion("seckill_start_date not between", value1, value2, "seckillStartDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateIsNull() {
            addCriterion("seckill_end_date is null");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateIsNotNull() {
            addCriterion("seckill_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateEqualTo(Date value) {
            addCriterion("seckill_end_date =", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateNotEqualTo(Date value) {
            addCriterion("seckill_end_date <>", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateGreaterThan(Date value) {
            addCriterion("seckill_end_date >", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("seckill_end_date >=", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateLessThan(Date value) {
            addCriterion("seckill_end_date <", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateLessThanOrEqualTo(Date value) {
            addCriterion("seckill_end_date <=", value, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateIn(List<Date> values) {
            addCriterion("seckill_end_date in", values, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateNotIn(List<Date> values) {
            addCriterion("seckill_end_date not in", values, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateBetween(Date value1, Date value2) {
            addCriterion("seckill_end_date between", value1, value2, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillEndDateNotBetween(Date value1, Date value2) {
            addCriterion("seckill_end_date not between", value1, value2, "seckillEndDate");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescIsNull() {
            addCriterion("seckill_product_desc is null");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescIsNotNull() {
            addCriterion("seckill_product_desc is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescEqualTo(String value) {
            addCriterion("seckill_product_desc =", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescNotEqualTo(String value) {
            addCriterion("seckill_product_desc <>", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescGreaterThan(String value) {
            addCriterion("seckill_product_desc >", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("seckill_product_desc >=", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescLessThan(String value) {
            addCriterion("seckill_product_desc <", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescLessThanOrEqualTo(String value) {
            addCriterion("seckill_product_desc <=", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescLike(String value) {
            addCriterion("seckill_product_desc like", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescNotLike(String value) {
            addCriterion("seckill_product_desc not like", value, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescIn(List<String> values) {
            addCriterion("seckill_product_desc in", values, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescNotIn(List<String> values) {
            addCriterion("seckill_product_desc not in", values, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescBetween(String value1, String value2) {
            addCriterion("seckill_product_desc between", value1, value2, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillProductDescNotBetween(String value1, String value2) {
            addCriterion("seckill_product_desc not between", value1, value2, "seckillProductDesc");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdIsNull() {
            addCriterion("seckill_pub_id is null");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdIsNotNull() {
            addCriterion("seckill_pub_id is not null");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdEqualTo(Long value) {
            addCriterion("seckill_pub_id =", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdNotEqualTo(Long value) {
            addCriterion("seckill_pub_id <>", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdGreaterThan(Long value) {
            addCriterion("seckill_pub_id >", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdGreaterThanOrEqualTo(Long value) {
            addCriterion("seckill_pub_id >=", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdLessThan(Long value) {
            addCriterion("seckill_pub_id <", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdLessThanOrEqualTo(Long value) {
            addCriterion("seckill_pub_id <=", value, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdIn(List<Long> values) {
            addCriterion("seckill_pub_id in", values, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdNotIn(List<Long> values) {
            addCriterion("seckill_pub_id not in", values, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdBetween(Long value1, Long value2) {
            addCriterion("seckill_pub_id between", value1, value2, "seckillPubId");
            return (Criteria) this;
        }

        public Criteria andSeckillPubIdNotBetween(Long value1, Long value2) {
            addCriterion("seckill_pub_id not between", value1, value2, "seckillPubId");
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