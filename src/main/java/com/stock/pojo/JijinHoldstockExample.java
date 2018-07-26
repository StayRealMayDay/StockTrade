package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class JijinHoldstockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JijinHoldstockExample() {
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

        public Criteria andDatestopIsNull() {
            addCriterion("dateStop is null");
            return (Criteria) this;
        }

        public Criteria andDatestopIsNotNull() {
            addCriterion("dateStop is not null");
            return (Criteria) this;
        }

        public Criteria andDatestopEqualTo(String value) {
            addCriterion("dateStop =", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopNotEqualTo(String value) {
            addCriterion("dateStop <>", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopGreaterThan(String value) {
            addCriterion("dateStop >", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopGreaterThanOrEqualTo(String value) {
            addCriterion("dateStop >=", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopLessThan(String value) {
            addCriterion("dateStop <", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopLessThanOrEqualTo(String value) {
            addCriterion("dateStop <=", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopLike(String value) {
            addCriterion("dateStop like", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopNotLike(String value) {
            addCriterion("dateStop not like", value, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopIn(List<String> values) {
            addCriterion("dateStop in", values, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopNotIn(List<String> values) {
            addCriterion("dateStop not in", values, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopBetween(String value1, String value2) {
            addCriterion("dateStop between", value1, value2, "datestop");
            return (Criteria) this;
        }

        public Criteria andDatestopNotBetween(String value1, String value2) {
            addCriterion("dateStop not between", value1, value2, "datestop");
            return (Criteria) this;
        }

        public Criteria andJijinIdIsNull() {
            addCriterion("jiJin_id is null");
            return (Criteria) this;
        }

        public Criteria andJijinIdIsNotNull() {
            addCriterion("jiJin_id is not null");
            return (Criteria) this;
        }

        public Criteria andJijinIdEqualTo(String value) {
            addCriterion("jiJin_id =", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotEqualTo(String value) {
            addCriterion("jiJin_id <>", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdGreaterThan(String value) {
            addCriterion("jiJin_id >", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdGreaterThanOrEqualTo(String value) {
            addCriterion("jiJin_id >=", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLessThan(String value) {
            addCriterion("jiJin_id <", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLessThanOrEqualTo(String value) {
            addCriterion("jiJin_id <=", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdLike(String value) {
            addCriterion("jiJin_id like", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotLike(String value) {
            addCriterion("jiJin_id not like", value, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdIn(List<String> values) {
            addCriterion("jiJin_id in", values, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotIn(List<String> values) {
            addCriterion("jiJin_id not in", values, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdBetween(String value1, String value2) {
            addCriterion("jiJin_id between", value1, value2, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinIdNotBetween(String value1, String value2) {
            addCriterion("jiJin_id not between", value1, value2, "jijinId");
            return (Criteria) this;
        }

        public Criteria andJijinNameIsNull() {
            addCriterion("jiJin_name is null");
            return (Criteria) this;
        }

        public Criteria andJijinNameIsNotNull() {
            addCriterion("jiJin_name is not null");
            return (Criteria) this;
        }

        public Criteria andJijinNameEqualTo(String value) {
            addCriterion("jiJin_name =", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameNotEqualTo(String value) {
            addCriterion("jiJin_name <>", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameGreaterThan(String value) {
            addCriterion("jiJin_name >", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameGreaterThanOrEqualTo(String value) {
            addCriterion("jiJin_name >=", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameLessThan(String value) {
            addCriterion("jiJin_name <", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameLessThanOrEqualTo(String value) {
            addCriterion("jiJin_name <=", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameLike(String value) {
            addCriterion("jiJin_name like", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameNotLike(String value) {
            addCriterion("jiJin_name not like", value, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameIn(List<String> values) {
            addCriterion("jiJin_name in", values, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameNotIn(List<String> values) {
            addCriterion("jiJin_name not in", values, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameBetween(String value1, String value2) {
            addCriterion("jiJin_name between", value1, value2, "jijinName");
            return (Criteria) this;
        }

        public Criteria andJijinNameNotBetween(String value1, String value2) {
            addCriterion("jiJin_name not between", value1, value2, "jijinName");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyIsNull() {
            addCriterion("guanliCompany is null");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyIsNotNull() {
            addCriterion("guanliCompany is not null");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyEqualTo(String value) {
            addCriterion("guanliCompany =", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyNotEqualTo(String value) {
            addCriterion("guanliCompany <>", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyGreaterThan(String value) {
            addCriterion("guanliCompany >", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyGreaterThanOrEqualTo(String value) {
            addCriterion("guanliCompany >=", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyLessThan(String value) {
            addCriterion("guanliCompany <", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyLessThanOrEqualTo(String value) {
            addCriterion("guanliCompany <=", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyLike(String value) {
            addCriterion("guanliCompany like", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyNotLike(String value) {
            addCriterion("guanliCompany not like", value, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyIn(List<String> values) {
            addCriterion("guanliCompany in", values, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyNotIn(List<String> values) {
            addCriterion("guanliCompany not in", values, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyBetween(String value1, String value2) {
            addCriterion("guanliCompany between", value1, value2, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andGuanlicompanyNotBetween(String value1, String value2) {
            addCriterion("guanliCompany not between", value1, value2, "guanlicompany");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumIsNull() {
            addCriterion("holdStockNum is null");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumIsNotNull() {
            addCriterion("holdStockNum is not null");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumEqualTo(String value) {
            addCriterion("holdStockNum =", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumNotEqualTo(String value) {
            addCriterion("holdStockNum <>", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumGreaterThan(String value) {
            addCriterion("holdStockNum >", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumGreaterThanOrEqualTo(String value) {
            addCriterion("holdStockNum >=", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumLessThan(String value) {
            addCriterion("holdStockNum <", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumLessThanOrEqualTo(String value) {
            addCriterion("holdStockNum <=", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumLike(String value) {
            addCriterion("holdStockNum like", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumNotLike(String value) {
            addCriterion("holdStockNum not like", value, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumIn(List<String> values) {
            addCriterion("holdStockNum in", values, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumNotIn(List<String> values) {
            addCriterion("holdStockNum not in", values, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumBetween(String value1, String value2) {
            addCriterion("holdStockNum between", value1, value2, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldstocknumNotBetween(String value1, String value2) {
            addCriterion("holdStockNum not between", value1, value2, "holdstocknum");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateIsNull() {
            addCriterion("holdeStockRate is null");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateIsNotNull() {
            addCriterion("holdeStockRate is not null");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateEqualTo(String value) {
            addCriterion("holdeStockRate =", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateNotEqualTo(String value) {
            addCriterion("holdeStockRate <>", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateGreaterThan(String value) {
            addCriterion("holdeStockRate >", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateGreaterThanOrEqualTo(String value) {
            addCriterion("holdeStockRate >=", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateLessThan(String value) {
            addCriterion("holdeStockRate <", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateLessThanOrEqualTo(String value) {
            addCriterion("holdeStockRate <=", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateLike(String value) {
            addCriterion("holdeStockRate like", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateNotLike(String value) {
            addCriterion("holdeStockRate not like", value, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateIn(List<String> values) {
            addCriterion("holdeStockRate in", values, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateNotIn(List<String> values) {
            addCriterion("holdeStockRate not in", values, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateBetween(String value1, String value2) {
            addCriterion("holdeStockRate between", value1, value2, "holdestockrate");
            return (Criteria) this;
        }

        public Criteria andHoldestockrateNotBetween(String value1, String value2) {
            addCriterion("holdeStockRate not between", value1, value2, "holdestockrate");
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