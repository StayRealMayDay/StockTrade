package com.stock.pojo;

public class LearnExperience {
    private String leUuid;

    private String leStart;

    private String leEnd;

    private String leSchool;

    private String leEdu;

    private String cooUuid;

    private String userUuid;

    public String getLeUuid() {
        return leUuid;
    }

    public void setLeUuid(String leUuid) {
        this.leUuid = leUuid == null ? null : leUuid.trim();
    }

    public String getLeStart() {
        return leStart;
    }

    public void setLeStart(String leStart) {
        this.leStart = leStart == null ? null : leStart.trim();
    }

    public String getLeEnd() {
        return leEnd;
    }

    public void setLeEnd(String leEnd) {
        this.leEnd = leEnd == null ? null : leEnd.trim();
    }

    public String getLeSchool() {
        return leSchool;
    }

    public void setLeSchool(String leSchool) {
        this.leSchool = leSchool == null ? null : leSchool.trim();
    }

    public String getLeEdu() {
        return leEdu;
    }

    public void setLeEdu(String leEdu) {
        this.leEdu = leEdu == null ? null : leEdu.trim();
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