package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockholderBasicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockholderBasicExample() {
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

        public Criteria andStockholderIdIsNull() {
            addCriterion("stockholder_id is null");
            return (Criteria) this;
        }

        public Criteria andStockholderIdIsNotNull() {
            addCriterion("stockholder_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderIdEqualTo(String value) {
            addCriterion("stockholder_id =", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdNotEqualTo(String value) {
            addCriterion("stockholder_id <>", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdGreaterThan(String value) {
            addCriterion("stockholder_id >", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_id >=", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdLessThan(String value) {
            addCriterion("stockholder_id <", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdLessThanOrEqualTo(String value) {
            addCriterion("stockholder_id <=", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdLike(String value) {
            addCriterion("stockholder_id like", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdNotLike(String value) {
            addCriterion("stockholder_id not like", value, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdIn(List<String> values) {
            addCriterion("stockholder_id in", values, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdNotIn(List<String> values) {
            addCriterion("stockholder_id not in", values, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdBetween(String value1, String value2) {
            addCriterion("stockholder_id between", value1, value2, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockholderIdNotBetween(String value1, String value2) {
            addCriterion("stockholder_id not between", value1, value2, "stockholderId");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(String value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(String value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(String value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(String value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(String value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(String value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLike(String value) {
            addCriterion("stock like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotLike(String value) {
            addCriterion("stock not like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<String> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<String> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(String value1, String value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(String value1, String value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeIsNull() {
            addCriterion("stockholder_code is null");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeIsNotNull() {
            addCriterion("stockholder_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeEqualTo(String value) {
            addCriterion("stockholder_code =", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeNotEqualTo(String value) {
            addCriterion("stockholder_code <>", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeGreaterThan(String value) {
            addCriterion("stockholder_code >", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_code >=", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeLessThan(String value) {
            addCriterion("stockholder_code <", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeLessThanOrEqualTo(String value) {
            addCriterion("stockholder_code <=", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeLike(String value) {
            addCriterion("stockholder_code like", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeNotLike(String value) {
            addCriterion("stockholder_code not like", value, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeIn(List<String> values) {
            addCriterion("stockholder_code in", values, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeNotIn(List<String> values) {
            addCriterion("stockholder_code not in", values, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeBetween(String value1, String value2) {
            addCriterion("stockholder_code between", value1, value2, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderCodeNotBetween(String value1, String value2) {
            addCriterion("stockholder_code not between", value1, value2, "stockholderCode");
            return (Criteria) this;
        }

        public Criteria andStockholderNameIsNull() {
            addCriterion("stockholder_name is null");
            return (Criteria) this;
        }

        public Criteria andStockholderNameIsNotNull() {
            addCriterion("stockholder_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderNameEqualTo(String value) {
            addCriterion("stockholder_name =", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameNotEqualTo(String value) {
            addCriterion("stockholder_name <>", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameGreaterThan(String value) {
            addCriterion("stockholder_name >", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_name >=", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameLessThan(String value) {
            addCriterion("stockholder_name <", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameLessThanOrEqualTo(String value) {
            addCriterion("stockholder_name <=", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameLike(String value) {
            addCriterion("stockholder_name like", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameNotLike(String value) {
            addCriterion("stockholder_name not like", value, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameIn(List<String> values) {
            addCriterion("stockholder_name in", values, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameNotIn(List<String> values) {
            addCriterion("stockholder_name not in", values, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameBetween(String value1, String value2) {
            addCriterion("stockholder_name between", value1, value2, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andStockholderNameNotBetween(String value1, String value2) {
            addCriterion("stockholder_name not between", value1, value2, "stockholderName");
            return (Criteria) this;
        }

        public Criteria andShareholdNumIsNull() {
            addCriterion("sharehold_num is null");
            return (Criteria) this;
        }

        public Criteria andShareholdNumIsNotNull() {
            addCriterion("sharehold_num is not null");
            return (Criteria) this;
        }

        public Criteria andShareholdNumEqualTo(String value) {
            addCriterion("sharehold_num =", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumNotEqualTo(String value) {
            addCriterion("sharehold_num <>", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumGreaterThan(String value) {
            addCriterion("sharehold_num >", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumGreaterThanOrEqualTo(String value) {
            addCriterion("sharehold_num >=", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumLessThan(String value) {
            addCriterion("sharehold_num <", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumLessThanOrEqualTo(String value) {
            addCriterion("sharehold_num <=", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumLike(String value) {
            addCriterion("sharehold_num like", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumNotLike(String value) {
            addCriterion("sharehold_num not like", value, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumIn(List<String> values) {
            addCriterion("sharehold_num in", values, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumNotIn(List<String> values) {
            addCriterion("sharehold_num not in", values, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumBetween(String value1, String value2) {
            addCriterion("sharehold_num between", value1, value2, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdNumNotBetween(String value1, String value2) {
            addCriterion("sharehold_num not between", value1, value2, "shareholdNum");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioIsNull() {
            addCriterion("sharehold_ratio is null");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioIsNotNull() {
            addCriterion("sharehold_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioEqualTo(String value) {
            addCriterion("sharehold_ratio =", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioNotEqualTo(String value) {
            addCriterion("sharehold_ratio <>", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioGreaterThan(String value) {
            addCriterion("sharehold_ratio >", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioGreaterThanOrEqualTo(String value) {
            addCriterion("sharehold_ratio >=", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioLessThan(String value) {
            addCriterion("sharehold_ratio <", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioLessThanOrEqualTo(String value) {
            addCriterion("sharehold_ratio <=", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioLike(String value) {
            addCriterion("sharehold_ratio like", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioNotLike(String value) {
            addCriterion("sharehold_ratio not like", value, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioIn(List<String> values) {
            addCriterion("sharehold_ratio in", values, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioNotIn(List<String> values) {
            addCriterion("sharehold_ratio not in", values, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioBetween(String value1, String value2) {
            addCriterion("sharehold_ratio between", value1, value2, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andShareholdRatioNotBetween(String value1, String value2) {
            addCriterion("sharehold_ratio not between", value1, value2, "shareholdRatio");
            return (Criteria) this;
        }

        public Criteria andEquityNatureIsNull() {
            addCriterion("equity_nature is null");
            return (Criteria) this;
        }

        public Criteria andEquityNatureIsNotNull() {
            addCriterion("equity_nature is not null");
            return (Criteria) this;
        }

        public Criteria andEquityNatureEqualTo(String value) {
            addCriterion("equity_nature =", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureNotEqualTo(String value) {
            addCriterion("equity_nature <>", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureGreaterThan(String value) {
            addCriterion("equity_nature >", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureGreaterThanOrEqualTo(String value) {
            addCriterion("equity_nature >=", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureLessThan(String value) {
            addCriterion("equity_nature <", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureLessThanOrEqualTo(String value) {
            addCriterion("equity_nature <=", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureLike(String value) {
            addCriterion("equity_nature like", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureNotLike(String value) {
            addCriterion("equity_nature not like", value, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureIn(List<String> values) {
            addCriterion("equity_nature in", values, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureNotIn(List<String> values) {
            addCriterion("equity_nature not in", values, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureBetween(String value1, String value2) {
            addCriterion("equity_nature between", value1, value2, "equityNature");
            return (Criteria) this;
        }

        public Criteria andEquityNatureNotBetween(String value1, String value2) {
            addCriterion("equity_nature not between", value1, value2, "equityNature");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
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