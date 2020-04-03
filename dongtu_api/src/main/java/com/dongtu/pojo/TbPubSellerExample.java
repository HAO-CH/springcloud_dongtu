package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbPubSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbPubSellerExample() {
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

        public Criteria andPubSellerIdIsNull() {
            addCriterion("pub_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdIsNotNull() {
            addCriterion("pub_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdEqualTo(Long value) {
            addCriterion("pub_seller_id =", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdNotEqualTo(Long value) {
            addCriterion("pub_seller_id <>", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdGreaterThan(Long value) {
            addCriterion("pub_seller_id >", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pub_seller_id >=", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdLessThan(Long value) {
            addCriterion("pub_seller_id <", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("pub_seller_id <=", value, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdIn(List<Long> values) {
            addCriterion("pub_seller_id in", values, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdNotIn(List<Long> values) {
            addCriterion("pub_seller_id not in", values, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdBetween(Long value1, Long value2) {
            addCriterion("pub_seller_id between", value1, value2, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("pub_seller_id not between", value1, value2, "pubSellerId");
            return (Criteria) this;
        }

        public Criteria andPubNameIsNull() {
            addCriterion("pub_name is null");
            return (Criteria) this;
        }

        public Criteria andPubNameIsNotNull() {
            addCriterion("pub_name is not null");
            return (Criteria) this;
        }

        public Criteria andPubNameEqualTo(String value) {
            addCriterion("pub_name =", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameNotEqualTo(String value) {
            addCriterion("pub_name <>", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameGreaterThan(String value) {
            addCriterion("pub_name >", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameGreaterThanOrEqualTo(String value) {
            addCriterion("pub_name >=", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameLessThan(String value) {
            addCriterion("pub_name <", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameLessThanOrEqualTo(String value) {
            addCriterion("pub_name <=", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameLike(String value) {
            addCriterion("pub_name like", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameNotLike(String value) {
            addCriterion("pub_name not like", value, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameIn(List<String> values) {
            addCriterion("pub_name in", values, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameNotIn(List<String> values) {
            addCriterion("pub_name not in", values, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameBetween(String value1, String value2) {
            addCriterion("pub_name between", value1, value2, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubNameNotBetween(String value1, String value2) {
            addCriterion("pub_name not between", value1, value2, "pubName");
            return (Criteria) this;
        }

        public Criteria andPubPasswordIsNull() {
            addCriterion("pub_password is null");
            return (Criteria) this;
        }

        public Criteria andPubPasswordIsNotNull() {
            addCriterion("pub_password is not null");
            return (Criteria) this;
        }

        public Criteria andPubPasswordEqualTo(String value) {
            addCriterion("pub_password =", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordNotEqualTo(String value) {
            addCriterion("pub_password <>", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordGreaterThan(String value) {
            addCriterion("pub_password >", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pub_password >=", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordLessThan(String value) {
            addCriterion("pub_password <", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordLessThanOrEqualTo(String value) {
            addCriterion("pub_password <=", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordLike(String value) {
            addCriterion("pub_password like", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordNotLike(String value) {
            addCriterion("pub_password not like", value, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordIn(List<String> values) {
            addCriterion("pub_password in", values, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordNotIn(List<String> values) {
            addCriterion("pub_password not in", values, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordBetween(String value1, String value2) {
            addCriterion("pub_password between", value1, value2, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubPasswordNotBetween(String value1, String value2) {
            addCriterion("pub_password not between", value1, value2, "pubPassword");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNull() {
            addCriterion("pub_status is null");
            return (Criteria) this;
        }

        public Criteria andPubStatusIsNotNull() {
            addCriterion("pub_status is not null");
            return (Criteria) this;
        }

        public Criteria andPubStatusEqualTo(Integer value) {
            addCriterion("pub_status =", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotEqualTo(Integer value) {
            addCriterion("pub_status <>", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThan(Integer value) {
            addCriterion("pub_status >", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("pub_status >=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThan(Integer value) {
            addCriterion("pub_status <", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusLessThanOrEqualTo(Integer value) {
            addCriterion("pub_status <=", value, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusIn(List<Integer> values) {
            addCriterion("pub_status in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotIn(List<Integer> values) {
            addCriterion("pub_status not in", values, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusBetween(Integer value1, Integer value2) {
            addCriterion("pub_status between", value1, value2, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("pub_status not between", value1, value2, "pubStatus");
            return (Criteria) this;
        }

        public Criteria andPubPicIsNull() {
            addCriterion("pub_pic is null");
            return (Criteria) this;
        }

        public Criteria andPubPicIsNotNull() {
            addCriterion("pub_pic is not null");
            return (Criteria) this;
        }

        public Criteria andPubPicEqualTo(String value) {
            addCriterion("pub_pic =", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicNotEqualTo(String value) {
            addCriterion("pub_pic <>", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicGreaterThan(String value) {
            addCriterion("pub_pic >", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicGreaterThanOrEqualTo(String value) {
            addCriterion("pub_pic >=", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicLessThan(String value) {
            addCriterion("pub_pic <", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicLessThanOrEqualTo(String value) {
            addCriterion("pub_pic <=", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicLike(String value) {
            addCriterion("pub_pic like", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicNotLike(String value) {
            addCriterion("pub_pic not like", value, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicIn(List<String> values) {
            addCriterion("pub_pic in", values, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicNotIn(List<String> values) {
            addCriterion("pub_pic not in", values, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicBetween(String value1, String value2) {
            addCriterion("pub_pic between", value1, value2, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubPicNotBetween(String value1, String value2) {
            addCriterion("pub_pic not between", value1, value2, "pubPic");
            return (Criteria) this;
        }

        public Criteria andPubAddressIsNull() {
            addCriterion("pub_address is null");
            return (Criteria) this;
        }

        public Criteria andPubAddressIsNotNull() {
            addCriterion("pub_address is not null");
            return (Criteria) this;
        }

        public Criteria andPubAddressEqualTo(String value) {
            addCriterion("pub_address =", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressNotEqualTo(String value) {
            addCriterion("pub_address <>", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressGreaterThan(String value) {
            addCriterion("pub_address >", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pub_address >=", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressLessThan(String value) {
            addCriterion("pub_address <", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressLessThanOrEqualTo(String value) {
            addCriterion("pub_address <=", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressLike(String value) {
            addCriterion("pub_address like", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressNotLike(String value) {
            addCriterion("pub_address not like", value, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressIn(List<String> values) {
            addCriterion("pub_address in", values, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressNotIn(List<String> values) {
            addCriterion("pub_address not in", values, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressBetween(String value1, String value2) {
            addCriterion("pub_address between", value1, value2, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubAddressNotBetween(String value1, String value2) {
            addCriterion("pub_address not between", value1, value2, "pubAddress");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameIsNull() {
            addCriterion("pub_linkman_name is null");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameIsNotNull() {
            addCriterion("pub_linkman_name is not null");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameEqualTo(String value) {
            addCriterion("pub_linkman_name =", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameNotEqualTo(String value) {
            addCriterion("pub_linkman_name <>", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameGreaterThan(String value) {
            addCriterion("pub_linkman_name >", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("pub_linkman_name >=", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameLessThan(String value) {
            addCriterion("pub_linkman_name <", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("pub_linkman_name <=", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameLike(String value) {
            addCriterion("pub_linkman_name like", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameNotLike(String value) {
            addCriterion("pub_linkman_name not like", value, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameIn(List<String> values) {
            addCriterion("pub_linkman_name in", values, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameNotIn(List<String> values) {
            addCriterion("pub_linkman_name not in", values, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameBetween(String value1, String value2) {
            addCriterion("pub_linkman_name between", value1, value2, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("pub_linkman_name not between", value1, value2, "pubLinkmanName");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneIsNull() {
            addCriterion("pub_telephone is null");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneIsNotNull() {
            addCriterion("pub_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneEqualTo(String value) {
            addCriterion("pub_telephone =", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneNotEqualTo(String value) {
            addCriterion("pub_telephone <>", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneGreaterThan(String value) {
            addCriterion("pub_telephone >", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("pub_telephone >=", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneLessThan(String value) {
            addCriterion("pub_telephone <", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneLessThanOrEqualTo(String value) {
            addCriterion("pub_telephone <=", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneLike(String value) {
            addCriterion("pub_telephone like", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneNotLike(String value) {
            addCriterion("pub_telephone not like", value, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneIn(List<String> values) {
            addCriterion("pub_telephone in", values, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneNotIn(List<String> values) {
            addCriterion("pub_telephone not in", values, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneBetween(String value1, String value2) {
            addCriterion("pub_telephone between", value1, value2, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubTelephoneNotBetween(String value1, String value2) {
            addCriterion("pub_telephone not between", value1, value2, "pubTelephone");
            return (Criteria) this;
        }

        public Criteria andPubBriefIsNull() {
            addCriterion("pub_brief is null");
            return (Criteria) this;
        }

        public Criteria andPubBriefIsNotNull() {
            addCriterion("pub_brief is not null");
            return (Criteria) this;
        }

        public Criteria andPubBriefEqualTo(String value) {
            addCriterion("pub_brief =", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefNotEqualTo(String value) {
            addCriterion("pub_brief <>", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefGreaterThan(String value) {
            addCriterion("pub_brief >", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefGreaterThanOrEqualTo(String value) {
            addCriterion("pub_brief >=", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefLessThan(String value) {
            addCriterion("pub_brief <", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefLessThanOrEqualTo(String value) {
            addCriterion("pub_brief <=", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefLike(String value) {
            addCriterion("pub_brief like", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefNotLike(String value) {
            addCriterion("pub_brief not like", value, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefIn(List<String> values) {
            addCriterion("pub_brief in", values, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefNotIn(List<String> values) {
            addCriterion("pub_brief not in", values, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefBetween(String value1, String value2) {
            addCriterion("pub_brief between", value1, value2, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubBriefNotBetween(String value1, String value2) {
            addCriterion("pub_brief not between", value1, value2, "pubBrief");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeIsNull() {
            addCriterion("pub_create_time is null");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeIsNotNull() {
            addCriterion("pub_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeEqualTo(Date value) {
            addCriterion("pub_create_time =", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeNotEqualTo(Date value) {
            addCriterion("pub_create_time <>", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeGreaterThan(Date value) {
            addCriterion("pub_create_time >", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pub_create_time >=", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeLessThan(Date value) {
            addCriterion("pub_create_time <", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("pub_create_time <=", value, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeIn(List<Date> values) {
            addCriterion("pub_create_time in", values, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeNotIn(List<Date> values) {
            addCriterion("pub_create_time not in", values, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeBetween(Date value1, Date value2) {
            addCriterion("pub_create_time between", value1, value2, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("pub_create_time not between", value1, value2, "pubCreateTime");
            return (Criteria) this;
        }

        public Criteria andPubSaltIsNull() {
            addCriterion("pub_salt is null");
            return (Criteria) this;
        }

        public Criteria andPubSaltIsNotNull() {
            addCriterion("pub_salt is not null");
            return (Criteria) this;
        }

        public Criteria andPubSaltEqualTo(String value) {
            addCriterion("pub_salt =", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltNotEqualTo(String value) {
            addCriterion("pub_salt <>", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltGreaterThan(String value) {
            addCriterion("pub_salt >", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltGreaterThanOrEqualTo(String value) {
            addCriterion("pub_salt >=", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltLessThan(String value) {
            addCriterion("pub_salt <", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltLessThanOrEqualTo(String value) {
            addCriterion("pub_salt <=", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltLike(String value) {
            addCriterion("pub_salt like", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltNotLike(String value) {
            addCriterion("pub_salt not like", value, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltIn(List<String> values) {
            addCriterion("pub_salt in", values, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltNotIn(List<String> values) {
            addCriterion("pub_salt not in", values, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltBetween(String value1, String value2) {
            addCriterion("pub_salt between", value1, value2, "pubSalt");
            return (Criteria) this;
        }

        public Criteria andPubSaltNotBetween(String value1, String value2) {
            addCriterion("pub_salt not between", value1, value2, "pubSalt");
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