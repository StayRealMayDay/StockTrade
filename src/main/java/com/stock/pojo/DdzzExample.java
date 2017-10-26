package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class DdzzExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DdzzExample() {
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

        public Criteria andDdzzIdIsNull() {
            addCriterion("ddzz_id is null");
            return (Criteria) this;
        }

        public Criteria andDdzzIdIsNotNull() {
            addCriterion("ddzz_id is not null");
            return (Criteria) this;
        }

        public Criteria andDdzzIdEqualTo(String value) {
            addCriterion("ddzz_id =", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdNotEqualTo(String value) {
            addCriterion("ddzz_id <>", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdGreaterThan(String value) {
            addCriterion("ddzz_id >", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdGreaterThanOrEqualTo(String value) {
            addCriterion("ddzz_id >=", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdLessThan(String value) {
            addCriterion("ddzz_id <", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdLessThanOrEqualTo(String value) {
            addCriterion("ddzz_id <=", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdLike(String value) {
            addCriterion("ddzz_id like", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdNotLike(String value) {
            addCriterion("ddzz_id not like", value, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdIn(List<String> values) {
            addCriterion("ddzz_id in", values, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdNotIn(List<String> values) {
            addCriterion("ddzz_id not in", values, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdBetween(String value1, String value2) {
            addCriterion("ddzz_id between", value1, value2, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andDdzzIdNotBetween(String value1, String value2) {
            addCriterion("ddzz_id not between", value1, value2, "ddzzId");
            return (Criteria) this;
        }

        public Criteria andNewsTittleIsNull() {
            addCriterion("news_tittle is null");
            return (Criteria) this;
        }

        public Criteria andNewsTittleIsNotNull() {
            addCriterion("news_tittle is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTittleEqualTo(String value) {
            addCriterion("news_tittle =", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleNotEqualTo(String value) {
            addCriterion("news_tittle <>", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleGreaterThan(String value) {
            addCriterion("news_tittle >", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleGreaterThanOrEqualTo(String value) {
            addCriterion("news_tittle >=", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleLessThan(String value) {
            addCriterion("news_tittle <", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleLessThanOrEqualTo(String value) {
            addCriterion("news_tittle <=", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleLike(String value) {
            addCriterion("news_tittle like", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleNotLike(String value) {
            addCriterion("news_tittle not like", value, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleIn(List<String> values) {
            addCriterion("news_tittle in", values, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleNotIn(List<String> values) {
            addCriterion("news_tittle not in", values, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleBetween(String value1, String value2) {
            addCriterion("news_tittle between", value1, value2, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTittleNotBetween(String value1, String value2) {
            addCriterion("news_tittle not between", value1, value2, "newsTittle");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNull() {
            addCriterion("news_time is null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIsNotNull() {
            addCriterion("news_time is not null");
            return (Criteria) this;
        }

        public Criteria andNewsTimeEqualTo(String value) {
            addCriterion("news_time =", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotEqualTo(String value) {
            addCriterion("news_time <>", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThan(String value) {
            addCriterion("news_time >", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("news_time >=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThan(String value) {
            addCriterion("news_time <", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLessThanOrEqualTo(String value) {
            addCriterion("news_time <=", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeLike(String value) {
            addCriterion("news_time like", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotLike(String value) {
            addCriterion("news_time not like", value, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeIn(List<String> values) {
            addCriterion("news_time in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotIn(List<String> values) {
            addCriterion("news_time not in", values, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeBetween(String value1, String value2) {
            addCriterion("news_time between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsTimeNotBetween(String value1, String value2) {
            addCriterion("news_time not between", value1, value2, "newsTime");
            return (Criteria) this;
        }

        public Criteria andNewsContent1IsNull() {
            addCriterion("news_content1 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent1IsNotNull() {
            addCriterion("news_content1 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent1EqualTo(String value) {
            addCriterion("news_content1 =", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1NotEqualTo(String value) {
            addCriterion("news_content1 <>", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1GreaterThan(String value) {
            addCriterion("news_content1 >", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1GreaterThanOrEqualTo(String value) {
            addCriterion("news_content1 >=", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1LessThan(String value) {
            addCriterion("news_content1 <", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1LessThanOrEqualTo(String value) {
            addCriterion("news_content1 <=", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1Like(String value) {
            addCriterion("news_content1 like", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1NotLike(String value) {
            addCriterion("news_content1 not like", value, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1In(List<String> values) {
            addCriterion("news_content1 in", values, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1NotIn(List<String> values) {
            addCriterion("news_content1 not in", values, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1Between(String value1, String value2) {
            addCriterion("news_content1 between", value1, value2, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsContent1NotBetween(String value1, String value2) {
            addCriterion("news_content1 not between", value1, value2, "newsContent1");
            return (Criteria) this;
        }

        public Criteria andNewsOriginIsNull() {
            addCriterion("news_origin is null");
            return (Criteria) this;
        }

        public Criteria andNewsOriginIsNotNull() {
            addCriterion("news_origin is not null");
            return (Criteria) this;
        }

        public Criteria andNewsOriginEqualTo(String value) {
            addCriterion("news_origin =", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginNotEqualTo(String value) {
            addCriterion("news_origin <>", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginGreaterThan(String value) {
            addCriterion("news_origin >", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginGreaterThanOrEqualTo(String value) {
            addCriterion("news_origin >=", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginLessThan(String value) {
            addCriterion("news_origin <", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginLessThanOrEqualTo(String value) {
            addCriterion("news_origin <=", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginLike(String value) {
            addCriterion("news_origin like", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginNotLike(String value) {
            addCriterion("news_origin not like", value, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginIn(List<String> values) {
            addCriterion("news_origin in", values, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginNotIn(List<String> values) {
            addCriterion("news_origin not in", values, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginBetween(String value1, String value2) {
            addCriterion("news_origin between", value1, value2, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsOriginNotBetween(String value1, String value2) {
            addCriterion("news_origin not between", value1, value2, "newsOrigin");
            return (Criteria) this;
        }

        public Criteria andNewsStock1IsNull() {
            addCriterion("news_stock1 is null");
            return (Criteria) this;
        }

        public Criteria andNewsStock1IsNotNull() {
            addCriterion("news_stock1 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsStock1EqualTo(String value) {
            addCriterion("news_stock1 =", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1NotEqualTo(String value) {
            addCriterion("news_stock1 <>", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1GreaterThan(String value) {
            addCriterion("news_stock1 >", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1GreaterThanOrEqualTo(String value) {
            addCriterion("news_stock1 >=", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1LessThan(String value) {
            addCriterion("news_stock1 <", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1LessThanOrEqualTo(String value) {
            addCriterion("news_stock1 <=", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1Like(String value) {
            addCriterion("news_stock1 like", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1NotLike(String value) {
            addCriterion("news_stock1 not like", value, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1In(List<String> values) {
            addCriterion("news_stock1 in", values, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1NotIn(List<String> values) {
            addCriterion("news_stock1 not in", values, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1Between(String value1, String value2) {
            addCriterion("news_stock1 between", value1, value2, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock1NotBetween(String value1, String value2) {
            addCriterion("news_stock1 not between", value1, value2, "newsStock1");
            return (Criteria) this;
        }

        public Criteria andNewsStock2IsNull() {
            addCriterion("news_stock2 is null");
            return (Criteria) this;
        }

        public Criteria andNewsStock2IsNotNull() {
            addCriterion("news_stock2 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsStock2EqualTo(String value) {
            addCriterion("news_stock2 =", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2NotEqualTo(String value) {
            addCriterion("news_stock2 <>", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2GreaterThan(String value) {
            addCriterion("news_stock2 >", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2GreaterThanOrEqualTo(String value) {
            addCriterion("news_stock2 >=", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2LessThan(String value) {
            addCriterion("news_stock2 <", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2LessThanOrEqualTo(String value) {
            addCriterion("news_stock2 <=", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2Like(String value) {
            addCriterion("news_stock2 like", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2NotLike(String value) {
            addCriterion("news_stock2 not like", value, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2In(List<String> values) {
            addCriterion("news_stock2 in", values, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2NotIn(List<String> values) {
            addCriterion("news_stock2 not in", values, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2Between(String value1, String value2) {
            addCriterion("news_stock2 between", value1, value2, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsStock2NotBetween(String value1, String value2) {
            addCriterion("news_stock2 not between", value1, value2, "newsStock2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2IsNull() {
            addCriterion("news_content2 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent2IsNotNull() {
            addCriterion("news_content2 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent2EqualTo(String value) {
            addCriterion("news_content2 =", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2NotEqualTo(String value) {
            addCriterion("news_content2 <>", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2GreaterThan(String value) {
            addCriterion("news_content2 >", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2GreaterThanOrEqualTo(String value) {
            addCriterion("news_content2 >=", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2LessThan(String value) {
            addCriterion("news_content2 <", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2LessThanOrEqualTo(String value) {
            addCriterion("news_content2 <=", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2Like(String value) {
            addCriterion("news_content2 like", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2NotLike(String value) {
            addCriterion("news_content2 not like", value, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2In(List<String> values) {
            addCriterion("news_content2 in", values, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2NotIn(List<String> values) {
            addCriterion("news_content2 not in", values, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2Between(String value1, String value2) {
            addCriterion("news_content2 between", value1, value2, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent2NotBetween(String value1, String value2) {
            addCriterion("news_content2 not between", value1, value2, "newsContent2");
            return (Criteria) this;
        }

        public Criteria andNewsContent3IsNull() {
            addCriterion("news_content3 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent3IsNotNull() {
            addCriterion("news_content3 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent3EqualTo(String value) {
            addCriterion("news_content3 =", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3NotEqualTo(String value) {
            addCriterion("news_content3 <>", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3GreaterThan(String value) {
            addCriterion("news_content3 >", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3GreaterThanOrEqualTo(String value) {
            addCriterion("news_content3 >=", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3LessThan(String value) {
            addCriterion("news_content3 <", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3LessThanOrEqualTo(String value) {
            addCriterion("news_content3 <=", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3Like(String value) {
            addCriterion("news_content3 like", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3NotLike(String value) {
            addCriterion("news_content3 not like", value, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3In(List<String> values) {
            addCriterion("news_content3 in", values, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3NotIn(List<String> values) {
            addCriterion("news_content3 not in", values, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3Between(String value1, String value2) {
            addCriterion("news_content3 between", value1, value2, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent3NotBetween(String value1, String value2) {
            addCriterion("news_content3 not between", value1, value2, "newsContent3");
            return (Criteria) this;
        }

        public Criteria andNewsContent4IsNull() {
            addCriterion("news_content4 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent4IsNotNull() {
            addCriterion("news_content4 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent4EqualTo(String value) {
            addCriterion("news_content4 =", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4NotEqualTo(String value) {
            addCriterion("news_content4 <>", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4GreaterThan(String value) {
            addCriterion("news_content4 >", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4GreaterThanOrEqualTo(String value) {
            addCriterion("news_content4 >=", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4LessThan(String value) {
            addCriterion("news_content4 <", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4LessThanOrEqualTo(String value) {
            addCriterion("news_content4 <=", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4Like(String value) {
            addCriterion("news_content4 like", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4NotLike(String value) {
            addCriterion("news_content4 not like", value, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4In(List<String> values) {
            addCriterion("news_content4 in", values, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4NotIn(List<String> values) {
            addCriterion("news_content4 not in", values, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4Between(String value1, String value2) {
            addCriterion("news_content4 between", value1, value2, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent4NotBetween(String value1, String value2) {
            addCriterion("news_content4 not between", value1, value2, "newsContent4");
            return (Criteria) this;
        }

        public Criteria andNewsContent5IsNull() {
            addCriterion("news_content5 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent5IsNotNull() {
            addCriterion("news_content5 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent5EqualTo(String value) {
            addCriterion("news_content5 =", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5NotEqualTo(String value) {
            addCriterion("news_content5 <>", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5GreaterThan(String value) {
            addCriterion("news_content5 >", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5GreaterThanOrEqualTo(String value) {
            addCriterion("news_content5 >=", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5LessThan(String value) {
            addCriterion("news_content5 <", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5LessThanOrEqualTo(String value) {
            addCriterion("news_content5 <=", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5Like(String value) {
            addCriterion("news_content5 like", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5NotLike(String value) {
            addCriterion("news_content5 not like", value, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5In(List<String> values) {
            addCriterion("news_content5 in", values, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5NotIn(List<String> values) {
            addCriterion("news_content5 not in", values, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5Between(String value1, String value2) {
            addCriterion("news_content5 between", value1, value2, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent5NotBetween(String value1, String value2) {
            addCriterion("news_content5 not between", value1, value2, "newsContent5");
            return (Criteria) this;
        }

        public Criteria andNewsContent6IsNull() {
            addCriterion("news_content6 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent6IsNotNull() {
            addCriterion("news_content6 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent6EqualTo(String value) {
            addCriterion("news_content6 =", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6NotEqualTo(String value) {
            addCriterion("news_content6 <>", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6GreaterThan(String value) {
            addCriterion("news_content6 >", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6GreaterThanOrEqualTo(String value) {
            addCriterion("news_content6 >=", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6LessThan(String value) {
            addCriterion("news_content6 <", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6LessThanOrEqualTo(String value) {
            addCriterion("news_content6 <=", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6Like(String value) {
            addCriterion("news_content6 like", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6NotLike(String value) {
            addCriterion("news_content6 not like", value, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6In(List<String> values) {
            addCriterion("news_content6 in", values, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6NotIn(List<String> values) {
            addCriterion("news_content6 not in", values, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6Between(String value1, String value2) {
            addCriterion("news_content6 between", value1, value2, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent6NotBetween(String value1, String value2) {
            addCriterion("news_content6 not between", value1, value2, "newsContent6");
            return (Criteria) this;
        }

        public Criteria andNewsContent7IsNull() {
            addCriterion("news_content7 is null");
            return (Criteria) this;
        }

        public Criteria andNewsContent7IsNotNull() {
            addCriterion("news_content7 is not null");
            return (Criteria) this;
        }

        public Criteria andNewsContent7EqualTo(String value) {
            addCriterion("news_content7 =", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7NotEqualTo(String value) {
            addCriterion("news_content7 <>", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7GreaterThan(String value) {
            addCriterion("news_content7 >", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7GreaterThanOrEqualTo(String value) {
            addCriterion("news_content7 >=", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7LessThan(String value) {
            addCriterion("news_content7 <", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7LessThanOrEqualTo(String value) {
            addCriterion("news_content7 <=", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7Like(String value) {
            addCriterion("news_content7 like", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7NotLike(String value) {
            addCriterion("news_content7 not like", value, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7In(List<String> values) {
            addCriterion("news_content7 in", values, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7NotIn(List<String> values) {
            addCriterion("news_content7 not in", values, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7Between(String value1, String value2) {
            addCriterion("news_content7 between", value1, value2, "newsContent7");
            return (Criteria) this;
        }

        public Criteria andNewsContent7NotBetween(String value1, String value2) {
            addCriterion("news_content7 not between", value1, value2, "newsContent7");
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