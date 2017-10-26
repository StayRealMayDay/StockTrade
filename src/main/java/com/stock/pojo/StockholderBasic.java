package com.stock.pojo;

public class StockholderBasic {
    private String stockholderId;

    private String stock;

    private String stockholderCode;

    private String stockholderName;

    private String shareholdNum;

    private String shareholdRatio;

    private String equityNature;

    private String time;

    public String getStockholderId() {
        return stockholderId;
    }

    public void setStockholderId(String stockholderId) {
        this.stockholderId = stockholderId == null ? null : stockholderId.trim();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public String getStockholderCode() {
        return stockholderCode;
    }

    public void setStockholderCode(String stockholderCode) {
        this.stockholderCode = stockholderCode == null ? null : stockholderCode.trim();
    }

    public String getStockholderName() {
        return stockholderName;
    }

    public void setStockholderName(String stockholderName) {
        this.stockholderName = stockholderName == null ? null : stockholderName.trim();
    }

    public String getShareholdNum() {
        return shareholdNum;
    }

    public void setShareholdNum(String shareholdNum) {
        this.shareholdNum = shareholdNum == null ? null : shareholdNum.trim();
    }

    public String getShareholdRatio() {
        return shareholdRatio;
    }

    public void setShareholdRatio(String shareholdRatio) {
        this.shareholdRatio = shareholdRatio == null ? null : shareholdRatio.trim();
    }

    public String getEquityNature() {
        return equityNature;
    }

    public void setEquityNature(String equityNature) {
        this.equityNature = equityNature == null ? null : equityNature.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}