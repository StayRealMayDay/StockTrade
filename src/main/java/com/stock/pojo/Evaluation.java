package com.stock.pojo;

public class Evaluation {
    private String evaUuid;

    private String evaProUuid;

    private String evaExpertUuid;

    private String evaValue;

    private String evaTime;

    public String getEvaUuid() {
        return evaUuid;
    }

    public void setEvaUuid(String evaUuid) {
        this.evaUuid = evaUuid == null ? null : evaUuid.trim();
    }

    public String getEvaProUuid() {
        return evaProUuid;
    }

    public void setEvaProUuid(String evaProUuid) {
        this.evaProUuid = evaProUuid == null ? null : evaProUuid.trim();
    }

    public String getEvaExpertUuid() {
        return evaExpertUuid;
    }

    public void setEvaExpertUuid(String evaExpertUuid) {
        this.evaExpertUuid = evaExpertUuid == null ? null : evaExpertUuid.trim();
    }

    public String getEvaValue() {
        return evaValue;
    }

    public void setEvaValue(String evaValue) {
        this.evaValue = evaValue == null ? null : evaValue.trim();
    }

    public String getEvaTime() {
        return evaTime;
    }

    public void setEvaTime(String evaTime) {
        this.evaTime = evaTime == null ? null : evaTime.trim();
    }
}