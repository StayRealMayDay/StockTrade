package com.stock.pojo;

public class Marketing {
    private String maingUuid;

    private String maingWay;

    private String maingType;

    private String maingStrategy;

    private String maingExecute;

    private String maingPlatform;

    private String maingAdConversion;

    private String proUuid;

    public String getMaingUuid() {
        return maingUuid;
    }

    public void setMaingUuid(String maingUuid) {
        this.maingUuid = maingUuid == null ? null : maingUuid.trim();
    }

    public String getMaingWay() {
        return maingWay;
    }

    public void setMaingWay(String maingWay) {
        this.maingWay = maingWay == null ? null : maingWay.trim();
    }

    public String getMaingType() {
        return maingType;
    }

    public void setMaingType(String maingType) {
        this.maingType = maingType == null ? null : maingType.trim();
    }

    public String getMaingStrategy() {
        return maingStrategy;
    }

    public void setMaingStrategy(String maingStrategy) {
        this.maingStrategy = maingStrategy == null ? null : maingStrategy.trim();
    }

    public String getMaingExecute() {
        return maingExecute;
    }

    public void setMaingExecute(String maingExecute) {
        this.maingExecute = maingExecute == null ? null : maingExecute.trim();
    }

    public String getMaingPlatform() {
        return maingPlatform;
    }

    public void setMaingPlatform(String maingPlatform) {
        this.maingPlatform = maingPlatform == null ? null : maingPlatform.trim();
    }

    public String getMaingAdConversion() {
        return maingAdConversion;
    }

    public void setMaingAdConversion(String maingAdConversion) {
        this.maingAdConversion = maingAdConversion == null ? null : maingAdConversion.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}