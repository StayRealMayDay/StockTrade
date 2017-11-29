package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StockholderRelativeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockholderRelativeExample() {
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

        public Criteria andStockholderRelativeidIsNull() {
            addCriterion("stockholder_relativeid is null");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidIsNotNull() {
            addCriterion("stockholder_relativeid is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidEqualTo(String value) {
            addCriterion("stockholder_relativeid =", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidNotEqualTo(String value) {
            addCriterion("stockholder_relativeid <>", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidGreaterThan(String value) {
            addCriterion("stockholder_relativeid >", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_relativeid >=", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidLessThan(String value) {
            addCriterion("stockholder_relativeid <", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidLessThanOrEqualTo(String value) {
            addCriterion("stockholder_relativeid <=", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidLike(String value) {
            addCriterion("stockholder_relativeid like", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidNotLike(String value) {
            addCriterion("stockholder_relativeid not like", value, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidIn(List<String> values) {
            addCriterion("stockholder_relativeid in", values, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidNotIn(List<String> values) {
            addCriterion("stockholder_relativeid not in", values, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidBetween(String value1, String value2) {
            addCriterion("stockholder_relativeid between", value1, value2, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockholderRelativeidNotBetween(String value1, String value2) {
            addCriterion("stockholder_relativeid not between", value1, value2, "stockholderRelativeid");
            return (Criteria) this;
        }

        public Criteria andStockIsNull() {
            addCriterion("stock is null");
            return (Criteria) this;
        }

        public Criteria andStockIsNotNull() {
            addCriterion("stock is not null");
            return (Criteria) this;
        }

        public Criteria andStockEqualTo(String value) {
            addCriterion("stock =", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotEqualTo(String value) {
            addCriterion("stock <>", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThan(String value) {
            addCriterion("stock >", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockGreaterThanOrEqualTo(String value) {
            addCriterion("stock >=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThan(String value) {
            addCriterion("stock <", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLessThanOrEqualTo(String value) {
            addCriterion("stock <=", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockLike(String value) {
            addCriterion("stock like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotLike(String value) {
            addCriterion("stock not like", value, "stock");
            return (Criteria) this;
        }

        public Criteria andStockIn(List<String> values) {
            addCriterion("stock in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotIn(List<String> values) {
            addCriterion("stock not in", values, "stock");
            return (Criteria) this;
        }

        public Criteria andStockBetween(String value1, String value2) {
            addCriterion("stock between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andStockNotBetween(String value1, String value2) {
            addCriterion("stock not between", value1, value2, "stock");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(String value) {
            addCriterion("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(String value) {
            addCriterion("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(String value) {
            addCriterion("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(String value) {
            addCriterion("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(String value) {
            addCriterion("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(String value) {
            addCriterion("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLike(String value) {
            addCriterion("deadline like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotLike(String value) {
            addCriterion("deadline not like", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<String> values) {
            addCriterion("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<String> values) {
            addCriterion("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(String value1, String value2) {
            addCriterion("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(String value1, String value2) {
            addCriterion("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateIsNull() {
            addCriterion("declaration_date is null");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateIsNotNull() {
            addCriterion("declaration_date is not null");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateEqualTo(String value) {
            addCriterion("declaration_date =", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateNotEqualTo(String value) {
            addCriterion("declaration_date <>", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateGreaterThan(String value) {
            addCriterion("declaration_date >", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateGreaterThanOrEqualTo(String value) {
            addCriterion("declaration_date >=", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateLessThan(String value) {
            addCriterion("declaration_date <", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateLessThanOrEqualTo(String value) {
            addCriterion("declaration_date <=", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateLike(String value) {
            addCriterion("declaration_date like", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateNotLike(String value) {
            addCriterion("declaration_date not like", value, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateIn(List<String> values) {
            addCriterion("declaration_date in", values, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateNotIn(List<String> values) {
            addCriterion("declaration_date not in", values, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateBetween(String value1, String value2) {
            addCriterion("declaration_date between", value1, value2, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andDeclarationDateNotBetween(String value1, String value2) {
            addCriterion("declaration_date not between", value1, value2, "declarationDate");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareIsNull() {
            addCriterion("stockholder_declare is null");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareIsNotNull() {
            addCriterion("stockholder_declare is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareEqualTo(String value) {
            addCriterion("stockholder_declare =", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareNotEqualTo(String value) {
            addCriterion("stockholder_declare <>", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareGreaterThan(String value) {
            addCriterion("stockholder_declare >", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_declare >=", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareLessThan(String value) {
            addCriterion("stockholder_declare <", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareLessThanOrEqualTo(String value) {
            addCriterion("stockholder_declare <=", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareLike(String value) {
            addCriterion("stockholder_declare like", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareNotLike(String value) {
            addCriterion("stockholder_declare not like", value, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareIn(List<String> values) {
            addCriterion("stockholder_declare in", values, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareNotIn(List<String> values) {
            addCriterion("stockholder_declare not in", values, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareBetween(String value1, String value2) {
            addCriterion("stockholder_declare between", value1, value2, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderDeclareNotBetween(String value1, String value2) {
            addCriterion("stockholder_declare not between", value1, value2, "stockholderDeclare");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalIsNull() {
            addCriterion("stockholder_total is null");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalIsNotNull() {
            addCriterion("stockholder_total is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalEqualTo(String value) {
            addCriterion("stockholder_total =", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalNotEqualTo(String value) {
            addCriterion("stockholder_total <>", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalGreaterThan(String value) {
            addCriterion("stockholder_total >", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalGreaterThanOrEqualTo(String value) {
            addCriterion("stockholder_total >=", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalLessThan(String value) {
            addCriterion("stockholder_total <", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalLessThanOrEqualTo(String value) {
            addCriterion("stockholder_total <=", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalLike(String value) {
            addCriterion("stockholder_total like", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalNotLike(String value) {
            addCriterion("stockholder_total not like", value, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalIn(List<String> values) {
            addCriterion("stockholder_total in", values, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalNotIn(List<String> values) {
            addCriterion("stockholder_total not in", values, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalBetween(String value1, String value2) {
            addCriterion("stockholder_total between", value1, value2, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholderTotalNotBetween(String value1, String value2) {
            addCriterion("stockholder_total not between", value1, value2, "stockholderTotal");
            return (Criteria) this;
        }

        public Criteria andStockholdAveIsNull() {
            addCriterion("stockhold_ave is null");
            return (Criteria) this;
        }

        public Criteria andStockholdAveIsNotNull() {
            addCriterion("stockhold_ave is not null");
            return (Criteria) this;
        }

        public Criteria andStockholdAveEqualTo(String value) {
            addCriterion("stockhold_ave =", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveNotEqualTo(String value) {
            addCriterion("stockhold_ave <>", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveGreaterThan(String value) {
            addCriterion("stockhold_ave >", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveGreaterThanOrEqualTo(String value) {
            addCriterion("stockhold_ave >=", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveLessThan(String value) {
            addCriterion("stockhold_ave <", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveLessThanOrEqualTo(String value) {
            addCriterion("stockhold_ave <=", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveLike(String value) {
            addCriterion("stockhold_ave like", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveNotLike(String value) {
            addCriterion("stockhold_ave not like", value, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveIn(List<String> values) {
            addCriterion("stockhold_ave in", values, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveNotIn(List<String> values) {
            addCriterion("stockhold_ave not in", values, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveBetween(String value1, String value2) {
            addCriterion("stockhold_ave between", value1, value2, "stockholdAve");
            return (Criteria) this;
        }

        public Criteria andStockholdAveNotBetween(String value1, String value2) {
            addCriterion("stockhold_ave not between", value1, value2, "stockholdAve");
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