package com.stock.pojo;

public class FundUse {
    private String fuUuid;

    private String fuFund;

    private String fuUseLlustrate;

    private String fuSolveProblem;

    private String fuActualResult;

    private String aeUuid;

    public String getFuUuid() {
        return fuUuid;
    }

    public void setFuUuid(String fuUuid) {
        this.fuUuid = fuUuid == null ? null : fuUuid.trim();
    }

    public String getFuFund() {
        return fuFund;
    }

    public void setFuFund(String fuFund) {
        this.fuFund = fuFund == null ? null : fuFund.trim();
    }

    public String getFuUseLlustrate() {
        return fuUseLlustrate;
    }

    public void setFuUseLlustrate(String fuUseLlustrate) {
        this.fuUseLlustrate = fuUseLlustrate == null ? null : fuUseLlustrate.trim();
    }

    public String getFuSolveProblem() {
        return fuSolveProblem;
    }

    public void setFuSolveProblem(String fuSolveProblem) {
        this.fuSolveProblem = fuSolveProblem == null ? null : fuSolveProblem.trim();
    }

    public String getFuActualResult() {
        return fuActualResult;
    }

    public void setFuActualResult(String fuActualResult) {
        this.fuActualResult = fuActualResult == null ? null : fuActualResult.trim();
    }

    public String getAeUuid() {
        return aeUuid;
    }

    public void setAeUuid(String aeUuid) {
        this.aeUuid = aeUuid == null ? null : aeUuid.trim();
    }
}