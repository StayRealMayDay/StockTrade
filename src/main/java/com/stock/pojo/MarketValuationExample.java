package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class MarketValuationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarketValuationExample() {
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

        public Criteria andValueIdIsNull() {
            addCriterion("value_id is null");
            return (Criteria) this;
        }

        public Criteria andValueIdIsNotNull() {
            addCriterion("value_id is not null");
            return (Criteria) this;
        }

        public Criteria andValueIdEqualTo(Integer value) {
            addCriterion("value_id =", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotEqualTo(Integer value) {
            addCriterion("value_id <>", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThan(Integer value) {
            addCriterion("value_id >", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("value_id >=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThan(Integer value) {
            addCriterion("value_id <", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdLessThanOrEqualTo(Integer value) {
            addCriterion("value_id <=", value, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdIn(List<Integer> values) {
            addCriterion("value_id in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotIn(List<Integer> values) {
            addCriterion("value_id not in", values, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdBetween(Integer value1, Integer value2) {
            addCriterion("value_id between", value1, value2, "valueId");
            return (Criteria) this;
        }

        public Criteria andValueIdNotBetween(Integer value1, Integer value2) {
            addCriterion("value_id not between", value1, value2, "valueId");
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

        public Criteria andPeIsNull() {
            addCriterion("PE is null");
            return (Criteria) this;
        }

        public Criteria andPeIsNotNull() {
            addCriterion("PE is not null");
            return (Criteria) this;
        }

        public Criteria andPeEqualTo(String value) {
            addCriterion("PE =", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotEqualTo(String value) {
            addCriterion("PE <>", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThan(String value) {
            addCriterion("PE >", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThanOrEqualTo(String value) {
            addCriterion("PE >=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThan(String value) {
            addCriterion("PE <", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThanOrEqualTo(String value) {
            addCriterion("PE <=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLike(String value) {
            addCriterion("PE like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotLike(String value) {
            addCriterion("PE not like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeIn(List<String> values) {
            addCriterion("PE in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotIn(List<String> values) {
            addCriterion("PE not in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeBetween(String value1, String value2) {
            addCriterion("PE between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotBetween(String value1, String value2) {
            addCriterion("PE not between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPePredict12IsNull() {
            addCriterion("PE_predict12 is null");
            return (Criteria) this;
        }

        public Criteria andPePredict12IsNotNull() {
            addCriterion("PE_predict12 is not null");
            return (Criteria) this;
        }

        public Criteria andPePredict12EqualTo(String value) {
            addCriterion("PE_predict12 =", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12NotEqualTo(String value) {
            addCriterion("PE_predict12 <>", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12GreaterThan(String value) {
            addCriterion("PE_predict12 >", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12GreaterThanOrEqualTo(String value) {
            addCriterion("PE_predict12 >=", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12LessThan(String value) {
            addCriterion("PE_predict12 <", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12LessThanOrEqualTo(String value) {
            addCriterion("PE_predict12 <=", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12Like(String value) {
            addCriterion("PE_predict12 like", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12NotLike(String value) {
            addCriterion("PE_predict12 not like", value, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12In(List<String> values) {
            addCriterion("PE_predict12 in", values, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12NotIn(List<String> values) {
            addCriterion("PE_predict12 not in", values, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12Between(String value1, String value2) {
            addCriterion("PE_predict12 between", value1, value2, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPePredict12NotBetween(String value1, String value2) {
            addCriterion("PE_predict12 not between", value1, value2, "pePredict12");
            return (Criteria) this;
        }

        public Criteria andPbIsNull() {
            addCriterion("PB is null");
            return (Criteria) this;
        }

        public Criteria andPbIsNotNull() {
            addCriterion("PB is not null");
            return (Criteria) this;
        }

        public Criteria andPbEqualTo(String value) {
            addCriterion("PB =", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotEqualTo(String value) {
            addCriterion("PB <>", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThan(String value) {
            addCriterion("PB >", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThanOrEqualTo(String value) {
            addCriterion("PB >=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThan(String value) {
            addCriterion("PB <", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThanOrEqualTo(String value) {
            addCriterion("PB <=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLike(String value) {
            addCriterion("PB like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotLike(String value) {
            addCriterion("PB not like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbIn(List<String> values) {
            addCriterion("PB in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotIn(List<String> values) {
            addCriterion("PB not in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbBetween(String value1, String value2) {
            addCriterion("PB between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotBetween(String value1, String value2) {
            addCriterion("PB not between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("PS is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("PS is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("PS =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("PS <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("PS >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("PS >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("PS <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("PS <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("PS like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("PS not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("PS in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("PS not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("PS between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("PS not between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andDividendRate12IsNull() {
            addCriterion("dividend_rate12 is null");
            return (Criteria) this;
        }

        public Criteria andDividendRate12IsNotNull() {
            addCriterion("dividend_rate12 is not null");
            return (Criteria) this;
        }

        public Criteria andDividendRate12EqualTo(String value) {
            addCriterion("dividend_rate12 =", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12NotEqualTo(String value) {
            addCriterion("dividend_rate12 <>", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12GreaterThan(String value) {
            addCriterion("dividend_rate12 >", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12GreaterThanOrEqualTo(String value) {
            addCriterion("dividend_rate12 >=", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12LessThan(String value) {
            addCriterion("dividend_rate12 <", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12LessThanOrEqualTo(String value) {
            addCriterion("dividend_rate12 <=", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12Like(String value) {
            addCriterion("dividend_rate12 like", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12NotLike(String value) {
            addCriterion("dividend_rate12 not like", value, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12In(List<String> values) {
            addCriterion("dividend_rate12 in", values, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12NotIn(List<String> values) {
            addCriterion("dividend_rate12 not in", values, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12Between(String value1, String value2) {
            addCriterion("dividend_rate12 between", value1, value2, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andDividendRate12NotBetween(String value1, String value2) {
            addCriterion("dividend_rate12 not between", value1, value2, "dividendRate12");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueIsNull() {
            addCriterion("tatol_market_value is null");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueIsNotNull() {
            addCriterion("tatol_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueEqualTo(String value) {
            addCriterion("tatol_market_value =", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueNotEqualTo(String value) {
            addCriterion("tatol_market_value <>", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueGreaterThan(String value) {
            addCriterion("tatol_market_value >", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueGreaterThanOrEqualTo(String value) {
            addCriterion("tatol_market_value >=", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueLessThan(String value) {
            addCriterion("tatol_market_value <", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueLessThanOrEqualTo(String value) {
            addCriterion("tatol_market_value <=", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueLike(String value) {
            addCriterion("tatol_market_value like", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueNotLike(String value) {
            addCriterion("tatol_market_value not like", value, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueIn(List<String> values) {
            addCriterion("tatol_market_value in", values, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueNotIn(List<String> values) {
            addCriterion("tatol_market_value not in", values, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueBetween(String value1, String value2) {
            addCriterion("tatol_market_value between", value1, value2, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andTatolMarketValueNotBetween(String value1, String value2) {
            addCriterion("tatol_market_value not between", value1, value2, "tatolMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueIsNull() {
            addCriterion("flow_market_value is null");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueIsNotNull() {
            addCriterion("flow_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueEqualTo(String value) {
            addCriterion("flow_market_value =", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueNotEqualTo(String value) {
            addCriterion("flow_market_value <>", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueGreaterThan(String value) {
            addCriterion("flow_market_value >", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueGreaterThanOrEqualTo(String value) {
            addCriterion("flow_market_value >=", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueLessThan(String value) {
            addCriterion("flow_market_value <", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueLessThanOrEqualTo(String value) {
            addCriterion("flow_market_value <=", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueLike(String value) {
            addCriterion("flow_market_value like", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueNotLike(String value) {
            addCriterion("flow_market_value not like", value, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueIn(List<String> values) {
            addCriterion("flow_market_value in", values, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueNotIn(List<String> values) {
            addCriterion("flow_market_value not in", values, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueBetween(String value1, String value2) {
            addCriterion("flow_market_value between", value1, value2, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andFlowMarketValueNotBetween(String value1, String value2) {
            addCriterion("flow_market_value not between", value1, value2, "flowMarketValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueIsNull() {
            addCriterion("enterprise_value is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueIsNotNull() {
            addCriterion("enterprise_value is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueEqualTo(String value) {
            addCriterion("enterprise_value =", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueNotEqualTo(String value) {
            addCriterion("enterprise_value <>", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueGreaterThan(String value) {
            addCriterion("enterprise_value >", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_value >=", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueLessThan(String value) {
            addCriterion("enterprise_value <", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueLessThanOrEqualTo(String value) {
            addCriterion("enterprise_value <=", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueLike(String value) {
            addCriterion("enterprise_value like", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueNotLike(String value) {
            addCriterion("enterprise_value not like", value, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueIn(List<String> values) {
            addCriterion("enterprise_value in", values, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueNotIn(List<String> values) {
            addCriterion("enterprise_value not in", values, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueBetween(String value1, String value2) {
            addCriterion("enterprise_value between", value1, value2, "enterpriseValue");
            return (Criteria) this;
        }

        public Criteria andEnterpriseValueNotBetween(String value1, String value2) {
            addCriterion("enterprise_value not between", value1, value2, "enterpriseValue");
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