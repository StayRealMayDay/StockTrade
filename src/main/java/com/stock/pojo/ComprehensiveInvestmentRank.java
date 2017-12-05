package com.stock.pojo;

public class ComprehensiveInvestmentRank {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String sixRankChar;

    private String sixRankNum;

    private String institutionCount;

    private String upInstitutionCount;

    private String downInstitutionCount;

    private String holdInstitutionCount;

    private String sixBuy;

    private String sixIncreace;

    private String sixNeuter;

    private String sixDecreace;

    private String sixSell;

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

    public String getSixRankChar() {
        return sixRankChar;
    }

    public void setSixRankChar(String sixRankChar) {
        this.sixRankChar = sixRankChar == null ? null : sixRankChar.trim();
    }

    public String getSixRankNum() {
        return sixRankNum;
    }

    public void setSixRankNum(String sixRankNum) {
        this.sixRankNum = sixRankNum == null ? null : sixRankNum.trim();
    }

    public String getInstitutionCount() {
        return institutionCount;
    }

    public void setInstitutionCount(String institutionCount) {
        this.institutionCount = institutionCount == null ? null : institutionCount.trim();
    }

    public String getUpInstitutionCount() {
        return upInstitutionCount;
    }

    public void setUpInstitutionCount(String upInstitutionCount) {
        this.upInstitutionCount = upInstitutionCount == null ? null : upInstitutionCount.trim();
    }

    public String getDownInstitutionCount() {
        return downInstitutionCount;
    }

    public void setDownInstitutionCount(String downInstitutionCount) {
        this.downInstitutionCount = downInstitutionCount == null ? null : downInstitutionCount.trim();
    }

    public String getHoldInstitutionCount() {
        return holdInstitutionCount;
    }

    public void setHoldInstitutionCount(String holdInstitutionCount) {
        this.holdInstitutionCount = holdInstitutionCount == null ? null : holdInstitutionCount.trim();
    }

    public String getSixBuy() {
        return sixBuy;
    }

    public void setSixBuy(String sixBuy) {
        this.sixBuy = sixBuy == null ? null : sixBuy.trim();
    }

    public String getSixIncreace() {
        return sixIncreace;
    }

    public void setSixIncreace(String sixIncreace) {
        this.sixIncreace = sixIncreace == null ? null : sixIncreace.trim();
    }

    public String getSixNeuter() {
        return sixNeuter;
    }

    public void setSixNeuter(String sixNeuter) {
        this.sixNeuter = sixNeuter == null ? null : sixNeuter.trim();
    }

    public String getSixDecreace() {
        return sixDecreace;
    }

    public void setSixDecreace(String sixDecreace) {
        this.sixDecreace = sixDecreace == null ? null : sixDecreace.trim();
    }

    public String getSixSell() {
        return sixSell;
    }

    public void setSixSell(String sixSell) {
        this.sixSell = sixSell == null ? null : sixSell.trim();
    }
}