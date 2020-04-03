package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbMediaTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMediaTypeExample() {
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

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(Long value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(Long value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(Long value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(Long value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(Long value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<Long> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<Long> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(Long value1, Long value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(Long value1, Long value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaNameIsNull() {
            addCriterion("media_name is null");
            return (Criteria) this;
        }

        public Criteria andMediaNameIsNotNull() {
            addCriterion("media_name is not null");
            return (Criteria) this;
        }

        public Criteria andMediaNameEqualTo(String value) {
            addCriterion("media_name =", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotEqualTo(String value) {
            addCriterion("media_name <>", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameGreaterThan(String value) {
            addCriterion("media_name >", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameGreaterThanOrEqualTo(String value) {
            addCriterion("media_name >=", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLessThan(String value) {
            addCriterion("media_name <", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLessThanOrEqualTo(String value) {
            addCriterion("media_name <=", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameLike(String value) {
            addCriterion("media_name like", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotLike(String value) {
            addCriterion("media_name not like", value, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameIn(List<String> values) {
            addCriterion("media_name in", values, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotIn(List<String> values) {
            addCriterion("media_name not in", values, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameBetween(String value1, String value2) {
            addCriterion("media_name between", value1, value2, "mediaName");
            return (Criteria) this;
        }

        public Criteria andMediaNameNotBetween(String value1, String value2) {
            addCriterion("media_name not between", value1, value2, "mediaName");
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