package com.stock.pojo;

public class PolicyRelation {
    private String polrUuid;

    private String polrName;

    private String polrFund;

    private String proUuid;

    private String psUuid;

    public String getPolrUuid() {
        return polrUuid;
    }

    public void setPolrUuid(String polrUuid) {
        this.polrUuid = polrUuid == null ? null : polrUuid.trim();
    }

    public String getPolrName() {
        return polrName;
    }

    public void setPolrName(String polrName) {
        this.polrName = polrName == null ? null : polrName.trim();
    }

    public String getPolrFund() {
        return polrFund;
    }

    public void setPolrFund(String polrFund) {
        this.polrFund = polrFund == null ? null : polrFund.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }

    public String getPsUuid() {
        return psUuid;
    }

    public void setPsUuid(String psUuid) {
        this.psUuid = psUuid == null ? null : psUuid.trim();
    }
}