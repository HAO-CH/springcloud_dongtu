package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbInsureOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbInsureOrderExample() {
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

        public Criteria andInsureOrderIdIsNull() {
            addCriterion("insure_order_id is null");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdIsNotNull() {
            addCriterion("insure_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdEqualTo(Long value) {
            addCriterion("insure_order_id =", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdNotEqualTo(Long value) {
            addCriterion("insure_order_id <>", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdGreaterThan(Long value) {
            addCriterion("insure_order_id >", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("insure_order_id >=", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdLessThan(Long value) {
            addCriterion("insure_order_id <", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("insure_order_id <=", value, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdIn(List<Long> values) {
            addCriterion("insure_order_id in", values, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdNotIn(List<Long> values) {
            addCriterion("insure_order_id not in", values, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdBetween(Long value1, Long value2) {
            addCriterion("insure_order_id between", value1, value2, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsureOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("insure_order_id not between", value1, value2, "insureOrderId");
            return (Criteria) this;
        }

        public Criteria andInsure1NameIsNull() {
            addCriterion("insure1_name is null");
            return (Criteria) this;
        }

        public Criteria andInsure1NameIsNotNull() {
            addCriterion("insure1_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsure1NameEqualTo(String value) {
            addCriterion("insure1_name =", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameNotEqualTo(String value) {
            addCriterion("insure1_name <>", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameGreaterThan(String value) {
            addCriterion("insure1_name >", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameGreaterThanOrEqualTo(String value) {
            addCriterion("insure1_name >=", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameLessThan(String value) {
            addCriterion("insure1_name <", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameLessThanOrEqualTo(String value) {
            addCriterion("insure1_name <=", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameLike(String value) {
            addCriterion("insure1_name like", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameNotLike(String value) {
            addCriterion("insure1_name not like", value, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameIn(List<String> values) {
            addCriterion("insure1_name in", values, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameNotIn(List<String> values) {
            addCriterion("insure1_name not in", values, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameBetween(String value1, String value2) {
            addCriterion("insure1_name between", value1, value2, "insure1Name");
            return (Criteria) this;
        }

        public Criteria andInsure1NameNotBetween(String value1, String value2) {
            addCriterion("insure1_name not between", value1, value2, "insure1Name");
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

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
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

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andInsureStatusIsNull() {
            addCriterion("insure_status is null");
            return (Criteria) this;
        }

        public Criteria andInsureStatusIsNotNull() {
            addCriterion("insure_status is not null");
            return (Criteria) this;
        }

        public Criteria andInsureStatusEqualTo(Integer value) {
            addCriterion("insure_status =", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusNotEqualTo(Integer value) {
            addCriterion("insure_status <>", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusGreaterThan(Integer value) {
            addCriterion("insure_status >", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("insure_status >=", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusLessThan(Integer value) {
            addCriterion("insure_status <", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusLessThanOrEqualTo(Integer value) {
            addCriterion("insure_status <=", value, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusIn(List<Integer> values) {
            addCriterion("insure_status in", values, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusNotIn(List<Integer> values) {
            addCriterion("insure_status not in", values, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusBetween(Integer value1, Integer value2) {
            addCriterion("insure_status between", value1, value2, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andInsureStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("insure_status not between", value1, value2, "insureStatus");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andInsure2NameIsNull() {
            addCriterion("insure2_name is null");
            return (Criteria) this;
        }

        public Criteria andInsure2NameIsNotNull() {
            addCriterion("insure2_name is not null");
            return (Criteria) this;
        }

        public Criteria andInsure2NameEqualTo(String value) {
            addCriterion("insure2_name =", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameNotEqualTo(String value) {
            addCriterion("insure2_name <>", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameGreaterThan(String value) {
            addCriterion("insure2_name >", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameGreaterThanOrEqualTo(String value) {
            addCriterion("insure2_name >=", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameLessThan(String value) {
            addCriterion("insure2_name <", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameLessThanOrEqualTo(String value) {
            addCriterion("insure2_name <=", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameLike(String value) {
            addCriterion("insure2_name like", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameNotLike(String value) {
            addCriterion("insure2_name not like", value, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameIn(List<String> values) {
            addCriterion("insure2_name in", values, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameNotIn(List<String> values) {
            addCriterion("insure2_name not in", values, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameBetween(String value1, String value2) {
            addCriterion("insure2_name between", value1, value2, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsure2NameNotBetween(String value1, String value2) {
            addCriterion("insure2_name not between", value1, value2, "insure2Name");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeIsNull() {
            addCriterion("insure_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeIsNotNull() {
            addCriterion("insure_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeEqualTo(BigDecimal value) {
            addCriterion("insure_total_fee =", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeNotEqualTo(BigDecimal value) {
            addCriterion("insure_total_fee <>", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeGreaterThan(BigDecimal value) {
            addCriterion("insure_total_fee >", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_total_fee >=", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeLessThan(BigDecimal value) {
            addCriterion("insure_total_fee <", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("insure_total_fee <=", value, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeIn(List<BigDecimal> values) {
            addCriterion("insure_total_fee in", values, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeNotIn(List<BigDecimal> values) {
            addCriterion("insure_total_fee not in", values, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_total_fee between", value1, value2, "insureTotalFee");
            return (Criteria) this;
        }

        public Criteria andInsureTotalFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("insure_total_fee not between", value1, value2, "insureTotalFee");
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