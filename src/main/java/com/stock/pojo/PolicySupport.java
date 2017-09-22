package com.stock.pojo;

public class PolicySupport {
    private String psUuid;

    private String psWay;

    private String psRank;

    private String psCategory;

    public String getPsUuid() {
        return psUuid;
    }

    public void setPsUuid(String psUuid) {
        this.psUuid = psUuid == null ? null : psUuid.trim();
    }

    public String getPsWay() {
        return psWay;
    }

    public void setPsWay(String psWay) {
        this.psWay = psWay == null ? null : psWay.trim();
    }

    public String getPsRank() {
        return psRank;
    }

    public void setPsRank(String psRank) {
        this.psRank = psRank == null ? null : psRank.trim();
    }

    public String getPsCategory() {
        return psCategory;
    }

    public void setPsCategory(String psCategory) {
        this.psCategory = psCategory == null ? null : psCategory.trim();
    }
}