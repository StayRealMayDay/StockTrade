package com.stock.pojo;

public class Competitor {
    private String compUuid;

    private String compName;

    private String compRank;

    private String compShare;

    private String compAdvantage;

    private String compShort;

    private String enviroUuid;

    public String getCompUuid() {
        return compUuid;
    }

    public void setCompUuid(String compUuid) {
        this.compUuid = compUuid == null ? null : compUuid.trim();
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName == null ? null : compName.trim();
    }

    public String getCompRank() {
        return compRank;
    }

    public void setCompRank(String compRank) {
        this.compRank = compRank == null ? null : compRank.trim();
    }

    public String getCompShare() {
        return compShare;
    }

    public void setCompShare(String compShare) {
        this.compShare = compShare == null ? null : compShare.trim();
    }

    public String getCompAdvantage() {
        return compAdvantage;
    }

    public void setCompAdvantage(String compAdvantage) {
        this.compAdvantage = compAdvantage == null ? null : compAdvantage.trim();
    }

    public String getCompShort() {
        return compShort;
    }

    public void setCompShort(String compShort) {
        this.compShort = compShort == null ? null : compShort.trim();
    }

    public String getEnviroUuid() {
        return enviroUuid;
    }

    public void setEnviroUuid(String enviroUuid) {
        this.enviroUuid = enviroUuid == null ? null : enviroUuid.trim();
    }
}