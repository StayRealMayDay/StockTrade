package com.stock.pojo;

public class WorkExperience {
    private String weUuid;

    private String weStart;

    private String weEnd;

    private String weCompany;

    private String weRank;

    private String cooUuid;

    private String userUuid;

    public String getWeUuid() {
        return weUuid;
    }

    public void setWeUuid(String weUuid) {
        this.weUuid = weUuid == null ? null : weUuid.trim();
    }

    public String getWeStart() {
        return weStart;
    }

    public void setWeStart(String weStart) {
        this.weStart = weStart == null ? null : weStart.trim();
    }

    public String getWeEnd() {
        return weEnd;
    }

    public void setWeEnd(String weEnd) {
        this.weEnd = weEnd == null ? null : weEnd.trim();
    }

    public String getWeCompany() {
        return weCompany;
    }

    public void setWeCompany(String weCompany) {
        this.weCompany = weCompany == null ? null : weCompany.trim();
    }

    public String getWeRank() {
        return weRank;
    }

    public void setWeRank(String weRank) {
        this.weRank = weRank == null ? null : weRank.trim();
    }

    public String getCooUuid() {
        return cooUuid;
    }

    public void setCooUuid(String cooUuid) {
        this.cooUuid = cooUuid == null ? null : cooUuid.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }
}