package com.stock.pojo;

public class AuRole {
    private String auRoleUuid;

    private String auUuid;

    private String roleUuid;

    public String getAuRoleUuid() {
        return auRoleUuid;
    }

    public void setAuRoleUuid(String auRoleUuid) {
        this.auRoleUuid = auRoleUuid == null ? null : auRoleUuid.trim();
    }

    public String getAuUuid() {
        return auUuid;
    }

    public void setAuUuid(String auUuid) {
        this.auUuid = auUuid == null ? null : auUuid.trim();
    }

    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid == null ? null : roleUuid.trim();
    }
}