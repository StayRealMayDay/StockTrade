package com.stock.pojo;

public class DataDictionary {
    private Integer ddId;

    private String ddDatatype;

    private String ddValue;

    public Integer getDdId() {
        return ddId;
    }

    public void setDdId(Integer ddId) {
        this.ddId = ddId;
    }

    public String getDdDatatype() {
        return ddDatatype;
    }

    public void setDdDatatype(String ddDatatype) {
        this.ddDatatype = ddDatatype == null ? null : ddDatatype.trim();
    }

    public String getDdValue() {
        return ddValue;
    }

    public void setDdValue(String ddValue) {
        this.ddValue = ddValue == null ? null : ddValue.trim();
    }
}