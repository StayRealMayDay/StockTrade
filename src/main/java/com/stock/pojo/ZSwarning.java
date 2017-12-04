package com.stock.pojo;

public class ZSwarning {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String zValue;

    private String x1;

    private String x2;

    private String x3;

    private String x4;

    private String x5;

    private String zDescribe;

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

    public String getzValue() {
        return zValue;
    }

    public void setzValue(String zValue) {
        this.zValue = zValue == null ? null : zValue.trim();
    }

    public String getX1() {
        return x1;
    }

    public void setX1(String x1) {
        this.x1 = x1 == null ? null : x1.trim();
    }

    public String getX2() {
        return x2;
    }

    public void setX2(String x2) {
        this.x2 = x2 == null ? null : x2.trim();
    }

    public String getX3() {
        return x3;
    }

    public void setX3(String x3) {
        this.x3 = x3 == null ? null : x3.trim();
    }

    public String getX4() {
        return x4;
    }

    public void setX4(String x4) {
        this.x4 = x4 == null ? null : x4.trim();
    }

    public String getX5() {
        return x5;
    }

    public void setX5(String x5) {
        this.x5 = x5 == null ? null : x5.trim();
    }

    public String getzDescribe() {
        return zDescribe;
    }

    public void setzDescribe(String zDescribe) {
        this.zDescribe = zDescribe == null ? null : zDescribe.trim();
    }
}