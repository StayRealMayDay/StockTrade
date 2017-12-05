package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class RiskAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RiskAnalysisExample() {
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

        public Criteria andBetaweek100IsNull() {
            addCriterion("BETAweek100 is null");
            return (Criteria) this;
        }

        public Criteria andBetaweek100IsNotNull() {
            addCriterion("BETAweek100 is not null");
            return (Criteria) this;
        }

        public Criteria andBetaweek100EqualTo(String value) {
            addCriterion("BETAweek100 =", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100NotEqualTo(String value) {
            addCriterion("BETAweek100 <>", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100GreaterThan(String value) {
            addCriterion("BETAweek100 >", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100GreaterThanOrEqualTo(String value) {
            addCriterion("BETAweek100 >=", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100LessThan(String value) {
            addCriterion("BETAweek100 <", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100LessThanOrEqualTo(String value) {
            addCriterion("BETAweek100 <=", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100Like(String value) {
            addCriterion("BETAweek100 like", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100NotLike(String value) {
            addCriterion("BETAweek100 not like", value, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100In(List<String> values) {
            addCriterion("BETAweek100 in", values, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100NotIn(List<String> values) {
            addCriterion("BETAweek100 not in", values, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100Between(String value1, String value2) {
            addCriterion("BETAweek100 between", value1, value2, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetaweek100NotBetween(String value1, String value2) {
            addCriterion("BETAweek100 not between", value1, value2, "betaweek100");
            return (Criteria) this;
        }

        public Criteria andBetamonth24IsNull() {
            addCriterion("BETAmonth24 is null");
            return (Criteria) this;
        }

        public Criteria andBetamonth24IsNotNull() {
            addCriterion("BETAmonth24 is not null");
            return (Criteria) this;
        }

        public Criteria andBetamonth24EqualTo(String value) {
            addCriterion("BETAmonth24 =", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24NotEqualTo(String value) {
            addCriterion("BETAmonth24 <>", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24GreaterThan(String value) {
            addCriterion("BETAmonth24 >", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24GreaterThanOrEqualTo(String value) {
            addCriterion("BETAmonth24 >=", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24LessThan(String value) {
            addCriterion("BETAmonth24 <", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24LessThanOrEqualTo(String value) {
            addCriterion("BETAmonth24 <=", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24Like(String value) {
            addCriterion("BETAmonth24 like", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24NotLike(String value) {
            addCriterion("BETAmonth24 not like", value, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24In(List<String> values) {
            addCriterion("BETAmonth24 in", values, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24NotIn(List<String> values) {
            addCriterion("BETAmonth24 not in", values, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24Between(String value1, String value2) {
            addCriterion("BETAmonth24 between", value1, value2, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth24NotBetween(String value1, String value2) {
            addCriterion("BETAmonth24 not between", value1, value2, "betamonth24");
            return (Criteria) this;
        }

        public Criteria andBetamonth60IsNull() {
            addCriterion("BETAmonth60 is null");
            return (Criteria) this;
        }

        public Criteria andBetamonth60IsNotNull() {
            addCriterion("BETAmonth60 is not null");
            return (Criteria) this;
        }

        public Criteria andBetamonth60EqualTo(String value) {
            addCriterion("BETAmonth60 =", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60NotEqualTo(String value) {
            addCriterion("BETAmonth60 <>", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60GreaterThan(String value) {
            addCriterion("BETAmonth60 >", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60GreaterThanOrEqualTo(String value) {
            addCriterion("BETAmonth60 >=", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60LessThan(String value) {
            addCriterion("BETAmonth60 <", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60LessThanOrEqualTo(String value) {
            addCriterion("BETAmonth60 <=", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60Like(String value) {
            addCriterion("BETAmonth60 like", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60NotLike(String value) {
            addCriterion("BETAmonth60 not like", value, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60In(List<String> values) {
            addCriterion("BETAmonth60 in", values, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60NotIn(List<String> values) {
            addCriterion("BETAmonth60 not in", values, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60Between(String value1, String value2) {
            addCriterion("BETAmonth60 between", value1, value2, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andBetamonth60NotBetween(String value1, String value2) {
            addCriterion("BETAmonth60 not between", value1, value2, "betamonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100IsNull() {
            addCriterion("annualized_return_week100 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100IsNotNull() {
            addCriterion("annualized_return_week100 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100EqualTo(String value) {
            addCriterion("annualized_return_week100 =", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100NotEqualTo(String value) {
            addCriterion("annualized_return_week100 <>", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100GreaterThan(String value) {
            addCriterion("annualized_return_week100 >", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_return_week100 >=", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100LessThan(String value) {
            addCriterion("annualized_return_week100 <", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100LessThanOrEqualTo(String value) {
            addCriterion("annualized_return_week100 <=", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100Like(String value) {
            addCriterion("annualized_return_week100 like", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100NotLike(String value) {
            addCriterion("annualized_return_week100 not like", value, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100In(List<String> values) {
            addCriterion("annualized_return_week100 in", values, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100NotIn(List<String> values) {
            addCriterion("annualized_return_week100 not in", values, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100Between(String value1, String value2) {
            addCriterion("annualized_return_week100 between", value1, value2, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnWeek100NotBetween(String value1, String value2) {
            addCriterion("annualized_return_week100 not between", value1, value2, "annualizedReturnWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24IsNull() {
            addCriterion("annualized_return_month24 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24IsNotNull() {
            addCriterion("annualized_return_month24 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24EqualTo(String value) {
            addCriterion("annualized_return_month24 =", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24NotEqualTo(String value) {
            addCriterion("annualized_return_month24 <>", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24GreaterThan(String value) {
            addCriterion("annualized_return_month24 >", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_return_month24 >=", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24LessThan(String value) {
            addCriterion("annualized_return_month24 <", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24LessThanOrEqualTo(String value) {
            addCriterion("annualized_return_month24 <=", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24Like(String value) {
            addCriterion("annualized_return_month24 like", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24NotLike(String value) {
            addCriterion("annualized_return_month24 not like", value, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24In(List<String> values) {
            addCriterion("annualized_return_month24 in", values, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24NotIn(List<String> values) {
            addCriterion("annualized_return_month24 not in", values, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24Between(String value1, String value2) {
            addCriterion("annualized_return_month24 between", value1, value2, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth24NotBetween(String value1, String value2) {
            addCriterion("annualized_return_month24 not between", value1, value2, "annualizedReturnMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60IsNull() {
            addCriterion("annualized_return_month60 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60IsNotNull() {
            addCriterion("annualized_return_month60 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60EqualTo(String value) {
            addCriterion("annualized_return_month60 =", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60NotEqualTo(String value) {
            addCriterion("annualized_return_month60 <>", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60GreaterThan(String value) {
            addCriterion("annualized_return_month60 >", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_return_month60 >=", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60LessThan(String value) {
            addCriterion("annualized_return_month60 <", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60LessThanOrEqualTo(String value) {
            addCriterion("annualized_return_month60 <=", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60Like(String value) {
            addCriterion("annualized_return_month60 like", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60NotLike(String value) {
            addCriterion("annualized_return_month60 not like", value, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60In(List<String> values) {
            addCriterion("annualized_return_month60 in", values, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60NotIn(List<String> values) {
            addCriterion("annualized_return_month60 not in", values, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60Between(String value1, String value2) {
            addCriterion("annualized_return_month60 between", value1, value2, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedReturnMonth60NotBetween(String value1, String value2) {
            addCriterion("annualized_return_month60 not between", value1, value2, "annualizedReturnMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100IsNull() {
            addCriterion("annualized_volatility_week100 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100IsNotNull() {
            addCriterion("annualized_volatility_week100 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100EqualTo(String value) {
            addCriterion("annualized_volatility_week100 =", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100NotEqualTo(String value) {
            addCriterion("annualized_volatility_week100 <>", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100GreaterThan(String value) {
            addCriterion("annualized_volatility_week100 >", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_week100 >=", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100LessThan(String value) {
            addCriterion("annualized_volatility_week100 <", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100LessThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_week100 <=", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100Like(String value) {
            addCriterion("annualized_volatility_week100 like", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100NotLike(String value) {
            addCriterion("annualized_volatility_week100 not like", value, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100In(List<String> values) {
            addCriterion("annualized_volatility_week100 in", values, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100NotIn(List<String> values) {
            addCriterion("annualized_volatility_week100 not in", values, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100Between(String value1, String value2) {
            addCriterion("annualized_volatility_week100 between", value1, value2, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityWeek100NotBetween(String value1, String value2) {
            addCriterion("annualized_volatility_week100 not between", value1, value2, "annualizedVolatilityWeek100");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24IsNull() {
            addCriterion("annualized_volatility_month24 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24IsNotNull() {
            addCriterion("annualized_volatility_month24 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24EqualTo(String value) {
            addCriterion("annualized_volatility_month24 =", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24NotEqualTo(String value) {
            addCriterion("annualized_volatility_month24 <>", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24GreaterThan(String value) {
            addCriterion("annualized_volatility_month24 >", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_month24 >=", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24LessThan(String value) {
            addCriterion("annualized_volatility_month24 <", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24LessThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_month24 <=", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24Like(String value) {
            addCriterion("annualized_volatility_month24 like", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24NotLike(String value) {
            addCriterion("annualized_volatility_month24 not like", value, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24In(List<String> values) {
            addCriterion("annualized_volatility_month24 in", values, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24NotIn(List<String> values) {
            addCriterion("annualized_volatility_month24 not in", values, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24Between(String value1, String value2) {
            addCriterion("annualized_volatility_month24 between", value1, value2, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth24NotBetween(String value1, String value2) {
            addCriterion("annualized_volatility_month24 not between", value1, value2, "annualizedVolatilityMonth24");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60IsNull() {
            addCriterion("annualized_volatility_month60 is null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60IsNotNull() {
            addCriterion("annualized_volatility_month60 is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60EqualTo(String value) {
            addCriterion("annualized_volatility_month60 =", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60NotEqualTo(String value) {
            addCriterion("annualized_volatility_month60 <>", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60GreaterThan(String value) {
            addCriterion("annualized_volatility_month60 >", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60GreaterThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_month60 >=", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60LessThan(String value) {
            addCriterion("annualized_volatility_month60 <", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60LessThanOrEqualTo(String value) {
            addCriterion("annualized_volatility_month60 <=", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60Like(String value) {
            addCriterion("annualized_volatility_month60 like", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60NotLike(String value) {
            addCriterion("annualized_volatility_month60 not like", value, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60In(List<String> values) {
            addCriterion("annualized_volatility_month60 in", values, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60NotIn(List<String> values) {
            addCriterion("annualized_volatility_month60 not in", values, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60Between(String value1, String value2) {
            addCriterion("annualized_volatility_month60 between", value1, value2, "annualizedVolatilityMonth60");
            return (Criteria) this;
        }

        public Criteria andAnnualizedVolatilityMonth60NotBetween(String value1, String value2) {
            addCriterion("annualized_volatility_month60 not between", value1, value2, "annualizedVolatilityMonth60");
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