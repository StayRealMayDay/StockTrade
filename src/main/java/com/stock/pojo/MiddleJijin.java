package com.stock.pojo;

public class MiddleJijin {
    private Integer id;

    private String jijinId;

    private String jijinName;

    private String chengliTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJijinId() {
        return jijinId;
    }

    public void setJijinId(String jijinId) {
        this.jijinId = jijinId == null ? null : jijinId.trim();
    }

    public String getJijinName() {
        return jijinName;
    }

    public void setJijinName(String jijinName) {
        this.jijinName = jijinName == null ? null : jijinName.trim();
    }

    public String getChengliTime() {
        return chengliTime;
    }

    public void setChengliTime(String chengliTime) {
        this.chengliTime = chengliTime == null ? null : chengliTime.trim();
    }
}