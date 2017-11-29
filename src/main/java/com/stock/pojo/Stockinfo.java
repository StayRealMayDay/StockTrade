package com.stock.pojo;

public class Stockinfo {
    private String stockId;

    private String stockName;

    private String stockNum;

    private String currentPrice;

    private String updownRatio;

    private String updownPrice;

    private String upSpeed;

    private String turnoverRate;

    private String equivalentRatio;

    private String amplitude;

    private String turnVolume;

    private String floatingStock;

    private String circulationMarketValue;

    private String peRatio;

    private String time;

    private String id;
    
    private Company company;

    public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
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

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice == null ? null : currentPrice.trim();
    }

    public String getUpdownRatio() {
        return updownRatio;
    }

    public void setUpdownRatio(String updownRatio) {
        this.updownRatio = updownRatio == null ? null : updownRatio.trim();
    }

    public String getUpdownPrice() {
        return updownPrice;
    }

    public void setUpdownPrice(String updownPrice) {
        this.updownPrice = updownPrice == null ? null : updownPrice.trim();
    }

    public String getUpSpeed() {
        return upSpeed;
    }

    public void setUpSpeed(String upSpeed) {
        this.upSpeed = upSpeed == null ? null : upSpeed.trim();
    }

    public String getTurnoverRate() {
        return turnoverRate;
    }

    public void setTurnoverRate(String turnoverRate) {
        this.turnoverRate = turnoverRate == null ? null : turnoverRate.trim();
    }

    public String getEquivalentRatio() {
        return equivalentRatio;
    }

    public void setEquivalentRatio(String equivalentRatio) {
        this.equivalentRatio = equivalentRatio == null ? null : equivalentRatio.trim();
    }

    public String getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(String amplitude) {
        this.amplitude = amplitude == null ? null : amplitude.trim();
    }

    public String getTurnVolume() {
        return turnVolume;
    }

    public void setTurnVolume(String turnVolume) {
        this.turnVolume = turnVolume == null ? null : turnVolume.trim();
    }

    public String getFloatingStock() {
        return floatingStock;
    }

    public void setFloatingStock(String floatingStock) {
        this.floatingStock = floatingStock == null ? null : floatingStock.trim();
    }

    public String getCirculationMarketValue() {
        return circulationMarketValue;
    }

    public void setCirculationMarketValue(String circulationMarketValue) {
        this.circulationMarketValue = circulationMarketValue == null ? null : circulationMarketValue.trim();
    }

    public String getPeRatio() {
        return peRatio;
    }

    public void setPeRatio(String peRatio) {
        this.peRatio = peRatio == null ? null : peRatio.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
}