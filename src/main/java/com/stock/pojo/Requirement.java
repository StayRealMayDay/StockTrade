package com.stock.pojo;

public class Requirement {
    private String reqUuid;

    private String reqName;

    private String reqBrief;

    private String reqContent;

    private String reqProtime;

    private String reqEmail;

    private String reqPhone;
    
    private String reqMoney;

    private String userUuid;

    public String getReqUuid() {
        return reqUuid;
    }

    public void setReqUuid(String reqUuid) {
        this.reqUuid = reqUuid == null ? null : reqUuid.trim();
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName == null ? null : reqName.trim();
    }

    public String getReqBrief() {
        return reqBrief;
    }

    public void setReqBrief(String reqBrief) {
        this.reqBrief = reqBrief == null ? null : reqBrief.trim();
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent == null ? null : reqContent.trim();
    }

    public String getReqProtime() {
        return reqProtime;
    }

    public void setReqProtime(String reqProtime) {
        this.reqProtime = reqProtime == null ? null : reqProtime.trim();
    }

    public String getReqEmail() {
        return reqEmail;
    }

    public void setReqEmail(String reqEmail) {
        this.reqEmail = reqEmail == null ? null : reqEmail.trim();
    }

    public String getReqPhone() {
        return reqPhone;
    }

    public void setReqPhone(String reqPhone) {
        this.reqPhone = reqPhone == null ? null : reqPhone.trim();
    }
    
    public String getReqMoney() {
        return reqMoney;
    }

    public void setReqMoney(String reqMoney) {
        this.reqMoney = reqMoney == null ? null : reqMoney.trim();
    }
    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }
}