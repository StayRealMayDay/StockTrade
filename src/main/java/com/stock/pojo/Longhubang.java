package com.stock.pojo;

public class Longhubang {
    private String id;

    private String date;

    private String stockId;

    private String stockName;

    private String netPurchase;

    private String netTotalturnover;

    private String closePrice;

    private String quoteChange;

    private String listReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
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

    public String getNetPurchase() {
        return netPurchase;
    }

    public void setNetPurchase(String netPurchase) {
        this.netPurchase = netPurchase == null ? null : netPurchase.trim();
    }

    public String getNetTotalturnover() {
        return netTotalturnover;
    }

    public void setNetTotalturnover(String netTotalturnover) {
        this.netTotalturnover = netTotalturnover == null ? null : netTotalturnover.trim();
    }

    public String getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(String closePrice) {
        this.closePrice = closePrice == null ? null : closePrice.trim();
    }

    public String getQuoteChange() {
        return quoteChange;
    }

    public void setQuoteChange(String quoteChange) {
        this.quoteChange = quoteChange == null ? null : quoteChange.trim();
    }

    public String getListReason() {
        return listReason;
    }

    public void setListReason(String listReason) {
        this.listReason = listReason == null ? null : listReason.trim();
    }
}