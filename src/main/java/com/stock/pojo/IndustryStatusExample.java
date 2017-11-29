package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class IndustryStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndustryStatusExample() {
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

        public Criteria andIndustryNameIsNull() {
            addCriterion("industry_name is null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIsNotNull() {
            addCriterion("industry_name is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryNameEqualTo(String value) {
            addCriterion("industry_name =", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotEqualTo(String value) {
            addCriterion("industry_name <>", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThan(String value) {
            addCriterion("industry_name >", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameGreaterThanOrEqualTo(String value) {
            addCriterion("industry_name >=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThan(String value) {
            addCriterion("industry_name <", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLessThanOrEqualTo(String value) {
            addCriterion("industry_name <=", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameLike(String value) {
            addCriterion("industry_name like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotLike(String value) {
            addCriterion("industry_name not like", value, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameIn(List<String> values) {
            addCriterion("industry_name in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotIn(List<String> values) {
            addCriterion("industry_name not in", values, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameBetween(String value1, String value2) {
            addCriterion("industry_name between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andIndustryNameNotBetween(String value1, String value2) {
            addCriterion("industry_name not between", value1, value2, "industryName");
            return (Criteria) this;
        }

        public Criteria andPeIsNull() {
            addCriterion("PE is null");
            return (Criteria) this;
        }

        public Criteria andPeIsNotNull() {
            addCriterion("PE is not null");
            return (Criteria) this;
        }

        public Criteria andPeEqualTo(String value) {
            addCriterion("PE =", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotEqualTo(String value) {
            addCriterion("PE <>", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThan(String value) {
            addCriterion("PE >", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeGreaterThanOrEqualTo(String value) {
            addCriterion("PE >=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThan(String value) {
            addCriterion("PE <", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLessThanOrEqualTo(String value) {
            addCriterion("PE <=", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeLike(String value) {
            addCriterion("PE like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotLike(String value) {
            addCriterion("PE not like", value, "pe");
            return (Criteria) this;
        }

        public Criteria andPeIn(List<String> values) {
            addCriterion("PE in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotIn(List<String> values) {
            addCriterion("PE not in", values, "pe");
            return (Criteria) this;
        }

        public Criteria andPeBetween(String value1, String value2) {
            addCriterion("PE between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andPeNotBetween(String value1, String value2) {
            addCriterion("PE not between", value1, value2, "pe");
            return (Criteria) this;
        }

        public Criteria andRoeAveIsNull() {
            addCriterion("ROE_ave is null");
            return (Criteria) this;
        }

        public Criteria andRoeAveIsNotNull() {
            addCriterion("ROE_ave is not null");
            return (Criteria) this;
        }

        public Criteria andRoeAveEqualTo(String value) {
            addCriterion("ROE_ave =", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveNotEqualTo(String value) {
            addCriterion("ROE_ave <>", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveGreaterThan(String value) {
            addCriterion("ROE_ave >", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveGreaterThanOrEqualTo(String value) {
            addCriterion("ROE_ave >=", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveLessThan(String value) {
            addCriterion("ROE_ave <", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveLessThanOrEqualTo(String value) {
            addCriterion("ROE_ave <=", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveLike(String value) {
            addCriterion("ROE_ave like", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveNotLike(String value) {
            addCriterion("ROE_ave not like", value, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveIn(List<String> values) {
            addCriterion("ROE_ave in", values, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveNotIn(List<String> values) {
            addCriterion("ROE_ave not in", values, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveBetween(String value1, String value2) {
            addCriterion("ROE_ave between", value1, value2, "roeAve");
            return (Criteria) this;
        }

        public Criteria andRoeAveNotBetween(String value1, String value2) {
            addCriterion("ROE_ave not between", value1, value2, "roeAve");
            return (Criteria) this;
        }

        public Criteria andPeTtmIsNull() {
            addCriterion("PE_ttm is null");
            return (Criteria) this;
        }

        public Criteria andPeTtmIsNotNull() {
            addCriterion("PE_ttm is not null");
            return (Criteria) this;
        }

        public Criteria andPeTtmEqualTo(String value) {
            addCriterion("PE_ttm =", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotEqualTo(String value) {
            addCriterion("PE_ttm <>", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmGreaterThan(String value) {
            addCriterion("PE_ttm >", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmGreaterThanOrEqualTo(String value) {
            addCriterion("PE_ttm >=", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLessThan(String value) {
            addCriterion("PE_ttm <", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLessThanOrEqualTo(String value) {
            addCriterion("PE_ttm <=", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmLike(String value) {
            addCriterion("PE_ttm like", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotLike(String value) {
            addCriterion("PE_ttm not like", value, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmIn(List<String> values) {
            addCriterion("PE_ttm in", values, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotIn(List<String> values) {
            addCriterion("PE_ttm not in", values, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmBetween(String value1, String value2) {
            addCriterion("PE_ttm between", value1, value2, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeTtmNotBetween(String value1, String value2) {
            addCriterion("PE_ttm not between", value1, value2, "peTtm");
            return (Criteria) this;
        }

        public Criteria andPeForecastIsNull() {
            addCriterion("PE_forecast is null");
            return (Criteria) this;
        }

        public Criteria andPeForecastIsNotNull() {
            addCriterion("PE_forecast is not null");
            return (Criteria) this;
        }

        public Criteria andPeForecastEqualTo(String value) {
            addCriterion("PE_forecast =", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastNotEqualTo(String value) {
            addCriterion("PE_forecast <>", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastGreaterThan(String value) {
            addCriterion("PE_forecast >", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastGreaterThanOrEqualTo(String value) {
            addCriterion("PE_forecast >=", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastLessThan(String value) {
            addCriterion("PE_forecast <", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastLessThanOrEqualTo(String value) {
            addCriterion("PE_forecast <=", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastLike(String value) {
            addCriterion("PE_forecast like", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastNotLike(String value) {
            addCriterion("PE_forecast not like", value, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastIn(List<String> values) {
            addCriterion("PE_forecast in", values, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastNotIn(List<String> values) {
            addCriterion("PE_forecast not in", values, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastBetween(String value1, String value2) {
            addCriterion("PE_forecast between", value1, value2, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPeForecastNotBetween(String value1, String value2) {
            addCriterion("PE_forecast not between", value1, value2, "peForecast");
            return (Criteria) this;
        }

        public Criteria andPbIsNull() {
            addCriterion("PB is null");
            return (Criteria) this;
        }

        public Criteria andPbIsNotNull() {
            addCriterion("PB is not null");
            return (Criteria) this;
        }

        public Criteria andPbEqualTo(String value) {
            addCriterion("PB =", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotEqualTo(String value) {
            addCriterion("PB <>", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThan(String value) {
            addCriterion("PB >", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbGreaterThanOrEqualTo(String value) {
            addCriterion("PB >=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThan(String value) {
            addCriterion("PB <", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLessThanOrEqualTo(String value) {
            addCriterion("PB <=", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbLike(String value) {
            addCriterion("PB like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotLike(String value) {
            addCriterion("PB not like", value, "pb");
            return (Criteria) this;
        }

        public Criteria andPbIn(List<String> values) {
            addCriterion("PB in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotIn(List<String> values) {
            addCriterion("PB not in", values, "pb");
            return (Criteria) this;
        }

        public Criteria andPbBetween(String value1, String value2) {
            addCriterion("PB between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPbNotBetween(String value1, String value2) {
            addCriterion("PB not between", value1, value2, "pb");
            return (Criteria) this;
        }

        public Criteria andPsIsNull() {
            addCriterion("PS is null");
            return (Criteria) this;
        }

        public Criteria andPsIsNotNull() {
            addCriterion("PS is not null");
            return (Criteria) this;
        }

        public Criteria andPsEqualTo(String value) {
            addCriterion("PS =", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotEqualTo(String value) {
            addCriterion("PS <>", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThan(String value) {
            addCriterion("PS >", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsGreaterThanOrEqualTo(String value) {
            addCriterion("PS >=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThan(String value) {
            addCriterion("PS <", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLessThanOrEqualTo(String value) {
            addCriterion("PS <=", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsLike(String value) {
            addCriterion("PS like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotLike(String value) {
            addCriterion("PS not like", value, "ps");
            return (Criteria) this;
        }

        public Criteria andPsIn(List<String> values) {
            addCriterion("PS in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotIn(List<String> values) {
            addCriterion("PS not in", values, "ps");
            return (Criteria) this;
        }

        public Criteria andPsBetween(String value1, String value2) {
            addCriterion("PS between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andPsNotBetween(String value1, String value2) {
            addCriterion("PS not between", value1, value2, "ps");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedIsNull() {
            addCriterion("ROE-diluted is null");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedIsNotNull() {
            addCriterion("ROE-diluted is not null");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedEqualTo(String value) {
            addCriterion("ROE-diluted =", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedNotEqualTo(String value) {
            addCriterion("ROE-diluted <>", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedGreaterThan(String value) {
            addCriterion("ROE-diluted >", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedGreaterThanOrEqualTo(String value) {
            addCriterion("ROE-diluted >=", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedLessThan(String value) {
            addCriterion("ROE-diluted <", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedLessThanOrEqualTo(String value) {
            addCriterion("ROE-diluted <=", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedLike(String value) {
            addCriterion("ROE-diluted like", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedNotLike(String value) {
            addCriterion("ROE-diluted not like", value, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedIn(List<String> values) {
            addCriterion("ROE-diluted in", values, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedNotIn(List<String> values) {
            addCriterion("ROE-diluted not in", values, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedBetween(String value1, String value2) {
            addCriterion("ROE-diluted between", value1, value2, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoeDilutedNotBetween(String value1, String value2) {
            addCriterion("ROE-diluted not between", value1, value2, "roeDiluted");
            return (Criteria) this;
        }

        public Criteria andRoaIsNull() {
            addCriterion("ROA is null");
            return (Criteria) this;
        }

        public Criteria andRoaIsNotNull() {
            addCriterion("ROA is not null");
            return (Criteria) this;
        }

        public Criteria andRoaEqualTo(String value) {
            addCriterion("ROA =", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotEqualTo(String value) {
            addCriterion("ROA <>", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaGreaterThan(String value) {
            addCriterion("ROA >", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaGreaterThanOrEqualTo(String value) {
            addCriterion("ROA >=", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaLessThan(String value) {
            addCriterion("ROA <", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaLessThanOrEqualTo(String value) {
            addCriterion("ROA <=", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaLike(String value) {
            addCriterion("ROA like", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotLike(String value) {
            addCriterion("ROA not like", value, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaIn(List<String> values) {
            addCriterion("ROA in", values, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotIn(List<String> values) {
            addCriterion("ROA not in", values, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaBetween(String value1, String value2) {
            addCriterion("ROA between", value1, value2, "roa");
            return (Criteria) this;
        }

        public Criteria andRoaNotBetween(String value1, String value2) {
            addCriterion("ROA not between", value1, value2, "roa");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateIsNull() {
            addCriterion("revenue_increase_rate is null");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateIsNotNull() {
            addCriterion("revenue_increase_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateEqualTo(String value) {
            addCriterion("revenue_increase_rate =", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateNotEqualTo(String value) {
            addCriterion("revenue_increase_rate <>", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateGreaterThan(String value) {
            addCriterion("revenue_increase_rate >", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateGreaterThanOrEqualTo(String value) {
            addCriterion("revenue_increase_rate >=", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateLessThan(String value) {
            addCriterion("revenue_increase_rate <", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateLessThanOrEqualTo(String value) {
            addCriterion("revenue_increase_rate <=", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateLike(String value) {
            addCriterion("revenue_increase_rate like", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateNotLike(String value) {
            addCriterion("revenue_increase_rate not like", value, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateIn(List<String> values) {
            addCriterion("revenue_increase_rate in", values, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateNotIn(List<String> values) {
            addCriterion("revenue_increase_rate not in", values, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateBetween(String value1, String value2) {
            addCriterion("revenue_increase_rate between", value1, value2, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andRevenueIncreaseRateNotBetween(String value1, String value2) {
            addCriterion("revenue_increase_rate not between", value1, value2, "revenueIncreaseRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateIsNull() {
            addCriterion("netprofit_growth_rate is null");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateIsNotNull() {
            addCriterion("netprofit_growth_rate is not null");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateEqualTo(String value) {
            addCriterion("netprofit_growth_rate =", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateNotEqualTo(String value) {
            addCriterion("netprofit_growth_rate <>", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateGreaterThan(String value) {
            addCriterion("netprofit_growth_rate >", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateGreaterThanOrEqualTo(String value) {
            addCriterion("netprofit_growth_rate >=", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateLessThan(String value) {
            addCriterion("netprofit_growth_rate <", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateLessThanOrEqualTo(String value) {
            addCriterion("netprofit_growth_rate <=", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateLike(String value) {
            addCriterion("netprofit_growth_rate like", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateNotLike(String value) {
            addCriterion("netprofit_growth_rate not like", value, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateIn(List<String> values) {
            addCriterion("netprofit_growth_rate in", values, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateNotIn(List<String> values) {
            addCriterion("netprofit_growth_rate not in", values, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateBetween(String value1, String value2) {
            addCriterion("netprofit_growth_rate between", value1, value2, "netprofitGrowthRate");
            return (Criteria) this;
        }

        public Criteria andNetprofitGrowthRateNotBetween(String value1, String value2) {
            addCriterion("netprofit_growth_rate not between", value1, value2, "netprofitGrowthRate");
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