package com.dongtu.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserExample() {
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

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
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

        public Criteria andUserCreatedTimeIsNull() {
            addCriterion("user_created_time is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeIsNotNull() {
            addCriterion("user_created_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeEqualTo(Date value) {
            addCriterion("user_created_time =", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeNotEqualTo(Date value) {
            addCriterion("user_created_time <>", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeGreaterThan(Date value) {
            addCriterion("user_created_time >", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_created_time >=", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeLessThan(Date value) {
            addCriterion("user_created_time <", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_created_time <=", value, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeIn(List<Date> values) {
            addCriterion("user_created_time in", values, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeNotIn(List<Date> values) {
            addCriterion("user_created_time not in", values, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("user_created_time between", value1, value2, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_created_time not between", value1, value2, "userCreatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeIsNull() {
            addCriterion("user_updated_time is null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeIsNotNull() {
            addCriterion("user_updated_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeEqualTo(Date value) {
            addCriterion("user_updated_time =", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeNotEqualTo(Date value) {
            addCriterion("user_updated_time <>", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeGreaterThan(Date value) {
            addCriterion("user_updated_time >", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_updated_time >=", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeLessThan(Date value) {
            addCriterion("user_updated_time <", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_updated_time <=", value, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeIn(List<Date> values) {
            addCriterion("user_updated_time in", values, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeNotIn(List<Date> values) {
            addCriterion("user_updated_time not in", values, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("user_updated_time between", value1, value2, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_updated_time not between", value1, value2, "userUpdatedTime");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNull() {
            addCriterion("user_sex is null");
            return (Criteria) this;
        }

        public Criteria andUserSexIsNotNull() {
            addCriterion("user_sex is not null");
            return (Criteria) this;
        }

        public Criteria andUserSexEqualTo(Integer value) {
            addCriterion("user_sex =", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotEqualTo(Integer value) {
            addCriterion("user_sex <>", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThan(Integer value) {
            addCriterion("user_sex >", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_sex >=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThan(Integer value) {
            addCriterion("user_sex <", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexLessThanOrEqualTo(Integer value) {
            addCriterion("user_sex <=", value, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexIn(List<Integer> values) {
            addCriterion("user_sex in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotIn(List<Integer> values) {
            addCriterion("user_sex not in", values, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexBetween(Integer value1, Integer value2) {
            addCriterion("user_sex between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserSexNotBetween(Integer value1, Integer value2) {
            addCriterion("user_sex not between", value1, value2, "userSex");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicIsNull() {
            addCriterion("user_head_pic is null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicIsNotNull() {
            addCriterion("user_head_pic is not null");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicEqualTo(String value) {
            addCriterion("user_head_pic =", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicNotEqualTo(String value) {
            addCriterion("user_head_pic <>", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicGreaterThan(String value) {
            addCriterion("user_head_pic >", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicGreaterThanOrEqualTo(String value) {
            addCriterion("user_head_pic >=", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicLessThan(String value) {
            addCriterion("user_head_pic <", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicLessThanOrEqualTo(String value) {
            addCriterion("user_head_pic <=", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicLike(String value) {
            addCriterion("user_head_pic like", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicNotLike(String value) {
            addCriterion("user_head_pic not like", value, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicIn(List<String> values) {
            addCriterion("user_head_pic in", values, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicNotIn(List<String> values) {
            addCriterion("user_head_pic not in", values, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicBetween(String value1, String value2) {
            addCriterion("user_head_pic between", value1, value2, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserHeadPicNotBetween(String value1, String value2) {
            addCriterion("user_head_pic not between", value1, value2, "userHeadPic");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceIsNull() {
            addCriterion("user_account_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceIsNotNull() {
            addCriterion("user_account_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceEqualTo(BigDecimal value) {
            addCriterion("user_account_balance =", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceNotEqualTo(BigDecimal value) {
            addCriterion("user_account_balance <>", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceGreaterThan(BigDecimal value) {
            addCriterion("user_account_balance >", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_account_balance >=", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceLessThan(BigDecimal value) {
            addCriterion("user_account_balance <", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_account_balance <=", value, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceIn(List<BigDecimal> values) {
            addCriterion("user_account_balance in", values, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceNotIn(List<BigDecimal> values) {
            addCriterion("user_account_balance not in", values, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_account_balance between", value1, value2, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserAccountBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_account_balance not between", value1, value2, "userAccountBalance");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNull() {
            addCriterion("user_points is null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIsNotNull() {
            addCriterion("user_points is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointsEqualTo(BigDecimal value) {
            addCriterion("user_points =", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotEqualTo(BigDecimal value) {
            addCriterion("user_points <>", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThan(BigDecimal value) {
            addCriterion("user_points >", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_points >=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThan(BigDecimal value) {
            addCriterion("user_points <", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_points <=", value, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsIn(List<BigDecimal> values) {
            addCriterion("user_points in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotIn(List<BigDecimal> values) {
            addCriterion("user_points not in", values, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_points between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_points not between", value1, value2, "userPoints");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(Integer value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(Integer value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(Integer value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(Integer value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(Integer value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<Integer> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<Integer> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(Integer value1, Integer value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueIsNull() {
            addCriterion("user_experience_value is null");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueIsNotNull() {
            addCriterion("user_experience_value is not null");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueEqualTo(Integer value) {
            addCriterion("user_experience_value =", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueNotEqualTo(Integer value) {
            addCriterion("user_experience_value <>", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueGreaterThan(Integer value) {
            addCriterion("user_experience_value >", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_experience_value >=", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueLessThan(Integer value) {
            addCriterion("user_experience_value <", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueLessThanOrEqualTo(Integer value) {
            addCriterion("user_experience_value <=", value, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueIn(List<Integer> values) {
            addCriterion("user_experience_value in", values, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueNotIn(List<Integer> values) {
            addCriterion("user_experience_value not in", values, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueBetween(Integer value1, Integer value2) {
            addCriterion("user_experience_value between", value1, value2, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserExperienceValueNotBetween(Integer value1, Integer value2) {
            addCriterion("user_experience_value not between", value1, value2, "userExperienceValue");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Date value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Date value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Date value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Date value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Date> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Date> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Date value1, Date value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNull() {
            addCriterion("user_last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIsNotNull() {
            addCriterion("user_last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeEqualTo(Date value) {
            addCriterion("user_last_login_time =", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotEqualTo(Date value) {
            addCriterion("user_last_login_time <>", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThan(Date value) {
            addCriterion("user_last_login_time >", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time >=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThan(Date value) {
            addCriterion("user_last_login_time <", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("user_last_login_time <=", value, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeIn(List<Date> values) {
            addCriterion("user_last_login_time in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotIn(List<Date> values) {
            addCriterion("user_last_login_time not in", values, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("user_last_login_time not between", value1, value2, "userLastLoginTime");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNull() {
            addCriterion("user_salt is null");
            return (Criteria) this;
        }

        public Criteria andUserSaltIsNotNull() {
            addCriterion("user_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUserSaltEqualTo(String value) {
            addCriterion("user_salt =", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotEqualTo(String value) {
            addCriterion("user_salt <>", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThan(String value) {
            addCriterion("user_salt >", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltGreaterThanOrEqualTo(String value) {
            addCriterion("user_salt >=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThan(String value) {
            addCriterion("user_salt <", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLessThanOrEqualTo(String value) {
            addCriterion("user_salt <=", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltLike(String value) {
            addCriterion("user_salt like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotLike(String value) {
            addCriterion("user_salt not like", value, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltIn(List<String> values) {
            addCriterion("user_salt in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotIn(List<String> values) {
            addCriterion("user_salt not in", values, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltBetween(String value1, String value2) {
            addCriterion("user_salt between", value1, value2, "userSalt");
            return (Criteria) this;
        }

        public Criteria andUserSaltNotBetween(String value1, String value2) {
            addCriterion("user_salt not between", value1, value2, "userSalt");
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