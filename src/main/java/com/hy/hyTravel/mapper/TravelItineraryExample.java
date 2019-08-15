package com.hy.hyTravel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


public class TravelItineraryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelItineraryExample() {
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

        public Criteria andTravelNameIsNull() {
            addCriterion("TRAVEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTravelNameIsNotNull() {
            addCriterion("TRAVEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTravelNameEqualTo(String value) {
            addCriterion("TRAVEL_NAME =", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotEqualTo(String value) {
            addCriterion("TRAVEL_NAME <>", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThan(String value) {
            addCriterion("TRAVEL_NAME >", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_NAME >=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThan(String value) {
            addCriterion("TRAVEL_NAME <", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_NAME <=", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameLike(String value) {
            addCriterion("TRAVEL_NAME like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotLike(String value) {
            addCriterion("TRAVEL_NAME not like", value, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameIn(List<String> values) {
            addCriterion("TRAVEL_NAME in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotIn(List<String> values) {
            addCriterion("TRAVEL_NAME not in", values, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameBetween(String value1, String value2) {
            addCriterion("TRAVEL_NAME between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelNameNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_NAME not between", value1, value2, "travelName");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIsNull() {
            addCriterion("TRAVEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIsNotNull() {
            addCriterion("TRAVEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTravelTypeEqualTo(String value) {
            addCriterion("TRAVEL_TYPE =", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotEqualTo(String value) {
            addCriterion("TRAVEL_TYPE <>", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeGreaterThan(String value) {
            addCriterion("TRAVEL_TYPE >", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_TYPE >=", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeLessThan(String value) {
            addCriterion("TRAVEL_TYPE <", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_TYPE <=", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeLike(String value) {
            addCriterion("TRAVEL_TYPE like", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotLike(String value) {
            addCriterion("TRAVEL_TYPE not like", value, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeIn(List<String> values) {
            addCriterion("TRAVEL_TYPE in", values, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotIn(List<String> values) {
            addCriterion("TRAVEL_TYPE not in", values, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeBetween(String value1, String value2) {
            addCriterion("TRAVEL_TYPE between", value1, value2, "travelType");
            return (Criteria) this;
        }

        public Criteria andTravelTypeNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_TYPE not between", value1, value2, "travelType");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIsNull() {
            addCriterion("PEOPLE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIsNotNull() {
            addCriterion("PEOPLE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberEqualTo(Integer value) {
            addCriterion("PEOPLE_NUMBER =", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotEqualTo(Integer value) {
            addCriterion("PEOPLE_NUMBER <>", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberGreaterThan(Integer value) {
            addCriterion("PEOPLE_NUMBER >", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE_NUMBER >=", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberLessThan(Integer value) {
            addCriterion("PEOPLE_NUMBER <", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberLessThanOrEqualTo(Integer value) {
            addCriterion("PEOPLE_NUMBER <=", value, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberIn(List<Integer> values) {
            addCriterion("PEOPLE_NUMBER in", values, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotIn(List<Integer> values) {
            addCriterion("PEOPLE_NUMBER not in", values, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE_NUMBER between", value1, value2, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andPeopleNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PEOPLE_NUMBER not between", value1, value2, "peopleNumber");
            return (Criteria) this;
        }

        public Criteria andTravelCarIsNull() {
            addCriterion("TRAVEL_CAR is null");
            return (Criteria) this;
        }

        public Criteria andTravelCarIsNotNull() {
            addCriterion("TRAVEL_CAR is not null");
            return (Criteria) this;
        }

        public Criteria andTravelCarEqualTo(String value) {
            addCriterion("TRAVEL_CAR =", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarNotEqualTo(String value) {
            addCriterion("TRAVEL_CAR <>", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarGreaterThan(String value) {
            addCriterion("TRAVEL_CAR >", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_CAR >=", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarLessThan(String value) {
            addCriterion("TRAVEL_CAR <", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_CAR <=", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarLike(String value) {
            addCriterion("TRAVEL_CAR like", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarNotLike(String value) {
            addCriterion("TRAVEL_CAR not like", value, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarIn(List<String> values) {
            addCriterion("TRAVEL_CAR in", values, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarNotIn(List<String> values) {
            addCriterion("TRAVEL_CAR not in", values, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarBetween(String value1, String value2) {
            addCriterion("TRAVEL_CAR between", value1, value2, "travelCar");
            return (Criteria) this;
        }

        public Criteria andTravelCarNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_CAR not between", value1, value2, "travelCar");
            return (Criteria) this;
        }

        public Criteria andAgeLimitIsNull() {
            addCriterion("AGE_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAgeLimitIsNotNull() {
            addCriterion("AGE_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAgeLimitEqualTo(String value) {
            addCriterion("AGE_LIMIT =", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitNotEqualTo(String value) {
            addCriterion("AGE_LIMIT <>", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitGreaterThan(String value) {
            addCriterion("AGE_LIMIT >", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("AGE_LIMIT >=", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitLessThan(String value) {
            addCriterion("AGE_LIMIT <", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitLessThanOrEqualTo(String value) {
            addCriterion("AGE_LIMIT <=", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitLike(String value) {
            addCriterion("AGE_LIMIT like", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitNotLike(String value) {
            addCriterion("AGE_LIMIT not like", value, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitIn(List<String> values) {
            addCriterion("AGE_LIMIT in", values, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitNotIn(List<String> values) {
            addCriterion("AGE_LIMIT not in", values, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitBetween(String value1, String value2) {
            addCriterion("AGE_LIMIT between", value1, value2, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andAgeLimitNotBetween(String value1, String value2) {
            addCriterion("AGE_LIMIT not between", value1, value2, "ageLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitIsNull() {
            addCriterion("SEX_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andSexLimitIsNotNull() {
            addCriterion("SEX_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andSexLimitEqualTo(String value) {
            addCriterion("SEX_LIMIT =", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitNotEqualTo(String value) {
            addCriterion("SEX_LIMIT <>", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitGreaterThan(String value) {
            addCriterion("SEX_LIMIT >", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitGreaterThanOrEqualTo(String value) {
            addCriterion("SEX_LIMIT >=", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitLessThan(String value) {
            addCriterion("SEX_LIMIT <", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitLessThanOrEqualTo(String value) {
            addCriterion("SEX_LIMIT <=", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitLike(String value) {
            addCriterion("SEX_LIMIT like", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitNotLike(String value) {
            addCriterion("SEX_LIMIT not like", value, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitIn(List<String> values) {
            addCriterion("SEX_LIMIT in", values, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitNotIn(List<String> values) {
            addCriterion("SEX_LIMIT not in", values, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitBetween(String value1, String value2) {
            addCriterion("SEX_LIMIT between", value1, value2, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andSexLimitNotBetween(String value1, String value2) {
            addCriterion("SEX_LIMIT not between", value1, value2, "sexLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitIsNull() {
            addCriterion("AREA_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andAreaLimitIsNotNull() {
            addCriterion("AREA_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andAreaLimitEqualTo(String value) {
            addCriterion("AREA_LIMIT =", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitNotEqualTo(String value) {
            addCriterion("AREA_LIMIT <>", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitGreaterThan(String value) {
            addCriterion("AREA_LIMIT >", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_LIMIT >=", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitLessThan(String value) {
            addCriterion("AREA_LIMIT <", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitLessThanOrEqualTo(String value) {
            addCriterion("AREA_LIMIT <=", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitLike(String value) {
            addCriterion("AREA_LIMIT like", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitNotLike(String value) {
            addCriterion("AREA_LIMIT not like", value, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitIn(List<String> values) {
            addCriterion("AREA_LIMIT in", values, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitNotIn(List<String> values) {
            addCriterion("AREA_LIMIT not in", values, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitBetween(String value1, String value2) {
            addCriterion("AREA_LIMIT between", value1, value2, "areaLimit");
            return (Criteria) this;
        }

        public Criteria andAreaLimitNotBetween(String value1, String value2) {
            addCriterion("AREA_LIMIT not between", value1, value2, "areaLimit");
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

        public Criteria andGatheringPlaceIsNull() {
            addCriterion("GATHERING_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceIsNotNull() {
            addCriterion("GATHERING_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceEqualTo(String value) {
            addCriterion("GATHERING_PLACE =", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceNotEqualTo(String value) {
            addCriterion("GATHERING_PLACE <>", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceGreaterThan(String value) {
            addCriterion("GATHERING_PLACE >", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("GATHERING_PLACE >=", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceLessThan(String value) {
            addCriterion("GATHERING_PLACE <", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceLessThanOrEqualTo(String value) {
            addCriterion("GATHERING_PLACE <=", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceLike(String value) {
            addCriterion("GATHERING_PLACE like", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceNotLike(String value) {
            addCriterion("GATHERING_PLACE not like", value, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceIn(List<String> values) {
            addCriterion("GATHERING_PLACE in", values, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceNotIn(List<String> values) {
            addCriterion("GATHERING_PLACE not in", values, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceBetween(String value1, String value2) {
            addCriterion("GATHERING_PLACE between", value1, value2, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andGatheringPlaceNotBetween(String value1, String value2) {
            addCriterion("GATHERING_PLACE not between", value1, value2, "gatheringPlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceIsNull() {
            addCriterion("LEAVE_PLACE is null");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceIsNotNull() {
            addCriterion("LEAVE_PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceEqualTo(String value) {
            addCriterion("LEAVE_PLACE =", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceNotEqualTo(String value) {
            addCriterion("LEAVE_PLACE <>", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceGreaterThan(String value) {
            addCriterion("LEAVE_PLACE >", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_PLACE >=", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceLessThan(String value) {
            addCriterion("LEAVE_PLACE <", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_PLACE <=", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceLike(String value) {
            addCriterion("LEAVE_PLACE like", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceNotLike(String value) {
            addCriterion("LEAVE_PLACE not like", value, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceIn(List<String> values) {
            addCriterion("LEAVE_PLACE in", values, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceNotIn(List<String> values) {
            addCriterion("LEAVE_PLACE not in", values, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceBetween(String value1, String value2) {
            addCriterion("LEAVE_PLACE between", value1, value2, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andLeavePlaceNotBetween(String value1, String value2) {
            addCriterion("LEAVE_PLACE not between", value1, value2, "leavePlace");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMIsNull() {
            addCriterion("TRAVEL_LEADER_M is null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMIsNotNull() {
            addCriterion("TRAVEL_LEADER_M is not null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_M =", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMNotEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_M <>", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMGreaterThan(String value) {
            addCriterion("TRAVEL_LEADER_M >", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_M >=", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMLessThan(String value) {
            addCriterion("TRAVEL_LEADER_M <", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_M <=", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMLike(String value) {
            addCriterion("TRAVEL_LEADER_M like", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMNotLike(String value) {
            addCriterion("TRAVEL_LEADER_M not like", value, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_M in", values, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMNotIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_M not in", values, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_M between", value1, value2, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderMNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_M not between", value1, value2, "travelLeaderM");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSIsNull() {
            addCriterion("TRAVEL_LEADER_S is null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSIsNotNull() {
            addCriterion("TRAVEL_LEADER_S is not null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_S =", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSNotEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_S <>", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSGreaterThan(String value) {
            addCriterion("TRAVEL_LEADER_S >", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_S >=", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSLessThan(String value) {
            addCriterion("TRAVEL_LEADER_S <", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_S <=", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSLike(String value) {
            addCriterion("TRAVEL_LEADER_S like", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSNotLike(String value) {
            addCriterion("TRAVEL_LEADER_S not like", value, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_S in", values, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSNotIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_S not in", values, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_S between", value1, value2, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderSNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_S not between", value1, value2, "travelLeaderS");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTIsNull() {
            addCriterion("TRAVEL_LEADER_T is null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTIsNotNull() {
            addCriterion("TRAVEL_LEADER_T is not null");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_T =", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTNotEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_T <>", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTGreaterThan(String value) {
            addCriterion("TRAVEL_LEADER_T >", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_T >=", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTLessThan(String value) {
            addCriterion("TRAVEL_LEADER_T <", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_LEADER_T <=", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTLike(String value) {
            addCriterion("TRAVEL_LEADER_T like", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTNotLike(String value) {
            addCriterion("TRAVEL_LEADER_T not like", value, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_T in", values, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTNotIn(List<String> values) {
            addCriterion("TRAVEL_LEADER_T not in", values, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_T between", value1, value2, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelLeaderTNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_LEADER_T not between", value1, value2, "travelLeaderT");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNull() {
            addCriterion("TRAVEL_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIsNotNull() {
            addCriterion("TRAVEL_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTravelStatusEqualTo(String value) {
            addCriterion("TRAVEL_STATUS =", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotEqualTo(String value) {
            addCriterion("TRAVEL_STATUS <>", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThan(String value) {
            addCriterion("TRAVEL_STATUS >", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_STATUS >=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThan(String value) {
            addCriterion("TRAVEL_STATUS <", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_STATUS <=", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusLike(String value) {
            addCriterion("TRAVEL_STATUS like", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotLike(String value) {
            addCriterion("TRAVEL_STATUS not like", value, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusIn(List<String> values) {
            addCriterion("TRAVEL_STATUS in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotIn(List<String> values) {
            addCriterion("TRAVEL_STATUS not in", values, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusBetween(String value1, String value2) {
            addCriterion("TRAVEL_STATUS between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andTravelStatusNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_STATUS not between", value1, value2, "travelStatus");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNull() {
            addCriterion("LIKE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLikeCountIsNotNull() {
            addCriterion("LIKE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLikeCountEqualTo(Integer value) {
            addCriterion("LIKE_COUNT =", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotEqualTo(Integer value) {
            addCriterion("LIKE_COUNT <>", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThan(Integer value) {
            addCriterion("LIKE_COUNT >", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIKE_COUNT >=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThan(Integer value) {
            addCriterion("LIKE_COUNT <", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("LIKE_COUNT <=", value, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountIn(List<Integer> values) {
            addCriterion("LIKE_COUNT in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotIn(List<Integer> values) {
            addCriterion("LIKE_COUNT not in", values, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_COUNT between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LIKE_COUNT not between", value1, value2, "likeCount");
            return (Criteria) this;
        }

        public Criteria andTravelExplainIsNull() {
            addCriterion("TRAVEL_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andTravelExplainIsNotNull() {
            addCriterion("TRAVEL_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andTravelExplainEqualTo(String value) {
            addCriterion("TRAVEL_EXPLAIN =", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainNotEqualTo(String value) {
            addCriterion("TRAVEL_EXPLAIN <>", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainGreaterThan(String value) {
            addCriterion("TRAVEL_EXPLAIN >", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_EXPLAIN >=", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainLessThan(String value) {
            addCriterion("TRAVEL_EXPLAIN <", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_EXPLAIN <=", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainLike(String value) {
            addCriterion("TRAVEL_EXPLAIN like", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainNotLike(String value) {
            addCriterion("TRAVEL_EXPLAIN not like", value, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainIn(List<String> values) {
            addCriterion("TRAVEL_EXPLAIN in", values, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainNotIn(List<String> values) {
            addCriterion("TRAVEL_EXPLAIN not in", values, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainBetween(String value1, String value2) {
            addCriterion("TRAVEL_EXPLAIN between", value1, value2, "travelExplain");
            return (Criteria) this;
        }

        public Criteria andTravelExplainNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_EXPLAIN not between", value1, value2, "travelExplain");
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

        public Criteria andTravelInfoIsNull() {
            addCriterion("TRAVEL_INFO is null");
            return (Criteria) this;
        }

        public Criteria andTravelInfoIsNotNull() {
            addCriterion("TRAVEL_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andTravelInfoEqualTo(String value) {
            addCriterion("TRAVEL_INFO =", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoNotEqualTo(String value) {
            addCriterion("TRAVEL_INFO <>", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoGreaterThan(String value) {
            addCriterion("TRAVEL_INFO >", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoGreaterThanOrEqualTo(String value) {
            addCriterion("TRAVEL_INFO >=", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoLessThan(String value) {
            addCriterion("TRAVEL_INFO <", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoLessThanOrEqualTo(String value) {
            addCriterion("TRAVEL_INFO <=", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoLike(String value) {
            addCriterion("TRAVEL_INFO like", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoNotLike(String value) {
            addCriterion("TRAVEL_INFO not like", value, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoIn(List<String> values) {
            addCriterion("TRAVEL_INFO in", values, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoNotIn(List<String> values) {
            addCriterion("TRAVEL_INFO not in", values, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoBetween(String value1, String value2) {
            addCriterion("TRAVEL_INFO between", value1, value2, "travelInfo");
            return (Criteria) this;
        }

        public Criteria andTravelInfoNotBetween(String value1, String value2) {
            addCriterion("TRAVEL_INFO not between", value1, value2, "travelInfo");
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