package com.stock.pojo;

public class MonthQuotation {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String previousClose;

    private String open;

    private String highest;

    private String lowest;

    private String close;

    private String highestClose;

    private String lowestClose;

    private String avePrice;

    private String aveClose;

    private String updownRatio;

    private String updown;

    private String turnVolume;

    private String turnPrice;

    private String turnoverRate;

    private String aveTurnoverRate;

    private String amplitude;

    private String updownRatioDapan;

    private String overDapanDays;

    private String highestDate;

    private String lowestDate;

    private String highestCloseDate;

    private String lowestCloseDate;

    private String highestUpdownDate;

    private String lowestUpdownDate;

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

    public String getPreviousClose() {
        return previousClose;
    }

    public void setPreviousClose(String previousClose) {
        this.previousClose = previousClose == null ? null : previousClose.trim();
    }

    public String getOpen() {
        return open;
    }

    public void setOpen(String open) {
        this.open = open == null ? null : open.trim();
    }

    public String getHighest() {
        return highest;
    }

    public void setHighest(String highest) {
        this.highest = highest == null ? null : highest.trim();
    }

    public String getLowest() {
        return lowest;
    }

    public void setLowest(String lowest) {
        this.lowest = lowest == null ? null : lowest.trim();
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close == null ? null : close.trim();
    }

    public String getHighestClose() {
        return highestClose;
    }

    public void setHighestClose(String highestClose) {
        this.highestClose = highestClose == null ? null : highestClose.trim();
    }

    public String getLowestClose() {
        return lowestClose;
    }

    public void setLowestClose(String lowestClose) {
        this.lowestClose = lowestClose == null ? null : lowestClose.trim();
    }

    public String getAvePrice() {
        return avePrice;
    }

    public void setAvePrice(String avePrice) {
        this.avePrice = avePrice == null ? null : avePrice.trim();
    }

    public String getAveClose() {
        return aveClose;
    }

    public void setAveClose(String aveClose) {
        this.aveClose = aveClose == null ? null : aveClose.trim();
    }

    public String getUpdownRatio() {
        return updownRatio;
    }

    public void setUpdownRatio(String updownRatio) {
        this.updownRatio = updownRatio == null ? null : updownRatio.trim();
    }

    public String getUpdown() {
        return updown;
    }

    public void setUpdown(String updown) {
        this.updown = updown == null ? null : updown.trim();
    }

    public String getTurnVolume() {
        return turnVolume;
    }

    public void setTurnVolume(String turnVolume) {
        this.turnVolume = turnVolume == null ? null : turnVolume.trim();
    }

    public String getTurnPrice() {
        return turnPrice;
    }

    public void setTurnPrice(String turnPrice) {
        this.turnPrice = turnPrice == null ? null : turnPrice.trim();
    }

    public String getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(String turnoverRate) {
        this.turnoverRate = turnoverRate == null ? null : turnoverRate.trim();
    }

    public String getAveTurnoverRate() {
        return aveTurnoverRate;
    }

    public void setAveTurnoverRate(String aveTurnoverRate) {
        this.aveTurnoverRate = aveTurnoverRate == null ? null : aveTurnoverRate.trim();
    }

    public String getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(String amplitude) {
        this.amplitude = amplitude == null ? null : amplitude.trim();
    }

    public String getUpdownRatioDapan() {
        return updownRatioDapan;
    }

    public void setUpdownRatioDapan(String updownRatioDapan) {
        this.updownRatioDapan = updownRatioDapan == null ? null : updownRatioDapan.trim();
    }

    public String getOverDapanDays() {
        return overDapanDays;
    }

    public void setOverDapanDays(String overDapanDays) {
        this.overDapanDays = overDapanDays == null ? null : overDapanDays.trim();
    }

    public String getHighestDate() {
        return highestDate;
    }

    public void setHighestDate(String highestDate) {
        this.highestDate = highestDate == null ? null : highestDate.trim();
    }

    public String getLowestDate() {
        return lowestDate;
    }

    public void setLowestDate(String lowestDate) {
        this.lowestDate = lowestDate == null ? null : lowestDate.trim();
    }

    public String getHighestCloseDate() {
        return highestCloseDate;
    }

    public void setHighestCloseDate(String highestCloseDate) {
        this.highestCloseDate = highestCloseDate == null ? null : highestCloseDate.trim();
    }

    public String getLowestCloseDate() {
        return lowestCloseDate;
    }

    public void setLowestCloseDate(String lowestCloseDate) {
        this.lowestCloseDate = lowestCloseDate == null ? null : lowestCloseDate.trim();
    }

    public String getHighestUpdownDate() {
        return highestUpdownDate;
    }

    public void setHighestUpdownDate(String highestUpdownDate) {
        this.highestUpdownDate = highestUpdownDate == null ? null : highestUpdownDate.trim();
    }

    public String getLowestUpdownDate() {
        return lowestUpdownDate;
    }

    public void setLowestUpdownDate(String lowestUpdownDate) {
        this.lowestUpdownDate = lowestUpdownDate == null ? null : lowestUpdownDate.trim();
    }
}