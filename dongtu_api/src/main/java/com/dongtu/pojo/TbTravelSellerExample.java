package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbTravelSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTravelSellerExample() {
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

        public Criteria andTravelSellerIdIsNull() {
            addCriterion("travel_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdIsNotNull() {
            addCriterion("travel_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdEqualTo(Long value) {
            addCriterion("travel_seller_id =", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotEqualTo(Long value) {
            addCriterion("travel_seller_id <>", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdGreaterThan(Long value) {
            addCriterion("travel_seller_id >", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("travel_seller_id >=", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdLessThan(Long value) {
            addCriterion("travel_seller_id <", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("travel_seller_id <=", value, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdIn(List<Long> values) {
            addCriterion("travel_seller_id in", values, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotIn(List<Long> values) {
            addCriterion("travel_seller_id not in", values, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdBetween(Long value1, Long value2) {
            addCriterion("travel_seller_id between", value1, value2, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("travel_seller_id not between", value1, value2, "travelSellerId");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNull() {
            addCriterion("travel_name is null");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNotNull() {
            addCriterion("travel_name is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNameEqualTo(String value) {
            addCriterion("travel_name =", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotEqualTo(String value) {
            addCriterion("travel_name <>", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThan(String value) {
            addCriterion("travel_name >", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThanOrEqualTo(String value) {
            addCriterion("travel_name >=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThan(String value) {
            addCriterion("travel_name <", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThanOrEqualTo(String value) {
            addCriterion("travel_name <=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLike(String value) {
            addCriterion("travel_name like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotLike(String value) {
            addCriterion("travel_name not like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameIn(List<String> values) {
            addCriterion("travel_name in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotIn(List<String> values) {
            addCriterion("travel_name not in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameBetween(String value1, String value2) {
            addCriterion("travel_name between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotBetween(String value1, String value2) {
            addCriterion("travel_name not between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordIsNull() {
            addCriterion("travel_password is null");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordIsNotNull() {
            addCriterion("travel_password is not null");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordEqualTo(String value) {
            addCriterion("travel_password =", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordNotEqualTo(String value) {
            addCriterion("travel_password <>", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordGreaterThan(String value) {
            addCriterion("travel_password >", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("travel_password >=", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordLessThan(String value) {
            addCriterion("travel_password <", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordLessThanOrEqualTo(String value) {
            addCriterion("travel_password <=", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordLike(String value) {
            addCriterion("travel_password like", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordNotLike(String value) {
            addCriterion("travel_password not like", value, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordIn(List<String> values) {
            addCriterion("travel_password in", values, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordNotIn(List<String> values) {
            addCriterion("travel_password not in", values, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordBetween(String value1, String value2) {
            addCriterion("travel_password between", value1, value2, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelPasswordNotBetween(String value1, String value2) {
            addCriterion("travel_password not between", value1, value2, "travelPassword");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNull() {
            addCriterion("travel_status is null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNotNull() {
            addCriterion("travel_status is not null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusEqualTo(Integer value) {
            addCriterion("travel_status =", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotEqualTo(Integer value) {
            addCriterion("travel_status <>", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThan(Integer value) {
            addCriterion("travel_status >", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("travel_status >=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThan(Integer value) {
            addCriterion("travel_status <", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThanOrEqualTo(Integer value) {
            addCriterion("travel_status <=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIn(List<Integer> values) {
            addCriterion("travel_status in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotIn(List<Integer> values) {
            addCriterion("travel_status not in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusBetween(Integer value1, Integer value2) {
            addCriterion("travel_status between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("travel_status not between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceIsNull() {
            addCriterion("travel_balence is null");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceIsNotNull() {
            addCriterion("travel_balence is not null");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceEqualTo(Long value) {
            addCriterion("travel_balence =", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceNotEqualTo(Long value) {
            addCriterion("travel_balence <>", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceGreaterThan(Long value) {
            addCriterion("travel_balence >", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceGreaterThanOrEqualTo(Long value) {
            addCriterion("travel_balence >=", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceLessThan(Long value) {
            addCriterion("travel_balence <", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceLessThanOrEqualTo(Long value) {
            addCriterion("travel_balence <=", value, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceIn(List<Long> values) {
            addCriterion("travel_balence in", values, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceNotIn(List<Long> values) {
            addCriterion("travel_balence not in", values, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceBetween(Long value1, Long value2) {
            addCriterion("travel_balence between", value1, value2, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelBalenceNotBetween(Long value1, Long value2) {
            addCriterion("travel_balence not between", value1, value2, "travelBalence");
            return (Criteria) this;
        }

        public Criteria andTravelPicIsNull() {
            addCriterion("travel_pic is null");
            return (Criteria) this;
        }

        public Criteria andTravelPicIsNotNull() {
            addCriterion("travel_pic is not null");
            return (Criteria) this;
        }

        public Criteria andTravelPicEqualTo(String value) {
            addCriterion("travel_pic =", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicNotEqualTo(String value) {
            addCriterion("travel_pic <>", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicGreaterThan(String value) {
            addCriterion("travel_pic >", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicGreaterThanOrEqualTo(String value) {
            addCriterion("travel_pic >=", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicLessThan(String value) {
            addCriterion("travel_pic <", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicLessThanOrEqualTo(String value) {
            addCriterion("travel_pic <=", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicLike(String value) {
            addCriterion("travel_pic like", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicNotLike(String value) {
            addCriterion("travel_pic not like", value, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicIn(List<String> values) {
            addCriterion("travel_pic in", values, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicNotIn(List<String> values) {
            addCriterion("travel_pic not in", values, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicBetween(String value1, String value2) {
            addCriterion("travel_pic between", value1, value2, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelPicNotBetween(String value1, String value2) {
            addCriterion("travel_pic not between", value1, value2, "travelPic");
            return (Criteria) this;
        }

        public Criteria andTravelAddressIsNull() {
            addCriterion("travel_address is null");
            return (Criteria) this;
        }

        public Criteria andTravelAddressIsNotNull() {
            addCriterion("travel_address is not null");
            return (Criteria) this;
        }

        public Criteria andTravelAddressEqualTo(String value) {
            addCriterion("travel_address =", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressNotEqualTo(String value) {
            addCriterion("travel_address <>", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressGreaterThan(String value) {
            addCriterion("travel_address >", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressGreaterThanOrEqualTo(String value) {
            addCriterion("travel_address >=", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressLessThan(String value) {
            addCriterion("travel_address <", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressLessThanOrEqualTo(String value) {
            addCriterion("travel_address <=", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressLike(String value) {
            addCriterion("travel_address like", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressNotLike(String value) {
            addCriterion("travel_address not like", value, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressIn(List<String> values) {
            addCriterion("travel_address in", values, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressNotIn(List<String> values) {
            addCriterion("travel_address not in", values, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressBetween(String value1, String value2) {
            addCriterion("travel_address between", value1, value2, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelAddressNotBetween(String value1, String value2) {
            addCriterion("travel_address not between", value1, value2, "travelAddress");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameIsNull() {
            addCriterion("travel_linkman_name is null");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameIsNotNull() {
            addCriterion("travel_linkman_name is not null");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameEqualTo(String value) {
            addCriterion("travel_linkman_name =", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameNotEqualTo(String value) {
            addCriterion("travel_linkman_name <>", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameGreaterThan(String value) {
            addCriterion("travel_linkman_name >", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameGreaterThanOrEqualTo(String value) {
            addCriterion("travel_linkman_name >=", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameLessThan(String value) {
            addCriterion("travel_linkman_name <", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameLessThanOrEqualTo(String value) {
            addCriterion("travel_linkman_name <=", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameLike(String value) {
            addCriterion("travel_linkman_name like", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameNotLike(String value) {
            addCriterion("travel_linkman_name not like", value, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameIn(List<String> values) {
            addCriterion("travel_linkman_name in", values, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameNotIn(List<String> values) {
            addCriterion("travel_linkman_name not in", values, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameBetween(String value1, String value2) {
            addCriterion("travel_linkman_name between", value1, value2, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelLinkmanNameNotBetween(String value1, String value2) {
            addCriterion("travel_linkman_name not between", value1, value2, "travelLinkmanName");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneIsNull() {
            addCriterion("travel_telephone is null");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneIsNotNull() {
            addCriterion("travel_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneEqualTo(String value) {
            addCriterion("travel_telephone =", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneNotEqualTo(String value) {
            addCriterion("travel_telephone <>", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneGreaterThan(String value) {
            addCriterion("travel_telephone >", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("travel_telephone >=", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneLessThan(String value) {
            addCriterion("travel_telephone <", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneLessThanOrEqualTo(String value) {
            addCriterion("travel_telephone <=", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneLike(String value) {
            addCriterion("travel_telephone like", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneNotLike(String value) {
            addCriterion("travel_telephone not like", value, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneIn(List<String> values) {
            addCriterion("travel_telephone in", values, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneNotIn(List<String> values) {
            addCriterion("travel_telephone not in", values, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneBetween(String value1, String value2) {
            addCriterion("travel_telephone between", value1, value2, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelTelephoneNotBetween(String value1, String value2) {
            addCriterion("travel_telephone not between", value1, value2, "travelTelephone");
            return (Criteria) this;
        }

        public Criteria andTravelBriefIsNull() {
            addCriterion("travel_brief is null");
            return (Criteria) this;
        }

        public Criteria andTravelBriefIsNotNull() {
            addCriterion("travel_brief is not null");
            return (Criteria) this;
        }

        public Criteria andTravelBriefEqualTo(String value) {
            addCriterion("travel_brief =", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefNotEqualTo(String value) {
            addCriterion("travel_brief <>", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefGreaterThan(String value) {
            addCriterion("travel_brief >", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefGreaterThanOrEqualTo(String value) {
            addCriterion("travel_brief >=", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefLessThan(String value) {
            addCriterion("travel_brief <", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefLessThanOrEqualTo(String value) {
            addCriterion("travel_brief <=", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefLike(String value) {
            addCriterion("travel_brief like", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefNotLike(String value) {
            addCriterion("travel_brief not like", value, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefIn(List<String> values) {
            addCriterion("travel_brief in", values, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefNotIn(List<String> values) {
            addCriterion("travel_brief not in", values, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefBetween(String value1, String value2) {
            addCriterion("travel_brief between", value1, value2, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelBriefNotBetween(String value1, String value2) {
            addCriterion("travel_brief not between", value1, value2, "travelBrief");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeIsNull() {
            addCriterion("travel_create_time is null");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeIsNotNull() {
            addCriterion("travel_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeEqualTo(Date value) {
            addCriterion("travel_create_time =", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeNotEqualTo(Date value) {
            addCriterion("travel_create_time <>", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeGreaterThan(Date value) {
            addCriterion("travel_create_time >", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("travel_create_time >=", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeLessThan(Date value) {
            addCriterion("travel_create_time <", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("travel_create_time <=", value, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeIn(List<Date> values) {
            addCriterion("travel_create_time in", values, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeNotIn(List<Date> values) {
            addCriterion("travel_create_time not in", values, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeBetween(Date value1, Date value2) {
            addCriterion("travel_create_time between", value1, value2, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("travel_create_time not between", value1, value2, "travelCreateTime");
            return (Criteria) this;
        }

        public Criteria andTravelSaltIsNull() {
            addCriterion("travel_salt is null");
            return (Criteria) this;
        }

        public Criteria andTravelSaltIsNotNull() {
            addCriterion("travel_salt is not null");
            return (Criteria) this;
        }

        public Criteria andTravelSaltEqualTo(String value) {
            addCriterion("travel_salt =", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltNotEqualTo(String value) {
            addCriterion("travel_salt <>", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltGreaterThan(String value) {
            addCriterion("travel_salt >", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltGreaterThanOrEqualTo(String value) {
            addCriterion("travel_salt >=", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltLessThan(String value) {
            addCriterion("travel_salt <", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltLessThanOrEqualTo(String value) {
            addCriterion("travel_salt <=", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltLike(String value) {
            addCriterion("travel_salt like", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltNotLike(String value) {
            addCriterion("travel_salt not like", value, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltIn(List<String> values) {
            addCriterion("travel_salt in", values, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltNotIn(List<String> values) {
            addCriterion("travel_salt not in", values, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltBetween(String value1, String value2) {
            addCriterion("travel_salt between", value1, value2, "travelSalt");
            return (Criteria) this;
        }

        public Criteria andTravelSaltNotBetween(String value1, String value2) {
            addCriterion("travel_salt not between", value1, value2, "travelSalt");
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