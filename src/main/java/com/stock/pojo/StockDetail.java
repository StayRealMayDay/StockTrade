package com.stock.pojo;

public class StockDetail {
    private String id;

    private String stockId;

    private String stockDetailId;

    private String reportDate;

    private String stockNum;

    private String stockRate;

    private String increase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getStockDetailId() {
        return stockDetailId;
    }

    public void setStockDetailId(String stockDetailId) {
        this.stockDetailId = stockDetailId == null ? null : stockDetailId.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getStockRate() {
        return stockRate;
    }

    public void setStockRate(String stockRate) {
        this.stockRate = stockRate == null ? null : stockRate.trim();
    }

    public String getIncrease() {
        return increase;
    }

    public void setIncrease(String increase) {
        this.increase = increase == null ? null : increase.trim();
    }
}