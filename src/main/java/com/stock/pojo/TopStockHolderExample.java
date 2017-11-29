package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class TopStockHolderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopStockHolderExample() {
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

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(String value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(String value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(String value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(String value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(String value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(String value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLike(String value) {
            addCriterion("date like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotLike(String value) {
            addCriterion("date not like", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<String> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<String> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(String value1, String value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(String value1, String value2) {
            addCriterion("date not between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andStockHeldIsNull() {
            addCriterion("stock_held is null");
            return (Criteria) this;
        }

        public Criteria andStockHeldIsNotNull() {
            addCriterion("stock_held is not null");
            return (Criteria) this;
        }

        public Criteria andStockHeldEqualTo(String value) {
            addCriterion("stock_held =", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldNotEqualTo(String value) {
            addCriterion("stock_held <>", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldGreaterThan(String value) {
            addCriterion("stock_held >", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldGreaterThanOrEqualTo(String value) {
            addCriterion("stock_held >=", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldLessThan(String value) {
            addCriterion("stock_held <", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldLessThanOrEqualTo(String value) {
            addCriterion("stock_held <=", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldLike(String value) {
            addCriterion("stock_held like", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldNotLike(String value) {
            addCriterion("stock_held not like", value, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldIn(List<String> values) {
            addCriterion("stock_held in", values, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldNotIn(List<String> values) {
            addCriterion("stock_held not in", values, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldBetween(String value1, String value2) {
            addCriterion("stock_held between", value1, value2, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldNotBetween(String value1, String value2) {
            addCriterion("stock_held not between", value1, value2, "stockHeld");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateIsNull() {
            addCriterion("stock_held_rate is null");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateIsNotNull() {
            addCriterion("stock_held_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateEqualTo(String value) {
            addCriterion("stock_held_rate =", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateNotEqualTo(String value) {
            addCriterion("stock_held_rate <>", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateGreaterThan(String value) {
            addCriterion("stock_held_rate >", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateGreaterThanOrEqualTo(String value) {
            addCriterion("stock_held_rate >=", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateLessThan(String value) {
            addCriterion("stock_held_rate <", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateLessThanOrEqualTo(String value) {
            addCriterion("stock_held_rate <=", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateLike(String value) {
            addCriterion("stock_held_rate like", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateNotLike(String value) {
            addCriterion("stock_held_rate not like", value, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateIn(List<String> values) {
            addCriterion("stock_held_rate in", values, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateNotIn(List<String> values) {
            addCriterion("stock_held_rate not in", values, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateBetween(String value1, String value2) {
            addCriterion("stock_held_rate between", value1, value2, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andStockHeldRateNotBetween(String value1, String value2) {
            addCriterion("stock_held_rate not between", value1, value2, "stockHeldRate");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeIsNull() {
            addCriterion("change_before is null");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeIsNotNull() {
            addCriterion("change_before is not null");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeEqualTo(String value) {
            addCriterion("change_before =", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeNotEqualTo(String value) {
            addCriterion("change_before <>", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeGreaterThan(String value) {
            addCriterion("change_before >", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeGreaterThanOrEqualTo(String value) {
            addCriterion("change_before >=", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeLessThan(String value) {
            addCriterion("change_before <", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeLessThanOrEqualTo(String value) {
            addCriterion("change_before <=", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeLike(String value) {
            addCriterion("change_before like", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeNotLike(String value) {
            addCriterion("change_before not like", value, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeIn(List<String> values) {
            addCriterion("change_before in", values, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeNotIn(List<String> values) {
            addCriterion("change_before not in", values, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeBetween(String value1, String value2) {
            addCriterion("change_before between", value1, value2, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andChangeBeforeNotBetween(String value1, String value2) {
            addCriterion("change_before not between", value1, value2, "changeBefore");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNull() {
            addCriterion("institution_name is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIsNotNull() {
            addCriterion("institution_name is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameEqualTo(String value) {
            addCriterion("institution_name =", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotEqualTo(String value) {
            addCriterion("institution_name <>", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThan(String value) {
            addCriterion("institution_name >", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("institution_name >=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThan(String value) {
            addCriterion("institution_name <", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("institution_name <=", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameLike(String value) {
            addCriterion("institution_name like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotLike(String value) {
            addCriterion("institution_name not like", value, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameIn(List<String> values) {
            addCriterion("institution_name in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotIn(List<String> values) {
            addCriterion("institution_name not in", values, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameBetween(String value1, String value2) {
            addCriterion("institution_name between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("institution_name not between", value1, value2, "institutionName");
            return (Criteria) this;
        }

        public Criteria andHolderNumIsNull() {
            addCriterion("holder_num is null");
            return (Criteria) this;
        }

        public Criteria andHolderNumIsNotNull() {
            addCriterion("holder_num is not null");
            return (Criteria) this;
        }

        public Criteria andHolderNumEqualTo(String value) {
            addCriterion("holder_num =", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumNotEqualTo(String value) {
            addCriterion("holder_num <>", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumGreaterThan(String value) {
            addCriterion("holder_num >", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumGreaterThanOrEqualTo(String value) {
            addCriterion("holder_num >=", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumLessThan(String value) {
            addCriterion("holder_num <", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumLessThanOrEqualTo(String value) {
            addCriterion("holder_num <=", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumLike(String value) {
            addCriterion("holder_num like", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumNotLike(String value) {
            addCriterion("holder_num not like", value, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumIn(List<String> values) {
            addCriterion("holder_num in", values, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumNotIn(List<String> values) {
            addCriterion("holder_num not in", values, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumBetween(String value1, String value2) {
            addCriterion("holder_num between", value1, value2, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderNumNotBetween(String value1, String value2) {
            addCriterion("holder_num not between", value1, value2, "holderNum");
            return (Criteria) this;
        }

        public Criteria andHolderChangeIsNull() {
            addCriterion("holder_change is null");
            return (Criteria) this;
        }

        public Criteria andHolderChangeIsNotNull() {
            addCriterion("holder_change is not null");
            return (Criteria) this;
        }

        public Criteria andHolderChangeEqualTo(String value) {
            addCriterion("holder_change =", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeNotEqualTo(String value) {
            addCriterion("holder_change <>", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeGreaterThan(String value) {
            addCriterion("holder_change >", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeGreaterThanOrEqualTo(String value) {
            addCriterion("holder_change >=", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeLessThan(String value) {
            addCriterion("holder_change <", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeLessThanOrEqualTo(String value) {
            addCriterion("holder_change <=", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeLike(String value) {
            addCriterion("holder_change like", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeNotLike(String value) {
            addCriterion("holder_change not like", value, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeIn(List<String> values) {
            addCriterion("holder_change in", values, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeNotIn(List<String> values) {
            addCriterion("holder_change not in", values, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeBetween(String value1, String value2) {
            addCriterion("holder_change between", value1, value2, "holderChange");
            return (Criteria) this;
        }

        public Criteria andHolderChangeNotBetween(String value1, String value2) {
            addCriterion("holder_change not between", value1, value2, "holderChange");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateIsNull() {
            addCriterion("stock_propotion_rate is null");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateIsNotNull() {
            addCriterion("stock_propotion_rate is not null");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateEqualTo(String value) {
            addCriterion("stock_propotion_rate =", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateNotEqualTo(String value) {
            addCriterion("stock_propotion_rate <>", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateGreaterThan(String value) {
            addCriterion("stock_propotion_rate >", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateGreaterThanOrEqualTo(String value) {
            addCriterion("stock_propotion_rate >=", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateLessThan(String value) {
            addCriterion("stock_propotion_rate <", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateLessThanOrEqualTo(String value) {
            addCriterion("stock_propotion_rate <=", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateLike(String value) {
            addCriterion("stock_propotion_rate like", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateNotLike(String value) {
            addCriterion("stock_propotion_rate not like", value, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateIn(List<String> values) {
            addCriterion("stock_propotion_rate in", values, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateNotIn(List<String> values) {
            addCriterion("stock_propotion_rate not in", values, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateBetween(String value1, String value2) {
            addCriterion("stock_propotion_rate between", value1, value2, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andStockPropotionRateNotBetween(String value1, String value2) {
            addCriterion("stock_propotion_rate not between", value1, value2, "stockPropotionRate");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseIsNull() {
            addCriterion("real_increase is null");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseIsNotNull() {
            addCriterion("real_increase is not null");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseEqualTo(String value) {
            addCriterion("real_increase =", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseNotEqualTo(String value) {
            addCriterion("real_increase <>", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseGreaterThan(String value) {
            addCriterion("real_increase >", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseGreaterThanOrEqualTo(String value) {
            addCriterion("real_increase >=", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseLessThan(String value) {
            addCriterion("real_increase <", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseLessThanOrEqualTo(String value) {
            addCriterion("real_increase <=", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseLike(String value) {
            addCriterion("real_increase like", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseNotLike(String value) {
            addCriterion("real_increase not like", value, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseIn(List<String> values) {
            addCriterion("real_increase in", values, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseNotIn(List<String> values) {
            addCriterion("real_increase not in", values, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseBetween(String value1, String value2) {
            addCriterion("real_increase between", value1, value2, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andRealIncreaseNotBetween(String value1, String value2) {
            addCriterion("real_increase not between", value1, value2, "realIncrease");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("stock_type is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("stock_type =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("stock_type <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("stock_type >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_type >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("stock_type <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("stock_type <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("stock_type like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("stock_type not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("stock_type in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("stock_type not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("stock_type between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("stock_type not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIsNull() {
            addCriterion("stock_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIsNotNull() {
            addCriterion("stock_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdEqualTo(String value) {
            addCriterion("stock_detail_id =", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotEqualTo(String value) {
            addCriterion("stock_detail_id <>", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdGreaterThan(String value) {
            addCriterion("stock_detail_id >", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_detail_id >=", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLessThan(String value) {
            addCriterion("stock_detail_id <", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLessThanOrEqualTo(String value) {
            addCriterion("stock_detail_id <=", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdLike(String value) {
            addCriterion("stock_detail_id like", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotLike(String value) {
            addCriterion("stock_detail_id not like", value, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdIn(List<String> values) {
            addCriterion("stock_detail_id in", values, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotIn(List<String> values) {
            addCriterion("stock_detail_id not in", values, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdBetween(String value1, String value2) {
            addCriterion("stock_detail_id between", value1, value2, "stockDetailId");
            return (Criteria) this;
        }

        public Criteria andStockDetailIdNotBetween(String value1, String value2) {
            addCriterion("stock_detail_id not between", value1, value2, "stockDetailId");
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