package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbProductsParamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductsParamExample() {
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

        public Criteria andTpIdIsNull() {
            addCriterion("tp_id is null");
            return (Criteria) this;
        }

        public Criteria andTpIdIsNotNull() {
            addCriterion("tp_id is not null");
            return (Criteria) this;
        }

        public Criteria andTpIdEqualTo(Long value) {
            addCriterion("tp_id =", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotEqualTo(Long value) {
            addCriterion("tp_id <>", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThan(Long value) {
            addCriterion("tp_id >", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tp_id >=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThan(Long value) {
            addCriterion("tp_id <", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdLessThanOrEqualTo(Long value) {
            addCriterion("tp_id <=", value, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdIn(List<Long> values) {
            addCriterion("tp_id in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotIn(List<Long> values) {
            addCriterion("tp_id not in", values, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdBetween(Long value1, Long value2) {
            addCriterion("tp_id between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIdNotBetween(Long value1, Long value2) {
            addCriterion("tp_id not between", value1, value2, "tpId");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceIsNull() {
            addCriterion("tp_introduce is null");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceIsNotNull() {
            addCriterion("tp_introduce is not null");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceEqualTo(String value) {
            addCriterion("tp_introduce =", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceNotEqualTo(String value) {
            addCriterion("tp_introduce <>", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceGreaterThan(String value) {
            addCriterion("tp_introduce >", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceGreaterThanOrEqualTo(String value) {
            addCriterion("tp_introduce >=", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceLessThan(String value) {
            addCriterion("tp_introduce <", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceLessThanOrEqualTo(String value) {
            addCriterion("tp_introduce <=", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceLike(String value) {
            addCriterion("tp_introduce like", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceNotLike(String value) {
            addCriterion("tp_introduce not like", value, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceIn(List<String> values) {
            addCriterion("tp_introduce in", values, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceNotIn(List<String> values) {
            addCriterion("tp_introduce not in", values, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceBetween(String value1, String value2) {
            addCriterion("tp_introduce between", value1, value2, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpIntroduceNotBetween(String value1, String value2) {
            addCriterion("tp_introduce not between", value1, value2, "tpIntroduce");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesIsNull() {
            addCriterion("tp_buy_notes is null");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesIsNotNull() {
            addCriterion("tp_buy_notes is not null");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesEqualTo(String value) {
            addCriterion("tp_buy_notes =", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesNotEqualTo(String value) {
            addCriterion("tp_buy_notes <>", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesGreaterThan(String value) {
            addCriterion("tp_buy_notes >", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesGreaterThanOrEqualTo(String value) {
            addCriterion("tp_buy_notes >=", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesLessThan(String value) {
            addCriterion("tp_buy_notes <", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesLessThanOrEqualTo(String value) {
            addCriterion("tp_buy_notes <=", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesLike(String value) {
            addCriterion("tp_buy_notes like", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesNotLike(String value) {
            addCriterion("tp_buy_notes not like", value, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesIn(List<String> values) {
            addCriterion("tp_buy_notes in", values, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesNotIn(List<String> values) {
            addCriterion("tp_buy_notes not in", values, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesBetween(String value1, String value2) {
            addCriterion("tp_buy_notes between", value1, value2, "tpBuyNotes");
            return (Criteria) this;
        }

        public Criteria andTpBuyNotesNotBetween(String value1, String value2) {
            addCriterion("tp_buy_notes not between", value1, value2, "tpBuyNotes");
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