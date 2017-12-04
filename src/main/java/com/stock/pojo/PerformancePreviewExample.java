package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class PerformancePreviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PerformancePreviewExample() {
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

        public Criteria andPreviewTypeIsNull() {
            addCriterion("preview_type is null");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeIsNotNull() {
            addCriterion("preview_type is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeEqualTo(String value) {
            addCriterion("preview_type =", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeNotEqualTo(String value) {
            addCriterion("preview_type <>", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeGreaterThan(String value) {
            addCriterion("preview_type >", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("preview_type >=", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeLessThan(String value) {
            addCriterion("preview_type <", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeLessThanOrEqualTo(String value) {
            addCriterion("preview_type <=", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeLike(String value) {
            addCriterion("preview_type like", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeNotLike(String value) {
            addCriterion("preview_type not like", value, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeIn(List<String> values) {
            addCriterion("preview_type in", values, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeNotIn(List<String> values) {
            addCriterion("preview_type not in", values, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeBetween(String value1, String value2) {
            addCriterion("preview_type between", value1, value2, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewTypeNotBetween(String value1, String value2) {
            addCriterion("preview_type not between", value1, value2, "previewType");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractIsNull() {
            addCriterion("preview_abstract is null");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractIsNotNull() {
            addCriterion("preview_abstract is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractEqualTo(String value) {
            addCriterion("preview_abstract =", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractNotEqualTo(String value) {
            addCriterion("preview_abstract <>", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractGreaterThan(String value) {
            addCriterion("preview_abstract >", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractGreaterThanOrEqualTo(String value) {
            addCriterion("preview_abstract >=", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractLessThan(String value) {
            addCriterion("preview_abstract <", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractLessThanOrEqualTo(String value) {
            addCriterion("preview_abstract <=", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractLike(String value) {
            addCriterion("preview_abstract like", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractNotLike(String value) {
            addCriterion("preview_abstract not like", value, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractIn(List<String> values) {
            addCriterion("preview_abstract in", values, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractNotIn(List<String> values) {
            addCriterion("preview_abstract not in", values, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractBetween(String value1, String value2) {
            addCriterion("preview_abstract between", value1, value2, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAbstractNotBetween(String value1, String value2) {
            addCriterion("preview_abstract not between", value1, value2, "previewAbstract");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeIsNull() {
            addCriterion("preview_amplitude is null");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeIsNotNull() {
            addCriterion("preview_amplitude is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeEqualTo(String value) {
            addCriterion("preview_amplitude =", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeNotEqualTo(String value) {
            addCriterion("preview_amplitude <>", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeGreaterThan(String value) {
            addCriterion("preview_amplitude >", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeGreaterThanOrEqualTo(String value) {
            addCriterion("preview_amplitude >=", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeLessThan(String value) {
            addCriterion("preview_amplitude <", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeLessThanOrEqualTo(String value) {
            addCriterion("preview_amplitude <=", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeLike(String value) {
            addCriterion("preview_amplitude like", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeNotLike(String value) {
            addCriterion("preview_amplitude not like", value, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeIn(List<String> values) {
            addCriterion("preview_amplitude in", values, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeNotIn(List<String> values) {
            addCriterion("preview_amplitude not in", values, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeBetween(String value1, String value2) {
            addCriterion("preview_amplitude between", value1, value2, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andPreviewAmplitudeNotBetween(String value1, String value2) {
            addCriterion("preview_amplitude not between", value1, value2, "previewAmplitude");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitIsNull() {
            addCriterion("net_profit_uplimit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitIsNotNull() {
            addCriterion("net_profit_uplimit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitEqualTo(String value) {
            addCriterion("net_profit_uplimit =", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitNotEqualTo(String value) {
            addCriterion("net_profit_uplimit <>", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitGreaterThan(String value) {
            addCriterion("net_profit_uplimit >", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_uplimit >=", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitLessThan(String value) {
            addCriterion("net_profit_uplimit <", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitLessThanOrEqualTo(String value) {
            addCriterion("net_profit_uplimit <=", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitLike(String value) {
            addCriterion("net_profit_uplimit like", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitNotLike(String value) {
            addCriterion("net_profit_uplimit not like", value, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitIn(List<String> values) {
            addCriterion("net_profit_uplimit in", values, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitNotIn(List<String> values) {
            addCriterion("net_profit_uplimit not in", values, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitBetween(String value1, String value2) {
            addCriterion("net_profit_uplimit between", value1, value2, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitUplimitNotBetween(String value1, String value2) {
            addCriterion("net_profit_uplimit not between", value1, value2, "netProfitUplimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitIsNull() {
            addCriterion("net_profit_downlimit is null");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitIsNotNull() {
            addCriterion("net_profit_downlimit is not null");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitEqualTo(String value) {
            addCriterion("net_profit_downlimit =", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitNotEqualTo(String value) {
            addCriterion("net_profit_downlimit <>", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitGreaterThan(String value) {
            addCriterion("net_profit_downlimit >", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitGreaterThanOrEqualTo(String value) {
            addCriterion("net_profit_downlimit >=", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitLessThan(String value) {
            addCriterion("net_profit_downlimit <", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitLessThanOrEqualTo(String value) {
            addCriterion("net_profit_downlimit <=", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitLike(String value) {
            addCriterion("net_profit_downlimit like", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitNotLike(String value) {
            addCriterion("net_profit_downlimit not like", value, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitIn(List<String> values) {
            addCriterion("net_profit_downlimit in", values, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitNotIn(List<String> values) {
            addCriterion("net_profit_downlimit not in", values, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitBetween(String value1, String value2) {
            addCriterion("net_profit_downlimit between", value1, value2, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andNetProfitDownlimitNotBetween(String value1, String value2) {
            addCriterion("net_profit_downlimit not between", value1, value2, "netProfitDownlimit");
            return (Criteria) this;
        }

        public Criteria andPreviewDateIsNull() {
            addCriterion("preview_date is null");
            return (Criteria) this;
        }

        public Criteria andPreviewDateIsNotNull() {
            addCriterion("preview_date is not null");
            return (Criteria) this;
        }

        public Criteria andPreviewDateEqualTo(String value) {
            addCriterion("preview_date =", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateNotEqualTo(String value) {
            addCriterion("preview_date <>", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateGreaterThan(String value) {
            addCriterion("preview_date >", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateGreaterThanOrEqualTo(String value) {
            addCriterion("preview_date >=", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateLessThan(String value) {
            addCriterion("preview_date <", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateLessThanOrEqualTo(String value) {
            addCriterion("preview_date <=", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateLike(String value) {
            addCriterion("preview_date like", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateNotLike(String value) {
            addCriterion("preview_date not like", value, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateIn(List<String> values) {
            addCriterion("preview_date in", values, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateNotIn(List<String> values) {
            addCriterion("preview_date not in", values, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateBetween(String value1, String value2) {
            addCriterion("preview_date between", value1, value2, "previewDate");
            return (Criteria) this;
        }

        public Criteria andPreviewDateNotBetween(String value1, String value2) {
            addCriterion("preview_date not between", value1, value2, "previewDate");
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