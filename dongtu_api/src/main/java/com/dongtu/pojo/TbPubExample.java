package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TbPubExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPubExample() {
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

        public Criteria andPubsIdIsNull() {
            addCriterion("pubs_id is null");
            return (Criteria) this;
        }

        public Criteria andPubsIdIsNotNull() {
            addCriterion("pubs_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubsIdEqualTo(Long value) {
            addCriterion("pubs_id =", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotEqualTo(Long value) {
            addCriterion("pubs_id <>", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdGreaterThan(Long value) {
            addCriterion("pubs_id >", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pubs_id >=", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdLessThan(Long value) {
            addCriterion("pubs_id <", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdLessThanOrEqualTo(Long value) {
            addCriterion("pubs_id <=", value, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdIn(List<Long> values) {
            addCriterion("pubs_id in", values, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotIn(List<Long> values) {
            addCriterion("pubs_id not in", values, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdBetween(Long value1, Long value2) {
            addCriterion("pubs_id between", value1, value2, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsIdNotBetween(Long value1, Long value2) {
            addCriterion("pubs_id not between", value1, value2, "pubsId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdIsNull() {
            addCriterion("pubs_area_id is null");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdIsNotNull() {
            addCriterion("pubs_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdEqualTo(Long value) {
            addCriterion("pubs_area_id =", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdNotEqualTo(Long value) {
            addCriterion("pubs_area_id <>", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdGreaterThan(Long value) {
            addCriterion("pubs_area_id >", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pubs_area_id >=", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdLessThan(Long value) {
            addCriterion("pubs_area_id <", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("pubs_area_id <=", value, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdIn(List<Long> values) {
            addCriterion("pubs_area_id in", values, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdNotIn(List<Long> values) {
            addCriterion("pubs_area_id not in", values, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdBetween(Long value1, Long value2) {
            addCriterion("pubs_area_id between", value1, value2, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("pubs_area_id not between", value1, value2, "pubsAreaId");
            return (Criteria) this;
        }

        public Criteria andPubsNameIsNull() {
            addCriterion("pubs_name is null");
            return (Criteria) this;
        }

        public Criteria andPubsNameIsNotNull() {
            addCriterion("pubs_name is not null");
            return (Criteria) this;
        }

        public Criteria andPubsNameEqualTo(String value) {
            addCriterion("pubs_name =", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameNotEqualTo(String value) {
            addCriterion("pubs_name <>", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameGreaterThan(String value) {
            addCriterion("pubs_name >", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameGreaterThanOrEqualTo(String value) {
            addCriterion("pubs_name >=", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameLessThan(String value) {
            addCriterion("pubs_name <", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameLessThanOrEqualTo(String value) {
            addCriterion("pubs_name <=", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameLike(String value) {
            addCriterion("pubs_name like", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameNotLike(String value) {
            addCriterion("pubs_name not like", value, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameIn(List<String> values) {
            addCriterion("pubs_name in", values, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameNotIn(List<String> values) {
            addCriterion("pubs_name not in", values, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameBetween(String value1, String value2) {
            addCriterion("pubs_name between", value1, value2, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsNameNotBetween(String value1, String value2) {
            addCriterion("pubs_name not between", value1, value2, "pubsName");
            return (Criteria) this;
        }

        public Criteria andPubsPriceIsNull() {
            addCriterion("pubs_price is null");
            return (Criteria) this;
        }

        public Criteria andPubsPriceIsNotNull() {
            addCriterion("pubs_price is not null");
            return (Criteria) this;
        }

        public Criteria andPubsPriceEqualTo(BigDecimal value) {
            addCriterion("pubs_price =", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceNotEqualTo(BigDecimal value) {
            addCriterion("pubs_price <>", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceGreaterThan(BigDecimal value) {
            addCriterion("pubs_price >", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pubs_price >=", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceLessThan(BigDecimal value) {
            addCriterion("pubs_price <", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pubs_price <=", value, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceIn(List<BigDecimal> values) {
            addCriterion("pubs_price in", values, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceNotIn(List<BigDecimal> values) {
            addCriterion("pubs_price not in", values, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pubs_price between", value1, value2, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pubs_price not between", value1, value2, "pubsPrice");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneIsNull() {
            addCriterion("pubs_phone is null");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneIsNotNull() {
            addCriterion("pubs_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneEqualTo(String value) {
            addCriterion("pubs_phone =", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneNotEqualTo(String value) {
            addCriterion("pubs_phone <>", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneGreaterThan(String value) {
            addCriterion("pubs_phone >", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pubs_phone >=", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneLessThan(String value) {
            addCriterion("pubs_phone <", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneLessThanOrEqualTo(String value) {
            addCriterion("pubs_phone <=", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneLike(String value) {
            addCriterion("pubs_phone like", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneNotLike(String value) {
            addCriterion("pubs_phone not like", value, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneIn(List<String> values) {
            addCriterion("pubs_phone in", values, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneNotIn(List<String> values) {
            addCriterion("pubs_phone not in", values, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneBetween(String value1, String value2) {
            addCriterion("pubs_phone between", value1, value2, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsPhoneNotBetween(String value1, String value2) {
            addCriterion("pubs_phone not between", value1, value2, "pubsPhone");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanIsNull() {
            addCriterion("pubs_linkman is null");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanIsNotNull() {
            addCriterion("pubs_linkman is not null");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanEqualTo(String value) {
            addCriterion("pubs_linkman =", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanNotEqualTo(String value) {
            addCriterion("pubs_linkman <>", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanGreaterThan(String value) {
            addCriterion("pubs_linkman >", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("pubs_linkman >=", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanLessThan(String value) {
            addCriterion("pubs_linkman <", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanLessThanOrEqualTo(String value) {
            addCriterion("pubs_linkman <=", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanLike(String value) {
            addCriterion("pubs_linkman like", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanNotLike(String value) {
            addCriterion("pubs_linkman not like", value, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanIn(List<String> values) {
            addCriterion("pubs_linkman in", values, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanNotIn(List<String> values) {
            addCriterion("pubs_linkman not in", values, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanBetween(String value1, String value2) {
            addCriterion("pubs_linkman between", value1, value2, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsLinkmanNotBetween(String value1, String value2) {
            addCriterion("pubs_linkman not between", value1, value2, "pubsLinkman");
            return (Criteria) this;
        }

        public Criteria andPubsSatusIsNull() {
            addCriterion("pubs_satus is null");
            return (Criteria) this;
        }

        public Criteria andPubsSatusIsNotNull() {
            addCriterion("pubs_satus is not null");
            return (Criteria) this;
        }

        public Criteria andPubsSatusEqualTo(Integer value) {
            addCriterion("pubs_satus =", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusNotEqualTo(Integer value) {
            addCriterion("pubs_satus <>", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusGreaterThan(Integer value) {
            addCriterion("pubs_satus >", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pubs_satus >=", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusLessThan(Integer value) {
            addCriterion("pubs_satus <", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusLessThanOrEqualTo(Integer value) {
            addCriterion("pubs_satus <=", value, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusIn(List<Integer> values) {
            addCriterion("pubs_satus in", values, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusNotIn(List<Integer> values) {
            addCriterion("pubs_satus not in", values, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusBetween(Integer value1, Integer value2) {
            addCriterion("pubs_satus between", value1, value2, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andPubsSatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pubs_satus not between", value1, value2, "pubsSatus");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdIsNull() {
            addCriterion("pubs_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdIsNotNull() {
            addCriterion("pubs_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdEqualTo(Long value) {
            addCriterion("pubs_seller_id =", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdNotEqualTo(Long value) {
            addCriterion("pubs_seller_id <>", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdGreaterThan(Long value) {
            addCriterion("pubs_seller_id >", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pubs_seller_id >=", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdLessThan(Long value) {
            addCriterion("pubs_seller_id <", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("pubs_seller_id <=", value, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdIn(List<Long> values) {
            addCriterion("pubs_seller_id in", values, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdNotIn(List<Long> values) {
            addCriterion("pubs_seller_id not in", values, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdBetween(Long value1, Long value2) {
            addCriterion("pubs_seller_id between", value1, value2, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubsSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("pubs_seller_id not between", value1, value2, "pubsSellerId");
            return (Criteria) this;
        }

        public Criteria andPubImgIsNull() {
            addCriterion("pub_img is null");
            return (Criteria) this;
        }

        public Criteria andPubImgIsNotNull() {
            addCriterion("pub_img is not null");
            return (Criteria) this;
        }

        public Criteria andPubImgEqualTo(String value) {
            addCriterion("pub_img =", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgNotEqualTo(String value) {
            addCriterion("pub_img <>", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgGreaterThan(String value) {
            addCriterion("pub_img >", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgGreaterThanOrEqualTo(String value) {
            addCriterion("pub_img >=", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgLessThan(String value) {
            addCriterion("pub_img <", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgLessThanOrEqualTo(String value) {
            addCriterion("pub_img <=", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgLike(String value) {
            addCriterion("pub_img like", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgNotLike(String value) {
            addCriterion("pub_img not like", value, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgIn(List<String> values) {
            addCriterion("pub_img in", values, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgNotIn(List<String> values) {
            addCriterion("pub_img not in", values, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgBetween(String value1, String value2) {
            addCriterion("pub_img between", value1, value2, "pubImg");
            return (Criteria) this;
        }

        public Criteria andPubImgNotBetween(String value1, String value2) {
            addCriterion("pub_img not between", value1, value2, "pubImg");
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