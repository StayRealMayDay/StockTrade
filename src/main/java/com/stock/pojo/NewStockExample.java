package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewStockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewStockExample() {
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

        public Criteria andNstockIdIsNull() {
            addCriterion("nstock_id is null");
            return (Criteria) this;
        }

        public Criteria andNstockIdIsNotNull() {
            addCriterion("nstock_id is not null");
            return (Criteria) this;
        }

        public Criteria andNstockIdEqualTo(Integer value) {
            addCriterion("nstock_id =", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdNotEqualTo(Integer value) {
            addCriterion("nstock_id <>", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdGreaterThan(Integer value) {
            addCriterion("nstock_id >", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("nstock_id >=", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdLessThan(Integer value) {
            addCriterion("nstock_id <", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdLessThanOrEqualTo(Integer value) {
            addCriterion("nstock_id <=", value, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdIn(List<Integer> values) {
            addCriterion("nstock_id in", values, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdNotIn(List<Integer> values) {
            addCriterion("nstock_id not in", values, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdBetween(Integer value1, Integer value2) {
            addCriterion("nstock_id between", value1, value2, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("nstock_id not between", value1, value2, "nstockId");
            return (Criteria) this;
        }

        public Criteria andNstockCodeIsNull() {
            addCriterion("nstock_code is null");
            return (Criteria) this;
        }

        public Criteria andNstockCodeIsNotNull() {
            addCriterion("nstock_code is not null");
            return (Criteria) this;
        }

        public Criteria andNstockCodeEqualTo(String value) {
            addCriterion("nstock_code =", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeNotEqualTo(String value) {
            addCriterion("nstock_code <>", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeGreaterThan(String value) {
            addCriterion("nstock_code >", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeGreaterThanOrEqualTo(String value) {
            addCriterion("nstock_code >=", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeLessThan(String value) {
            addCriterion("nstock_code <", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeLessThanOrEqualTo(String value) {
            addCriterion("nstock_code <=", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeLike(String value) {
            addCriterion("nstock_code like", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeNotLike(String value) {
            addCriterion("nstock_code not like", value, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeIn(List<String> values) {
            addCriterion("nstock_code in", values, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeNotIn(List<String> values) {
            addCriterion("nstock_code not in", values, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeBetween(String value1, String value2) {
            addCriterion("nstock_code between", value1, value2, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockCodeNotBetween(String value1, String value2) {
            addCriterion("nstock_code not between", value1, value2, "nstockCode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeIsNull() {
            addCriterion("nstock_apcode is null");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeIsNotNull() {
            addCriterion("nstock_apcode is not null");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeEqualTo(String value) {
            addCriterion("nstock_apcode =", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeNotEqualTo(String value) {
            addCriterion("nstock_apcode <>", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeGreaterThan(String value) {
            addCriterion("nstock_apcode >", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeGreaterThanOrEqualTo(String value) {
            addCriterion("nstock_apcode >=", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeLessThan(String value) {
            addCriterion("nstock_apcode <", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeLessThanOrEqualTo(String value) {
            addCriterion("nstock_apcode <=", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeLike(String value) {
            addCriterion("nstock_apcode like", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeNotLike(String value) {
            addCriterion("nstock_apcode not like", value, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeIn(List<String> values) {
            addCriterion("nstock_apcode in", values, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeNotIn(List<String> values) {
            addCriterion("nstock_apcode not in", values, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeBetween(String value1, String value2) {
            addCriterion("nstock_apcode between", value1, value2, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockApcodeNotBetween(String value1, String value2) {
            addCriterion("nstock_apcode not between", value1, value2, "nstockApcode");
            return (Criteria) this;
        }

        public Criteria andNstockNameIsNull() {
            addCriterion("nstock_name is null");
            return (Criteria) this;
        }

        public Criteria andNstockNameIsNotNull() {
            addCriterion("nstock_name is not null");
            return (Criteria) this;
        }

        public Criteria andNstockNameEqualTo(String value) {
            addCriterion("nstock_name =", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameNotEqualTo(String value) {
            addCriterion("nstock_name <>", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameGreaterThan(String value) {
            addCriterion("nstock_name >", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameGreaterThanOrEqualTo(String value) {
            addCriterion("nstock_name >=", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameLessThan(String value) {
            addCriterion("nstock_name <", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameLessThanOrEqualTo(String value) {
            addCriterion("nstock_name <=", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameLike(String value) {
            addCriterion("nstock_name like", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameNotLike(String value) {
            addCriterion("nstock_name not like", value, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameIn(List<String> values) {
            addCriterion("nstock_name in", values, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameNotIn(List<String> values) {
            addCriterion("nstock_name not in", values, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameBetween(String value1, String value2) {
            addCriterion("nstock_name between", value1, value2, "nstockName");
            return (Criteria) this;
        }

        public Criteria andNstockNameNotBetween(String value1, String value2) {
            addCriterion("nstock_name not between", value1, value2, "nstockName");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("apply_date is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("apply_date is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(String value) {
            addCriterion("apply_date =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(String value) {
            addCriterion("apply_date <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(String value) {
            addCriterion("apply_date >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(String value) {
            addCriterion("apply_date >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(String value) {
            addCriterion("apply_date <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(String value) {
            addCriterion("apply_date <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLike(String value) {
            addCriterion("apply_date like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotLike(String value) {
            addCriterion("apply_date not like", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<String> values) {
            addCriterion("apply_date in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<String> values) {
            addCriterion("apply_date not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(String value1, String value2) {
            addCriterion("apply_date between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(String value1, String value2) {
            addCriterion("apply_date not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(String value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(String value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(String value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(String value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(String value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(String value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLike(String value) {
            addCriterion("pay_date like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotLike(String value) {
            addCriterion("pay_date not like", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<String> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<String> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(String value1, String value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(String value1, String value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andListDateIsNull() {
            addCriterion("list_date is null");
            return (Criteria) this;
        }

        public Criteria andListDateIsNotNull() {
            addCriterion("list_date is not null");
            return (Criteria) this;
        }

        public Criteria andListDateEqualTo(String value) {
            addCriterion("list_date =", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotEqualTo(String value) {
            addCriterion("list_date <>", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThan(String value) {
            addCriterion("list_date >", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThanOrEqualTo(String value) {
            addCriterion("list_date >=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThan(String value) {
            addCriterion("list_date <", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThanOrEqualTo(String value) {
            addCriterion("list_date <=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLike(String value) {
            addCriterion("list_date like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotLike(String value) {
            addCriterion("list_date not like", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateIn(List<String> values) {
            addCriterion("list_date in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotIn(List<String> values) {
            addCriterion("list_date not in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateBetween(String value1, String value2) {
            addCriterion("list_date between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotBetween(String value1, String value2) {
            addCriterion("list_date not between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNull() {
            addCriterion("issue_price is null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIsNotNull() {
            addCriterion("issue_price is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePriceEqualTo(String value) {
            addCriterion("issue_price =", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotEqualTo(String value) {
            addCriterion("issue_price <>", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThan(String value) {
            addCriterion("issue_price >", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceGreaterThanOrEqualTo(String value) {
            addCriterion("issue_price >=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThan(String value) {
            addCriterion("issue_price <", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLessThanOrEqualTo(String value) {
            addCriterion("issue_price <=", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceLike(String value) {
            addCriterion("issue_price like", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotLike(String value) {
            addCriterion("issue_price not like", value, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceIn(List<String> values) {
            addCriterion("issue_price in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotIn(List<String> values) {
            addCriterion("issue_price not in", values, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceBetween(String value1, String value2) {
            addCriterion("issue_price between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePriceNotBetween(String value1, String value2) {
            addCriterion("issue_price not between", value1, value2, "issuePrice");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioIsNull() {
            addCriterion("issue_pe_ratio is null");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioIsNotNull() {
            addCriterion("issue_pe_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioEqualTo(String value) {
            addCriterion("issue_pe_ratio =", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioNotEqualTo(String value) {
            addCriterion("issue_pe_ratio <>", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioGreaterThan(String value) {
            addCriterion("issue_pe_ratio >", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioGreaterThanOrEqualTo(String value) {
            addCriterion("issue_pe_ratio >=", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioLessThan(String value) {
            addCriterion("issue_pe_ratio <", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioLessThanOrEqualTo(String value) {
            addCriterion("issue_pe_ratio <=", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioLike(String value) {
            addCriterion("issue_pe_ratio like", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioNotLike(String value) {
            addCriterion("issue_pe_ratio not like", value, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioIn(List<String> values) {
            addCriterion("issue_pe_ratio in", values, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioNotIn(List<String> values) {
            addCriterion("issue_pe_ratio not in", values, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioBetween(String value1, String value2) {
            addCriterion("issue_pe_ratio between", value1, value2, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssuePeRatioNotBetween(String value1, String value2) {
            addCriterion("issue_pe_ratio not between", value1, value2, "issuePeRatio");
            return (Criteria) this;
        }

        public Criteria andIssueTotalIsNull() {
            addCriterion("issue_total is null");
            return (Criteria) this;
        }

        public Criteria andIssueTotalIsNotNull() {
            addCriterion("issue_total is not null");
            return (Criteria) this;
        }

        public Criteria andIssueTotalEqualTo(String value) {
            addCriterion("issue_total =", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalNotEqualTo(String value) {
            addCriterion("issue_total <>", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalGreaterThan(String value) {
            addCriterion("issue_total >", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalGreaterThanOrEqualTo(String value) {
            addCriterion("issue_total >=", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalLessThan(String value) {
            addCriterion("issue_total <", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalLessThanOrEqualTo(String value) {
            addCriterion("issue_total <=", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalLike(String value) {
            addCriterion("issue_total like", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalNotLike(String value) {
            addCriterion("issue_total not like", value, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalIn(List<String> values) {
            addCriterion("issue_total in", values, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalNotIn(List<String> values) {
            addCriterion("issue_total not in", values, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalBetween(String value1, String value2) {
            addCriterion("issue_total between", value1, value2, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIssueTotalNotBetween(String value1, String value2) {
            addCriterion("issue_total not between", value1, value2, "issueTotal");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioIsNull() {
            addCriterion("industry_pe_ratio is null");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioIsNotNull() {
            addCriterion("industry_pe_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioEqualTo(String value) {
            addCriterion("industry_pe_ratio =", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioNotEqualTo(String value) {
            addCriterion("industry_pe_ratio <>", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioGreaterThan(String value) {
            addCriterion("industry_pe_ratio >", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioGreaterThanOrEqualTo(String value) {
            addCriterion("industry_pe_ratio >=", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioLessThan(String value) {
            addCriterion("industry_pe_ratio <", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioLessThanOrEqualTo(String value) {
            addCriterion("industry_pe_ratio <=", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioLike(String value) {
            addCriterion("industry_pe_ratio like", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioNotLike(String value) {
            addCriterion("industry_pe_ratio not like", value, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioIn(List<String> values) {
            addCriterion("industry_pe_ratio in", values, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioNotIn(List<String> values) {
            addCriterion("industry_pe_ratio not in", values, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioBetween(String value1, String value2) {
            addCriterion("industry_pe_ratio between", value1, value2, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andIndustryPeRatioNotBetween(String value1, String value2) {
            addCriterion("industry_pe_ratio not between", value1, value2, "industryPeRatio");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitIsNull() {
            addCriterion("apply_uplimit is null");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitIsNotNull() {
            addCriterion("apply_uplimit is not null");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitEqualTo(String value) {
            addCriterion("apply_uplimit =", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitNotEqualTo(String value) {
            addCriterion("apply_uplimit <>", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitGreaterThan(String value) {
            addCriterion("apply_uplimit >", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitGreaterThanOrEqualTo(String value) {
            addCriterion("apply_uplimit >=", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitLessThan(String value) {
            addCriterion("apply_uplimit <", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitLessThanOrEqualTo(String value) {
            addCriterion("apply_uplimit <=", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitLike(String value) {
            addCriterion("apply_uplimit like", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitNotLike(String value) {
            addCriterion("apply_uplimit not like", value, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitIn(List<String> values) {
            addCriterion("apply_uplimit in", values, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitNotIn(List<String> values) {
            addCriterion("apply_uplimit not in", values, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitBetween(String value1, String value2) {
            addCriterion("apply_uplimit between", value1, value2, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andApplyUplimitNotBetween(String value1, String value2) {
            addCriterion("apply_uplimit not between", value1, value2, "applyUplimit");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueIsNull() {
            addCriterion("top_apply_mvalue is null");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueIsNotNull() {
            addCriterion("top_apply_mvalue is not null");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueEqualTo(String value) {
            addCriterion("top_apply_mvalue =", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueNotEqualTo(String value) {
            addCriterion("top_apply_mvalue <>", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueGreaterThan(String value) {
            addCriterion("top_apply_mvalue >", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueGreaterThanOrEqualTo(String value) {
            addCriterion("top_apply_mvalue >=", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueLessThan(String value) {
            addCriterion("top_apply_mvalue <", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueLessThanOrEqualTo(String value) {
            addCriterion("top_apply_mvalue <=", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueLike(String value) {
            addCriterion("top_apply_mvalue like", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueNotLike(String value) {
            addCriterion("top_apply_mvalue not like", value, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueIn(List<String> values) {
            addCriterion("top_apply_mvalue in", values, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueNotIn(List<String> values) {
            addCriterion("top_apply_mvalue not in", values, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueBetween(String value1, String value2) {
            addCriterion("top_apply_mvalue between", value1, value2, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andTopApplyMvalueNotBetween(String value1, String value2) {
            addCriterion("top_apply_mvalue not between", value1, value2, "topApplyMvalue");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioIsNull() {
            addCriterion("center_check_ratio is null");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioIsNotNull() {
            addCriterion("center_check_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioEqualTo(String value) {
            addCriterion("center_check_ratio =", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioNotEqualTo(String value) {
            addCriterion("center_check_ratio <>", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioGreaterThan(String value) {
            addCriterion("center_check_ratio >", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioGreaterThanOrEqualTo(String value) {
            addCriterion("center_check_ratio >=", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioLessThan(String value) {
            addCriterion("center_check_ratio <", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioLessThanOrEqualTo(String value) {
            addCriterion("center_check_ratio <=", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioLike(String value) {
            addCriterion("center_check_ratio like", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioNotLike(String value) {
            addCriterion("center_check_ratio not like", value, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioIn(List<String> values) {
            addCriterion("center_check_ratio in", values, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioNotIn(List<String> values) {
            addCriterion("center_check_ratio not in", values, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioBetween(String value1, String value2) {
            addCriterion("center_check_ratio between", value1, value2, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckRatioNotBetween(String value1, String value2) {
            addCriterion("center_check_ratio not between", value1, value2, "centerCheckRatio");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumIsNull() {
            addCriterion("center_check_num is null");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumIsNotNull() {
            addCriterion("center_check_num is not null");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumEqualTo(String value) {
            addCriterion("center_check_num =", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumNotEqualTo(String value) {
            addCriterion("center_check_num <>", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumGreaterThan(String value) {
            addCriterion("center_check_num >", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumGreaterThanOrEqualTo(String value) {
            addCriterion("center_check_num >=", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumLessThan(String value) {
            addCriterion("center_check_num <", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumLessThanOrEqualTo(String value) {
            addCriterion("center_check_num <=", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumLike(String value) {
            addCriterion("center_check_num like", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumNotLike(String value) {
            addCriterion("center_check_num not like", value, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumIn(List<String> values) {
            addCriterion("center_check_num in", values, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumNotIn(List<String> values) {
            addCriterion("center_check_num not in", values, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumBetween(String value1, String value2) {
            addCriterion("center_check_num between", value1, value2, "centerCheckNum");
            return (Criteria) this;
        }

        public Criteria andCenterCheckNumNotBetween(String value1, String value2) {
            addCriterion("center_check_num not between", value1, value2, "centerCheckNum");
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