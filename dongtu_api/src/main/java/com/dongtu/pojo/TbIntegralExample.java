package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbIntegralExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbIntegralExample() {
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

        public Criteria andMoOrderNumIsNull() {
            addCriterion("mo_order_num is null");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumIsNotNull() {
            addCriterion("mo_order_num is not null");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumEqualTo(Long value) {
            addCriterion("mo_order_num =", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumNotEqualTo(Long value) {
            addCriterion("mo_order_num <>", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumGreaterThan(Long value) {
            addCriterion("mo_order_num >", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_order_num >=", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumLessThan(Long value) {
            addCriterion("mo_order_num <", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumLessThanOrEqualTo(Long value) {
            addCriterion("mo_order_num <=", value, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumIn(List<Long> values) {
            addCriterion("mo_order_num in", values, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumNotIn(List<Long> values) {
            addCriterion("mo_order_num not in", values, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumBetween(Long value1, Long value2) {
            addCriterion("mo_order_num between", value1, value2, "moOrderNum");
            return (Criteria) this;
        }

        public Criteria andMoOrderNumNotBetween(Long value1, Long value2) {
            addCriterion("mo_order_num not between", value1, value2, "moOrderNum");
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

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPayIntegralIsNull() {
            addCriterion("pay_integral is null");
            return (Criteria) this;
        }

        public Criteria andPayIntegralIsNotNull() {
            addCriterion("pay_integral is not null");
            return (Criteria) this;
        }

        public Criteria andPayIntegralEqualTo(Long value) {
            addCriterion("pay_integral =", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralNotEqualTo(Long value) {
            addCriterion("pay_integral <>", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralGreaterThan(Long value) {
            addCriterion("pay_integral >", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_integral >=", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralLessThan(Long value) {
            addCriterion("pay_integral <", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralLessThanOrEqualTo(Long value) {
            addCriterion("pay_integral <=", value, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralIn(List<Long> values) {
            addCriterion("pay_integral in", values, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralNotIn(List<Long> values) {
            addCriterion("pay_integral not in", values, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralBetween(Long value1, Long value2) {
            addCriterion("pay_integral between", value1, value2, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andPayIntegralNotBetween(Long value1, Long value2) {
            addCriterion("pay_integral not between", value1, value2, "payIntegral");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusIsNull() {
            addCriterion("integral_status is null");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusIsNotNull() {
            addCriterion("integral_status is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusEqualTo(Integer value) {
            addCriterion("integral_status =", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusNotEqualTo(Integer value) {
            addCriterion("integral_status <>", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusGreaterThan(Integer value) {
            addCriterion("integral_status >", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral_status >=", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusLessThan(Integer value) {
            addCriterion("integral_status <", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusLessThanOrEqualTo(Integer value) {
            addCriterion("integral_status <=", value, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusIn(List<Integer> values) {
            addCriterion("integral_status in", values, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusNotIn(List<Integer> values) {
            addCriterion("integral_status not in", values, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusBetween(Integer value1, Integer value2) {
            addCriterion("integral_status between", value1, value2, "integralStatus");
            return (Criteria) this;
        }

        public Criteria andIntegralStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("integral_status not between", value1, value2, "integralStatus");
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