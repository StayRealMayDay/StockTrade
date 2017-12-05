package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class DuPontAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DuPontAnalysisExample() {
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

        public Criteria andNetAssetYieldIsNull() {
            addCriterion("net_asset_yield is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldIsNotNull() {
            addCriterion("net_asset_yield is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldEqualTo(String value) {
            addCriterion("net_asset_yield =", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNotEqualTo(String value) {
            addCriterion("net_asset_yield <>", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldGreaterThan(String value) {
            addCriterion("net_asset_yield >", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldGreaterThanOrEqualTo(String value) {
            addCriterion("net_asset_yield >=", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldLessThan(String value) {
            addCriterion("net_asset_yield <", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldLessThanOrEqualTo(String value) {
            addCriterion("net_asset_yield <=", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldLike(String value) {
            addCriterion("net_asset_yield like", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNotLike(String value) {
            addCriterion("net_asset_yield not like", value, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldIn(List<String> values) {
            addCriterion("net_asset_yield in", values, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNotIn(List<String> values) {
            addCriterion("net_asset_yield not in", values, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldBetween(String value1, String value2) {
            addCriterion("net_asset_yield between", value1, value2, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldNotBetween(String value1, String value2) {
            addCriterion("net_asset_yield not between", value1, value2, "netAssetYield");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIsNull() {
            addCriterion("equity_multiplier is null");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIsNotNull() {
            addCriterion("equity_multiplier is not null");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierEqualTo(String value) {
            addCriterion("equity_multiplier =", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotEqualTo(String value) {
            addCriterion("equity_multiplier <>", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierGreaterThan(String value) {
            addCriterion("equity_multiplier >", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierGreaterThanOrEqualTo(String value) {
            addCriterion("equity_multiplier >=", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLessThan(String value) {
            addCriterion("equity_multiplier <", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLessThanOrEqualTo(String value) {
            addCriterion("equity_multiplier <=", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierLike(String value) {
            addCriterion("equity_multiplier like", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotLike(String value) {
            addCriterion("equity_multiplier not like", value, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierIn(List<String> values) {
            addCriterion("equity_multiplier in", values, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotIn(List<String> values) {
            addCriterion("equity_multiplier not in", values, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierBetween(String value1, String value2) {
            addCriterion("equity_multiplier between", value1, value2, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andEquityMultiplierNotBetween(String value1, String value2) {
            addCriterion("equity_multiplier not between", value1, value2, "equityMultiplier");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverIsNull() {
            addCriterion("total_asset_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverIsNotNull() {
            addCriterion("total_asset_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverEqualTo(String value) {
            addCriterion("total_asset_turnover =", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverNotEqualTo(String value) {
            addCriterion("total_asset_turnover <>", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverGreaterThan(String value) {
            addCriterion("total_asset_turnover >", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("total_asset_turnover >=", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverLessThan(String value) {
            addCriterion("total_asset_turnover <", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverLessThanOrEqualTo(String value) {
            addCriterion("total_asset_turnover <=", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverLike(String value) {
            addCriterion("total_asset_turnover like", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverNotLike(String value) {
            addCriterion("total_asset_turnover not like", value, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverIn(List<String> values) {
            addCriterion("total_asset_turnover in", values, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverNotIn(List<String> values) {
            addCriterion("total_asset_turnover not in", values, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverBetween(String value1, String value2) {
            addCriterion("total_asset_turnover between", value1, value2, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetTurnoverNotBetween(String value1, String value2) {
            addCriterion("total_asset_turnover not between", value1, value2, "totalAssetTurnover");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyIsNull() {
            addCriterion("net_profit_parent_company is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyIsNotNull() {
            addCriterion("net_profit_parent_company is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyEqualTo(String value) {
            addCriterion("net_profit_parent_company =", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyNotEqualTo(String value) {
            addCriterion("net_profit_parent_company <>", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyGreaterThan(String value) {
            addCriterion("net_profit_parent_company >", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_parent_company >=", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyLessThan(String value) {
            addCriterion("net_profit_parent_company <", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyLessThanOrEqualTo(String value) {
            addCriterion("net_profit_parent_company <=", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyLike(String value) {
            addCriterion("net_profit_parent_company like", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyNotLike(String value) {
            addCriterion("net_profit_parent_company not like", value, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyIn(List<String> values) {
            addCriterion("net_profit_parent_company in", values, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyNotIn(List<String> values) {
            addCriterion("net_profit_parent_company not in", values, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyBetween(String value1, String value2) {
            addCriterion("net_profit_parent_company between", value1, value2, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitParentCompanyNotBetween(String value1, String value2) {
            addCriterion("net_profit_parent_company not between", value1, value2, "netProfitParentCompany");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeIsNull() {
            addCriterion("net_profit/total_income is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeIsNotNull() {
            addCriterion("net_profit/total_income is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeEqualTo(String value) {
            addCriterion("net_profit/total_income =", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeNotEqualTo(String value) {
            addCriterion("net_profit/total_income <>", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeGreaterThan(String value) {
            addCriterion("net_profit/total_income >", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit/total_income >=", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeLessThan(String value) {
            addCriterion("net_profit/total_income <", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeLessThanOrEqualTo(String value) {
            addCriterion("net_profit/total_income <=", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeLike(String value) {
            addCriterion("net_profit/total_income like", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeNotLike(String value) {
            addCriterion("net_profit/total_income not like", value, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeIn(List<String> values) {
            addCriterion("net_profit/total_income in", values, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeNotIn(List<String> values) {
            addCriterion("net_profit/total_income not in", values, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeBetween(String value1, String value2) {
            addCriterion("net_profit/total_income between", value1, value2, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeNotBetween(String value1, String value2) {
            addCriterion("net_profit/total_income not between", value1, value2, "netProfitTotalIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitIsNull() {
            addCriterion("net_profit/total_profit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitIsNotNull() {
            addCriterion("net_profit/total_profit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitEqualTo(String value) {
            addCriterion("net_profit/total_profit =", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitNotEqualTo(String value) {
            addCriterion("net_profit/total_profit <>", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitGreaterThan(String value) {
            addCriterion("net_profit/total_profit >", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit/total_profit >=", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitLessThan(String value) {
            addCriterion("net_profit/total_profit <", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitLessThanOrEqualTo(String value) {
            addCriterion("net_profit/total_profit <=", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitLike(String value) {
            addCriterion("net_profit/total_profit like", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitNotLike(String value) {
            addCriterion("net_profit/total_profit not like", value, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitIn(List<String> values) {
            addCriterion("net_profit/total_profit in", values, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitNotIn(List<String> values) {
            addCriterion("net_profit/total_profit not in", values, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitBetween(String value1, String value2) {
            addCriterion("net_profit/total_profit between", value1, value2, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalProfitNotBetween(String value1, String value2) {
            addCriterion("net_profit/total_profit not between", value1, value2, "netProfitTotalProfit");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxIsNull() {
            addCriterion("total_profit/before_income_tax is null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxIsNotNull() {
            addCriterion("total_profit/before_income_tax is not null");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxEqualTo(String value) {
            addCriterion("total_profit/before_income_tax =", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxNotEqualTo(String value) {
            addCriterion("total_profit/before_income_tax <>", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxGreaterThan(String value) {
            addCriterion("total_profit/before_income_tax >", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxGreaterThanOrEqualTo(String value) {
            addCriterion("total_profit/before_income_tax >=", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxLessThan(String value) {
            addCriterion("total_profit/before_income_tax <", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxLessThanOrEqualTo(String value) {
            addCriterion("total_profit/before_income_tax <=", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxLike(String value) {
            addCriterion("total_profit/before_income_tax like", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxNotLike(String value) {
            addCriterion("total_profit/before_income_tax not like", value, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxIn(List<String> values) {
            addCriterion("total_profit/before_income_tax in", values, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxNotIn(List<String> values) {
            addCriterion("total_profit/before_income_tax not in", values, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxBetween(String value1, String value2) {
            addCriterion("total_profit/before_income_tax between", value1, value2, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andTotalProfitBeforeIncomeTaxNotBetween(String value1, String value2) {
            addCriterion("total_profit/before_income_tax not between", value1, value2, "totalProfitBeforeIncomeTax");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeIsNull() {
            addCriterion("before_income_tax/total_income is null");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeIsNotNull() {
            addCriterion("before_income_tax/total_income is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeEqualTo(String value) {
            addCriterion("before_income_tax/total_income =", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeNotEqualTo(String value) {
            addCriterion("before_income_tax/total_income <>", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeGreaterThan(String value) {
            addCriterion("before_income_tax/total_income >", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("before_income_tax/total_income >=", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeLessThan(String value) {
            addCriterion("before_income_tax/total_income <", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeLessThanOrEqualTo(String value) {
            addCriterion("before_income_tax/total_income <=", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeLike(String value) {
            addCriterion("before_income_tax/total_income like", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeNotLike(String value) {
            addCriterion("before_income_tax/total_income not like", value, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeIn(List<String> values) {
            addCriterion("before_income_tax/total_income in", values, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeNotIn(List<String> values) {
            addCriterion("before_income_tax/total_income not in", values, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeBetween(String value1, String value2) {
            addCriterion("before_income_tax/total_income between", value1, value2, "beforeIncomeTaxTotalIncome");
            return (Criteria) this;
        }

        public Criteria andBeforeIncomeTaxTotalIncomeNotBetween(String value1, String value2) {
            addCriterion("before_income_tax/total_income not between", value1, value2, "beforeIncomeTaxTotalIncome");
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