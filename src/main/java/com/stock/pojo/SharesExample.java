package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class SharesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SharesExample() {
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

        public Criteria andSharesIdIsNull() {
            addCriterion("shares_id is null");
            return (Criteria) this;
        }

        public Criteria andSharesIdIsNotNull() {
            addCriterion("shares_id is not null");
            return (Criteria) this;
        }

        public Criteria andSharesIdEqualTo(String value) {
            addCriterion("shares_id =", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdNotEqualTo(String value) {
            addCriterion("shares_id <>", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdGreaterThan(String value) {
            addCriterion("shares_id >", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdGreaterThanOrEqualTo(String value) {
            addCriterion("shares_id >=", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdLessThan(String value) {
            addCriterion("shares_id <", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdLessThanOrEqualTo(String value) {
            addCriterion("shares_id <=", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdLike(String value) {
            addCriterion("shares_id like", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdNotLike(String value) {
            addCriterion("shares_id not like", value, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdIn(List<String> values) {
            addCriterion("shares_id in", values, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdNotIn(List<String> values) {
            addCriterion("shares_id not in", values, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdBetween(String value1, String value2) {
            addCriterion("shares_id between", value1, value2, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesIdNotBetween(String value1, String value2) {
            addCriterion("shares_id not between", value1, value2, "sharesId");
            return (Criteria) this;
        }

        public Criteria andSharesCodeIsNull() {
            addCriterion("shares_code is null");
            return (Criteria) this;
        }

        public Criteria andSharesCodeIsNotNull() {
            addCriterion("shares_code is not null");
            return (Criteria) this;
        }

        public Criteria andSharesCodeEqualTo(String value) {
            addCriterion("shares_code =", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeNotEqualTo(String value) {
            addCriterion("shares_code <>", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeGreaterThan(String value) {
            addCriterion("shares_code >", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shares_code >=", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeLessThan(String value) {
            addCriterion("shares_code <", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeLessThanOrEqualTo(String value) {
            addCriterion("shares_code <=", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeLike(String value) {
            addCriterion("shares_code like", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeNotLike(String value) {
            addCriterion("shares_code not like", value, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeIn(List<String> values) {
            addCriterion("shares_code in", values, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeNotIn(List<String> values) {
            addCriterion("shares_code not in", values, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeBetween(String value1, String value2) {
            addCriterion("shares_code between", value1, value2, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesCodeNotBetween(String value1, String value2) {
            addCriterion("shares_code not between", value1, value2, "sharesCode");
            return (Criteria) this;
        }

        public Criteria andSharesNameIsNull() {
            addCriterion("shares_name is null");
            return (Criteria) this;
        }

        public Criteria andSharesNameIsNotNull() {
            addCriterion("shares_name is not null");
            return (Criteria) this;
        }

        public Criteria andSharesNameEqualTo(String value) {
            addCriterion("shares_name =", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameNotEqualTo(String value) {
            addCriterion("shares_name <>", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameGreaterThan(String value) {
            addCriterion("shares_name >", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameGreaterThanOrEqualTo(String value) {
            addCriterion("shares_name >=", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameLessThan(String value) {
            addCriterion("shares_name <", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameLessThanOrEqualTo(String value) {
            addCriterion("shares_name <=", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameLike(String value) {
            addCriterion("shares_name like", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameNotLike(String value) {
            addCriterion("shares_name not like", value, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameIn(List<String> values) {
            addCriterion("shares_name in", values, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameNotIn(List<String> values) {
            addCriterion("shares_name not in", values, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameBetween(String value1, String value2) {
            addCriterion("shares_name between", value1, value2, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesNameNotBetween(String value1, String value2) {
            addCriterion("shares_name not between", value1, value2, "sharesName");
            return (Criteria) this;
        }

        public Criteria andSharesTitleIsNull() {
            addCriterion("shares_title is null");
            return (Criteria) this;
        }

        public Criteria andSharesTitleIsNotNull() {
            addCriterion("shares_title is not null");
            return (Criteria) this;
        }

        public Criteria andSharesTitleEqualTo(String value) {
            addCriterion("shares_title =", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleNotEqualTo(String value) {
            addCriterion("shares_title <>", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleGreaterThan(String value) {
            addCriterion("shares_title >", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleGreaterThanOrEqualTo(String value) {
            addCriterion("shares_title >=", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleLessThan(String value) {
            addCriterion("shares_title <", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleLessThanOrEqualTo(String value) {
            addCriterion("shares_title <=", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleLike(String value) {
            addCriterion("shares_title like", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleNotLike(String value) {
            addCriterion("shares_title not like", value, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleIn(List<String> values) {
            addCriterion("shares_title in", values, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleNotIn(List<String> values) {
            addCriterion("shares_title not in", values, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleBetween(String value1, String value2) {
            addCriterion("shares_title between", value1, value2, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andSharesTitleNotBetween(String value1, String value2) {
            addCriterion("shares_title not between", value1, value2, "sharesTitle");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andClickNumIsNull() {
            addCriterion("click_num is null");
            return (Criteria) this;
        }

        public Criteria andClickNumIsNotNull() {
            addCriterion("click_num is not null");
            return (Criteria) this;
        }

        public Criteria andClickNumEqualTo(String value) {
            addCriterion("click_num =", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotEqualTo(String value) {
            addCriterion("click_num <>", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThan(String value) {
            addCriterion("click_num >", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumGreaterThanOrEqualTo(String value) {
            addCriterion("click_num >=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThan(String value) {
            addCriterion("click_num <", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLessThanOrEqualTo(String value) {
            addCriterion("click_num <=", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumLike(String value) {
            addCriterion("click_num like", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotLike(String value) {
            addCriterion("click_num not like", value, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumIn(List<String> values) {
            addCriterion("click_num in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotIn(List<String> values) {
            addCriterion("click_num not in", values, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumBetween(String value1, String value2) {
            addCriterion("click_num between", value1, value2, "clickNum");
            return (Criteria) this;
        }

        public Criteria andClickNumNotBetween(String value1, String value2) {
            addCriterion("click_num not between", value1, value2, "clickNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNull() {
            addCriterion("reply_num is null");
            return (Criteria) this;
        }

        public Criteria andReplyNumIsNotNull() {
            addCriterion("reply_num is not null");
            return (Criteria) this;
        }

        public Criteria andReplyNumEqualTo(String value) {
            addCriterion("reply_num =", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotEqualTo(String value) {
            addCriterion("reply_num <>", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThan(String value) {
            addCriterion("reply_num >", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumGreaterThanOrEqualTo(String value) {
            addCriterion("reply_num >=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThan(String value) {
            addCriterion("reply_num <", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLessThanOrEqualTo(String value) {
            addCriterion("reply_num <=", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumLike(String value) {
            addCriterion("reply_num like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotLike(String value) {
            addCriterion("reply_num not like", value, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumIn(List<String> values) {
            addCriterion("reply_num in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotIn(List<String> values) {
            addCriterion("reply_num not in", values, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumBetween(String value1, String value2) {
            addCriterion("reply_num between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyNumNotBetween(String value1, String value2) {
            addCriterion("reply_num not between", value1, value2, "replyNum");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNull() {
            addCriterion("reply_content is null");
            return (Criteria) this;
        }

        public Criteria andReplyContentIsNotNull() {
            addCriterion("reply_content is not null");
            return (Criteria) this;
        }

        public Criteria andReplyContentEqualTo(String value) {
            addCriterion("reply_content =", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotEqualTo(String value) {
            addCriterion("reply_content <>", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThan(String value) {
            addCriterion("reply_content >", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentGreaterThanOrEqualTo(String value) {
            addCriterion("reply_content >=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThan(String value) {
            addCriterion("reply_content <", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLessThanOrEqualTo(String value) {
            addCriterion("reply_content <=", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentLike(String value) {
            addCriterion("reply_content like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotLike(String value) {
            addCriterion("reply_content not like", value, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentIn(List<String> values) {
            addCriterion("reply_content in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotIn(List<String> values) {
            addCriterion("reply_content not in", values, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentBetween(String value1, String value2) {
            addCriterion("reply_content between", value1, value2, "replyContent");
            return (Criteria) this;
        }

        public Criteria andReplyContentNotBetween(String value1, String value2) {
            addCriterion("reply_content not between", value1, value2, "replyContent");
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