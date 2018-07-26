package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockpricechangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockpricechangeExample() {
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

        public Criteria andShoupanpriceIsNull() {
            addCriterion("shouPanPrice is null");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceIsNotNull() {
            addCriterion("shouPanPrice is not null");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceEqualTo(String value) {
            addCriterion("shouPanPrice =", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceNotEqualTo(String value) {
            addCriterion("shouPanPrice <>", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceGreaterThan(String value) {
            addCriterion("shouPanPrice >", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceGreaterThanOrEqualTo(String value) {
            addCriterion("shouPanPrice >=", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceLessThan(String value) {
            addCriterion("shouPanPrice <", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceLessThanOrEqualTo(String value) {
            addCriterion("shouPanPrice <=", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceLike(String value) {
            addCriterion("shouPanPrice like", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceNotLike(String value) {
            addCriterion("shouPanPrice not like", value, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceIn(List<String> values) {
            addCriterion("shouPanPrice in", values, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceNotIn(List<String> values) {
            addCriterion("shouPanPrice not in", values, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceBetween(String value1, String value2) {
            addCriterion("shouPanPrice between", value1, value2, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andShoupanpriceNotBetween(String value1, String value2) {
            addCriterion("shouPanPrice not between", value1, value2, "shoupanprice");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumIsNull() {
            addCriterion("jiaoYiNum is null");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumIsNotNull() {
            addCriterion("jiaoYiNum is not null");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumEqualTo(String value) {
            addCriterion("jiaoYiNum =", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumNotEqualTo(String value) {
            addCriterion("jiaoYiNum <>", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumGreaterThan(String value) {
            addCriterion("jiaoYiNum >", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumGreaterThanOrEqualTo(String value) {
            addCriterion("jiaoYiNum >=", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumLessThan(String value) {
            addCriterion("jiaoYiNum <", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumLessThanOrEqualTo(String value) {
            addCriterion("jiaoYiNum <=", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumLike(String value) {
            addCriterion("jiaoYiNum like", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumNotLike(String value) {
            addCriterion("jiaoYiNum not like", value, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumIn(List<String> values) {
            addCriterion("jiaoYiNum in", values, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumNotIn(List<String> values) {
            addCriterion("jiaoYiNum not in", values, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumBetween(String value1, String value2) {
            addCriterion("jiaoYiNum between", value1, value2, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andJiaoyinumNotBetween(String value1, String value2) {
            addCriterion("jiaoYiNum not between", value1, value2, "jiaoyinum");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceIsNull() {
            addCriterion("circulationPrice is null");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceIsNotNull() {
            addCriterion("circulationPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceEqualTo(String value) {
            addCriterion("circulationPrice =", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceNotEqualTo(String value) {
            addCriterion("circulationPrice <>", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceGreaterThan(String value) {
            addCriterion("circulationPrice >", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceGreaterThanOrEqualTo(String value) {
            addCriterion("circulationPrice >=", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceLessThan(String value) {
            addCriterion("circulationPrice <", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceLessThanOrEqualTo(String value) {
            addCriterion("circulationPrice <=", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceLike(String value) {
            addCriterion("circulationPrice like", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceNotLike(String value) {
            addCriterion("circulationPrice not like", value, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceIn(List<String> values) {
            addCriterion("circulationPrice in", values, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceNotIn(List<String> values) {
            addCriterion("circulationPrice not in", values, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceBetween(String value1, String value2) {
            addCriterion("circulationPrice between", value1, value2, "circulationprice");
            return (Criteria) this;
        }

        public Criteria andCirculationpriceNotBetween(String value1, String value2) {
            addCriterion("circulationPrice not between", value1, value2, "circulationprice");
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