package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockinfoExample() {
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

        public Criteria andCurrentPriceIsNull() {
            addCriterion("current_price is null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIsNotNull() {
            addCriterion("current_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceEqualTo(String value) {
            addCriterion("current_price =", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotEqualTo(String value) {
            addCriterion("current_price <>", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThan(String value) {
            addCriterion("current_price >", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceGreaterThanOrEqualTo(String value) {
            addCriterion("current_price >=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThan(String value) {
            addCriterion("current_price <", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLessThanOrEqualTo(String value) {
            addCriterion("current_price <=", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceLike(String value) {
            addCriterion("current_price like", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotLike(String value) {
            addCriterion("current_price not like", value, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceIn(List<String> values) {
            addCriterion("current_price in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotIn(List<String> values) {
            addCriterion("current_price not in", values, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceBetween(String value1, String value2) {
            addCriterion("current_price between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentPriceNotBetween(String value1, String value2) {
            addCriterion("current_price not between", value1, value2, "currentPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioIsNull() {
            addCriterion("updown_ratio is null");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioIsNotNull() {
            addCriterion("updown_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioEqualTo(String value) {
            addCriterion("updown_ratio =", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioNotEqualTo(String value) {
            addCriterion("updown_ratio <>", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioGreaterThan(String value) {
            addCriterion("updown_ratio >", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioGreaterThanOrEqualTo(String value) {
            addCriterion("updown_ratio >=", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioLessThan(String value) {
            addCriterion("updown_ratio <", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioLessThanOrEqualTo(String value) {
            addCriterion("updown_ratio <=", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioLike(String value) {
            addCriterion("updown_ratio like", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioNotLike(String value) {
            addCriterion("updown_ratio not like", value, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioIn(List<String> values) {
            addCriterion("updown_ratio in", values, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioNotIn(List<String> values) {
            addCriterion("updown_ratio not in", values, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioBetween(String value1, String value2) {
            addCriterion("updown_ratio between", value1, value2, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioNotBetween(String value1, String value2) {
            addCriterion("updown_ratio not between", value1, value2, "updownRatio");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceIsNull() {
            addCriterion("updown_price is null");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceIsNotNull() {
            addCriterion("updown_price is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceEqualTo(String value) {
            addCriterion("updown_price =", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceNotEqualTo(String value) {
            addCriterion("updown_price <>", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceGreaterThan(String value) {
            addCriterion("updown_price >", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceGreaterThanOrEqualTo(String value) {
            addCriterion("updown_price >=", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceLessThan(String value) {
            addCriterion("updown_price <", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceLessThanOrEqualTo(String value) {
            addCriterion("updown_price <=", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceLike(String value) {
            addCriterion("updown_price like", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceNotLike(String value) {
            addCriterion("updown_price not like", value, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceIn(List<String> values) {
            addCriterion("updown_price in", values, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceNotIn(List<String> values) {
            addCriterion("updown_price not in", values, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceBetween(String value1, String value2) {
            addCriterion("updown_price between", value1, value2, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpdownPriceNotBetween(String value1, String value2) {
            addCriterion("updown_price not between", value1, value2, "updownPrice");
            return (Criteria) this;
        }

        public Criteria andUpSpeedIsNull() {
            addCriterion("up_speed is null");
            return (Criteria) this;
        }

        public Criteria andUpSpeedIsNotNull() {
            addCriterion("up_speed is not null");
            return (Criteria) this;
        }

        public Criteria andUpSpeedEqualTo(String value) {
            addCriterion("up_speed =", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedNotEqualTo(String value) {
            addCriterion("up_speed <>", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedGreaterThan(String value) {
            addCriterion("up_speed >", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("up_speed >=", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedLessThan(String value) {
            addCriterion("up_speed <", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedLessThanOrEqualTo(String value) {
            addCriterion("up_speed <=", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedLike(String value) {
            addCriterion("up_speed like", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedNotLike(String value) {
            addCriterion("up_speed not like", value, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedIn(List<String> values) {
            addCriterion("up_speed in", values, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedNotIn(List<String> values) {
            addCriterion("up_speed not in", values, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedBetween(String value1, String value2) {
            addCriterion("up_speed between", value1, value2, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andUpSpeedNotBetween(String value1, String value2) {
            addCriterion("up_speed not between", value1, value2, "upSpeed");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNull() {
            addCriterion("turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIsNotNull() {
            addCriterion("turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateEqualTo(String value) {
            addCriterion("turnover_rate =", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotEqualTo(String value) {
            addCriterion("turnover_rate <>", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThan(String value) {
            addCriterion("turnover_rate >", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("turnover_rate >=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThan(String value) {
            addCriterion("turnover_rate <", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("turnover_rate <=", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateLike(String value) {
            addCriterion("turnover_rate like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotLike(String value) {
            addCriterion("turnover_rate not like", value, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateIn(List<String> values) {
            addCriterion("turnover_rate in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotIn(List<String> values) {
            addCriterion("turnover_rate not in", values, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateBetween(String value1, String value2) {
            addCriterion("turnover_rate between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("turnover_rate not between", value1, value2, "turnoverRate");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioIsNull() {
            addCriterion("equivalent_ratio is null");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioIsNotNull() {
            addCriterion("equivalent_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioEqualTo(String value) {
            addCriterion("equivalent_ratio =", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioNotEqualTo(String value) {
            addCriterion("equivalent_ratio <>", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioGreaterThan(String value) {
            addCriterion("equivalent_ratio >", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioGreaterThanOrEqualTo(String value) {
            addCriterion("equivalent_ratio >=", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioLessThan(String value) {
            addCriterion("equivalent_ratio <", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioLessThanOrEqualTo(String value) {
            addCriterion("equivalent_ratio <=", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioLike(String value) {
            addCriterion("equivalent_ratio like", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioNotLike(String value) {
            addCriterion("equivalent_ratio not like", value, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioIn(List<String> values) {
            addCriterion("equivalent_ratio in", values, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioNotIn(List<String> values) {
            addCriterion("equivalent_ratio not in", values, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioBetween(String value1, String value2) {
            addCriterion("equivalent_ratio between", value1, value2, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andEquivalentRatioNotBetween(String value1, String value2) {
            addCriterion("equivalent_ratio not between", value1, value2, "equivalentRatio");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNull() {
            addCriterion("amplitude is null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIsNotNull() {
            addCriterion("amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andAmplitudeEqualTo(String value) {
            addCriterion("amplitude =", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotEqualTo(String value) {
            addCriterion("amplitude <>", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThan(String value) {
            addCriterion("amplitude >", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeGreaterThanOrEqualTo(String value) {
            addCriterion("amplitude >=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThan(String value) {
            addCriterion("amplitude <", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLessThanOrEqualTo(String value) {
            addCriterion("amplitude <=", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeLike(String value) {
            addCriterion("amplitude like", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotLike(String value) {
            addCriterion("amplitude not like", value, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeIn(List<String> values) {
            addCriterion("amplitude in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotIn(List<String> values) {
            addCriterion("amplitude not in", values, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeBetween(String value1, String value2) {
            addCriterion("amplitude between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andAmplitudeNotBetween(String value1, String value2) {
            addCriterion("amplitude not between", value1, value2, "amplitude");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIsNull() {
            addCriterion("turn_volume is null");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIsNotNull() {
            addCriterion("turn_volume is not null");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeEqualTo(String value) {
            addCriterion("turn_volume =", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotEqualTo(String value) {
            addCriterion("turn_volume <>", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeGreaterThan(String value) {
            addCriterion("turn_volume >", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("turn_volume >=", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeLessThan(String value) {
            addCriterion("turn_volume <", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeLessThanOrEqualTo(String value) {
            addCriterion("turn_volume <=", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeLike(String value) {
            addCriterion("turn_volume like", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotLike(String value) {
            addCriterion("turn_volume not like", value, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeIn(List<String> values) {
            addCriterion("turn_volume in", values, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotIn(List<String> values) {
            addCriterion("turn_volume not in", values, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeBetween(String value1, String value2) {
            addCriterion("turn_volume between", value1, value2, "turnVolume");
            return (Criteria) this;
        }

        public Criteria andTurnVolumeNotBetween(String value1, String value2) {
            addCriterion("turn_volume not between", value1, value2, "turnVolume");
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

        public Criteria andCirculationMarketValueIsNull() {
            addCriterion("circulation_market_value is null");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueIsNotNull() {
            addCriterion("circulation_market_value is not null");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueEqualTo(String value) {
            addCriterion("circulation_market_value =", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotEqualTo(String value) {
            addCriterion("circulation_market_value <>", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueGreaterThan(String value) {
            addCriterion("circulation_market_value >", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueGreaterThanOrEqualTo(String value) {
            addCriterion("circulation_market_value >=", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueLessThan(String value) {
            addCriterion("circulation_market_value <", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueLessThanOrEqualTo(String value) {
            addCriterion("circulation_market_value <=", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueLike(String value) {
            addCriterion("circulation_market_value like", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotLike(String value) {
            addCriterion("circulation_market_value not like", value, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueIn(List<String> values) {
            addCriterion("circulation_market_value in", values, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotIn(List<String> values) {
            addCriterion("circulation_market_value not in", values, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueBetween(String value1, String value2) {
            addCriterion("circulation_market_value between", value1, value2, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andCirculationMarketValueNotBetween(String value1, String value2) {
            addCriterion("circulation_market_value not between", value1, value2, "circulationMarketValue");
            return (Criteria) this;
        }

        public Criteria andPeRatioIsNull() {
            addCriterion("pe_ratio is null");
            return (Criteria) this;
        }

        public Criteria andPeRatioIsNotNull() {
            addCriterion("pe_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andPeRatioEqualTo(String value) {
            addCriterion("pe_ratio =", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioNotEqualTo(String value) {
            addCriterion("pe_ratio <>", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioGreaterThan(String value) {
            addCriterion("pe_ratio >", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioGreaterThanOrEqualTo(String value) {
            addCriterion("pe_ratio >=", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioLessThan(String value) {
            addCriterion("pe_ratio <", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioLessThanOrEqualTo(String value) {
            addCriterion("pe_ratio <=", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioLike(String value) {
            addCriterion("pe_ratio like", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioNotLike(String value) {
            addCriterion("pe_ratio not like", value, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioIn(List<String> values) {
            addCriterion("pe_ratio in", values, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioNotIn(List<String> values) {
            addCriterion("pe_ratio not in", values, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioBetween(String value1, String value2) {
            addCriterion("pe_ratio between", value1, value2, "peRatio");
            return (Criteria) this;
        }

        public Criteria andPeRatioNotBetween(String value1, String value2) {
            addCriterion("pe_ratio not between", value1, value2, "peRatio");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
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