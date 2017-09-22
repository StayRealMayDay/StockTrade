package com.stock.pojo;

public class Authority {
    private String auUuid;

    private String auName;

    private String auDescription;

    public String getAuUuid() {
        return auUuid;
    }

    public void setAuUuid(String auUuid) {
        this.auUuid = auUuid == null ? null : auUuid.trim();
    }

    public String getAuName() {
        return auName;
    }

    public void setAuName(String auName) {
        this.auName = auName == null ? null : auName.trim();
    }

    public String getAuDescription() {
        return auDescription;
    }

    public void setAuDescription(String auDescription) {
        this.auDescription = auDescription == null ? null : auDescription.trim();
    }
}