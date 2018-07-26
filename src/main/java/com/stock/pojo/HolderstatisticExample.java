package com.stock.pojo;

import java.util.ArrayList;
import java.util.List;

public class HolderstatisticExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HolderstatisticExample() {
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

        public Criteria andEarliytimeIsNull() {
            addCriterion("earliyTime is null");
            return (Criteria) this;
        }

        public Criteria andEarliytimeIsNotNull() {
            addCriterion("earliyTime is not null");
            return (Criteria) this;
        }

        public Criteria andEarliytimeEqualTo(String value) {
            addCriterion("earliyTime =", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeNotEqualTo(String value) {
            addCriterion("earliyTime <>", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeGreaterThan(String value) {
            addCriterion("earliyTime >", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeGreaterThanOrEqualTo(String value) {
            addCriterion("earliyTime >=", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeLessThan(String value) {
            addCriterion("earliyTime <", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeLessThanOrEqualTo(String value) {
            addCriterion("earliyTime <=", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeLike(String value) {
            addCriterion("earliyTime like", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeNotLike(String value) {
            addCriterion("earliyTime not like", value, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeIn(List<String> values) {
            addCriterion("earliyTime in", values, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeNotIn(List<String> values) {
            addCriterion("earliyTime not in", values, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeBetween(String value1, String value2) {
            addCriterion("earliyTime between", value1, value2, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarliytimeNotBetween(String value1, String value2) {
            addCriterion("earliyTime not between", value1, value2, "earliytime");
            return (Criteria) this;
        }

        public Criteria andEarlyyearIsNull() {
            addCriterion("earlyYear is null");
            return (Criteria) this;
        }

        public Criteria andEarlyyearIsNotNull() {
            addCriterion("earlyYear is not null");
            return (Criteria) this;
        }

        public Criteria andEarlyyearEqualTo(String value) {
            addCriterion("earlyYear =", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearNotEqualTo(String value) {
            addCriterion("earlyYear <>", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearGreaterThan(String value) {
            addCriterion("earlyYear >", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearGreaterThanOrEqualTo(String value) {
            addCriterion("earlyYear >=", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearLessThan(String value) {
            addCriterion("earlyYear <", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearLessThanOrEqualTo(String value) {
            addCriterion("earlyYear <=", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearLike(String value) {
            addCriterion("earlyYear like", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearNotLike(String value) {
            addCriterion("earlyYear not like", value, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearIn(List<String> values) {
            addCriterion("earlyYear in", values, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearNotIn(List<String> values) {
            addCriterion("earlyYear not in", values, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearBetween(String value1, String value2) {
            addCriterion("earlyYear between", value1, value2, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andEarlyyearNotBetween(String value1, String value2) {
            addCriterion("earlyYear not between", value1, value2, "earlyyear");
            return (Criteria) this;
        }

        public Criteria andLatesttimeIsNull() {
            addCriterion("latestTime is null");
            return (Criteria) this;
        }

        public Criteria andLatesttimeIsNotNull() {
            addCriterion("latestTime is not null");
            return (Criteria) this;
        }

        public Criteria andLatesttimeEqualTo(String value) {
            addCriterion("latestTime =", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotEqualTo(String value) {
            addCriterion("latestTime <>", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeGreaterThan(String value) {
            addCriterion("latestTime >", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeGreaterThanOrEqualTo(String value) {
            addCriterion("latestTime >=", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeLessThan(String value) {
            addCriterion("latestTime <", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeLessThanOrEqualTo(String value) {
            addCriterion("latestTime <=", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeLike(String value) {
            addCriterion("latestTime like", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotLike(String value) {
            addCriterion("latestTime not like", value, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeIn(List<String> values) {
            addCriterion("latestTime in", values, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotIn(List<String> values) {
            addCriterion("latestTime not in", values, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeBetween(String value1, String value2) {
            addCriterion("latestTime between", value1, value2, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLatesttimeNotBetween(String value1, String value2) {
            addCriterion("latestTime not between", value1, value2, "latesttime");
            return (Criteria) this;
        }

        public Criteria andLateyearIsNull() {
            addCriterion("lateYear is null");
            return (Criteria) this;
        }

        public Criteria andLateyearIsNotNull() {
            addCriterion("lateYear is not null");
            return (Criteria) this;
        }

        public Criteria andLateyearEqualTo(String value) {
            addCriterion("lateYear =", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearNotEqualTo(String value) {
            addCriterion("lateYear <>", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearGreaterThan(String value) {
            addCriterion("lateYear >", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearGreaterThanOrEqualTo(String value) {
            addCriterion("lateYear >=", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearLessThan(String value) {
            addCriterion("lateYear <", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearLessThanOrEqualTo(String value) {
            addCriterion("lateYear <=", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearLike(String value) {
            addCriterion("lateYear like", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearNotLike(String value) {
            addCriterion("lateYear not like", value, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearIn(List<String> values) {
            addCriterion("lateYear in", values, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearNotIn(List<String> values) {
            addCriterion("lateYear not in", values, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearBetween(String value1, String value2) {
            addCriterion("lateYear between", value1, value2, "lateyear");
            return (Criteria) this;
        }

        public Criteria andLateyearNotBetween(String value1, String value2) {
            addCriterion("lateYear not between", value1, value2, "lateyear");
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

        public Criteria andSumtouzixingweiEqualTo(Integer value) {
            addCriterion("sumTouZiXingWei =", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotEqualTo(Integer value) {
            addCriterion("sumTouZiXingWei <>", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiGreaterThan(Integer value) {
            addCriterion("sumTouZiXingWei >", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumTouZiXingWei >=", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiLessThan(Integer value) {
            addCriterion("sumTouZiXingWei <", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiLessThanOrEqualTo(Integer value) {
            addCriterion("sumTouZiXingWei <=", value, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiIn(List<Integer> values) {
            addCriterion("sumTouZiXingWei in", values, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotIn(List<Integer> values) {
            addCriterion("sumTouZiXingWei not in", values, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiBetween(Integer value1, Integer value2) {
            addCriterion("sumTouZiXingWei between", value1, value2, "sumtouzixingwei");
            return (Criteria) this;
        }

        public Criteria andSumtouzixingweiNotBetween(Integer value1, Integer value2) {
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

        public Criteria andSumstockgeshuEqualTo(Integer value) {
            addCriterion("sumStockGeShu =", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotEqualTo(Integer value) {
            addCriterion("sumStockGeShu <>", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuGreaterThan(Integer value) {
            addCriterion("sumStockGeShu >", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumStockGeShu >=", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuLessThan(Integer value) {
            addCriterion("sumStockGeShu <", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuLessThanOrEqualTo(Integer value) {
            addCriterion("sumStockGeShu <=", value, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuIn(List<Integer> values) {
            addCriterion("sumStockGeShu in", values, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotIn(List<Integer> values) {
            addCriterion("sumStockGeShu not in", values, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuBetween(Integer value1, Integer value2) {
            addCriterion("sumStockGeShu between", value1, value2, "sumstockgeshu");
            return (Criteria) this;
        }

        public Criteria andSumstockgeshuNotBetween(Integer value1, Integer value2) {
            addCriterion("sumStockGeShu not between", value1, value2, "sumstockgeshu");
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

        public Criteria andSumofdaleiEqualTo(Integer value) {
            addCriterion("sumOfDalei =", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotEqualTo(Integer value) {
            addCriterion("sumOfDalei <>", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiGreaterThan(Integer value) {
            addCriterion("sumOfDalei >", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumOfDalei >=", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiLessThan(Integer value) {
            addCriterion("sumOfDalei <", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiLessThanOrEqualTo(Integer value) {
            addCriterion("sumOfDalei <=", value, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiIn(List<Integer> values) {
            addCriterion("sumOfDalei in", values, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotIn(List<Integer> values) {
            addCriterion("sumOfDalei not in", values, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiBetween(Integer value1, Integer value2) {
            addCriterion("sumOfDalei between", value1, value2, "sumofdalei");
            return (Criteria) this;
        }

        public Criteria andSumofdaleiNotBetween(Integer value1, Integer value2) {
            addCriterion("sumOfDalei not between", value1, value2, "sumofdalei");
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

        public Criteria andSumofmenleiEqualTo(Integer value) {
            addCriterion("sumOfMenLei =", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotEqualTo(Integer value) {
            addCriterion("sumOfMenLei <>", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiGreaterThan(Integer value) {
            addCriterion("sumOfMenLei >", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiGreaterThanOrEqualTo(Integer value) {
            addCriterion("sumOfMenLei >=", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiLessThan(Integer value) {
            addCriterion("sumOfMenLei <", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiLessThanOrEqualTo(Integer value) {
            addCriterion("sumOfMenLei <=", value, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiIn(List<Integer> values) {
            addCriterion("sumOfMenLei in", values, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotIn(List<Integer> values) {
            addCriterion("sumOfMenLei not in", values, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiBetween(Integer value1, Integer value2) {
            addCriterion("sumOfMenLei between", value1, value2, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andSumofmenleiNotBetween(Integer value1, Integer value2) {
            addCriterion("sumOfMenLei not between", value1, value2, "sumofmenlei");
            return (Criteria) this;
        }

        public Criteria andDiquinfoIsNull() {
            addCriterion("DiQuInfo is null");
            return (Criteria) this;
        }

        public Criteria andDiquinfoIsNotNull() {
            addCriterion("DiQuInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDiquinfoEqualTo(String value) {
            addCriterion("DiQuInfo =", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoNotEqualTo(String value) {
            addCriterion("DiQuInfo <>", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoGreaterThan(String value) {
            addCriterion("DiQuInfo >", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoGreaterThanOrEqualTo(String value) {
            addCriterion("DiQuInfo >=", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoLessThan(String value) {
            addCriterion("DiQuInfo <", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoLessThanOrEqualTo(String value) {
            addCriterion("DiQuInfo <=", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoLike(String value) {
            addCriterion("DiQuInfo like", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoNotLike(String value) {
            addCriterion("DiQuInfo not like", value, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoIn(List<String> values) {
            addCriterion("DiQuInfo in", values, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoNotIn(List<String> values) {
            addCriterion("DiQuInfo not in", values, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoBetween(String value1, String value2) {
            addCriterion("DiQuInfo between", value1, value2, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andDiquinfoNotBetween(String value1, String value2) {
            addCriterion("DiQuInfo not between", value1, value2, "diquinfo");
            return (Criteria) this;
        }

        public Criteria andHolderproportyIsNull() {
            addCriterion("holderProporty is null");
            return (Criteria) this;
        }

        public Criteria andHolderproportyIsNotNull() {
            addCriterion("holderProporty is not null");
            return (Criteria) this;
        }

        public Criteria andHolderproportyEqualTo(String value) {
            addCriterion("holderProporty =", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyNotEqualTo(String value) {
            addCriterion("holderProporty <>", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyGreaterThan(String value) {
            addCriterion("holderProporty >", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyGreaterThanOrEqualTo(String value) {
            addCriterion("holderProporty >=", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyLessThan(String value) {
            addCriterion("holderProporty <", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyLessThanOrEqualTo(String value) {
            addCriterion("holderProporty <=", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyLike(String value) {
            addCriterion("holderProporty like", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyNotLike(String value) {
            addCriterion("holderProporty not like", value, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyIn(List<String> values) {
            addCriterion("holderProporty in", values, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyNotIn(List<String> values) {
            addCriterion("holderProporty not in", values, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyBetween(String value1, String value2) {
            addCriterion("holderProporty between", value1, value2, "holderproporty");
            return (Criteria) this;
        }

        public Criteria andHolderproportyNotBetween(String value1, String value2) {
            addCriterion("holderProporty not between", value1, value2, "holderproporty");
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