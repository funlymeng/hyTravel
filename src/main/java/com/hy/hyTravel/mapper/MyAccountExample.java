package com.hy.hyTravel.mapper;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class MyAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyAccountExample() {
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

        public Criteria andAccountMoneyIsNull() {
            addCriterion("ACCOUNT_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIsNotNull() {
            addCriterion("ACCOUNT_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY =", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY <>", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY >", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY >=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThan(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY <", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNT_MONEY <=", value, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_MONEY in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNT_MONEY not in", values, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_MONEY between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andAccountMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNT_MONEY not between", value1, value2, "accountMoney");
            return (Criteria) this;
        }

        public Criteria andUntitledIsNull() {
            addCriterion("untitled is null");
            return (Criteria) this;
        }

        public Criteria andUntitledIsNotNull() {
            addCriterion("untitled is not null");
            return (Criteria) this;
        }

        public Criteria andUntitledEqualTo(String value) {
            addCriterion("untitled =", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotEqualTo(String value) {
            addCriterion("untitled <>", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledGreaterThan(String value) {
            addCriterion("untitled >", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledGreaterThanOrEqualTo(String value) {
            addCriterion("untitled >=", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLessThan(String value) {
            addCriterion("untitled <", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLessThanOrEqualTo(String value) {
            addCriterion("untitled <=", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledLike(String value) {
            addCriterion("untitled like", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotLike(String value) {
            addCriterion("untitled not like", value, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledIn(List<String> values) {
            addCriterion("untitled in", values, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotIn(List<String> values) {
            addCriterion("untitled not in", values, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledBetween(String value1, String value2) {
            addCriterion("untitled between", value1, value2, "untitled");
            return (Criteria) this;
        }

        public Criteria andUntitledNotBetween(String value1, String value2) {
            addCriterion("untitled not between", value1, value2, "untitled");
            return (Criteria) this;
        }

        public Criteria andPayNumberIsNull() {
            addCriterion("PAY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPayNumberIsNotNull() {
            addCriterion("PAY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumberEqualTo(String value) {
            addCriterion("PAY_NUMBER =", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotEqualTo(String value) {
            addCriterion("PAY_NUMBER <>", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberGreaterThan(String value) {
            addCriterion("PAY_NUMBER >", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_NUMBER >=", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberLessThan(String value) {
            addCriterion("PAY_NUMBER <", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberLessThanOrEqualTo(String value) {
            addCriterion("PAY_NUMBER <=", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberLike(String value) {
            addCriterion("PAY_NUMBER like", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotLike(String value) {
            addCriterion("PAY_NUMBER not like", value, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberIn(List<String> values) {
            addCriterion("PAY_NUMBER in", values, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotIn(List<String> values) {
            addCriterion("PAY_NUMBER not in", values, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberBetween(String value1, String value2) {
            addCriterion("PAY_NUMBER between", value1, value2, "payNumber");
            return (Criteria) this;
        }

        public Criteria andPayNumberNotBetween(String value1, String value2) {
            addCriterion("PAY_NUMBER not between", value1, value2, "payNumber");
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