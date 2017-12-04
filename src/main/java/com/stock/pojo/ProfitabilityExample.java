package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class ProfitabilityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfitabilityExample() {
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

        public Criteria andNetAssetYieldroeTtmIsNull() {
            addCriterion("net_asset_yieldROE_TTM is null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmIsNotNull() {
            addCriterion("net_asset_yieldROE_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmEqualTo(String value) {
            addCriterion("net_asset_yieldROE_TTM =", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmNotEqualTo(String value) {
            addCriterion("net_asset_yieldROE_TTM <>", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmGreaterThan(String value) {
            addCriterion("net_asset_yieldROE_TTM >", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("net_asset_yieldROE_TTM >=", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmLessThan(String value) {
            addCriterion("net_asset_yieldROE_TTM <", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmLessThanOrEqualTo(String value) {
            addCriterion("net_asset_yieldROE_TTM <=", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmLike(String value) {
            addCriterion("net_asset_yieldROE_TTM like", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmNotLike(String value) {
            addCriterion("net_asset_yieldROE_TTM not like", value, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmIn(List<String> values) {
            addCriterion("net_asset_yieldROE_TTM in", values, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmNotIn(List<String> values) {
            addCriterion("net_asset_yieldROE_TTM not in", values, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmBetween(String value1, String value2) {
            addCriterion("net_asset_yieldROE_TTM between", value1, value2, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andNetAssetYieldroeTtmNotBetween(String value1, String value2) {
            addCriterion("net_asset_yieldROE_TTM not between", value1, value2, "netAssetYieldroeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmIsNull() {
            addCriterion("total_asset_reward_rateROA_TTM is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmIsNotNull() {
            addCriterion("total_asset_reward_rateROA_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmEqualTo(String value) {
            addCriterion("total_asset_reward_rateROA_TTM =", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmNotEqualTo(String value) {
            addCriterion("total_asset_reward_rateROA_TTM <>", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmGreaterThan(String value) {
            addCriterion("total_asset_reward_rateROA_TTM >", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmGreaterThanOrEqualTo(String value) {
            addCriterion("total_asset_reward_rateROA_TTM >=", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmLessThan(String value) {
            addCriterion("total_asset_reward_rateROA_TTM <", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmLessThanOrEqualTo(String value) {
            addCriterion("total_asset_reward_rateROA_TTM <=", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmLike(String value) {
            addCriterion("total_asset_reward_rateROA_TTM like", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmNotLike(String value) {
            addCriterion("total_asset_reward_rateROA_TTM not like", value, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmIn(List<String> values) {
            addCriterion("total_asset_reward_rateROA_TTM in", values, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmNotIn(List<String> values) {
            addCriterion("total_asset_reward_rateROA_TTM not in", values, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmBetween(String value1, String value2) {
            addCriterion("total_asset_reward_rateROA_TTM between", value1, value2, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetRewardRateroaTtmNotBetween(String value1, String value2) {
            addCriterion("total_asset_reward_rateROA_TTM not between", value1, value2, "totalAssetRewardRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmIsNull() {
            addCriterion("total_asset_net_rateROA_TTM is null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmIsNotNull() {
            addCriterion("total_asset_net_rateROA_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmEqualTo(String value) {
            addCriterion("total_asset_net_rateROA_TTM =", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmNotEqualTo(String value) {
            addCriterion("total_asset_net_rateROA_TTM <>", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmGreaterThan(String value) {
            addCriterion("total_asset_net_rateROA_TTM >", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmGreaterThanOrEqualTo(String value) {
            addCriterion("total_asset_net_rateROA_TTM >=", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmLessThan(String value) {
            addCriterion("total_asset_net_rateROA_TTM <", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmLessThanOrEqualTo(String value) {
            addCriterion("total_asset_net_rateROA_TTM <=", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmLike(String value) {
            addCriterion("total_asset_net_rateROA_TTM like", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmNotLike(String value) {
            addCriterion("total_asset_net_rateROA_TTM not like", value, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmIn(List<String> values) {
            addCriterion("total_asset_net_rateROA_TTM in", values, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmNotIn(List<String> values) {
            addCriterion("total_asset_net_rateROA_TTM not in", values, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmBetween(String value1, String value2) {
            addCriterion("total_asset_net_rateROA_TTM between", value1, value2, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andTotalAssetNetRateroaTtmNotBetween(String value1, String value2) {
            addCriterion("total_asset_net_rateROA_TTM not between", value1, value2, "totalAssetNetRateroaTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmIsNull() {
            addCriterion("return_capitalROIC_TTM is null");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmIsNotNull() {
            addCriterion("return_capitalROIC_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmEqualTo(String value) {
            addCriterion("return_capitalROIC_TTM =", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmNotEqualTo(String value) {
            addCriterion("return_capitalROIC_TTM <>", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmGreaterThan(String value) {
            addCriterion("return_capitalROIC_TTM >", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmGreaterThanOrEqualTo(String value) {
            addCriterion("return_capitalROIC_TTM >=", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmLessThan(String value) {
            addCriterion("return_capitalROIC_TTM <", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmLessThanOrEqualTo(String value) {
            addCriterion("return_capitalROIC_TTM <=", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmLike(String value) {
            addCriterion("return_capitalROIC_TTM like", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmNotLike(String value) {
            addCriterion("return_capitalROIC_TTM not like", value, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmIn(List<String> values) {
            addCriterion("return_capitalROIC_TTM in", values, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmNotIn(List<String> values) {
            addCriterion("return_capitalROIC_TTM not in", values, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmBetween(String value1, String value2) {
            addCriterion("return_capitalROIC_TTM between", value1, value2, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andReturnCapitalroicTtmNotBetween(String value1, String value2) {
            addCriterion("return_capitalROIC_TTM not between", value1, value2, "returnCapitalroicTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmIsNull() {
            addCriterion("net_sales_rate_TTM is null");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmIsNotNull() {
            addCriterion("net_sales_rate_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmEqualTo(String value) {
            addCriterion("net_sales_rate_TTM =", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmNotEqualTo(String value) {
            addCriterion("net_sales_rate_TTM <>", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmGreaterThan(String value) {
            addCriterion("net_sales_rate_TTM >", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmGreaterThanOrEqualTo(String value) {
            addCriterion("net_sales_rate_TTM >=", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmLessThan(String value) {
            addCriterion("net_sales_rate_TTM <", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmLessThanOrEqualTo(String value) {
            addCriterion("net_sales_rate_TTM <=", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmLike(String value) {
            addCriterion("net_sales_rate_TTM like", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmNotLike(String value) {
            addCriterion("net_sales_rate_TTM not like", value, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmIn(List<String> values) {
            addCriterion("net_sales_rate_TTM in", values, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmNotIn(List<String> values) {
            addCriterion("net_sales_rate_TTM not in", values, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmBetween(String value1, String value2) {
            addCriterion("net_sales_rate_TTM between", value1, value2, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andNetSalesRateTtmNotBetween(String value1, String value2) {
            addCriterion("net_sales_rate_TTM not between", value1, value2, "netSalesRateTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmIsNull() {
            addCriterion("gross_margin_sales_TTM is null");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmIsNotNull() {
            addCriterion("gross_margin_sales_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmEqualTo(String value) {
            addCriterion("gross_margin_sales_TTM =", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmNotEqualTo(String value) {
            addCriterion("gross_margin_sales_TTM <>", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmGreaterThan(String value) {
            addCriterion("gross_margin_sales_TTM >", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmGreaterThanOrEqualTo(String value) {
            addCriterion("gross_margin_sales_TTM >=", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmLessThan(String value) {
            addCriterion("gross_margin_sales_TTM <", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmLessThanOrEqualTo(String value) {
            addCriterion("gross_margin_sales_TTM <=", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmLike(String value) {
            addCriterion("gross_margin_sales_TTM like", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmNotLike(String value) {
            addCriterion("gross_margin_sales_TTM not like", value, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmIn(List<String> values) {
            addCriterion("gross_margin_sales_TTM in", values, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmNotIn(List<String> values) {
            addCriterion("gross_margin_sales_TTM not in", values, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmBetween(String value1, String value2) {
            addCriterion("gross_margin_sales_TTM between", value1, value2, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andGrossMarginSalesTtmNotBetween(String value1, String value2) {
            addCriterion("gross_margin_sales_TTM not between", value1, value2, "grossMarginSalesTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmIsNull() {
            addCriterion("net_profit/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmIsNotNull() {
            addCriterion("net_profit/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmEqualTo(String value) {
            addCriterion("net_profit/total_income_TTM =", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("net_profit/total_income_TTM <>", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmGreaterThan(String value) {
            addCriterion("net_profit/total_income_TTM >", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit/total_income_TTM >=", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmLessThan(String value) {
            addCriterion("net_profit/total_income_TTM <", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("net_profit/total_income_TTM <=", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmLike(String value) {
            addCriterion("net_profit/total_income_TTM like", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmNotLike(String value) {
            addCriterion("net_profit/total_income_TTM not like", value, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmIn(List<String> values) {
            addCriterion("net_profit/total_income_TTM in", values, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("net_profit/total_income_TTM not in", values, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("net_profit/total_income_TTM between", value1, value2, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andNetProfitTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("net_profit/total_income_TTM not between", value1, value2, "netProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmIsNull() {
            addCriterion("oprate_profit/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmIsNotNull() {
            addCriterion("oprate_profit/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmEqualTo(String value) {
            addCriterion("oprate_profit/total_income_TTM =", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("oprate_profit/total_income_TTM <>", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmGreaterThan(String value) {
            addCriterion("oprate_profit/total_income_TTM >", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("oprate_profit/total_income_TTM >=", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmLessThan(String value) {
            addCriterion("oprate_profit/total_income_TTM <", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("oprate_profit/total_income_TTM <=", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmLike(String value) {
            addCriterion("oprate_profit/total_income_TTM like", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmNotLike(String value) {
            addCriterion("oprate_profit/total_income_TTM not like", value, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmIn(List<String> values) {
            addCriterion("oprate_profit/total_income_TTM in", values, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("oprate_profit/total_income_TTM not in", values, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("oprate_profit/total_income_TTM between", value1, value2, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andOprateProfitTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("oprate_profit/total_income_TTM not between", value1, value2, "oprateProfitTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmIsNull() {
            addCriterion("total_cost/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmIsNotNull() {
            addCriterion("total_cost/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmEqualTo(String value) {
            addCriterion("total_cost/total_income_TTM =", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("total_cost/total_income_TTM <>", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmGreaterThan(String value) {
            addCriterion("total_cost/total_income_TTM >", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("total_cost/total_income_TTM >=", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmLessThan(String value) {
            addCriterion("total_cost/total_income_TTM <", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("total_cost/total_income_TTM <=", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmLike(String value) {
            addCriterion("total_cost/total_income_TTM like", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmNotLike(String value) {
            addCriterion("total_cost/total_income_TTM not like", value, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmIn(List<String> values) {
            addCriterion("total_cost/total_income_TTM in", values, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("total_cost/total_income_TTM not in", values, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("total_cost/total_income_TTM between", value1, value2, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andTotalCostTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("total_cost/total_income_TTM not between", value1, value2, "totalCostTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmIsNull() {
            addCriterion("sales/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmIsNotNull() {
            addCriterion("sales/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmEqualTo(String value) {
            addCriterion("sales/total_income_TTM =", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("sales/total_income_TTM <>", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmGreaterThan(String value) {
            addCriterion("sales/total_income_TTM >", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("sales/total_income_TTM >=", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmLessThan(String value) {
            addCriterion("sales/total_income_TTM <", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("sales/total_income_TTM <=", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmLike(String value) {
            addCriterion("sales/total_income_TTM like", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmNotLike(String value) {
            addCriterion("sales/total_income_TTM not like", value, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmIn(List<String> values) {
            addCriterion("sales/total_income_TTM in", values, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("sales/total_income_TTM not in", values, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("sales/total_income_TTM between", value1, value2, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andSalesTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("sales/total_income_TTM not between", value1, value2, "salesTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmIsNull() {
            addCriterion("management/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmIsNotNull() {
            addCriterion("management/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmEqualTo(String value) {
            addCriterion("management/total_income_TTM =", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("management/total_income_TTM <>", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmGreaterThan(String value) {
            addCriterion("management/total_income_TTM >", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("management/total_income_TTM >=", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmLessThan(String value) {
            addCriterion("management/total_income_TTM <", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("management/total_income_TTM <=", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmLike(String value) {
            addCriterion("management/total_income_TTM like", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmNotLike(String value) {
            addCriterion("management/total_income_TTM not like", value, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmIn(List<String> values) {
            addCriterion("management/total_income_TTM in", values, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("management/total_income_TTM not in", values, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("management/total_income_TTM between", value1, value2, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andManagementTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("management/total_income_TTM not between", value1, value2, "managementTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmIsNull() {
            addCriterion("finacial/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmIsNotNull() {
            addCriterion("finacial/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmEqualTo(String value) {
            addCriterion("finacial/total_income_TTM =", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("finacial/total_income_TTM <>", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmGreaterThan(String value) {
            addCriterion("finacial/total_income_TTM >", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("finacial/total_income_TTM >=", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmLessThan(String value) {
            addCriterion("finacial/total_income_TTM <", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("finacial/total_income_TTM <=", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmLike(String value) {
            addCriterion("finacial/total_income_TTM like", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmNotLike(String value) {
            addCriterion("finacial/total_income_TTM not like", value, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmIn(List<String> values) {
            addCriterion("finacial/total_income_TTM in", values, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("finacial/total_income_TTM not in", values, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("finacial/total_income_TTM between", value1, value2, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andFinacialTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("finacial/total_income_TTM not between", value1, value2, "finacialTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmIsNull() {
            addCriterion("asset_loss/total_income_TTM is null");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmIsNotNull() {
            addCriterion("asset_loss/total_income_TTM is not null");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmEqualTo(String value) {
            addCriterion("asset_loss/total_income_TTM =", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmNotEqualTo(String value) {
            addCriterion("asset_loss/total_income_TTM <>", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmGreaterThan(String value) {
            addCriterion("asset_loss/total_income_TTM >", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("asset_loss/total_income_TTM >=", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmLessThan(String value) {
            addCriterion("asset_loss/total_income_TTM <", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmLessThanOrEqualTo(String value) {
            addCriterion("asset_loss/total_income_TTM <=", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmLike(String value) {
            addCriterion("asset_loss/total_income_TTM like", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmNotLike(String value) {
            addCriterion("asset_loss/total_income_TTM not like", value, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmIn(List<String> values) {
            addCriterion("asset_loss/total_income_TTM in", values, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmNotIn(List<String> values) {
            addCriterion("asset_loss/total_income_TTM not in", values, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmBetween(String value1, String value2) {
            addCriterion("asset_loss/total_income_TTM between", value1, value2, "assetLossTotalIncomeTtm");
            return (Criteria) this;
        }

        public Criteria andAssetLossTotalIncomeTtmNotBetween(String value1, String value2) {
            addCriterion("asset_loss/total_income_TTM not between", value1, value2, "assetLossTotalIncomeTtm");
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