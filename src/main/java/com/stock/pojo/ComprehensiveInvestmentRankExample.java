package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComprehensiveInvestmentRankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComprehensiveInvestmentRankExample() {
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

        public Criteria andSixRankCharIsNull() {
            addCriterion("six_rank_char is null");
            return (Criteria) this;
        }

        public Criteria andSixRankCharIsNotNull() {
            addCriterion("six_rank_char is not null");
            return (Criteria) this;
        }

        public Criteria andSixRankCharEqualTo(String value) {
            addCriterion("six_rank_char =", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharNotEqualTo(String value) {
            addCriterion("six_rank_char <>", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharGreaterThan(String value) {
            addCriterion("six_rank_char >", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharGreaterThanOrEqualTo(String value) {
            addCriterion("six_rank_char >=", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharLessThan(String value) {
            addCriterion("six_rank_char <", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharLessThanOrEqualTo(String value) {
            addCriterion("six_rank_char <=", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharLike(String value) {
            addCriterion("six_rank_char like", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharNotLike(String value) {
            addCriterion("six_rank_char not like", value, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharIn(List<String> values) {
            addCriterion("six_rank_char in", values, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharNotIn(List<String> values) {
            addCriterion("six_rank_char not in", values, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharBetween(String value1, String value2) {
            addCriterion("six_rank_char between", value1, value2, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankCharNotBetween(String value1, String value2) {
            addCriterion("six_rank_char not between", value1, value2, "sixRankChar");
            return (Criteria) this;
        }

        public Criteria andSixRankNumIsNull() {
            addCriterion("six_rank_num is null");
            return (Criteria) this;
        }

        public Criteria andSixRankNumIsNotNull() {
            addCriterion("six_rank_num is not null");
            return (Criteria) this;
        }

        public Criteria andSixRankNumEqualTo(String value) {
            addCriterion("six_rank_num =", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumNotEqualTo(String value) {
            addCriterion("six_rank_num <>", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumGreaterThan(String value) {
            addCriterion("six_rank_num >", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumGreaterThanOrEqualTo(String value) {
            addCriterion("six_rank_num >=", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumLessThan(String value) {
            addCriterion("six_rank_num <", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumLessThanOrEqualTo(String value) {
            addCriterion("six_rank_num <=", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumLike(String value) {
            addCriterion("six_rank_num like", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumNotLike(String value) {
            addCriterion("six_rank_num not like", value, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumIn(List<String> values) {
            addCriterion("six_rank_num in", values, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumNotIn(List<String> values) {
            addCriterion("six_rank_num not in", values, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumBetween(String value1, String value2) {
            addCriterion("six_rank_num between", value1, value2, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andSixRankNumNotBetween(String value1, String value2) {
            addCriterion("six_rank_num not between", value1, value2, "sixRankNum");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountIsNull() {
            addCriterion("institution_count is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountIsNotNull() {
            addCriterion("institution_count is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountEqualTo(String value) {
            addCriterion("institution_count =", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountNotEqualTo(String value) {
            addCriterion("institution_count <>", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountGreaterThan(String value) {
            addCriterion("institution_count >", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountGreaterThanOrEqualTo(String value) {
            addCriterion("institution_count >=", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountLessThan(String value) {
            addCriterion("institution_count <", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountLessThanOrEqualTo(String value) {
            addCriterion("institution_count <=", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountLike(String value) {
            addCriterion("institution_count like", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountNotLike(String value) {
            addCriterion("institution_count not like", value, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountIn(List<String> values) {
            addCriterion("institution_count in", values, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountNotIn(List<String> values) {
            addCriterion("institution_count not in", values, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountBetween(String value1, String value2) {
            addCriterion("institution_count between", value1, value2, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andInstitutionCountNotBetween(String value1, String value2) {
            addCriterion("institution_count not between", value1, value2, "institutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountIsNull() {
            addCriterion("up_institution_count is null");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountIsNotNull() {
            addCriterion("up_institution_count is not null");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountEqualTo(String value) {
            addCriterion("up_institution_count =", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountNotEqualTo(String value) {
            addCriterion("up_institution_count <>", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountGreaterThan(String value) {
            addCriterion("up_institution_count >", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountGreaterThanOrEqualTo(String value) {
            addCriterion("up_institution_count >=", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountLessThan(String value) {
            addCriterion("up_institution_count <", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountLessThanOrEqualTo(String value) {
            addCriterion("up_institution_count <=", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountLike(String value) {
            addCriterion("up_institution_count like", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountNotLike(String value) {
            addCriterion("up_institution_count not like", value, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountIn(List<String> values) {
            addCriterion("up_institution_count in", values, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountNotIn(List<String> values) {
            addCriterion("up_institution_count not in", values, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountBetween(String value1, String value2) {
            addCriterion("up_institution_count between", value1, value2, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andUpInstitutionCountNotBetween(String value1, String value2) {
            addCriterion("up_institution_count not between", value1, value2, "upInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountIsNull() {
            addCriterion("down_institution_count is null");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountIsNotNull() {
            addCriterion("down_institution_count is not null");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountEqualTo(String value) {
            addCriterion("down_institution_count =", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountNotEqualTo(String value) {
            addCriterion("down_institution_count <>", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountGreaterThan(String value) {
            addCriterion("down_institution_count >", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountGreaterThanOrEqualTo(String value) {
            addCriterion("down_institution_count >=", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountLessThan(String value) {
            addCriterion("down_institution_count <", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountLessThanOrEqualTo(String value) {
            addCriterion("down_institution_count <=", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountLike(String value) {
            addCriterion("down_institution_count like", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountNotLike(String value) {
            addCriterion("down_institution_count not like", value, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountIn(List<String> values) {
            addCriterion("down_institution_count in", values, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountNotIn(List<String> values) {
            addCriterion("down_institution_count not in", values, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountBetween(String value1, String value2) {
            addCriterion("down_institution_count between", value1, value2, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andDownInstitutionCountNotBetween(String value1, String value2) {
            addCriterion("down_institution_count not between", value1, value2, "downInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountIsNull() {
            addCriterion("hold_institution_count is null");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountIsNotNull() {
            addCriterion("hold_institution_count is not null");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountEqualTo(String value) {
            addCriterion("hold_institution_count =", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountNotEqualTo(String value) {
            addCriterion("hold_institution_count <>", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountGreaterThan(String value) {
            addCriterion("hold_institution_count >", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountGreaterThanOrEqualTo(String value) {
            addCriterion("hold_institution_count >=", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountLessThan(String value) {
            addCriterion("hold_institution_count <", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountLessThanOrEqualTo(String value) {
            addCriterion("hold_institution_count <=", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountLike(String value) {
            addCriterion("hold_institution_count like", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountNotLike(String value) {
            addCriterion("hold_institution_count not like", value, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountIn(List<String> values) {
            addCriterion("hold_institution_count in", values, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountNotIn(List<String> values) {
            addCriterion("hold_institution_count not in", values, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountBetween(String value1, String value2) {
            addCriterion("hold_institution_count between", value1, value2, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andHoldInstitutionCountNotBetween(String value1, String value2) {
            addCriterion("hold_institution_count not between", value1, value2, "holdInstitutionCount");
            return (Criteria) this;
        }

        public Criteria andSixBuyIsNull() {
            addCriterion("six_buy is null");
            return (Criteria) this;
        }

        public Criteria andSixBuyIsNotNull() {
            addCriterion("six_buy is not null");
            return (Criteria) this;
        }

        public Criteria andSixBuyEqualTo(String value) {
            addCriterion("six_buy =", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyNotEqualTo(String value) {
            addCriterion("six_buy <>", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyGreaterThan(String value) {
            addCriterion("six_buy >", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyGreaterThanOrEqualTo(String value) {
            addCriterion("six_buy >=", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyLessThan(String value) {
            addCriterion("six_buy <", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyLessThanOrEqualTo(String value) {
            addCriterion("six_buy <=", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyLike(String value) {
            addCriterion("six_buy like", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyNotLike(String value) {
            addCriterion("six_buy not like", value, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyIn(List<String> values) {
            addCriterion("six_buy in", values, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyNotIn(List<String> values) {
            addCriterion("six_buy not in", values, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyBetween(String value1, String value2) {
            addCriterion("six_buy between", value1, value2, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixBuyNotBetween(String value1, String value2) {
            addCriterion("six_buy not between", value1, value2, "sixBuy");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceIsNull() {
            addCriterion("six_increace is null");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceIsNotNull() {
            addCriterion("six_increace is not null");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceEqualTo(String value) {
            addCriterion("six_increace =", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceNotEqualTo(String value) {
            addCriterion("six_increace <>", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceGreaterThan(String value) {
            addCriterion("six_increace >", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceGreaterThanOrEqualTo(String value) {
            addCriterion("six_increace >=", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceLessThan(String value) {
            addCriterion("six_increace <", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceLessThanOrEqualTo(String value) {
            addCriterion("six_increace <=", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceLike(String value) {
            addCriterion("six_increace like", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceNotLike(String value) {
            addCriterion("six_increace not like", value, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceIn(List<String> values) {
            addCriterion("six_increace in", values, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceNotIn(List<String> values) {
            addCriterion("six_increace not in", values, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceBetween(String value1, String value2) {
            addCriterion("six_increace between", value1, value2, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixIncreaceNotBetween(String value1, String value2) {
            addCriterion("six_increace not between", value1, value2, "sixIncreace");
            return (Criteria) this;
        }

        public Criteria andSixNeuterIsNull() {
            addCriterion("six_neuter is null");
            return (Criteria) this;
        }

        public Criteria andSixNeuterIsNotNull() {
            addCriterion("six_neuter is not null");
            return (Criteria) this;
        }

        public Criteria andSixNeuterEqualTo(String value) {
            addCriterion("six_neuter =", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterNotEqualTo(String value) {
            addCriterion("six_neuter <>", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterGreaterThan(String value) {
            addCriterion("six_neuter >", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterGreaterThanOrEqualTo(String value) {
            addCriterion("six_neuter >=", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterLessThan(String value) {
            addCriterion("six_neuter <", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterLessThanOrEqualTo(String value) {
            addCriterion("six_neuter <=", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterLike(String value) {
            addCriterion("six_neuter like", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterNotLike(String value) {
            addCriterion("six_neuter not like", value, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterIn(List<String> values) {
            addCriterion("six_neuter in", values, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterNotIn(List<String> values) {
            addCriterion("six_neuter not in", values, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterBetween(String value1, String value2) {
            addCriterion("six_neuter between", value1, value2, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixNeuterNotBetween(String value1, String value2) {
            addCriterion("six_neuter not between", value1, value2, "sixNeuter");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceIsNull() {
            addCriterion("six_decreace is null");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceIsNotNull() {
            addCriterion("six_decreace is not null");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceEqualTo(String value) {
            addCriterion("six_decreace =", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceNotEqualTo(String value) {
            addCriterion("six_decreace <>", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceGreaterThan(String value) {
            addCriterion("six_decreace >", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceGreaterThanOrEqualTo(String value) {
            addCriterion("six_decreace >=", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceLessThan(String value) {
            addCriterion("six_decreace <", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceLessThanOrEqualTo(String value) {
            addCriterion("six_decreace <=", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceLike(String value) {
            addCriterion("six_decreace like", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceNotLike(String value) {
            addCriterion("six_decreace not like", value, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceIn(List<String> values) {
            addCriterion("six_decreace in", values, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceNotIn(List<String> values) {
            addCriterion("six_decreace not in", values, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceBetween(String value1, String value2) {
            addCriterion("six_decreace between", value1, value2, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixDecreaceNotBetween(String value1, String value2) {
            addCriterion("six_decreace not between", value1, value2, "sixDecreace");
            return (Criteria) this;
        }

        public Criteria andSixSellIsNull() {
            addCriterion("six_sell is null");
            return (Criteria) this;
        }

        public Criteria andSixSellIsNotNull() {
            addCriterion("six_sell is not null");
            return (Criteria) this;
        }

        public Criteria andSixSellEqualTo(String value) {
            addCriterion("six_sell =", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellNotEqualTo(String value) {
            addCriterion("six_sell <>", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellGreaterThan(String value) {
            addCriterion("six_sell >", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellGreaterThanOrEqualTo(String value) {
            addCriterion("six_sell >=", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellLessThan(String value) {
            addCriterion("six_sell <", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellLessThanOrEqualTo(String value) {
            addCriterion("six_sell <=", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellLike(String value) {
            addCriterion("six_sell like", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellNotLike(String value) {
            addCriterion("six_sell not like", value, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellIn(List<String> values) {
            addCriterion("six_sell in", values, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellNotIn(List<String> values) {
            addCriterion("six_sell not in", values, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellBetween(String value1, String value2) {
            addCriterion("six_sell between", value1, value2, "sixSell");
            return (Criteria) this;
        }

        public Criteria andSixSellNotBetween(String value1, String value2) {
            addCriterion("six_sell not between", value1, value2, "sixSell");
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