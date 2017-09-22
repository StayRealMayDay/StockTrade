package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompanyExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
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

        public Criteria andCompanyAreaIsNull() {
            addCriterion("company_area is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNotNull() {
            addCriterion("company_area is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaEqualTo(String value) {
            addCriterion("company_area =", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotEqualTo(String value) {
            addCriterion("company_area <>", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThan(String value) {
            addCriterion("company_area >", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("company_area >=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThan(String value) {
            addCriterion("company_area <", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThanOrEqualTo(String value) {
            addCriterion("company_area <=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLike(String value) {
            addCriterion("company_area like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotLike(String value) {
            addCriterion("company_area not like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIn(List<String> values) {
            addCriterion("company_area in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotIn(List<String> values) {
            addCriterion("company_area not in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaBetween(String value1, String value2) {
            addCriterion("company_area between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotBetween(String value1, String value2) {
            addCriterion("company_area not between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptIsNull() {
            addCriterion("resolved_concept is null");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptIsNotNull() {
            addCriterion("resolved_concept is not null");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptEqualTo(String value) {
            addCriterion("resolved_concept =", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptNotEqualTo(String value) {
            addCriterion("resolved_concept <>", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptGreaterThan(String value) {
            addCriterion("resolved_concept >", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptGreaterThanOrEqualTo(String value) {
            addCriterion("resolved_concept >=", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptLessThan(String value) {
            addCriterion("resolved_concept <", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptLessThanOrEqualTo(String value) {
            addCriterion("resolved_concept <=", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptLike(String value) {
            addCriterion("resolved_concept like", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptNotLike(String value) {
            addCriterion("resolved_concept not like", value, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptIn(List<String> values) {
            addCriterion("resolved_concept in", values, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptNotIn(List<String> values) {
            addCriterion("resolved_concept not in", values, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptBetween(String value1, String value2) {
            addCriterion("resolved_concept between", value1, value2, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andResolvedConceptNotBetween(String value1, String value2) {
            addCriterion("resolved_concept not between", value1, value2, "resolvedConcept");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNull() {
            addCriterion("main_business is null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIsNotNull() {
            addCriterion("main_business is not null");
            return (Criteria) this;
        }

        public Criteria andMainBusinessEqualTo(String value) {
            addCriterion("main_business =", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotEqualTo(String value) {
            addCriterion("main_business <>", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThan(String value) {
            addCriterion("main_business >", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("main_business >=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThan(String value) {
            addCriterion("main_business <", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLessThanOrEqualTo(String value) {
            addCriterion("main_business <=", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessLike(String value) {
            addCriterion("main_business like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotLike(String value) {
            addCriterion("main_business not like", value, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessIn(List<String> values) {
            addCriterion("main_business in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotIn(List<String> values) {
            addCriterion("main_business not in", values, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessBetween(String value1, String value2) {
            addCriterion("main_business between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andMainBusinessNotBetween(String value1, String value2) {
            addCriterion("main_business not between", value1, value2, "mainBusiness");
            return (Criteria) this;
        }

        public Criteria andLunchDateIsNull() {
            addCriterion("lunch_date is null");
            return (Criteria) this;
        }

        public Criteria andLunchDateIsNotNull() {
            addCriterion("lunch_date is not null");
            return (Criteria) this;
        }

        public Criteria andLunchDateEqualTo(String value) {
            addCriterion("lunch_date =", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateNotEqualTo(String value) {
            addCriterion("lunch_date <>", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateGreaterThan(String value) {
            addCriterion("lunch_date >", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateGreaterThanOrEqualTo(String value) {
            addCriterion("lunch_date >=", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateLessThan(String value) {
            addCriterion("lunch_date <", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateLessThanOrEqualTo(String value) {
            addCriterion("lunch_date <=", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateLike(String value) {
            addCriterion("lunch_date like", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateNotLike(String value) {
            addCriterion("lunch_date not like", value, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateIn(List<String> values) {
            addCriterion("lunch_date in", values, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateNotIn(List<String> values) {
            addCriterion("lunch_date not in", values, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateBetween(String value1, String value2) {
            addCriterion("lunch_date between", value1, value2, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andLunchDateNotBetween(String value1, String value2) {
            addCriterion("lunch_date not between", value1, value2, "lunchDate");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetIsNull() {
            addCriterion("es_net_asset is null");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetIsNotNull() {
            addCriterion("es_net_asset is not null");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetEqualTo(String value) {
            addCriterion("es_net_asset =", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetNotEqualTo(String value) {
            addCriterion("es_net_asset <>", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetGreaterThan(String value) {
            addCriterion("es_net_asset >", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetGreaterThanOrEqualTo(String value) {
            addCriterion("es_net_asset >=", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetLessThan(String value) {
            addCriterion("es_net_asset <", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetLessThanOrEqualTo(String value) {
            addCriterion("es_net_asset <=", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetLike(String value) {
            addCriterion("es_net_asset like", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetNotLike(String value) {
            addCriterion("es_net_asset not like", value, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetIn(List<String> values) {
            addCriterion("es_net_asset in", values, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetNotIn(List<String> values) {
            addCriterion("es_net_asset not in", values, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetBetween(String value1, String value2) {
            addCriterion("es_net_asset between", value1, value2, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsNetAssetNotBetween(String value1, String value2) {
            addCriterion("es_net_asset not between", value1, value2, "esNetAsset");
            return (Criteria) this;
        }

        public Criteria andEsIncomeIsNull() {
            addCriterion("es_income is null");
            return (Criteria) this;
        }

        public Criteria andEsIncomeIsNotNull() {
            addCriterion("es_income is not null");
            return (Criteria) this;
        }

        public Criteria andEsIncomeEqualTo(String value) {
            addCriterion("es_income =", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeNotEqualTo(String value) {
            addCriterion("es_income <>", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeGreaterThan(String value) {
            addCriterion("es_income >", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("es_income >=", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeLessThan(String value) {
            addCriterion("es_income <", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeLessThanOrEqualTo(String value) {
            addCriterion("es_income <=", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeLike(String value) {
            addCriterion("es_income like", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeNotLike(String value) {
            addCriterion("es_income not like", value, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeIn(List<String> values) {
            addCriterion("es_income in", values, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeNotIn(List<String> values) {
            addCriterion("es_income not in", values, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeBetween(String value1, String value2) {
            addCriterion("es_income between", value1, value2, "esIncome");
            return (Criteria) this;
        }

        public Criteria andEsIncomeNotBetween(String value1, String value2) {
            addCriterion("es_income not between", value1, value2, "esIncome");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNull() {
            addCriterion("net_profit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitIsNotNull() {
            addCriterion("net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitEqualTo(String value) {
            addCriterion("net_profit =", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotEqualTo(String value) {
            addCriterion("net_profit <>", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThan(String value) {
            addCriterion("net_profit >", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit >=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThan(String value) {
            addCriterion("net_profit <", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLessThanOrEqualTo(String value) {
            addCriterion("net_profit <=", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitLike(String value) {
            addCriterion("net_profit like", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotLike(String value) {
            addCriterion("net_profit not like", value, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitIn(List<String> values) {
            addCriterion("net_profit in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotIn(List<String> values) {
            addCriterion("net_profit not in", values, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitBetween(String value1, String value2) {
            addCriterion("net_profit between", value1, value2, "netProfit");
            return (Criteria) this;
        }

        public Criteria andNetProfitNotBetween(String value1, String value2) {
            addCriterion("net_profit not between", value1, value2, "netProfit");
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

        public Criteria andRevenueIsNull() {
            addCriterion("revenue is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIsNotNull() {
            addCriterion("revenue is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueEqualTo(String value) {
            addCriterion("revenue =", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotEqualTo(String value) {
            addCriterion("revenue <>", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThan(String value) {
            addCriterion("revenue >", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueGreaterThanOrEqualTo(String value) {
            addCriterion("revenue >=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThan(String value) {
            addCriterion("revenue <", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLessThanOrEqualTo(String value) {
            addCriterion("revenue <=", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueLike(String value) {
            addCriterion("revenue like", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotLike(String value) {
            addCriterion("revenue not like", value, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueIn(List<String> values) {
            addCriterion("revenue in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotIn(List<String> values) {
            addCriterion("revenue not in", values, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueBetween(String value1, String value2) {
            addCriterion("revenue between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andRevenueNotBetween(String value1, String value2) {
            addCriterion("revenue not between", value1, value2, "revenue");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowIsNull() {
            addCriterion("es_cash_flow is null");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowIsNotNull() {
            addCriterion("es_cash_flow is not null");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowEqualTo(String value) {
            addCriterion("es_cash_flow =", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowNotEqualTo(String value) {
            addCriterion("es_cash_flow <>", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowGreaterThan(String value) {
            addCriterion("es_cash_flow >", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowGreaterThanOrEqualTo(String value) {
            addCriterion("es_cash_flow >=", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowLessThan(String value) {
            addCriterion("es_cash_flow <", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowLessThanOrEqualTo(String value) {
            addCriterion("es_cash_flow <=", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowLike(String value) {
            addCriterion("es_cash_flow like", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowNotLike(String value) {
            addCriterion("es_cash_flow not like", value, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowIn(List<String> values) {
            addCriterion("es_cash_flow in", values, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowNotIn(List<String> values) {
            addCriterion("es_cash_flow not in", values, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowBetween(String value1, String value2) {
            addCriterion("es_cash_flow between", value1, value2, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsCashFlowNotBetween(String value1, String value2) {
            addCriterion("es_cash_flow not between", value1, value2, "esCashFlow");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundIsNull() {
            addCriterion("es_public_fund is null");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundIsNotNull() {
            addCriterion("es_public_fund is not null");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundEqualTo(String value) {
            addCriterion("es_public_fund =", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundNotEqualTo(String value) {
            addCriterion("es_public_fund <>", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundGreaterThan(String value) {
            addCriterion("es_public_fund >", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundGreaterThanOrEqualTo(String value) {
            addCriterion("es_public_fund >=", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundLessThan(String value) {
            addCriterion("es_public_fund <", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundLessThanOrEqualTo(String value) {
            addCriterion("es_public_fund <=", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundLike(String value) {
            addCriterion("es_public_fund like", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundNotLike(String value) {
            addCriterion("es_public_fund not like", value, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundIn(List<String> values) {
            addCriterion("es_public_fund in", values, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundNotIn(List<String> values) {
            addCriterion("es_public_fund not in", values, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundBetween(String value1, String value2) {
            addCriterion("es_public_fund between", value1, value2, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsPublicFundNotBetween(String value1, String value2) {
            addCriterion("es_public_fund not between", value1, value2, "esPublicFund");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitIsNull() {
            addCriterion("es_not_profit is null");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitIsNotNull() {
            addCriterion("es_not_profit is not null");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitEqualTo(String value) {
            addCriterion("es_not_profit =", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitNotEqualTo(String value) {
            addCriterion("es_not_profit <>", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitGreaterThan(String value) {
            addCriterion("es_not_profit >", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitGreaterThanOrEqualTo(String value) {
            addCriterion("es_not_profit >=", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitLessThan(String value) {
            addCriterion("es_not_profit <", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitLessThanOrEqualTo(String value) {
            addCriterion("es_not_profit <=", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitLike(String value) {
            addCriterion("es_not_profit like", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitNotLike(String value) {
            addCriterion("es_not_profit not like", value, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitIn(List<String> values) {
            addCriterion("es_not_profit in", values, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitNotIn(List<String> values) {
            addCriterion("es_not_profit not in", values, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitBetween(String value1, String value2) {
            addCriterion("es_not_profit between", value1, value2, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andEsNotProfitNotBetween(String value1, String value2) {
            addCriterion("es_not_profit not between", value1, value2, "esNotProfit");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalIsNull() {
            addCriterion("total_capital is null");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalIsNotNull() {
            addCriterion("total_capital is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalEqualTo(String value) {
            addCriterion("total_capital =", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalNotEqualTo(String value) {
            addCriterion("total_capital <>", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalGreaterThan(String value) {
            addCriterion("total_capital >", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalGreaterThanOrEqualTo(String value) {
            addCriterion("total_capital >=", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalLessThan(String value) {
            addCriterion("total_capital <", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalLessThanOrEqualTo(String value) {
            addCriterion("total_capital <=", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalLike(String value) {
            addCriterion("total_capital like", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalNotLike(String value) {
            addCriterion("total_capital not like", value, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalIn(List<String> values) {
            addCriterion("total_capital in", values, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalNotIn(List<String> values) {
            addCriterion("total_capital not in", values, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalBetween(String value1, String value2) {
            addCriterion("total_capital between", value1, value2, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andTotalCapitalNotBetween(String value1, String value2) {
            addCriterion("total_capital not between", value1, value2, "totalCapital");
            return (Criteria) this;
        }

        public Criteria andFloatingStockIsNull() {
            addCriterion("floating_stock is null");
            return (Criteria) this;
        }

        public Criteria andFloatingStockIsNotNull() {
            addCriterion("floating_stock is not null");
            return (Criteria) this;
        }

        public Criteria andFloatingStockEqualTo(String value) {
            addCriterion("floating_stock =", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockNotEqualTo(String value) {
            addCriterion("floating_stock <>", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockGreaterThan(String value) {
            addCriterion("floating_stock >", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockGreaterThanOrEqualTo(String value) {
            addCriterion("floating_stock >=", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockLessThan(String value) {
            addCriterion("floating_stock <", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockLessThanOrEqualTo(String value) {
            addCriterion("floating_stock <=", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockLike(String value) {
            addCriterion("floating_stock like", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockNotLike(String value) {
            addCriterion("floating_stock not like", value, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockIn(List<String> values) {
            addCriterion("floating_stock in", values, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockNotIn(List<String> values) {
            addCriterion("floating_stock not in", values, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockBetween(String value1, String value2) {
            addCriterion("floating_stock between", value1, value2, "floatingStock");
            return (Criteria) this;
        }

        public Criteria andFloatingStockNotBetween(String value1, String value2) {
            addCriterion("floating_stock not between", value1, value2, "floatingStock");
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