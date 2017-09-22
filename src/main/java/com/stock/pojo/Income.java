package com.stock.pojo;

public class Income {
    private String incoUuid;

    private String incoWay;

    private String incoFund;

    private String incoPeriod;

    private String proUuid;

    public String getIncoUuid() {
        return incoUuid;
    }

    public void setIncoUuid(String incoUuid) {
        this.incoUuid = incoUuid == null ? null : incoUuid.trim();
    }

    public String getIncoWay() {
        return incoWay;
    }

    public void setIncoWay(String incoWay) {
        this.incoWay = incoWay == null ? null : incoWay.trim();
    }

    public String getIncoFund() {
        return incoFund;
    }

    public void setIncoFund(String incoFund) {
        this.incoFund = incoFund == null ? null : incoFund.trim();
    }

    public String getIncoPeriod() {
        return incoPeriod;
    }

    public void setIncoPeriod(String incoPeriod) {
        this.incoPeriod = incoPeriod == null ? null : incoPeriod.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}