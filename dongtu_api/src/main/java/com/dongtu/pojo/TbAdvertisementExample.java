package com.dongtu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAdvertisementExample() {
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

        public Criteria andAdIdIsNull() {
            addCriterion("ad_id is null");
            return (Criteria) this;
        }

        public Criteria andAdIdIsNotNull() {
            addCriterion("ad_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdIdEqualTo(Long value) {
            addCriterion("ad_id =", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotEqualTo(Long value) {
            addCriterion("ad_id <>", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThan(Long value) {
            addCriterion("ad_id >", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_id >=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThan(Long value) {
            addCriterion("ad_id <", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_id <=", value, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdIn(List<Long> values) {
            addCriterion("ad_id in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotIn(List<Long> values) {
            addCriterion("ad_id not in", values, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdBetween(Long value1, Long value2) {
            addCriterion("ad_id between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_id not between", value1, value2, "adId");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNull() {
            addCriterion("ad_name is null");
            return (Criteria) this;
        }

        public Criteria andAdNameIsNotNull() {
            addCriterion("ad_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdNameEqualTo(String value) {
            addCriterion("ad_name =", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotEqualTo(String value) {
            addCriterion("ad_name <>", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThan(String value) {
            addCriterion("ad_name >", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameGreaterThanOrEqualTo(String value) {
            addCriterion("ad_name >=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThan(String value) {
            addCriterion("ad_name <", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLessThanOrEqualTo(String value) {
            addCriterion("ad_name <=", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameLike(String value) {
            addCriterion("ad_name like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotLike(String value) {
            addCriterion("ad_name not like", value, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameIn(List<String> values) {
            addCriterion("ad_name in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotIn(List<String> values) {
            addCriterion("ad_name not in", values, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameBetween(String value1, String value2) {
            addCriterion("ad_name between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdNameNotBetween(String value1, String value2) {
            addCriterion("ad_name not between", value1, value2, "adName");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdIsNull() {
            addCriterion("ad_media_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdIsNotNull() {
            addCriterion("ad_media_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdEqualTo(Long value) {
            addCriterion("ad_media_type_id =", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdNotEqualTo(Long value) {
            addCriterion("ad_media_type_id <>", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdGreaterThan(Long value) {
            addCriterion("ad_media_type_id >", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_media_type_id >=", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdLessThan(Long value) {
            addCriterion("ad_media_type_id <", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_media_type_id <=", value, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdIn(List<Long> values) {
            addCriterion("ad_media_type_id in", values, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdNotIn(List<Long> values) {
            addCriterion("ad_media_type_id not in", values, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdBetween(Long value1, Long value2) {
            addCriterion("ad_media_type_id between", value1, value2, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdMediaTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_media_type_id not between", value1, value2, "adMediaTypeId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdIsNull() {
            addCriterion("ad_field_id is null");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdIsNotNull() {
            addCriterion("ad_field_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdEqualTo(Long value) {
            addCriterion("ad_field_id =", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdNotEqualTo(Long value) {
            addCriterion("ad_field_id <>", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdGreaterThan(Long value) {
            addCriterion("ad_field_id >", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_field_id >=", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdLessThan(Long value) {
            addCriterion("ad_field_id <", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_field_id <=", value, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdIn(List<Long> values) {
            addCriterion("ad_field_id in", values, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdNotIn(List<Long> values) {
            addCriterion("ad_field_id not in", values, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdBetween(Long value1, Long value2) {
            addCriterion("ad_field_id between", value1, value2, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdFieldIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_field_id not between", value1, value2, "adFieldId");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeIsNull() {
            addCriterion("ad_start_time is null");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeIsNotNull() {
            addCriterion("ad_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeEqualTo(Date value) {
            addCriterion("ad_start_time =", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeNotEqualTo(Date value) {
            addCriterion("ad_start_time <>", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeGreaterThan(Date value) {
            addCriterion("ad_start_time >", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_start_time >=", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeLessThan(Date value) {
            addCriterion("ad_start_time <", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("ad_start_time <=", value, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeIn(List<Date> values) {
            addCriterion("ad_start_time in", values, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeNotIn(List<Date> values) {
            addCriterion("ad_start_time not in", values, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeBetween(Date value1, Date value2) {
            addCriterion("ad_start_time between", value1, value2, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("ad_start_time not between", value1, value2, "adStartTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeIsNull() {
            addCriterion("ad_end_time is null");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeIsNotNull() {
            addCriterion("ad_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeEqualTo(Date value) {
            addCriterion("ad_end_time =", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeNotEqualTo(Date value) {
            addCriterion("ad_end_time <>", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeGreaterThan(Date value) {
            addCriterion("ad_end_time >", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ad_end_time >=", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeLessThan(Date value) {
            addCriterion("ad_end_time <", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("ad_end_time <=", value, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeIn(List<Date> values) {
            addCriterion("ad_end_time in", values, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeNotIn(List<Date> values) {
            addCriterion("ad_end_time not in", values, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeBetween(Date value1, Date value2) {
            addCriterion("ad_end_time between", value1, value2, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("ad_end_time not between", value1, value2, "adEndTime");
            return (Criteria) this;
        }

        public Criteria andAdLinkIsNull() {
            addCriterion("ad_link is null");
            return (Criteria) this;
        }

        public Criteria andAdLinkIsNotNull() {
            addCriterion("ad_link is not null");
            return (Criteria) this;
        }

        public Criteria andAdLinkEqualTo(String value) {
            addCriterion("ad_link =", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkNotEqualTo(String value) {
            addCriterion("ad_link <>", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkGreaterThan(String value) {
            addCriterion("ad_link >", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ad_link >=", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkLessThan(String value) {
            addCriterion("ad_link <", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkLessThanOrEqualTo(String value) {
            addCriterion("ad_link <=", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkLike(String value) {
            addCriterion("ad_link like", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkNotLike(String value) {
            addCriterion("ad_link not like", value, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkIn(List<String> values) {
            addCriterion("ad_link in", values, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkNotIn(List<String> values) {
            addCriterion("ad_link not in", values, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkBetween(String value1, String value2) {
            addCriterion("ad_link between", value1, value2, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdLinkNotBetween(String value1, String value2) {
            addCriterion("ad_link not between", value1, value2, "adLink");
            return (Criteria) this;
        }

        public Criteria andAdImgIsNull() {
            addCriterion("ad_img is null");
            return (Criteria) this;
        }

        public Criteria andAdImgIsNotNull() {
            addCriterion("ad_img is not null");
            return (Criteria) this;
        }

        public Criteria andAdImgEqualTo(String value) {
            addCriterion("ad_img =", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotEqualTo(String value) {
            addCriterion("ad_img <>", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgGreaterThan(String value) {
            addCriterion("ad_img >", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgGreaterThanOrEqualTo(String value) {
            addCriterion("ad_img >=", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLessThan(String value) {
            addCriterion("ad_img <", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLessThanOrEqualTo(String value) {
            addCriterion("ad_img <=", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgLike(String value) {
            addCriterion("ad_img like", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotLike(String value) {
            addCriterion("ad_img not like", value, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgIn(List<String> values) {
            addCriterion("ad_img in", values, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotIn(List<String> values) {
            addCriterion("ad_img not in", values, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgBetween(String value1, String value2) {
            addCriterion("ad_img between", value1, value2, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgNotBetween(String value1, String value2) {
            addCriterion("ad_img not between", value1, value2, "adImg");
            return (Criteria) this;
        }

        public Criteria andAdImgurlIsNull() {
            addCriterion("ad_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andAdImgurlIsNotNull() {
            addCriterion("ad_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andAdImgurlEqualTo(String value) {
            addCriterion("ad_imgurl =", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlNotEqualTo(String value) {
            addCriterion("ad_imgurl <>", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlGreaterThan(String value) {
            addCriterion("ad_imgurl >", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("ad_imgurl >=", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlLessThan(String value) {
            addCriterion("ad_imgurl <", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlLessThanOrEqualTo(String value) {
            addCriterion("ad_imgurl <=", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlLike(String value) {
            addCriterion("ad_imgurl like", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlNotLike(String value) {
            addCriterion("ad_imgurl not like", value, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlIn(List<String> values) {
            addCriterion("ad_imgurl in", values, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlNotIn(List<String> values) {
            addCriterion("ad_imgurl not in", values, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlBetween(String value1, String value2) {
            addCriterion("ad_imgurl between", value1, value2, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andAdImgurlNotBetween(String value1, String value2) {
            addCriterion("ad_imgurl not between", value1, value2, "adImgurl");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNull() {
            addCriterion("is_open is null");
            return (Criteria) this;
        }

        public Criteria andIsOpenIsNotNull() {
            addCriterion("is_open is not null");
            return (Criteria) this;
        }

        public Criteria andIsOpenEqualTo(Integer value) {
            addCriterion("is_open =", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotEqualTo(Integer value) {
            addCriterion("is_open <>", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThan(Integer value) {
            addCriterion("is_open >", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_open >=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThan(Integer value) {
            addCriterion("is_open <", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenLessThanOrEqualTo(Integer value) {
            addCriterion("is_open <=", value, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenIn(List<Integer> values) {
            addCriterion("is_open in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotIn(List<Integer> values) {
            addCriterion("is_open not in", values, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenBetween(Integer value1, Integer value2) {
            addCriterion("is_open between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andIsOpenNotBetween(Integer value1, Integer value2) {
            addCriterion("is_open not between", value1, value2, "isOpen");
            return (Criteria) this;
        }

        public Criteria andAdLinkManIsNull() {
            addCriterion("ad_link_man is null");
            return (Criteria) this;
        }

        public Criteria andAdLinkManIsNotNull() {
            addCriterion("ad_link_man is not null");
            return (Criteria) this;
        }

        public Criteria andAdLinkManEqualTo(String value) {
            addCriterion("ad_link_man =", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManNotEqualTo(String value) {
            addCriterion("ad_link_man <>", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManGreaterThan(String value) {
            addCriterion("ad_link_man >", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("ad_link_man >=", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManLessThan(String value) {
            addCriterion("ad_link_man <", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManLessThanOrEqualTo(String value) {
            addCriterion("ad_link_man <=", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManLike(String value) {
            addCriterion("ad_link_man like", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManNotLike(String value) {
            addCriterion("ad_link_man not like", value, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManIn(List<String> values) {
            addCriterion("ad_link_man in", values, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManNotIn(List<String> values) {
            addCriterion("ad_link_man not in", values, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManBetween(String value1, String value2) {
            addCriterion("ad_link_man between", value1, value2, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdLinkManNotBetween(String value1, String value2) {
            addCriterion("ad_link_man not between", value1, value2, "adLinkMan");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNull() {
            addCriterion("ad_email is null");
            return (Criteria) this;
        }

        public Criteria andAdEmailIsNotNull() {
            addCriterion("ad_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdEmailEqualTo(String value) {
            addCriterion("ad_email =", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotEqualTo(String value) {
            addCriterion("ad_email <>", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThan(String value) {
            addCriterion("ad_email >", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ad_email >=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThan(String value) {
            addCriterion("ad_email <", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLessThanOrEqualTo(String value) {
            addCriterion("ad_email <=", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailLike(String value) {
            addCriterion("ad_email like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotLike(String value) {
            addCriterion("ad_email not like", value, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailIn(List<String> values) {
            addCriterion("ad_email in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotIn(List<String> values) {
            addCriterion("ad_email not in", values, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailBetween(String value1, String value2) {
            addCriterion("ad_email between", value1, value2, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdEmailNotBetween(String value1, String value2) {
            addCriterion("ad_email not between", value1, value2, "adEmail");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNull() {
            addCriterion("ad_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIsNotNull() {
            addCriterion("ad_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdPhoneEqualTo(String value) {
            addCriterion("ad_phone =", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotEqualTo(String value) {
            addCriterion("ad_phone <>", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThan(String value) {
            addCriterion("ad_phone >", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ad_phone >=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThan(String value) {
            addCriterion("ad_phone <", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLessThanOrEqualTo(String value) {
            addCriterion("ad_phone <=", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneLike(String value) {
            addCriterion("ad_phone like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotLike(String value) {
            addCriterion("ad_phone not like", value, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneIn(List<String> values) {
            addCriterion("ad_phone in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotIn(List<String> values) {
            addCriterion("ad_phone not in", values, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneBetween(String value1, String value2) {
            addCriterion("ad_phone between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdPhoneNotBetween(String value1, String value2) {
            addCriterion("ad_phone not between", value1, value2, "adPhone");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdIsNull() {
            addCriterion("ad_traverl_seller_id is null");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdIsNotNull() {
            addCriterion("ad_traverl_seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdEqualTo(Long value) {
            addCriterion("ad_traverl_seller_id =", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdNotEqualTo(Long value) {
            addCriterion("ad_traverl_seller_id <>", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdGreaterThan(Long value) {
            addCriterion("ad_traverl_seller_id >", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ad_traverl_seller_id >=", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdLessThan(Long value) {
            addCriterion("ad_traverl_seller_id <", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdLessThanOrEqualTo(Long value) {
            addCriterion("ad_traverl_seller_id <=", value, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdIn(List<Long> values) {
            addCriterion("ad_traverl_seller_id in", values, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdNotIn(List<Long> values) {
            addCriterion("ad_traverl_seller_id not in", values, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdBetween(Long value1, Long value2) {
            addCriterion("ad_traverl_seller_id between", value1, value2, "adTraverlSellerId");
            return (Criteria) this;
        }

        public Criteria andAdTraverlSellerIdNotBetween(Long value1, Long value2) {
            addCriterion("ad_traverl_seller_id not between", value1, value2, "adTraverlSellerId");
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