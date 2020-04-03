package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbOperatorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbOperatorExample() {
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

        public Criteria andOperNameIsNull() {
            addCriterion("oper_name is null");
            return (Criteria) this;
        }

        public Criteria andOperNameIsNotNull() {
            addCriterion("oper_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperNameEqualTo(String value) {
            addCriterion("oper_name =", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotEqualTo(String value) {
            addCriterion("oper_name <>", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThan(String value) {
            addCriterion("oper_name >", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameGreaterThanOrEqualTo(String value) {
            addCriterion("oper_name >=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThan(String value) {
            addCriterion("oper_name <", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLessThanOrEqualTo(String value) {
            addCriterion("oper_name <=", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameLike(String value) {
            addCriterion("oper_name like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotLike(String value) {
            addCriterion("oper_name not like", value, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameIn(List<String> values) {
            addCriterion("oper_name in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotIn(List<String> values) {
            addCriterion("oper_name not in", values, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameBetween(String value1, String value2) {
            addCriterion("oper_name between", value1, value2, "operName");
            return (Criteria) this;
        }

        public Criteria andOperNameNotBetween(String value1, String value2) {
            addCriterion("oper_name not between", value1, value2, "operName");
            return (Criteria) this;
        }

        public Criteria andOperPasswordIsNull() {
            addCriterion("oper_password is null");
            return (Criteria) this;
        }

        public Criteria andOperPasswordIsNotNull() {
            addCriterion("oper_password is not null");
            return (Criteria) this;
        }

        public Criteria andOperPasswordEqualTo(String value) {
            addCriterion("oper_password =", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordNotEqualTo(String value) {
            addCriterion("oper_password <>", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordGreaterThan(String value) {
            addCriterion("oper_password >", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("oper_password >=", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordLessThan(String value) {
            addCriterion("oper_password <", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordLessThanOrEqualTo(String value) {
            addCriterion("oper_password <=", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordLike(String value) {
            addCriterion("oper_password like", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordNotLike(String value) {
            addCriterion("oper_password not like", value, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordIn(List<String> values) {
            addCriterion("oper_password in", values, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordNotIn(List<String> values) {
            addCriterion("oper_password not in", values, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordBetween(String value1, String value2) {
            addCriterion("oper_password between", value1, value2, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperPasswordNotBetween(String value1, String value2) {
            addCriterion("oper_password not between", value1, value2, "operPassword");
            return (Criteria) this;
        }

        public Criteria andOperSaltIsNull() {
            addCriterion("oper_salt is null");
            return (Criteria) this;
        }

        public Criteria andOperSaltIsNotNull() {
            addCriterion("oper_salt is not null");
            return (Criteria) this;
        }

        public Criteria andOperSaltEqualTo(String value) {
            addCriterion("oper_salt =", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltNotEqualTo(String value) {
            addCriterion("oper_salt <>", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltGreaterThan(String value) {
            addCriterion("oper_salt >", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltGreaterThanOrEqualTo(String value) {
            addCriterion("oper_salt >=", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltLessThan(String value) {
            addCriterion("oper_salt <", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltLessThanOrEqualTo(String value) {
            addCriterion("oper_salt <=", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltLike(String value) {
            addCriterion("oper_salt like", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltNotLike(String value) {
            addCriterion("oper_salt not like", value, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltIn(List<String> values) {
            addCriterion("oper_salt in", values, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltNotIn(List<String> values) {
            addCriterion("oper_salt not in", values, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltBetween(String value1, String value2) {
            addCriterion("oper_salt between", value1, value2, "operSalt");
            return (Criteria) this;
        }

        public Criteria andOperSaltNotBetween(String value1, String value2) {
            addCriterion("oper_salt not between", value1, value2, "operSalt");
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