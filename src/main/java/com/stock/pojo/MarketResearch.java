package com.stock.pojo;

public class MarketResearch {
    private String mrUuid;

    private String mrGeneral;

    private String mrContent;

    private String mrEffective;

    private String mrTotalsample;

    private String mrReqdate;

    private String mrAccept;

    private String prosUuid;

    public String getMrUuid() {
        return mrUuid;
    }

    public void setMrUuid(String mrUuid) {
        this.mrUuid = mrUuid == null ? null : mrUuid.trim();
    }

    public String getMrGeneral() {
        return mrGeneral;
    }

    public void setMrGeneral(String mrGeneral) {
        this.mrGeneral = mrGeneral == null ? null : mrGeneral.trim();
    }

    public String getMrContent() {
        return mrContent;
    }

    public void setMrContent(String mrContent) {
        this.mrContent = mrContent == null ? null : mrContent.trim();
    }

    public String getMrEffective() {
        return mrEffective;
    }

    public void setMrEffective(String mrEffective) {
        this.mrEffective = mrEffective == null ? null : mrEffective.trim();
    }

    public String getMrTotalsample() {
        return mrTotalsample;
    }

    public void setMrTotalsample(String mrTotalsample) {
        this.mrTotalsample = mrTotalsample == null ? null : mrTotalsample.trim();
    }

    public String getMrReqdate() {
        return mrReqdate;
    }

    public void setMrReqdate(String mrReqdate) {
        this.mrReqdate = mrReqdate == null ? null : mrReqdate.trim();
    }

    public String getMrAccept() {
        return mrAccept;
    }

    public void setMrAccept(String mrAccept) {
        this.mrAccept = mrAccept == null ? null : mrAccept.trim();
    }

    public String getProsUuid() {
        return prosUuid;
    }

    public void setProsUuid(String prosUuid) {
        this.prosUuid = prosUuid == null ? null : prosUuid.trim();
    }
}