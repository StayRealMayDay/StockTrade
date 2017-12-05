package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class OperateCapacityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OperateCapacityExample() {
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

        public Criteria andBusinessCycleIsNull() {
            addCriterion("business_cycle is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleIsNotNull() {
            addCriterion("business_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleEqualTo(String value) {
            addCriterion("business_cycle =", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleNotEqualTo(String value) {
            addCriterion("business_cycle <>", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleGreaterThan(String value) {
            addCriterion("business_cycle >", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleGreaterThanOrEqualTo(String value) {
            addCriterion("business_cycle >=", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleLessThan(String value) {
            addCriterion("business_cycle <", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleLessThanOrEqualTo(String value) {
            addCriterion("business_cycle <=", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleLike(String value) {
            addCriterion("business_cycle like", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleNotLike(String value) {
            addCriterion("business_cycle not like", value, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleIn(List<String> values) {
            addCriterion("business_cycle in", values, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleNotIn(List<String> values) {
            addCriterion("business_cycle not in", values, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleBetween(String value1, String value2) {
            addCriterion("business_cycle between", value1, value2, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andBusinessCycleNotBetween(String value1, String value2) {
            addCriterion("business_cycle not between", value1, value2, "businessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleIsNull() {
            addCriterion("net_bussiness_cycle is null");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleIsNotNull() {
            addCriterion("net_bussiness_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleEqualTo(String value) {
            addCriterion("net_bussiness_cycle =", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleNotEqualTo(String value) {
            addCriterion("net_bussiness_cycle <>", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleGreaterThan(String value) {
            addCriterion("net_bussiness_cycle >", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleGreaterThanOrEqualTo(String value) {
            addCriterion("net_bussiness_cycle >=", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleLessThan(String value) {
            addCriterion("net_bussiness_cycle <", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleLessThanOrEqualTo(String value) {
            addCriterion("net_bussiness_cycle <=", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleLike(String value) {
            addCriterion("net_bussiness_cycle like", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleNotLike(String value) {
            addCriterion("net_bussiness_cycle not like", value, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleIn(List<String> values) {
            addCriterion("net_bussiness_cycle in", values, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleNotIn(List<String> values) {
            addCriterion("net_bussiness_cycle not in", values, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleBetween(String value1, String value2) {
            addCriterion("net_bussiness_cycle between", value1, value2, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andNetBussinessCycleNotBetween(String value1, String value2) {
            addCriterion("net_bussiness_cycle not between", value1, value2, "netBussinessCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleIsNull() {
            addCriterion("cash_cycle_cycle is null");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleIsNotNull() {
            addCriterion("cash_cycle_cycle is not null");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleEqualTo(String value) {
            addCriterion("cash_cycle_cycle =", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleNotEqualTo(String value) {
            addCriterion("cash_cycle_cycle <>", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleGreaterThan(String value) {
            addCriterion("cash_cycle_cycle >", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleGreaterThanOrEqualTo(String value) {
            addCriterion("cash_cycle_cycle >=", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleLessThan(String value) {
            addCriterion("cash_cycle_cycle <", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleLessThanOrEqualTo(String value) {
            addCriterion("cash_cycle_cycle <=", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleLike(String value) {
            addCriterion("cash_cycle_cycle like", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleNotLike(String value) {
            addCriterion("cash_cycle_cycle not like", value, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleIn(List<String> values) {
            addCriterion("cash_cycle_cycle in", values, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleNotIn(List<String> values) {
            addCriterion("cash_cycle_cycle not in", values, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleBetween(String value1, String value2) {
            addCriterion("cash_cycle_cycle between", value1, value2, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andCashCycleCycleNotBetween(String value1, String value2) {
            addCriterion("cash_cycle_cycle not between", value1, value2, "cashCycleCycle");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIsNull() {
            addCriterion("inventory_turnover is null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIsNotNull() {
            addCriterion("inventory_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverEqualTo(String value) {
            addCriterion("inventory_turnover =", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotEqualTo(String value) {
            addCriterion("inventory_turnover <>", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverGreaterThan(String value) {
            addCriterion("inventory_turnover >", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("inventory_turnover >=", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLessThan(String value) {
            addCriterion("inventory_turnover <", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLessThanOrEqualTo(String value) {
            addCriterion("inventory_turnover <=", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverLike(String value) {
            addCriterion("inventory_turnover like", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotLike(String value) {
            addCriterion("inventory_turnover not like", value, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverIn(List<String> values) {
            addCriterion("inventory_turnover in", values, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotIn(List<String> values) {
            addCriterion("inventory_turnover not in", values, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverBetween(String value1, String value2) {
            addCriterion("inventory_turnover between", value1, value2, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andInventoryTurnoverNotBetween(String value1, String value2) {
            addCriterion("inventory_turnover not between", value1, value2, "inventoryTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateIsNull() {
            addCriterion("accounts_receivable_turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateIsNotNull() {
            addCriterion("accounts_receivable_turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateEqualTo(String value) {
            addCriterion("accounts_receivable_turnover_rate =", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateNotEqualTo(String value) {
            addCriterion("accounts_receivable_turnover_rate <>", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateGreaterThan(String value) {
            addCriterion("accounts_receivable_turnover_rate >", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_receivable_turnover_rate >=", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateLessThan(String value) {
            addCriterion("accounts_receivable_turnover_rate <", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("accounts_receivable_turnover_rate <=", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateLike(String value) {
            addCriterion("accounts_receivable_turnover_rate like", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateNotLike(String value) {
            addCriterion("accounts_receivable_turnover_rate not like", value, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateIn(List<String> values) {
            addCriterion("accounts_receivable_turnover_rate in", values, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateNotIn(List<String> values) {
            addCriterion("accounts_receivable_turnover_rate not in", values, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateBetween(String value1, String value2) {
            addCriterion("accounts_receivable_turnover_rate between", value1, value2, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsReceivableTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("accounts_receivable_turnover_rate not between", value1, value2, "accountsReceivableTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverIsNull() {
            addCriterion("accounts_bill_receivable_turnover is null");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverIsNotNull() {
            addCriterion("accounts_bill_receivable_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverEqualTo(String value) {
            addCriterion("accounts_bill_receivable_turnover =", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverNotEqualTo(String value) {
            addCriterion("accounts_bill_receivable_turnover <>", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverGreaterThan(String value) {
            addCriterion("accounts_bill_receivable_turnover >", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_bill_receivable_turnover >=", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverLessThan(String value) {
            addCriterion("accounts_bill_receivable_turnover <", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverLessThanOrEqualTo(String value) {
            addCriterion("accounts_bill_receivable_turnover <=", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverLike(String value) {
            addCriterion("accounts_bill_receivable_turnover like", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverNotLike(String value) {
            addCriterion("accounts_bill_receivable_turnover not like", value, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverIn(List<String> values) {
            addCriterion("accounts_bill_receivable_turnover in", values, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverNotIn(List<String> values) {
            addCriterion("accounts_bill_receivable_turnover not in", values, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverBetween(String value1, String value2) {
            addCriterion("accounts_bill_receivable_turnover between", value1, value2, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsBillReceivableTurnoverNotBetween(String value1, String value2) {
            addCriterion("accounts_bill_receivable_turnover not between", value1, value2, "accountsBillReceivableTurnover");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateIsNull() {
            addCriterion("accounts_payable_urnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateIsNotNull() {
            addCriterion("accounts_payable_urnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateEqualTo(String value) {
            addCriterion("accounts_payable_urnover_rate =", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateNotEqualTo(String value) {
            addCriterion("accounts_payable_urnover_rate <>", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateGreaterThan(String value) {
            addCriterion("accounts_payable_urnover_rate >", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("accounts_payable_urnover_rate >=", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateLessThan(String value) {
            addCriterion("accounts_payable_urnover_rate <", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateLessThanOrEqualTo(String value) {
            addCriterion("accounts_payable_urnover_rate <=", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateLike(String value) {
            addCriterion("accounts_payable_urnover_rate like", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateNotLike(String value) {
            addCriterion("accounts_payable_urnover_rate not like", value, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateIn(List<String> values) {
            addCriterion("accounts_payable_urnover_rate in", values, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateNotIn(List<String> values) {
            addCriterion("accounts_payable_urnover_rate not in", values, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateBetween(String value1, String value2) {
            addCriterion("accounts_payable_urnover_rate between", value1, value2, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andAccountsPayableUrnoverRateNotBetween(String value1, String value2) {
            addCriterion("accounts_payable_urnover_rate not between", value1, value2, "accountsPayableUrnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateIsNull() {
            addCriterion("mobile_assets_turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateIsNotNull() {
            addCriterion("mobile_assets_turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateEqualTo(String value) {
            addCriterion("mobile_assets_turnover_rate =", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateNotEqualTo(String value) {
            addCriterion("mobile_assets_turnover_rate <>", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateGreaterThan(String value) {
            addCriterion("mobile_assets_turnover_rate >", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_assets_turnover_rate >=", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateLessThan(String value) {
            addCriterion("mobile_assets_turnover_rate <", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("mobile_assets_turnover_rate <=", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateLike(String value) {
            addCriterion("mobile_assets_turnover_rate like", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateNotLike(String value) {
            addCriterion("mobile_assets_turnover_rate not like", value, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateIn(List<String> values) {
            addCriterion("mobile_assets_turnover_rate in", values, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateNotIn(List<String> values) {
            addCriterion("mobile_assets_turnover_rate not in", values, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateBetween(String value1, String value2) {
            addCriterion("mobile_assets_turnover_rate between", value1, value2, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andMobileAssetsTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("mobile_assets_turnover_rate not between", value1, value2, "mobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateIsNull() {
            addCriterion("not_mobile_assets_turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateIsNotNull() {
            addCriterion("not_mobile_assets_turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateEqualTo(String value) {
            addCriterion("not_mobile_assets_turnover_rate =", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateNotEqualTo(String value) {
            addCriterion("not_mobile_assets_turnover_rate <>", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateGreaterThan(String value) {
            addCriterion("not_mobile_assets_turnover_rate >", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("not_mobile_assets_turnover_rate >=", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateLessThan(String value) {
            addCriterion("not_mobile_assets_turnover_rate <", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("not_mobile_assets_turnover_rate <=", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateLike(String value) {
            addCriterion("not_mobile_assets_turnover_rate like", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateNotLike(String value) {
            addCriterion("not_mobile_assets_turnover_rate not like", value, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateIn(List<String> values) {
            addCriterion("not_mobile_assets_turnover_rate in", values, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateNotIn(List<String> values) {
            addCriterion("not_mobile_assets_turnover_rate not in", values, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateBetween(String value1, String value2) {
            addCriterion("not_mobile_assets_turnover_rate between", value1, value2, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andNotMobileAssetsTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("not_mobile_assets_turnover_rate not between", value1, value2, "notMobileAssetsTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverIsNull() {
            addCriterion("fixed_assets_turnover is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverIsNotNull() {
            addCriterion("fixed_assets_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverEqualTo(String value) {
            addCriterion("fixed_assets_turnover =", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverNotEqualTo(String value) {
            addCriterion("fixed_assets_turnover <>", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverGreaterThan(String value) {
            addCriterion("fixed_assets_turnover >", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_assets_turnover >=", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverLessThan(String value) {
            addCriterion("fixed_assets_turnover <", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverLessThanOrEqualTo(String value) {
            addCriterion("fixed_assets_turnover <=", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverLike(String value) {
            addCriterion("fixed_assets_turnover like", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverNotLike(String value) {
            addCriterion("fixed_assets_turnover not like", value, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverIn(List<String> values) {
            addCriterion("fixed_assets_turnover in", values, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverNotIn(List<String> values) {
            addCriterion("fixed_assets_turnover not in", values, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverBetween(String value1, String value2) {
            addCriterion("fixed_assets_turnover between", value1, value2, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsTurnoverNotBetween(String value1, String value2) {
            addCriterion("fixed_assets_turnover not between", value1, value2, "fixedAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIsNull() {
            addCriterion("total_assets_turnover is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIsNotNull() {
            addCriterion("total_assets_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverEqualTo(String value) {
            addCriterion("total_assets_turnover =", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotEqualTo(String value) {
            addCriterion("total_assets_turnover <>", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverGreaterThan(String value) {
            addCriterion("total_assets_turnover >", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("total_assets_turnover >=", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverLessThan(String value) {
            addCriterion("total_assets_turnover <", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverLessThanOrEqualTo(String value) {
            addCriterion("total_assets_turnover <=", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverLike(String value) {
            addCriterion("total_assets_turnover like", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotLike(String value) {
            addCriterion("total_assets_turnover not like", value, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverIn(List<String> values) {
            addCriterion("total_assets_turnover in", values, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotIn(List<String> values) {
            addCriterion("total_assets_turnover not in", values, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverBetween(String value1, String value2) {
            addCriterion("total_assets_turnover between", value1, value2, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andTotalAssetsTurnoverNotBetween(String value1, String value2) {
            addCriterion("total_assets_turnover not between", value1, value2, "totalAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverIsNull() {
            addCriterion("operate_assets_turnover is null");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverIsNotNull() {
            addCriterion("operate_assets_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverEqualTo(String value) {
            addCriterion("operate_assets_turnover =", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverNotEqualTo(String value) {
            addCriterion("operate_assets_turnover <>", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverGreaterThan(String value) {
            addCriterion("operate_assets_turnover >", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("operate_assets_turnover >=", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverLessThan(String value) {
            addCriterion("operate_assets_turnover <", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverLessThanOrEqualTo(String value) {
            addCriterion("operate_assets_turnover <=", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverLike(String value) {
            addCriterion("operate_assets_turnover like", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverNotLike(String value) {
            addCriterion("operate_assets_turnover not like", value, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverIn(List<String> values) {
            addCriterion("operate_assets_turnover in", values, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverNotIn(List<String> values) {
            addCriterion("operate_assets_turnover not in", values, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverBetween(String value1, String value2) {
            addCriterion("operate_assets_turnover between", value1, value2, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andOperateAssetsTurnoverNotBetween(String value1, String value2) {
            addCriterion("operate_assets_turnover not between", value1, value2, "operateAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverIsNull() {
            addCriterion("net_assets_turnover is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverIsNotNull() {
            addCriterion("net_assets_turnover is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverEqualTo(String value) {
            addCriterion("net_assets_turnover =", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverNotEqualTo(String value) {
            addCriterion("net_assets_turnover <>", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverGreaterThan(String value) {
            addCriterion("net_assets_turnover >", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverGreaterThanOrEqualTo(String value) {
            addCriterion("net_assets_turnover >=", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverLessThan(String value) {
            addCriterion("net_assets_turnover <", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverLessThanOrEqualTo(String value) {
            addCriterion("net_assets_turnover <=", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverLike(String value) {
            addCriterion("net_assets_turnover like", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverNotLike(String value) {
            addCriterion("net_assets_turnover not like", value, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverIn(List<String> values) {
            addCriterion("net_assets_turnover in", values, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverNotIn(List<String> values) {
            addCriterion("net_assets_turnover not in", values, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverBetween(String value1, String value2) {
            addCriterion("net_assets_turnover between", value1, value2, "netAssetsTurnover");
            return (Criteria) this;
        }

        public Criteria andNetAssetsTurnoverNotBetween(String value1, String value2) {
            addCriterion("net_assets_turnover not between", value1, value2, "netAssetsTurnover");
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