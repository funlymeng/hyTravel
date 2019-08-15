package com.hy.hyTravel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class DiningHallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DiningHallExample() {
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

        public Criteria andDiningIdIsNull() {
            addCriterion("DINING_ID is null");
            return (Criteria) this;
        }

        public Criteria andDiningIdIsNotNull() {
            addCriterion("DINING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDiningIdEqualTo(String value) {
            addCriterion("DINING_ID =", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdNotEqualTo(String value) {
            addCriterion("DINING_ID <>", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdGreaterThan(String value) {
            addCriterion("DINING_ID >", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdGreaterThanOrEqualTo(String value) {
            addCriterion("DINING_ID >=", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdLessThan(String value) {
            addCriterion("DINING_ID <", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdLessThanOrEqualTo(String value) {
            addCriterion("DINING_ID <=", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdLike(String value) {
            addCriterion("DINING_ID like", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdNotLike(String value) {
            addCriterion("DINING_ID not like", value, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdIn(List<String> values) {
            addCriterion("DINING_ID in", values, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdNotIn(List<String> values) {
            addCriterion("DINING_ID not in", values, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdBetween(String value1, String value2) {
            addCriterion("DINING_ID between", value1, value2, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningIdNotBetween(String value1, String value2) {
            addCriterion("DINING_ID not between", value1, value2, "diningId");
            return (Criteria) this;
        }

        public Criteria andDiningNameIsNull() {
            addCriterion("DINING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDiningNameIsNotNull() {
            addCriterion("DINING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDiningNameEqualTo(String value) {
            addCriterion("DINING_NAME =", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameNotEqualTo(String value) {
            addCriterion("DINING_NAME <>", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameGreaterThan(String value) {
            addCriterion("DINING_NAME >", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameGreaterThanOrEqualTo(String value) {
            addCriterion("DINING_NAME >=", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameLessThan(String value) {
            addCriterion("DINING_NAME <", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameLessThanOrEqualTo(String value) {
            addCriterion("DINING_NAME <=", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameLike(String value) {
            addCriterion("DINING_NAME like", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameNotLike(String value) {
            addCriterion("DINING_NAME not like", value, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameIn(List<String> values) {
            addCriterion("DINING_NAME in", values, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameNotIn(List<String> values) {
            addCriterion("DINING_NAME not in", values, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameBetween(String value1, String value2) {
            addCriterion("DINING_NAME between", value1, value2, "diningName");
            return (Criteria) this;
        }

        public Criteria andDiningNameNotBetween(String value1, String value2) {
            addCriterion("DINING_NAME not between", value1, value2, "diningName");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNull() {
            addCriterion("SCENIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andScenicIdIsNotNull() {
            addCriterion("SCENIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicIdEqualTo(String value) {
            addCriterion("SCENIC_ID =", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotEqualTo(String value) {
            addCriterion("SCENIC_ID <>", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThan(String value) {
            addCriterion("SCENIC_ID >", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_ID >=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThan(String value) {
            addCriterion("SCENIC_ID <", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_ID <=", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdLike(String value) {
            addCriterion("SCENIC_ID like", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotLike(String value) {
            addCriterion("SCENIC_ID not like", value, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdIn(List<String> values) {
            addCriterion("SCENIC_ID in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotIn(List<String> values) {
            addCriterion("SCENIC_ID not in", values, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdBetween(String value1, String value2) {
            addCriterion("SCENIC_ID between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andScenicIdNotBetween(String value1, String value2) {
            addCriterion("SCENIC_ID not between", value1, value2, "scenicId");
            return (Criteria) this;
        }

        public Criteria andDiningImgIsNull() {
            addCriterion("DINING_IMG is null");
            return (Criteria) this;
        }

        public Criteria andDiningImgIsNotNull() {
            addCriterion("DINING_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andDiningImgEqualTo(String value) {
            addCriterion("DINING_IMG =", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgNotEqualTo(String value) {
            addCriterion("DINING_IMG <>", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgGreaterThan(String value) {
            addCriterion("DINING_IMG >", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgGreaterThanOrEqualTo(String value) {
            addCriterion("DINING_IMG >=", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgLessThan(String value) {
            addCriterion("DINING_IMG <", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgLessThanOrEqualTo(String value) {
            addCriterion("DINING_IMG <=", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgLike(String value) {
            addCriterion("DINING_IMG like", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgNotLike(String value) {
            addCriterion("DINING_IMG not like", value, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgIn(List<String> values) {
            addCriterion("DINING_IMG in", values, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgNotIn(List<String> values) {
            addCriterion("DINING_IMG not in", values, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgBetween(String value1, String value2) {
            addCriterion("DINING_IMG between", value1, value2, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningImgNotBetween(String value1, String value2) {
            addCriterion("DINING_IMG not between", value1, value2, "diningImg");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendIsNull() {
            addCriterion("DINING_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendIsNotNull() {
            addCriterion("DINING_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendEqualTo(String value) {
            addCriterion("DINING_RECOMMEND =", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendNotEqualTo(String value) {
            addCriterion("DINING_RECOMMEND <>", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendGreaterThan(String value) {
            addCriterion("DINING_RECOMMEND >", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("DINING_RECOMMEND >=", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendLessThan(String value) {
            addCriterion("DINING_RECOMMEND <", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendLessThanOrEqualTo(String value) {
            addCriterion("DINING_RECOMMEND <=", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendLike(String value) {
            addCriterion("DINING_RECOMMEND like", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendNotLike(String value) {
            addCriterion("DINING_RECOMMEND not like", value, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendIn(List<String> values) {
            addCriterion("DINING_RECOMMEND in", values, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendNotIn(List<String> values) {
            addCriterion("DINING_RECOMMEND not in", values, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendBetween(String value1, String value2) {
            addCriterion("DINING_RECOMMEND between", value1, value2, "diningRecommend");
            return (Criteria) this;
        }

        public Criteria andDiningRecommendNotBetween(String value1, String value2) {
            addCriterion("DINING_RECOMMEND not between", value1, value2, "diningRecommend");
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