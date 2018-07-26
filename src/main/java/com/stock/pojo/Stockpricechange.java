package com.stock.pojo;

public class Stockpricechange {
    private Integer id;

    private String stockId;

    private String date;

    private String shoupanprice;

    private String jiaoyinum;

    private String circulationprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getShoupanprice() {
        return shoupanprice;
    }

    public void setShoupanprice(String shoupanprice) {
        this.shoupanprice = shoupanprice == null ? null : shoupanprice.trim();
    }

    public String getJiaoyinum() {
        return jiaoyinum;
    }

    public void setJiaoyinum(String jiaoyinum) {
        this.jiaoyinum = jiaoyinum == null ? null : jiaoyinum.trim();
    }

    public String getCirculationprice() {
        return circulationprice;
    }

    public void setCirculationprice(String circulationprice) {
        this.circulationprice = circulationprice == null ? null : circulationprice.trim();
    }
}