package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class WeekQuotationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WeekQuotationExample() {
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

        public Criteria andPreviousCloseIsNull() {
            addCriterion("previous_close is null");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseIsNotNull() {
            addCriterion("previous_close is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseEqualTo(String value) {
            addCriterion("previous_close =", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseNotEqualTo(String value) {
            addCriterion("previous_close <>", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseGreaterThan(String value) {
            addCriterion("previous_close >", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseGreaterThanOrEqualTo(String value) {
            addCriterion("previous_close >=", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseLessThan(String value) {
            addCriterion("previous_close <", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseLessThanOrEqualTo(String value) {
            addCriterion("previous_close <=", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseLike(String value) {
            addCriterion("previous_close like", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseNotLike(String value) {
            addCriterion("previous_close not like", value, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseIn(List<String> values) {
            addCriterion("previous_close in", values, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseNotIn(List<String> values) {
            addCriterion("previous_close not in", values, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseBetween(String value1, String value2) {
            addCriterion("previous_close between", value1, value2, "previousClose");
            return (Criteria) this;
        }

        public Criteria andPreviousCloseNotBetween(String value1, String value2) {
            addCriterion("previous_close not between", value1, value2, "previousClose");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("open is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("open is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(String value) {
            addCriterion("open =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(String value) {
            addCriterion("open <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(String value) {
            addCriterion("open >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(String value) {
            addCriterion("open >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(String value) {
            addCriterion("open <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(String value) {
            addCriterion("open <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLike(String value) {
            addCriterion("open like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotLike(String value) {
            addCriterion("open not like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<String> values) {
            addCriterion("open in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<String> values) {
            addCriterion("open not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(String value1, String value2) {
            addCriterion("open between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(String value1, String value2) {
            addCriterion("open not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andHighestIsNull() {
            addCriterion("highest is null");
            return (Criteria) this;
        }

        public Criteria andHighestIsNotNull() {
            addCriterion("highest is not null");
            return (Criteria) this;
        }

        public Criteria andHighestEqualTo(String value) {
            addCriterion("highest =", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotEqualTo(String value) {
            addCriterion("highest <>", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThan(String value) {
            addCriterion("highest >", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestGreaterThanOrEqualTo(String value) {
            addCriterion("highest >=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThan(String value) {
            addCriterion("highest <", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLessThanOrEqualTo(String value) {
            addCriterion("highest <=", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestLike(String value) {
            addCriterion("highest like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotLike(String value) {
            addCriterion("highest not like", value, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestIn(List<String> values) {
            addCriterion("highest in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotIn(List<String> values) {
            addCriterion("highest not in", values, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestBetween(String value1, String value2) {
            addCriterion("highest between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andHighestNotBetween(String value1, String value2) {
            addCriterion("highest not between", value1, value2, "highest");
            return (Criteria) this;
        }

        public Criteria andLowestIsNull() {
            addCriterion("lowest is null");
            return (Criteria) this;
        }

        public Criteria andLowestIsNotNull() {
            addCriterion("lowest is not null");
            return (Criteria) this;
        }

        public Criteria andLowestEqualTo(String value) {
            addCriterion("lowest =", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotEqualTo(String value) {
            addCriterion("lowest <>", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThan(String value) {
            addCriterion("lowest >", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestGreaterThanOrEqualTo(String value) {
            addCriterion("lowest >=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThan(String value) {
            addCriterion("lowest <", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLessThanOrEqualTo(String value) {
            addCriterion("lowest <=", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestLike(String value) {
            addCriterion("lowest like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotLike(String value) {
            addCriterion("lowest not like", value, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestIn(List<String> values) {
            addCriterion("lowest in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotIn(List<String> values) {
            addCriterion("lowest not in", values, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestBetween(String value1, String value2) {
            addCriterion("lowest between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andLowestNotBetween(String value1, String value2) {
            addCriterion("lowest not between", value1, value2, "lowest");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("close is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("close is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(String value) {
            addCriterion("close =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(String value) {
            addCriterion("close <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(String value) {
            addCriterion("close >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(String value) {
            addCriterion("close >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(String value) {
            addCriterion("close <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(String value) {
            addCriterion("close <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLike(String value) {
            addCriterion("close like", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotLike(String value) {
            addCriterion("close not like", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<String> values) {
            addCriterion("close in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<String> values) {
            addCriterion("close not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(String value1, String value2) {
            addCriterion("close between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(String value1, String value2) {
            addCriterion("close not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andHighestCloseIsNull() {
            addCriterion("highest_close is null");
            return (Criteria) this;
        }

        public Criteria andHighestCloseIsNotNull() {
            addCriterion("highest_close is not null");
            return (Criteria) this;
        }

        public Criteria andHighestCloseEqualTo(String value) {
            addCriterion("highest_close =", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseNotEqualTo(String value) {
            addCriterion("highest_close <>", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseGreaterThan(String value) {
            addCriterion("highest_close >", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseGreaterThanOrEqualTo(String value) {
            addCriterion("highest_close >=", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseLessThan(String value) {
            addCriterion("highest_close <", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseLessThanOrEqualTo(String value) {
            addCriterion("highest_close <=", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseLike(String value) {
            addCriterion("highest_close like", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseNotLike(String value) {
            addCriterion("highest_close not like", value, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseIn(List<String> values) {
            addCriterion("highest_close in", values, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseNotIn(List<String> values) {
            addCriterion("highest_close not in", values, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseBetween(String value1, String value2) {
            addCriterion("highest_close between", value1, value2, "highestClose");
            return (Criteria) this;
        }

        public Criteria andHighestCloseNotBetween(String value1, String value2) {
            addCriterion("highest_close not between", value1, value2, "highestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseIsNull() {
            addCriterion("lowest_close is null");
            return (Criteria) this;
        }

        public Criteria andLowestCloseIsNotNull() {
            addCriterion("lowest_close is not null");
            return (Criteria) this;
        }

        public Criteria andLowestCloseEqualTo(String value) {
            addCriterion("lowest_close =", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseNotEqualTo(String value) {
            addCriterion("lowest_close <>", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseGreaterThan(String value) {
            addCriterion("lowest_close >", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseGreaterThanOrEqualTo(String value) {
            addCriterion("lowest_close >=", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseLessThan(String value) {
            addCriterion("lowest_close <", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseLessThanOrEqualTo(String value) {
            addCriterion("lowest_close <=", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseLike(String value) {
            addCriterion("lowest_close like", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseNotLike(String value) {
            addCriterion("lowest_close not like", value, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseIn(List<String> values) {
            addCriterion("lowest_close in", values, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseNotIn(List<String> values) {
            addCriterion("lowest_close not in", values, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseBetween(String value1, String value2) {
            addCriterion("lowest_close between", value1, value2, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andLowestCloseNotBetween(String value1, String value2) {
            addCriterion("lowest_close not between", value1, value2, "lowestClose");
            return (Criteria) this;
        }

        public Criteria andAvePriceIsNull() {
            addCriterion("ave_price is null");
            return (Criteria) this;
        }

        public Criteria andAvePriceIsNotNull() {
            addCriterion("ave_price is not null");
            return (Criteria) this;
        }

        public Criteria andAvePriceEqualTo(String value) {
            addCriterion("ave_price =", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceNotEqualTo(String value) {
            addCriterion("ave_price <>", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceGreaterThan(String value) {
            addCriterion("ave_price >", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceGreaterThanOrEqualTo(String value) {
            addCriterion("ave_price >=", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceLessThan(String value) {
            addCriterion("ave_price <", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceLessThanOrEqualTo(String value) {
            addCriterion("ave_price <=", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceLike(String value) {
            addCriterion("ave_price like", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceNotLike(String value) {
            addCriterion("ave_price not like", value, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceIn(List<String> values) {
            addCriterion("ave_price in", values, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceNotIn(List<String> values) {
            addCriterion("ave_price not in", values, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceBetween(String value1, String value2) {
            addCriterion("ave_price between", value1, value2, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAvePriceNotBetween(String value1, String value2) {
            addCriterion("ave_price not between", value1, value2, "avePrice");
            return (Criteria) this;
        }

        public Criteria andAveCloseIsNull() {
            addCriterion("ave_close is null");
            return (Criteria) this;
        }

        public Criteria andAveCloseIsNotNull() {
            addCriterion("ave_close is not null");
            return (Criteria) this;
        }

        public Criteria andAveCloseEqualTo(String value) {
            addCriterion("ave_close =", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseNotEqualTo(String value) {
            addCriterion("ave_close <>", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseGreaterThan(String value) {
            addCriterion("ave_close >", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseGreaterThanOrEqualTo(String value) {
            addCriterion("ave_close >=", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseLessThan(String value) {
            addCriterion("ave_close <", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseLessThanOrEqualTo(String value) {
            addCriterion("ave_close <=", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseLike(String value) {
            addCriterion("ave_close like", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseNotLike(String value) {
            addCriterion("ave_close not like", value, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseIn(List<String> values) {
            addCriterion("ave_close in", values, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseNotIn(List<String> values) {
            addCriterion("ave_close not in", values, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseBetween(String value1, String value2) {
            addCriterion("ave_close between", value1, value2, "aveClose");
            return (Criteria) this;
        }

        public Criteria andAveCloseNotBetween(String value1, String value2) {
            addCriterion("ave_close not between", value1, value2, "aveClose");
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

        public Criteria andUpdownIsNull() {
            addCriterion("updown is null");
            return (Criteria) this;
        }

        public Criteria andUpdownIsNotNull() {
            addCriterion("updown is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownEqualTo(String value) {
            addCriterion("updown =", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotEqualTo(String value) {
            addCriterion("updown <>", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownGreaterThan(String value) {
            addCriterion("updown >", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownGreaterThanOrEqualTo(String value) {
            addCriterion("updown >=", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownLessThan(String value) {
            addCriterion("updown <", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownLessThanOrEqualTo(String value) {
            addCriterion("updown <=", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownLike(String value) {
            addCriterion("updown like", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotLike(String value) {
            addCriterion("updown not like", value, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownIn(List<String> values) {
            addCriterion("updown in", values, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotIn(List<String> values) {
            addCriterion("updown not in", values, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownBetween(String value1, String value2) {
            addCriterion("updown between", value1, value2, "updown");
            return (Criteria) this;
        }

        public Criteria andUpdownNotBetween(String value1, String value2) {
            addCriterion("updown not between", value1, value2, "updown");
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

        public Criteria andTurnPriceIsNull() {
            addCriterion("turn_price is null");
            return (Criteria) this;
        }

        public Criteria andTurnPriceIsNotNull() {
            addCriterion("turn_price is not null");
            return (Criteria) this;
        }

        public Criteria andTurnPriceEqualTo(String value) {
            addCriterion("turn_price =", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceNotEqualTo(String value) {
            addCriterion("turn_price <>", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceGreaterThan(String value) {
            addCriterion("turn_price >", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceGreaterThanOrEqualTo(String value) {
            addCriterion("turn_price >=", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceLessThan(String value) {
            addCriterion("turn_price <", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceLessThanOrEqualTo(String value) {
            addCriterion("turn_price <=", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceLike(String value) {
            addCriterion("turn_price like", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceNotLike(String value) {
            addCriterion("turn_price not like", value, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceIn(List<String> values) {
            addCriterion("turn_price in", values, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceNotIn(List<String> values) {
            addCriterion("turn_price not in", values, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceBetween(String value1, String value2) {
            addCriterion("turn_price between", value1, value2, "turnPrice");
            return (Criteria) this;
        }

        public Criteria andTurnPriceNotBetween(String value1, String value2) {
            addCriterion("turn_price not between", value1, value2, "turnPrice");
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

        public Criteria andAveTurnoverRateIsNull() {
            addCriterion("ave_turnover_rate is null");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateIsNotNull() {
            addCriterion("ave_turnover_rate is not null");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateEqualTo(String value) {
            addCriterion("ave_turnover_rate =", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateNotEqualTo(String value) {
            addCriterion("ave_turnover_rate <>", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateGreaterThan(String value) {
            addCriterion("ave_turnover_rate >", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateGreaterThanOrEqualTo(String value) {
            addCriterion("ave_turnover_rate >=", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateLessThan(String value) {
            addCriterion("ave_turnover_rate <", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateLessThanOrEqualTo(String value) {
            addCriterion("ave_turnover_rate <=", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateLike(String value) {
            addCriterion("ave_turnover_rate like", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateNotLike(String value) {
            addCriterion("ave_turnover_rate not like", value, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateIn(List<String> values) {
            addCriterion("ave_turnover_rate in", values, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateNotIn(List<String> values) {
            addCriterion("ave_turnover_rate not in", values, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateBetween(String value1, String value2) {
            addCriterion("ave_turnover_rate between", value1, value2, "aveTurnoverRate");
            return (Criteria) this;
        }

        public Criteria andAveTurnoverRateNotBetween(String value1, String value2) {
            addCriterion("ave_turnover_rate not between", value1, value2, "aveTurnoverRate");
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

        public Criteria andUpdownRatioDapanIsNull() {
            addCriterion("updown_ratio_dapan is null");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanIsNotNull() {
            addCriterion("updown_ratio_dapan is not null");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanEqualTo(String value) {
            addCriterion("updown_ratio_dapan =", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanNotEqualTo(String value) {
            addCriterion("updown_ratio_dapan <>", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanGreaterThan(String value) {
            addCriterion("updown_ratio_dapan >", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanGreaterThanOrEqualTo(String value) {
            addCriterion("updown_ratio_dapan >=", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanLessThan(String value) {
            addCriterion("updown_ratio_dapan <", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanLessThanOrEqualTo(String value) {
            addCriterion("updown_ratio_dapan <=", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanLike(String value) {
            addCriterion("updown_ratio_dapan like", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanNotLike(String value) {
            addCriterion("updown_ratio_dapan not like", value, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanIn(List<String> values) {
            addCriterion("updown_ratio_dapan in", values, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanNotIn(List<String> values) {
            addCriterion("updown_ratio_dapan not in", values, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanBetween(String value1, String value2) {
            addCriterion("updown_ratio_dapan between", value1, value2, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andUpdownRatioDapanNotBetween(String value1, String value2) {
            addCriterion("updown_ratio_dapan not between", value1, value2, "updownRatioDapan");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysIsNull() {
            addCriterion("over_dapan_days is null");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysIsNotNull() {
            addCriterion("over_dapan_days is not null");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysEqualTo(String value) {
            addCriterion("over_dapan_days =", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysNotEqualTo(String value) {
            addCriterion("over_dapan_days <>", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysGreaterThan(String value) {
            addCriterion("over_dapan_days >", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysGreaterThanOrEqualTo(String value) {
            addCriterion("over_dapan_days >=", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysLessThan(String value) {
            addCriterion("over_dapan_days <", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysLessThanOrEqualTo(String value) {
            addCriterion("over_dapan_days <=", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysLike(String value) {
            addCriterion("over_dapan_days like", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysNotLike(String value) {
            addCriterion("over_dapan_days not like", value, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysIn(List<String> values) {
            addCriterion("over_dapan_days in", values, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysNotIn(List<String> values) {
            addCriterion("over_dapan_days not in", values, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysBetween(String value1, String value2) {
            addCriterion("over_dapan_days between", value1, value2, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andOverDapanDaysNotBetween(String value1, String value2) {
            addCriterion("over_dapan_days not between", value1, value2, "overDapanDays");
            return (Criteria) this;
        }

        public Criteria andHighestDateIsNull() {
            addCriterion("highest_date is null");
            return (Criteria) this;
        }

        public Criteria andHighestDateIsNotNull() {
            addCriterion("highest_date is not null");
            return (Criteria) this;
        }

        public Criteria andHighestDateEqualTo(String value) {
            addCriterion("highest_date =", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateNotEqualTo(String value) {
            addCriterion("highest_date <>", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateGreaterThan(String value) {
            addCriterion("highest_date >", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateGreaterThanOrEqualTo(String value) {
            addCriterion("highest_date >=", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateLessThan(String value) {
            addCriterion("highest_date <", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateLessThanOrEqualTo(String value) {
            addCriterion("highest_date <=", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateLike(String value) {
            addCriterion("highest_date like", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateNotLike(String value) {
            addCriterion("highest_date not like", value, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateIn(List<String> values) {
            addCriterion("highest_date in", values, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateNotIn(List<String> values) {
            addCriterion("highest_date not in", values, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateBetween(String value1, String value2) {
            addCriterion("highest_date between", value1, value2, "highestDate");
            return (Criteria) this;
        }

        public Criteria andHighestDateNotBetween(String value1, String value2) {
            addCriterion("highest_date not between", value1, value2, "highestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateIsNull() {
            addCriterion("lowest_date is null");
            return (Criteria) this;
        }

        public Criteria andLowestDateIsNotNull() {
            addCriterion("lowest_date is not null");
            return (Criteria) this;
        }

        public Criteria andLowestDateEqualTo(String value) {
            addCriterion("lowest_date =", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateNotEqualTo(String value) {
            addCriterion("lowest_date <>", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateGreaterThan(String value) {
            addCriterion("lowest_date >", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateGreaterThanOrEqualTo(String value) {
            addCriterion("lowest_date >=", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateLessThan(String value) {
            addCriterion("lowest_date <", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateLessThanOrEqualTo(String value) {
            addCriterion("lowest_date <=", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateLike(String value) {
            addCriterion("lowest_date like", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateNotLike(String value) {
            addCriterion("lowest_date not like", value, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateIn(List<String> values) {
            addCriterion("lowest_date in", values, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateNotIn(List<String> values) {
            addCriterion("lowest_date not in", values, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateBetween(String value1, String value2) {
            addCriterion("lowest_date between", value1, value2, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andLowestDateNotBetween(String value1, String value2) {
            addCriterion("lowest_date not between", value1, value2, "lowestDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateIsNull() {
            addCriterion("highest_close_date is null");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateIsNotNull() {
            addCriterion("highest_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateEqualTo(String value) {
            addCriterion("highest_close_date =", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateNotEqualTo(String value) {
            addCriterion("highest_close_date <>", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateGreaterThan(String value) {
            addCriterion("highest_close_date >", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("highest_close_date >=", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateLessThan(String value) {
            addCriterion("highest_close_date <", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateLessThanOrEqualTo(String value) {
            addCriterion("highest_close_date <=", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateLike(String value) {
            addCriterion("highest_close_date like", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateNotLike(String value) {
            addCriterion("highest_close_date not like", value, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateIn(List<String> values) {
            addCriterion("highest_close_date in", values, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateNotIn(List<String> values) {
            addCriterion("highest_close_date not in", values, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateBetween(String value1, String value2) {
            addCriterion("highest_close_date between", value1, value2, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestCloseDateNotBetween(String value1, String value2) {
            addCriterion("highest_close_date not between", value1, value2, "highestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateIsNull() {
            addCriterion("lowest_close_date is null");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateIsNotNull() {
            addCriterion("lowest_close_date is not null");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateEqualTo(String value) {
            addCriterion("lowest_close_date =", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateNotEqualTo(String value) {
            addCriterion("lowest_close_date <>", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateGreaterThan(String value) {
            addCriterion("lowest_close_date >", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("lowest_close_date >=", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateLessThan(String value) {
            addCriterion("lowest_close_date <", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateLessThanOrEqualTo(String value) {
            addCriterion("lowest_close_date <=", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateLike(String value) {
            addCriterion("lowest_close_date like", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateNotLike(String value) {
            addCriterion("lowest_close_date not like", value, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateIn(List<String> values) {
            addCriterion("lowest_close_date in", values, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateNotIn(List<String> values) {
            addCriterion("lowest_close_date not in", values, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateBetween(String value1, String value2) {
            addCriterion("lowest_close_date between", value1, value2, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andLowestCloseDateNotBetween(String value1, String value2) {
            addCriterion("lowest_close_date not between", value1, value2, "lowestCloseDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateIsNull() {
            addCriterion("highest_updown_date is null");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateIsNotNull() {
            addCriterion("highest_updown_date is not null");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateEqualTo(String value) {
            addCriterion("highest_updown_date =", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateNotEqualTo(String value) {
            addCriterion("highest_updown_date <>", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateGreaterThan(String value) {
            addCriterion("highest_updown_date >", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateGreaterThanOrEqualTo(String value) {
            addCriterion("highest_updown_date >=", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateLessThan(String value) {
            addCriterion("highest_updown_date <", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateLessThanOrEqualTo(String value) {
            addCriterion("highest_updown_date <=", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateLike(String value) {
            addCriterion("highest_updown_date like", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateNotLike(String value) {
            addCriterion("highest_updown_date not like", value, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateIn(List<String> values) {
            addCriterion("highest_updown_date in", values, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateNotIn(List<String> values) {
            addCriterion("highest_updown_date not in", values, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateBetween(String value1, String value2) {
            addCriterion("highest_updown_date between", value1, value2, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andHighestUpdownDateNotBetween(String value1, String value2) {
            addCriterion("highest_updown_date not between", value1, value2, "highestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateIsNull() {
            addCriterion("lowest_updown_date is null");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateIsNotNull() {
            addCriterion("lowest_updown_date is not null");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateEqualTo(String value) {
            addCriterion("lowest_updown_date =", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateNotEqualTo(String value) {
            addCriterion("lowest_updown_date <>", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateGreaterThan(String value) {
            addCriterion("lowest_updown_date >", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateGreaterThanOrEqualTo(String value) {
            addCriterion("lowest_updown_date >=", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateLessThan(String value) {
            addCriterion("lowest_updown_date <", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateLessThanOrEqualTo(String value) {
            addCriterion("lowest_updown_date <=", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateLike(String value) {
            addCriterion("lowest_updown_date like", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateNotLike(String value) {
            addCriterion("lowest_updown_date not like", value, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateIn(List<String> values) {
            addCriterion("lowest_updown_date in", values, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateNotIn(List<String> values) {
            addCriterion("lowest_updown_date not in", values, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateBetween(String value1, String value2) {
            addCriterion("lowest_updown_date between", value1, value2, "lowestUpdownDate");
            return (Criteria) this;
        }

        public Criteria andLowestUpdownDateNotBetween(String value1, String value2) {
            addCriterion("lowest_updown_date not between", value1, value2, "lowestUpdownDate");
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