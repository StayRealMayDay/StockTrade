package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class RankandpredictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RankandpredictExample() {
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

        public Criteria andRandpIdIsNull() {
            addCriterion("RandP_id is null");
            return (Criteria) this;
        }

        public Criteria andRandpIdIsNotNull() {
            addCriterion("RandP_id is not null");
            return (Criteria) this;
        }

        public Criteria andRandpIdEqualTo(Integer value) {
            addCriterion("RandP_id =", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdNotEqualTo(Integer value) {
            addCriterion("RandP_id <>", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdGreaterThan(Integer value) {
            addCriterion("RandP_id >", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RandP_id >=", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdLessThan(Integer value) {
            addCriterion("RandP_id <", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdLessThanOrEqualTo(Integer value) {
            addCriterion("RandP_id <=", value, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdIn(List<Integer> values) {
            addCriterion("RandP_id in", values, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdNotIn(List<Integer> values) {
            addCriterion("RandP_id not in", values, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdBetween(Integer value1, Integer value2) {
            addCriterion("RandP_id between", value1, value2, "randpId");
            return (Criteria) this;
        }

        public Criteria andRandpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("RandP_id not between", value1, value2, "randpId");
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

        public Criteria andPredictEveryProfitIsNull() {
            addCriterion("predict_every_profit is null");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitIsNotNull() {
            addCriterion("predict_every_profit is not null");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitEqualTo(String value) {
            addCriterion("predict_every_profit =", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitNotEqualTo(String value) {
            addCriterion("predict_every_profit <>", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitGreaterThan(String value) {
            addCriterion("predict_every_profit >", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitGreaterThanOrEqualTo(String value) {
            addCriterion("predict_every_profit >=", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitLessThan(String value) {
            addCriterion("predict_every_profit <", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitLessThanOrEqualTo(String value) {
            addCriterion("predict_every_profit <=", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitLike(String value) {
            addCriterion("predict_every_profit like", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitNotLike(String value) {
            addCriterion("predict_every_profit not like", value, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitIn(List<String> values) {
            addCriterion("predict_every_profit in", values, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitNotIn(List<String> values) {
            addCriterion("predict_every_profit not in", values, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitBetween(String value1, String value2) {
            addCriterion("predict_every_profit between", value1, value2, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictEveryProfitNotBetween(String value1, String value2) {
            addCriterion("predict_every_profit not between", value1, value2, "predictEveryProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitIsNull() {
            addCriterion("predict_net_profit is null");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitIsNotNull() {
            addCriterion("predict_net_profit is not null");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitEqualTo(String value) {
            addCriterion("predict_net_profit =", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitNotEqualTo(String value) {
            addCriterion("predict_net_profit <>", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitGreaterThan(String value) {
            addCriterion("predict_net_profit >", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitGreaterThanOrEqualTo(String value) {
            addCriterion("predict_net_profit >=", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitLessThan(String value) {
            addCriterion("predict_net_profit <", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitLessThanOrEqualTo(String value) {
            addCriterion("predict_net_profit <=", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitLike(String value) {
            addCriterion("predict_net_profit like", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitNotLike(String value) {
            addCriterion("predict_net_profit not like", value, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitIn(List<String> values) {
            addCriterion("predict_net_profit in", values, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitNotIn(List<String> values) {
            addCriterion("predict_net_profit not in", values, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitBetween(String value1, String value2) {
            addCriterion("predict_net_profit between", value1, value2, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictNetProfitNotBetween(String value1, String value2) {
            addCriterion("predict_net_profit not between", value1, value2, "predictNetProfit");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeIsNull() {
            addCriterion("predict_main_income is null");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeIsNotNull() {
            addCriterion("predict_main_income is not null");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeEqualTo(String value) {
            addCriterion("predict_main_income =", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeNotEqualTo(String value) {
            addCriterion("predict_main_income <>", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeGreaterThan(String value) {
            addCriterion("predict_main_income >", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_main_income >=", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeLessThan(String value) {
            addCriterion("predict_main_income <", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeLessThanOrEqualTo(String value) {
            addCriterion("predict_main_income <=", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeLike(String value) {
            addCriterion("predict_main_income like", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeNotLike(String value) {
            addCriterion("predict_main_income not like", value, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeIn(List<String> values) {
            addCriterion("predict_main_income in", values, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeNotIn(List<String> values) {
            addCriterion("predict_main_income not in", values, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeBetween(String value1, String value2) {
            addCriterion("predict_main_income between", value1, value2, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictMainIncomeNotBetween(String value1, String value2) {
            addCriterion("predict_main_income not between", value1, value2, "predictMainIncome");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(String value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(String value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(String value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(String value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(String value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLike(String value) {
            addCriterion("predict_time like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotLike(String value) {
            addCriterion("predict_time not like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<String> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<String> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(String value1, String value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(String value1, String value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherIsNull() {
            addCriterion("predict_researcher is null");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherIsNotNull() {
            addCriterion("predict_researcher is not null");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherEqualTo(String value) {
            addCriterion("predict_researcher =", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherNotEqualTo(String value) {
            addCriterion("predict_researcher <>", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherGreaterThan(String value) {
            addCriterion("predict_researcher >", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherGreaterThanOrEqualTo(String value) {
            addCriterion("predict_researcher >=", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherLessThan(String value) {
            addCriterion("predict_researcher <", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherLessThanOrEqualTo(String value) {
            addCriterion("predict_researcher <=", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherLike(String value) {
            addCriterion("predict_researcher like", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherNotLike(String value) {
            addCriterion("predict_researcher not like", value, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherIn(List<String> values) {
            addCriterion("predict_researcher in", values, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherNotIn(List<String> values) {
            addCriterion("predict_researcher not in", values, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherBetween(String value1, String value2) {
            addCriterion("predict_researcher between", value1, value2, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andPredictResearcherNotBetween(String value1, String value2) {
            addCriterion("predict_researcher not between", value1, value2, "predictResearcher");
            return (Criteria) this;
        }

        public Criteria andRankContentIsNull() {
            addCriterion("rank_content is null");
            return (Criteria) this;
        }

        public Criteria andRankContentIsNotNull() {
            addCriterion("rank_content is not null");
            return (Criteria) this;
        }

        public Criteria andRankContentEqualTo(String value) {
            addCriterion("rank_content =", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentNotEqualTo(String value) {
            addCriterion("rank_content <>", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentGreaterThan(String value) {
            addCriterion("rank_content >", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentGreaterThanOrEqualTo(String value) {
            addCriterion("rank_content >=", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentLessThan(String value) {
            addCriterion("rank_content <", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentLessThanOrEqualTo(String value) {
            addCriterion("rank_content <=", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentLike(String value) {
            addCriterion("rank_content like", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentNotLike(String value) {
            addCriterion("rank_content not like", value, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentIn(List<String> values) {
            addCriterion("rank_content in", values, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentNotIn(List<String> values) {
            addCriterion("rank_content not in", values, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentBetween(String value1, String value2) {
            addCriterion("rank_content between", value1, value2, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankContentNotBetween(String value1, String value2) {
            addCriterion("rank_content not between", value1, value2, "rankContent");
            return (Criteria) this;
        }

        public Criteria andRankTimeIsNull() {
            addCriterion("rank_time is null");
            return (Criteria) this;
        }

        public Criteria andRankTimeIsNotNull() {
            addCriterion("rank_time is not null");
            return (Criteria) this;
        }

        public Criteria andRankTimeEqualTo(String value) {
            addCriterion("rank_time =", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotEqualTo(String value) {
            addCriterion("rank_time <>", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeGreaterThan(String value) {
            addCriterion("rank_time >", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeGreaterThanOrEqualTo(String value) {
            addCriterion("rank_time >=", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLessThan(String value) {
            addCriterion("rank_time <", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLessThanOrEqualTo(String value) {
            addCriterion("rank_time <=", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeLike(String value) {
            addCriterion("rank_time like", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotLike(String value) {
            addCriterion("rank_time not like", value, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeIn(List<String> values) {
            addCriterion("rank_time in", values, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotIn(List<String> values) {
            addCriterion("rank_time not in", values, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeBetween(String value1, String value2) {
            addCriterion("rank_time between", value1, value2, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankTimeNotBetween(String value1, String value2) {
            addCriterion("rank_time not between", value1, value2, "rankTime");
            return (Criteria) this;
        }

        public Criteria andRankResearcherIsNull() {
            addCriterion("rank_researcher is null");
            return (Criteria) this;
        }

        public Criteria andRankResearcherIsNotNull() {
            addCriterion("rank_researcher is not null");
            return (Criteria) this;
        }

        public Criteria andRankResearcherEqualTo(String value) {
            addCriterion("rank_researcher =", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherNotEqualTo(String value) {
            addCriterion("rank_researcher <>", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherGreaterThan(String value) {
            addCriterion("rank_researcher >", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherGreaterThanOrEqualTo(String value) {
            addCriterion("rank_researcher >=", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherLessThan(String value) {
            addCriterion("rank_researcher <", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherLessThanOrEqualTo(String value) {
            addCriterion("rank_researcher <=", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherLike(String value) {
            addCriterion("rank_researcher like", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherNotLike(String value) {
            addCriterion("rank_researcher not like", value, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherIn(List<String> values) {
            addCriterion("rank_researcher in", values, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherNotIn(List<String> values) {
            addCriterion("rank_researcher not in", values, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherBetween(String value1, String value2) {
            addCriterion("rank_researcher between", value1, value2, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankResearcherNotBetween(String value1, String value2) {
            addCriterion("rank_researcher not between", value1, value2, "rankResearcher");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionIsNull() {
            addCriterion("rank_institution is null");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionIsNotNull() {
            addCriterion("rank_institution is not null");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionEqualTo(String value) {
            addCriterion("rank_institution =", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionNotEqualTo(String value) {
            addCriterion("rank_institution <>", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionGreaterThan(String value) {
            addCriterion("rank_institution >", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionGreaterThanOrEqualTo(String value) {
            addCriterion("rank_institution >=", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionLessThan(String value) {
            addCriterion("rank_institution <", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionLessThanOrEqualTo(String value) {
            addCriterion("rank_institution <=", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionLike(String value) {
            addCriterion("rank_institution like", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionNotLike(String value) {
            addCriterion("rank_institution not like", value, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionIn(List<String> values) {
            addCriterion("rank_institution in", values, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionNotIn(List<String> values) {
            addCriterion("rank_institution not in", values, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionBetween(String value1, String value2) {
            addCriterion("rank_institution between", value1, value2, "rankInstitution");
            return (Criteria) this;
        }

        public Criteria andRankInstitutionNotBetween(String value1, String value2) {
            addCriterion("rank_institution not between", value1, value2, "rankInstitution");
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