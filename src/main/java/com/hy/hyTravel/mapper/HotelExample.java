package com.hy.hyTravel.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
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

        public Criteria andHotelIdIsNull() {
            addCriterion("HOTEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("HOTEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(String value) {
            addCriterion("HOTEL_ID =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(String value) {
            addCriterion("HOTEL_ID <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(String value) {
            addCriterion("HOTEL_ID >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_ID >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(String value) {
            addCriterion("HOTEL_ID <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_ID <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLike(String value) {
            addCriterion("HOTEL_ID like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotLike(String value) {
            addCriterion("HOTEL_ID not like", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<String> values) {
            addCriterion("HOTEL_ID in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<String> values) {
            addCriterion("HOTEL_ID not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(String value1, String value2) {
            addCriterion("HOTEL_ID between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(String value1, String value2) {
            addCriterion("HOTEL_ID not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNull() {
            addCriterion("HOTEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("HOTEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("HOTEL_NAME =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("HOTEL_NAME <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("HOTEL_NAME >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_NAME >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("HOTEL_NAME <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_NAME <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("HOTEL_NAME like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("HOTEL_NAME not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("HOTEL_NAME in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("HOTEL_NAME not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("HOTEL_NAME between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("HOTEL_NAME not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelStarIsNull() {
            addCriterion("HOTEL_STAR is null");
            return (Criteria) this;
        }

        public Criteria andHotelStarIsNotNull() {
            addCriterion("HOTEL_STAR is not null");
            return (Criteria) this;
        }

        public Criteria andHotelStarEqualTo(String value) {
            addCriterion("HOTEL_STAR =", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarNotEqualTo(String value) {
            addCriterion("HOTEL_STAR <>", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarGreaterThan(String value) {
            addCriterion("HOTEL_STAR >", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_STAR >=", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarLessThan(String value) {
            addCriterion("HOTEL_STAR <", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_STAR <=", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarLike(String value) {
            addCriterion("HOTEL_STAR like", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarNotLike(String value) {
            addCriterion("HOTEL_STAR not like", value, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarIn(List<String> values) {
            addCriterion("HOTEL_STAR in", values, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarNotIn(List<String> values) {
            addCriterion("HOTEL_STAR not in", values, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarBetween(String value1, String value2) {
            addCriterion("HOTEL_STAR between", value1, value2, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelStarNotBetween(String value1, String value2) {
            addCriterion("HOTEL_STAR not between", value1, value2, "hotelStar");
            return (Criteria) this;
        }

        public Criteria andHotelTypeIsNull() {
            addCriterion("HOTEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andHotelTypeIsNotNull() {
            addCriterion("HOTEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andHotelTypeEqualTo(String value) {
            addCriterion("HOTEL_TYPE =", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotEqualTo(String value) {
            addCriterion("HOTEL_TYPE <>", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeGreaterThan(String value) {
            addCriterion("HOTEL_TYPE >", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_TYPE >=", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLessThan(String value) {
            addCriterion("HOTEL_TYPE <", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_TYPE <=", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeLike(String value) {
            addCriterion("HOTEL_TYPE like", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotLike(String value) {
            addCriterion("HOTEL_TYPE not like", value, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeIn(List<String> values) {
            addCriterion("HOTEL_TYPE in", values, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotIn(List<String> values) {
            addCriterion("HOTEL_TYPE not in", values, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeBetween(String value1, String value2) {
            addCriterion("HOTEL_TYPE between", value1, value2, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelTypeNotBetween(String value1, String value2) {
            addCriterion("HOTEL_TYPE not between", value1, value2, "hotelType");
            return (Criteria) this;
        }

        public Criteria andHotelPriceIsNull() {
            addCriterion("HOTEL_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andHotelPriceIsNotNull() {
            addCriterion("HOTEL_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andHotelPriceEqualTo(BigDecimal value) {
            addCriterion("HOTEL_PRICE =", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceNotEqualTo(BigDecimal value) {
            addCriterion("HOTEL_PRICE <>", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceGreaterThan(BigDecimal value) {
            addCriterion("HOTEL_PRICE >", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTEL_PRICE >=", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceLessThan(BigDecimal value) {
            addCriterion("HOTEL_PRICE <", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HOTEL_PRICE <=", value, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceIn(List<BigDecimal> values) {
            addCriterion("HOTEL_PRICE in", values, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceNotIn(List<BigDecimal> values) {
            addCriterion("HOTEL_PRICE not in", values, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTEL_PRICE between", value1, value2, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HOTEL_PRICE not between", value1, value2, "hotelPrice");
            return (Criteria) this;
        }

        public Criteria andHotelImgIsNull() {
            addCriterion("HOTEL_IMG is null");
            return (Criteria) this;
        }

        public Criteria andHotelImgIsNotNull() {
            addCriterion("HOTEL_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andHotelImgEqualTo(String value) {
            addCriterion("HOTEL_IMG =", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotEqualTo(String value) {
            addCriterion("HOTEL_IMG <>", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgGreaterThan(String value) {
            addCriterion("HOTEL_IMG >", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_IMG >=", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLessThan(String value) {
            addCriterion("HOTEL_IMG <", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_IMG <=", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgLike(String value) {
            addCriterion("HOTEL_IMG like", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotLike(String value) {
            addCriterion("HOTEL_IMG not like", value, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgIn(List<String> values) {
            addCriterion("HOTEL_IMG in", values, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotIn(List<String> values) {
            addCriterion("HOTEL_IMG not in", values, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgBetween(String value1, String value2) {
            addCriterion("HOTEL_IMG between", value1, value2, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelImgNotBetween(String value1, String value2) {
            addCriterion("HOTEL_IMG not between", value1, value2, "hotelImg");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendIsNull() {
            addCriterion("HOTEL_RECOMMEND is null");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendIsNotNull() {
            addCriterion("HOTEL_RECOMMEND is not null");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendEqualTo(String value) {
            addCriterion("HOTEL_RECOMMEND =", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendNotEqualTo(String value) {
            addCriterion("HOTEL_RECOMMEND <>", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendGreaterThan(String value) {
            addCriterion("HOTEL_RECOMMEND >", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("HOTEL_RECOMMEND >=", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendLessThan(String value) {
            addCriterion("HOTEL_RECOMMEND <", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendLessThanOrEqualTo(String value) {
            addCriterion("HOTEL_RECOMMEND <=", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendLike(String value) {
            addCriterion("HOTEL_RECOMMEND like", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendNotLike(String value) {
            addCriterion("HOTEL_RECOMMEND not like", value, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendIn(List<String> values) {
            addCriterion("HOTEL_RECOMMEND in", values, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendNotIn(List<String> values) {
            addCriterion("HOTEL_RECOMMEND not in", values, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendBetween(String value1, String value2) {
            addCriterion("HOTEL_RECOMMEND between", value1, value2, "hotelRecommend");
            return (Criteria) this;
        }

        public Criteria andHotelRecommendNotBetween(String value1, String value2) {
            addCriterion("HOTEL_RECOMMEND not between", value1, value2, "hotelRecommend");
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