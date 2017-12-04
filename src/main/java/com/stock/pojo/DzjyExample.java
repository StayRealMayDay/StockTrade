package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class DzjyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DzjyExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNull() {
            addCriterion("transaction_date is null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIsNotNull() {
            addCriterion("transaction_date is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionDateEqualTo(String value) {
            addCriterion("transaction_date =", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotEqualTo(String value) {
            addCriterion("transaction_date <>", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThan(String value) {
            addCriterion("transaction_date >", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_date >=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThan(String value) {
            addCriterion("transaction_date <", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLessThanOrEqualTo(String value) {
            addCriterion("transaction_date <=", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateLike(String value) {
            addCriterion("transaction_date like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotLike(String value) {
            addCriterion("transaction_date not like", value, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateIn(List<String> values) {
            addCriterion("transaction_date in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotIn(List<String> values) {
            addCriterion("transaction_date not in", values, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateBetween(String value1, String value2) {
            addCriterion("transaction_date between", value1, value2, "transactionDate");
            return (Criteria) this;
        }

        public Criteria andTransactionDateNotBetween(String value1, String value2) {
            addCriterion("transaction_date not between", value1, value2, "transactionDate");
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

        public Criteria andLatestPriceIsNull() {
            addCriterion("latest_price is null");
            return (Criteria) this;
        }

        public Criteria andLatestPriceIsNotNull() {
            addCriterion("latest_price is not null");
            return (Criteria) this;
        }

        public Criteria andLatestPriceEqualTo(String value) {
            addCriterion("latest_price =", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceNotEqualTo(String value) {
            addCriterion("latest_price <>", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceGreaterThan(String value) {
            addCriterion("latest_price >", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceGreaterThanOrEqualTo(String value) {
            addCriterion("latest_price >=", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceLessThan(String value) {
            addCriterion("latest_price <", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceLessThanOrEqualTo(String value) {
            addCriterion("latest_price <=", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceLike(String value) {
            addCriterion("latest_price like", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceNotLike(String value) {
            addCriterion("latest_price not like", value, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceIn(List<String> values) {
            addCriterion("latest_price in", values, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceNotIn(List<String> values) {
            addCriterion("latest_price not in", values, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceBetween(String value1, String value2) {
            addCriterion("latest_price between", value1, value2, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andLatestPriceNotBetween(String value1, String value2) {
            addCriterion("latest_price not between", value1, value2, "latestPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNull() {
            addCriterion("deal_price is null");
            return (Criteria) this;
        }

        public Criteria andDealPriceIsNotNull() {
            addCriterion("deal_price is not null");
            return (Criteria) this;
        }

        public Criteria andDealPriceEqualTo(String value) {
            addCriterion("deal_price =", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotEqualTo(String value) {
            addCriterion("deal_price <>", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThan(String value) {
            addCriterion("deal_price >", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceGreaterThanOrEqualTo(String value) {
            addCriterion("deal_price >=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThan(String value) {
            addCriterion("deal_price <", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLessThanOrEqualTo(String value) {
            addCriterion("deal_price <=", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceLike(String value) {
            addCriterion("deal_price like", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotLike(String value) {
            addCriterion("deal_price not like", value, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceIn(List<String> values) {
            addCriterion("deal_price in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotIn(List<String> values) {
            addCriterion("deal_price not in", values, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceBetween(String value1, String value2) {
            addCriterion("deal_price between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealPriceNotBetween(String value1, String value2) {
            addCriterion("deal_price not between", value1, value2, "dealPrice");
            return (Criteria) this;
        }

        public Criteria andDealNumIsNull() {
            addCriterion("deal_num is null");
            return (Criteria) this;
        }

        public Criteria andDealNumIsNotNull() {
            addCriterion("deal_num is not null");
            return (Criteria) this;
        }

        public Criteria andDealNumEqualTo(String value) {
            addCriterion("deal_num =", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotEqualTo(String value) {
            addCriterion("deal_num <>", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumGreaterThan(String value) {
            addCriterion("deal_num >", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumGreaterThanOrEqualTo(String value) {
            addCriterion("deal_num >=", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLessThan(String value) {
            addCriterion("deal_num <", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLessThanOrEqualTo(String value) {
            addCriterion("deal_num <=", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumLike(String value) {
            addCriterion("deal_num like", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotLike(String value) {
            addCriterion("deal_num not like", value, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumIn(List<String> values) {
            addCriterion("deal_num in", values, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotIn(List<String> values) {
            addCriterion("deal_num not in", values, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumBetween(String value1, String value2) {
            addCriterion("deal_num between", value1, value2, "dealNum");
            return (Criteria) this;
        }

        public Criteria andDealNumNotBetween(String value1, String value2) {
            addCriterion("deal_num not between", value1, value2, "dealNum");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIsNull() {
            addCriterion("premium_rate is null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIsNotNull() {
            addCriterion("premium_rate is not null");
            return (Criteria) this;
        }

        public Criteria andPremiumRateEqualTo(String value) {
            addCriterion("premium_rate =", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotEqualTo(String value) {
            addCriterion("premium_rate <>", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateGreaterThan(String value) {
            addCriterion("premium_rate >", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateGreaterThanOrEqualTo(String value) {
            addCriterion("premium_rate >=", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateLessThan(String value) {
            addCriterion("premium_rate <", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateLessThanOrEqualTo(String value) {
            addCriterion("premium_rate <=", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateLike(String value) {
            addCriterion("premium_rate like", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotLike(String value) {
            addCriterion("premium_rate not like", value, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateIn(List<String> values) {
            addCriterion("premium_rate in", values, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotIn(List<String> values) {
            addCriterion("premium_rate not in", values, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateBetween(String value1, String value2) {
            addCriterion("premium_rate between", value1, value2, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPremiumRateNotBetween(String value1, String value2) {
            addCriterion("premium_rate not between", value1, value2, "premiumRate");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentIsNull() {
            addCriterion("purchasing_department is null");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentIsNotNull() {
            addCriterion("purchasing_department is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentEqualTo(String value) {
            addCriterion("purchasing_department =", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentNotEqualTo(String value) {
            addCriterion("purchasing_department <>", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentGreaterThan(String value) {
            addCriterion("purchasing_department >", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("purchasing_department >=", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentLessThan(String value) {
            addCriterion("purchasing_department <", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentLessThanOrEqualTo(String value) {
            addCriterion("purchasing_department <=", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentLike(String value) {
            addCriterion("purchasing_department like", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentNotLike(String value) {
            addCriterion("purchasing_department not like", value, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentIn(List<String> values) {
            addCriterion("purchasing_department in", values, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentNotIn(List<String> values) {
            addCriterion("purchasing_department not in", values, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentBetween(String value1, String value2) {
            addCriterion("purchasing_department between", value1, value2, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andPurchasingDepartmentNotBetween(String value1, String value2) {
            addCriterion("purchasing_department not between", value1, value2, "purchasingDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentIsNull() {
            addCriterion("sales_department is null");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentIsNotNull() {
            addCriterion("sales_department is not null");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentEqualTo(String value) {
            addCriterion("sales_department =", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentNotEqualTo(String value) {
            addCriterion("sales_department <>", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentGreaterThan(String value) {
            addCriterion("sales_department >", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("sales_department >=", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentLessThan(String value) {
            addCriterion("sales_department <", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentLessThanOrEqualTo(String value) {
            addCriterion("sales_department <=", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentLike(String value) {
            addCriterion("sales_department like", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentNotLike(String value) {
            addCriterion("sales_department not like", value, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentIn(List<String> values) {
            addCriterion("sales_department in", values, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentNotIn(List<String> values) {
            addCriterion("sales_department not in", values, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentBetween(String value1, String value2) {
            addCriterion("sales_department between", value1, value2, "salesDepartment");
            return (Criteria) this;
        }

        public Criteria andSalesDepartmentNotBetween(String value1, String value2) {
            addCriterion("sales_department not between", value1, value2, "salesDepartment");
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