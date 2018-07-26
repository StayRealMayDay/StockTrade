package com.stock.pojo;

public class GuotaianToptenliutongholder {
    private Integer id;

    private String stockNum;

    private String stoptime;

    private String stockholdername;

    private String havingsum;

    private String gufenxingzhi;

    private String chigupaiming;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockNum() {
        return stockNum;
    }

    public void setStockNum(String stockNum) {
        this.stockNum = stockNum == null ? null : stockNum.trim();
    }

    public String getStoptime() {
        return stoptime;
    }

    public void setStoptime(String stoptime) {
        this.stoptime = stoptime == null ? null : stoptime.trim();
    }

    public String getStockholdername() {
        return stockholdername;
    }

    public void setStockholdername(String stockholdername) {
        this.stockholdername = stockholdername == null ? null : stockholdername.trim();
    }

    public String getHavingsum() {
        return havingsum;
    }

    public void setHavingsum(String havingsum) {
        this.havingsum = havingsum == null ? null : havingsum.trim();
    }

    public String getGufenxingzhi() {
        return gufenxingzhi;
    }

    public void setGufenxingzhi(String gufenxingzhi) {
        this.gufenxingzhi = gufenxingzhi == null ? null : gufenxingzhi.trim();
    }

    public String getChigupaiming() {
        return chigupaiming;
    }

    public void setChigupaiming(String chigupaiming) {
        this.chigupaiming = chigupaiming == null ? null : chigupaiming.trim();
    }
}