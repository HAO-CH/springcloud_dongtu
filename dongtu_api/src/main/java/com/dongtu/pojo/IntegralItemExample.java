package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IntegralItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralItemExample() {
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

        public Criteria andIntegralIdworkIsNull() {
            addCriterion("integral_idwork is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkIsNotNull() {
            addCriterion("integral_idwork is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkEqualTo(String value) {
            addCriterion("integral_idwork =", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkNotEqualTo(String value) {
            addCriterion("integral_idwork <>", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkGreaterThan(String value) {
            addCriterion("integral_idwork >", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkGreaterThanOrEqualTo(String value) {
            addCriterion("integral_idwork >=", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkLessThan(String value) {
            addCriterion("integral_idwork <", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkLessThanOrEqualTo(String value) {
            addCriterion("integral_idwork <=", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkLike(String value) {
            addCriterion("integral_idwork like", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkNotLike(String value) {
            addCriterion("integral_idwork not like", value, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkIn(List<String> values) {
            addCriterion("integral_idwork in", values, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkNotIn(List<String> values) {
            addCriterion("integral_idwork not in", values, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkBetween(String value1, String value2) {
            addCriterion("integral_idwork between", value1, value2, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntegralIdworkNotBetween(String value1, String value2) {
            addCriterion("integral_idwork not between", value1, value2, "integralIdwork");
            return (Criteria) this;
        }

        public Criteria andIntemNameIsNull() {
            addCriterion("intem_name is null");
            return (Criteria) this;
        }

        public Criteria andIntemNameIsNotNull() {
            addCriterion("intem_name is not null");
            return (Criteria) this;
        }

        public Criteria andIntemNameEqualTo(String value) {
            addCriterion("intem_name =", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameNotEqualTo(String value) {
            addCriterion("intem_name <>", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameGreaterThan(String value) {
            addCriterion("intem_name >", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameGreaterThanOrEqualTo(String value) {
            addCriterion("intem_name >=", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameLessThan(String value) {
            addCriterion("intem_name <", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameLessThanOrEqualTo(String value) {
            addCriterion("intem_name <=", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameLike(String value) {
            addCriterion("intem_name like", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameNotLike(String value) {
            addCriterion("intem_name not like", value, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameIn(List<String> values) {
            addCriterion("intem_name in", values, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameNotIn(List<String> values) {
            addCriterion("intem_name not in", values, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameBetween(String value1, String value2) {
            addCriterion("intem_name between", value1, value2, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemNameNotBetween(String value1, String value2) {
            addCriterion("intem_name not between", value1, value2, "intemName");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneIsNull() {
            addCriterion("intem_phone is null");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneIsNotNull() {
            addCriterion("intem_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneEqualTo(String value) {
            addCriterion("intem_phone =", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneNotEqualTo(String value) {
            addCriterion("intem_phone <>", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneGreaterThan(String value) {
            addCriterion("intem_phone >", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("intem_phone >=", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneLessThan(String value) {
            addCriterion("intem_phone <", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneLessThanOrEqualTo(String value) {
            addCriterion("intem_phone <=", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneLike(String value) {
            addCriterion("intem_phone like", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneNotLike(String value) {
            addCriterion("intem_phone not like", value, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneIn(List<String> values) {
            addCriterion("intem_phone in", values, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneNotIn(List<String> values) {
            addCriterion("intem_phone not in", values, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneBetween(String value1, String value2) {
            addCriterion("intem_phone between", value1, value2, "intemPhone");
            return (Criteria) this;
        }

        public Criteria andIntemPhoneNotBetween(String value1, String value2) {
            addCriterion("intem_phone not between", value1, value2, "intemPhone");
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

        public Criteria andIntegralTotalPriceIsNull() {
            addCriterion("integral_total_price is null");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceIsNotNull() {
            addCriterion("integral_total_price is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceEqualTo(BigDecimal value) {
            addCriterion("integral_total_price =", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceNotEqualTo(BigDecimal value) {
            addCriterion("integral_total_price <>", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceGreaterThan(BigDecimal value) {
            addCriterion("integral_total_price >", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_total_price >=", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceLessThan(BigDecimal value) {
            addCriterion("integral_total_price <", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("integral_total_price <=", value, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceIn(List<BigDecimal> values) {
            addCriterion("integral_total_price in", values, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceNotIn(List<BigDecimal> values) {
            addCriterion("integral_total_price not in", values, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_total_price between", value1, value2, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralTotalPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("integral_total_price not between", value1, value2, "integralTotalPrice");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIsNull() {
            addCriterion("integral_num is null");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIsNotNull() {
            addCriterion("integral_num is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralNumEqualTo(Integer value) {
            addCriterion("integral_num =", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotEqualTo(Integer value) {
            addCriterion("integral_num <>", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumGreaterThan(Integer value) {
            addCriterion("integral_num >", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_num >=", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumLessThan(Integer value) {
            addCriterion("integral_num <", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumLessThanOrEqualTo(Integer value) {
            addCriterion("integral_num <=", value, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumIn(List<Integer> values) {
            addCriterion("integral_num in", values, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotIn(List<Integer> values) {
            addCriterion("integral_num not in", values, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumBetween(Integer value1, Integer value2) {
            addCriterion("integral_num between", value1, value2, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralNumNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_num not between", value1, value2, "integralNum");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteIsNull() {
            addCriterion("integral_site is null");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteIsNotNull() {
            addCriterion("integral_site is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteEqualTo(String value) {
            addCriterion("integral_site =", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteNotEqualTo(String value) {
            addCriterion("integral_site <>", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteGreaterThan(String value) {
            addCriterion("integral_site >", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteGreaterThanOrEqualTo(String value) {
            addCriterion("integral_site >=", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteLessThan(String value) {
            addCriterion("integral_site <", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteLessThanOrEqualTo(String value) {
            addCriterion("integral_site <=", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteLike(String value) {
            addCriterion("integral_site like", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteNotLike(String value) {
            addCriterion("integral_site not like", value, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteIn(List<String> values) {
            addCriterion("integral_site in", values, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteNotIn(List<String> values) {
            addCriterion("integral_site not in", values, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteBetween(String value1, String value2) {
            addCriterion("integral_site between", value1, value2, "integralSite");
            return (Criteria) this;
        }

        public Criteria andIntegralSiteNotBetween(String value1, String value2) {
            addCriterion("integral_site not between", value1, value2, "integralSite");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
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