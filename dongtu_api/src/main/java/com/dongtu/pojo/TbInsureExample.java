package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbInsureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInsureExample() {
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

        public Criteria andInsureIdIsNull() {
            addCriterion("insure_id is null");
            return (Criteria) this;
        }

        public Criteria andInsureIdIsNotNull() {
            addCriterion("insure_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsureIdEqualTo(Integer value) {
            addCriterion("insure_id =", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotEqualTo(Integer value) {
            addCriterion("insure_id <>", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThan(Integer value) {
            addCriterion("insure_id >", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("insure_id >=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThan(Integer value) {
            addCriterion("insure_id <", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdLessThanOrEqualTo(Integer value) {
            addCriterion("insure_id <=", value, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdIn(List<Integer> values) {
            addCriterion("insure_id in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotIn(List<Integer> values) {
            addCriterion("insure_id not in", values, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdBetween(Integer value1, Integer value2) {
            addCriterion("insure_id between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureIdNotBetween(Integer value1, Integer value2) {
            addCriterion("insure_id not between", value1, value2, "insureId");
            return (Criteria) this;
        }

        public Criteria andInsureNameIsNull() {
            addCriterion("insure_name is null");
            return (Criteria) this;
        }

        public Criteria andInsureNameIsNotNull() {
            addCriterion("insure_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsureNameEqualTo(String value) {
            addCriterion("insure_name =", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotEqualTo(String value) {
            addCriterion("insure_name <>", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameGreaterThan(String value) {
            addCriterion("insure_name >", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameGreaterThanOrEqualTo(String value) {
            addCriterion("insure_name >=", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLessThan(String value) {
            addCriterion("insure_name <", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLessThanOrEqualTo(String value) {
            addCriterion("insure_name <=", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameLike(String value) {
            addCriterion("insure_name like", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotLike(String value) {
            addCriterion("insure_name not like", value, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameIn(List<String> values) {
            addCriterion("insure_name in", values, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotIn(List<String> values) {
            addCriterion("insure_name not in", values, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameBetween(String value1, String value2) {
            addCriterion("insure_name between", value1, value2, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsureNameNotBetween(String value1, String value2) {
            addCriterion("insure_name not between", value1, value2, "insureName");
            return (Criteria) this;
        }

        public Criteria andInsurePriceIsNull() {
            addCriterion("insure_price is null");
            return (Criteria) this;
        }

        public Criteria andInsurePriceIsNotNull() {
            addCriterion("insure_price is not null");
            return (Criteria) this;
        }

        public Criteria andInsurePriceEqualTo(Long value) {
            addCriterion("insure_price =", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceNotEqualTo(Long value) {
            addCriterion("insure_price <>", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceGreaterThan(Long value) {
            addCriterion("insure_price >", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("insure_price >=", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceLessThan(Long value) {
            addCriterion("insure_price <", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceLessThanOrEqualTo(Long value) {
            addCriterion("insure_price <=", value, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceIn(List<Long> values) {
            addCriterion("insure_price in", values, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceNotIn(List<Long> values) {
            addCriterion("insure_price not in", values, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceBetween(Long value1, Long value2) {
            addCriterion("insure_price between", value1, value2, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsurePriceNotBetween(Long value1, Long value2) {
            addCriterion("insure_price not between", value1, value2, "insurePrice");
            return (Criteria) this;
        }

        public Criteria andInsureContentIsNull() {
            addCriterion("insure_content is null");
            return (Criteria) this;
        }

        public Criteria andInsureContentIsNotNull() {
            addCriterion("insure_content is not null");
            return (Criteria) this;
        }

        public Criteria andInsureContentEqualTo(String value) {
            addCriterion("insure_content =", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentNotEqualTo(String value) {
            addCriterion("insure_content <>", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentGreaterThan(String value) {
            addCriterion("insure_content >", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentGreaterThanOrEqualTo(String value) {
            addCriterion("insure_content >=", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentLessThan(String value) {
            addCriterion("insure_content <", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentLessThanOrEqualTo(String value) {
            addCriterion("insure_content <=", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentLike(String value) {
            addCriterion("insure_content like", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentNotLike(String value) {
            addCriterion("insure_content not like", value, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentIn(List<String> values) {
            addCriterion("insure_content in", values, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentNotIn(List<String> values) {
            addCriterion("insure_content not in", values, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentBetween(String value1, String value2) {
            addCriterion("insure_content between", value1, value2, "insureContent");
            return (Criteria) this;
        }

        public Criteria andInsureContentNotBetween(String value1, String value2) {
            addCriterion("insure_content not between", value1, value2, "insureContent");
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