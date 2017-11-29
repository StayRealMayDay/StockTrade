package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class TotalShareStructureExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TotalShareStructureExample() {
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

        public Criteria andStockTotalIsNull() {
            addCriterion("stock_total is null");
            return (Criteria) this;
        }

        public Criteria andStockTotalIsNotNull() {
            addCriterion("stock_total is not null");
            return (Criteria) this;
        }

        public Criteria andStockTotalEqualTo(String value) {
            addCriterion("stock_total =", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotEqualTo(String value) {
            addCriterion("stock_total <>", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalGreaterThan(String value) {
            addCriterion("stock_total >", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalGreaterThanOrEqualTo(String value) {
            addCriterion("stock_total >=", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalLessThan(String value) {
            addCriterion("stock_total <", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalLessThanOrEqualTo(String value) {
            addCriterion("stock_total <=", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalLike(String value) {
            addCriterion("stock_total like", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotLike(String value) {
            addCriterion("stock_total not like", value, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalIn(List<String> values) {
            addCriterion("stock_total in", values, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotIn(List<String> values) {
            addCriterion("stock_total not in", values, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalBetween(String value1, String value2) {
            addCriterion("stock_total between", value1, value2, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockTotalNotBetween(String value1, String value2) {
            addCriterion("stock_total not between", value1, value2, "stockTotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalIsNull() {
            addCriterion("stock_A_total is null");
            return (Criteria) this;
        }

        public Criteria andStockATotalIsNotNull() {
            addCriterion("stock_A_total is not null");
            return (Criteria) this;
        }

        public Criteria andStockATotalEqualTo(String value) {
            addCriterion("stock_A_total =", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalNotEqualTo(String value) {
            addCriterion("stock_A_total <>", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalGreaterThan(String value) {
            addCriterion("stock_A_total >", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalGreaterThanOrEqualTo(String value) {
            addCriterion("stock_A_total >=", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalLessThan(String value) {
            addCriterion("stock_A_total <", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalLessThanOrEqualTo(String value) {
            addCriterion("stock_A_total <=", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalLike(String value) {
            addCriterion("stock_A_total like", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalNotLike(String value) {
            addCriterion("stock_A_total not like", value, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalIn(List<String> values) {
            addCriterion("stock_A_total in", values, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalNotIn(List<String> values) {
            addCriterion("stock_A_total not in", values, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalBetween(String value1, String value2) {
            addCriterion("stock_A_total between", value1, value2, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockATotalNotBetween(String value1, String value2) {
            addCriterion("stock_A_total not between", value1, value2, "stockATotal");
            return (Criteria) this;
        }

        public Criteria andStockCirculateIsNull() {
            addCriterion("stock_circulate is null");
            return (Criteria) this;
        }

        public Criteria andStockCirculateIsNotNull() {
            addCriterion("stock_circulate is not null");
            return (Criteria) this;
        }

        public Criteria andStockCirculateEqualTo(String value) {
            addCriterion("stock_circulate =", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateNotEqualTo(String value) {
            addCriterion("stock_circulate <>", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateGreaterThan(String value) {
            addCriterion("stock_circulate >", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateGreaterThanOrEqualTo(String value) {
            addCriterion("stock_circulate >=", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateLessThan(String value) {
            addCriterion("stock_circulate <", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateLessThanOrEqualTo(String value) {
            addCriterion("stock_circulate <=", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateLike(String value) {
            addCriterion("stock_circulate like", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateNotLike(String value) {
            addCriterion("stock_circulate not like", value, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateIn(List<String> values) {
            addCriterion("stock_circulate in", values, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateNotIn(List<String> values) {
            addCriterion("stock_circulate not in", values, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateBetween(String value1, String value2) {
            addCriterion("stock_circulate between", value1, value2, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockCirculateNotBetween(String value1, String value2) {
            addCriterion("stock_circulate not between", value1, value2, "stockCirculate");
            return (Criteria) this;
        }

        public Criteria andStockLimitIsNull() {
            addCriterion("stock_limit is null");
            return (Criteria) this;
        }

        public Criteria andStockLimitIsNotNull() {
            addCriterion("stock_limit is not null");
            return (Criteria) this;
        }

        public Criteria andStockLimitEqualTo(String value) {
            addCriterion("stock_limit =", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotEqualTo(String value) {
            addCriterion("stock_limit <>", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitGreaterThan(String value) {
            addCriterion("stock_limit >", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitGreaterThanOrEqualTo(String value) {
            addCriterion("stock_limit >=", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitLessThan(String value) {
            addCriterion("stock_limit <", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitLessThanOrEqualTo(String value) {
            addCriterion("stock_limit <=", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitLike(String value) {
            addCriterion("stock_limit like", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotLike(String value) {
            addCriterion("stock_limit not like", value, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitIn(List<String> values) {
            addCriterion("stock_limit in", values, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotIn(List<String> values) {
            addCriterion("stock_limit not in", values, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitBetween(String value1, String value2) {
            addCriterion("stock_limit between", value1, value2, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andStockLimitNotBetween(String value1, String value2) {
            addCriterion("stock_limit not between", value1, value2, "stockLimit");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNull() {
            addCriterion("change_reason is null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIsNotNull() {
            addCriterion("change_reason is not null");
            return (Criteria) this;
        }

        public Criteria andChangeReasonEqualTo(String value) {
            addCriterion("change_reason =", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotEqualTo(String value) {
            addCriterion("change_reason <>", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThan(String value) {
            addCriterion("change_reason >", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("change_reason >=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThan(String value) {
            addCriterion("change_reason <", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLessThanOrEqualTo(String value) {
            addCriterion("change_reason <=", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonLike(String value) {
            addCriterion("change_reason like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotLike(String value) {
            addCriterion("change_reason not like", value, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonIn(List<String> values) {
            addCriterion("change_reason in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotIn(List<String> values) {
            addCriterion("change_reason not in", values, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonBetween(String value1, String value2) {
            addCriterion("change_reason between", value1, value2, "changeReason");
            return (Criteria) this;
        }

        public Criteria andChangeReasonNotBetween(String value1, String value2) {
            addCriterion("change_reason not between", value1, value2, "changeReason");
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