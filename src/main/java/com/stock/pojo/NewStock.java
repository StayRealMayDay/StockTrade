package com.stock.pojo;

public class NewStock {
    private Integer nstockId;

    private String nstockCode;

    private String nstockApcode;

    private String nstockName;

    private String applyDate;

    private String payDate;

    private String listDate;

    private String issuePrice;

    private String issuePeRatio;

    private String issueTotal;

    private String industryPeRatio;

    private String applyUplimit;

    private String topApplyMvalue;

    private String centerCheckRatio;

    private String centerCheckNum;

    public Integer getNstockId() {
        return nstockId;
    }

    public void setNstockId(Integer nstockId) {
        this.nstockId = nstockId;
    }

    public String getNstockCode() {
        return nstockCode;
    }

    public void setNstockCode(String nstockCode) {
        this.nstockCode = nstockCode == null ? null : nstockCode.trim();
    }

    public String getNstockApcode() {
        return nstockApcode;
    }

    public void setNstockApcode(String nstockApcode) {
        this.nstockApcode = nstockApcode == null ? null : nstockApcode.trim();
    }

    public String getNstockName() {
        return nstockName;
    }

    public void setNstockName(String nstockName) {
        this.nstockName = nstockName == null ? null : nstockName.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getPayDate() {
        return payDate;
    }

    public void setPayDate(String payDate) {
        this.payDate = payDate == null ? null : payDate.trim();
    }

    public String getListDate() {
        return listDate;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate == null ? null : listDate.trim();
    }

    public String getIssuePrice() {
        return issuePrice;
    }

    public void setIssuePrice(String issuePrice) {
        this.issuePrice = issuePrice == null ? null : issuePrice.trim();
    }

    public String getIssuePeRatio() {
        return issuePeRatio;
    }

    public void setIssuePeRatio(String issuePeRatio) {
        this.issuePeRatio = issuePeRatio == null ? null : issuePeRatio.trim();
    }

    public String getIssueTotal() {
        return issueTotal;
    }

    public void setIssueTotal(String issueTotal) {
        this.issueTotal = issueTotal == null ? null : issueTotal.trim();
    }

    public String getIndustryPeRatio() {
        return industryPeRatio;
    }

    public void setIndustryPeRatio(String industryPeRatio) {
        this.industryPeRatio = industryPeRatio == null ? null : industryPeRatio.trim();
    }

    public String getApplyUplimit() {
        return applyUplimit;
    }

    public void setApplyUplimit(String applyUplimit) {
        this.applyUplimit = applyUplimit == null ? null : applyUplimit.trim();
    }

    public String getTopApplyMvalue() {
        return topApplyMvalue;
    }

    public void setTopApplyMvalue(String topApplyMvalue) {
        this.topApplyMvalue = topApplyMvalue == null ? null : topApplyMvalue.trim();
    }

    public String getCenterCheckRatio() {
        return centerCheckRatio;
    }

    public void setCenterCheckRatio(String centerCheckRatio) {
        this.centerCheckRatio = centerCheckRatio == null ? null : centerCheckRatio.trim();
    }

    public String getCenterCheckNum() {
        return centerCheckNum;
    }

    public void setCenterCheckNum(String centerCheckNum) {
        this.centerCheckNum = centerCheckNum == null ? null : centerCheckNum.trim();
    }
}