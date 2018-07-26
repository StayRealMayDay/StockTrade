package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class HoldinglevelrelationshipExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HoldinglevelrelationshipExample() {
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

        public Criteria andControlshareholderIsNull() {
            addCriterion("controlShareholder is null");
            return (Criteria) this;
        }

        public Criteria andControlshareholderIsNotNull() {
            addCriterion("controlShareholder is not null");
            return (Criteria) this;
        }

        public Criteria andControlshareholderEqualTo(String value) {
            addCriterion("controlShareholder =", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderNotEqualTo(String value) {
            addCriterion("controlShareholder <>", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderGreaterThan(String value) {
            addCriterion("controlShareholder >", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderGreaterThanOrEqualTo(String value) {
            addCriterion("controlShareholder >=", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderLessThan(String value) {
            addCriterion("controlShareholder <", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderLessThanOrEqualTo(String value) {
            addCriterion("controlShareholder <=", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderLike(String value) {
            addCriterion("controlShareholder like", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderNotLike(String value) {
            addCriterion("controlShareholder not like", value, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderIn(List<String> values) {
            addCriterion("controlShareholder in", values, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderNotIn(List<String> values) {
            addCriterion("controlShareholder not in", values, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderBetween(String value1, String value2) {
            addCriterion("controlShareholder between", value1, value2, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderNotBetween(String value1, String value2) {
            addCriterion("controlShareholder not between", value1, value2, "controlshareholder");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforIsNull() {
            addCriterion("controlShareholderInfor is null");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforIsNotNull() {
            addCriterion("controlShareholderInfor is not null");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforEqualTo(String value) {
            addCriterion("controlShareholderInfor =", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforNotEqualTo(String value) {
            addCriterion("controlShareholderInfor <>", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforGreaterThan(String value) {
            addCriterion("controlShareholderInfor >", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforGreaterThanOrEqualTo(String value) {
            addCriterion("controlShareholderInfor >=", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforLessThan(String value) {
            addCriterion("controlShareholderInfor <", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforLessThanOrEqualTo(String value) {
            addCriterion("controlShareholderInfor <=", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforLike(String value) {
            addCriterion("controlShareholderInfor like", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforNotLike(String value) {
            addCriterion("controlShareholderInfor not like", value, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforIn(List<String> values) {
            addCriterion("controlShareholderInfor in", values, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforNotIn(List<String> values) {
            addCriterion("controlShareholderInfor not in", values, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforBetween(String value1, String value2) {
            addCriterion("controlShareholderInfor between", value1, value2, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andControlshareholderinforNotBetween(String value1, String value2) {
            addCriterion("controlShareholderInfor not between", value1, value2, "controlshareholderinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIsNull() {
            addCriterion("actualController is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIsNotNull() {
            addCriterion("actualController is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerEqualTo(String value) {
            addCriterion("actualController =", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerNotEqualTo(String value) {
            addCriterion("actualController <>", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerGreaterThan(String value) {
            addCriterion("actualController >", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerGreaterThanOrEqualTo(String value) {
            addCriterion("actualController >=", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerLessThan(String value) {
            addCriterion("actualController <", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerLessThanOrEqualTo(String value) {
            addCriterion("actualController <=", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerLike(String value) {
            addCriterion("actualController like", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerNotLike(String value) {
            addCriterion("actualController not like", value, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerIn(List<String> values) {
            addCriterion("actualController in", values, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerNotIn(List<String> values) {
            addCriterion("actualController not in", values, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerBetween(String value1, String value2) {
            addCriterion("actualController between", value1, value2, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerNotBetween(String value1, String value2) {
            addCriterion("actualController not between", value1, value2, "actualcontroller");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforIsNull() {
            addCriterion("actualControllerInfor is null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforIsNotNull() {
            addCriterion("actualControllerInfor is not null");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforEqualTo(String value) {
            addCriterion("actualControllerInfor =", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforNotEqualTo(String value) {
            addCriterion("actualControllerInfor <>", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforGreaterThan(String value) {
            addCriterion("actualControllerInfor >", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforGreaterThanOrEqualTo(String value) {
            addCriterion("actualControllerInfor >=", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforLessThan(String value) {
            addCriterion("actualControllerInfor <", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforLessThanOrEqualTo(String value) {
            addCriterion("actualControllerInfor <=", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforLike(String value) {
            addCriterion("actualControllerInfor like", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforNotLike(String value) {
            addCriterion("actualControllerInfor not like", value, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforIn(List<String> values) {
            addCriterion("actualControllerInfor in", values, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforNotIn(List<String> values) {
            addCriterion("actualControllerInfor not in", values, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforBetween(String value1, String value2) {
            addCriterion("actualControllerInfor between", value1, value2, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andActualcontrollerinforNotBetween(String value1, String value2) {
            addCriterion("actualControllerInfor not between", value1, value2, "actualcontrollerinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolIsNull() {
            addCriterion("finalControl is null");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolIsNotNull() {
            addCriterion("finalControl is not null");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolEqualTo(String value) {
            addCriterion("finalControl =", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolNotEqualTo(String value) {
            addCriterion("finalControl <>", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolGreaterThan(String value) {
            addCriterion("finalControl >", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolGreaterThanOrEqualTo(String value) {
            addCriterion("finalControl >=", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolLessThan(String value) {
            addCriterion("finalControl <", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolLessThanOrEqualTo(String value) {
            addCriterion("finalControl <=", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolLike(String value) {
            addCriterion("finalControl like", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolNotLike(String value) {
            addCriterion("finalControl not like", value, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolIn(List<String> values) {
            addCriterion("finalControl in", values, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolNotIn(List<String> values) {
            addCriterion("finalControl not in", values, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolBetween(String value1, String value2) {
            addCriterion("finalControl between", value1, value2, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolNotBetween(String value1, String value2) {
            addCriterion("finalControl not between", value1, value2, "finalcontrol");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforIsNull() {
            addCriterion("finalControlInfor is null");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforIsNotNull() {
            addCriterion("finalControlInfor is not null");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforEqualTo(String value) {
            addCriterion("finalControlInfor =", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforNotEqualTo(String value) {
            addCriterion("finalControlInfor <>", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforGreaterThan(String value) {
            addCriterion("finalControlInfor >", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforGreaterThanOrEqualTo(String value) {
            addCriterion("finalControlInfor >=", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforLessThan(String value) {
            addCriterion("finalControlInfor <", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforLessThanOrEqualTo(String value) {
            addCriterion("finalControlInfor <=", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforLike(String value) {
            addCriterion("finalControlInfor like", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforNotLike(String value) {
            addCriterion("finalControlInfor not like", value, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforIn(List<String> values) {
            addCriterion("finalControlInfor in", values, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforNotIn(List<String> values) {
            addCriterion("finalControlInfor not in", values, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforBetween(String value1, String value2) {
            addCriterion("finalControlInfor between", value1, value2, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andFinalcontrolinforNotBetween(String value1, String value2) {
            addCriterion("finalControlInfor not between", value1, value2, "finalcontrolinfor");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromIsNull() {
            addCriterion("institutionNameFrom is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromIsNotNull() {
            addCriterion("institutionNameFrom is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromEqualTo(String value) {
            addCriterion("institutionNameFrom =", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromNotEqualTo(String value) {
            addCriterion("institutionNameFrom <>", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromGreaterThan(String value) {
            addCriterion("institutionNameFrom >", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromGreaterThanOrEqualTo(String value) {
            addCriterion("institutionNameFrom >=", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromLessThan(String value) {
            addCriterion("institutionNameFrom <", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromLessThanOrEqualTo(String value) {
            addCriterion("institutionNameFrom <=", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromLike(String value) {
            addCriterion("institutionNameFrom like", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromNotLike(String value) {
            addCriterion("institutionNameFrom not like", value, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromIn(List<String> values) {
            addCriterion("institutionNameFrom in", values, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromNotIn(List<String> values) {
            addCriterion("institutionNameFrom not in", values, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromBetween(String value1, String value2) {
            addCriterion("institutionNameFrom between", value1, value2, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnamefromNotBetween(String value1, String value2) {
            addCriterion("institutionNameFrom not between", value1, value2, "institutionnamefrom");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoIsNull() {
            addCriterion("institutionNameTo is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoIsNotNull() {
            addCriterion("institutionNameTo is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoEqualTo(String value) {
            addCriterion("institutionNameTo =", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoNotEqualTo(String value) {
            addCriterion("institutionNameTo <>", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoGreaterThan(String value) {
            addCriterion("institutionNameTo >", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoGreaterThanOrEqualTo(String value) {
            addCriterion("institutionNameTo >=", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoLessThan(String value) {
            addCriterion("institutionNameTo <", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoLessThanOrEqualTo(String value) {
            addCriterion("institutionNameTo <=", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoLike(String value) {
            addCriterion("institutionNameTo like", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoNotLike(String value) {
            addCriterion("institutionNameTo not like", value, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoIn(List<String> values) {
            addCriterion("institutionNameTo in", values, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoNotIn(List<String> values) {
            addCriterion("institutionNameTo not in", values, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoBetween(String value1, String value2) {
            addCriterion("institutionNameTo between", value1, value2, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andInstitutionnametoNotBetween(String value1, String value2) {
            addCriterion("institutionNameTo not between", value1, value2, "institutionnameto");
            return (Criteria) this;
        }

        public Criteria andHoldvalueIsNull() {
            addCriterion("holdValue is null");
            return (Criteria) this;
        }

        public Criteria andHoldvalueIsNotNull() {
            addCriterion("holdValue is not null");
            return (Criteria) this;
        }

        public Criteria andHoldvalueEqualTo(String value) {
            addCriterion("holdValue =", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueNotEqualTo(String value) {
            addCriterion("holdValue <>", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueGreaterThan(String value) {
            addCriterion("holdValue >", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueGreaterThanOrEqualTo(String value) {
            addCriterion("holdValue >=", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueLessThan(String value) {
            addCriterion("holdValue <", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueLessThanOrEqualTo(String value) {
            addCriterion("holdValue <=", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueLike(String value) {
            addCriterion("holdValue like", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueNotLike(String value) {
            addCriterion("holdValue not like", value, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueIn(List<String> values) {
            addCriterion("holdValue in", values, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueNotIn(List<String> values) {
            addCriterion("holdValue not in", values, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueBetween(String value1, String value2) {
            addCriterion("holdValue between", value1, value2, "holdvalue");
            return (Criteria) this;
        }

        public Criteria andHoldvalueNotBetween(String value1, String value2) {
            addCriterion("holdValue not between", value1, value2, "holdvalue");
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