package com.stock.pojo;

public class AssetEva {
    private String aeUuid;

    private String aeTime;

    private String aeSellShare;

    private String aeInvestFund;

    private String aePerShare;

    private String proUuid;

    public String getAeUuid() {
        return aeUuid;
    }

    public void setAeUuid(String aeUuid) {
        this.aeUuid = aeUuid == null ? null : aeUuid.trim();
    }

    public String getAeTime() {
        return aeTime;
    }

    public void setAeTime(String aeTime) {
        this.aeTime = aeTime == null ? null : aeTime.trim();
    }

    public String getAeSellShare() {
        return aeSellShare;
    }

    public void setAeSellShare(String aeSellShare) {
        this.aeSellShare = aeSellShare == null ? null : aeSellShare.trim();
    }

    public String getAeInvestFund() {
        return aeInvestFund;
    }

    public void setAeInvestFund(String aeInvestFund) {
        this.aeInvestFund = aeInvestFund == null ? null : aeInvestFund.trim();
    }

    public String getAePerShare() {
        return aePerShare;
    }

    public void setAePerShare(String aePerShare) {
        this.aePerShare = aePerShare == null ? null : aePerShare.trim();
    }

    public String getProUuid() {
        return proUuid;
    }

    public void setProUuid(String proUuid) {
        this.proUuid = proUuid == null ? null : proUuid.trim();
    }
}