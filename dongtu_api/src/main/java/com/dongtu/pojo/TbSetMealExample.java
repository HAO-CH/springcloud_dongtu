package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSetMealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSetMealExample() {
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

        public Criteria andSmIdIsNull() {
            addCriterion("sm_id is null");
            return (Criteria) this;
        }

        public Criteria andSmIdIsNotNull() {
            addCriterion("sm_id is not null");
            return (Criteria) this;
        }

        public Criteria andSmIdEqualTo(Long value) {
            addCriterion("sm_id =", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotEqualTo(Long value) {
            addCriterion("sm_id <>", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThan(Long value) {
            addCriterion("sm_id >", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sm_id >=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThan(Long value) {
            addCriterion("sm_id <", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdLessThanOrEqualTo(Long value) {
            addCriterion("sm_id <=", value, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdIn(List<Long> values) {
            addCriterion("sm_id in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotIn(List<Long> values) {
            addCriterion("sm_id not in", values, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdBetween(Long value1, Long value2) {
            addCriterion("sm_id between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmIdNotBetween(Long value1, Long value2) {
            addCriterion("sm_id not between", value1, value2, "smId");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealIsNull() {
            addCriterion("sm_setmealsm_setmeal is null");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealIsNotNull() {
            addCriterion("sm_setmealsm_setmeal is not null");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealEqualTo(String value) {
            addCriterion("sm_setmealsm_setmeal =", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealNotEqualTo(String value) {
            addCriterion("sm_setmealsm_setmeal <>", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealGreaterThan(String value) {
            addCriterion("sm_setmealsm_setmeal >", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealGreaterThanOrEqualTo(String value) {
            addCriterion("sm_setmealsm_setmeal >=", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealLessThan(String value) {
            addCriterion("sm_setmealsm_setmeal <", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealLessThanOrEqualTo(String value) {
            addCriterion("sm_setmealsm_setmeal <=", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealLike(String value) {
            addCriterion("sm_setmealsm_setmeal like", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealNotLike(String value) {
            addCriterion("sm_setmealsm_setmeal not like", value, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealIn(List<String> values) {
            addCriterion("sm_setmealsm_setmeal in", values, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealNotIn(List<String> values) {
            addCriterion("sm_setmealsm_setmeal not in", values, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealBetween(String value1, String value2) {
            addCriterion("sm_setmealsm_setmeal between", value1, value2, "smSetmealsmSetmeal");
            return (Criteria) this;
        }

        public Criteria andSmSetmealsmSetmealNotBetween(String value1, String value2) {
            addCriterion("sm_setmealsm_setmeal not between", value1, value2, "smSetmealsmSetmeal");
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