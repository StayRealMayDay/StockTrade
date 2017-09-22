package com.stock.pojo;

public class Indicator {
    private String inUuid;

    private String inName;

    private String inOptiontype;

    private String inOptioncategory;

    private String inFlag;

    private String inParent;

    private String inLevel;

    private String inWeight;

    private String inBenchmark;

    public String getInUuid() {
        return inUuid;
    }

    public void setInUuid(String inUuid) {
        this.inUuid = inUuid == null ? null : inUuid.trim();
    }

    public String getInName() {
        return inName;
    }

    public void setInName(String inName) {
        this.inName = inName == null ? null : inName.trim();
    }

    public String getInOptiontype() {
        return inOptiontype;
    }

    public void setInOptiontype(String inOptiontype) {
        this.inOptiontype = inOptiontype == null ? null : inOptiontype.trim();
    }

    public String getInOptioncategory() {
        return inOptioncategory;
    }

    public void setInOptioncategory(String inOptioncategory) {
        this.inOptioncategory = inOptioncategory == null ? null : inOptioncategory.trim();
    }

    public String getInFlag() {
        return inFlag;
    }

    public void setInFlag(String inFlag) {
        this.inFlag = inFlag == null ? null : inFlag.trim();
    }

    public String getInParent() {
        return inParent;
    }

    public void setInParent(String inParent) {
        this.inParent = inParent == null ? null : inParent.trim();
    }

    public String getInLevel() {
        return inLevel;
    }

    public void setInLevel(String inLevel) {
        this.inLevel = inLevel == null ? null : inLevel.trim();
    }

    public String getInWeight() {
        return inWeight;
    }

    public void setInWeight(String inWeight) {
        this.inWeight = inWeight == null ? null : inWeight.trim();
    }

    public String getInBenchmark() {
        return inBenchmark;
    }

    public void setInBenchmark(String inBenchmark) {
        this.inBenchmark = inBenchmark == null ? null : inBenchmark.trim();
    }
}