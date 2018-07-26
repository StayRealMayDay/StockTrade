package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class NewtopstockinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NewtopstockinfoExample() {
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

        public Criteria andStockNumIsNull() {
            addCriterion("stock_num is null");
            return (Criteria) this;
        }

        public Criteria andStockNumIsNotNull() {
            addCriterion("stock_num is not null");
            return (Criteria) this;
        }

        public Criteria andStockNumEqualTo(String value) {
            addCriterion("stock_num =", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotEqualTo(String value) {
            addCriterion("stock_num <>", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThan(String value) {
            addCriterion("stock_num >", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumGreaterThanOrEqualTo(String value) {
            addCriterion("stock_num >=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThan(String value) {
            addCriterion("stock_num <", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLessThanOrEqualTo(String value) {
            addCriterion("stock_num <=", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumLike(String value) {
            addCriterion("stock_num like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotLike(String value) {
            addCriterion("stock_num not like", value, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumIn(List<String> values) {
            addCriterion("stock_num in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotIn(List<String> values) {
            addCriterion("stock_num not in", values, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumBetween(String value1, String value2) {
            addCriterion("stock_num between", value1, value2, "stockNum");
            return (Criteria) this;
        }

        public Criteria andStockNumNotBetween(String value1, String value2) {
            addCriterion("stock_num not between", value1, value2, "stockNum");
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyEngIsNull() {
            addCriterion("company_eng is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEngIsNotNull() {
            addCriterion("company_eng is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEngEqualTo(String value) {
            addCriterion("company_eng =", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngNotEqualTo(String value) {
            addCriterion("company_eng <>", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngGreaterThan(String value) {
            addCriterion("company_eng >", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngGreaterThanOrEqualTo(String value) {
            addCriterion("company_eng >=", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngLessThan(String value) {
            addCriterion("company_eng <", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngLessThanOrEqualTo(String value) {
            addCriterion("company_eng <=", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngLike(String value) {
            addCriterion("company_eng like", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngNotLike(String value) {
            addCriterion("company_eng not like", value, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngIn(List<String> values) {
            addCriterion("company_eng in", values, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngNotIn(List<String> values) {
            addCriterion("company_eng not in", values, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngBetween(String value1, String value2) {
            addCriterion("company_eng between", value1, value2, "companyEng");
            return (Criteria) this;
        }

        public Criteria andCompanyEngNotBetween(String value1, String value2) {
            addCriterion("company_eng not between", value1, value2, "companyEng");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNull() {
            addCriterion("industry_id is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIsNotNull() {
            addCriterion("industry_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryIdEqualTo(String value) {
            addCriterion("industry_id =", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotEqualTo(String value) {
            addCriterion("industry_id <>", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThan(String value) {
            addCriterion("industry_id >", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdGreaterThanOrEqualTo(String value) {
            addCriterion("industry_id >=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThan(String value) {
            addCriterion("industry_id <", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLessThanOrEqualTo(String value) {
            addCriterion("industry_id <=", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdLike(String value) {
            addCriterion("industry_id like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotLike(String value) {
            addCriterion("industry_id not like", value, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdIn(List<String> values) {
            addCriterion("industry_id in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotIn(List<String> values) {
            addCriterion("industry_id not in", values, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdBetween(String value1, String value2) {
            addCriterion("industry_id between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIdNotBetween(String value1, String value2) {
            addCriterion("industry_id not between", value1, value2, "industryId");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andChengliDayIsNull() {
            addCriterion("chengLi_day is null");
            return (Criteria) this;
        }

        public Criteria andChengliDayIsNotNull() {
            addCriterion("chengLi_day is not null");
            return (Criteria) this;
        }

        public Criteria andChengliDayEqualTo(String value) {
            addCriterion("chengLi_day =", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayNotEqualTo(String value) {
            addCriterion("chengLi_day <>", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayGreaterThan(String value) {
            addCriterion("chengLi_day >", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayGreaterThanOrEqualTo(String value) {
            addCriterion("chengLi_day >=", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayLessThan(String value) {
            addCriterion("chengLi_day <", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayLessThanOrEqualTo(String value) {
            addCriterion("chengLi_day <=", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayLike(String value) {
            addCriterion("chengLi_day like", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayNotLike(String value) {
            addCriterion("chengLi_day not like", value, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayIn(List<String> values) {
            addCriterion("chengLi_day in", values, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayNotIn(List<String> values) {
            addCriterion("chengLi_day not in", values, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayBetween(String value1, String value2) {
            addCriterion("chengLi_day between", value1, value2, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andChengliDayNotBetween(String value1, String value2) {
            addCriterion("chengLi_day not between", value1, value2, "chengliDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayIsNull() {
            addCriterion("shangshi_day is null");
            return (Criteria) this;
        }

        public Criteria andShangshiDayIsNotNull() {
            addCriterion("shangshi_day is not null");
            return (Criteria) this;
        }

        public Criteria andShangshiDayEqualTo(String value) {
            addCriterion("shangshi_day =", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayNotEqualTo(String value) {
            addCriterion("shangshi_day <>", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayGreaterThan(String value) {
            addCriterion("shangshi_day >", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayGreaterThanOrEqualTo(String value) {
            addCriterion("shangshi_day >=", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayLessThan(String value) {
            addCriterion("shangshi_day <", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayLessThanOrEqualTo(String value) {
            addCriterion("shangshi_day <=", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayLike(String value) {
            addCriterion("shangshi_day like", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayNotLike(String value) {
            addCriterion("shangshi_day not like", value, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayIn(List<String> values) {
            addCriterion("shangshi_day in", values, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayNotIn(List<String> values) {
            addCriterion("shangshi_day not in", values, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayBetween(String value1, String value2) {
            addCriterion("shangshi_day between", value1, value2, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andShangshiDayNotBetween(String value1, String value2) {
            addCriterion("shangshi_day not between", value1, value2, "shangshiDay");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceIsNull() {
            addCriterion("faxing_Price is null");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceIsNotNull() {
            addCriterion("faxing_Price is not null");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceEqualTo(String value) {
            addCriterion("faxing_Price =", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceNotEqualTo(String value) {
            addCriterion("faxing_Price <>", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceGreaterThan(String value) {
            addCriterion("faxing_Price >", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceGreaterThanOrEqualTo(String value) {
            addCriterion("faxing_Price >=", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceLessThan(String value) {
            addCriterion("faxing_Price <", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceLessThanOrEqualTo(String value) {
            addCriterion("faxing_Price <=", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceLike(String value) {
            addCriterion("faxing_Price like", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceNotLike(String value) {
            addCriterion("faxing_Price not like", value, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceIn(List<String> values) {
            addCriterion("faxing_Price in", values, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceNotIn(List<String> values) {
            addCriterion("faxing_Price not in", values, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceBetween(String value1, String value2) {
            addCriterion("faxing_Price between", value1, value2, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingPriceNotBetween(String value1, String value2) {
            addCriterion("faxing_Price not between", value1, value2, "faxingPrice");
            return (Criteria) this;
        }

        public Criteria andFaxingNumIsNull() {
            addCriterion("faxing_Num is null");
            return (Criteria) this;
        }

        public Criteria andFaxingNumIsNotNull() {
            addCriterion("faxing_Num is not null");
            return (Criteria) this;
        }

        public Criteria andFaxingNumEqualTo(String value) {
            addCriterion("faxing_Num =", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumNotEqualTo(String value) {
            addCriterion("faxing_Num <>", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumGreaterThan(String value) {
            addCriterion("faxing_Num >", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumGreaterThanOrEqualTo(String value) {
            addCriterion("faxing_Num >=", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumLessThan(String value) {
            addCriterion("faxing_Num <", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumLessThanOrEqualTo(String value) {
            addCriterion("faxing_Num <=", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumLike(String value) {
            addCriterion("faxing_Num like", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumNotLike(String value) {
            addCriterion("faxing_Num not like", value, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumIn(List<String> values) {
            addCriterion("faxing_Num in", values, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumNotIn(List<String> values) {
            addCriterion("faxing_Num not in", values, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumBetween(String value1, String value2) {
            addCriterion("faxing_Num between", value1, value2, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingNumNotBetween(String value1, String value2) {
            addCriterion("faxing_Num not between", value1, value2, "faxingNum");
            return (Criteria) this;
        }

        public Criteria andFaxingDayIsNull() {
            addCriterion("faxing_Day is null");
            return (Criteria) this;
        }

        public Criteria andFaxingDayIsNotNull() {
            addCriterion("faxing_Day is not null");
            return (Criteria) this;
        }

        public Criteria andFaxingDayEqualTo(String value) {
            addCriterion("faxing_Day =", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayNotEqualTo(String value) {
            addCriterion("faxing_Day <>", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayGreaterThan(String value) {
            addCriterion("faxing_Day >", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayGreaterThanOrEqualTo(String value) {
            addCriterion("faxing_Day >=", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayLessThan(String value) {
            addCriterion("faxing_Day <", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayLessThanOrEqualTo(String value) {
            addCriterion("faxing_Day <=", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayLike(String value) {
            addCriterion("faxing_Day like", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayNotLike(String value) {
            addCriterion("faxing_Day not like", value, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayIn(List<String> values) {
            addCriterion("faxing_Day in", values, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayNotIn(List<String> values) {
            addCriterion("faxing_Day not in", values, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayBetween(String value1, String value2) {
            addCriterion("faxing_Day between", value1, value2, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andFaxingDayNotBetween(String value1, String value2) {
            addCriterion("faxing_Day not between", value1, value2, "faxingDay");
            return (Criteria) this;
        }

        public Criteria andShichangTypeIsNull() {
            addCriterion("shichang_Type is null");
            return (Criteria) this;
        }

        public Criteria andShichangTypeIsNotNull() {
            addCriterion("shichang_Type is not null");
            return (Criteria) this;
        }

        public Criteria andShichangTypeEqualTo(String value) {
            addCriterion("shichang_Type =", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeNotEqualTo(String value) {
            addCriterion("shichang_Type <>", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeGreaterThan(String value) {
            addCriterion("shichang_Type >", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shichang_Type >=", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeLessThan(String value) {
            addCriterion("shichang_Type <", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeLessThanOrEqualTo(String value) {
            addCriterion("shichang_Type <=", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeLike(String value) {
            addCriterion("shichang_Type like", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeNotLike(String value) {
            addCriterion("shichang_Type not like", value, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeIn(List<String> values) {
            addCriterion("shichang_Type in", values, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeNotIn(List<String> values) {
            addCriterion("shichang_Type not in", values, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeBetween(String value1, String value2) {
            addCriterion("shichang_Type between", value1, value2, "shichangType");
            return (Criteria) this;
        }

        public Criteria andShichangTypeNotBetween(String value1, String value2) {
            addCriterion("shichang_Type not between", value1, value2, "shichangType");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaIsNull() {
            addCriterion("faxing_yijia is null");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaIsNotNull() {
            addCriterion("faxing_yijia is not null");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaEqualTo(String value) {
            addCriterion("faxing_yijia =", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaNotEqualTo(String value) {
            addCriterion("faxing_yijia <>", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaGreaterThan(String value) {
            addCriterion("faxing_yijia >", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaGreaterThanOrEqualTo(String value) {
            addCriterion("faxing_yijia >=", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaLessThan(String value) {
            addCriterion("faxing_yijia <", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaLessThanOrEqualTo(String value) {
            addCriterion("faxing_yijia <=", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaLike(String value) {
            addCriterion("faxing_yijia like", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaNotLike(String value) {
            addCriterion("faxing_yijia not like", value, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaIn(List<String> values) {
            addCriterion("faxing_yijia in", values, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaNotIn(List<String> values) {
            addCriterion("faxing_yijia not in", values, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaBetween(String value1, String value2) {
            addCriterion("faxing_yijia between", value1, value2, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andFaxingYijiaNotBetween(String value1, String value2) {
            addCriterion("faxing_yijia not between", value1, value2, "faxingYijia");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongIsNull() {
            addCriterion("company_huodong is null");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongIsNotNull() {
            addCriterion("company_huodong is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongEqualTo(String value) {
            addCriterion("company_huodong =", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongNotEqualTo(String value) {
            addCriterion("company_huodong <>", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongGreaterThan(String value) {
            addCriterion("company_huodong >", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongGreaterThanOrEqualTo(String value) {
            addCriterion("company_huodong >=", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongLessThan(String value) {
            addCriterion("company_huodong <", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongLessThanOrEqualTo(String value) {
            addCriterion("company_huodong <=", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongLike(String value) {
            addCriterion("company_huodong like", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongNotLike(String value) {
            addCriterion("company_huodong not like", value, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongIn(List<String> values) {
            addCriterion("company_huodong in", values, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongNotIn(List<String> values) {
            addCriterion("company_huodong not in", values, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongBetween(String value1, String value2) {
            addCriterion("company_huodong between", value1, value2, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andCompanyHuodongNotBetween(String value1, String value2) {
            addCriterion("company_huodong not between", value1, value2, "companyHuodong");
            return (Criteria) this;
        }

        public Criteria andMenleiIsNull() {
            addCriterion("menLei is null");
            return (Criteria) this;
        }

        public Criteria andMenleiIsNotNull() {
            addCriterion("menLei is not null");
            return (Criteria) this;
        }

        public Criteria andMenleiEqualTo(String value) {
            addCriterion("menLei =", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiNotEqualTo(String value) {
            addCriterion("menLei <>", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiGreaterThan(String value) {
            addCriterion("menLei >", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiGreaterThanOrEqualTo(String value) {
            addCriterion("menLei >=", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiLessThan(String value) {
            addCriterion("menLei <", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiLessThanOrEqualTo(String value) {
            addCriterion("menLei <=", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiLike(String value) {
            addCriterion("menLei like", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiNotLike(String value) {
            addCriterion("menLei not like", value, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiIn(List<String> values) {
            addCriterion("menLei in", values, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiNotIn(List<String> values) {
            addCriterion("menLei not in", values, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiBetween(String value1, String value2) {
            addCriterion("menLei between", value1, value2, "menlei");
            return (Criteria) this;
        }

        public Criteria andMenleiNotBetween(String value1, String value2) {
            addCriterion("menLei not between", value1, value2, "menlei");
            return (Criteria) this;
        }

        public Criteria andChengjiYearIsNull() {
            addCriterion("chengji_Year is null");
            return (Criteria) this;
        }

        public Criteria andChengjiYearIsNotNull() {
            addCriterion("chengji_Year is not null");
            return (Criteria) this;
        }

        public Criteria andChengjiYearEqualTo(String value) {
            addCriterion("chengji_Year =", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearNotEqualTo(String value) {
            addCriterion("chengji_Year <>", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearGreaterThan(String value) {
            addCriterion("chengji_Year >", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearGreaterThanOrEqualTo(String value) {
            addCriterion("chengji_Year >=", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearLessThan(String value) {
            addCriterion("chengji_Year <", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearLessThanOrEqualTo(String value) {
            addCriterion("chengji_Year <=", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearLike(String value) {
            addCriterion("chengji_Year like", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearNotLike(String value) {
            addCriterion("chengji_Year not like", value, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearIn(List<String> values) {
            addCriterion("chengji_Year in", values, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearNotIn(List<String> values) {
            addCriterion("chengji_Year not in", values, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearBetween(String value1, String value2) {
            addCriterion("chengji_Year between", value1, value2, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andChengjiYearNotBetween(String value1, String value2) {
            addCriterion("chengji_Year not between", value1, value2, "chengjiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearIsNull() {
            addCriterion("shangshi_Year is null");
            return (Criteria) this;
        }

        public Criteria andShangshiYearIsNotNull() {
            addCriterion("shangshi_Year is not null");
            return (Criteria) this;
        }

        public Criteria andShangshiYearEqualTo(String value) {
            addCriterion("shangshi_Year =", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearNotEqualTo(String value) {
            addCriterion("shangshi_Year <>", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearGreaterThan(String value) {
            addCriterion("shangshi_Year >", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearGreaterThanOrEqualTo(String value) {
            addCriterion("shangshi_Year >=", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearLessThan(String value) {
            addCriterion("shangshi_Year <", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearLessThanOrEqualTo(String value) {
            addCriterion("shangshi_Year <=", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearLike(String value) {
            addCriterion("shangshi_Year like", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearNotLike(String value) {
            addCriterion("shangshi_Year not like", value, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearIn(List<String> values) {
            addCriterion("shangshi_Year in", values, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearNotIn(List<String> values) {
            addCriterion("shangshi_Year not in", values, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearBetween(String value1, String value2) {
            addCriterion("shangshi_Year between", value1, value2, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andShangshiYearNotBetween(String value1, String value2) {
            addCriterion("shangshi_Year not between", value1, value2, "shangshiYear");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNull() {
            addCriterion("company_area is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIsNotNull() {
            addCriterion("company_area is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaEqualTo(String value) {
            addCriterion("company_area =", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotEqualTo(String value) {
            addCriterion("company_area <>", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThan(String value) {
            addCriterion("company_area >", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaGreaterThanOrEqualTo(String value) {
            addCriterion("company_area >=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThan(String value) {
            addCriterion("company_area <", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLessThanOrEqualTo(String value) {
            addCriterion("company_area <=", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaLike(String value) {
            addCriterion("company_area like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotLike(String value) {
            addCriterion("company_area not like", value, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaIn(List<String> values) {
            addCriterion("company_area in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotIn(List<String> values) {
            addCriterion("company_area not in", values, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaBetween(String value1, String value2) {
            addCriterion("company_area between", value1, value2, "companyArea");
            return (Criteria) this;
        }

        public Criteria andCompanyAreaNotBetween(String value1, String value2) {
            addCriterion("company_area not between", value1, value2, "companyArea");
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