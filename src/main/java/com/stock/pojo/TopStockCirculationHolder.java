package com.stock.pojo;

public class TopStockCirculationHolder {
    private String id;

    private String stockId;

    private String date;

    private String stockHeld;

    private String stockHeldRate;

    private String changeBefore;

    private String institutionName;

    private String holderNum;

    private String holderChange;

    private String stockPropotionRate;

    private String realIncrease;

    private String stockType;

    private String stockDetailId;

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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getStockHeld() {
        return stockHeld;
    }

    public void setStockHeld(String stockHeld) {
        this.stockHeld = stockHeld == null ? null : stockHeld.trim();
    }

    public String getStockHeldRate() {
        return stockHeldRate;
    }

    public void setStockHeldRate(String stockHeldRate) {
        this.stockHeldRate = stockHeldRate == null ? null : stockHeldRate.trim();
    }

    public String getChangeBefore() {
        return changeBefore;
    }

    public void setChangeBefore(String changeBefore) {
        this.changeBefore = changeBefore == null ? null : changeBefore.trim();
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName == null ? null : institutionName.trim();
    }

    public String getHolderNum() {
        return holderNum;
    }

    public void setHolderNum(String holderNum) {
        this.holderNum = holderNum == null ? null : holderNum.trim();
    }

    public String getHolderChange() {
        return holderChange;
    }

    public void setHolderChange(String holderChange) {
        this.holderChange = holderChange == null ? null : holderChange.trim();
    }

    public String getStockPropotionRate() {
        return stockPropotionRate;
    }

    public void setStockPropotionRate(String stockPropotionRate) {
        this.stockPropotionRate = stockPropotionRate == null ? null : stockPropotionRate.trim();
    }

    public String getRealIncrease() {
        return realIncrease;
    }

    public void setRealIncrease(String realIncrease) {
        this.realIncrease = realIncrease == null ? null : realIncrease.trim();
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getStockDetailId() {
        return stockDetailId;
    }

    public void setStockDetailId(String stockDetailId) {
        this.stockDetailId = stockDetailId == null ? null : stockDetailId.trim();
    }
}