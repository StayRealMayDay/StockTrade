package com.stock.pojo;

public class FinanceAssumption {
    private String faUuid;

    private String forecastSales;

    private String dynamicPaybackPeriod;

    private String faNpv;

    private String faNav;

    private String internalRate;

    private String faRoe;

    private String faRoa;

    private String faEvalue;

    private String proUuid;

    public String getFaUuid() {
        return faUuid;
    }

    public void setFaUuid(String faUuid) {
        this.faUuid = faUuid == null ? null : faUuid.trim();
    }

    public String getForecastSales() {
        return forecastSales;
    }

    public void setForecastSales(String forecastSales) {
        this.forecastSales = forecastSales == null ? null : forecastSales.trim();
    }

    public String getDynamicPaybackPeriod() {
        return dynamicPaybackPeriod;
    }

    public void setDynamicPaybackPeriod(String dynamicPaybackPeriod) {
        this.dynamicPaybackPeriod = dynamicPaybackPeriod == null ? null : dynamicPaybackPeriod.trim();
    }

    public String getFaNpv() {
        return faNpv;
    }

    public void setFaNpv(String faNpv) {
        this.faNpv = faNpv == null ? null : faNpv.trim();
    }

    public String getFaNav() {
        return faNav;
    }

    public void setFaNav(String faNav) {
        this.faNav = faNav == null ? null : faNav.trim();
    }

    public String getInternalRate() {
        return internalRate;
    }

    public void setInternalRate(String internalRate) {
        this.internalRate = internalRate == null ? null : internalRate.trim();
    }

    public String getFaRoe() {
        return faRoe;
    }

    public void setFaRoe(String faRoe) {
        this.faRoe = faRoe == null ? null : faRoe.trim();
    }

    public String getFaRoa() {
        return faRoa;
    }

    public void setFaRoa(String faRoa) {
        this.faRoa = faRoa == null ? null : faRoa.trim();
    }

    public String getFaEvalue() {
        return faEvalue;
    }

    public void setFaEvalue(String faEvalue) {
        this.faEvalue = faEvalue == null ? null : faEvalue.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}