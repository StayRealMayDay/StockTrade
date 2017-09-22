package com.stock.pojo;

public class Funding {
    private String fUuid;

    private String fBrief;

    private String fTeamRatio;

    private String fRiskRatio;

    private String fTechRatio;

    private String fGovernmentRatio;

    private String fEvalue;

    private String proUuid;

    public String getfUuid() {
        return fUuid;
    }

    public void setfUuid(String fUuid) {
        this.fUuid = fUuid == null ? null : fUuid.trim();
    }

    public String getfBrief() {
        return fBrief;
    }

    public void setfBrief(String fBrief) {
        this.fBrief = fBrief == null ? null : fBrief.trim();
    }

    public String getfTeamRatio() {
        return fTeamRatio;
    }

    public void setfTeamRatio(String fTeamRatio) {
        this.fTeamRatio = fTeamRatio == null ? null : fTeamRatio.trim();
    }

    public String getfRiskRatio() {
        return fRiskRatio;
    }

    public void setfRiskRatio(String fRiskRatio) {
        this.fRiskRatio = fRiskRatio == null ? null : fRiskRatio.trim();
    }

    public String getfTechRatio() {
        return fTechRatio;
    }

    public void setfTechRatio(String fTechRatio) {
        this.fTechRatio = fTechRatio == null ? null : fTechRatio.trim();
    }

    public String getfGovernmentRatio() {
        return fGovernmentRatio;
    }

    public void setfGovernmentRatio(String fGovernmentRatio) {
        this.fGovernmentRatio = fGovernmentRatio == null ? null : fGovernmentRatio.trim();
    }

    public String getfEvalue() {
        return fEvalue;
    }

    public void setfEvalue(String fEvalue) {
        this.fEvalue = fEvalue == null ? null : fEvalue.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}