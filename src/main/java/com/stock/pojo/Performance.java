package com.stock.pojo;

public class Performance {
    private String perUuid;

    private String perName;

    private String perTime;

    private String perDescription;

    private String perEvaluation;

    private String weUuid;

    public String getPerUuid() {
        return perUuid;
    }

    public void setPerUuid(String perUuid) {
        this.perUuid = perUuid == null ? null : perUuid.trim();
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName == null ? null : perName.trim();
    }

    public String getPerTime() {
        return perTime;
    }

    public void setPerTime(String perTime) {
        this.perTime = perTime == null ? null : perTime.trim();
    }

    public String getPerDescription() {
        return perDescription;
    }

    public void setPerDescription(String perDescription) {
        this.perDescription = perDescription == null ? null : perDescription.trim();
    }

    public String getPerEvaluation() {
        return perEvaluation;
    }

    public void setPerEvaluation(String perEvaluation) {
        this.perEvaluation = perEvaluation == null ? null : perEvaluation.trim();
    }

    public String getWeUuid() {
        return weUuid;
    }

    public void setWeUuid(String weUuid) {
        this.weUuid = weUuid == null ? null : weUuid.trim();
    }
}