package com.stock.pojo;

public class Capacity {
    private String caUuid;

    private String caScope;

    private String caYear;

    private String caEstimate;

    private String prosUuid;

    public String getCaUuid() {
        return caUuid;
    }

    public void setCaUuid(String caUuid) {
        this.caUuid = caUuid == null ? null : caUuid.trim();
    }

    public String getCaScope() {
        return caScope;
    }

    public void setCaScope(String caScope) {
        this.caScope = caScope == null ? null : caScope.trim();
    }

    public String getCaYear() {
        return caYear;
    }

    public void setCaYear(String caYear) {
        this.caYear = caYear == null ? null : caYear.trim();
    }

    public String getCaEstimate() {
        return caEstimate;
    }

    public void setCaEstimate(String caEstimate) {
        this.caEstimate = caEstimate == null ? null : caEstimate.trim();
    }

    public String getProsUuid() {
        return prosUuid;
    }

    public void setProsUuid(String prosUuid) {
        this.prosUuid = prosUuid == null ? null : prosUuid.trim();
    }
}