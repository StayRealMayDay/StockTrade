package com.stock.pojo;

public class EvaOption {
    private String opUuid;

    private String opName;

    private String opValue;

    private String inUuid;

    public String getOpUuid() {
        return opUuid;
    }

    public void setOpUuid(String opUuid) {
        this.opUuid = opUuid == null ? null : opUuid.trim();
    }

    public String getOpName() {
        return opName;
    }

    public void setOpName(String opName) {
        this.opName = opName == null ? null : opName.trim();
    }

    public String getOpValue() {
        return opValue;
    }

    public void setOpValue(String opValue) {
        this.opValue = opValue == null ? null : opValue.trim();
    }

    public String getInUuid() {
        return inUuid;
    }

    public void setInUuid(String inUuid) {
        this.inUuid = inUuid == null ? null : inUuid.trim();
    }
}