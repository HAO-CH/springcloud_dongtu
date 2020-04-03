package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbPermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPermissionsExample() {
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

        public Criteria andPermissionsIdIsNull() {
            addCriterion("permissions_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdIsNotNull() {
            addCriterion("permissions_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdEqualTo(Long value) {
            addCriterion("permissions_id =", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotEqualTo(Long value) {
            addCriterion("permissions_id <>", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdGreaterThan(Long value) {
            addCriterion("permissions_id >", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("permissions_id >=", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdLessThan(Long value) {
            addCriterion("permissions_id <", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdLessThanOrEqualTo(Long value) {
            addCriterion("permissions_id <=", value, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdIn(List<Long> values) {
            addCriterion("permissions_id in", values, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotIn(List<Long> values) {
            addCriterion("permissions_id not in", values, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdBetween(Long value1, Long value2) {
            addCriterion("permissions_id between", value1, value2, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIdNotBetween(Long value1, Long value2) {
            addCriterion("permissions_id not between", value1, value2, "permissionsId");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextIsNull() {
            addCriterion("permissions_text is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextIsNotNull() {
            addCriterion("permissions_text is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextEqualTo(String value) {
            addCriterion("permissions_text =", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextNotEqualTo(String value) {
            addCriterion("permissions_text <>", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextGreaterThan(String value) {
            addCriterion("permissions_text >", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextGreaterThanOrEqualTo(String value) {
            addCriterion("permissions_text >=", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextLessThan(String value) {
            addCriterion("permissions_text <", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextLessThanOrEqualTo(String value) {
            addCriterion("permissions_text <=", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextLike(String value) {
            addCriterion("permissions_text like", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextNotLike(String value) {
            addCriterion("permissions_text not like", value, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextIn(List<String> values) {
            addCriterion("permissions_text in", values, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextNotIn(List<String> values) {
            addCriterion("permissions_text not in", values, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextBetween(String value1, String value2) {
            addCriterion("permissions_text between", value1, value2, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsTextNotBetween(String value1, String value2) {
            addCriterion("permissions_text not between", value1, value2, "permissionsText");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlIsNull() {
            addCriterion("permissions_url is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlIsNotNull() {
            addCriterion("permissions_url is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlEqualTo(String value) {
            addCriterion("permissions_url =", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlNotEqualTo(String value) {
            addCriterion("permissions_url <>", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlGreaterThan(String value) {
            addCriterion("permissions_url >", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("permissions_url >=", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlLessThan(String value) {
            addCriterion("permissions_url <", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlLessThanOrEqualTo(String value) {
            addCriterion("permissions_url <=", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlLike(String value) {
            addCriterion("permissions_url like", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlNotLike(String value) {
            addCriterion("permissions_url not like", value, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlIn(List<String> values) {
            addCriterion("permissions_url in", values, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlNotIn(List<String> values) {
            addCriterion("permissions_url not in", values, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlBetween(String value1, String value2) {
            addCriterion("permissions_url between", value1, value2, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsUrlNotBetween(String value1, String value2) {
            addCriterion("permissions_url not between", value1, value2, "permissionsUrl");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidIsNull() {
            addCriterion("permissions_pid is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidIsNotNull() {
            addCriterion("permissions_pid is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidEqualTo(Long value) {
            addCriterion("permissions_pid =", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidNotEqualTo(Long value) {
            addCriterion("permissions_pid <>", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidGreaterThan(Long value) {
            addCriterion("permissions_pid >", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidGreaterThanOrEqualTo(Long value) {
            addCriterion("permissions_pid >=", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidLessThan(Long value) {
            addCriterion("permissions_pid <", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidLessThanOrEqualTo(Long value) {
            addCriterion("permissions_pid <=", value, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidIn(List<Long> values) {
            addCriterion("permissions_pid in", values, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidNotIn(List<Long> values) {
            addCriterion("permissions_pid not in", values, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidBetween(Long value1, Long value2) {
            addCriterion("permissions_pid between", value1, value2, "permissionsPid");
            return (Criteria) this;
        }

        public Criteria andPermissionsPidNotBetween(Long value1, Long value2) {
            addCriterion("permissions_pid not between", value1, value2, "permissionsPid");
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