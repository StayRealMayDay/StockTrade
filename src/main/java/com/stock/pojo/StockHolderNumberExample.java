package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockHolderNumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockHolderNumberExample() {
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

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andHolderNumberIsNull() {
            addCriterion("holder_number is null");
            return (Criteria) this;
        }

        public Criteria andHolderNumberIsNotNull() {
            addCriterion("holder_number is not null");
            return (Criteria) this;
        }

        public Criteria andHolderNumberEqualTo(String value) {
            addCriterion("holder_number =", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberNotEqualTo(String value) {
            addCriterion("holder_number <>", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberGreaterThan(String value) {
            addCriterion("holder_number >", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("holder_number >=", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberLessThan(String value) {
            addCriterion("holder_number <", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberLessThanOrEqualTo(String value) {
            addCriterion("holder_number <=", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberLike(String value) {
            addCriterion("holder_number like", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberNotLike(String value) {
            addCriterion("holder_number not like", value, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberIn(List<String> values) {
            addCriterion("holder_number in", values, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberNotIn(List<String> values) {
            addCriterion("holder_number not in", values, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberBetween(String value1, String value2) {
            addCriterion("holder_number between", value1, value2, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNumberNotBetween(String value1, String value2) {
            addCriterion("holder_number not between", value1, value2, "holderNumber");
            return (Criteria) this;
        }

        public Criteria andChangeComeIsNull() {
            addCriterion("change_come is null");
            return (Criteria) this;
        }

        public Criteria andChangeComeIsNotNull() {
            addCriterion("change_come is not null");
            return (Criteria) this;
        }

        public Criteria andChangeComeEqualTo(String value) {
            addCriterion("change_come =", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeNotEqualTo(String value) {
            addCriterion("change_come <>", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeGreaterThan(String value) {
            addCriterion("change_come >", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeGreaterThanOrEqualTo(String value) {
            addCriterion("change_come >=", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeLessThan(String value) {
            addCriterion("change_come <", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeLessThanOrEqualTo(String value) {
            addCriterion("change_come <=", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeLike(String value) {
            addCriterion("change_come like", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeNotLike(String value) {
            addCriterion("change_come not like", value, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeIn(List<String> values) {
            addCriterion("change_come in", values, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeNotIn(List<String> values) {
            addCriterion("change_come not in", values, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeBetween(String value1, String value2) {
            addCriterion("change_come between", value1, value2, "changeCome");
            return (Criteria) this;
        }

        public Criteria andChangeComeNotBetween(String value1, String value2) {
            addCriterion("change_come not between", value1, value2, "changeCome");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateIsNull() {
            addCriterion("avg_circulate is null");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateIsNotNull() {
            addCriterion("avg_circulate is not null");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateEqualTo(String value) {
            addCriterion("avg_circulate =", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateNotEqualTo(String value) {
            addCriterion("avg_circulate <>", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateGreaterThan(String value) {
            addCriterion("avg_circulate >", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateGreaterThanOrEqualTo(String value) {
            addCriterion("avg_circulate >=", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateLessThan(String value) {
            addCriterion("avg_circulate <", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateLessThanOrEqualTo(String value) {
            addCriterion("avg_circulate <=", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateLike(String value) {
            addCriterion("avg_circulate like", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateNotLike(String value) {
            addCriterion("avg_circulate not like", value, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateIn(List<String> values) {
            addCriterion("avg_circulate in", values, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateNotIn(List<String> values) {
            addCriterion("avg_circulate not in", values, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateBetween(String value1, String value2) {
            addCriterion("avg_circulate between", value1, value2, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateNotBetween(String value1, String value2) {
            addCriterion("avg_circulate not between", value1, value2, "avgCirculate");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeIsNull() {
            addCriterion("avg_circulate_change is null");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeIsNotNull() {
            addCriterion("avg_circulate_change is not null");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeEqualTo(String value) {
            addCriterion("avg_circulate_change =", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeNotEqualTo(String value) {
            addCriterion("avg_circulate_change <>", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeGreaterThan(String value) {
            addCriterion("avg_circulate_change >", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeGreaterThanOrEqualTo(String value) {
            addCriterion("avg_circulate_change >=", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeLessThan(String value) {
            addCriterion("avg_circulate_change <", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeLessThanOrEqualTo(String value) {
            addCriterion("avg_circulate_change <=", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeLike(String value) {
            addCriterion("avg_circulate_change like", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeNotLike(String value) {
            addCriterion("avg_circulate_change not like", value, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeIn(List<String> values) {
            addCriterion("avg_circulate_change in", values, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeNotIn(List<String> values) {
            addCriterion("avg_circulate_change not in", values, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeBetween(String value1, String value2) {
            addCriterion("avg_circulate_change between", value1, value2, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andAvgCirculateChangeNotBetween(String value1, String value2) {
            addCriterion("avg_circulate_change not between", value1, value2, "avgCirculateChange");
            return (Criteria) this;
        }

        public Criteria andInstAvgIsNull() {
            addCriterion("inst_avg is null");
            return (Criteria) this;
        }

        public Criteria andInstAvgIsNotNull() {
            addCriterion("inst_avg is not null");
            return (Criteria) this;
        }

        public Criteria andInstAvgEqualTo(String value) {
            addCriterion("inst_avg =", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgNotEqualTo(String value) {
            addCriterion("inst_avg <>", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgGreaterThan(String value) {
            addCriterion("inst_avg >", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgGreaterThanOrEqualTo(String value) {
            addCriterion("inst_avg >=", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgLessThan(String value) {
            addCriterion("inst_avg <", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgLessThanOrEqualTo(String value) {
            addCriterion("inst_avg <=", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgLike(String value) {
            addCriterion("inst_avg like", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgNotLike(String value) {
            addCriterion("inst_avg not like", value, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgIn(List<String> values) {
            addCriterion("inst_avg in", values, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgNotIn(List<String> values) {
            addCriterion("inst_avg not in", values, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgBetween(String value1, String value2) {
            addCriterion("inst_avg between", value1, value2, "instAvg");
            return (Criteria) this;
        }

        public Criteria andInstAvgNotBetween(String value1, String value2) {
            addCriterion("inst_avg not between", value1, value2, "instAvg");
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