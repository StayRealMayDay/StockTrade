package com.stock.pojo;

public class Industry {
    private String industryUuid;

    private String iName;

    private String iCharacter;

    private String iDescribe;

    private String iStatus;

    private String iAdvantage;

    public String getIndustryUuid() {
        return industryUuid;
    }

    public void setIndustryUuid(String industryUuid) {
        this.industryUuid = industryUuid == null ? null : industryUuid.trim();
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName == null ? null : iName.trim();
    }

    public String getiCharacter() {
        return iCharacter;
    }

    public void setiCharacter(String iCharacter) {
        this.iCharacter = iCharacter == null ? null : iCharacter.trim();
    }

    public String getiDescribe() {
        return iDescribe;
    }

    public void setiDescribe(String iDescribe) {
        this.iDescribe = iDescribe == null ? null : iDescribe.trim();
    }

    public String getiStatus() {
        return iStatus;
    }

    public void setiStatus(String iStatus) {
        this.iStatus = iStatus == null ? null : iStatus.trim();
    }

    public String getiAdvantage() {
        return iAdvantage;
    }

    public void setiAdvantage(String iAdvantage) {
        this.iAdvantage = iAdvantage == null ? null : iAdvantage.trim();
    }
}