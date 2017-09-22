package com.stock.pojo;

public class Prospect {
    private String prosUuid;

    private String prosGeneral;

    private String prosCapacity;

    private String prosAnalysis;

    private String prosEvalue;

    private String maUuid;

    public String getProsUuid() {
        return prosUuid;
    }

    public void setProsUuid(String prosUuid) {
        this.prosUuid = prosUuid == null ? null : prosUuid.trim();
    }

    public String getProsGeneral() {
        return prosGeneral;
    }

    public void setProsGeneral(String prosGeneral) {
        this.prosGeneral = prosGeneral == null ? null : prosGeneral.trim();
    }

    public String getProsCapacity() {
        return prosCapacity;
    }

    public void setProsCapacity(String prosCapacity) {
        this.prosCapacity = prosCapacity == null ? null : prosCapacity.trim();
    }

    public String getProsAnalysis() {
        return prosAnalysis;
    }

    public void setProsAnalysis(String prosAnalysis) {
        this.prosAnalysis = prosAnalysis == null ? null : prosAnalysis.trim();
    }

    public String getProsEvalue() {
        return prosEvalue;
    }

    public void setProsEvalue(String prosEvalue) {
        this.prosEvalue = prosEvalue == null ? null : prosEvalue.trim();
    }

    public String getMaUuid() {
        return maUuid;
    }

    public void setMaUuid(String maUuid) {
        this.maUuid = maUuid == null ? null : maUuid.trim();
    }
}