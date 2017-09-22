package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class ScrapyNewsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScrapyNewsExample() {
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

        public Criteria andOperateDateIsNull() {
            addCriterion("operate_date is null");
            return (Criteria) this;
        }

        public Criteria andOperateDateIsNotNull() {
            addCriterion("operate_date is not null");
            return (Criteria) this;
        }

        public Criteria andOperateDateEqualTo(String value) {
            addCriterion("operate_date =", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotEqualTo(String value) {
            addCriterion("operate_date <>", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThan(String value) {
            addCriterion("operate_date >", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateGreaterThanOrEqualTo(String value) {
            addCriterion("operate_date >=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThan(String value) {
            addCriterion("operate_date <", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLessThanOrEqualTo(String value) {
            addCriterion("operate_date <=", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateLike(String value) {
            addCriterion("operate_date like", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotLike(String value) {
            addCriterion("operate_date not like", value, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateIn(List<String> values) {
            addCriterion("operate_date in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotIn(List<String> values) {
            addCriterion("operate_date not in", values, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateBetween(String value1, String value2) {
            addCriterion("operate_date between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andOperateDateNotBetween(String value1, String value2) {
            addCriterion("operate_date not between", value1, value2, "operateDate");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10IsNull() {
            addCriterion("avgupdn10 is null");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10IsNotNull() {
            addCriterion("avgupdn10 is not null");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10EqualTo(String value) {
            addCriterion("avgupdn10 =", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10NotEqualTo(String value) {
            addCriterion("avgupdn10 <>", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10GreaterThan(String value) {
            addCriterion("avgupdn10 >", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10GreaterThanOrEqualTo(String value) {
            addCriterion("avgupdn10 >=", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10LessThan(String value) {
            addCriterion("avgupdn10 <", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10LessThanOrEqualTo(String value) {
            addCriterion("avgupdn10 <=", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10Like(String value) {
            addCriterion("avgupdn10 like", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10NotLike(String value) {
            addCriterion("avgupdn10 not like", value, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10In(List<String> values) {
            addCriterion("avgupdn10 in", values, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10NotIn(List<String> values) {
            addCriterion("avgupdn10 not in", values, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10Between(String value1, String value2) {
            addCriterion("avgupdn10 between", value1, value2, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andAvgupdn10NotBetween(String value1, String value2) {
            addCriterion("avgupdn10 not between", value1, value2, "avgupdn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10IsNull() {
            addCriterion("updn10 is null");
            return (Criteria) this;
        }

        public Criteria andUpdn10IsNotNull() {
            addCriterion("updn10 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdn10EqualTo(String value) {
            addCriterion("updn10 =", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10NotEqualTo(String value) {
            addCriterion("updn10 <>", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10GreaterThan(String value) {
            addCriterion("updn10 >", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10GreaterThanOrEqualTo(String value) {
            addCriterion("updn10 >=", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10LessThan(String value) {
            addCriterion("updn10 <", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10LessThanOrEqualTo(String value) {
            addCriterion("updn10 <=", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10Like(String value) {
            addCriterion("updn10 like", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10NotLike(String value) {
            addCriterion("updn10 not like", value, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10In(List<String> values) {
            addCriterion("updn10 in", values, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10NotIn(List<String> values) {
            addCriterion("updn10 not in", values, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10Between(String value1, String value2) {
            addCriterion("updn10 between", value1, value2, "updn10");
            return (Criteria) this;
        }

        public Criteria andUpdn10NotBetween(String value1, String value2) {
            addCriterion("updn10 not between", value1, value2, "updn10");
            return (Criteria) this;
        }

        public Criteria andAvgday10IsNull() {
            addCriterion("avgday10 is null");
            return (Criteria) this;
        }

        public Criteria andAvgday10IsNotNull() {
            addCriterion("avgday10 is not null");
            return (Criteria) this;
        }

        public Criteria andAvgday10EqualTo(String value) {
            addCriterion("avgday10 =", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10NotEqualTo(String value) {
            addCriterion("avgday10 <>", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10GreaterThan(String value) {
            addCriterion("avgday10 >", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10GreaterThanOrEqualTo(String value) {
            addCriterion("avgday10 >=", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10LessThan(String value) {
            addCriterion("avgday10 <", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10LessThanOrEqualTo(String value) {
            addCriterion("avgday10 <=", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10Like(String value) {
            addCriterion("avgday10 like", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10NotLike(String value) {
            addCriterion("avgday10 not like", value, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10In(List<String> values) {
            addCriterion("avgday10 in", values, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10NotIn(List<String> values) {
            addCriterion("avgday10 not in", values, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10Between(String value1, String value2) {
            addCriterion("avgday10 between", value1, value2, "avgday10");
            return (Criteria) this;
        }

        public Criteria andAvgday10NotBetween(String value1, String value2) {
            addCriterion("avgday10 not between", value1, value2, "avgday10");
            return (Criteria) this;
        }

        public Criteria andUpdn05IsNull() {
            addCriterion("updn05 is null");
            return (Criteria) this;
        }

        public Criteria andUpdn05IsNotNull() {
            addCriterion("updn05 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdn05EqualTo(String value) {
            addCriterion("updn05 =", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05NotEqualTo(String value) {
            addCriterion("updn05 <>", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05GreaterThan(String value) {
            addCriterion("updn05 >", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05GreaterThanOrEqualTo(String value) {
            addCriterion("updn05 >=", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05LessThan(String value) {
            addCriterion("updn05 <", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05LessThanOrEqualTo(String value) {
            addCriterion("updn05 <=", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05Like(String value) {
            addCriterion("updn05 like", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05NotLike(String value) {
            addCriterion("updn05 not like", value, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05In(List<String> values) {
            addCriterion("updn05 in", values, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05NotIn(List<String> values) {
            addCriterion("updn05 not in", values, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05Between(String value1, String value2) {
            addCriterion("updn05 between", value1, value2, "updn05");
            return (Criteria) this;
        }

        public Criteria andUpdn05NotBetween(String value1, String value2) {
            addCriterion("updn05 not between", value1, value2, "updn05");
            return (Criteria) this;
        }

        public Criteria andAvgday05IsNull() {
            addCriterion("avgday05 is null");
            return (Criteria) this;
        }

        public Criteria andAvgday05IsNotNull() {
            addCriterion("avgday05 is not null");
            return (Criteria) this;
        }

        public Criteria andAvgday05EqualTo(String value) {
            addCriterion("avgday05 =", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05NotEqualTo(String value) {
            addCriterion("avgday05 <>", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05GreaterThan(String value) {
            addCriterion("avgday05 >", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05GreaterThanOrEqualTo(String value) {
            addCriterion("avgday05 >=", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05LessThan(String value) {
            addCriterion("avgday05 <", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05LessThanOrEqualTo(String value) {
            addCriterion("avgday05 <=", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05Like(String value) {
            addCriterion("avgday05 like", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05NotLike(String value) {
            addCriterion("avgday05 not like", value, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05In(List<String> values) {
            addCriterion("avgday05 in", values, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05NotIn(List<String> values) {
            addCriterion("avgday05 not in", values, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05Between(String value1, String value2) {
            addCriterion("avgday05 between", value1, value2, "avgday05");
            return (Criteria) this;
        }

        public Criteria andAvgday05NotBetween(String value1, String value2) {
            addCriterion("avgday05 not between", value1, value2, "avgday05");
            return (Criteria) this;
        }

        public Criteria andUpdn03IsNull() {
            addCriterion("updn03 is null");
            return (Criteria) this;
        }

        public Criteria andUpdn03IsNotNull() {
            addCriterion("updn03 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdn03EqualTo(String value) {
            addCriterion("updn03 =", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03NotEqualTo(String value) {
            addCriterion("updn03 <>", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03GreaterThan(String value) {
            addCriterion("updn03 >", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03GreaterThanOrEqualTo(String value) {
            addCriterion("updn03 >=", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03LessThan(String value) {
            addCriterion("updn03 <", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03LessThanOrEqualTo(String value) {
            addCriterion("updn03 <=", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03Like(String value) {
            addCriterion("updn03 like", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03NotLike(String value) {
            addCriterion("updn03 not like", value, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03In(List<String> values) {
            addCriterion("updn03 in", values, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03NotIn(List<String> values) {
            addCriterion("updn03 not in", values, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03Between(String value1, String value2) {
            addCriterion("updn03 between", value1, value2, "updn03");
            return (Criteria) this;
        }

        public Criteria andUpdn03NotBetween(String value1, String value2) {
            addCriterion("updn03 not between", value1, value2, "updn03");
            return (Criteria) this;
        }

        public Criteria andAvgday03IsNull() {
            addCriterion("avgday03 is null");
            return (Criteria) this;
        }

        public Criteria andAvgday03IsNotNull() {
            addCriterion("avgday03 is not null");
            return (Criteria) this;
        }

        public Criteria andAvgday03EqualTo(String value) {
            addCriterion("avgday03 =", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03NotEqualTo(String value) {
            addCriterion("avgday03 <>", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03GreaterThan(String value) {
            addCriterion("avgday03 >", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03GreaterThanOrEqualTo(String value) {
            addCriterion("avgday03 >=", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03LessThan(String value) {
            addCriterion("avgday03 <", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03LessThanOrEqualTo(String value) {
            addCriterion("avgday03 <=", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03Like(String value) {
            addCriterion("avgday03 like", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03NotLike(String value) {
            addCriterion("avgday03 not like", value, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03In(List<String> values) {
            addCriterion("avgday03 in", values, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03NotIn(List<String> values) {
            addCriterion("avgday03 not in", values, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03Between(String value1, String value2) {
            addCriterion("avgday03 between", value1, value2, "avgday03");
            return (Criteria) this;
        }

        public Criteria andAvgday03NotBetween(String value1, String value2) {
            addCriterion("avgday03 not between", value1, value2, "avgday03");
            return (Criteria) this;
        }

        public Criteria andUpdn01IsNull() {
            addCriterion("updn01 is null");
            return (Criteria) this;
        }

        public Criteria andUpdn01IsNotNull() {
            addCriterion("updn01 is not null");
            return (Criteria) this;
        }

        public Criteria andUpdn01EqualTo(String value) {
            addCriterion("updn01 =", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01NotEqualTo(String value) {
            addCriterion("updn01 <>", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01GreaterThan(String value) {
            addCriterion("updn01 >", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01GreaterThanOrEqualTo(String value) {
            addCriterion("updn01 >=", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01LessThan(String value) {
            addCriterion("updn01 <", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01LessThanOrEqualTo(String value) {
            addCriterion("updn01 <=", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01Like(String value) {
            addCriterion("updn01 like", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01NotLike(String value) {
            addCriterion("updn01 not like", value, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01In(List<String> values) {
            addCriterion("updn01 in", values, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01NotIn(List<String> values) {
            addCriterion("updn01 not in", values, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01Between(String value1, String value2) {
            addCriterion("updn01 between", value1, value2, "updn01");
            return (Criteria) this;
        }

        public Criteria andUpdn01NotBetween(String value1, String value2) {
            addCriterion("updn01 not between", value1, value2, "updn01");
            return (Criteria) this;
        }

        public Criteria andAvgday01IsNull() {
            addCriterion("avgday01 is null");
            return (Criteria) this;
        }

        public Criteria andAvgday01IsNotNull() {
            addCriterion("avgday01 is not null");
            return (Criteria) this;
        }

        public Criteria andAvgday01EqualTo(String value) {
            addCriterion("avgday01 =", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01NotEqualTo(String value) {
            addCriterion("avgday01 <>", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01GreaterThan(String value) {
            addCriterion("avgday01 >", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01GreaterThanOrEqualTo(String value) {
            addCriterion("avgday01 >=", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01LessThan(String value) {
            addCriterion("avgday01 <", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01LessThanOrEqualTo(String value) {
            addCriterion("avgday01 <=", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01Like(String value) {
            addCriterion("avgday01 like", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01NotLike(String value) {
            addCriterion("avgday01 not like", value, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01In(List<String> values) {
            addCriterion("avgday01 in", values, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01NotIn(List<String> values) {
            addCriterion("avgday01 not in", values, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01Between(String value1, String value2) {
            addCriterion("avgday01 between", value1, value2, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAvgday01NotBetween(String value1, String value2) {
            addCriterion("avgday01 not between", value1, value2, "avgday01");
            return (Criteria) this;
        }

        public Criteria andAmountcIsNull() {
            addCriterion("amountc is null");
            return (Criteria) this;
        }

        public Criteria andAmountcIsNotNull() {
            addCriterion("amountc is not null");
            return (Criteria) this;
        }

        public Criteria andAmountcEqualTo(String value) {
            addCriterion("amountc =", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcNotEqualTo(String value) {
            addCriterion("amountc <>", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcGreaterThan(String value) {
            addCriterion("amountc >", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcGreaterThanOrEqualTo(String value) {
            addCriterion("amountc >=", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcLessThan(String value) {
            addCriterion("amountc <", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcLessThanOrEqualTo(String value) {
            addCriterion("amountc <=", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcLike(String value) {
            addCriterion("amountc like", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcNotLike(String value) {
            addCriterion("amountc not like", value, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcIn(List<String> values) {
            addCriterion("amountc in", values, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcNotIn(List<String> values) {
            addCriterion("amountc not in", values, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcBetween(String value1, String value2) {
            addCriterion("amountc between", value1, value2, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountcNotBetween(String value1, String value2) {
            addCriterion("amountc not between", value1, value2, "amountc");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(String value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(String value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(String value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(String value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(String value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLike(String value) {
            addCriterion("volume like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotLike(String value) {
            addCriterion("volume not like", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<String> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<String> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(String value1, String value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(String value1, String value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andCloseavg10IsNull() {
            addCriterion("closeavg10 is null");
            return (Criteria) this;
        }

        public Criteria andCloseavg10IsNotNull() {
            addCriterion("closeavg10 is not null");
            return (Criteria) this;
        }

        public Criteria andCloseavg10EqualTo(String value) {
            addCriterion("closeavg10 =", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10NotEqualTo(String value) {
            addCriterion("closeavg10 <>", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10GreaterThan(String value) {
            addCriterion("closeavg10 >", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10GreaterThanOrEqualTo(String value) {
            addCriterion("closeavg10 >=", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10LessThan(String value) {
            addCriterion("closeavg10 <", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10LessThanOrEqualTo(String value) {
            addCriterion("closeavg10 <=", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10Like(String value) {
            addCriterion("closeavg10 like", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10NotLike(String value) {
            addCriterion("closeavg10 not like", value, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10In(List<String> values) {
            addCriterion("closeavg10 in", values, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10NotIn(List<String> values) {
            addCriterion("closeavg10 not in", values, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10Between(String value1, String value2) {
            addCriterion("closeavg10 between", value1, value2, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavg10NotBetween(String value1, String value2) {
            addCriterion("closeavg10 not between", value1, value2, "closeavg10");
            return (Criteria) this;
        }

        public Criteria andCloseavglIsNull() {
            addCriterion("closeavgl is null");
            return (Criteria) this;
        }

        public Criteria andCloseavglIsNotNull() {
            addCriterion("closeavgl is not null");
            return (Criteria) this;
        }

        public Criteria andCloseavglEqualTo(String value) {
            addCriterion("closeavgl =", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglNotEqualTo(String value) {
            addCriterion("closeavgl <>", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglGreaterThan(String value) {
            addCriterion("closeavgl >", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglGreaterThanOrEqualTo(String value) {
            addCriterion("closeavgl >=", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglLessThan(String value) {
            addCriterion("closeavgl <", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglLessThanOrEqualTo(String value) {
            addCriterion("closeavgl <=", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglLike(String value) {
            addCriterion("closeavgl like", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglNotLike(String value) {
            addCriterion("closeavgl not like", value, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglIn(List<String> values) {
            addCriterion("closeavgl in", values, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglNotIn(List<String> values) {
            addCriterion("closeavgl not in", values, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglBetween(String value1, String value2) {
            addCriterion("closeavgl between", value1, value2, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andCloseavglNotBetween(String value1, String value2) {
            addCriterion("closeavgl not between", value1, value2, "closeavgl");
            return (Criteria) this;
        }

        public Criteria andClosepIsNull() {
            addCriterion("closep is null");
            return (Criteria) this;
        }

        public Criteria andClosepIsNotNull() {
            addCriterion("closep is not null");
            return (Criteria) this;
        }

        public Criteria andClosepEqualTo(String value) {
            addCriterion("closep =", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepNotEqualTo(String value) {
            addCriterion("closep <>", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepGreaterThan(String value) {
            addCriterion("closep >", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepGreaterThanOrEqualTo(String value) {
            addCriterion("closep >=", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepLessThan(String value) {
            addCriterion("closep <", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepLessThanOrEqualTo(String value) {
            addCriterion("closep <=", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepLike(String value) {
            addCriterion("closep like", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepNotLike(String value) {
            addCriterion("closep not like", value, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepIn(List<String> values) {
            addCriterion("closep in", values, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepNotIn(List<String> values) {
            addCriterion("closep not in", values, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepBetween(String value1, String value2) {
            addCriterion("closep between", value1, value2, "closep");
            return (Criteria) this;
        }

        public Criteria andClosepNotBetween(String value1, String value2) {
            addCriterion("closep not between", value1, value2, "closep");
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

        public Criteria andLowIsNull() {
            addCriterion("low is null");
            return (Criteria) this;
        }

        public Criteria andLowIsNotNull() {
            addCriterion("low is not null");
            return (Criteria) this;
        }

        public Criteria andLowEqualTo(String value) {
            addCriterion("low =", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotEqualTo(String value) {
            addCriterion("low <>", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThan(String value) {
            addCriterion("low >", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowGreaterThanOrEqualTo(String value) {
            addCriterion("low >=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThan(String value) {
            addCriterion("low <", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLessThanOrEqualTo(String value) {
            addCriterion("low <=", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowLike(String value) {
            addCriterion("low like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotLike(String value) {
            addCriterion("low not like", value, "low");
            return (Criteria) this;
        }

        public Criteria andLowIn(List<String> values) {
            addCriterion("low in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotIn(List<String> values) {
            addCriterion("low not in", values, "low");
            return (Criteria) this;
        }

        public Criteria andLowBetween(String value1, String value2) {
            addCriterion("low between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andLowNotBetween(String value1, String value2) {
            addCriterion("low not between", value1, value2, "low");
            return (Criteria) this;
        }

        public Criteria andHighIsNull() {
            addCriterion("high is null");
            return (Criteria) this;
        }

        public Criteria andHighIsNotNull() {
            addCriterion("high is not null");
            return (Criteria) this;
        }

        public Criteria andHighEqualTo(String value) {
            addCriterion("high =", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotEqualTo(String value) {
            addCriterion("high <>", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThan(String value) {
            addCriterion("high >", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighGreaterThanOrEqualTo(String value) {
            addCriterion("high >=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThan(String value) {
            addCriterion("high <", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLessThanOrEqualTo(String value) {
            addCriterion("high <=", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighLike(String value) {
            addCriterion("high like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotLike(String value) {
            addCriterion("high not like", value, "high");
            return (Criteria) this;
        }

        public Criteria andHighIn(List<String> values) {
            addCriterion("high in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotIn(List<String> values) {
            addCriterion("high not in", values, "high");
            return (Criteria) this;
        }

        public Criteria andHighBetween(String value1, String value2) {
            addCriterion("high between", value1, value2, "high");
            return (Criteria) this;
        }

        public Criteria andHighNotBetween(String value1, String value2) {
            addCriterion("high not between", value1, value2, "high");
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

        public Criteria andSecondCategoryIsNull() {
            addCriterion("second_category is null");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryIsNotNull() {
            addCriterion("second_category is not null");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryEqualTo(String value) {
            addCriterion("second_category =", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotEqualTo(String value) {
            addCriterion("second_category <>", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryGreaterThan(String value) {
            addCriterion("second_category >", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("second_category >=", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLessThan(String value) {
            addCriterion("second_category <", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLessThanOrEqualTo(String value) {
            addCriterion("second_category <=", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryLike(String value) {
            addCriterion("second_category like", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotLike(String value) {
            addCriterion("second_category not like", value, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryIn(List<String> values) {
            addCriterion("second_category in", values, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotIn(List<String> values) {
            addCriterion("second_category not in", values, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryBetween(String value1, String value2) {
            addCriterion("second_category between", value1, value2, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andSecondCategoryNotBetween(String value1, String value2) {
            addCriterion("second_category not between", value1, value2, "secondCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIsNull() {
            addCriterion("first_category is null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIsNotNull() {
            addCriterion("first_category is not null");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryEqualTo(String value) {
            addCriterion("first_category =", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotEqualTo(String value) {
            addCriterion("first_category <>", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryGreaterThan(String value) {
            addCriterion("first_category >", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("first_category >=", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLessThan(String value) {
            addCriterion("first_category <", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLessThanOrEqualTo(String value) {
            addCriterion("first_category <=", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryLike(String value) {
            addCriterion("first_category like", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotLike(String value) {
            addCriterion("first_category not like", value, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryIn(List<String> values) {
            addCriterion("first_category in", values, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotIn(List<String> values) {
            addCriterion("first_category not in", values, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryBetween(String value1, String value2) {
            addCriterion("first_category between", value1, value2, "firstCategory");
            return (Criteria) this;
        }

        public Criteria andFirstCategoryNotBetween(String value1, String value2) {
            addCriterion("first_category not between", value1, value2, "firstCategory");
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