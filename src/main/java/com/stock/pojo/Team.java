package com.stock.pojo;

public class Team {
    private String teamUuid;

    private String teamSize;

    private String teamLevel;

    private String teamStability;

    private String teamEvalue;

    private String projectUuid;

    public String getTeamUuid() {
        return teamUuid;
    }

    public void setTeamUuid(String teamUuid) {
        this.teamUuid = teamUuid == null ? null : teamUuid.trim();
    }

    public String getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(String teamSize) {
        this.teamSize = teamSize == null ? null : teamSize.trim();
    }

    public String getTeamLevel() {
        return teamLevel;
    }

    public void setTeamLevel(String teamLevel) {
        this.teamLevel = teamLevel == null ? null : teamLevel.trim();
    }

    public String getTeamStability() {
        return teamStability;
    }

    public void setTeamStability(String teamStability) {
        this.teamStability = teamStability == null ? null : teamStability.trim();
    }

    public String getTeamEvalue() {
        return teamEvalue;
    }

    public void setTeamEvalue(String teamEvalue) {
        this.teamEvalue = teamEvalue == null ? null : teamEvalue.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }
}