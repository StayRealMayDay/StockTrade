package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class LonghubangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LonghubangExample() {
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

        public Criteria andNetPurchaseIsNull() {
            addCriterion("net_purchase is null");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseIsNotNull() {
            addCriterion("net_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseEqualTo(String value) {
            addCriterion("net_purchase =", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseNotEqualTo(String value) {
            addCriterion("net_purchase <>", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseGreaterThan(String value) {
            addCriterion("net_purchase >", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseGreaterThanOrEqualTo(String value) {
            addCriterion("net_purchase >=", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseLessThan(String value) {
            addCriterion("net_purchase <", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseLessThanOrEqualTo(String value) {
            addCriterion("net_purchase <=", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseLike(String value) {
            addCriterion("net_purchase like", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseNotLike(String value) {
            addCriterion("net_purchase not like", value, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseIn(List<String> values) {
            addCriterion("net_purchase in", values, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseNotIn(List<String> values) {
            addCriterion("net_purchase not in", values, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseBetween(String value1, String value2) {
            addCriterion("net_purchase between", value1, value2, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetPurchaseNotBetween(String value1, String value2) {
            addCriterion("net_purchase not between", value1, value2, "netPurchase");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverIsNull() {
            addCriterion("net_totalTurnover is null");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverIsNotNull() {
            addCriterion("net_totalTurnover is not null");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverEqualTo(String value) {
            addCriterion("net_totalTurnover =", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverNotEqualTo(String value) {
            addCriterion("net_totalTurnover <>", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverGreaterThan(String value) {
            addCriterion("net_totalTurnover >", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverGreaterThanOrEqualTo(String value) {
            addCriterion("net_totalTurnover >=", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverLessThan(String value) {
            addCriterion("net_totalTurnover <", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverLessThanOrEqualTo(String value) {
            addCriterion("net_totalTurnover <=", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverLike(String value) {
            addCriterion("net_totalTurnover like", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverNotLike(String value) {
            addCriterion("net_totalTurnover not like", value, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverIn(List<String> values) {
            addCriterion("net_totalTurnover in", values, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverNotIn(List<String> values) {
            addCriterion("net_totalTurnover not in", values, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverBetween(String value1, String value2) {
            addCriterion("net_totalTurnover between", value1, value2, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andNetTotalturnoverNotBetween(String value1, String value2) {
            addCriterion("net_totalTurnover not between", value1, value2, "netTotalturnover");
            return (Criteria) this;
        }

        public Criteria andClosePriceIsNull() {
            addCriterion("close_price is null");
            return (Criteria) this;
        }

        public Criteria andClosePriceIsNotNull() {
            addCriterion("close_price is not null");
            return (Criteria) this;
        }

        public Criteria andClosePriceEqualTo(String value) {
            addCriterion("close_price =", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotEqualTo(String value) {
            addCriterion("close_price <>", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceGreaterThan(String value) {
            addCriterion("close_price >", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceGreaterThanOrEqualTo(String value) {
            addCriterion("close_price >=", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceLessThan(String value) {
            addCriterion("close_price <", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceLessThanOrEqualTo(String value) {
            addCriterion("close_price <=", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceLike(String value) {
            addCriterion("close_price like", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotLike(String value) {
            addCriterion("close_price not like", value, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceIn(List<String> values) {
            addCriterion("close_price in", values, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotIn(List<String> values) {
            addCriterion("close_price not in", values, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceBetween(String value1, String value2) {
            addCriterion("close_price between", value1, value2, "closePrice");
            return (Criteria) this;
        }

        public Criteria andClosePriceNotBetween(String value1, String value2) {
            addCriterion("close_price not between", value1, value2, "closePrice");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeIsNull() {
            addCriterion("quote_change is null");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeIsNotNull() {
            addCriterion("quote_change is not null");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeEqualTo(String value) {
            addCriterion("quote_change =", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeNotEqualTo(String value) {
            addCriterion("quote_change <>", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeGreaterThan(String value) {
            addCriterion("quote_change >", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeGreaterThanOrEqualTo(String value) {
            addCriterion("quote_change >=", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeLessThan(String value) {
            addCriterion("quote_change <", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeLessThanOrEqualTo(String value) {
            addCriterion("quote_change <=", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeLike(String value) {
            addCriterion("quote_change like", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeNotLike(String value) {
            addCriterion("quote_change not like", value, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeIn(List<String> values) {
            addCriterion("quote_change in", values, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeNotIn(List<String> values) {
            addCriterion("quote_change not in", values, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeBetween(String value1, String value2) {
            addCriterion("quote_change between", value1, value2, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andQuoteChangeNotBetween(String value1, String value2) {
            addCriterion("quote_change not between", value1, value2, "quoteChange");
            return (Criteria) this;
        }

        public Criteria andListReasonIsNull() {
            addCriterion("list_reason is null");
            return (Criteria) this;
        }

        public Criteria andListReasonIsNotNull() {
            addCriterion("list_reason is not null");
            return (Criteria) this;
        }

        public Criteria andListReasonEqualTo(String value) {
            addCriterion("list_reason =", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonNotEqualTo(String value) {
            addCriterion("list_reason <>", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonGreaterThan(String value) {
            addCriterion("list_reason >", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonGreaterThanOrEqualTo(String value) {
            addCriterion("list_reason >=", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonLessThan(String value) {
            addCriterion("list_reason <", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonLessThanOrEqualTo(String value) {
            addCriterion("list_reason <=", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonLike(String value) {
            addCriterion("list_reason like", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonNotLike(String value) {
            addCriterion("list_reason not like", value, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonIn(List<String> values) {
            addCriterion("list_reason in", values, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonNotIn(List<String> values) {
            addCriterion("list_reason not in", values, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonBetween(String value1, String value2) {
            addCriterion("list_reason between", value1, value2, "listReason");
            return (Criteria) this;
        }

        public Criteria andListReasonNotBetween(String value1, String value2) {
            addCriterion("list_reason not between", value1, value2, "listReason");
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