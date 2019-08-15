package com.hy.hyTravel.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class ScenicSpotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenicSpotExample() {
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

        public Criteria andScenicNameIsNull() {
            addCriterion("SCENIC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicNameIsNotNull() {
            addCriterion("SCENIC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicNameEqualTo(String value) {
            addCriterion("SCENIC_NAME =", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotEqualTo(String value) {
            addCriterion("SCENIC_NAME <>", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThan(String value) {
            addCriterion("SCENIC_NAME >", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_NAME >=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThan(String value) {
            addCriterion("SCENIC_NAME <", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_NAME <=", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameLike(String value) {
            addCriterion("SCENIC_NAME like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotLike(String value) {
            addCriterion("SCENIC_NAME not like", value, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameIn(List<String> values) {
            addCriterion("SCENIC_NAME in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotIn(List<String> values) {
            addCriterion("SCENIC_NAME not in", values, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameBetween(String value1, String value2) {
            addCriterion("SCENIC_NAME between", value1, value2, "scenicName");
            return (Criteria) this;
        }

        public Criteria andScenicNameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_NAME not between", value1, value2, "scenicName");
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

        public Criteria andCityCodeIsNull() {
            addCriterion("CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("CITY_CODE =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("CITY_CODE <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("CITY_CODE >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CITY_CODE >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("CITY_CODE <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("CITY_CODE <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("CITY_CODE like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("CITY_CODE not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("CITY_CODE in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("CITY_CODE not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("CITY_CODE between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("CITY_CODE not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIsNull() {
            addCriterion("SCENIC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIsNotNull() {
            addCriterion("SCENIC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andScenicPriceEqualTo(BigDecimal value) {
            addCriterion("SCENIC_PRICE =", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotEqualTo(BigDecimal value) {
            addCriterion("SCENIC_PRICE <>", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceGreaterThan(BigDecimal value) {
            addCriterion("SCENIC_PRICE >", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SCENIC_PRICE >=", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceLessThan(BigDecimal value) {
            addCriterion("SCENIC_PRICE <", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SCENIC_PRICE <=", value, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceIn(List<BigDecimal> values) {
            addCriterion("SCENIC_PRICE in", values, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotIn(List<BigDecimal> values) {
            addCriterion("SCENIC_PRICE not in", values, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCENIC_PRICE between", value1, value2, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SCENIC_PRICE not between", value1, value2, "scenicPrice");
            return (Criteria) this;
        }

        public Criteria andScenicImgIsNull() {
            addCriterion("SCENIC_IMG is null");
            return (Criteria) this;
        }

        public Criteria andScenicImgIsNotNull() {
            addCriterion("SCENIC_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andScenicImgEqualTo(String value) {
            addCriterion("SCENIC_IMG =", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotEqualTo(String value) {
            addCriterion("SCENIC_IMG <>", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgGreaterThan(String value) {
            addCriterion("SCENIC_IMG >", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_IMG >=", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLessThan(String value) {
            addCriterion("SCENIC_IMG <", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_IMG <=", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgLike(String value) {
            addCriterion("SCENIC_IMG like", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotLike(String value) {
            addCriterion("SCENIC_IMG not like", value, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgIn(List<String> values) {
            addCriterion("SCENIC_IMG in", values, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotIn(List<String> values) {
            addCriterion("SCENIC_IMG not in", values, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgBetween(String value1, String value2) {
            addCriterion("SCENIC_IMG between", value1, value2, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicImgNotBetween(String value1, String value2) {
            addCriterion("SCENIC_IMG not between", value1, value2, "scenicImg");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendIsNull() {
            addCriterion("SCENIC_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendIsNotNull() {
            addCriterion("SCENIC_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendEqualTo(String value) {
            addCriterion("SCENIC_RECOMMEND =", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendNotEqualTo(String value) {
            addCriterion("SCENIC_RECOMMEND <>", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendGreaterThan(String value) {
            addCriterion("SCENIC_RECOMMEND >", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_RECOMMEND >=", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendLessThan(String value) {
            addCriterion("SCENIC_RECOMMEND <", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_RECOMMEND <=", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendLike(String value) {
            addCriterion("SCENIC_RECOMMEND like", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendNotLike(String value) {
            addCriterion("SCENIC_RECOMMEND not like", value, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendIn(List<String> values) {
            addCriterion("SCENIC_RECOMMEND in", values, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendNotIn(List<String> values) {
            addCriterion("SCENIC_RECOMMEND not in", values, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendBetween(String value1, String value2) {
            addCriterion("SCENIC_RECOMMEND between", value1, value2, "scenicRecommend");
            return (Criteria) this;
        }

        public Criteria andScenicRecommendNotBetween(String value1, String value2) {
            addCriterion("SCENIC_RECOMMEND not between", value1, value2, "scenicRecommend");
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

        public Criteria andGatheringDistanceIsNull() {
            addCriterion("GATHERING_DISTANCE is null");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceIsNotNull() {
            addCriterion("GATHERING_DISTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceEqualTo(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE =", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceNotEqualTo(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE <>", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceGreaterThan(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE >", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE >=", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceLessThan(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE <", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GATHERING_DISTANCE <=", value, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceIn(List<BigDecimal> values) {
            addCriterion("GATHERING_DISTANCE in", values, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceNotIn(List<BigDecimal> values) {
            addCriterion("GATHERING_DISTANCE not in", values, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GATHERING_DISTANCE between", value1, value2, "gatheringDistance");
            return (Criteria) this;
        }

        public Criteria andGatheringDistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GATHERING_DISTANCE not between", value1, value2, "gatheringDistance");
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