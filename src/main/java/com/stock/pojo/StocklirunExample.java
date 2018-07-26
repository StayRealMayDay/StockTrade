package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class StocklirunExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StocklirunExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andAllcomeinIsNull() {
            addCriterion("allComeIn is null");
            return (Criteria) this;
        }

        public Criteria andAllcomeinIsNotNull() {
            addCriterion("allComeIn is not null");
            return (Criteria) this;
        }

        public Criteria andAllcomeinEqualTo(String value) {
            addCriterion("allComeIn =", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinNotEqualTo(String value) {
            addCriterion("allComeIn <>", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinGreaterThan(String value) {
            addCriterion("allComeIn >", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinGreaterThanOrEqualTo(String value) {
            addCriterion("allComeIn >=", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinLessThan(String value) {
            addCriterion("allComeIn <", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinLessThanOrEqualTo(String value) {
            addCriterion("allComeIn <=", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinLike(String value) {
            addCriterion("allComeIn like", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinNotLike(String value) {
            addCriterion("allComeIn not like", value, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinIn(List<String> values) {
            addCriterion("allComeIn in", values, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinNotIn(List<String> values) {
            addCriterion("allComeIn not in", values, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinBetween(String value1, String value2) {
            addCriterion("allComeIn between", value1, value2, "allcomein");
            return (Criteria) this;
        }

        public Criteria andAllcomeinNotBetween(String value1, String value2) {
            addCriterion("allComeIn not between", value1, value2, "allcomein");
            return (Criteria) this;
        }

        public Criteria andComeinIsNull() {
            addCriterion("comeIn is null");
            return (Criteria) this;
        }

        public Criteria andComeinIsNotNull() {
            addCriterion("comeIn is not null");
            return (Criteria) this;
        }

        public Criteria andComeinEqualTo(String value) {
            addCriterion("comeIn =", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinNotEqualTo(String value) {
            addCriterion("comeIn <>", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinGreaterThan(String value) {
            addCriterion("comeIn >", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinGreaterThanOrEqualTo(String value) {
            addCriterion("comeIn >=", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinLessThan(String value) {
            addCriterion("comeIn <", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinLessThanOrEqualTo(String value) {
            addCriterion("comeIn <=", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinLike(String value) {
            addCriterion("comeIn like", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinNotLike(String value) {
            addCriterion("comeIn not like", value, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinIn(List<String> values) {
            addCriterion("comeIn in", values, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinNotIn(List<String> values) {
            addCriterion("comeIn not in", values, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinBetween(String value1, String value2) {
            addCriterion("comeIn between", value1, value2, "comein");
            return (Criteria) this;
        }

        public Criteria andComeinNotBetween(String value1, String value2) {
            addCriterion("comeIn not between", value1, value2, "comein");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenIsNull() {
            addCriterion("allYingYeChengBen is null");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenIsNotNull() {
            addCriterion("allYingYeChengBen is not null");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenEqualTo(String value) {
            addCriterion("allYingYeChengBen =", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenNotEqualTo(String value) {
            addCriterion("allYingYeChengBen <>", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenGreaterThan(String value) {
            addCriterion("allYingYeChengBen >", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenGreaterThanOrEqualTo(String value) {
            addCriterion("allYingYeChengBen >=", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenLessThan(String value) {
            addCriterion("allYingYeChengBen <", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenLessThanOrEqualTo(String value) {
            addCriterion("allYingYeChengBen <=", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenLike(String value) {
            addCriterion("allYingYeChengBen like", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenNotLike(String value) {
            addCriterion("allYingYeChengBen not like", value, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenIn(List<String> values) {
            addCriterion("allYingYeChengBen in", values, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenNotIn(List<String> values) {
            addCriterion("allYingYeChengBen not in", values, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenBetween(String value1, String value2) {
            addCriterion("allYingYeChengBen between", value1, value2, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andAllyingyechengbenNotBetween(String value1, String value2) {
            addCriterion("allYingYeChengBen not between", value1, value2, "allyingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenIsNull() {
            addCriterion("yingYeChengBen is null");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenIsNotNull() {
            addCriterion("yingYeChengBen is not null");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenEqualTo(String value) {
            addCriterion("yingYeChengBen =", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenNotEqualTo(String value) {
            addCriterion("yingYeChengBen <>", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenGreaterThan(String value) {
            addCriterion("yingYeChengBen >", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenGreaterThanOrEqualTo(String value) {
            addCriterion("yingYeChengBen >=", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenLessThan(String value) {
            addCriterion("yingYeChengBen <", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenLessThanOrEqualTo(String value) {
            addCriterion("yingYeChengBen <=", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenLike(String value) {
            addCriterion("yingYeChengBen like", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenNotLike(String value) {
            addCriterion("yingYeChengBen not like", value, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenIn(List<String> values) {
            addCriterion("yingYeChengBen in", values, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenNotIn(List<String> values) {
            addCriterion("yingYeChengBen not in", values, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenBetween(String value1, String value2) {
            addCriterion("yingYeChengBen between", value1, value2, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andYingyechengbenNotBetween(String value1, String value2) {
            addCriterion("yingYeChengBen not between", value1, value2, "yingyechengben");
            return (Criteria) this;
        }

        public Criteria andAlllirunIsNull() {
            addCriterion("allLiRun is null");
            return (Criteria) this;
        }

        public Criteria andAlllirunIsNotNull() {
            addCriterion("allLiRun is not null");
            return (Criteria) this;
        }

        public Criteria andAlllirunEqualTo(String value) {
            addCriterion("allLiRun =", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunNotEqualTo(String value) {
            addCriterion("allLiRun <>", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunGreaterThan(String value) {
            addCriterion("allLiRun >", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunGreaterThanOrEqualTo(String value) {
            addCriterion("allLiRun >=", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunLessThan(String value) {
            addCriterion("allLiRun <", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunLessThanOrEqualTo(String value) {
            addCriterion("allLiRun <=", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunLike(String value) {
            addCriterion("allLiRun like", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunNotLike(String value) {
            addCriterion("allLiRun not like", value, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunIn(List<String> values) {
            addCriterion("allLiRun in", values, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunNotIn(List<String> values) {
            addCriterion("allLiRun not in", values, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunBetween(String value1, String value2) {
            addCriterion("allLiRun between", value1, value2, "alllirun");
            return (Criteria) this;
        }

        public Criteria andAlllirunNotBetween(String value1, String value2) {
            addCriterion("allLiRun not between", value1, value2, "alllirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunIsNull() {
            addCriterion("jingLiRun is null");
            return (Criteria) this;
        }

        public Criteria andJinglirunIsNotNull() {
            addCriterion("jingLiRun is not null");
            return (Criteria) this;
        }

        public Criteria andJinglirunEqualTo(String value) {
            addCriterion("jingLiRun =", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunNotEqualTo(String value) {
            addCriterion("jingLiRun <>", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunGreaterThan(String value) {
            addCriterion("jingLiRun >", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunGreaterThanOrEqualTo(String value) {
            addCriterion("jingLiRun >=", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunLessThan(String value) {
            addCriterion("jingLiRun <", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunLessThanOrEqualTo(String value) {
            addCriterion("jingLiRun <=", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunLike(String value) {
            addCriterion("jingLiRun like", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunNotLike(String value) {
            addCriterion("jingLiRun not like", value, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunIn(List<String> values) {
            addCriterion("jingLiRun in", values, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunNotIn(List<String> values) {
            addCriterion("jingLiRun not in", values, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunBetween(String value1, String value2) {
            addCriterion("jingLiRun between", value1, value2, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andJinglirunNotBetween(String value1, String value2) {
            addCriterion("jingLiRun not between", value1, value2, "jinglirun");
            return (Criteria) this;
        }

        public Criteria andEachshouyiIsNull() {
            addCriterion("eachShouYi is null");
            return (Criteria) this;
        }

        public Criteria andEachshouyiIsNotNull() {
            addCriterion("eachShouYi is not null");
            return (Criteria) this;
        }

        public Criteria andEachshouyiEqualTo(String value) {
            addCriterion("eachShouYi =", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiNotEqualTo(String value) {
            addCriterion("eachShouYi <>", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiGreaterThan(String value) {
            addCriterion("eachShouYi >", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiGreaterThanOrEqualTo(String value) {
            addCriterion("eachShouYi >=", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiLessThan(String value) {
            addCriterion("eachShouYi <", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiLessThanOrEqualTo(String value) {
            addCriterion("eachShouYi <=", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiLike(String value) {
            addCriterion("eachShouYi like", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiNotLike(String value) {
            addCriterion("eachShouYi not like", value, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiIn(List<String> values) {
            addCriterion("eachShouYi in", values, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiNotIn(List<String> values) {
            addCriterion("eachShouYi not in", values, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiBetween(String value1, String value2) {
            addCriterion("eachShouYi between", value1, value2, "eachshouyi");
            return (Criteria) this;
        }

        public Criteria andEachshouyiNotBetween(String value1, String value2) {
            addCriterion("eachShouYi not between", value1, value2, "eachshouyi");
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