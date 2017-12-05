package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProfitForecastExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfitForecastExample() {
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

        public Criteria andForecastInstitutionCountIsNull() {
            addCriterion("forecast_institution_count is null");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountIsNotNull() {
            addCriterion("forecast_institution_count is not null");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountEqualTo(String value) {
            addCriterion("forecast_institution_count =", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountNotEqualTo(String value) {
            addCriterion("forecast_institution_count <>", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountGreaterThan(String value) {
            addCriterion("forecast_institution_count >", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountGreaterThanOrEqualTo(String value) {
            addCriterion("forecast_institution_count >=", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountLessThan(String value) {
            addCriterion("forecast_institution_count <", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountLessThanOrEqualTo(String value) {
            addCriterion("forecast_institution_count <=", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountLike(String value) {
            addCriterion("forecast_institution_count like", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountNotLike(String value) {
            addCriterion("forecast_institution_count not like", value, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountIn(List<String> values) {
            addCriterion("forecast_institution_count in", values, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountNotIn(List<String> values) {
            addCriterion("forecast_institution_count not in", values, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountBetween(String value1, String value2) {
            addCriterion("forecast_institution_count between", value1, value2, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastInstitutionCountNotBetween(String value1, String value2) {
            addCriterion("forecast_institution_count not between", value1, value2, "forecastInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareIsNull() {
            addCriterion("forecast_ave_per_share is null");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareIsNotNull() {
            addCriterion("forecast_ave_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareEqualTo(String value) {
            addCriterion("forecast_ave_per_share =", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareNotEqualTo(String value) {
            addCriterion("forecast_ave_per_share <>", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareGreaterThan(String value) {
            addCriterion("forecast_ave_per_share >", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareGreaterThanOrEqualTo(String value) {
            addCriterion("forecast_ave_per_share >=", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareLessThan(String value) {
            addCriterion("forecast_ave_per_share <", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareLessThanOrEqualTo(String value) {
            addCriterion("forecast_ave_per_share <=", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareLike(String value) {
            addCriterion("forecast_ave_per_share like", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareNotLike(String value) {
            addCriterion("forecast_ave_per_share not like", value, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareIn(List<String> values) {
            addCriterion("forecast_ave_per_share in", values, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareNotIn(List<String> values) {
            addCriterion("forecast_ave_per_share not in", values, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareBetween(String value1, String value2) {
            addCriterion("forecast_ave_per_share between", value1, value2, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAvePerShareNotBetween(String value1, String value2) {
            addCriterion("forecast_ave_per_share not between", value1, value2, "forecastAvePerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareIsNull() {
            addCriterion("forecast_sd_per_share is null");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareIsNotNull() {
            addCriterion("forecast_sd_per_share is not null");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareEqualTo(String value) {
            addCriterion("forecast_sd_per_share =", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareNotEqualTo(String value) {
            addCriterion("forecast_sd_per_share <>", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareGreaterThan(String value) {
            addCriterion("forecast_sd_per_share >", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareGreaterThanOrEqualTo(String value) {
            addCriterion("forecast_sd_per_share >=", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareLessThan(String value) {
            addCriterion("forecast_sd_per_share <", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareLessThanOrEqualTo(String value) {
            addCriterion("forecast_sd_per_share <=", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareLike(String value) {
            addCriterion("forecast_sd_per_share like", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareNotLike(String value) {
            addCriterion("forecast_sd_per_share not like", value, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareIn(List<String> values) {
            addCriterion("forecast_sd_per_share in", values, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareNotIn(List<String> values) {
            addCriterion("forecast_sd_per_share not in", values, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareBetween(String value1, String value2) {
            addCriterion("forecast_sd_per_share between", value1, value2, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastSdPerShareNotBetween(String value1, String value2) {
            addCriterion("forecast_sd_per_share not between", value1, value2, "forecastSdPerShare");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitIsNull() {
            addCriterion("forecast_ave_net_profit is null");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitIsNotNull() {
            addCriterion("forecast_ave_net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitEqualTo(String value) {
            addCriterion("forecast_ave_net_profit =", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitNotEqualTo(String value) {
            addCriterion("forecast_ave_net_profit <>", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitGreaterThan(String value) {
            addCriterion("forecast_ave_net_profit >", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitGreaterThanOrEqualTo(String value) {
            addCriterion("forecast_ave_net_profit >=", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitLessThan(String value) {
            addCriterion("forecast_ave_net_profit <", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitLessThanOrEqualTo(String value) {
            addCriterion("forecast_ave_net_profit <=", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitLike(String value) {
            addCriterion("forecast_ave_net_profit like", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitNotLike(String value) {
            addCriterion("forecast_ave_net_profit not like", value, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitIn(List<String> values) {
            addCriterion("forecast_ave_net_profit in", values, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitNotIn(List<String> values) {
            addCriterion("forecast_ave_net_profit not in", values, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitBetween(String value1, String value2) {
            addCriterion("forecast_ave_net_profit between", value1, value2, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastAveNetProfitNotBetween(String value1, String value2) {
            addCriterion("forecast_ave_net_profit not between", value1, value2, "forecastAveNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitIsNull() {
            addCriterion("forecast_sd_net_profit is null");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitIsNotNull() {
            addCriterion("forecast_sd_net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitEqualTo(String value) {
            addCriterion("forecast_sd_net_profit =", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitNotEqualTo(String value) {
            addCriterion("forecast_sd_net_profit <>", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitGreaterThan(String value) {
            addCriterion("forecast_sd_net_profit >", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitGreaterThanOrEqualTo(String value) {
            addCriterion("forecast_sd_net_profit >=", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitLessThan(String value) {
            addCriterion("forecast_sd_net_profit <", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitLessThanOrEqualTo(String value) {
            addCriterion("forecast_sd_net_profit <=", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitLike(String value) {
            addCriterion("forecast_sd_net_profit like", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitNotLike(String value) {
            addCriterion("forecast_sd_net_profit not like", value, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitIn(List<String> values) {
            addCriterion("forecast_sd_net_profit in", values, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitNotIn(List<String> values) {
            addCriterion("forecast_sd_net_profit not in", values, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitBetween(String value1, String value2) {
            addCriterion("forecast_sd_net_profit between", value1, value2, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andForecastSdNetProfitNotBetween(String value1, String value2) {
            addCriterion("forecast_sd_net_profit not between", value1, value2, "forecastSdNetProfit");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeIsNull() {
            addCriterion("main_ave_income is null");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeIsNotNull() {
            addCriterion("main_ave_income is not null");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeEqualTo(String value) {
            addCriterion("main_ave_income =", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeNotEqualTo(String value) {
            addCriterion("main_ave_income <>", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeGreaterThan(String value) {
            addCriterion("main_ave_income >", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("main_ave_income >=", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeLessThan(String value) {
            addCriterion("main_ave_income <", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeLessThanOrEqualTo(String value) {
            addCriterion("main_ave_income <=", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeLike(String value) {
            addCriterion("main_ave_income like", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeNotLike(String value) {
            addCriterion("main_ave_income not like", value, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeIn(List<String> values) {
            addCriterion("main_ave_income in", values, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeNotIn(List<String> values) {
            addCriterion("main_ave_income not in", values, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeBetween(String value1, String value2) {
            addCriterion("main_ave_income between", value1, value2, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainAveIncomeNotBetween(String value1, String value2) {
            addCriterion("main_ave_income not between", value1, value2, "mainAveIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeIsNull() {
            addCriterion("main_sd_income is null");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeIsNotNull() {
            addCriterion("main_sd_income is not null");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeEqualTo(String value) {
            addCriterion("main_sd_income =", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeNotEqualTo(String value) {
            addCriterion("main_sd_income <>", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeGreaterThan(String value) {
            addCriterion("main_sd_income >", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("main_sd_income >=", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeLessThan(String value) {
            addCriterion("main_sd_income <", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeLessThanOrEqualTo(String value) {
            addCriterion("main_sd_income <=", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeLike(String value) {
            addCriterion("main_sd_income like", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeNotLike(String value) {
            addCriterion("main_sd_income not like", value, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeIn(List<String> values) {
            addCriterion("main_sd_income in", values, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeNotIn(List<String> values) {
            addCriterion("main_sd_income not in", values, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeBetween(String value1, String value2) {
            addCriterion("main_sd_income between", value1, value2, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andMainSdIncomeNotBetween(String value1, String value2) {
            addCriterion("main_sd_income not between", value1, value2, "mainSdIncome");
            return (Criteria) this;
        }

        public Criteria andAveEbitIsNull() {
            addCriterion("ave_EBIT is null");
            return (Criteria) this;
        }

        public Criteria andAveEbitIsNotNull() {
            addCriterion("ave_EBIT is not null");
            return (Criteria) this;
        }

        public Criteria andAveEbitEqualTo(String value) {
            addCriterion("ave_EBIT =", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitNotEqualTo(String value) {
            addCriterion("ave_EBIT <>", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitGreaterThan(String value) {
            addCriterion("ave_EBIT >", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitGreaterThanOrEqualTo(String value) {
            addCriterion("ave_EBIT >=", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitLessThan(String value) {
            addCriterion("ave_EBIT <", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitLessThanOrEqualTo(String value) {
            addCriterion("ave_EBIT <=", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitLike(String value) {
            addCriterion("ave_EBIT like", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitNotLike(String value) {
            addCriterion("ave_EBIT not like", value, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitIn(List<String> values) {
            addCriterion("ave_EBIT in", values, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitNotIn(List<String> values) {
            addCriterion("ave_EBIT not in", values, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitBetween(String value1, String value2) {
            addCriterion("ave_EBIT between", value1, value2, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andAveEbitNotBetween(String value1, String value2) {
            addCriterion("ave_EBIT not between", value1, value2, "aveEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitIsNull() {
            addCriterion("sd_EBIT is null");
            return (Criteria) this;
        }

        public Criteria andSdEbitIsNotNull() {
            addCriterion("sd_EBIT is not null");
            return (Criteria) this;
        }

        public Criteria andSdEbitEqualTo(String value) {
            addCriterion("sd_EBIT =", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitNotEqualTo(String value) {
            addCriterion("sd_EBIT <>", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitGreaterThan(String value) {
            addCriterion("sd_EBIT >", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitGreaterThanOrEqualTo(String value) {
            addCriterion("sd_EBIT >=", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitLessThan(String value) {
            addCriterion("sd_EBIT <", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitLessThanOrEqualTo(String value) {
            addCriterion("sd_EBIT <=", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitLike(String value) {
            addCriterion("sd_EBIT like", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitNotLike(String value) {
            addCriterion("sd_EBIT not like", value, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitIn(List<String> values) {
            addCriterion("sd_EBIT in", values, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitNotIn(List<String> values) {
            addCriterion("sd_EBIT not in", values, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitBetween(String value1, String value2) {
            addCriterion("sd_EBIT between", value1, value2, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andSdEbitNotBetween(String value1, String value2) {
            addCriterion("sd_EBIT not between", value1, value2, "sdEbit");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowIsNull() {
            addCriterion("ave_cash_flow is null");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowIsNotNull() {
            addCriterion("ave_cash_flow is not null");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowEqualTo(String value) {
            addCriterion("ave_cash_flow =", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowNotEqualTo(String value) {
            addCriterion("ave_cash_flow <>", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowGreaterThan(String value) {
            addCriterion("ave_cash_flow >", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowGreaterThanOrEqualTo(String value) {
            addCriterion("ave_cash_flow >=", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowLessThan(String value) {
            addCriterion("ave_cash_flow <", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowLessThanOrEqualTo(String value) {
            addCriterion("ave_cash_flow <=", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowLike(String value) {
            addCriterion("ave_cash_flow like", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowNotLike(String value) {
            addCriterion("ave_cash_flow not like", value, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowIn(List<String> values) {
            addCriterion("ave_cash_flow in", values, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowNotIn(List<String> values) {
            addCriterion("ave_cash_flow not in", values, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowBetween(String value1, String value2) {
            addCriterion("ave_cash_flow between", value1, value2, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveCashFlowNotBetween(String value1, String value2) {
            addCriterion("ave_cash_flow not between", value1, value2, "aveCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowIsNull() {
            addCriterion("sd_cash_flow is null");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowIsNotNull() {
            addCriterion("sd_cash_flow is not null");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowEqualTo(String value) {
            addCriterion("sd_cash_flow =", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowNotEqualTo(String value) {
            addCriterion("sd_cash_flow <>", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowGreaterThan(String value) {
            addCriterion("sd_cash_flow >", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowGreaterThanOrEqualTo(String value) {
            addCriterion("sd_cash_flow >=", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowLessThan(String value) {
            addCriterion("sd_cash_flow <", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowLessThanOrEqualTo(String value) {
            addCriterion("sd_cash_flow <=", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowLike(String value) {
            addCriterion("sd_cash_flow like", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowNotLike(String value) {
            addCriterion("sd_cash_flow not like", value, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowIn(List<String> values) {
            addCriterion("sd_cash_flow in", values, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowNotIn(List<String> values) {
            addCriterion("sd_cash_flow not in", values, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowBetween(String value1, String value2) {
            addCriterion("sd_cash_flow between", value1, value2, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andSdCashFlowNotBetween(String value1, String value2) {
            addCriterion("sd_cash_flow not between", value1, value2, "sdCashFlow");
            return (Criteria) this;
        }

        public Criteria andAveBpsIsNull() {
            addCriterion("ave_BPS is null");
            return (Criteria) this;
        }

        public Criteria andAveBpsIsNotNull() {
            addCriterion("ave_BPS is not null");
            return (Criteria) this;
        }

        public Criteria andAveBpsEqualTo(String value) {
            addCriterion("ave_BPS =", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsNotEqualTo(String value) {
            addCriterion("ave_BPS <>", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsGreaterThan(String value) {
            addCriterion("ave_BPS >", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsGreaterThanOrEqualTo(String value) {
            addCriterion("ave_BPS >=", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsLessThan(String value) {
            addCriterion("ave_BPS <", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsLessThanOrEqualTo(String value) {
            addCriterion("ave_BPS <=", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsLike(String value) {
            addCriterion("ave_BPS like", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsNotLike(String value) {
            addCriterion("ave_BPS not like", value, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsIn(List<String> values) {
            addCriterion("ave_BPS in", values, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsNotIn(List<String> values) {
            addCriterion("ave_BPS not in", values, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsBetween(String value1, String value2) {
            addCriterion("ave_BPS between", value1, value2, "aveBps");
            return (Criteria) this;
        }

        public Criteria andAveBpsNotBetween(String value1, String value2) {
            addCriterion("ave_BPS not between", value1, value2, "aveBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsIsNull() {
            addCriterion("sd_BPS is null");
            return (Criteria) this;
        }

        public Criteria andSdBpsIsNotNull() {
            addCriterion("sd_BPS is not null");
            return (Criteria) this;
        }

        public Criteria andSdBpsEqualTo(String value) {
            addCriterion("sd_BPS =", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsNotEqualTo(String value) {
            addCriterion("sd_BPS <>", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsGreaterThan(String value) {
            addCriterion("sd_BPS >", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsGreaterThanOrEqualTo(String value) {
            addCriterion("sd_BPS >=", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsLessThan(String value) {
            addCriterion("sd_BPS <", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsLessThanOrEqualTo(String value) {
            addCriterion("sd_BPS <=", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsLike(String value) {
            addCriterion("sd_BPS like", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsNotLike(String value) {
            addCriterion("sd_BPS not like", value, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsIn(List<String> values) {
            addCriterion("sd_BPS in", values, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsNotIn(List<String> values) {
            addCriterion("sd_BPS not in", values, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsBetween(String value1, String value2) {
            addCriterion("sd_BPS between", value1, value2, "sdBps");
            return (Criteria) this;
        }

        public Criteria andSdBpsNotBetween(String value1, String value2) {
            addCriterion("sd_BPS not between", value1, value2, "sdBps");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalIsNull() {
            addCriterion("ave_profit_total is null");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalIsNotNull() {
            addCriterion("ave_profit_total is not null");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalEqualTo(String value) {
            addCriterion("ave_profit_total =", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalNotEqualTo(String value) {
            addCriterion("ave_profit_total <>", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalGreaterThan(String value) {
            addCriterion("ave_profit_total >", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalGreaterThanOrEqualTo(String value) {
            addCriterion("ave_profit_total >=", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalLessThan(String value) {
            addCriterion("ave_profit_total <", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalLessThanOrEqualTo(String value) {
            addCriterion("ave_profit_total <=", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalLike(String value) {
            addCriterion("ave_profit_total like", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalNotLike(String value) {
            addCriterion("ave_profit_total not like", value, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalIn(List<String> values) {
            addCriterion("ave_profit_total in", values, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalNotIn(List<String> values) {
            addCriterion("ave_profit_total not in", values, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalBetween(String value1, String value2) {
            addCriterion("ave_profit_total between", value1, value2, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveProfitTotalNotBetween(String value1, String value2) {
            addCriterion("ave_profit_total not between", value1, value2, "aveProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalIsNull() {
            addCriterion("sd_profit_total is null");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalIsNotNull() {
            addCriterion("sd_profit_total is not null");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalEqualTo(String value) {
            addCriterion("sd_profit_total =", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalNotEqualTo(String value) {
            addCriterion("sd_profit_total <>", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalGreaterThan(String value) {
            addCriterion("sd_profit_total >", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalGreaterThanOrEqualTo(String value) {
            addCriterion("sd_profit_total >=", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalLessThan(String value) {
            addCriterion("sd_profit_total <", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalLessThanOrEqualTo(String value) {
            addCriterion("sd_profit_total <=", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalLike(String value) {
            addCriterion("sd_profit_total like", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalNotLike(String value) {
            addCriterion("sd_profit_total not like", value, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalIn(List<String> values) {
            addCriterion("sd_profit_total in", values, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalNotIn(List<String> values) {
            addCriterion("sd_profit_total not in", values, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalBetween(String value1, String value2) {
            addCriterion("sd_profit_total between", value1, value2, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andSdProfitTotalNotBetween(String value1, String value2) {
            addCriterion("sd_profit_total not between", value1, value2, "sdProfitTotal");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeIsNull() {
            addCriterion("ave_ncapital_ROE is null");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeIsNotNull() {
            addCriterion("ave_ncapital_ROE is not null");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeEqualTo(String value) {
            addCriterion("ave_ncapital_ROE =", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeNotEqualTo(String value) {
            addCriterion("ave_ncapital_ROE <>", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeGreaterThan(String value) {
            addCriterion("ave_ncapital_ROE >", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeGreaterThanOrEqualTo(String value) {
            addCriterion("ave_ncapital_ROE >=", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeLessThan(String value) {
            addCriterion("ave_ncapital_ROE <", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeLessThanOrEqualTo(String value) {
            addCriterion("ave_ncapital_ROE <=", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeLike(String value) {
            addCriterion("ave_ncapital_ROE like", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeNotLike(String value) {
            addCriterion("ave_ncapital_ROE not like", value, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeIn(List<String> values) {
            addCriterion("ave_ncapital_ROE in", values, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeNotIn(List<String> values) {
            addCriterion("ave_ncapital_ROE not in", values, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeBetween(String value1, String value2) {
            addCriterion("ave_ncapital_ROE between", value1, value2, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveNcapitalRoeNotBetween(String value1, String value2) {
            addCriterion("ave_ncapital_ROE not between", value1, value2, "aveNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeIsNull() {
            addCriterion("sd_ncapital_ROE is null");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeIsNotNull() {
            addCriterion("sd_ncapital_ROE is not null");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeEqualTo(String value) {
            addCriterion("sd_ncapital_ROE =", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeNotEqualTo(String value) {
            addCriterion("sd_ncapital_ROE <>", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeGreaterThan(String value) {
            addCriterion("sd_ncapital_ROE >", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeGreaterThanOrEqualTo(String value) {
            addCriterion("sd_ncapital_ROE >=", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeLessThan(String value) {
            addCriterion("sd_ncapital_ROE <", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeLessThanOrEqualTo(String value) {
            addCriterion("sd_ncapital_ROE <=", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeLike(String value) {
            addCriterion("sd_ncapital_ROE like", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeNotLike(String value) {
            addCriterion("sd_ncapital_ROE not like", value, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeIn(List<String> values) {
            addCriterion("sd_ncapital_ROE in", values, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeNotIn(List<String> values) {
            addCriterion("sd_ncapital_ROE not in", values, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeBetween(String value1, String value2) {
            addCriterion("sd_ncapital_ROE between", value1, value2, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andSdNcapitalRoeNotBetween(String value1, String value2) {
            addCriterion("sd_ncapital_ROE not between", value1, value2, "sdNcapitalRoe");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaIsNull() {
            addCriterion("ave_tcapital_ROA is null");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaIsNotNull() {
            addCriterion("ave_tcapital_ROA is not null");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaEqualTo(String value) {
            addCriterion("ave_tcapital_ROA =", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaNotEqualTo(String value) {
            addCriterion("ave_tcapital_ROA <>", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaGreaterThan(String value) {
            addCriterion("ave_tcapital_ROA >", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaGreaterThanOrEqualTo(String value) {
            addCriterion("ave_tcapital_ROA >=", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaLessThan(String value) {
            addCriterion("ave_tcapital_ROA <", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaLessThanOrEqualTo(String value) {
            addCriterion("ave_tcapital_ROA <=", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaLike(String value) {
            addCriterion("ave_tcapital_ROA like", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaNotLike(String value) {
            addCriterion("ave_tcapital_ROA not like", value, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaIn(List<String> values) {
            addCriterion("ave_tcapital_ROA in", values, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaNotIn(List<String> values) {
            addCriterion("ave_tcapital_ROA not in", values, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaBetween(String value1, String value2) {
            addCriterion("ave_tcapital_ROA between", value1, value2, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveTcapitalRoaNotBetween(String value1, String value2) {
            addCriterion("ave_tcapital_ROA not between", value1, value2, "aveTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaIsNull() {
            addCriterion("sd_tcapital_ROA is null");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaIsNotNull() {
            addCriterion("sd_tcapital_ROA is not null");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaEqualTo(String value) {
            addCriterion("sd_tcapital_ROA =", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaNotEqualTo(String value) {
            addCriterion("sd_tcapital_ROA <>", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaGreaterThan(String value) {
            addCriterion("sd_tcapital_ROA >", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaGreaterThanOrEqualTo(String value) {
            addCriterion("sd_tcapital_ROA >=", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaLessThan(String value) {
            addCriterion("sd_tcapital_ROA <", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaLessThanOrEqualTo(String value) {
            addCriterion("sd_tcapital_ROA <=", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaLike(String value) {
            addCriterion("sd_tcapital_ROA like", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaNotLike(String value) {
            addCriterion("sd_tcapital_ROA not like", value, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaIn(List<String> values) {
            addCriterion("sd_tcapital_ROA in", values, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaNotIn(List<String> values) {
            addCriterion("sd_tcapital_ROA not in", values, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaBetween(String value1, String value2) {
            addCriterion("sd_tcapital_ROA between", value1, value2, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andSdTcapitalRoaNotBetween(String value1, String value2) {
            addCriterion("sd_tcapital_ROA not between", value1, value2, "sdTcapitalRoa");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitIsNull() {
            addCriterion("ave_operation_profit is null");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitIsNotNull() {
            addCriterion("ave_operation_profit is not null");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitEqualTo(String value) {
            addCriterion("ave_operation_profit =", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitNotEqualTo(String value) {
            addCriterion("ave_operation_profit <>", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitGreaterThan(String value) {
            addCriterion("ave_operation_profit >", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitGreaterThanOrEqualTo(String value) {
            addCriterion("ave_operation_profit >=", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitLessThan(String value) {
            addCriterion("ave_operation_profit <", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitLessThanOrEqualTo(String value) {
            addCriterion("ave_operation_profit <=", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitLike(String value) {
            addCriterion("ave_operation_profit like", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitNotLike(String value) {
            addCriterion("ave_operation_profit not like", value, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitIn(List<String> values) {
            addCriterion("ave_operation_profit in", values, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitNotIn(List<String> values) {
            addCriterion("ave_operation_profit not in", values, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitBetween(String value1, String value2) {
            addCriterion("ave_operation_profit between", value1, value2, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andAveOperationProfitNotBetween(String value1, String value2) {
            addCriterion("ave_operation_profit not between", value1, value2, "aveOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitIsNull() {
            addCriterion("sd_operation_profit is null");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitIsNotNull() {
            addCriterion("sd_operation_profit is not null");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitEqualTo(String value) {
            addCriterion("sd_operation_profit =", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitNotEqualTo(String value) {
            addCriterion("sd_operation_profit <>", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitGreaterThan(String value) {
            addCriterion("sd_operation_profit >", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitGreaterThanOrEqualTo(String value) {
            addCriterion("sd_operation_profit >=", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitLessThan(String value) {
            addCriterion("sd_operation_profit <", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitLessThanOrEqualTo(String value) {
            addCriterion("sd_operation_profit <=", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitLike(String value) {
            addCriterion("sd_operation_profit like", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitNotLike(String value) {
            addCriterion("sd_operation_profit not like", value, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitIn(List<String> values) {
            addCriterion("sd_operation_profit in", values, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitNotIn(List<String> values) {
            addCriterion("sd_operation_profit not in", values, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitBetween(String value1, String value2) {
            addCriterion("sd_operation_profit between", value1, value2, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andSdOperationProfitNotBetween(String value1, String value2) {
            addCriterion("sd_operation_profit not between", value1, value2, "sdOperationProfit");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownIsNull() {
            addCriterion("onemonth_net_down is null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownIsNotNull() {
            addCriterion("onemonth_net_down is not null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownEqualTo(String value) {
            addCriterion("onemonth_net_down =", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownNotEqualTo(String value) {
            addCriterion("onemonth_net_down <>", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownGreaterThan(String value) {
            addCriterion("onemonth_net_down >", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownGreaterThanOrEqualTo(String value) {
            addCriterion("onemonth_net_down >=", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownLessThan(String value) {
            addCriterion("onemonth_net_down <", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownLessThanOrEqualTo(String value) {
            addCriterion("onemonth_net_down <=", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownLike(String value) {
            addCriterion("onemonth_net_down like", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownNotLike(String value) {
            addCriterion("onemonth_net_down not like", value, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownIn(List<String> values) {
            addCriterion("onemonth_net_down in", values, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownNotIn(List<String> values) {
            addCriterion("onemonth_net_down not in", values, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownBetween(String value1, String value2) {
            addCriterion("onemonth_net_down between", value1, value2, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetDownNotBetween(String value1, String value2) {
            addCriterion("onemonth_net_down not between", value1, value2, "onemonthNetDown");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpIsNull() {
            addCriterion("onemonth_net_up is null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpIsNotNull() {
            addCriterion("onemonth_net_up is not null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpEqualTo(String value) {
            addCriterion("onemonth_net_up =", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpNotEqualTo(String value) {
            addCriterion("onemonth_net_up <>", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpGreaterThan(String value) {
            addCriterion("onemonth_net_up >", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpGreaterThanOrEqualTo(String value) {
            addCriterion("onemonth_net_up >=", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpLessThan(String value) {
            addCriterion("onemonth_net_up <", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpLessThanOrEqualTo(String value) {
            addCriterion("onemonth_net_up <=", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpLike(String value) {
            addCriterion("onemonth_net_up like", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpNotLike(String value) {
            addCriterion("onemonth_net_up not like", value, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpIn(List<String> values) {
            addCriterion("onemonth_net_up in", values, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpNotIn(List<String> values) {
            addCriterion("onemonth_net_up not in", values, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpBetween(String value1, String value2) {
            addCriterion("onemonth_net_up between", value1, value2, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetUpNotBetween(String value1, String value2) {
            addCriterion("onemonth_net_up not between", value1, value2, "onemonthNetUp");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepIsNull() {
            addCriterion("onemonth_net_keep is null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepIsNotNull() {
            addCriterion("onemonth_net_keep is not null");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepEqualTo(String value) {
            addCriterion("onemonth_net_keep =", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepNotEqualTo(String value) {
            addCriterion("onemonth_net_keep <>", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepGreaterThan(String value) {
            addCriterion("onemonth_net_keep >", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepGreaterThanOrEqualTo(String value) {
            addCriterion("onemonth_net_keep >=", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepLessThan(String value) {
            addCriterion("onemonth_net_keep <", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepLessThanOrEqualTo(String value) {
            addCriterion("onemonth_net_keep <=", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepLike(String value) {
            addCriterion("onemonth_net_keep like", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepNotLike(String value) {
            addCriterion("onemonth_net_keep not like", value, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepIn(List<String> values) {
            addCriterion("onemonth_net_keep in", values, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepNotIn(List<String> values) {
            addCriterion("onemonth_net_keep not in", values, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepBetween(String value1, String value2) {
            addCriterion("onemonth_net_keep between", value1, value2, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andOnemonthNetKeepNotBetween(String value1, String value2) {
            addCriterion("onemonth_net_keep not between", value1, value2, "onemonthNetKeep");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateIsNull() {
            addCriterion("net_profit_growth_rate is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateIsNotNull() {
            addCriterion("net_profit_growth_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateEqualTo(String value) {
            addCriterion("net_profit_growth_rate =", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateNotEqualTo(String value) {
            addCriterion("net_profit_growth_rate <>", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateGreaterThan(String value) {
            addCriterion("net_profit_growth_rate >", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_growth_rate >=", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateLessThan(String value) {
            addCriterion("net_profit_growth_rate <", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateLessThanOrEqualTo(String value) {
            addCriterion("net_profit_growth_rate <=", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateLike(String value) {
            addCriterion("net_profit_growth_rate like", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateNotLike(String value) {
            addCriterion("net_profit_growth_rate not like", value, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateIn(List<String> values) {
            addCriterion("net_profit_growth_rate in", values, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateNotIn(List<String> values) {
            addCriterion("net_profit_growth_rate not in", values, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateBetween(String value1, String value2) {
            addCriterion("net_profit_growth_rate between", value1, value2, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateNotBetween(String value1, String value2) {
            addCriterion("net_profit_growth_rate not between", value1, value2, "netProfitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateIsNull() {
            addCriterion("main_income_growth_rate is null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateIsNotNull() {
            addCriterion("main_income_growth_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateEqualTo(String value) {
            addCriterion("main_income_growth_rate =", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateNotEqualTo(String value) {
            addCriterion("main_income_growth_rate <>", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateGreaterThan(String value) {
            addCriterion("main_income_growth_rate >", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateGreaterThanOrEqualTo(String value) {
            addCriterion("main_income_growth_rate >=", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateLessThan(String value) {
            addCriterion("main_income_growth_rate <", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateLessThanOrEqualTo(String value) {
            addCriterion("main_income_growth_rate <=", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateLike(String value) {
            addCriterion("main_income_growth_rate like", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateNotLike(String value) {
            addCriterion("main_income_growth_rate not like", value, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateIn(List<String> values) {
            addCriterion("main_income_growth_rate in", values, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateNotIn(List<String> values) {
            addCriterion("main_income_growth_rate not in", values, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateBetween(String value1, String value2) {
            addCriterion("main_income_growth_rate between", value1, value2, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateNotBetween(String value1, String value2) {
            addCriterion("main_income_growth_rate not between", value1, value2, "mainIncomeGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundIsNull() {
            addCriterion("net_profit_growth_rate_compound is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundIsNotNull() {
            addCriterion("net_profit_growth_rate_compound is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundEqualTo(String value) {
            addCriterion("net_profit_growth_rate_compound =", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundNotEqualTo(String value) {
            addCriterion("net_profit_growth_rate_compound <>", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundGreaterThan(String value) {
            addCriterion("net_profit_growth_rate_compound >", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_growth_rate_compound >=", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundLessThan(String value) {
            addCriterion("net_profit_growth_rate_compound <", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundLessThanOrEqualTo(String value) {
            addCriterion("net_profit_growth_rate_compound <=", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundLike(String value) {
            addCriterion("net_profit_growth_rate_compound like", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundNotLike(String value) {
            addCriterion("net_profit_growth_rate_compound not like", value, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundIn(List<String> values) {
            addCriterion("net_profit_growth_rate_compound in", values, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundNotIn(List<String> values) {
            addCriterion("net_profit_growth_rate_compound not in", values, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundBetween(String value1, String value2) {
            addCriterion("net_profit_growth_rate_compound between", value1, value2, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andNetProfitGrowthRateCompoundNotBetween(String value1, String value2) {
            addCriterion("net_profit_growth_rate_compound not between", value1, value2, "netProfitGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundIsNull() {
            addCriterion("main_income_growth_rate_compound is null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundIsNotNull() {
            addCriterion("main_income_growth_rate_compound is not null");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundEqualTo(String value) {
            addCriterion("main_income_growth_rate_compound =", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundNotEqualTo(String value) {
            addCriterion("main_income_growth_rate_compound <>", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundGreaterThan(String value) {
            addCriterion("main_income_growth_rate_compound >", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundGreaterThanOrEqualTo(String value) {
            addCriterion("main_income_growth_rate_compound >=", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundLessThan(String value) {
            addCriterion("main_income_growth_rate_compound <", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundLessThanOrEqualTo(String value) {
            addCriterion("main_income_growth_rate_compound <=", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundLike(String value) {
            addCriterion("main_income_growth_rate_compound like", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundNotLike(String value) {
            addCriterion("main_income_growth_rate_compound not like", value, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundIn(List<String> values) {
            addCriterion("main_income_growth_rate_compound in", values, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundNotIn(List<String> values) {
            addCriterion("main_income_growth_rate_compound not in", values, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundBetween(String value1, String value2) {
            addCriterion("main_income_growth_rate_compound between", value1, value2, "mainIncomeGrowthRateCompound");
            return (Criteria) this;
        }

        public Criteria andMainIncomeGrowthRateCompoundNotBetween(String value1, String value2) {
            addCriterion("main_income_growth_rate_compound not between", value1, value2, "mainIncomeGrowthRateCompound");
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