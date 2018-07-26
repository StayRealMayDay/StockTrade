package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class GuotaianToptenliutongholderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuotaianToptenliutongholderExample() {
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

        public Criteria andStoptimeIsNull() {
            addCriterion("stopTime is null");
            return (Criteria) this;
        }

        public Criteria andStoptimeIsNotNull() {
            addCriterion("stopTime is not null");
            return (Criteria) this;
        }

        public Criteria andStoptimeEqualTo(String value) {
            addCriterion("stopTime =", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotEqualTo(String value) {
            addCriterion("stopTime <>", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeGreaterThan(String value) {
            addCriterion("stopTime >", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeGreaterThanOrEqualTo(String value) {
            addCriterion("stopTime >=", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLessThan(String value) {
            addCriterion("stopTime <", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLessThanOrEqualTo(String value) {
            addCriterion("stopTime <=", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeLike(String value) {
            addCriterion("stopTime like", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotLike(String value) {
            addCriterion("stopTime not like", value, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeIn(List<String> values) {
            addCriterion("stopTime in", values, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotIn(List<String> values) {
            addCriterion("stopTime not in", values, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeBetween(String value1, String value2) {
            addCriterion("stopTime between", value1, value2, "stoptime");
            return (Criteria) this;
        }

        public Criteria andStoptimeNotBetween(String value1, String value2) {
            addCriterion("stopTime not between", value1, value2, "stoptime");
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

        public Criteria andHavingsumIsNull() {
            addCriterion("havingSum is null");
            return (Criteria) this;
        }

        public Criteria andHavingsumIsNotNull() {
            addCriterion("havingSum is not null");
            return (Criteria) this;
        }

        public Criteria andHavingsumEqualTo(String value) {
            addCriterion("havingSum =", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumNotEqualTo(String value) {
            addCriterion("havingSum <>", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumGreaterThan(String value) {
            addCriterion("havingSum >", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumGreaterThanOrEqualTo(String value) {
            addCriterion("havingSum >=", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumLessThan(String value) {
            addCriterion("havingSum <", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumLessThanOrEqualTo(String value) {
            addCriterion("havingSum <=", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumLike(String value) {
            addCriterion("havingSum like", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumNotLike(String value) {
            addCriterion("havingSum not like", value, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumIn(List<String> values) {
            addCriterion("havingSum in", values, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumNotIn(List<String> values) {
            addCriterion("havingSum not in", values, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumBetween(String value1, String value2) {
            addCriterion("havingSum between", value1, value2, "havingsum");
            return (Criteria) this;
        }

        public Criteria andHavingsumNotBetween(String value1, String value2) {
            addCriterion("havingSum not between", value1, value2, "havingsum");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiIsNull() {
            addCriterion("guFenXingZhi is null");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiIsNotNull() {
            addCriterion("guFenXingZhi is not null");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiEqualTo(String value) {
            addCriterion("guFenXingZhi =", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiNotEqualTo(String value) {
            addCriterion("guFenXingZhi <>", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiGreaterThan(String value) {
            addCriterion("guFenXingZhi >", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiGreaterThanOrEqualTo(String value) {
            addCriterion("guFenXingZhi >=", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiLessThan(String value) {
            addCriterion("guFenXingZhi <", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiLessThanOrEqualTo(String value) {
            addCriterion("guFenXingZhi <=", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiLike(String value) {
            addCriterion("guFenXingZhi like", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiNotLike(String value) {
            addCriterion("guFenXingZhi not like", value, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiIn(List<String> values) {
            addCriterion("guFenXingZhi in", values, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiNotIn(List<String> values) {
            addCriterion("guFenXingZhi not in", values, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiBetween(String value1, String value2) {
            addCriterion("guFenXingZhi between", value1, value2, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andGufenxingzhiNotBetween(String value1, String value2) {
            addCriterion("guFenXingZhi not between", value1, value2, "gufenxingzhi");
            return (Criteria) this;
        }

        public Criteria andChigupaimingIsNull() {
            addCriterion("chiGuPaiMing is null");
            return (Criteria) this;
        }

        public Criteria andChigupaimingIsNotNull() {
            addCriterion("chiGuPaiMing is not null");
            return (Criteria) this;
        }

        public Criteria andChigupaimingEqualTo(String value) {
            addCriterion("chiGuPaiMing =", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingNotEqualTo(String value) {
            addCriterion("chiGuPaiMing <>", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingGreaterThan(String value) {
            addCriterion("chiGuPaiMing >", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingGreaterThanOrEqualTo(String value) {
            addCriterion("chiGuPaiMing >=", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingLessThan(String value) {
            addCriterion("chiGuPaiMing <", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingLessThanOrEqualTo(String value) {
            addCriterion("chiGuPaiMing <=", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingLike(String value) {
            addCriterion("chiGuPaiMing like", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingNotLike(String value) {
            addCriterion("chiGuPaiMing not like", value, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingIn(List<String> values) {
            addCriterion("chiGuPaiMing in", values, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingNotIn(List<String> values) {
            addCriterion("chiGuPaiMing not in", values, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingBetween(String value1, String value2) {
            addCriterion("chiGuPaiMing between", value1, value2, "chigupaiming");
            return (Criteria) this;
        }

        public Criteria andChigupaimingNotBetween(String value1, String value2) {
            addCriterion("chiGuPaiMing not between", value1, value2, "chigupaiming");
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