package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class JijinAllExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JijinAllExample() {
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

        public Criteria andJijiBianhaoIsNull() {
            addCriterion("jiji_bianHao is null");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoIsNotNull() {
            addCriterion("jiji_bianHao is not null");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoEqualTo(String value) {
            addCriterion("jiji_bianHao =", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoNotEqualTo(String value) {
            addCriterion("jiji_bianHao <>", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoGreaterThan(String value) {
            addCriterion("jiji_bianHao >", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoGreaterThanOrEqualTo(String value) {
            addCriterion("jiji_bianHao >=", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoLessThan(String value) {
            addCriterion("jiji_bianHao <", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoLessThanOrEqualTo(String value) {
            addCriterion("jiji_bianHao <=", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoLike(String value) {
            addCriterion("jiji_bianHao like", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoNotLike(String value) {
            addCriterion("jiji_bianHao not like", value, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoIn(List<String> values) {
            addCriterion("jiji_bianHao in", values, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoNotIn(List<String> values) {
            addCriterion("jiji_bianHao not in", values, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoBetween(String value1, String value2) {
            addCriterion("jiji_bianHao between", value1, value2, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiBianhaoNotBetween(String value1, String value2) {
            addCriterion("jiji_bianHao not between", value1, value2, "jijiBianhao");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengIsNull() {
            addCriterion("jiji_jiancheng is null");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengIsNotNull() {
            addCriterion("jiji_jiancheng is not null");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengEqualTo(String value) {
            addCriterion("jiji_jiancheng =", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengNotEqualTo(String value) {
            addCriterion("jiji_jiancheng <>", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengGreaterThan(String value) {
            addCriterion("jiji_jiancheng >", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengGreaterThanOrEqualTo(String value) {
            addCriterion("jiji_jiancheng >=", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengLessThan(String value) {
            addCriterion("jiji_jiancheng <", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengLessThanOrEqualTo(String value) {
            addCriterion("jiji_jiancheng <=", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengLike(String value) {
            addCriterion("jiji_jiancheng like", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengNotLike(String value) {
            addCriterion("jiji_jiancheng not like", value, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengIn(List<String> values) {
            addCriterion("jiji_jiancheng in", values, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengNotIn(List<String> values) {
            addCriterion("jiji_jiancheng not in", values, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengBetween(String value1, String value2) {
            addCriterion("jiji_jiancheng between", value1, value2, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijiJianchengNotBetween(String value1, String value2) {
            addCriterion("jiji_jiancheng not between", value1, value2, "jijiJiancheng");
            return (Criteria) this;
        }

        public Criteria andJijinHanziIsNull() {
            addCriterion("jijin_hanzi is null");
            return (Criteria) this;
        }

        public Criteria andJijinHanziIsNotNull() {
            addCriterion("jijin_hanzi is not null");
            return (Criteria) this;
        }

        public Criteria andJijinHanziEqualTo(String value) {
            addCriterion("jijin_hanzi =", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziNotEqualTo(String value) {
            addCriterion("jijin_hanzi <>", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziGreaterThan(String value) {
            addCriterion("jijin_hanzi >", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziGreaterThanOrEqualTo(String value) {
            addCriterion("jijin_hanzi >=", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziLessThan(String value) {
            addCriterion("jijin_hanzi <", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziLessThanOrEqualTo(String value) {
            addCriterion("jijin_hanzi <=", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziLike(String value) {
            addCriterion("jijin_hanzi like", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziNotLike(String value) {
            addCriterion("jijin_hanzi not like", value, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziIn(List<String> values) {
            addCriterion("jijin_hanzi in", values, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziNotIn(List<String> values) {
            addCriterion("jijin_hanzi not in", values, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziBetween(String value1, String value2) {
            addCriterion("jijin_hanzi between", value1, value2, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinHanziNotBetween(String value1, String value2) {
            addCriterion("jijin_hanzi not between", value1, value2, "jijinHanzi");
            return (Criteria) this;
        }

        public Criteria andJijinTypeIsNull() {
            addCriterion("jijin_type is null");
            return (Criteria) this;
        }

        public Criteria andJijinTypeIsNotNull() {
            addCriterion("jijin_type is not null");
            return (Criteria) this;
        }

        public Criteria andJijinTypeEqualTo(String value) {
            addCriterion("jijin_type =", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeNotEqualTo(String value) {
            addCriterion("jijin_type <>", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeGreaterThan(String value) {
            addCriterion("jijin_type >", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeGreaterThanOrEqualTo(String value) {
            addCriterion("jijin_type >=", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeLessThan(String value) {
            addCriterion("jijin_type <", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeLessThanOrEqualTo(String value) {
            addCriterion("jijin_type <=", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeLike(String value) {
            addCriterion("jijin_type like", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeNotLike(String value) {
            addCriterion("jijin_type not like", value, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeIn(List<String> values) {
            addCriterion("jijin_type in", values, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeNotIn(List<String> values) {
            addCriterion("jijin_type not in", values, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeBetween(String value1, String value2) {
            addCriterion("jijin_type between", value1, value2, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinTypeNotBetween(String value1, String value2) {
            addCriterion("jijin_type not between", value1, value2, "jijinType");
            return (Criteria) this;
        }

        public Criteria andJijinEngIsNull() {
            addCriterion("jijin_Eng is null");
            return (Criteria) this;
        }

        public Criteria andJijinEngIsNotNull() {
            addCriterion("jijin_Eng is not null");
            return (Criteria) this;
        }

        public Criteria andJijinEngEqualTo(String value) {
            addCriterion("jijin_Eng =", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngNotEqualTo(String value) {
            addCriterion("jijin_Eng <>", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngGreaterThan(String value) {
            addCriterion("jijin_Eng >", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngGreaterThanOrEqualTo(String value) {
            addCriterion("jijin_Eng >=", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngLessThan(String value) {
            addCriterion("jijin_Eng <", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngLessThanOrEqualTo(String value) {
            addCriterion("jijin_Eng <=", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngLike(String value) {
            addCriterion("jijin_Eng like", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngNotLike(String value) {
            addCriterion("jijin_Eng not like", value, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngIn(List<String> values) {
            addCriterion("jijin_Eng in", values, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngNotIn(List<String> values) {
            addCriterion("jijin_Eng not in", values, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngBetween(String value1, String value2) {
            addCriterion("jijin_Eng between", value1, value2, "jijinEng");
            return (Criteria) this;
        }

        public Criteria andJijinEngNotBetween(String value1, String value2) {
            addCriterion("jijin_Eng not between", value1, value2, "jijinEng");
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