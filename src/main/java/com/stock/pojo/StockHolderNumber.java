package com.stock.pojo;

public class StockHolderNumber {
    private String id;

    private String stockId;

    private String date;

    private String price;

    private String holderNumber;

    private String changeCome;

    private String avgCirculate;

    private String avgCirculateChange;

    private String instAvg;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getHolderNumber() {
        return holderNumber;
    }

    public void setHolderNumber(String holderNumber) {
        this.holderNumber = holderNumber == null ? null : holderNumber.trim();
    }

    public String getChangeCome() {
        return changeCome;
    }

    public void setChangeCome(String changeCome) {
        this.changeCome = changeCome == null ? null : changeCome.trim();
    }

    public String getAvgCirculate() {
        return avgCirculate;
    }

    public void setAvgCirculate(String avgCirculate) {
        this.avgCirculate = avgCirculate == null ? null : avgCirculate.trim();
    }

    public String getAvgCirculateChange() {
        return avgCirculateChange;
    }

    public void setAvgCirculateChange(String avgCirculateChange) {
        this.avgCirculateChange = avgCirculateChange == null ? null : avgCirculateChange.trim();
    }

    public String getInstAvg() {
        return instAvg;
    }

    public void setInstAvg(String instAvg) {
        this.instAvg = instAvg == null ? null : instAvg.trim();
    }
}