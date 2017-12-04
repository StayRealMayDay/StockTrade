package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZSwarningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZSwarningExample() {
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

        public Criteria andStockCodeIsNull() {
            addCriterion("stock_code is null");
            return (Criteria) this;
        }

        public Criteria andStockCodeIsNotNull() {
            addCriterion("stock_code is not null");
            return (Criteria) this;
        }

        public Criteria andStockCodeEqualTo(String value) {
            addCriterion("stock_code =", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotEqualTo(String value) {
            addCriterion("stock_code <>", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThan(String value) {
            addCriterion("stock_code >", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_code >=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThan(String value) {
            addCriterion("stock_code <", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLessThanOrEqualTo(String value) {
            addCriterion("stock_code <=", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeLike(String value) {
            addCriterion("stock_code like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotLike(String value) {
            addCriterion("stock_code not like", value, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeIn(List<String> values) {
            addCriterion("stock_code in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotIn(List<String> values) {
            addCriterion("stock_code not in", values, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeBetween(String value1, String value2) {
            addCriterion("stock_code between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockCodeNotBetween(String value1, String value2) {
            addCriterion("stock_code not between", value1, value2, "stockCode");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andZValueIsNull() {
            addCriterion("z_value is null");
            return (Criteria) this;
        }

        public Criteria andZValueIsNotNull() {
            addCriterion("z_value is not null");
            return (Criteria) this;
        }

        public Criteria andZValueEqualTo(String value) {
            addCriterion("z_value =", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueNotEqualTo(String value) {
            addCriterion("z_value <>", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueGreaterThan(String value) {
            addCriterion("z_value >", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueGreaterThanOrEqualTo(String value) {
            addCriterion("z_value >=", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueLessThan(String value) {
            addCriterion("z_value <", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueLessThanOrEqualTo(String value) {
            addCriterion("z_value <=", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueLike(String value) {
            addCriterion("z_value like", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueNotLike(String value) {
            addCriterion("z_value not like", value, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueIn(List<String> values) {
            addCriterion("z_value in", values, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueNotIn(List<String> values) {
            addCriterion("z_value not in", values, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueBetween(String value1, String value2) {
            addCriterion("z_value between", value1, value2, "zValue");
            return (Criteria) this;
        }

        public Criteria andZValueNotBetween(String value1, String value2) {
            addCriterion("z_value not between", value1, value2, "zValue");
            return (Criteria) this;
        }

        public Criteria andX1IsNull() {
            addCriterion("x1 is null");
            return (Criteria) this;
        }

        public Criteria andX1IsNotNull() {
            addCriterion("x1 is not null");
            return (Criteria) this;
        }

        public Criteria andX1EqualTo(String value) {
            addCriterion("x1 =", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotEqualTo(String value) {
            addCriterion("x1 <>", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThan(String value) {
            addCriterion("x1 >", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1GreaterThanOrEqualTo(String value) {
            addCriterion("x1 >=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThan(String value) {
            addCriterion("x1 <", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1LessThanOrEqualTo(String value) {
            addCriterion("x1 <=", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1Like(String value) {
            addCriterion("x1 like", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotLike(String value) {
            addCriterion("x1 not like", value, "x1");
            return (Criteria) this;
        }

        public Criteria andX1In(List<String> values) {
            addCriterion("x1 in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotIn(List<String> values) {
            addCriterion("x1 not in", values, "x1");
            return (Criteria) this;
        }

        public Criteria andX1Between(String value1, String value2) {
            addCriterion("x1 between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX1NotBetween(String value1, String value2) {
            addCriterion("x1 not between", value1, value2, "x1");
            return (Criteria) this;
        }

        public Criteria andX2IsNull() {
            addCriterion("x2 is null");
            return (Criteria) this;
        }

        public Criteria andX2IsNotNull() {
            addCriterion("x2 is not null");
            return (Criteria) this;
        }

        public Criteria andX2EqualTo(String value) {
            addCriterion("x2 =", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotEqualTo(String value) {
            addCriterion("x2 <>", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThan(String value) {
            addCriterion("x2 >", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2GreaterThanOrEqualTo(String value) {
            addCriterion("x2 >=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThan(String value) {
            addCriterion("x2 <", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2LessThanOrEqualTo(String value) {
            addCriterion("x2 <=", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2Like(String value) {
            addCriterion("x2 like", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotLike(String value) {
            addCriterion("x2 not like", value, "x2");
            return (Criteria) this;
        }

        public Criteria andX2In(List<String> values) {
            addCriterion("x2 in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotIn(List<String> values) {
            addCriterion("x2 not in", values, "x2");
            return (Criteria) this;
        }

        public Criteria andX2Between(String value1, String value2) {
            addCriterion("x2 between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX2NotBetween(String value1, String value2) {
            addCriterion("x2 not between", value1, value2, "x2");
            return (Criteria) this;
        }

        public Criteria andX3IsNull() {
            addCriterion("x3 is null");
            return (Criteria) this;
        }

        public Criteria andX3IsNotNull() {
            addCriterion("x3 is not null");
            return (Criteria) this;
        }

        public Criteria andX3EqualTo(String value) {
            addCriterion("x3 =", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotEqualTo(String value) {
            addCriterion("x3 <>", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThan(String value) {
            addCriterion("x3 >", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3GreaterThanOrEqualTo(String value) {
            addCriterion("x3 >=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThan(String value) {
            addCriterion("x3 <", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3LessThanOrEqualTo(String value) {
            addCriterion("x3 <=", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3Like(String value) {
            addCriterion("x3 like", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotLike(String value) {
            addCriterion("x3 not like", value, "x3");
            return (Criteria) this;
        }

        public Criteria andX3In(List<String> values) {
            addCriterion("x3 in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotIn(List<String> values) {
            addCriterion("x3 not in", values, "x3");
            return (Criteria) this;
        }

        public Criteria andX3Between(String value1, String value2) {
            addCriterion("x3 between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX3NotBetween(String value1, String value2) {
            addCriterion("x3 not between", value1, value2, "x3");
            return (Criteria) this;
        }

        public Criteria andX4IsNull() {
            addCriterion("x4 is null");
            return (Criteria) this;
        }

        public Criteria andX4IsNotNull() {
            addCriterion("x4 is not null");
            return (Criteria) this;
        }

        public Criteria andX4EqualTo(String value) {
            addCriterion("x4 =", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotEqualTo(String value) {
            addCriterion("x4 <>", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThan(String value) {
            addCriterion("x4 >", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4GreaterThanOrEqualTo(String value) {
            addCriterion("x4 >=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThan(String value) {
            addCriterion("x4 <", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4LessThanOrEqualTo(String value) {
            addCriterion("x4 <=", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4Like(String value) {
            addCriterion("x4 like", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotLike(String value) {
            addCriterion("x4 not like", value, "x4");
            return (Criteria) this;
        }

        public Criteria andX4In(List<String> values) {
            addCriterion("x4 in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotIn(List<String> values) {
            addCriterion("x4 not in", values, "x4");
            return (Criteria) this;
        }

        public Criteria andX4Between(String value1, String value2) {
            addCriterion("x4 between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX4NotBetween(String value1, String value2) {
            addCriterion("x4 not between", value1, value2, "x4");
            return (Criteria) this;
        }

        public Criteria andX5IsNull() {
            addCriterion("x5 is null");
            return (Criteria) this;
        }

        public Criteria andX5IsNotNull() {
            addCriterion("x5 is not null");
            return (Criteria) this;
        }

        public Criteria andX5EqualTo(String value) {
            addCriterion("x5 =", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotEqualTo(String value) {
            addCriterion("x5 <>", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThan(String value) {
            addCriterion("x5 >", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5GreaterThanOrEqualTo(String value) {
            addCriterion("x5 >=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThan(String value) {
            addCriterion("x5 <", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5LessThanOrEqualTo(String value) {
            addCriterion("x5 <=", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5Like(String value) {
            addCriterion("x5 like", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotLike(String value) {
            addCriterion("x5 not like", value, "x5");
            return (Criteria) this;
        }

        public Criteria andX5In(List<String> values) {
            addCriterion("x5 in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotIn(List<String> values) {
            addCriterion("x5 not in", values, "x5");
            return (Criteria) this;
        }

        public Criteria andX5Between(String value1, String value2) {
            addCriterion("x5 between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andX5NotBetween(String value1, String value2) {
            addCriterion("x5 not between", value1, value2, "x5");
            return (Criteria) this;
        }

        public Criteria andZDescribeIsNull() {
            addCriterion("z_describe is null");
            return (Criteria) this;
        }

        public Criteria andZDescribeIsNotNull() {
            addCriterion("z_describe is not null");
            return (Criteria) this;
        }

        public Criteria andZDescribeEqualTo(String value) {
            addCriterion("z_describe =", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeNotEqualTo(String value) {
            addCriterion("z_describe <>", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeGreaterThan(String value) {
            addCriterion("z_describe >", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("z_describe >=", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeLessThan(String value) {
            addCriterion("z_describe <", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeLessThanOrEqualTo(String value) {
            addCriterion("z_describe <=", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeLike(String value) {
            addCriterion("z_describe like", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeNotLike(String value) {
            addCriterion("z_describe not like", value, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeIn(List<String> values) {
            addCriterion("z_describe in", values, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeNotIn(List<String> values) {
            addCriterion("z_describe not in", values, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeBetween(String value1, String value2) {
            addCriterion("z_describe between", value1, value2, "zDescribe");
            return (Criteria) this;
        }

        public Criteria andZDescribeNotBetween(String value1, String value2) {
            addCriterion("z_describe not between", value1, value2, "zDescribe");
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