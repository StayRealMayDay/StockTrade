package com.stock.pojo;

public class UserRole {
    private String userRoleUuid;

    private String userUuid;

    private String roleUuid;

    public String getUserRoleUuid() {
        return userRoleUuid;
    }

    public void setUserRoleUuid(String userRoleUuid) {
        this.userRoleUuid = userRoleUuid == null ? null : userRoleUuid.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getRoleUuid() {
        return roleUuid;
    }

    public void setRoleUuid(String roleUuid) {
        this.roleUuid = roleUuid == null ? null : roleUuid.trim();
    }
}