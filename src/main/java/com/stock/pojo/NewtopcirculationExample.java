package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewtopcirculationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewtopcirculationExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStockholdernameIsNull() {
            addCriterion("stockHolderName is null");
            return (Criteria) this;
        }

        public Criteria andStockholdernameIsNotNull() {
            addCriterion("stockHolderName is not null");
            return (Criteria) this;
        }

        public Criteria andStockholdernameEqualTo(String value) {
            addCriterion("stockHolderName =", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameNotEqualTo(String value) {
            addCriterion("stockHolderName <>", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameGreaterThan(String value) {
            addCriterion("stockHolderName >", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameGreaterThanOrEqualTo(String value) {
            addCriterion("stockHolderName >=", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameLessThan(String value) {
            addCriterion("stockHolderName <", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameLessThanOrEqualTo(String value) {
            addCriterion("stockHolderName <=", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameLike(String value) {
            addCriterion("stockHolderName like", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameNotLike(String value) {
            addCriterion("stockHolderName not like", value, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameIn(List<String> values) {
            addCriterion("stockHolderName in", values, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameNotIn(List<String> values) {
            addCriterion("stockHolderName not in", values, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameBetween(String value1, String value2) {
            addCriterion("stockHolderName between", value1, value2, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andStockholdernameNotBetween(String value1, String value2) {
            addCriterion("stockHolderName not between", value1, value2, "stockholdername");
            return (Criteria) this;
        }

        public Criteria andRatioIsNull() {
            addCriterion("ratio is null");
            return (Criteria) this;
        }

        public Criteria andRatioIsNotNull() {
            addCriterion("ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRatioEqualTo(String value) {
            addCriterion("ratio =", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotEqualTo(String value) {
            addCriterion("ratio <>", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThan(String value) {
            addCriterion("ratio >", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioGreaterThanOrEqualTo(String value) {
            addCriterion("ratio >=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThan(String value) {
            addCriterion("ratio <", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLessThanOrEqualTo(String value) {
            addCriterion("ratio <=", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioLike(String value) {
            addCriterion("ratio like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotLike(String value) {
            addCriterion("ratio not like", value, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioIn(List<String> values) {
            addCriterion("ratio in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotIn(List<String> values) {
            addCriterion("ratio not in", values, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioBetween(String value1, String value2) {
            addCriterion("ratio between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andRatioNotBetween(String value1, String value2) {
            addCriterion("ratio not between", value1, value2, "ratio");
            return (Criteria) this;
        }

        public Criteria andNowhavingIsNull() {
            addCriterion("nowHaving is null");
            return (Criteria) this;
        }

        public Criteria andNowhavingIsNotNull() {
            addCriterion("nowHaving is not null");
            return (Criteria) this;
        }

        public Criteria andNowhavingEqualTo(String value) {
            addCriterion("nowHaving =", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingNotEqualTo(String value) {
            addCriterion("nowHaving <>", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingGreaterThan(String value) {
            addCriterion("nowHaving >", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingGreaterThanOrEqualTo(String value) {
            addCriterion("nowHaving >=", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingLessThan(String value) {
            addCriterion("nowHaving <", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingLessThanOrEqualTo(String value) {
            addCriterion("nowHaving <=", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingLike(String value) {
            addCriterion("nowHaving like", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingNotLike(String value) {
            addCriterion("nowHaving not like", value, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingIn(List<String> values) {
            addCriterion("nowHaving in", values, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingNotIn(List<String> values) {
            addCriterion("nowHaving not in", values, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingBetween(String value1, String value2) {
            addCriterion("nowHaving between", value1, value2, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andNowhavingNotBetween(String value1, String value2) {
            addCriterion("nowHaving not between", value1, value2, "nowhaving");
            return (Criteria) this;
        }

        public Criteria andChangebeforeIsNull() {
            addCriterion("changeBefore is null");
            return (Criteria) this;
        }

        public Criteria andChangebeforeIsNotNull() {
            addCriterion("changeBefore is not null");
            return (Criteria) this;
        }

        public Criteria andChangebeforeEqualTo(String value) {
            addCriterion("changeBefore =", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeNotEqualTo(String value) {
            addCriterion("changeBefore <>", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeGreaterThan(String value) {
            addCriterion("changeBefore >", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeGreaterThanOrEqualTo(String value) {
            addCriterion("changeBefore >=", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeLessThan(String value) {
            addCriterion("changeBefore <", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeLessThanOrEqualTo(String value) {
            addCriterion("changeBefore <=", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeLike(String value) {
            addCriterion("changeBefore like", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeNotLike(String value) {
            addCriterion("changeBefore not like", value, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeIn(List<String> values) {
            addCriterion("changeBefore in", values, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeNotIn(List<String> values) {
            addCriterion("changeBefore not in", values, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeBetween(String value1, String value2) {
            addCriterion("changeBefore between", value1, value2, "changebefore");
            return (Criteria) this;
        }

        public Criteria andChangebeforeNotBetween(String value1, String value2) {
            addCriterion("changeBefore not between", value1, value2, "changebefore");
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

        public Criteria andJijinIdIsNull() {
            addCriterion("jiJin_id is null");
            return (Criteria) this;
        }

        public Criteria andJijinIdIsNotNull() {
            addCriterion("jiJin_id is not null");
            return (Criteria) this;
        }

        public Criteria andJijinIdEqualTo(String value) {
            addCriterion("jiJin_id =", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotEqualTo(String value) {
            addCriterion("jiJin_id <>", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdGreaterThan(String value) {
            addCriterion("jiJin_id >", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdGreaterThanOrEqualTo(String value) {
            addCriterion("jiJin_id >=", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLessThan(String value) {
            addCriterion("jiJin_id <", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLessThanOrEqualTo(String value) {
            addCriterion("jiJin_id <=", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLike(String value) {
            addCriterion("jiJin_id like", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotLike(String value) {
            addCriterion("jiJin_id not like", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdIn(List<String> values) {
            addCriterion("jiJin_id in", values, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotIn(List<String> values) {
            addCriterion("jiJin_id not in", values, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdBetween(String value1, String value2) {
            addCriterion("jiJin_id between", value1, value2, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotBetween(String value1, String value2) {
            addCriterion("jiJin_id not between", value1, value2, "jijinId");
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