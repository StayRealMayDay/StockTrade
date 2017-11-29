package com.stock.pojo;

public class Rankandpredict {
    private Integer randpId;

    private String stockCode;

    private String stockName;

    private String predictEveryProfit;

    private String predictNetProfit;

    private String predictMainIncome;

    private String predictTime;

    private String predictResearcher;

    private String rankContent;

    private String rankTime;

    private String rankResearcher;

    private String rankInstitution;

    public Integer getRandpId() {
        return randpId;
    }

    public void setRandpId(Integer randpId) {
        this.randpId = randpId;
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

    public String getPredictEveryProfit() {
        return predictEveryProfit;
    }

    public void setPredictEveryProfit(String predictEveryProfit) {
        this.predictEveryProfit = predictEveryProfit == null ? null : predictEveryProfit.trim();
    }

    public String getPredictNetProfit() {
        return predictNetProfit;
    }

    public void setPredictNetProfit(String predictNetProfit) {
        this.predictNetProfit = predictNetProfit == null ? null : predictNetProfit.trim();
    }

    public String getPredictMainIncome() {
        return predictMainIncome;
    }

    public void setPredictMainIncome(String predictMainIncome) {
        this.predictMainIncome = predictMainIncome == null ? null : predictMainIncome.trim();
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime == null ? null : predictTime.trim();
    }

    public String getPredictResearcher() {
        return predictResearcher;
    }

    public void setPredictResearcher(String predictResearcher) {
        this.predictResearcher = predictResearcher == null ? null : predictResearcher.trim();
    }

    public String getRankContent() {
        return rankContent;
    }

    public void setRankContent(String rankContent) {
        this.rankContent = rankContent == null ? null : rankContent.trim();
    }

    public String getRankTime() {
        return rankTime;
    }

    public void setRankTime(String rankTime) {
        this.rankTime = rankTime == null ? null : rankTime.trim();
    }

    public String getRankResearcher() {
        return rankResearcher;
    }

    public void setRankResearcher(String rankResearcher) {
        this.rankResearcher = rankResearcher == null ? null : rankResearcher.trim();
    }

    public String getRankInstitution() {
        return rankInstitution;
    }

    public void setRankInstitution(String rankInstitution) {
        this.rankInstitution = rankInstitution == null ? null : rankInstitution.trim();
    }
}