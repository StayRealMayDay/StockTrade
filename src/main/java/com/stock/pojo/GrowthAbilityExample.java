package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class GrowthAbilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GrowthAbilityExample() {
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

        public Criteria andOperateTotalIncomeCompoundRateIsNull() {
            addCriterion("operate_total_income_compound_rate is null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateIsNotNull() {
            addCriterion("operate_total_income_compound_rate is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateEqualTo(String value) {
            addCriterion("operate_total_income_compound_rate =", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateNotEqualTo(String value) {
            addCriterion("operate_total_income_compound_rate <>", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateGreaterThan(String value) {
            addCriterion("operate_total_income_compound_rate >", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateGreaterThanOrEqualTo(String value) {
            addCriterion("operate_total_income_compound_rate >=", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateLessThan(String value) {
            addCriterion("operate_total_income_compound_rate <", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateLessThanOrEqualTo(String value) {
            addCriterion("operate_total_income_compound_rate <=", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateLike(String value) {
            addCriterion("operate_total_income_compound_rate like", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateNotLike(String value) {
            addCriterion("operate_total_income_compound_rate not like", value, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateIn(List<String> values) {
            addCriterion("operate_total_income_compound_rate in", values, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateNotIn(List<String> values) {
            addCriterion("operate_total_income_compound_rate not in", values, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateBetween(String value1, String value2) {
            addCriterion("operate_total_income_compound_rate between", value1, value2, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeCompoundRateNotBetween(String value1, String value2) {
            addCriterion("operate_total_income_compound_rate not between", value1, value2, "operateTotalIncomeCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateIsNull() {
            addCriterion("net_profit_compound_rate is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateIsNotNull() {
            addCriterion("net_profit_compound_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateEqualTo(String value) {
            addCriterion("net_profit_compound_rate =", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateNotEqualTo(String value) {
            addCriterion("net_profit_compound_rate <>", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateGreaterThan(String value) {
            addCriterion("net_profit_compound_rate >", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_compound_rate >=", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateLessThan(String value) {
            addCriterion("net_profit_compound_rate <", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateLessThanOrEqualTo(String value) {
            addCriterion("net_profit_compound_rate <=", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateLike(String value) {
            addCriterion("net_profit_compound_rate like", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateNotLike(String value) {
            addCriterion("net_profit_compound_rate not like", value, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateIn(List<String> values) {
            addCriterion("net_profit_compound_rate in", values, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateNotIn(List<String> values) {
            addCriterion("net_profit_compound_rate not in", values, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateBetween(String value1, String value2) {
            addCriterion("net_profit_compound_rate between", value1, value2, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitCompoundRateNotBetween(String value1, String value2) {
            addCriterion("net_profit_compound_rate not between", value1, value2, "netProfitCompoundRate");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0IsNull() {
            addCriterion("capital_total_year0 is null");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0IsNotNull() {
            addCriterion("capital_total_year0 is not null");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0EqualTo(String value) {
            addCriterion("capital_total_year0 =", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0NotEqualTo(String value) {
            addCriterion("capital_total_year0 <>", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0GreaterThan(String value) {
            addCriterion("capital_total_year0 >", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0GreaterThanOrEqualTo(String value) {
            addCriterion("capital_total_year0 >=", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0LessThan(String value) {
            addCriterion("capital_total_year0 <", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0LessThanOrEqualTo(String value) {
            addCriterion("capital_total_year0 <=", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0Like(String value) {
            addCriterion("capital_total_year0 like", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0NotLike(String value) {
            addCriterion("capital_total_year0 not like", value, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0In(List<String> values) {
            addCriterion("capital_total_year0 in", values, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0NotIn(List<String> values) {
            addCriterion("capital_total_year0 not in", values, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0Between(String value1, String value2) {
            addCriterion("capital_total_year0 between", value1, value2, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andCapitalTotalYear0NotBetween(String value1, String value2) {
            addCriterion("capital_total_year0 not between", value1, value2, "capitalTotalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0IsNull() {
            addCriterion("per_share_net_capital_year0 is null");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0IsNotNull() {
            addCriterion("per_share_net_capital_year0 is not null");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0EqualTo(String value) {
            addCriterion("per_share_net_capital_year0 =", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0NotEqualTo(String value) {
            addCriterion("per_share_net_capital_year0 <>", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0GreaterThan(String value) {
            addCriterion("per_share_net_capital_year0 >", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0GreaterThanOrEqualTo(String value) {
            addCriterion("per_share_net_capital_year0 >=", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0LessThan(String value) {
            addCriterion("per_share_net_capital_year0 <", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0LessThanOrEqualTo(String value) {
            addCriterion("per_share_net_capital_year0 <=", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0Like(String value) {
            addCriterion("per_share_net_capital_year0 like", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0NotLike(String value) {
            addCriterion("per_share_net_capital_year0 not like", value, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0In(List<String> values) {
            addCriterion("per_share_net_capital_year0 in", values, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0NotIn(List<String> values) {
            addCriterion("per_share_net_capital_year0 not in", values, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0Between(String value1, String value2) {
            addCriterion("per_share_net_capital_year0 between", value1, value2, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andPerShareNetCapitalYear0NotBetween(String value1, String value2) {
            addCriterion("per_share_net_capital_year0 not between", value1, value2, "perShareNetCapitalYear0");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearIsNull() {
            addCriterion("operate_total_income_Nyear is null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearIsNotNull() {
            addCriterion("operate_total_income_Nyear is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearEqualTo(String value) {
            addCriterion("operate_total_income_Nyear =", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearNotEqualTo(String value) {
            addCriterion("operate_total_income_Nyear <>", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearGreaterThan(String value) {
            addCriterion("operate_total_income_Nyear >", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearGreaterThanOrEqualTo(String value) {
            addCriterion("operate_total_income_Nyear >=", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearLessThan(String value) {
            addCriterion("operate_total_income_Nyear <", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearLessThanOrEqualTo(String value) {
            addCriterion("operate_total_income_Nyear <=", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearLike(String value) {
            addCriterion("operate_total_income_Nyear like", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearNotLike(String value) {
            addCriterion("operate_total_income_Nyear not like", value, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearIn(List<String> values) {
            addCriterion("operate_total_income_Nyear in", values, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearNotIn(List<String> values) {
            addCriterion("operate_total_income_Nyear not in", values, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearBetween(String value1, String value2) {
            addCriterion("operate_total_income_Nyear between", value1, value2, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeNyearNotBetween(String value1, String value2) {
            addCriterion("operate_total_income_Nyear not between", value1, value2, "operateTotalIncomeNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearIsNull() {
            addCriterion("operate_profit_Nyear is null");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearIsNotNull() {
            addCriterion("operate_profit_Nyear is not null");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearEqualTo(String value) {
            addCriterion("operate_profit_Nyear =", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearNotEqualTo(String value) {
            addCriterion("operate_profit_Nyear <>", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearGreaterThan(String value) {
            addCriterion("operate_profit_Nyear >", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearGreaterThanOrEqualTo(String value) {
            addCriterion("operate_profit_Nyear >=", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearLessThan(String value) {
            addCriterion("operate_profit_Nyear <", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearLessThanOrEqualTo(String value) {
            addCriterion("operate_profit_Nyear <=", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearLike(String value) {
            addCriterion("operate_profit_Nyear like", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearNotLike(String value) {
            addCriterion("operate_profit_Nyear not like", value, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearIn(List<String> values) {
            addCriterion("operate_profit_Nyear in", values, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearNotIn(List<String> values) {
            addCriterion("operate_profit_Nyear not in", values, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearBetween(String value1, String value2) {
            addCriterion("operate_profit_Nyear between", value1, value2, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitNyearNotBetween(String value1, String value2) {
            addCriterion("operate_profit_Nyear not between", value1, value2, "operateProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearIsNull() {
            addCriterion("net_profit_Nyear is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearIsNotNull() {
            addCriterion("net_profit_Nyear is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearEqualTo(String value) {
            addCriterion("net_profit_Nyear =", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearNotEqualTo(String value) {
            addCriterion("net_profit_Nyear <>", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearGreaterThan(String value) {
            addCriterion("net_profit_Nyear >", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_Nyear >=", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearLessThan(String value) {
            addCriterion("net_profit_Nyear <", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearLessThanOrEqualTo(String value) {
            addCriterion("net_profit_Nyear <=", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearLike(String value) {
            addCriterion("net_profit_Nyear like", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearNotLike(String value) {
            addCriterion("net_profit_Nyear not like", value, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearIn(List<String> values) {
            addCriterion("net_profit_Nyear in", values, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearNotIn(List<String> values) {
            addCriterion("net_profit_Nyear not in", values, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearBetween(String value1, String value2) {
            addCriterion("net_profit_Nyear between", value1, value2, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetProfitNyearNotBetween(String value1, String value2) {
            addCriterion("net_profit_Nyear not between", value1, value2, "netProfitNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearIsNull() {
            addCriterion("net_asset_yield_Nyear is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearIsNotNull() {
            addCriterion("net_asset_yield_Nyear is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearEqualTo(String value) {
            addCriterion("net_asset_yield_Nyear =", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearNotEqualTo(String value) {
            addCriterion("net_asset_yield_Nyear <>", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearGreaterThan(String value) {
            addCriterion("net_asset_yield_Nyear >", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearGreaterThanOrEqualTo(String value) {
            addCriterion("net_asset_yield_Nyear >=", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearLessThan(String value) {
            addCriterion("net_asset_yield_Nyear <", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearLessThanOrEqualTo(String value) {
            addCriterion("net_asset_yield_Nyear <=", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearLike(String value) {
            addCriterion("net_asset_yield_Nyear like", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearNotLike(String value) {
            addCriterion("net_asset_yield_Nyear not like", value, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearIn(List<String> values) {
            addCriterion("net_asset_yield_Nyear in", values, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearNotIn(List<String> values) {
            addCriterion("net_asset_yield_Nyear not in", values, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearBetween(String value1, String value2) {
            addCriterion("net_asset_yield_Nyear between", value1, value2, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNyearNotBetween(String value1, String value2) {
            addCriterion("net_asset_yield_Nyear not between", value1, value2, "netAssetYieldNyear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearIsNull() {
            addCriterion("operate_total_income_year is null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearIsNotNull() {
            addCriterion("operate_total_income_year is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearEqualTo(String value) {
            addCriterion("operate_total_income_year =", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearNotEqualTo(String value) {
            addCriterion("operate_total_income_year <>", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearGreaterThan(String value) {
            addCriterion("operate_total_income_year >", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearGreaterThanOrEqualTo(String value) {
            addCriterion("operate_total_income_year >=", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearLessThan(String value) {
            addCriterion("operate_total_income_year <", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearLessThanOrEqualTo(String value) {
            addCriterion("operate_total_income_year <=", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearLike(String value) {
            addCriterion("operate_total_income_year like", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearNotLike(String value) {
            addCriterion("operate_total_income_year not like", value, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearIn(List<String> values) {
            addCriterion("operate_total_income_year in", values, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearNotIn(List<String> values) {
            addCriterion("operate_total_income_year not in", values, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearBetween(String value1, String value2) {
            addCriterion("operate_total_income_year between", value1, value2, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateTotalIncomeYearNotBetween(String value1, String value2) {
            addCriterion("operate_total_income_year not between", value1, value2, "operateTotalIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearIsNull() {
            addCriterion("operate_income_year is null");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearIsNotNull() {
            addCriterion("operate_income_year is not null");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearEqualTo(String value) {
            addCriterion("operate_income_year =", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearNotEqualTo(String value) {
            addCriterion("operate_income_year <>", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearGreaterThan(String value) {
            addCriterion("operate_income_year >", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearGreaterThanOrEqualTo(String value) {
            addCriterion("operate_income_year >=", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearLessThan(String value) {
            addCriterion("operate_income_year <", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearLessThanOrEqualTo(String value) {
            addCriterion("operate_income_year <=", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearLike(String value) {
            addCriterion("operate_income_year like", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearNotLike(String value) {
            addCriterion("operate_income_year not like", value, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearIn(List<String> values) {
            addCriterion("operate_income_year in", values, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearNotIn(List<String> values) {
            addCriterion("operate_income_year not in", values, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearBetween(String value1, String value2) {
            addCriterion("operate_income_year between", value1, value2, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateIncomeYearNotBetween(String value1, String value2) {
            addCriterion("operate_income_year not between", value1, value2, "operateIncomeYear");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNull() {
            addCriterion("operate_cost is null");
            return (Criteria) this;
        }

        public Criteria andOperateCostIsNotNull() {
            addCriterion("operate_cost is not null");
            return (Criteria) this;
        }

        public Criteria andOperateCostEqualTo(String value) {
            addCriterion("operate_cost =", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotEqualTo(String value) {
            addCriterion("operate_cost <>", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThan(String value) {
            addCriterion("operate_cost >", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostGreaterThanOrEqualTo(String value) {
            addCriterion("operate_cost >=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThan(String value) {
            addCriterion("operate_cost <", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLessThanOrEqualTo(String value) {
            addCriterion("operate_cost <=", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostLike(String value) {
            addCriterion("operate_cost like", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotLike(String value) {
            addCriterion("operate_cost not like", value, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostIn(List<String> values) {
            addCriterion("operate_cost in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotIn(List<String> values) {
            addCriterion("operate_cost not in", values, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostBetween(String value1, String value2) {
            addCriterion("operate_cost between", value1, value2, "operateCost");
            return (Criteria) this;
        }

        public Criteria andOperateCostNotBetween(String value1, String value2) {
            addCriterion("operate_cost not between", value1, value2, "operateCost");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearIsNull() {
            addCriterion("gross_profit_year is null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearIsNotNull() {
            addCriterion("gross_profit_year is not null");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearEqualTo(String value) {
            addCriterion("gross_profit_year =", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearNotEqualTo(String value) {
            addCriterion("gross_profit_year <>", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearGreaterThan(String value) {
            addCriterion("gross_profit_year >", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearGreaterThanOrEqualTo(String value) {
            addCriterion("gross_profit_year >=", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearLessThan(String value) {
            addCriterion("gross_profit_year <", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearLessThanOrEqualTo(String value) {
            addCriterion("gross_profit_year <=", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearLike(String value) {
            addCriterion("gross_profit_year like", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearNotLike(String value) {
            addCriterion("gross_profit_year not like", value, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearIn(List<String> values) {
            addCriterion("gross_profit_year in", values, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearNotIn(List<String> values) {
            addCriterion("gross_profit_year not in", values, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearBetween(String value1, String value2) {
            addCriterion("gross_profit_year between", value1, value2, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andGrossProfitYearNotBetween(String value1, String value2) {
            addCriterion("gross_profit_year not between", value1, value2, "grossProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearIsNull() {
            addCriterion("operate_profit_year is null");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearIsNotNull() {
            addCriterion("operate_profit_year is not null");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearEqualTo(String value) {
            addCriterion("operate_profit_year =", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearNotEqualTo(String value) {
            addCriterion("operate_profit_year <>", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearGreaterThan(String value) {
            addCriterion("operate_profit_year >", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearGreaterThanOrEqualTo(String value) {
            addCriterion("operate_profit_year >=", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearLessThan(String value) {
            addCriterion("operate_profit_year <", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearLessThanOrEqualTo(String value) {
            addCriterion("operate_profit_year <=", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearLike(String value) {
            addCriterion("operate_profit_year like", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearNotLike(String value) {
            addCriterion("operate_profit_year not like", value, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearIn(List<String> values) {
            addCriterion("operate_profit_year in", values, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearNotIn(List<String> values) {
            addCriterion("operate_profit_year not in", values, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearBetween(String value1, String value2) {
            addCriterion("operate_profit_year between", value1, value2, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andOperateProfitYearNotBetween(String value1, String value2) {
            addCriterion("operate_profit_year not between", value1, value2, "operateProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearIsNull() {
            addCriterion("total_profit_year is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearIsNotNull() {
            addCriterion("total_profit_year is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearEqualTo(String value) {
            addCriterion("total_profit_year =", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearNotEqualTo(String value) {
            addCriterion("total_profit_year <>", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearGreaterThan(String value) {
            addCriterion("total_profit_year >", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearGreaterThanOrEqualTo(String value) {
            addCriterion("total_profit_year >=", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearLessThan(String value) {
            addCriterion("total_profit_year <", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearLessThanOrEqualTo(String value) {
            addCriterion("total_profit_year <=", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearLike(String value) {
            addCriterion("total_profit_year like", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearNotLike(String value) {
            addCriterion("total_profit_year not like", value, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearIn(List<String> values) {
            addCriterion("total_profit_year in", values, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearNotIn(List<String> values) {
            addCriterion("total_profit_year not in", values, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearBetween(String value1, String value2) {
            addCriterion("total_profit_year between", value1, value2, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andTotalProfitYearNotBetween(String value1, String value2) {
            addCriterion("total_profit_year not between", value1, value2, "totalProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearIsNull() {
            addCriterion("net_profit_year is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearIsNotNull() {
            addCriterion("net_profit_year is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearEqualTo(String value) {
            addCriterion("net_profit_year =", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearNotEqualTo(String value) {
            addCriterion("net_profit_year <>", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearGreaterThan(String value) {
            addCriterion("net_profit_year >", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_year >=", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearLessThan(String value) {
            addCriterion("net_profit_year <", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearLessThanOrEqualTo(String value) {
            addCriterion("net_profit_year <=", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearLike(String value) {
            addCriterion("net_profit_year like", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearNotLike(String value) {
            addCriterion("net_profit_year not like", value, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearIn(List<String> values) {
            addCriterion("net_profit_year in", values, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearNotIn(List<String> values) {
            addCriterion("net_profit_year not in", values, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearBetween(String value1, String value2) {
            addCriterion("net_profit_year between", value1, value2, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetProfitYearNotBetween(String value1, String value2) {
            addCriterion("net_profit_year not between", value1, value2, "netProfitYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearIsNull() {
            addCriterion("net_asset_yield_diminish_year is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearIsNotNull() {
            addCriterion("net_asset_yield_diminish_year is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearEqualTo(String value) {
            addCriterion("net_asset_yield_diminish_year =", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearNotEqualTo(String value) {
            addCriterion("net_asset_yield_diminish_year <>", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearGreaterThan(String value) {
            addCriterion("net_asset_yield_diminish_year >", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearGreaterThanOrEqualTo(String value) {
            addCriterion("net_asset_yield_diminish_year >=", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearLessThan(String value) {
            addCriterion("net_asset_yield_diminish_year <", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearLessThanOrEqualTo(String value) {
            addCriterion("net_asset_yield_diminish_year <=", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearLike(String value) {
            addCriterion("net_asset_yield_diminish_year like", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearNotLike(String value) {
            addCriterion("net_asset_yield_diminish_year not like", value, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearIn(List<String> values) {
            addCriterion("net_asset_yield_diminish_year in", values, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearNotIn(List<String> values) {
            addCriterion("net_asset_yield_diminish_year not in", values, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearBetween(String value1, String value2) {
            addCriterion("net_asset_yield_diminish_year between", value1, value2, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldDiminishYearNotBetween(String value1, String value2) {
            addCriterion("net_asset_yield_diminish_year not between", value1, value2, "netAssetYieldDiminishYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearIsNull() {
            addCriterion("net_asset_year is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearIsNotNull() {
            addCriterion("net_asset_year is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearEqualTo(String value) {
            addCriterion("net_asset_year =", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearNotEqualTo(String value) {
            addCriterion("net_asset_year <>", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearGreaterThan(String value) {
            addCriterion("net_asset_year >", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearGreaterThanOrEqualTo(String value) {
            addCriterion("net_asset_year >=", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearLessThan(String value) {
            addCriterion("net_asset_year <", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearLessThanOrEqualTo(String value) {
            addCriterion("net_asset_year <=", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearLike(String value) {
            addCriterion("net_asset_year like", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearNotLike(String value) {
            addCriterion("net_asset_year not like", value, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearIn(List<String> values) {
            addCriterion("net_asset_year in", values, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearNotIn(List<String> values) {
            addCriterion("net_asset_year not in", values, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearBetween(String value1, String value2) {
            addCriterion("net_asset_year between", value1, value2, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andNetAssetYearNotBetween(String value1, String value2) {
            addCriterion("net_asset_year not between", value1, value2, "netAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearIsNull() {
            addCriterion("total_liabilities_year is null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearIsNotNull() {
            addCriterion("total_liabilities_year is not null");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearEqualTo(String value) {
            addCriterion("total_liabilities_year =", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearNotEqualTo(String value) {
            addCriterion("total_liabilities_year <>", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearGreaterThan(String value) {
            addCriterion("total_liabilities_year >", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearGreaterThanOrEqualTo(String value) {
            addCriterion("total_liabilities_year >=", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearLessThan(String value) {
            addCriterion("total_liabilities_year <", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearLessThanOrEqualTo(String value) {
            addCriterion("total_liabilities_year <=", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearLike(String value) {
            addCriterion("total_liabilities_year like", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearNotLike(String value) {
            addCriterion("total_liabilities_year not like", value, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearIn(List<String> values) {
            addCriterion("total_liabilities_year in", values, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearNotIn(List<String> values) {
            addCriterion("total_liabilities_year not in", values, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearBetween(String value1, String value2) {
            addCriterion("total_liabilities_year between", value1, value2, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalLiabilitiesYearNotBetween(String value1, String value2) {
            addCriterion("total_liabilities_year not between", value1, value2, "totalLiabilitiesYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearIsNull() {
            addCriterion("total_asset_year is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearIsNotNull() {
            addCriterion("total_asset_year is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearEqualTo(String value) {
            addCriterion("total_asset_year =", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearNotEqualTo(String value) {
            addCriterion("total_asset_year <>", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearGreaterThan(String value) {
            addCriterion("total_asset_year >", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearGreaterThanOrEqualTo(String value) {
            addCriterion("total_asset_year >=", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearLessThan(String value) {
            addCriterion("total_asset_year <", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearLessThanOrEqualTo(String value) {
            addCriterion("total_asset_year <=", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearLike(String value) {
            addCriterion("total_asset_year like", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearNotLike(String value) {
            addCriterion("total_asset_year not like", value, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearIn(List<String> values) {
            addCriterion("total_asset_year in", values, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearNotIn(List<String> values) {
            addCriterion("total_asset_year not in", values, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearBetween(String value1, String value2) {
            addCriterion("total_asset_year between", value1, value2, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andTotalAssetYearNotBetween(String value1, String value2) {
            addCriterion("total_asset_year not between", value1, value2, "totalAssetYear");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIsNull() {
            addCriterion("accounts_receivable is null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIsNotNull() {
            addCriterion("accounts_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableEqualTo(String value) {
            addCriterion("accounts_receivable =", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotEqualTo(String value) {
            addCriterion("accounts_receivable <>", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableGreaterThan(String value) {
            addCriterion("accounts_receivable >", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_receivable >=", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableLessThan(String value) {
            addCriterion("accounts_receivable <", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableLessThanOrEqualTo(String value) {
            addCriterion("accounts_receivable <=", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableLike(String value) {
            addCriterion("accounts_receivable like", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotLike(String value) {
            addCriterion("accounts_receivable not like", value, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableIn(List<String> values) {
            addCriterion("accounts_receivable in", values, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotIn(List<String> values) {
            addCriterion("accounts_receivable not in", values, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableBetween(String value1, String value2) {
            addCriterion("accounts_receivable between", value1, value2, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableNotBetween(String value1, String value2) {
            addCriterion("accounts_receivable not between", value1, value2, "accountsReceivable");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowIsNull() {
            addCriterion("net_cash_flow is null");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowIsNotNull() {
            addCriterion("net_cash_flow is not null");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowEqualTo(String value) {
            addCriterion("net_cash_flow =", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowNotEqualTo(String value) {
            addCriterion("net_cash_flow <>", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowGreaterThan(String value) {
            addCriterion("net_cash_flow >", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowGreaterThanOrEqualTo(String value) {
            addCriterion("net_cash_flow >=", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowLessThan(String value) {
            addCriterion("net_cash_flow <", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowLessThanOrEqualTo(String value) {
            addCriterion("net_cash_flow <=", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowLike(String value) {
            addCriterion("net_cash_flow like", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowNotLike(String value) {
            addCriterion("net_cash_flow not like", value, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowIn(List<String> values) {
            addCriterion("net_cash_flow in", values, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowNotIn(List<String> values) {
            addCriterion("net_cash_flow not in", values, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowBetween(String value1, String value2) {
            addCriterion("net_cash_flow between", value1, value2, "netCashFlow");
            return (Criteria) this;
        }

        public Criteria andNetCashFlowNotBetween(String value1, String value2) {
            addCriterion("net_cash_flow not between", value1, value2, "netCashFlow");
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