package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogTittleIsNull() {
            addCriterion("blog_tittle is null");
            return (Criteria) this;
        }

        public Criteria andBlogTittleIsNotNull() {
            addCriterion("blog_tittle is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTittleEqualTo(String value) {
            addCriterion("blog_tittle =", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleNotEqualTo(String value) {
            addCriterion("blog_tittle <>", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleGreaterThan(String value) {
            addCriterion("blog_tittle >", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_tittle >=", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleLessThan(String value) {
            addCriterion("blog_tittle <", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleLessThanOrEqualTo(String value) {
            addCriterion("blog_tittle <=", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleLike(String value) {
            addCriterion("blog_tittle like", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleNotLike(String value) {
            addCriterion("blog_tittle not like", value, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleIn(List<String> values) {
            addCriterion("blog_tittle in", values, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleNotIn(List<String> values) {
            addCriterion("blog_tittle not in", values, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleBetween(String value1, String value2) {
            addCriterion("blog_tittle between", value1, value2, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogTittleNotBetween(String value1, String value2) {
            addCriterion("blog_tittle not between", value1, value2, "blogTittle");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNull() {
            addCriterion("blog_author is null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNotNull() {
            addCriterion("blog_author is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorEqualTo(String value) {
            addCriterion("blog_author =", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotEqualTo(String value) {
            addCriterion("blog_author <>", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThan(String value) {
            addCriterion("blog_author >", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_author >=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThan(String value) {
            addCriterion("blog_author <", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThanOrEqualTo(String value) {
            addCriterion("blog_author <=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLike(String value) {
            addCriterion("blog_author like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotLike(String value) {
            addCriterion("blog_author not like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIn(List<String> values) {
            addCriterion("blog_author in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotIn(List<String> values) {
            addCriterion("blog_author not in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorBetween(String value1, String value2) {
            addCriterion("blog_author between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotBetween(String value1, String value2) {
            addCriterion("blog_author not between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumIsNull() {
            addCriterion("blog_clicknum is null");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumIsNotNull() {
            addCriterion("blog_clicknum is not null");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumEqualTo(String value) {
            addCriterion("blog_clicknum =", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumNotEqualTo(String value) {
            addCriterion("blog_clicknum <>", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumGreaterThan(String value) {
            addCriterion("blog_clicknum >", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumGreaterThanOrEqualTo(String value) {
            addCriterion("blog_clicknum >=", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumLessThan(String value) {
            addCriterion("blog_clicknum <", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumLessThanOrEqualTo(String value) {
            addCriterion("blog_clicknum <=", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumLike(String value) {
            addCriterion("blog_clicknum like", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumNotLike(String value) {
            addCriterion("blog_clicknum not like", value, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumIn(List<String> values) {
            addCriterion("blog_clicknum in", values, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumNotIn(List<String> values) {
            addCriterion("blog_clicknum not in", values, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumBetween(String value1, String value2) {
            addCriterion("blog_clicknum between", value1, value2, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogClicknumNotBetween(String value1, String value2) {
            addCriterion("blog_clicknum not between", value1, value2, "blogClicknum");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiIsNull() {
            addCriterion("blog_renqi is null");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiIsNotNull() {
            addCriterion("blog_renqi is not null");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiEqualTo(String value) {
            addCriterion("blog_renqi =", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiNotEqualTo(String value) {
            addCriterion("blog_renqi <>", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiGreaterThan(String value) {
            addCriterion("blog_renqi >", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiGreaterThanOrEqualTo(String value) {
            addCriterion("blog_renqi >=", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiLessThan(String value) {
            addCriterion("blog_renqi <", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiLessThanOrEqualTo(String value) {
            addCriterion("blog_renqi <=", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiLike(String value) {
            addCriterion("blog_renqi like", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiNotLike(String value) {
            addCriterion("blog_renqi not like", value, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiIn(List<String> values) {
            addCriterion("blog_renqi in", values, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiNotIn(List<String> values) {
            addCriterion("blog_renqi not in", values, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiBetween(String value1, String value2) {
            addCriterion("blog_renqi between", value1, value2, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogRenqiNotBetween(String value1, String value2) {
            addCriterion("blog_renqi not between", value1, value2, "blogRenqi");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNull() {
            addCriterion("blog_date is null");
            return (Criteria) this;
        }

        public Criteria andBlogDateIsNotNull() {
            addCriterion("blog_date is not null");
            return (Criteria) this;
        }

        public Criteria andBlogDateEqualTo(String value) {
            addCriterion("blog_date =", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotEqualTo(String value) {
            addCriterion("blog_date <>", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThan(String value) {
            addCriterion("blog_date >", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateGreaterThanOrEqualTo(String value) {
            addCriterion("blog_date >=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThan(String value) {
            addCriterion("blog_date <", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLessThanOrEqualTo(String value) {
            addCriterion("blog_date <=", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateLike(String value) {
            addCriterion("blog_date like", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotLike(String value) {
            addCriterion("blog_date not like", value, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateIn(List<String> values) {
            addCriterion("blog_date in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotIn(List<String> values) {
            addCriterion("blog_date not in", values, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateBetween(String value1, String value2) {
            addCriterion("blog_date between", value1, value2, "blogDate");
            return (Criteria) this;
        }

        public Criteria andBlogDateNotBetween(String value1, String value2) {
            addCriterion("blog_date not between", value1, value2, "blogDate");
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