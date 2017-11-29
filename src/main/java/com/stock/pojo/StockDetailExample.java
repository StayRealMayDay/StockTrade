package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockDetailExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(String value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(String value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(String value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(String value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(String value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLike(String value) {
            addCriterion("stock_id like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotLike(String value) {
            addCriterion("stock_id not like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<String> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<String> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(String value1, String value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(String value1, String value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIsNull() {
            addCriterion("stock_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIsNotNull() {
            addCriterion("stock_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdEqualTo(String value) {
            addCriterion("stock_detail_id =", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotEqualTo(String value) {
            addCriterion("stock_detail_id <>", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdGreaterThan(String value) {
            addCriterion("stock_detail_id >", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_detail_id >=", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLessThan(String value) {
            addCriterion("stock_detail_id <", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLessThanOrEqualTo(String value) {
            addCriterion("stock_detail_id <=", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLike(String value) {
            addCriterion("stock_detail_id like", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotLike(String value) {
            addCriterion("stock_detail_id not like", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIn(List<String> values) {
            addCriterion("stock_detail_id in", values, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotIn(List<String> values) {
            addCriterion("stock_detail_id not in", values, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdBetween(String value1, String value2) {
            addCriterion("stock_detail_id between", value1, value2, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotBetween(String value1, String value2) {
            addCriterion("stock_detail_id not between", value1, value2, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNull() {
            addCriterion("report_date is null");
            return (Criteria) this;
        }

        public Criteria andReportDateIsNotNull() {
            addCriterion("report_date is not null");
            return (Criteria) this;
        }

        public Criteria andReportDateEqualTo(String value) {
            addCriterion("report_date =", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotEqualTo(String value) {
            addCriterion("report_date <>", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThan(String value) {
            addCriterion("report_date >", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateGreaterThanOrEqualTo(String value) {
            addCriterion("report_date >=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThan(String value) {
            addCriterion("report_date <", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLessThanOrEqualTo(String value) {
            addCriterion("report_date <=", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateLike(String value) {
            addCriterion("report_date like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotLike(String value) {
            addCriterion("report_date not like", value, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateIn(List<String> values) {
            addCriterion("report_date in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotIn(List<String> values) {
            addCriterion("report_date not in", values, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateBetween(String value1, String value2) {
            addCriterion("report_date between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andReportDateNotBetween(String value1, String value2) {
            addCriterion("report_date not between", value1, value2, "reportDate");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNull() {
            addCriterion("stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(String value) {
            addCriterion("stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(String value) {
            addCriterion("stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(String value) {
            addCriterion("stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(String value) {
            addCriterion("stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(String value) {
            addCriterion("stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(String value) {
            addCriterion("stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLike(String value) {
            addCriterion("stock_num like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotLike(String value) {
            addCriterion("stock_num not like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<String> values) {
            addCriterion("stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<String> values) {
            addCriterion("stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(String value1, String value2) {
            addCriterion("stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(String value1, String value2) {
            addCriterion("stock_num not between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockRateIsNull() {
            addCriterion("stock_rate is null");
            return (Criteria) this;
        }

        public Criteria andStockRateIsNotNull() {
            addCriterion("stock_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStockRateEqualTo(String value) {
            addCriterion("stock_rate =", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotEqualTo(String value) {
            addCriterion("stock_rate <>", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateGreaterThan(String value) {
            addCriterion("stock_rate >", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateGreaterThanOrEqualTo(String value) {
            addCriterion("stock_rate >=", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateLessThan(String value) {
            addCriterion("stock_rate <", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateLessThanOrEqualTo(String value) {
            addCriterion("stock_rate <=", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateLike(String value) {
            addCriterion("stock_rate like", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotLike(String value) {
            addCriterion("stock_rate not like", value, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateIn(List<String> values) {
            addCriterion("stock_rate in", values, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotIn(List<String> values) {
            addCriterion("stock_rate not in", values, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateBetween(String value1, String value2) {
            addCriterion("stock_rate between", value1, value2, "stockRate");
            return (Criteria) this;
        }

        public Criteria andStockRateNotBetween(String value1, String value2) {
            addCriterion("stock_rate not between", value1, value2, "stockRate");
            return (Criteria) this;
        }

        public Criteria andIncreaseIsNull() {
            addCriterion("increase is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseIsNotNull() {
            addCriterion("increase is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseEqualTo(String value) {
            addCriterion("increase =", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotEqualTo(String value) {
            addCriterion("increase <>", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseGreaterThan(String value) {
            addCriterion("increase >", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseGreaterThanOrEqualTo(String value) {
            addCriterion("increase >=", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLessThan(String value) {
            addCriterion("increase <", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLessThanOrEqualTo(String value) {
            addCriterion("increase <=", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseLike(String value) {
            addCriterion("increase like", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotLike(String value) {
            addCriterion("increase not like", value, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseIn(List<String> values) {
            addCriterion("increase in", values, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotIn(List<String> values) {
            addCriterion("increase not in", values, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseBetween(String value1, String value2) {
            addCriterion("increase between", value1, value2, "increase");
            return (Criteria) this;
        }

        public Criteria andIncreaseNotBetween(String value1, String value2) {
            addCriterion("increase not between", value1, value2, "increase");
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