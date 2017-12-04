package com.stock.pojo;

public class Dzjy {
    private String id;

    private String transactionDate;

    private String stockId;

    private String stockName;

    private String latestPrice;

    private String dealPrice;

    private String dealNum;

    private String premiumRate;

    private String purchasingDepartment;

    private String salesDepartment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate == null ? null : transactionDate.trim();
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getLatestPrice() {
        return latestPrice;
    }

    public void setLatestPrice(String latestPrice) {
        this.latestPrice = latestPrice == null ? null : latestPrice.trim();
    }

    public String getDealPrice() {
        return dealPrice;
    }

    public void setDealPrice(String dealPrice) {
        this.dealPrice = dealPrice == null ? null : dealPrice.trim();
    }

    public String getDealNum() {
        return dealNum;
    }

    public void setDealNum(String dealNum) {
        this.dealNum = dealNum == null ? null : dealNum.trim();
    }

    public String getPremiumRate() {
        return premiumRate;
    }

    public void setPremiumRate(String premiumRate) {
        this.premiumRate = premiumRate == null ? null : premiumRate.trim();
    }

    public String getPurchasingDepartment() {
        return purchasingDepartment;
    }

    public void setPurchasingDepartment(String purchasingDepartment) {
        this.purchasingDepartment = purchasingDepartment == null ? null : purchasingDepartment.trim();
    }

    public String getSalesDepartment() {
        return salesDepartment;
    }

    public void setSalesDepartment(String salesDepartment) {
        this.salesDepartment = salesDepartment == null ? null : salesDepartment.trim();
    }
}