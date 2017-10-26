package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewsTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewsTypeExample() {
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

        public Criteria andNewsTypeIdIsNull() {
            addCriterion("news_type_id is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIsNotNull() {
            addCriterion("news_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdEqualTo(String value) {
            addCriterion("news_type_id =", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotEqualTo(String value) {
            addCriterion("news_type_id <>", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThan(String value) {
            addCriterion("news_type_id >", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("news_type_id >=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThan(String value) {
            addCriterion("news_type_id <", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLessThanOrEqualTo(String value) {
            addCriterion("news_type_id <=", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdLike(String value) {
            addCriterion("news_type_id like", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotLike(String value) {
            addCriterion("news_type_id not like", value, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdIn(List<String> values) {
            addCriterion("news_type_id in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotIn(List<String> values) {
            addCriterion("news_type_id not in", values, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdBetween(String value1, String value2) {
            addCriterion("news_type_id between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewsTypeIdNotBetween(String value1, String value2) {
            addCriterion("news_type_id not between", value1, value2, "newsTypeId");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameIsNull() {
            addCriterion("new_type_name is null");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameIsNotNull() {
            addCriterion("new_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameEqualTo(String value) {
            addCriterion("new_type_name =", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameNotEqualTo(String value) {
            addCriterion("new_type_name <>", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameGreaterThan(String value) {
            addCriterion("new_type_name >", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("new_type_name >=", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameLessThan(String value) {
            addCriterion("new_type_name <", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameLessThanOrEqualTo(String value) {
            addCriterion("new_type_name <=", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameLike(String value) {
            addCriterion("new_type_name like", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameNotLike(String value) {
            addCriterion("new_type_name not like", value, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameIn(List<String> values) {
            addCriterion("new_type_name in", values, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameNotIn(List<String> values) {
            addCriterion("new_type_name not in", values, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameBetween(String value1, String value2) {
            addCriterion("new_type_name between", value1, value2, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewTypeNameNotBetween(String value1, String value2) {
            addCriterion("new_type_name not between", value1, value2, "newTypeName");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkIsNull() {
            addCriterion("news_type_remark is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkIsNotNull() {
            addCriterion("news_type_remark is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkEqualTo(String value) {
            addCriterion("news_type_remark =", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkNotEqualTo(String value) {
            addCriterion("news_type_remark <>", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkGreaterThan(String value) {
            addCriterion("news_type_remark >", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("news_type_remark >=", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkLessThan(String value) {
            addCriterion("news_type_remark <", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkLessThanOrEqualTo(String value) {
            addCriterion("news_type_remark <=", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkLike(String value) {
            addCriterion("news_type_remark like", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkNotLike(String value) {
            addCriterion("news_type_remark not like", value, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkIn(List<String> values) {
            addCriterion("news_type_remark in", values, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkNotIn(List<String> values) {
            addCriterion("news_type_remark not in", values, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkBetween(String value1, String value2) {
            addCriterion("news_type_remark between", value1, value2, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeRemarkNotBetween(String value1, String value2) {
            addCriterion("news_type_remark not between", value1, value2, "newsTypeRemark");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumIsNull() {
            addCriterion("news_type_num is null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumIsNotNull() {
            addCriterion("news_type_num is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumEqualTo(Integer value) {
            addCriterion("news_type_num =", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumNotEqualTo(Integer value) {
            addCriterion("news_type_num <>", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumGreaterThan(Integer value) {
            addCriterion("news_type_num >", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("news_type_num >=", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumLessThan(Integer value) {
            addCriterion("news_type_num <", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumLessThanOrEqualTo(Integer value) {
            addCriterion("news_type_num <=", value, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumIn(List<Integer> values) {
            addCriterion("news_type_num in", values, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumNotIn(List<Integer> values) {
            addCriterion("news_type_num not in", values, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumBetween(Integer value1, Integer value2) {
            addCriterion("news_type_num between", value1, value2, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andNewsTypeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("news_type_num not between", value1, value2, "newsTypeNum");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
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