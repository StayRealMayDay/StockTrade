package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class MarketPerformanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketPerformanceExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNull() {
            addCriterion("industry_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNotNull() {
            addCriterion("industry_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameEqualTo(String value) {
            addCriterion("industry_name =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotEqualTo(String value) {
            addCriterion("industry_name <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThan(String value) {
            addCriterion("industry_name >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_name >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThan(String value) {
            addCriterion("industry_name <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThanOrEqualTo(String value) {
            addCriterion("industry_name <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLike(String value) {
            addCriterion("industry_name like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotLike(String value) {
            addCriterion("industry_name not like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIn(List<String> values) {
            addCriterion("industry_name in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotIn(List<String> values) {
            addCriterion("industry_name not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameBetween(String value1, String value2) {
            addCriterion("industry_name between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotBetween(String value1, String value2) {
            addCriterion("industry_name not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andOneWeekIsNull() {
            addCriterion("one_week is null");
            return (Criteria) this;
        }

        public Criteria andOneWeekIsNotNull() {
            addCriterion("one_week is not null");
            return (Criteria) this;
        }

        public Criteria andOneWeekEqualTo(String value) {
            addCriterion("one_week =", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotEqualTo(String value) {
            addCriterion("one_week <>", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekGreaterThan(String value) {
            addCriterion("one_week >", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekGreaterThanOrEqualTo(String value) {
            addCriterion("one_week >=", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekLessThan(String value) {
            addCriterion("one_week <", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekLessThanOrEqualTo(String value) {
            addCriterion("one_week <=", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekLike(String value) {
            addCriterion("one_week like", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotLike(String value) {
            addCriterion("one_week not like", value, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekIn(List<String> values) {
            addCriterion("one_week in", values, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotIn(List<String> values) {
            addCriterion("one_week not in", values, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekBetween(String value1, String value2) {
            addCriterion("one_week between", value1, value2, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneWeekNotBetween(String value1, String value2) {
            addCriterion("one_week not between", value1, value2, "oneWeek");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNull() {
            addCriterion("one_month is null");
            return (Criteria) this;
        }

        public Criteria andOneMonthIsNotNull() {
            addCriterion("one_month is not null");
            return (Criteria) this;
        }

        public Criteria andOneMonthEqualTo(String value) {
            addCriterion("one_month =", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotEqualTo(String value) {
            addCriterion("one_month <>", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThan(String value) {
            addCriterion("one_month >", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthGreaterThanOrEqualTo(String value) {
            addCriterion("one_month >=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThan(String value) {
            addCriterion("one_month <", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLessThanOrEqualTo(String value) {
            addCriterion("one_month <=", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthLike(String value) {
            addCriterion("one_month like", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotLike(String value) {
            addCriterion("one_month not like", value, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthIn(List<String> values) {
            addCriterion("one_month in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotIn(List<String> values) {
            addCriterion("one_month not in", values, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthBetween(String value1, String value2) {
            addCriterion("one_month between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andOneMonthNotBetween(String value1, String value2) {
            addCriterion("one_month not between", value1, value2, "oneMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIsNull() {
            addCriterion("three_month is null");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIsNotNull() {
            addCriterion("three_month is not null");
            return (Criteria) this;
        }

        public Criteria andThreeMonthEqualTo(String value) {
            addCriterion("three_month =", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotEqualTo(String value) {
            addCriterion("three_month <>", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthGreaterThan(String value) {
            addCriterion("three_month >", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthGreaterThanOrEqualTo(String value) {
            addCriterion("three_month >=", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthLessThan(String value) {
            addCriterion("three_month <", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthLessThanOrEqualTo(String value) {
            addCriterion("three_month <=", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthLike(String value) {
            addCriterion("three_month like", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotLike(String value) {
            addCriterion("three_month not like", value, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthIn(List<String> values) {
            addCriterion("three_month in", values, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotIn(List<String> values) {
            addCriterion("three_month not in", values, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthBetween(String value1, String value2) {
            addCriterion("three_month between", value1, value2, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andThreeMonthNotBetween(String value1, String value2) {
            addCriterion("three_month not between", value1, value2, "threeMonth");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIsNull() {
            addCriterion("current_year is null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIsNotNull() {
            addCriterion("current_year is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentYearEqualTo(String value) {
            addCriterion("current_year =", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotEqualTo(String value) {
            addCriterion("current_year <>", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearGreaterThan(String value) {
            addCriterion("current_year >", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearGreaterThanOrEqualTo(String value) {
            addCriterion("current_year >=", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLessThan(String value) {
            addCriterion("current_year <", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLessThanOrEqualTo(String value) {
            addCriterion("current_year <=", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearLike(String value) {
            addCriterion("current_year like", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotLike(String value) {
            addCriterion("current_year not like", value, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearIn(List<String> values) {
            addCriterion("current_year in", values, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotIn(List<String> values) {
            addCriterion("current_year not in", values, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearBetween(String value1, String value2) {
            addCriterion("current_year between", value1, value2, "currentYear");
            return (Criteria) this;
        }

        public Criteria andCurrentYearNotBetween(String value1, String value2) {
            addCriterion("current_year not between", value1, value2, "currentYear");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNull() {
            addCriterion("one_year is null");
            return (Criteria) this;
        }

        public Criteria andOneYearIsNotNull() {
            addCriterion("one_year is not null");
            return (Criteria) this;
        }

        public Criteria andOneYearEqualTo(String value) {
            addCriterion("one_year =", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotEqualTo(String value) {
            addCriterion("one_year <>", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThan(String value) {
            addCriterion("one_year >", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearGreaterThanOrEqualTo(String value) {
            addCriterion("one_year >=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThan(String value) {
            addCriterion("one_year <", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLessThanOrEqualTo(String value) {
            addCriterion("one_year <=", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearLike(String value) {
            addCriterion("one_year like", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotLike(String value) {
            addCriterion("one_year not like", value, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearIn(List<String> values) {
            addCriterion("one_year in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotIn(List<String> values) {
            addCriterion("one_year not in", values, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearBetween(String value1, String value2) {
            addCriterion("one_year between", value1, value2, "oneYear");
            return (Criteria) this;
        }

        public Criteria andOneYearNotBetween(String value1, String value2) {
            addCriterion("one_year not between", value1, value2, "oneYear");
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