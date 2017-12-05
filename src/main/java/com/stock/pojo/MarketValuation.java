package com.stock.pojo;

public class MarketValuation {
    private Integer valueId;

    private String stockCode;

    private String stockName;

    private String pe;

    private String pePredict12;

    private String pb;

    private String ps;

    private String dividendRate12;

    private String tatolMarketValue;

    private String flowMarketValue;

    private String enterpriseValue;
    
    private StockTemp stocktemp;

	public StockTemp getStocktemp() {
		return stocktemp;
	}

	public void setStocktemp(StockTemp stocktemp) {
		this.stocktemp = stocktemp;
	}

	public Integer getValueId() {
        return valueId;
    }

    public void setValueId(Integer valueId) {
        this.valueId = valueId;
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

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe == null ? null : pe.trim();
    }

    public String getPePredict12() {
        return pePredict12;
    }

    public void setPePredict12(String pePredict12) {
        this.pePredict12 = pePredict12 == null ? null : pePredict12.trim();
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb == null ? null : pb.trim();
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }

    public String getDividendRate12() {
        return dividendRate12;
    }

    public void setDividendRate12(String dividendRate12) {
        this.dividendRate12 = dividendRate12 == null ? null : dividendRate12.trim();
    }

    public String getTatolMarketValue() {
        return tatolMarketValue;
    }

    public void setTatolMarketValue(String tatolMarketValue) {
        this.tatolMarketValue = tatolMarketValue == null ? null : tatolMarketValue.trim();
    }

    public String getFlowMarketValue() {
        return flowMarketValue;
    }

    public void setFlowMarketValue(String flowMarketValue) {
        this.flowMarketValue = flowMarketValue == null ? null : flowMarketValue.trim();
    }

    public String getEnterpriseValue() {
        return enterpriseValue;
    }

    public void setEnterpriseValue(String enterpriseValue) {
        this.enterpriseValue = enterpriseValue == null ? null : enterpriseValue.trim();
    }
}