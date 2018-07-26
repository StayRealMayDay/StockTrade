package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class HolderyearstatisticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolderyearstatisticExample() {
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andStockholderIsNull() {
            addCriterion("stockHolder is null");
            return (Criteria) this;
        }

        public Criteria andStockholderIsNotNull() {
            addCriterion("stockHolder is not null");
            return (Criteria) this;
        }

        public Criteria andStockholderEqualTo(String value) {
            addCriterion("stockHolder =", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderNotEqualTo(String value) {
            addCriterion("stockHolder <>", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderGreaterThan(String value) {
            addCriterion("stockHolder >", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderGreaterThanOrEqualTo(String value) {
            addCriterion("stockHolder >=", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderLessThan(String value) {
            addCriterion("stockHolder <", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderLessThanOrEqualTo(String value) {
            addCriterion("stockHolder <=", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderLike(String value) {
            addCriterion("stockHolder like", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderNotLike(String value) {
            addCriterion("stockHolder not like", value, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderIn(List<String> values) {
            addCriterion("stockHolder in", values, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderNotIn(List<String> values) {
            addCriterion("stockHolder not in", values, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderBetween(String value1, String value2) {
            addCriterion("stockHolder between", value1, value2, "stockholder");
            return (Criteria) this;
        }

        public Criteria andStockholderNotBetween(String value1, String value2) {
            addCriterion("stockHolder not between", value1, value2, "stockholder");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("year like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("year not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumIsNull() {
            addCriterion("industryDaLeiSum is null");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumIsNotNull() {
            addCriterion("industryDaLeiSum is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumEqualTo(Integer value) {
            addCriterion("industryDaLeiSum =", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumNotEqualTo(Integer value) {
            addCriterion("industryDaLeiSum <>", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumGreaterThan(Integer value) {
            addCriterion("industryDaLeiSum >", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumGreaterThanOrEqualTo(Integer value) {
            addCriterion("industryDaLeiSum >=", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumLessThan(Integer value) {
            addCriterion("industryDaLeiSum <", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumLessThanOrEqualTo(Integer value) {
            addCriterion("industryDaLeiSum <=", value, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumIn(List<Integer> values) {
            addCriterion("industryDaLeiSum in", values, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumNotIn(List<Integer> values) {
            addCriterion("industryDaLeiSum not in", values, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumBetween(Integer value1, Integer value2) {
            addCriterion("industryDaLeiSum between", value1, value2, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrydaleisumNotBetween(Integer value1, Integer value2) {
            addCriterion("industryDaLeiSum not between", value1, value2, "industrydaleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumIsNull() {
            addCriterion("industryMenLeiSum is null");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumIsNotNull() {
            addCriterion("industryMenLeiSum is not null");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumEqualTo(Integer value) {
            addCriterion("industryMenLeiSum =", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumNotEqualTo(Integer value) {
            addCriterion("industryMenLeiSum <>", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumGreaterThan(Integer value) {
            addCriterion("industryMenLeiSum >", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumGreaterThanOrEqualTo(Integer value) {
            addCriterion("industryMenLeiSum >=", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumLessThan(Integer value) {
            addCriterion("industryMenLeiSum <", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumLessThanOrEqualTo(Integer value) {
            addCriterion("industryMenLeiSum <=", value, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumIn(List<Integer> values) {
            addCriterion("industryMenLeiSum in", values, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumNotIn(List<Integer> values) {
            addCriterion("industryMenLeiSum not in", values, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumBetween(Integer value1, Integer value2) {
            addCriterion("industryMenLeiSum between", value1, value2, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andIndustrymenleisumNotBetween(Integer value1, Integer value2) {
            addCriterion("industryMenLeiSum not between", value1, value2, "industrymenleisum");
            return (Criteria) this;
        }

        public Criteria andHurateIsNull() {
            addCriterion("huRate is null");
            return (Criteria) this;
        }

        public Criteria andHurateIsNotNull() {
            addCriterion("huRate is not null");
            return (Criteria) this;
        }

        public Criteria andHurateEqualTo(Float value) {
            addCriterion("huRate =", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateNotEqualTo(Float value) {
            addCriterion("huRate <>", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateGreaterThan(Float value) {
            addCriterion("huRate >", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateGreaterThanOrEqualTo(Float value) {
            addCriterion("huRate >=", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateLessThan(Float value) {
            addCriterion("huRate <", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateLessThanOrEqualTo(Float value) {
            addCriterion("huRate <=", value, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateIn(List<Float> values) {
            addCriterion("huRate in", values, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateNotIn(List<Float> values) {
            addCriterion("huRate not in", values, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateBetween(Float value1, Float value2) {
            addCriterion("huRate between", value1, value2, "hurate");
            return (Criteria) this;
        }

        public Criteria andHurateNotBetween(Float value1, Float value2) {
            addCriterion("huRate not between", value1, value2, "hurate");
            return (Criteria) this;
        }

        public Criteria andShenrateIsNull() {
            addCriterion("shenRate is null");
            return (Criteria) this;
        }

        public Criteria andShenrateIsNotNull() {
            addCriterion("shenRate is not null");
            return (Criteria) this;
        }

        public Criteria andShenrateEqualTo(Float value) {
            addCriterion("shenRate =", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateNotEqualTo(Float value) {
            addCriterion("shenRate <>", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateGreaterThan(Float value) {
            addCriterion("shenRate >", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateGreaterThanOrEqualTo(Float value) {
            addCriterion("shenRate >=", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateLessThan(Float value) {
            addCriterion("shenRate <", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateLessThanOrEqualTo(Float value) {
            addCriterion("shenRate <=", value, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateIn(List<Float> values) {
            addCriterion("shenRate in", values, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateNotIn(List<Float> values) {
            addCriterion("shenRate not in", values, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateBetween(Float value1, Float value2) {
            addCriterion("shenRate between", value1, value2, "shenrate");
            return (Criteria) this;
        }

        public Criteria andShenrateNotBetween(Float value1, Float value2) {
            addCriterion("shenRate not between", value1, value2, "shenrate");
            return (Criteria) this;
        }

        public Criteria andXingweisumIsNull() {
            addCriterion("xingWeiSum is null");
            return (Criteria) this;
        }

        public Criteria andXingweisumIsNotNull() {
            addCriterion("xingWeiSum is not null");
            return (Criteria) this;
        }

        public Criteria andXingweisumEqualTo(Integer value) {
            addCriterion("xingWeiSum =", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumNotEqualTo(Integer value) {
            addCriterion("xingWeiSum <>", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumGreaterThan(Integer value) {
            addCriterion("xingWeiSum >", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumGreaterThanOrEqualTo(Integer value) {
            addCriterion("xingWeiSum >=", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumLessThan(Integer value) {
            addCriterion("xingWeiSum <", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumLessThanOrEqualTo(Integer value) {
            addCriterion("xingWeiSum <=", value, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumIn(List<Integer> values) {
            addCriterion("xingWeiSum in", values, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumNotIn(List<Integer> values) {
            addCriterion("xingWeiSum not in", values, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumBetween(Integer value1, Integer value2) {
            addCriterion("xingWeiSum between", value1, value2, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andXingweisumNotBetween(Integer value1, Integer value2) {
            addCriterion("xingWeiSum not between", value1, value2, "xingweisum");
            return (Criteria) this;
        }

        public Criteria andStocksumIsNull() {
            addCriterion("stockSum is null");
            return (Criteria) this;
        }

        public Criteria andStocksumIsNotNull() {
            addCriterion("stockSum is not null");
            return (Criteria) this;
        }

        public Criteria andStocksumEqualTo(Integer value) {
            addCriterion("stockSum =", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumNotEqualTo(Integer value) {
            addCriterion("stockSum <>", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumGreaterThan(Integer value) {
            addCriterion("stockSum >", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumGreaterThanOrEqualTo(Integer value) {
            addCriterion("stockSum >=", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumLessThan(Integer value) {
            addCriterion("stockSum <", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumLessThanOrEqualTo(Integer value) {
            addCriterion("stockSum <=", value, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumIn(List<Integer> values) {
            addCriterion("stockSum in", values, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumNotIn(List<Integer> values) {
            addCriterion("stockSum not in", values, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumBetween(Integer value1, Integer value2) {
            addCriterion("stockSum between", value1, value2, "stocksum");
            return (Criteria) this;
        }

        public Criteria andStocksumNotBetween(Integer value1, Integer value2) {
            addCriterion("stockSum not between", value1, value2, "stocksum");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiIsNull() {
            addCriterion("sumTouZiXingWei is null");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiIsNotNull() {
            addCriterion("sumTouZiXingWei is not null");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiEqualTo(String value) {
            addCriterion("sumTouZiXingWei =", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotEqualTo(String value) {
            addCriterion("sumTouZiXingWei <>", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiGreaterThan(String value) {
            addCriterion("sumTouZiXingWei >", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiGreaterThanOrEqualTo(String value) {
            addCriterion("sumTouZiXingWei >=", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiLessThan(String value) {
            addCriterion("sumTouZiXingWei <", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiLessThanOrEqualTo(String value) {
            addCriterion("sumTouZiXingWei <=", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiLike(String value) {
            addCriterion("sumTouZiXingWei like", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotLike(String value) {
            addCriterion("sumTouZiXingWei not like", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiIn(List<String> values) {
            addCriterion("sumTouZiXingWei in", values, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotIn(List<String> values) {
            addCriterion("sumTouZiXingWei not in", values, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiBetween(String value1, String value2) {
            addCriterion("sumTouZiXingWei between", value1, value2, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotBetween(String value1, String value2) {
            addCriterion("sumTouZiXingWei not between", value1, value2, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuIsNull() {
            addCriterion("sumStockGeShu is null");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuIsNotNull() {
            addCriterion("sumStockGeShu is not null");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuEqualTo(String value) {
            addCriterion("sumStockGeShu =", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotEqualTo(String value) {
            addCriterion("sumStockGeShu <>", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuGreaterThan(String value) {
            addCriterion("sumStockGeShu >", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuGreaterThanOrEqualTo(String value) {
            addCriterion("sumStockGeShu >=", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuLessThan(String value) {
            addCriterion("sumStockGeShu <", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuLessThanOrEqualTo(String value) {
            addCriterion("sumStockGeShu <=", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuLike(String value) {
            addCriterion("sumStockGeShu like", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotLike(String value) {
            addCriterion("sumStockGeShu not like", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuIn(List<String> values) {
            addCriterion("sumStockGeShu in", values, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotIn(List<String> values) {
            addCriterion("sumStockGeShu not in", values, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuBetween(String value1, String value2) {
            addCriterion("sumStockGeShu between", value1, value2, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotBetween(String value1, String value2) {
            addCriterion("sumStockGeShu not between", value1, value2, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiIsNull() {
            addCriterion("sumOfMenLei is null");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiIsNotNull() {
            addCriterion("sumOfMenLei is not null");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiEqualTo(String value) {
            addCriterion("sumOfMenLei =", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotEqualTo(String value) {
            addCriterion("sumOfMenLei <>", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiGreaterThan(String value) {
            addCriterion("sumOfMenLei >", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiGreaterThanOrEqualTo(String value) {
            addCriterion("sumOfMenLei >=", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiLessThan(String value) {
            addCriterion("sumOfMenLei <", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiLessThanOrEqualTo(String value) {
            addCriterion("sumOfMenLei <=", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiLike(String value) {
            addCriterion("sumOfMenLei like", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotLike(String value) {
            addCriterion("sumOfMenLei not like", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiIn(List<String> values) {
            addCriterion("sumOfMenLei in", values, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotIn(List<String> values) {
            addCriterion("sumOfMenLei not in", values, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiBetween(String value1, String value2) {
            addCriterion("sumOfMenLei between", value1, value2, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotBetween(String value1, String value2) {
            addCriterion("sumOfMenLei not between", value1, value2, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiIsNull() {
            addCriterion("sumOfDalei is null");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiIsNotNull() {
            addCriterion("sumOfDalei is not null");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiEqualTo(String value) {
            addCriterion("sumOfDalei =", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotEqualTo(String value) {
            addCriterion("sumOfDalei <>", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiGreaterThan(String value) {
            addCriterion("sumOfDalei >", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiGreaterThanOrEqualTo(String value) {
            addCriterion("sumOfDalei >=", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiLessThan(String value) {
            addCriterion("sumOfDalei <", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiLessThanOrEqualTo(String value) {
            addCriterion("sumOfDalei <=", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiLike(String value) {
            addCriterion("sumOfDalei like", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotLike(String value) {
            addCriterion("sumOfDalei not like", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiIn(List<String> values) {
            addCriterion("sumOfDalei in", values, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotIn(List<String> values) {
            addCriterion("sumOfDalei not in", values, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiBetween(String value1, String value2) {
            addCriterion("sumOfDalei between", value1, value2, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotBetween(String value1, String value2) {
            addCriterion("sumOfDalei not between", value1, value2, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyIsNull() {
            addCriterion("threeProprorty is null");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyIsNotNull() {
            addCriterion("threeProprorty is not null");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyEqualTo(String value) {
            addCriterion("threeProprorty =", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyNotEqualTo(String value) {
            addCriterion("threeProprorty <>", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyGreaterThan(String value) {
            addCriterion("threeProprorty >", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyGreaterThanOrEqualTo(String value) {
            addCriterion("threeProprorty >=", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyLessThan(String value) {
            addCriterion("threeProprorty <", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyLessThanOrEqualTo(String value) {
            addCriterion("threeProprorty <=", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyLike(String value) {
            addCriterion("threeProprorty like", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyNotLike(String value) {
            addCriterion("threeProprorty not like", value, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyIn(List<String> values) {
            addCriterion("threeProprorty in", values, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyNotIn(List<String> values) {
            addCriterion("threeProprorty not in", values, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyBetween(String value1, String value2) {
            addCriterion("threeProprorty between", value1, value2, "threeproprorty");
            return (Criteria) this;
        }

        public Criteria andThreeproprortyNotBetween(String value1, String value2) {
            addCriterion("threeProprorty not between", value1, value2, "threeproprorty");
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