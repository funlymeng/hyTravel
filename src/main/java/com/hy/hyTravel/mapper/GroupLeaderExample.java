package com.hy.hyTravel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class GroupLeaderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupLeaderExample() {
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

        public Criteria andLeaderIdIsNull() {
            addCriterion("LEADER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIsNotNull() {
            addCriterion("LEADER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderIdEqualTo(String value) {
            addCriterion("LEADER_ID =", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotEqualTo(String value) {
            addCriterion("LEADER_ID <>", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThan(String value) {
            addCriterion("LEADER_ID >", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER_ID >=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThan(String value) {
            addCriterion("LEADER_ID <", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLessThanOrEqualTo(String value) {
            addCriterion("LEADER_ID <=", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdLike(String value) {
            addCriterion("LEADER_ID like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotLike(String value) {
            addCriterion("LEADER_ID not like", value, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdIn(List<String> values) {
            addCriterion("LEADER_ID in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotIn(List<String> values) {
            addCriterion("LEADER_ID not in", values, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdBetween(String value1, String value2) {
            addCriterion("LEADER_ID between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andLeaderIdNotBetween(String value1, String value2) {
            addCriterion("LEADER_ID not between", value1, value2, "leaderId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("PROVINCE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("PROVINCE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("PROVINCE_CODE =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("PROVINCE_CODE <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("PROVINCE_CODE >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("PROVINCE_CODE <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_CODE <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("PROVINCE_CODE like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("PROVINCE_CODE not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("PROVINCE_CODE in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("PROVINCE_CODE not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_CODE not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNull() {
            addCriterion("PROVINCE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIsNotNull() {
            addCriterion("PROVINCE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceNameEqualTo(String value) {
            addCriterion("PROVINCE_NAME =", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotEqualTo(String value) {
            addCriterion("PROVINCE_NAME <>", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThan(String value) {
            addCriterion("PROVINCE_NAME >", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME >=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThan(String value) {
            addCriterion("PROVINCE_NAME <", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE_NAME <=", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameLike(String value) {
            addCriterion("PROVINCE_NAME like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotLike(String value) {
            addCriterion("PROVINCE_NAME not like", value, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameIn(List<String> values) {
            addCriterion("PROVINCE_NAME in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotIn(List<String> values) {
            addCriterion("PROVINCE_NAME not in", values, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andProvinceNameNotBetween(String value1, String value2) {
            addCriterion("PROVINCE_NAME not between", value1, value2, "provinceName");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("NICK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("NICK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("NICK_NAME =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("NICK_NAME <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("NICK_NAME >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("NICK_NAME >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("NICK_NAME <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("NICK_NAME <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("NICK_NAME like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("NICK_NAME not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("NICK_NAME in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("NICK_NAME not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("NICK_NAME between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("NICK_NAME not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andLeaderImgIsNull() {
            addCriterion("LEADER_IMG is null");
            return (Criteria) this;
        }

        public Criteria andLeaderImgIsNotNull() {
            addCriterion("LEADER_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderImgEqualTo(String value) {
            addCriterion("LEADER_IMG =", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgNotEqualTo(String value) {
            addCriterion("LEADER_IMG <>", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgGreaterThan(String value) {
            addCriterion("LEADER_IMG >", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER_IMG >=", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgLessThan(String value) {
            addCriterion("LEADER_IMG <", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgLessThanOrEqualTo(String value) {
            addCriterion("LEADER_IMG <=", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgLike(String value) {
            addCriterion("LEADER_IMG like", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgNotLike(String value) {
            addCriterion("LEADER_IMG not like", value, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgIn(List<String> values) {
            addCriterion("LEADER_IMG in", values, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgNotIn(List<String> values) {
            addCriterion("LEADER_IMG not in", values, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgBetween(String value1, String value2) {
            addCriterion("LEADER_IMG between", value1, value2, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderImgNotBetween(String value1, String value2) {
            addCriterion("LEADER_IMG not between", value1, value2, "leaderImg");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendIsNull() {
            addCriterion("LEADER_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendIsNotNull() {
            addCriterion("LEADER_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendEqualTo(String value) {
            addCriterion("LEADER_RECOMMEND =", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendNotEqualTo(String value) {
            addCriterion("LEADER_RECOMMEND <>", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendGreaterThan(String value) {
            addCriterion("LEADER_RECOMMEND >", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("LEADER_RECOMMEND >=", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendLessThan(String value) {
            addCriterion("LEADER_RECOMMEND <", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendLessThanOrEqualTo(String value) {
            addCriterion("LEADER_RECOMMEND <=", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendLike(String value) {
            addCriterion("LEADER_RECOMMEND like", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendNotLike(String value) {
            addCriterion("LEADER_RECOMMEND not like", value, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendIn(List<String> values) {
            addCriterion("LEADER_RECOMMEND in", values, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendNotIn(List<String> values) {
            addCriterion("LEADER_RECOMMEND not in", values, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendBetween(String value1, String value2) {
            addCriterion("LEADER_RECOMMEND between", value1, value2, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andLeaderRecommendNotBetween(String value1, String value2) {
            addCriterion("LEADER_RECOMMEND not between", value1, value2, "leaderRecommend");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNull() {
            addCriterion("IS_VALID is null");
            return (Criteria) this;
        }

        public Criteria andIsValidIsNotNull() {
            addCriterion("IS_VALID is not null");
            return (Criteria) this;
        }

        public Criteria andIsValidEqualTo(String value) {
            addCriterion("IS_VALID =", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotEqualTo(String value) {
            addCriterion("IS_VALID <>", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThan(String value) {
            addCriterion("IS_VALID >", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_VALID >=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThan(String value) {
            addCriterion("IS_VALID <", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLessThanOrEqualTo(String value) {
            addCriterion("IS_VALID <=", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidLike(String value) {
            addCriterion("IS_VALID like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotLike(String value) {
            addCriterion("IS_VALID not like", value, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidIn(List<String> values) {
            addCriterion("IS_VALID in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotIn(List<String> values) {
            addCriterion("IS_VALID not in", values, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidBetween(String value1, String value2) {
            addCriterion("IS_VALID between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andIsValidNotBetween(String value1, String value2) {
            addCriterion("IS_VALID not between", value1, value2, "isValid");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNull() {
            addCriterion("CHECK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIsNotNull() {
            addCriterion("CHECK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCheckStatusEqualTo(Integer value) {
            addCriterion("CHECK_STATUS =", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <>", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThan(Integer value) {
            addCriterion("CHECK_STATUS >", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS >=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThan(Integer value) {
            addCriterion("CHECK_STATUS <", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_STATUS <=", value, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusIn(List<Integer> values) {
            addCriterion("CHECK_STATUS in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotIn(List<Integer> values) {
            addCriterion("CHECK_STATUS not in", values, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_STATUS not between", value1, value2, "checkStatus");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("CREATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("CREATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(String value) {
            addCriterion("CREATED_BY =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(String value) {
            addCriterion("CREATED_BY <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(String value) {
            addCriterion("CREATED_BY >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(String value) {
            addCriterion("CREATED_BY >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(String value) {
            addCriterion("CREATED_BY <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(String value) {
            addCriterion("CREATED_BY <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLike(String value) {
            addCriterion("CREATED_BY like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotLike(String value) {
            addCriterion("CREATED_BY not like", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<String> values) {
            addCriterion("CREATED_BY in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<String> values) {
            addCriterion("CREATED_BY not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(String value1, String value2) {
            addCriterion("CREATED_BY between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(String value1, String value2) {
            addCriterion("CREATED_BY not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("CREATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("CREATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("CREATED_TIME =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("CREATED_TIME <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("CREATED_TIME >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("CREATED_TIME <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATED_TIME <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("CREATED_TIME in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("CREATED_TIME not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATED_TIME not between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("UPDATED_BY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("UPDATED_BY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(String value) {
            addCriterion("UPDATED_BY =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(String value) {
            addCriterion("UPDATED_BY <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(String value) {
            addCriterion("UPDATED_BY >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(String value) {
            addCriterion("UPDATED_BY <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(String value) {
            addCriterion("UPDATED_BY <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLike(String value) {
            addCriterion("UPDATED_BY like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotLike(String value) {
            addCriterion("UPDATED_BY not like", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<String> values) {
            addCriterion("UPDATED_BY in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<String> values) {
            addCriterion("UPDATED_BY not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(String value1, String value2) {
            addCriterion("UPDATED_BY between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(String value1, String value2) {
            addCriterion("UPDATED_BY not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNull() {
            addCriterion("UPDATED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIsNotNull() {
            addCriterion("UPDATED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeEqualTo(Date value) {
            addCriterion("UPDATED_TIME =", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotEqualTo(Date value) {
            addCriterion("UPDATED_TIME <>", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThan(Date value) {
            addCriterion("UPDATED_TIME >", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME >=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThan(Date value) {
            addCriterion("UPDATED_TIME <", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATED_TIME <=", value, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeIn(List<Date> values) {
            addCriterion("UPDATED_TIME in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotIn(List<Date> values) {
            addCriterion("UPDATED_TIME not in", values, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andUpdatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATED_TIME not between", value1, value2, "updatedTime");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNull() {
            addCriterion("CERTIFICATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIsNotNull() {
            addCriterion("CERTIFICATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER =", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER <>", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThan(String value) {
            addCriterion("CERTIFICATE_NUMBER >", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER >=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThan(String value) {
            addCriterion("CERTIFICATE_NUMBER <", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NUMBER <=", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberLike(String value) {
            addCriterion("CERTIFICATE_NUMBER like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotLike(String value) {
            addCriterion("CERTIFICATE_NUMBER not like", value, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberIn(List<String> values) {
            addCriterion("CERTIFICATE_NUMBER in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NUMBER not in", values, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUMBER between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NUMBER not between", value1, value2, "certificateNumber");
            return (Criteria) this;
        }

        public Criteria andTraveledExpIsNull() {
            addCriterion("traveled_exp is null");
            return (Criteria) this;
        }

        public Criteria andTraveledExpIsNotNull() {
            addCriterion("traveled_exp is not null");
            return (Criteria) this;
        }

        public Criteria andTraveledExpEqualTo(String value) {
            addCriterion("traveled_exp =", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpNotEqualTo(String value) {
            addCriterion("traveled_exp <>", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpGreaterThan(String value) {
            addCriterion("traveled_exp >", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpGreaterThanOrEqualTo(String value) {
            addCriterion("traveled_exp >=", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpLessThan(String value) {
            addCriterion("traveled_exp <", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpLessThanOrEqualTo(String value) {
            addCriterion("traveled_exp <=", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpLike(String value) {
            addCriterion("traveled_exp like", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpNotLike(String value) {
            addCriterion("traveled_exp not like", value, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpIn(List<String> values) {
            addCriterion("traveled_exp in", values, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpNotIn(List<String> values) {
            addCriterion("traveled_exp not in", values, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpBetween(String value1, String value2) {
            addCriterion("traveled_exp between", value1, value2, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andTraveledExpNotBetween(String value1, String value2) {
            addCriterion("traveled_exp not between", value1, value2, "traveledExp");
            return (Criteria) this;
        }

        public Criteria andShootExpIsNull() {
            addCriterion("shoot_exp is null");
            return (Criteria) this;
        }

        public Criteria andShootExpIsNotNull() {
            addCriterion("shoot_exp is not null");
            return (Criteria) this;
        }

        public Criteria andShootExpEqualTo(String value) {
            addCriterion("shoot_exp =", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpNotEqualTo(String value) {
            addCriterion("shoot_exp <>", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpGreaterThan(String value) {
            addCriterion("shoot_exp >", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpGreaterThanOrEqualTo(String value) {
            addCriterion("shoot_exp >=", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpLessThan(String value) {
            addCriterion("shoot_exp <", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpLessThanOrEqualTo(String value) {
            addCriterion("shoot_exp <=", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpLike(String value) {
            addCriterion("shoot_exp like", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpNotLike(String value) {
            addCriterion("shoot_exp not like", value, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpIn(List<String> values) {
            addCriterion("shoot_exp in", values, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpNotIn(List<String> values) {
            addCriterion("shoot_exp not in", values, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpBetween(String value1, String value2) {
            addCriterion("shoot_exp between", value1, value2, "shootExp");
            return (Criteria) this;
        }

        public Criteria andShootExpNotBetween(String value1, String value2) {
            addCriterion("shoot_exp not between", value1, value2, "shootExp");
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