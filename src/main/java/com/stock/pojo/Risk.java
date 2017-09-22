package com.stock.pojo;

public class Risk {
    private String riskUuid;

    private String riskName;

    private String riskType;

    private String riskRank;

    private String riskReason;

    private String riskPrevent;

    private String riskEvalue;

    private String projectUuid;

    public String getRiskUuid() {
        return riskUuid;
    }

    public void setRiskUuid(String riskUuid) {
        this.riskUuid = riskUuid == null ? null : riskUuid.trim();
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName == null ? null : riskName.trim();
    }

    public String getRiskType() {
        return riskType;
    }

    public void setRiskType(String riskType) {
        this.riskType = riskType == null ? null : riskType.trim();
    }

    public String getRiskRank() {
        return riskRank;
    }

    public void setRiskRank(String riskRank) {
        this.riskRank = riskRank == null ? null : riskRank.trim();
    }

    public String getRiskReason() {
        return riskReason;
    }

    public void setRiskReason(String riskReason) {
        this.riskReason = riskReason == null ? null : riskReason.trim();
    }

    public String getRiskPrevent() {
        return riskPrevent;
    }

    public void setRiskPrevent(String riskPrevent) {
        this.riskPrevent = riskPrevent == null ? null : riskPrevent.trim();
    }

    public String getRiskEvalue() {
        return riskEvalue;
    }

    public void setRiskEvalue(String riskEvalue) {
        this.riskEvalue = riskEvalue == null ? null : riskEvalue.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }
}