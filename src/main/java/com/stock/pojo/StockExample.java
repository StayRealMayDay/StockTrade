package com.stock.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(Integer value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(Integer value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(Integer value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(Integer value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(Integer value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<Integer> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<Integer> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(Integer value1, Integer value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockCdIsNull() {
            addCriterion("stock_cd is null");
            return (Criteria) this;
        }

        public Criteria andStockCdIsNotNull() {
            addCriterion("stock_cd is not null");
            return (Criteria) this;
        }

        public Criteria andStockCdEqualTo(String value) {
            addCriterion("stock_cd =", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdNotEqualTo(String value) {
            addCriterion("stock_cd <>", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdGreaterThan(String value) {
            addCriterion("stock_cd >", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_cd >=", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdLessThan(String value) {
            addCriterion("stock_cd <", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdLessThanOrEqualTo(String value) {
            addCriterion("stock_cd <=", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdLike(String value) {
            addCriterion("stock_cd like", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdNotLike(String value) {
            addCriterion("stock_cd not like", value, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdIn(List<String> values) {
            addCriterion("stock_cd in", values, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdNotIn(List<String> values) {
            addCriterion("stock_cd not in", values, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdBetween(String value1, String value2) {
            addCriterion("stock_cd between", value1, value2, "stockCd");
            return (Criteria) this;
        }

        public Criteria andStockCdNotBetween(String value1, String value2) {
            addCriterion("stock_cd not between", value1, value2, "stockCd");
            return (Criteria) this;
        }

        public Criteria andSecuritiesIsNull() {
            addCriterion("securities is null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesIsNotNull() {
            addCriterion("securities is not null");
            return (Criteria) this;
        }

        public Criteria andSecuritiesEqualTo(String value) {
            addCriterion("securities =", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNotEqualTo(String value) {
            addCriterion("securities <>", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesGreaterThan(String value) {
            addCriterion("securities >", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesGreaterThanOrEqualTo(String value) {
            addCriterion("securities >=", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesLessThan(String value) {
            addCriterion("securities <", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesLessThanOrEqualTo(String value) {
            addCriterion("securities <=", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesLike(String value) {
            addCriterion("securities like", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNotLike(String value) {
            addCriterion("securities not like", value, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesIn(List<String> values) {
            addCriterion("securities in", values, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNotIn(List<String> values) {
            addCriterion("securities not in", values, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesBetween(String value1, String value2) {
            addCriterion("securities between", value1, value2, "securities");
            return (Criteria) this;
        }

        public Criteria andSecuritiesNotBetween(String value1, String value2) {
            addCriterion("securities not between", value1, value2, "securities");
            return (Criteria) this;
        }

        public Criteria andListSectorIdIsNull() {
            addCriterion("list_sector_id is null");
            return (Criteria) this;
        }

        public Criteria andListSectorIdIsNotNull() {
            addCriterion("list_sector_id is not null");
            return (Criteria) this;
        }

        public Criteria andListSectorIdEqualTo(String value) {
            addCriterion("list_sector_id =", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdNotEqualTo(String value) {
            addCriterion("list_sector_id <>", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdGreaterThan(String value) {
            addCriterion("list_sector_id >", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdGreaterThanOrEqualTo(String value) {
            addCriterion("list_sector_id >=", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdLessThan(String value) {
            addCriterion("list_sector_id <", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdLessThanOrEqualTo(String value) {
            addCriterion("list_sector_id <=", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdLike(String value) {
            addCriterion("list_sector_id like", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdNotLike(String value) {
            addCriterion("list_sector_id not like", value, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdIn(List<String> values) {
            addCriterion("list_sector_id in", values, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdNotIn(List<String> values) {
            addCriterion("list_sector_id not in", values, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdBetween(String value1, String value2) {
            addCriterion("list_sector_id between", value1, value2, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIdNotBetween(String value1, String value2) {
            addCriterion("list_sector_id not between", value1, value2, "listSectorId");
            return (Criteria) this;
        }

        public Criteria andListSectorIsNull() {
            addCriterion("list_sector is null");
            return (Criteria) this;
        }

        public Criteria andListSectorIsNotNull() {
            addCriterion("list_sector is not null");
            return (Criteria) this;
        }

        public Criteria andListSectorEqualTo(String value) {
            addCriterion("list_sector =", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorNotEqualTo(String value) {
            addCriterion("list_sector <>", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorGreaterThan(String value) {
            addCriterion("list_sector >", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorGreaterThanOrEqualTo(String value) {
            addCriterion("list_sector >=", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorLessThan(String value) {
            addCriterion("list_sector <", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorLessThanOrEqualTo(String value) {
            addCriterion("list_sector <=", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorLike(String value) {
            addCriterion("list_sector like", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorNotLike(String value) {
            addCriterion("list_sector not like", value, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorIn(List<String> values) {
            addCriterion("list_sector in", values, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorNotIn(List<String> values) {
            addCriterion("list_sector not in", values, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorBetween(String value1, String value2) {
            addCriterion("list_sector between", value1, value2, "listSector");
            return (Criteria) this;
        }

        public Criteria andListSectorNotBetween(String value1, String value2) {
            addCriterion("list_sector not between", value1, value2, "listSector");
            return (Criteria) this;
        }

        public Criteria andTransCurrIsNull() {
            addCriterion("trans_curr is null");
            return (Criteria) this;
        }

        public Criteria andTransCurrIsNotNull() {
            addCriterion("trans_curr is not null");
            return (Criteria) this;
        }

        public Criteria andTransCurrEqualTo(String value) {
            addCriterion("trans_curr =", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrNotEqualTo(String value) {
            addCriterion("trans_curr <>", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrGreaterThan(String value) {
            addCriterion("trans_curr >", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrGreaterThanOrEqualTo(String value) {
            addCriterion("trans_curr >=", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrLessThan(String value) {
            addCriterion("trans_curr <", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrLessThanOrEqualTo(String value) {
            addCriterion("trans_curr <=", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrLike(String value) {
            addCriterion("trans_curr like", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrNotLike(String value) {
            addCriterion("trans_curr not like", value, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrIn(List<String> values) {
            addCriterion("trans_curr in", values, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrNotIn(List<String> values) {
            addCriterion("trans_curr not in", values, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrBetween(String value1, String value2) {
            addCriterion("trans_curr between", value1, value2, "transCurr");
            return (Criteria) this;
        }

        public Criteria andTransCurrNotBetween(String value1, String value2) {
            addCriterion("trans_curr not between", value1, value2, "transCurr");
            return (Criteria) this;
        }

        public Criteria andSecShortNameIsNull() {
            addCriterion("sec_short_name is null");
            return (Criteria) this;
        }

        public Criteria andSecShortNameIsNotNull() {
            addCriterion("sec_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecShortNameEqualTo(String value) {
            addCriterion("sec_short_name =", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameNotEqualTo(String value) {
            addCriterion("sec_short_name <>", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameGreaterThan(String value) {
            addCriterion("sec_short_name >", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_short_name >=", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameLessThan(String value) {
            addCriterion("sec_short_name <", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameLessThanOrEqualTo(String value) {
            addCriterion("sec_short_name <=", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameLike(String value) {
            addCriterion("sec_short_name like", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameNotLike(String value) {
            addCriterion("sec_short_name not like", value, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameIn(List<String> values) {
            addCriterion("sec_short_name in", values, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameNotIn(List<String> values) {
            addCriterion("sec_short_name not in", values, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameBetween(String value1, String value2) {
            addCriterion("sec_short_name between", value1, value2, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecShortNameNotBetween(String value1, String value2) {
            addCriterion("sec_short_name not between", value1, value2, "secShortName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameIsNull() {
            addCriterion("sec_full_name is null");
            return (Criteria) this;
        }

        public Criteria andSecFullNameIsNotNull() {
            addCriterion("sec_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecFullNameEqualTo(String value) {
            addCriterion("sec_full_name =", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameNotEqualTo(String value) {
            addCriterion("sec_full_name <>", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameGreaterThan(String value) {
            addCriterion("sec_full_name >", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("sec_full_name >=", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameLessThan(String value) {
            addCriterion("sec_full_name <", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameLessThanOrEqualTo(String value) {
            addCriterion("sec_full_name <=", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameLike(String value) {
            addCriterion("sec_full_name like", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameNotLike(String value) {
            addCriterion("sec_full_name not like", value, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameIn(List<String> values) {
            addCriterion("sec_full_name in", values, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameNotIn(List<String> values) {
            addCriterion("sec_full_name not in", values, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameBetween(String value1, String value2) {
            addCriterion("sec_full_name between", value1, value2, "secFullName");
            return (Criteria) this;
        }

        public Criteria andSecFullNameNotBetween(String value1, String value2) {
            addCriterion("sec_full_name not between", value1, value2, "secFullName");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNull() {
            addCriterion("list_status is null");
            return (Criteria) this;
        }

        public Criteria andListStatusIsNotNull() {
            addCriterion("list_status is not null");
            return (Criteria) this;
        }

        public Criteria andListStatusEqualTo(String value) {
            addCriterion("list_status =", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotEqualTo(String value) {
            addCriterion("list_status <>", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThan(String value) {
            addCriterion("list_status >", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusGreaterThanOrEqualTo(String value) {
            addCriterion("list_status >=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThan(String value) {
            addCriterion("list_status <", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLessThanOrEqualTo(String value) {
            addCriterion("list_status <=", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusLike(String value) {
            addCriterion("list_status like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotLike(String value) {
            addCriterion("list_status not like", value, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusIn(List<String> values) {
            addCriterion("list_status in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotIn(List<String> values) {
            addCriterion("list_status not in", values, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusBetween(String value1, String value2) {
            addCriterion("list_status between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListStatusNotBetween(String value1, String value2) {
            addCriterion("list_status not between", value1, value2, "listStatus");
            return (Criteria) this;
        }

        public Criteria andListDateIsNull() {
            addCriterion("list_date is null");
            return (Criteria) this;
        }

        public Criteria andListDateIsNotNull() {
            addCriterion("list_date is not null");
            return (Criteria) this;
        }

        public Criteria andListDateEqualTo(Date value) {
            addCriterionForJDBCDate("list_date =", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("list_date <>", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThan(Date value) {
            addCriterionForJDBCDate("list_date >", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("list_date >=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThan(Date value) {
            addCriterionForJDBCDate("list_date <", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("list_date <=", value, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateIn(List<Date> values) {
            addCriterionForJDBCDate("list_date in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("list_date not in", values, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("list_date between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andListDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("list_date not between", value1, value2, "listDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateIsNull() {
            addCriterion("delist_date is null");
            return (Criteria) this;
        }

        public Criteria andDelistDateIsNotNull() {
            addCriterion("delist_date is not null");
            return (Criteria) this;
        }

        public Criteria andDelistDateEqualTo(Date value) {
            addCriterionForJDBCDate("delist_date =", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("delist_date <>", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateGreaterThan(Date value) {
            addCriterionForJDBCDate("delist_date >", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delist_date >=", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateLessThan(Date value) {
            addCriterionForJDBCDate("delist_date <", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("delist_date <=", value, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateIn(List<Date> values) {
            addCriterionForJDBCDate("delist_date in", values, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("delist_date not in", values, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delist_date between", value1, value2, "delistDate");
            return (Criteria) this;
        }

        public Criteria andDelistDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("delist_date not between", value1, value2, "delistDate");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIsNull() {
            addCriterion("stock_type_id is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIsNotNull() {
            addCriterion("stock_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdEqualTo(String value) {
            addCriterion("stock_type_id =", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotEqualTo(String value) {
            addCriterion("stock_type_id <>", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdGreaterThan(String value) {
            addCriterion("stock_type_id >", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_type_id >=", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdLessThan(String value) {
            addCriterion("stock_type_id <", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdLessThanOrEqualTo(String value) {
            addCriterion("stock_type_id <=", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdLike(String value) {
            addCriterion("stock_type_id like", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotLike(String value) {
            addCriterion("stock_type_id not like", value, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdIn(List<String> values) {
            addCriterion("stock_type_id in", values, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotIn(List<String> values) {
            addCriterion("stock_type_id not in", values, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdBetween(String value1, String value2) {
            addCriterion("stock_type_id between", value1, value2, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIdNotBetween(String value1, String value2) {
            addCriterion("stock_type_id not between", value1, value2, "stockTypeId");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNull() {
            addCriterion("stock_type is null");
            return (Criteria) this;
        }

        public Criteria andStockTypeIsNotNull() {
            addCriterion("stock_type is not null");
            return (Criteria) this;
        }

        public Criteria andStockTypeEqualTo(String value) {
            addCriterion("stock_type =", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotEqualTo(String value) {
            addCriterion("stock_type <>", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThan(String value) {
            addCriterion("stock_type >", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("stock_type >=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThan(String value) {
            addCriterion("stock_type <", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLessThanOrEqualTo(String value) {
            addCriterion("stock_type <=", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeLike(String value) {
            addCriterion("stock_type like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotLike(String value) {
            addCriterion("stock_type not like", value, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeIn(List<String> values) {
            addCriterion("stock_type in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotIn(List<String> values) {
            addCriterion("stock_type not in", values, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeBetween(String value1, String value2) {
            addCriterion("stock_type between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andStockTypeNotBetween(String value1, String value2) {
            addCriterion("stock_type not between", value1, value2, "stockType");
            return (Criteria) this;
        }

        public Criteria andMarketCountryIsNull() {
            addCriterion("market_country is null");
            return (Criteria) this;
        }

        public Criteria andMarketCountryIsNotNull() {
            addCriterion("market_country is not null");
            return (Criteria) this;
        }

        public Criteria andMarketCountryEqualTo(String value) {
            addCriterion("market_country =", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryNotEqualTo(String value) {
            addCriterion("market_country <>", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryGreaterThan(String value) {
            addCriterion("market_country >", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryGreaterThanOrEqualTo(String value) {
            addCriterion("market_country >=", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryLessThan(String value) {
            addCriterion("market_country <", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryLessThanOrEqualTo(String value) {
            addCriterion("market_country <=", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryLike(String value) {
            addCriterion("market_country like", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryNotLike(String value) {
            addCriterion("market_country not like", value, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryIn(List<String> values) {
            addCriterion("market_country in", values, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryNotIn(List<String> values) {
            addCriterion("market_country not in", values, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryBetween(String value1, String value2) {
            addCriterion("market_country between", value1, value2, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andMarketCountryNotBetween(String value1, String value2) {
            addCriterion("market_country not between", value1, value2, "marketCountry");
            return (Criteria) this;
        }

        public Criteria andPartyIdIsNull() {
            addCriterion("party_id is null");
            return (Criteria) this;
        }

        public Criteria andPartyIdIsNotNull() {
            addCriterion("party_id is not null");
            return (Criteria) this;
        }

        public Criteria andPartyIdEqualTo(Integer value) {
            addCriterion("party_id =", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotEqualTo(Integer value) {
            addCriterion("party_id <>", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThan(Integer value) {
            addCriterion("party_id >", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("party_id >=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThan(Integer value) {
            addCriterion("party_id <", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdLessThanOrEqualTo(Integer value) {
            addCriterion("party_id <=", value, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdIn(List<Integer> values) {
            addCriterion("party_id in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotIn(List<Integer> values) {
            addCriterion("party_id not in", values, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdBetween(Integer value1, Integer value2) {
            addCriterion("party_id between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andPartyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("party_id not between", value1, value2, "partyId");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIsNull() {
            addCriterion("total_shares is null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIsNotNull() {
            addCriterion("total_shares is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSharesEqualTo(String value) {
            addCriterion("total_shares =", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotEqualTo(String value) {
            addCriterion("total_shares <>", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThan(String value) {
            addCriterion("total_shares >", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesGreaterThanOrEqualTo(String value) {
            addCriterion("total_shares >=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThan(String value) {
            addCriterion("total_shares <", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLessThanOrEqualTo(String value) {
            addCriterion("total_shares <=", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesLike(String value) {
            addCriterion("total_shares like", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotLike(String value) {
            addCriterion("total_shares not like", value, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesIn(List<String> values) {
            addCriterion("total_shares in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotIn(List<String> values) {
            addCriterion("total_shares not in", values, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesBetween(String value1, String value2) {
            addCriterion("total_shares between", value1, value2, "totalShares");
            return (Criteria) this;
        }

        public Criteria andTotalSharesNotBetween(String value1, String value2) {
            addCriterion("total_shares not between", value1, value2, "totalShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesIsNull() {
            addCriterion("nonrest_float_shares is null");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesIsNotNull() {
            addCriterion("nonrest_float_shares is not null");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesEqualTo(String value) {
            addCriterion("nonrest_float_shares =", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesNotEqualTo(String value) {
            addCriterion("nonrest_float_shares <>", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesGreaterThan(String value) {
            addCriterion("nonrest_float_shares >", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesGreaterThanOrEqualTo(String value) {
            addCriterion("nonrest_float_shares >=", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesLessThan(String value) {
            addCriterion("nonrest_float_shares <", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesLessThanOrEqualTo(String value) {
            addCriterion("nonrest_float_shares <=", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesLike(String value) {
            addCriterion("nonrest_float_shares like", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesNotLike(String value) {
            addCriterion("nonrest_float_shares not like", value, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesIn(List<String> values) {
            addCriterion("nonrest_float_shares in", values, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesNotIn(List<String> values) {
            addCriterion("nonrest_float_shares not in", values, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesBetween(String value1, String value2) {
            addCriterion("nonrest_float_shares between", value1, value2, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatSharesNotBetween(String value1, String value2) {
            addCriterion("nonrest_float_shares not between", value1, value2, "nonrestFloatShares");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockIsNull() {
            addCriterion("nonrest_float_capital_stock is null");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockIsNotNull() {
            addCriterion("nonrest_float_capital_stock is not null");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockEqualTo(String value) {
            addCriterion("nonrest_float_capital_stock =", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockNotEqualTo(String value) {
            addCriterion("nonrest_float_capital_stock <>", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockGreaterThan(String value) {
            addCriterion("nonrest_float_capital_stock >", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockGreaterThanOrEqualTo(String value) {
            addCriterion("nonrest_float_capital_stock >=", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockLessThan(String value) {
            addCriterion("nonrest_float_capital_stock <", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockLessThanOrEqualTo(String value) {
            addCriterion("nonrest_float_capital_stock <=", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockLike(String value) {
            addCriterion("nonrest_float_capital_stock like", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockNotLike(String value) {
            addCriterion("nonrest_float_capital_stock not like", value, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockIn(List<String> values) {
            addCriterion("nonrest_float_capital_stock in", values, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockNotIn(List<String> values) {
            addCriterion("nonrest_float_capital_stock not in", values, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockBetween(String value1, String value2) {
            addCriterion("nonrest_float_capital_stock between", value1, value2, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andNonrestFloatCapitalStockNotBetween(String value1, String value2) {
            addCriterion("nonrest_float_capital_stock not between", value1, value2, "nonrestFloatCapitalStock");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrIsNull() {
            addCriterion("office_addr is null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrIsNotNull() {
            addCriterion("office_addr is not null");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrEqualTo(String value) {
            addCriterion("office_addr =", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrNotEqualTo(String value) {
            addCriterion("office_addr <>", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrGreaterThan(String value) {
            addCriterion("office_addr >", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrGreaterThanOrEqualTo(String value) {
            addCriterion("office_addr >=", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrLessThan(String value) {
            addCriterion("office_addr <", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrLessThanOrEqualTo(String value) {
            addCriterion("office_addr <=", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrLike(String value) {
            addCriterion("office_addr like", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrNotLike(String value) {
            addCriterion("office_addr not like", value, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrIn(List<String> values) {
            addCriterion("office_addr in", values, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrNotIn(List<String> values) {
            addCriterion("office_addr not in", values, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrBetween(String value1, String value2) {
            addCriterion("office_addr between", value1, value2, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andOfficeAddrNotBetween(String value1, String value2) {
            addCriterion("office_addr not between", value1, value2, "officeAddr");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingIsNull() {
            addCriterion("prime_operating is null");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingIsNotNull() {
            addCriterion("prime_operating is not null");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingEqualTo(String value) {
            addCriterion("prime_operating =", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingNotEqualTo(String value) {
            addCriterion("prime_operating <>", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingGreaterThan(String value) {
            addCriterion("prime_operating >", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingGreaterThanOrEqualTo(String value) {
            addCriterion("prime_operating >=", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingLessThan(String value) {
            addCriterion("prime_operating <", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingLessThanOrEqualTo(String value) {
            addCriterion("prime_operating <=", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingLike(String value) {
            addCriterion("prime_operating like", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingNotLike(String value) {
            addCriterion("prime_operating not like", value, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingIn(List<String> values) {
            addCriterion("prime_operating in", values, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingNotIn(List<String> values) {
            addCriterion("prime_operating not in", values, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingBetween(String value1, String value2) {
            addCriterion("prime_operating between", value1, value2, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andPrimeOperatingNotBetween(String value1, String value2) {
            addCriterion("prime_operating not between", value1, value2, "primeOperating");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIsNull() {
            addCriterion("total_equity is null");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIsNotNull() {
            addCriterion("total_equity is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEquityEqualTo(String value) {
            addCriterion("total_equity =", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotEqualTo(String value) {
            addCriterion("total_equity <>", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityGreaterThan(String value) {
            addCriterion("total_equity >", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityGreaterThanOrEqualTo(String value) {
            addCriterion("total_equity >=", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityLessThan(String value) {
            addCriterion("total_equity <", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityLessThanOrEqualTo(String value) {
            addCriterion("total_equity <=", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityLike(String value) {
            addCriterion("total_equity like", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotLike(String value) {
            addCriterion("total_equity not like", value, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityIn(List<String> values) {
            addCriterion("total_equity in", values, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotIn(List<String> values) {
            addCriterion("total_equity not in", values, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityBetween(String value1, String value2) {
            addCriterion("total_equity between", value1, value2, "totalEquity");
            return (Criteria) this;
        }

        public Criteria andTotalEquityNotBetween(String value1, String value2) {
            addCriterion("total_equity not between", value1, value2, "totalEquity");
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