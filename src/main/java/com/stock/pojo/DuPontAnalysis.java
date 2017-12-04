package com.stock.pojo;

public class DuPontAnalysis {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String netAssetYield;

    private String equityMultiplier;

    private String totalAssetTurnover;

    private String netProfitParentCompany;

    private String netProfitTotalIncome;

    private String netProfitTotalProfit;

    private String totalProfitBeforeIncomeTax;

    private String beforeIncomeTaxTotalIncome;

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

    public String getNetAssetYield() {
        return netAssetYield;
    }

    public void setNetAssetYield(String netAssetYield) {
        this.netAssetYield = netAssetYield == null ? null : netAssetYield.trim();
    }

    public String getEquityMultiplier() {
        return equityMultiplier;
    }

    public void setEquityMultiplier(String equityMultiplier) {
        this.equityMultiplier = equityMultiplier == null ? null : equityMultiplier.trim();
    }

    public String getTotalAssetTurnover() {
        return totalAssetTurnover;
    }

    public void setTotalAssetTurnover(String totalAssetTurnover) {
        this.totalAssetTurnover = totalAssetTurnover == null ? null : totalAssetTurnover.trim();
    }

    public String getNetProfitParentCompany() {
        return netProfitParentCompany;
    }

    public void setNetProfitParentCompany(String netProfitParentCompany) {
        this.netProfitParentCompany = netProfitParentCompany == null ? null : netProfitParentCompany.trim();
    }

    public String getNetProfitTotalIncome() {
        return netProfitTotalIncome;
    }

    public void setNetProfitTotalIncome(String netProfitTotalIncome) {
        this.netProfitTotalIncome = netProfitTotalIncome == null ? null : netProfitTotalIncome.trim();
    }

    public String getNetProfitTotalProfit() {
        return netProfitTotalProfit;
    }

    public void setNetProfitTotalProfit(String netProfitTotalProfit) {
        this.netProfitTotalProfit = netProfitTotalProfit == null ? null : netProfitTotalProfit.trim();
    }

    public String getTotalProfitBeforeIncomeTax() {
        return totalProfitBeforeIncomeTax;
    }

    public void setTotalProfitBeforeIncomeTax(String totalProfitBeforeIncomeTax) {
        this.totalProfitBeforeIncomeTax = totalProfitBeforeIncomeTax == null ? null : totalProfitBeforeIncomeTax.trim();
    }

    public String getBeforeIncomeTaxTotalIncome() {
        return beforeIncomeTaxTotalIncome;
    }

    public void setBeforeIncomeTaxTotalIncome(String beforeIncomeTaxTotalIncome) {
        this.beforeIncomeTaxTotalIncome = beforeIncomeTaxTotalIncome == null ? null : beforeIncomeTaxTotalIncome.trim();
    }
}