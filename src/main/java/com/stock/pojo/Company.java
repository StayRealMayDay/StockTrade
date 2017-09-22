package com.stock.pojo;

public class Company {
    private String companyId;

    private String stockNum;

    private String stockName;

    private String companyArea;

    private String resolvedConcept;

    private String mainBusiness;

    private String lunchDate;

    private String esNetAsset;

    private String esIncome;

    private String netProfit;

    private String netProfitGrowthRate;

    private String revenue;

    private String esCashFlow;

    private String esPublicFund;

    private String esNotProfit;

    private String totalCapital;

    private String floatingStock;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getCompanyArea() {
        return companyArea;
    }

    public void setCompanyArea(String companyArea) {
        this.companyArea = companyArea == null ? null : companyArea.trim();
    }

    public String getResolvedConcept() {
        return resolvedConcept;
    }

    public void setResolvedConcept(String resolvedConcept) {
        this.resolvedConcept = resolvedConcept == null ? null : resolvedConcept.trim();
    }

    public String getMainBusiness() {
        return mainBusiness;
    }

    public void setMainBusiness(String mainBusiness) {
        this.mainBusiness = mainBusiness == null ? null : mainBusiness.trim();
    }

    public String getLunchDate() {
        return lunchDate;
    }

    public void setLunchDate(String lunchDate) {
        this.lunchDate = lunchDate == null ? null : lunchDate.trim();
    }

    public String getEsNetAsset() {
        return esNetAsset;
    }

    public void setEsNetAsset(String esNetAsset) {
        this.esNetAsset = esNetAsset == null ? null : esNetAsset.trim();
    }

    public String getEsIncome() {
        return esIncome;
    }

    public void setEsIncome(String esIncome) {
        this.esIncome = esIncome == null ? null : esIncome.trim();
    }

    public String getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(String netProfit) {
        this.netProfit = netProfit == null ? null : netProfit.trim();
    }

    public String getNetProfitGrowthRate() {
        return netProfitGrowthRate;
    }

    public void setNetProfitGrowthRate(String netProfitGrowthRate) {
        this.netProfitGrowthRate = netProfitGrowthRate == null ? null : netProfitGrowthRate.trim();
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue == null ? null : revenue.trim();
    }

    public String getEsCashFlow() {
        return esCashFlow;
    }

    public void setEsCashFlow(String esCashFlow) {
        this.esCashFlow = esCashFlow == null ? null : esCashFlow.trim();
    }

    public String getEsPublicFund() {
        return esPublicFund;
    }

    public void setEsPublicFund(String esPublicFund) {
        this.esPublicFund = esPublicFund == null ? null : esPublicFund.trim();
    }

    public String getEsNotProfit() {
        return esNotProfit;
    }

    public void setEsNotProfit(String esNotProfit) {
        this.esNotProfit = esNotProfit == null ? null : esNotProfit.trim();
    }

    public String getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(String totalCapital) {
        this.totalCapital = totalCapital == null ? null : totalCapital.trim();
    }

    public String getFloatingStock() {
        return floatingStock;
    }

    public void setFloatingStock(String floatingStock) {
        this.floatingStock = floatingStock == null ? null : floatingStock.trim();
    }
}