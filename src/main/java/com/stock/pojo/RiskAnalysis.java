package com.stock.pojo;

public class RiskAnalysis {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String betaweek100;

    private String betamonth24;

    private String betamonth60;

    private String annualizedReturnWeek100;

    private String annualizedReturnMonth24;

    private String annualizedReturnMonth60;

    private String annualizedVolatilityWeek100;

    private String annualizedVolatilityMonth24;

    private String annualizedVolatilityMonth60;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getBetaweek100() {
        return betaweek100;
    }

    public void setBetaweek100(String betaweek100) {
        this.betaweek100 = betaweek100 == null ? null : betaweek100.trim();
    }

    public String getBetamonth24() {
        return betamonth24;
    }

    public void setBetamonth24(String betamonth24) {
        this.betamonth24 = betamonth24 == null ? null : betamonth24.trim();
    }

    public String getBetamonth60() {
        return betamonth60;
    }

    public void setBetamonth60(String betamonth60) {
        this.betamonth60 = betamonth60 == null ? null : betamonth60.trim();
    }

    public String getAnnualizedReturnWeek100() {
        return annualizedReturnWeek100;
    }

    public void setAnnualizedReturnWeek100(String annualizedReturnWeek100) {
        this.annualizedReturnWeek100 = annualizedReturnWeek100 == null ? null : annualizedReturnWeek100.trim();
    }

    public String getAnnualizedReturnMonth24() {
        return annualizedReturnMonth24;
    }

    public void setAnnualizedReturnMonth24(String annualizedReturnMonth24) {
        this.annualizedReturnMonth24 = annualizedReturnMonth24 == null ? null : annualizedReturnMonth24.trim();
    }

    public String getAnnualizedReturnMonth60() {
        return annualizedReturnMonth60;
    }

    public void setAnnualizedReturnMonth60(String annualizedReturnMonth60) {
        this.annualizedReturnMonth60 = annualizedReturnMonth60 == null ? null : annualizedReturnMonth60.trim();
    }

    public String getAnnualizedVolatilityWeek100() {
        return annualizedVolatilityWeek100;
    }

    public void setAnnualizedVolatilityWeek100(String annualizedVolatilityWeek100) {
        this.annualizedVolatilityWeek100 = annualizedVolatilityWeek100 == null ? null : annualizedVolatilityWeek100.trim();
    }

    public String getAnnualizedVolatilityMonth24() {
        return annualizedVolatilityMonth24;
    }

    public void setAnnualizedVolatilityMonth24(String annualizedVolatilityMonth24) {
        this.annualizedVolatilityMonth24 = annualizedVolatilityMonth24 == null ? null : annualizedVolatilityMonth24.trim();
    }

    public String getAnnualizedVolatilityMonth60() {
        return annualizedVolatilityMonth60;
    }

    public void setAnnualizedVolatilityMonth60(String annualizedVolatilityMonth60) {
        this.annualizedVolatilityMonth60 = annualizedVolatilityMonth60 == null ? null : annualizedVolatilityMonth60.trim();
    }
}