package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class IntegralGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntegralGoodsExample() {
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

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralIsNull() {
            addCriterion("goods_integral is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralIsNotNull() {
            addCriterion("goods_integral is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralEqualTo(BigDecimal value) {
            addCriterion("goods_integral =", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotEqualTo(BigDecimal value) {
            addCriterion("goods_integral <>", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralGreaterThan(BigDecimal value) {
            addCriterion("goods_integral >", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_integral >=", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralLessThan(BigDecimal value) {
            addCriterion("goods_integral <", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralLessThanOrEqualTo(BigDecimal value) {
            addCriterion("goods_integral <=", value, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralIn(List<BigDecimal> values) {
            addCriterion("goods_integral in", values, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotIn(List<BigDecimal> values) {
            addCriterion("goods_integral not in", values, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_integral between", value1, value2, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsIntegralNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("goods_integral not between", value1, value2, "goodsIntegral");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNull() {
            addCriterion("goods_image is null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIsNotNull() {
            addCriterion("goods_image is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsImageEqualTo(String value) {
            addCriterion("goods_image =", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotEqualTo(String value) {
            addCriterion("goods_image <>", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThan(String value) {
            addCriterion("goods_image >", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageGreaterThanOrEqualTo(String value) {
            addCriterion("goods_image >=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThan(String value) {
            addCriterion("goods_image <", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLessThanOrEqualTo(String value) {
            addCriterion("goods_image <=", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageLike(String value) {
            addCriterion("goods_image like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotLike(String value) {
            addCriterion("goods_image not like", value, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageIn(List<String> values) {
            addCriterion("goods_image in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotIn(List<String> values) {
            addCriterion("goods_image not in", values, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageBetween(String value1, String value2) {
            addCriterion("goods_image between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsImageNotBetween(String value1, String value2) {
            addCriterion("goods_image not between", value1, value2, "goodsImage");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNull() {
            addCriterion("goods_num is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIsNotNull() {
            addCriterion("goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNumEqualTo(Long value) {
            addCriterion("goods_num =", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotEqualTo(Long value) {
            addCriterion("goods_num <>", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThan(Long value) {
            addCriterion("goods_num >", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_num >=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThan(Long value) {
            addCriterion("goods_num <", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumLessThanOrEqualTo(Long value) {
            addCriterion("goods_num <=", value, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumIn(List<Long> values) {
            addCriterion("goods_num in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotIn(List<Long> values) {
            addCriterion("goods_num not in", values, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumBetween(Long value1, Long value2) {
            addCriterion("goods_num between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsNumNotBetween(Long value1, Long value2) {
            addCriterion("goods_num not between", value1, value2, "goodsNum");
            return (Criteria) this;
        }

        public Criteria andGoodsTextIsNull() {
            addCriterion("goods_text is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTextIsNotNull() {
            addCriterion("goods_text is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTextEqualTo(String value) {
            addCriterion("goods_text =", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextNotEqualTo(String value) {
            addCriterion("goods_text <>", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextGreaterThan(String value) {
            addCriterion("goods_text >", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextGreaterThanOrEqualTo(String value) {
            addCriterion("goods_text >=", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextLessThan(String value) {
            addCriterion("goods_text <", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextLessThanOrEqualTo(String value) {
            addCriterion("goods_text <=", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextLike(String value) {
            addCriterion("goods_text like", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextNotLike(String value) {
            addCriterion("goods_text not like", value, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextIn(List<String> values) {
            addCriterion("goods_text in", values, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextNotIn(List<String> values) {
            addCriterion("goods_text not in", values, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextBetween(String value1, String value2) {
            addCriterion("goods_text between", value1, value2, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsTextNotBetween(String value1, String value2) {
            addCriterion("goods_text not between", value1, value2, "goodsText");
            return (Criteria) this;
        }

        public Criteria andGoodsIntIsNull() {
            addCriterion("goods_int is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntIsNotNull() {
            addCriterion("goods_int is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIntEqualTo(Long value) {
            addCriterion("goods_int =", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntNotEqualTo(Long value) {
            addCriterion("goods_int <>", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntGreaterThan(Long value) {
            addCriterion("goods_int >", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_int >=", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntLessThan(Long value) {
            addCriterion("goods_int <", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntLessThanOrEqualTo(Long value) {
            addCriterion("goods_int <=", value, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntIn(List<Long> values) {
            addCriterion("goods_int in", values, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntNotIn(List<Long> values) {
            addCriterion("goods_int not in", values, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntBetween(Long value1, Long value2) {
            addCriterion("goods_int between", value1, value2, "goodsInt");
            return (Criteria) this;
        }

        public Criteria andGoodsIntNotBetween(Long value1, Long value2) {
            addCriterion("goods_int not between", value1, value2, "goodsInt");
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