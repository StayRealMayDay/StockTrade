package com.stock.pojo;

public class Newtopcirculation {
    private String id;

    private String stockNum;

    private String date;

    private String stockholdername;

    private String ratio;

    private String nowhaving;

    private String changebefore;

    private String time;

    private String jijinId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getStockholdername() {
        return stockholdername;
    }

    public void setStockholdername(String stockholdername) {
        this.stockholdername = stockholdername == null ? null : stockholdername.trim();
    }

    public String getRatio() {
        return ratio;
    }

    public void setRatio(String ratio) {
        this.ratio = ratio == null ? null : ratio.trim();
    }

    public String getNowhaving() {
        return nowhaving;
    }

    public void setNowhaving(String nowhaving) {
        this.nowhaving = nowhaving == null ? null : nowhaving.trim();
    }

    public String getChangebefore() {
        return changebefore;
    }

    public void setChangebefore(String changebefore) {
        this.changebefore = changebefore == null ? null : changebefore.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getJijinId() {
        return jijinId;
    }

    public void setJijinId(String jijinId) {
        this.jijinId = jijinId == null ? null : jijinId.trim();
    }
}