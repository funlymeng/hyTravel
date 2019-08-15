package com.hy.hyTravel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class TravelDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelDetailsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andDetailIdIsNull() {
            addCriterion("DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDetailIdIsNotNull() {
            addCriterion("DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDetailIdEqualTo(String value) {
            addCriterion("DETAIL_ID =", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotEqualTo(String value) {
            addCriterion("DETAIL_ID <>", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThan(String value) {
            addCriterion("DETAIL_ID >", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID >=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThan(String value) {
            addCriterion("DETAIL_ID <", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_ID <=", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdLike(String value) {
            addCriterion("DETAIL_ID like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotLike(String value) {
            addCriterion("DETAIL_ID not like", value, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdIn(List<String> values) {
            addCriterion("DETAIL_ID in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotIn(List<String> values) {
            addCriterion("DETAIL_ID not in", values, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdBetween(String value1, String value2) {
            addCriterion("DETAIL_ID between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andDetailIdNotBetween(String value1, String value2) {
            addCriterion("DETAIL_ID not between", value1, value2, "detailId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNull() {
            addCriterion("TRAVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTravelIdIsNotNull() {
            addCriterion("TRAVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTravelIdEqualTo(String value) {
            addCriterion("TRAVEL_ID =", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotEqualTo(String value) {
            addCriterion("TRAVEL_ID <>", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThan(String value) {
            addCriterion("TRAVEL_ID >", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_ID >=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThan(String value) {
            addCriterion("TRAVEL_ID <", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_ID <=", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdLike(String value) {
            addCriterion("TRAVEL_ID like", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotLike(String value) {
            addCriterion("TRAVEL_ID not like", value, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdIn(List<String> values) {
            addCriterion("TRAVEL_ID in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotIn(List<String> values) {
            addCriterion("TRAVEL_ID not in", values, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdBetween(String value1, String value2) {
            addCriterion("TRAVEL_ID between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andTravelIdNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_ID not between", value1, value2, "travelId");
            return (Criteria) this;
        }

        public Criteria andDetailSortIsNull() {
            addCriterion("DETAIL_SORT is null");
            return (Criteria) this;
        }

        public Criteria andDetailSortIsNotNull() {
            addCriterion("DETAIL_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andDetailSortEqualTo(String value) {
            addCriterion("DETAIL_SORT =", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotEqualTo(String value) {
            addCriterion("DETAIL_SORT <>", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortGreaterThan(String value) {
            addCriterion("DETAIL_SORT >", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortGreaterThanOrEqualTo(String value) {
            addCriterion("DETAIL_SORT >=", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortLessThan(String value) {
            addCriterion("DETAIL_SORT <", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortLessThanOrEqualTo(String value) {
            addCriterion("DETAIL_SORT <=", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortLike(String value) {
            addCriterion("DETAIL_SORT like", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotLike(String value) {
            addCriterion("DETAIL_SORT not like", value, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortIn(List<String> values) {
            addCriterion("DETAIL_SORT in", values, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotIn(List<String> values) {
            addCriterion("DETAIL_SORT not in", values, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortBetween(String value1, String value2) {
            addCriterion("DETAIL_SORT between", value1, value2, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDetailSortNotBetween(String value1, String value2) {
            addCriterion("DETAIL_SORT not between", value1, value2, "detailSort");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNull() {
            addCriterion("DESTINATION is null");
            return (Criteria) this;
        }

        public Criteria andDestinationIsNotNull() {
            addCriterion("DESTINATION is not null");
            return (Criteria) this;
        }

        public Criteria andDestinationEqualTo(String value) {
            addCriterion("DESTINATION =", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotEqualTo(String value) {
            addCriterion("DESTINATION <>", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThan(String value) {
            addCriterion("DESTINATION >", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("DESTINATION >=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThan(String value) {
            addCriterion("DESTINATION <", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLessThanOrEqualTo(String value) {
            addCriterion("DESTINATION <=", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationLike(String value) {
            addCriterion("DESTINATION like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotLike(String value) {
            addCriterion("DESTINATION not like", value, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationIn(List<String> values) {
            addCriterion("DESTINATION in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotIn(List<String> values) {
            addCriterion("DESTINATION not in", values, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationBetween(String value1, String value2) {
            addCriterion("DESTINATION between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andDestinationNotBetween(String value1, String value2) {
            addCriterion("DESTINATION not between", value1, value2, "destination");
            return (Criteria) this;
        }

        public Criteria andScenicAIdIsNull() {
            addCriterion("SCENIC_A_ID is null");
            return (Criteria) this;
        }

        public Criteria andScenicAIdIsNotNull() {
            addCriterion("SCENIC_A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicAIdEqualTo(String value) {
            addCriterion("SCENIC_A_ID =", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdNotEqualTo(String value) {
            addCriterion("SCENIC_A_ID <>", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdGreaterThan(String value) {
            addCriterion("SCENIC_A_ID >", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_A_ID >=", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdLessThan(String value) {
            addCriterion("SCENIC_A_ID <", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_A_ID <=", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdLike(String value) {
            addCriterion("SCENIC_A_ID like", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdNotLike(String value) {
            addCriterion("SCENIC_A_ID not like", value, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdIn(List<String> values) {
            addCriterion("SCENIC_A_ID in", values, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdNotIn(List<String> values) {
            addCriterion("SCENIC_A_ID not in", values, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdBetween(String value1, String value2) {
            addCriterion("SCENIC_A_ID between", value1, value2, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicAIdNotBetween(String value1, String value2) {
            addCriterion("SCENIC_A_ID not between", value1, value2, "scenicAId");
            return (Criteria) this;
        }

        public Criteria andScenicANameIsNull() {
            addCriterion("SCENIC_A_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicANameIsNotNull() {
            addCriterion("SCENIC_A_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicANameEqualTo(String value) {
            addCriterion("SCENIC_A_NAME =", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameNotEqualTo(String value) {
            addCriterion("SCENIC_A_NAME <>", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameGreaterThan(String value) {
            addCriterion("SCENIC_A_NAME >", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_A_NAME >=", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameLessThan(String value) {
            addCriterion("SCENIC_A_NAME <", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_A_NAME <=", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameLike(String value) {
            addCriterion("SCENIC_A_NAME like", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameNotLike(String value) {
            addCriterion("SCENIC_A_NAME not like", value, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameIn(List<String> values) {
            addCriterion("SCENIC_A_NAME in", values, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameNotIn(List<String> values) {
            addCriterion("SCENIC_A_NAME not in", values, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameBetween(String value1, String value2) {
            addCriterion("SCENIC_A_NAME between", value1, value2, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicANameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_A_NAME not between", value1, value2, "scenicAName");
            return (Criteria) this;
        }

        public Criteria andScenicBIdIsNull() {
            addCriterion("SCENIC_B_ID is null");
            return (Criteria) this;
        }

        public Criteria andScenicBIdIsNotNull() {
            addCriterion("SCENIC_B_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicBIdEqualTo(String value) {
            addCriterion("SCENIC_B_ID =", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdNotEqualTo(String value) {
            addCriterion("SCENIC_B_ID <>", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdGreaterThan(String value) {
            addCriterion("SCENIC_B_ID >", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_B_ID >=", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdLessThan(String value) {
            addCriterion("SCENIC_B_ID <", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_B_ID <=", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdLike(String value) {
            addCriterion("SCENIC_B_ID like", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdNotLike(String value) {
            addCriterion("SCENIC_B_ID not like", value, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdIn(List<String> values) {
            addCriterion("SCENIC_B_ID in", values, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdNotIn(List<String> values) {
            addCriterion("SCENIC_B_ID not in", values, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdBetween(String value1, String value2) {
            addCriterion("SCENIC_B_ID between", value1, value2, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBIdNotBetween(String value1, String value2) {
            addCriterion("SCENIC_B_ID not between", value1, value2, "scenicBId");
            return (Criteria) this;
        }

        public Criteria andScenicBNameIsNull() {
            addCriterion("SCENIC_B_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicBNameIsNotNull() {
            addCriterion("SCENIC_B_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicBNameEqualTo(String value) {
            addCriterion("SCENIC_B_NAME =", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameNotEqualTo(String value) {
            addCriterion("SCENIC_B_NAME <>", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameGreaterThan(String value) {
            addCriterion("SCENIC_B_NAME >", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_B_NAME >=", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameLessThan(String value) {
            addCriterion("SCENIC_B_NAME <", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_B_NAME <=", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameLike(String value) {
            addCriterion("SCENIC_B_NAME like", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameNotLike(String value) {
            addCriterion("SCENIC_B_NAME not like", value, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameIn(List<String> values) {
            addCriterion("SCENIC_B_NAME in", values, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameNotIn(List<String> values) {
            addCriterion("SCENIC_B_NAME not in", values, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameBetween(String value1, String value2) {
            addCriterion("SCENIC_B_NAME between", value1, value2, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicBNameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_B_NAME not between", value1, value2, "scenicBName");
            return (Criteria) this;
        }

        public Criteria andScenicCIdIsNull() {
            addCriterion("SCENIC_C_ID is null");
            return (Criteria) this;
        }

        public Criteria andScenicCIdIsNotNull() {
            addCriterion("SCENIC_C_ID is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCIdEqualTo(String value) {
            addCriterion("SCENIC_C_ID =", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdNotEqualTo(String value) {
            addCriterion("SCENIC_C_ID <>", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdGreaterThan(String value) {
            addCriterion("SCENIC_C_ID >", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_C_ID >=", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdLessThan(String value) {
            addCriterion("SCENIC_C_ID <", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_C_ID <=", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdLike(String value) {
            addCriterion("SCENIC_C_ID like", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdNotLike(String value) {
            addCriterion("SCENIC_C_ID not like", value, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdIn(List<String> values) {
            addCriterion("SCENIC_C_ID in", values, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdNotIn(List<String> values) {
            addCriterion("SCENIC_C_ID not in", values, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdBetween(String value1, String value2) {
            addCriterion("SCENIC_C_ID between", value1, value2, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCIdNotBetween(String value1, String value2) {
            addCriterion("SCENIC_C_ID not between", value1, value2, "scenicCId");
            return (Criteria) this;
        }

        public Criteria andScenicCNameIsNull() {
            addCriterion("SCENIC_C_NAME is null");
            return (Criteria) this;
        }

        public Criteria andScenicCNameIsNotNull() {
            addCriterion("SCENIC_C_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andScenicCNameEqualTo(String value) {
            addCriterion("SCENIC_C_NAME =", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameNotEqualTo(String value) {
            addCriterion("SCENIC_C_NAME <>", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameGreaterThan(String value) {
            addCriterion("SCENIC_C_NAME >", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameGreaterThanOrEqualTo(String value) {
            addCriterion("SCENIC_C_NAME >=", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameLessThan(String value) {
            addCriterion("SCENIC_C_NAME <", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameLessThanOrEqualTo(String value) {
            addCriterion("SCENIC_C_NAME <=", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameLike(String value) {
            addCriterion("SCENIC_C_NAME like", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameNotLike(String value) {
            addCriterion("SCENIC_C_NAME not like", value, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameIn(List<String> values) {
            addCriterion("SCENIC_C_NAME in", values, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameNotIn(List<String> values) {
            addCriterion("SCENIC_C_NAME not in", values, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameBetween(String value1, String value2) {
            addCriterion("SCENIC_C_NAME between", value1, value2, "scenicCName");
            return (Criteria) this;
        }

        public Criteria andScenicCNameNotBetween(String value1, String value2) {
            addCriterion("SCENIC_C_NAME not between", value1, value2, "scenicCName");
            return (Criteria) this;
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

        public Criteria andDetailDateIsNull() {
            addCriterion("DETAIL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDetailDateIsNotNull() {
            addCriterion("DETAIL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDateEqualTo(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE =", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE <>", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE >", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE >=", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateLessThan(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE <", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DETAIL_DATE <=", value, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateIn(List<Date> values) {
            addCriterionForJDBCDate("DETAIL_DATE in", values, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DETAIL_DATE not in", values, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DETAIL_DATE between", value1, value2, "detailDate");
            return (Criteria) this;
        }

        public Criteria andDetailDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DETAIL_DATE not between", value1, value2, "detailDate");
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