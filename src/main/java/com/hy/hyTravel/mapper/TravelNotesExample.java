package com.hy.hyTravel.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class TravelNotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TravelNotesExample() {
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

        public Criteria andNoteIdIsNull() {
            addCriterion("NOTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("NOTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(String value) {
            addCriterion("NOTE_ID =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(String value) {
            addCriterion("NOTE_ID <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(String value) {
            addCriterion("NOTE_ID >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_ID >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(String value) {
            addCriterion("NOTE_ID <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(String value) {
            addCriterion("NOTE_ID <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLike(String value) {
            addCriterion("NOTE_ID like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotLike(String value) {
            addCriterion("NOTE_ID not like", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<String> values) {
            addCriterion("NOTE_ID in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<String> values) {
            addCriterion("NOTE_ID not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(String value1, String value2) {
            addCriterion("NOTE_ID between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(String value1, String value2) {
            addCriterion("NOTE_ID not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteTextIsNull() {
            addCriterion("NOTE_TEXT is null");
            return (Criteria) this;
        }

        public Criteria andNoteTextIsNotNull() {
            addCriterion("NOTE_TEXT is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTextEqualTo(String value) {
            addCriterion("NOTE_TEXT =", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotEqualTo(String value) {
            addCriterion("NOTE_TEXT <>", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextGreaterThan(String value) {
            addCriterion("NOTE_TEXT >", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_TEXT >=", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLessThan(String value) {
            addCriterion("NOTE_TEXT <", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLessThanOrEqualTo(String value) {
            addCriterion("NOTE_TEXT <=", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextLike(String value) {
            addCriterion("NOTE_TEXT like", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotLike(String value) {
            addCriterion("NOTE_TEXT not like", value, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextIn(List<String> values) {
            addCriterion("NOTE_TEXT in", values, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotIn(List<String> values) {
            addCriterion("NOTE_TEXT not in", values, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextBetween(String value1, String value2) {
            addCriterion("NOTE_TEXT between", value1, value2, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteTextNotBetween(String value1, String value2) {
            addCriterion("NOTE_TEXT not between", value1, value2, "noteText");
            return (Criteria) this;
        }

        public Criteria andNoteImgIsNull() {
            addCriterion("NOTE_IMG is null");
            return (Criteria) this;
        }

        public Criteria andNoteImgIsNotNull() {
            addCriterion("NOTE_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andNoteImgEqualTo(String value) {
            addCriterion("NOTE_IMG =", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgNotEqualTo(String value) {
            addCriterion("NOTE_IMG <>", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgGreaterThan(String value) {
            addCriterion("NOTE_IMG >", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE_IMG >=", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgLessThan(String value) {
            addCriterion("NOTE_IMG <", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgLessThanOrEqualTo(String value) {
            addCriterion("NOTE_IMG <=", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgLike(String value) {
            addCriterion("NOTE_IMG like", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgNotLike(String value) {
            addCriterion("NOTE_IMG not like", value, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgIn(List<String> values) {
            addCriterion("NOTE_IMG in", values, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgNotIn(List<String> values) {
            addCriterion("NOTE_IMG not in", values, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgBetween(String value1, String value2) {
            addCriterion("NOTE_IMG between", value1, value2, "noteImg");
            return (Criteria) this;
        }

        public Criteria andNoteImgNotBetween(String value1, String value2) {
            addCriterion("NOTE_IMG not between", value1, value2, "noteImg");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusIsNull() {
            addCriterion("VISIBLE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusIsNotNull() {
            addCriterion("VISIBLE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusEqualTo(String value) {
            addCriterion("VISIBLE_STATUS =", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusNotEqualTo(String value) {
            addCriterion("VISIBLE_STATUS <>", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusGreaterThan(String value) {
            addCriterion("VISIBLE_STATUS >", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("VISIBLE_STATUS >=", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusLessThan(String value) {
            addCriterion("VISIBLE_STATUS <", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusLessThanOrEqualTo(String value) {
            addCriterion("VISIBLE_STATUS <=", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusLike(String value) {
            addCriterion("VISIBLE_STATUS like", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusNotLike(String value) {
            addCriterion("VISIBLE_STATUS not like", value, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusIn(List<String> values) {
            addCriterion("VISIBLE_STATUS in", values, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusNotIn(List<String> values) {
            addCriterion("VISIBLE_STATUS not in", values, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusBetween(String value1, String value2) {
            addCriterion("VISIBLE_STATUS between", value1, value2, "visibleStatus");
            return (Criteria) this;
        }

        public Criteria andVisibleStatusNotBetween(String value1, String value2) {
            addCriterion("VISIBLE_STATUS not between", value1, value2, "visibleStatus");
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