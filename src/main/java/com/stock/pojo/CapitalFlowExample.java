package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class CapitalFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CapitalFlowExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Integer value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Integer value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Integer value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Integer value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Integer> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Integer> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIsNull() {
            addCriterion("flow_code is null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIsNotNull() {
            addCriterion("flow_code is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCodeEqualTo(String value) {
            addCriterion("flow_code =", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotEqualTo(String value) {
            addCriterion("flow_code <>", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThan(String value) {
            addCriterion("flow_code >", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeGreaterThanOrEqualTo(String value) {
            addCriterion("flow_code >=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThan(String value) {
            addCriterion("flow_code <", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLessThanOrEqualTo(String value) {
            addCriterion("flow_code <=", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeLike(String value) {
            addCriterion("flow_code like", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotLike(String value) {
            addCriterion("flow_code not like", value, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeIn(List<String> values) {
            addCriterion("flow_code in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotIn(List<String> values) {
            addCriterion("flow_code not in", values, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeBetween(String value1, String value2) {
            addCriterion("flow_code between", value1, value2, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowCodeNotBetween(String value1, String value2) {
            addCriterion("flow_code not between", value1, value2, "flowCode");
            return (Criteria) this;
        }

        public Criteria andFlowNameIsNull() {
            addCriterion("flow_name is null");
            return (Criteria) this;
        }

        public Criteria andFlowNameIsNotNull() {
            addCriterion("flow_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlowNameEqualTo(String value) {
            addCriterion("flow_name =", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameNotEqualTo(String value) {
            addCriterion("flow_name <>", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameGreaterThan(String value) {
            addCriterion("flow_name >", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameGreaterThanOrEqualTo(String value) {
            addCriterion("flow_name >=", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameLessThan(String value) {
            addCriterion("flow_name <", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameLessThanOrEqualTo(String value) {
            addCriterion("flow_name <=", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameLike(String value) {
            addCriterion("flow_name like", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameNotLike(String value) {
            addCriterion("flow_name not like", value, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameIn(List<String> values) {
            addCriterion("flow_name in", values, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameNotIn(List<String> values) {
            addCriterion("flow_name not in", values, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameBetween(String value1, String value2) {
            addCriterion("flow_name between", value1, value2, "flowName");
            return (Criteria) this;
        }

        public Criteria andFlowNameNotBetween(String value1, String value2) {
            addCriterion("flow_name not between", value1, value2, "flowName");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountIsNull() {
            addCriterion("sbig_day_active_in_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountIsNotNull() {
            addCriterion("sbig_day_active_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountEqualTo(String value) {
            addCriterion("sbig_day_active_in_count =", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountNotEqualTo(String value) {
            addCriterion("sbig_day_active_in_count <>", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountGreaterThan(String value) {
            addCriterion("sbig_day_active_in_count >", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_in_count >=", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountLessThan(String value) {
            addCriterion("sbig_day_active_in_count <", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_in_count <=", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountLike(String value) {
            addCriterion("sbig_day_active_in_count like", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountNotLike(String value) {
            addCriterion("sbig_day_active_in_count not like", value, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountIn(List<String> values) {
            addCriterion("sbig_day_active_in_count in", values, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountNotIn(List<String> values) {
            addCriterion("sbig_day_active_in_count not in", values, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountBetween(String value1, String value2) {
            addCriterion("sbig_day_active_in_count between", value1, value2, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInCountNotBetween(String value1, String value2) {
            addCriterion("sbig_day_active_in_count not between", value1, value2, "sbigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyIsNull() {
            addCriterion("sbig_day_active_in_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyIsNotNull() {
            addCriterion("sbig_day_active_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyEqualTo(String value) {
            addCriterion("sbig_day_active_in_money =", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyNotEqualTo(String value) {
            addCriterion("sbig_day_active_in_money <>", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyGreaterThan(String value) {
            addCriterion("sbig_day_active_in_money >", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_in_money >=", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyLessThan(String value) {
            addCriterion("sbig_day_active_in_money <", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_in_money <=", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyLike(String value) {
            addCriterion("sbig_day_active_in_money like", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyNotLike(String value) {
            addCriterion("sbig_day_active_in_money not like", value, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyIn(List<String> values) {
            addCriterion("sbig_day_active_in_money in", values, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyNotIn(List<String> values) {
            addCriterion("sbig_day_active_in_money not in", values, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyBetween(String value1, String value2) {
            addCriterion("sbig_day_active_in_money between", value1, value2, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_day_active_in_money not between", value1, value2, "sbigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountIsNull() {
            addCriterion("sbig_day_passitive_in_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountIsNotNull() {
            addCriterion("sbig_day_passitive_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_count =", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountNotEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_count <>", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountGreaterThan(String value) {
            addCriterion("sbig_day_passitive_in_count >", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_count >=", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountLessThan(String value) {
            addCriterion("sbig_day_passitive_in_count <", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_count <=", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountLike(String value) {
            addCriterion("sbig_day_passitive_in_count like", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountNotLike(String value) {
            addCriterion("sbig_day_passitive_in_count not like", value, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountIn(List<String> values) {
            addCriterion("sbig_day_passitive_in_count in", values, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountNotIn(List<String> values) {
            addCriterion("sbig_day_passitive_in_count not in", values, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_in_count between", value1, value2, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInCountNotBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_in_count not between", value1, value2, "sbigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyIsNull() {
            addCriterion("sbig_day_passitive_in_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyIsNotNull() {
            addCriterion("sbig_day_passitive_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_money =", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyNotEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_money <>", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyGreaterThan(String value) {
            addCriterion("sbig_day_passitive_in_money >", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_money >=", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyLessThan(String value) {
            addCriterion("sbig_day_passitive_in_money <", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_in_money <=", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyLike(String value) {
            addCriterion("sbig_day_passitive_in_money like", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyNotLike(String value) {
            addCriterion("sbig_day_passitive_in_money not like", value, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyIn(List<String> values) {
            addCriterion("sbig_day_passitive_in_money in", values, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyNotIn(List<String> values) {
            addCriterion("sbig_day_passitive_in_money not in", values, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_in_money between", value1, value2, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_in_money not between", value1, value2, "sbigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountIsNull() {
            addCriterion("sbig_day_active_out_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountIsNotNull() {
            addCriterion("sbig_day_active_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountEqualTo(String value) {
            addCriterion("sbig_day_active_out_count =", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountNotEqualTo(String value) {
            addCriterion("sbig_day_active_out_count <>", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountGreaterThan(String value) {
            addCriterion("sbig_day_active_out_count >", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_out_count >=", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountLessThan(String value) {
            addCriterion("sbig_day_active_out_count <", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_out_count <=", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountLike(String value) {
            addCriterion("sbig_day_active_out_count like", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountNotLike(String value) {
            addCriterion("sbig_day_active_out_count not like", value, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountIn(List<String> values) {
            addCriterion("sbig_day_active_out_count in", values, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountNotIn(List<String> values) {
            addCriterion("sbig_day_active_out_count not in", values, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountBetween(String value1, String value2) {
            addCriterion("sbig_day_active_out_count between", value1, value2, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutCountNotBetween(String value1, String value2) {
            addCriterion("sbig_day_active_out_count not between", value1, value2, "sbigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyIsNull() {
            addCriterion("sbig_day_active_out_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyIsNotNull() {
            addCriterion("sbig_day_active_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyEqualTo(String value) {
            addCriterion("sbig_day_active_out_money =", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyNotEqualTo(String value) {
            addCriterion("sbig_day_active_out_money <>", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyGreaterThan(String value) {
            addCriterion("sbig_day_active_out_money >", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_out_money >=", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyLessThan(String value) {
            addCriterion("sbig_day_active_out_money <", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_active_out_money <=", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyLike(String value) {
            addCriterion("sbig_day_active_out_money like", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyNotLike(String value) {
            addCriterion("sbig_day_active_out_money not like", value, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyIn(List<String> values) {
            addCriterion("sbig_day_active_out_money in", values, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyNotIn(List<String> values) {
            addCriterion("sbig_day_active_out_money not in", values, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyBetween(String value1, String value2) {
            addCriterion("sbig_day_active_out_money between", value1, value2, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayActiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_day_active_out_money not between", value1, value2, "sbigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountIsNull() {
            addCriterion("sbig_day_passitive_out_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountIsNotNull() {
            addCriterion("sbig_day_passitive_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_count =", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountNotEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_count <>", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountGreaterThan(String value) {
            addCriterion("sbig_day_passitive_out_count >", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_count >=", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountLessThan(String value) {
            addCriterion("sbig_day_passitive_out_count <", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_count <=", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountLike(String value) {
            addCriterion("sbig_day_passitive_out_count like", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountNotLike(String value) {
            addCriterion("sbig_day_passitive_out_count not like", value, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountIn(List<String> values) {
            addCriterion("sbig_day_passitive_out_count in", values, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountNotIn(List<String> values) {
            addCriterion("sbig_day_passitive_out_count not in", values, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_out_count between", value1, value2, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutCountNotBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_out_count not between", value1, value2, "sbigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyIsNull() {
            addCriterion("sbig_day_passitive_out_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyIsNotNull() {
            addCriterion("sbig_day_passitive_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_money =", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyNotEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_money <>", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyGreaterThan(String value) {
            addCriterion("sbig_day_passitive_out_money >", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_money >=", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyLessThan(String value) {
            addCriterion("sbig_day_passitive_out_money <", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_day_passitive_out_money <=", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyLike(String value) {
            addCriterion("sbig_day_passitive_out_money like", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyNotLike(String value) {
            addCriterion("sbig_day_passitive_out_money not like", value, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyIn(List<String> values) {
            addCriterion("sbig_day_passitive_out_money in", values, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyNotIn(List<String> values) {
            addCriterion("sbig_day_passitive_out_money not in", values, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_out_money between", value1, value2, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigDayPassitiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_day_passitive_out_money not between", value1, value2, "sbigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountIsNull() {
            addCriterion("big_day_active_in_count is null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountIsNotNull() {
            addCriterion("big_day_active_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountEqualTo(String value) {
            addCriterion("big_day_active_in_count =", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountNotEqualTo(String value) {
            addCriterion("big_day_active_in_count <>", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountGreaterThan(String value) {
            addCriterion("big_day_active_in_count >", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_active_in_count >=", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountLessThan(String value) {
            addCriterion("big_day_active_in_count <", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountLessThanOrEqualTo(String value) {
            addCriterion("big_day_active_in_count <=", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountLike(String value) {
            addCriterion("big_day_active_in_count like", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountNotLike(String value) {
            addCriterion("big_day_active_in_count not like", value, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountIn(List<String> values) {
            addCriterion("big_day_active_in_count in", values, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountNotIn(List<String> values) {
            addCriterion("big_day_active_in_count not in", values, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountBetween(String value1, String value2) {
            addCriterion("big_day_active_in_count between", value1, value2, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInCountNotBetween(String value1, String value2) {
            addCriterion("big_day_active_in_count not between", value1, value2, "bigDayActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyIsNull() {
            addCriterion("big_day_active_in_money is null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyIsNotNull() {
            addCriterion("big_day_active_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyEqualTo(String value) {
            addCriterion("big_day_active_in_money =", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyNotEqualTo(String value) {
            addCriterion("big_day_active_in_money <>", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyGreaterThan(String value) {
            addCriterion("big_day_active_in_money >", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_active_in_money >=", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyLessThan(String value) {
            addCriterion("big_day_active_in_money <", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_day_active_in_money <=", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyLike(String value) {
            addCriterion("big_day_active_in_money like", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyNotLike(String value) {
            addCriterion("big_day_active_in_money not like", value, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyIn(List<String> values) {
            addCriterion("big_day_active_in_money in", values, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyNotIn(List<String> values) {
            addCriterion("big_day_active_in_money not in", values, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyBetween(String value1, String value2) {
            addCriterion("big_day_active_in_money between", value1, value2, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("big_day_active_in_money not between", value1, value2, "bigDayActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountIsNull() {
            addCriterion("big_day_passitive_in_count is null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountIsNotNull() {
            addCriterion("big_day_passitive_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountEqualTo(String value) {
            addCriterion("big_day_passitive_in_count =", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountNotEqualTo(String value) {
            addCriterion("big_day_passitive_in_count <>", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountGreaterThan(String value) {
            addCriterion("big_day_passitive_in_count >", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_in_count >=", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountLessThan(String value) {
            addCriterion("big_day_passitive_in_count <", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountLessThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_in_count <=", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountLike(String value) {
            addCriterion("big_day_passitive_in_count like", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountNotLike(String value) {
            addCriterion("big_day_passitive_in_count not like", value, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountIn(List<String> values) {
            addCriterion("big_day_passitive_in_count in", values, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountNotIn(List<String> values) {
            addCriterion("big_day_passitive_in_count not in", values, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountBetween(String value1, String value2) {
            addCriterion("big_day_passitive_in_count between", value1, value2, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInCountNotBetween(String value1, String value2) {
            addCriterion("big_day_passitive_in_count not between", value1, value2, "bigDayPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyIsNull() {
            addCriterion("big_day_passitive_in_money is null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyIsNotNull() {
            addCriterion("big_day_passitive_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyEqualTo(String value) {
            addCriterion("big_day_passitive_in_money =", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyNotEqualTo(String value) {
            addCriterion("big_day_passitive_in_money <>", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyGreaterThan(String value) {
            addCriterion("big_day_passitive_in_money >", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_in_money >=", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyLessThan(String value) {
            addCriterion("big_day_passitive_in_money <", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_in_money <=", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyLike(String value) {
            addCriterion("big_day_passitive_in_money like", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyNotLike(String value) {
            addCriterion("big_day_passitive_in_money not like", value, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyIn(List<String> values) {
            addCriterion("big_day_passitive_in_money in", values, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyNotIn(List<String> values) {
            addCriterion("big_day_passitive_in_money not in", values, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyBetween(String value1, String value2) {
            addCriterion("big_day_passitive_in_money between", value1, value2, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("big_day_passitive_in_money not between", value1, value2, "bigDayPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountIsNull() {
            addCriterion("big_day_active_out_count is null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountIsNotNull() {
            addCriterion("big_day_active_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountEqualTo(String value) {
            addCriterion("big_day_active_out_count =", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountNotEqualTo(String value) {
            addCriterion("big_day_active_out_count <>", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountGreaterThan(String value) {
            addCriterion("big_day_active_out_count >", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_active_out_count >=", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountLessThan(String value) {
            addCriterion("big_day_active_out_count <", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("big_day_active_out_count <=", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountLike(String value) {
            addCriterion("big_day_active_out_count like", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountNotLike(String value) {
            addCriterion("big_day_active_out_count not like", value, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountIn(List<String> values) {
            addCriterion("big_day_active_out_count in", values, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountNotIn(List<String> values) {
            addCriterion("big_day_active_out_count not in", values, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountBetween(String value1, String value2) {
            addCriterion("big_day_active_out_count between", value1, value2, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutCountNotBetween(String value1, String value2) {
            addCriterion("big_day_active_out_count not between", value1, value2, "bigDayActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyIsNull() {
            addCriterion("big_day_active_out_money is null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyIsNotNull() {
            addCriterion("big_day_active_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyEqualTo(String value) {
            addCriterion("big_day_active_out_money =", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyNotEqualTo(String value) {
            addCriterion("big_day_active_out_money <>", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyGreaterThan(String value) {
            addCriterion("big_day_active_out_money >", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_active_out_money >=", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyLessThan(String value) {
            addCriterion("big_day_active_out_money <", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_day_active_out_money <=", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyLike(String value) {
            addCriterion("big_day_active_out_money like", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyNotLike(String value) {
            addCriterion("big_day_active_out_money not like", value, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyIn(List<String> values) {
            addCriterion("big_day_active_out_money in", values, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyNotIn(List<String> values) {
            addCriterion("big_day_active_out_money not in", values, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyBetween(String value1, String value2) {
            addCriterion("big_day_active_out_money between", value1, value2, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayActiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("big_day_active_out_money not between", value1, value2, "bigDayActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountIsNull() {
            addCriterion("big_day_passitive_out_count is null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountIsNotNull() {
            addCriterion("big_day_passitive_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountEqualTo(String value) {
            addCriterion("big_day_passitive_out_count =", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountNotEqualTo(String value) {
            addCriterion("big_day_passitive_out_count <>", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountGreaterThan(String value) {
            addCriterion("big_day_passitive_out_count >", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_out_count >=", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountLessThan(String value) {
            addCriterion("big_day_passitive_out_count <", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_out_count <=", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountLike(String value) {
            addCriterion("big_day_passitive_out_count like", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountNotLike(String value) {
            addCriterion("big_day_passitive_out_count not like", value, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountIn(List<String> values) {
            addCriterion("big_day_passitive_out_count in", values, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountNotIn(List<String> values) {
            addCriterion("big_day_passitive_out_count not in", values, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountBetween(String value1, String value2) {
            addCriterion("big_day_passitive_out_count between", value1, value2, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutCountNotBetween(String value1, String value2) {
            addCriterion("big_day_passitive_out_count not between", value1, value2, "bigDayPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyIsNull() {
            addCriterion("big_day_passitive_out_money is null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyIsNotNull() {
            addCriterion("big_day_passitive_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyEqualTo(String value) {
            addCriterion("big_day_passitive_out_money =", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyNotEqualTo(String value) {
            addCriterion("big_day_passitive_out_money <>", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyGreaterThan(String value) {
            addCriterion("big_day_passitive_out_money >", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_out_money >=", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyLessThan(String value) {
            addCriterion("big_day_passitive_out_money <", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_day_passitive_out_money <=", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyLike(String value) {
            addCriterion("big_day_passitive_out_money like", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyNotLike(String value) {
            addCriterion("big_day_passitive_out_money not like", value, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyIn(List<String> values) {
            addCriterion("big_day_passitive_out_money in", values, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyNotIn(List<String> values) {
            addCriterion("big_day_passitive_out_money not in", values, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyBetween(String value1, String value2) {
            addCriterion("big_day_passitive_out_money between", value1, value2, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigDayPassitiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("big_day_passitive_out_money not between", value1, value2, "bigDayPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountIsNull() {
            addCriterion("sbig_week_active_in_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountIsNotNull() {
            addCriterion("sbig_week_active_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountEqualTo(String value) {
            addCriterion("sbig_week_active_in_count =", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountNotEqualTo(String value) {
            addCriterion("sbig_week_active_in_count <>", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountGreaterThan(String value) {
            addCriterion("sbig_week_active_in_count >", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_in_count >=", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountLessThan(String value) {
            addCriterion("sbig_week_active_in_count <", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_in_count <=", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountLike(String value) {
            addCriterion("sbig_week_active_in_count like", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountNotLike(String value) {
            addCriterion("sbig_week_active_in_count not like", value, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountIn(List<String> values) {
            addCriterion("sbig_week_active_in_count in", values, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountNotIn(List<String> values) {
            addCriterion("sbig_week_active_in_count not in", values, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountBetween(String value1, String value2) {
            addCriterion("sbig_week_active_in_count between", value1, value2, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInCountNotBetween(String value1, String value2) {
            addCriterion("sbig_week_active_in_count not between", value1, value2, "sbigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyIsNull() {
            addCriterion("sbig_week_active_in_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyIsNotNull() {
            addCriterion("sbig_week_active_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyEqualTo(String value) {
            addCriterion("sbig_week_active_in_money =", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyNotEqualTo(String value) {
            addCriterion("sbig_week_active_in_money <>", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyGreaterThan(String value) {
            addCriterion("sbig_week_active_in_money >", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_in_money >=", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyLessThan(String value) {
            addCriterion("sbig_week_active_in_money <", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_in_money <=", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyLike(String value) {
            addCriterion("sbig_week_active_in_money like", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyNotLike(String value) {
            addCriterion("sbig_week_active_in_money not like", value, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyIn(List<String> values) {
            addCriterion("sbig_week_active_in_money in", values, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyNotIn(List<String> values) {
            addCriterion("sbig_week_active_in_money not in", values, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyBetween(String value1, String value2) {
            addCriterion("sbig_week_active_in_money between", value1, value2, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_week_active_in_money not between", value1, value2, "sbigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountIsNull() {
            addCriterion("sbig_week_passitive_in_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountIsNotNull() {
            addCriterion("sbig_week_passitive_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_count =", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountNotEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_count <>", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountGreaterThan(String value) {
            addCriterion("sbig_week_passitive_in_count >", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_count >=", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountLessThan(String value) {
            addCriterion("sbig_week_passitive_in_count <", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_count <=", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountLike(String value) {
            addCriterion("sbig_week_passitive_in_count like", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountNotLike(String value) {
            addCriterion("sbig_week_passitive_in_count not like", value, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountIn(List<String> values) {
            addCriterion("sbig_week_passitive_in_count in", values, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountNotIn(List<String> values) {
            addCriterion("sbig_week_passitive_in_count not in", values, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_in_count between", value1, value2, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInCountNotBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_in_count not between", value1, value2, "sbigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyIsNull() {
            addCriterion("sbig_week_passitive_in_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyIsNotNull() {
            addCriterion("sbig_week_passitive_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_money =", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyNotEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_money <>", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyGreaterThan(String value) {
            addCriterion("sbig_week_passitive_in_money >", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_money >=", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyLessThan(String value) {
            addCriterion("sbig_week_passitive_in_money <", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_in_money <=", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyLike(String value) {
            addCriterion("sbig_week_passitive_in_money like", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyNotLike(String value) {
            addCriterion("sbig_week_passitive_in_money not like", value, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyIn(List<String> values) {
            addCriterion("sbig_week_passitive_in_money in", values, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyNotIn(List<String> values) {
            addCriterion("sbig_week_passitive_in_money not in", values, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_in_money between", value1, value2, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_in_money not between", value1, value2, "sbigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountIsNull() {
            addCriterion("sbig_week_active_out_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountIsNotNull() {
            addCriterion("sbig_week_active_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountEqualTo(String value) {
            addCriterion("sbig_week_active_out_count =", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountNotEqualTo(String value) {
            addCriterion("sbig_week_active_out_count <>", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountGreaterThan(String value) {
            addCriterion("sbig_week_active_out_count >", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_out_count >=", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountLessThan(String value) {
            addCriterion("sbig_week_active_out_count <", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_out_count <=", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountLike(String value) {
            addCriterion("sbig_week_active_out_count like", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountNotLike(String value) {
            addCriterion("sbig_week_active_out_count not like", value, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountIn(List<String> values) {
            addCriterion("sbig_week_active_out_count in", values, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountNotIn(List<String> values) {
            addCriterion("sbig_week_active_out_count not in", values, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountBetween(String value1, String value2) {
            addCriterion("sbig_week_active_out_count between", value1, value2, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutCountNotBetween(String value1, String value2) {
            addCriterion("sbig_week_active_out_count not between", value1, value2, "sbigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyIsNull() {
            addCriterion("sbig_week_active_out_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyIsNotNull() {
            addCriterion("sbig_week_active_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyEqualTo(String value) {
            addCriterion("sbig_week_active_out_money =", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyNotEqualTo(String value) {
            addCriterion("sbig_week_active_out_money <>", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyGreaterThan(String value) {
            addCriterion("sbig_week_active_out_money >", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_out_money >=", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyLessThan(String value) {
            addCriterion("sbig_week_active_out_money <", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_active_out_money <=", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyLike(String value) {
            addCriterion("sbig_week_active_out_money like", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyNotLike(String value) {
            addCriterion("sbig_week_active_out_money not like", value, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyIn(List<String> values) {
            addCriterion("sbig_week_active_out_money in", values, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyNotIn(List<String> values) {
            addCriterion("sbig_week_active_out_money not in", values, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyBetween(String value1, String value2) {
            addCriterion("sbig_week_active_out_money between", value1, value2, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekActiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_week_active_out_money not between", value1, value2, "sbigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountIsNull() {
            addCriterion("sbig_week_passitive_out_count is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountIsNotNull() {
            addCriterion("sbig_week_passitive_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_count =", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountNotEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_count <>", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountGreaterThan(String value) {
            addCriterion("sbig_week_passitive_out_count >", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_count >=", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountLessThan(String value) {
            addCriterion("sbig_week_passitive_out_count <", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_count <=", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountLike(String value) {
            addCriterion("sbig_week_passitive_out_count like", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountNotLike(String value) {
            addCriterion("sbig_week_passitive_out_count not like", value, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountIn(List<String> values) {
            addCriterion("sbig_week_passitive_out_count in", values, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountNotIn(List<String> values) {
            addCriterion("sbig_week_passitive_out_count not in", values, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_out_count between", value1, value2, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutCountNotBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_out_count not between", value1, value2, "sbigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyIsNull() {
            addCriterion("sbig_week_passitive_out_money is null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyIsNotNull() {
            addCriterion("sbig_week_passitive_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_money =", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyNotEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_money <>", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyGreaterThan(String value) {
            addCriterion("sbig_week_passitive_out_money >", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_money >=", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyLessThan(String value) {
            addCriterion("sbig_week_passitive_out_money <", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("sbig_week_passitive_out_money <=", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyLike(String value) {
            addCriterion("sbig_week_passitive_out_money like", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyNotLike(String value) {
            addCriterion("sbig_week_passitive_out_money not like", value, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyIn(List<String> values) {
            addCriterion("sbig_week_passitive_out_money in", values, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyNotIn(List<String> values) {
            addCriterion("sbig_week_passitive_out_money not in", values, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_out_money between", value1, value2, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andSbigWeekPassitiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("sbig_week_passitive_out_money not between", value1, value2, "sbigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountIsNull() {
            addCriterion("big_week_active_in_count is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountIsNotNull() {
            addCriterion("big_week_active_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountEqualTo(String value) {
            addCriterion("big_week_active_in_count =", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountNotEqualTo(String value) {
            addCriterion("big_week_active_in_count <>", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountGreaterThan(String value) {
            addCriterion("big_week_active_in_count >", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_active_in_count >=", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountLessThan(String value) {
            addCriterion("big_week_active_in_count <", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountLessThanOrEqualTo(String value) {
            addCriterion("big_week_active_in_count <=", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountLike(String value) {
            addCriterion("big_week_active_in_count like", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountNotLike(String value) {
            addCriterion("big_week_active_in_count not like", value, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountIn(List<String> values) {
            addCriterion("big_week_active_in_count in", values, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountNotIn(List<String> values) {
            addCriterion("big_week_active_in_count not in", values, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountBetween(String value1, String value2) {
            addCriterion("big_week_active_in_count between", value1, value2, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInCountNotBetween(String value1, String value2) {
            addCriterion("big_week_active_in_count not between", value1, value2, "bigWeekActiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyIsNull() {
            addCriterion("big_week_active_in_money is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyIsNotNull() {
            addCriterion("big_week_active_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyEqualTo(String value) {
            addCriterion("big_week_active_in_money =", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyNotEqualTo(String value) {
            addCriterion("big_week_active_in_money <>", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyGreaterThan(String value) {
            addCriterion("big_week_active_in_money >", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_active_in_money >=", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyLessThan(String value) {
            addCriterion("big_week_active_in_money <", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_week_active_in_money <=", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyLike(String value) {
            addCriterion("big_week_active_in_money like", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyNotLike(String value) {
            addCriterion("big_week_active_in_money not like", value, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyIn(List<String> values) {
            addCriterion("big_week_active_in_money in", values, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyNotIn(List<String> values) {
            addCriterion("big_week_active_in_money not in", values, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyBetween(String value1, String value2) {
            addCriterion("big_week_active_in_money between", value1, value2, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("big_week_active_in_money not between", value1, value2, "bigWeekActiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountIsNull() {
            addCriterion("big_week_passitive_in_count is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountIsNotNull() {
            addCriterion("big_week_passitive_in_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountEqualTo(String value) {
            addCriterion("big_week_passitive_in_count =", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountNotEqualTo(String value) {
            addCriterion("big_week_passitive_in_count <>", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountGreaterThan(String value) {
            addCriterion("big_week_passitive_in_count >", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_in_count >=", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountLessThan(String value) {
            addCriterion("big_week_passitive_in_count <", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountLessThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_in_count <=", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountLike(String value) {
            addCriterion("big_week_passitive_in_count like", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountNotLike(String value) {
            addCriterion("big_week_passitive_in_count not like", value, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountIn(List<String> values) {
            addCriterion("big_week_passitive_in_count in", values, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountNotIn(List<String> values) {
            addCriterion("big_week_passitive_in_count not in", values, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountBetween(String value1, String value2) {
            addCriterion("big_week_passitive_in_count between", value1, value2, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInCountNotBetween(String value1, String value2) {
            addCriterion("big_week_passitive_in_count not between", value1, value2, "bigWeekPassitiveInCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyIsNull() {
            addCriterion("big_week_passitive_in_money is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyIsNotNull() {
            addCriterion("big_week_passitive_in_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyEqualTo(String value) {
            addCriterion("big_week_passitive_in_money =", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyNotEqualTo(String value) {
            addCriterion("big_week_passitive_in_money <>", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyGreaterThan(String value) {
            addCriterion("big_week_passitive_in_money >", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_in_money >=", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyLessThan(String value) {
            addCriterion("big_week_passitive_in_money <", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_in_money <=", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyLike(String value) {
            addCriterion("big_week_passitive_in_money like", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyNotLike(String value) {
            addCriterion("big_week_passitive_in_money not like", value, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyIn(List<String> values) {
            addCriterion("big_week_passitive_in_money in", values, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyNotIn(List<String> values) {
            addCriterion("big_week_passitive_in_money not in", values, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyBetween(String value1, String value2) {
            addCriterion("big_week_passitive_in_money between", value1, value2, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveInMoneyNotBetween(String value1, String value2) {
            addCriterion("big_week_passitive_in_money not between", value1, value2, "bigWeekPassitiveInMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountIsNull() {
            addCriterion("big_week_active_out_count is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountIsNotNull() {
            addCriterion("big_week_active_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountEqualTo(String value) {
            addCriterion("big_week_active_out_count =", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountNotEqualTo(String value) {
            addCriterion("big_week_active_out_count <>", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountGreaterThan(String value) {
            addCriterion("big_week_active_out_count >", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_active_out_count >=", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountLessThan(String value) {
            addCriterion("big_week_active_out_count <", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("big_week_active_out_count <=", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountLike(String value) {
            addCriterion("big_week_active_out_count like", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountNotLike(String value) {
            addCriterion("big_week_active_out_count not like", value, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountIn(List<String> values) {
            addCriterion("big_week_active_out_count in", values, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountNotIn(List<String> values) {
            addCriterion("big_week_active_out_count not in", values, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountBetween(String value1, String value2) {
            addCriterion("big_week_active_out_count between", value1, value2, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutCountNotBetween(String value1, String value2) {
            addCriterion("big_week_active_out_count not between", value1, value2, "bigWeekActiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyIsNull() {
            addCriterion("big_week_active_out_money is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyIsNotNull() {
            addCriterion("big_week_active_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyEqualTo(String value) {
            addCriterion("big_week_active_out_money =", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyNotEqualTo(String value) {
            addCriterion("big_week_active_out_money <>", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyGreaterThan(String value) {
            addCriterion("big_week_active_out_money >", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_active_out_money >=", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyLessThan(String value) {
            addCriterion("big_week_active_out_money <", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_week_active_out_money <=", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyLike(String value) {
            addCriterion("big_week_active_out_money like", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyNotLike(String value) {
            addCriterion("big_week_active_out_money not like", value, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyIn(List<String> values) {
            addCriterion("big_week_active_out_money in", values, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyNotIn(List<String> values) {
            addCriterion("big_week_active_out_money not in", values, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyBetween(String value1, String value2) {
            addCriterion("big_week_active_out_money between", value1, value2, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekActiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("big_week_active_out_money not between", value1, value2, "bigWeekActiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountIsNull() {
            addCriterion("big_week_passitive_out_count is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountIsNotNull() {
            addCriterion("big_week_passitive_out_count is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountEqualTo(String value) {
            addCriterion("big_week_passitive_out_count =", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountNotEqualTo(String value) {
            addCriterion("big_week_passitive_out_count <>", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountGreaterThan(String value) {
            addCriterion("big_week_passitive_out_count >", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_out_count >=", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountLessThan(String value) {
            addCriterion("big_week_passitive_out_count <", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountLessThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_out_count <=", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountLike(String value) {
            addCriterion("big_week_passitive_out_count like", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountNotLike(String value) {
            addCriterion("big_week_passitive_out_count not like", value, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountIn(List<String> values) {
            addCriterion("big_week_passitive_out_count in", values, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountNotIn(List<String> values) {
            addCriterion("big_week_passitive_out_count not in", values, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountBetween(String value1, String value2) {
            addCriterion("big_week_passitive_out_count between", value1, value2, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutCountNotBetween(String value1, String value2) {
            addCriterion("big_week_passitive_out_count not between", value1, value2, "bigWeekPassitiveOutCount");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyIsNull() {
            addCriterion("big_week_passitive_out_money is null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyIsNotNull() {
            addCriterion("big_week_passitive_out_money is not null");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyEqualTo(String value) {
            addCriterion("big_week_passitive_out_money =", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyNotEqualTo(String value) {
            addCriterion("big_week_passitive_out_money <>", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyGreaterThan(String value) {
            addCriterion("big_week_passitive_out_money >", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_out_money >=", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyLessThan(String value) {
            addCriterion("big_week_passitive_out_money <", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyLessThanOrEqualTo(String value) {
            addCriterion("big_week_passitive_out_money <=", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyLike(String value) {
            addCriterion("big_week_passitive_out_money like", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyNotLike(String value) {
            addCriterion("big_week_passitive_out_money not like", value, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyIn(List<String> values) {
            addCriterion("big_week_passitive_out_money in", values, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyNotIn(List<String> values) {
            addCriterion("big_week_passitive_out_money not in", values, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyBetween(String value1, String value2) {
            addCriterion("big_week_passitive_out_money between", value1, value2, "bigWeekPassitiveOutMoney");
            return (Criteria) this;
        }

        public Criteria andBigWeekPassitiveOutMoneyNotBetween(String value1, String value2) {
            addCriterion("big_week_passitive_out_money not between", value1, value2, "bigWeekPassitiveOutMoney");
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