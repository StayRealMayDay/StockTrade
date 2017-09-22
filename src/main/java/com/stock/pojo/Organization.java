package com.stock.pojo;

public class Organization {
    private String organUuid;

    private String companyName;

    private String companyType;

    private String registerFund;

    private String registerPlace;

    private String organEvalue;

    private String proUuid;

    public String getOrganUuid() {
        return organUuid;
    }

    public void setOrganUuid(String organUuid) {
        this.organUuid = organUuid == null ? null : organUuid.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType == null ? null : companyType.trim();
    }

    public String getRegisterFund() {
        return registerFund;
    }

    public void setRegisterFund(String registerFund) {
        this.registerFund = registerFund == null ? null : registerFund.trim();
    }

    public String getRegisterPlace() {
        return registerPlace;
    }

    public void setRegisterPlace(String registerPlace) {
        this.registerPlace = registerPlace == null ? null : registerPlace.trim();
    }

    public String getOrganEvalue() {
        return organEvalue;
    }

    public void setOrganEvalue(String organEvalue) {
        this.organEvalue = organEvalue == null ? null : organEvalue.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}