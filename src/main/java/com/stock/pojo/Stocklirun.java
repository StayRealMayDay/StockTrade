package com.stock.pojo;

public class Stocklirun {
    private Integer id;

    private String stockId;

    private String date;

    private String type;

    private String allcomein;

    private String comein;

    private String allyingyechengben;

    private String yingyechengben;

    private String alllirun;

    private String jinglirun;

    private String eachshouyi;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAllcomein() {
        return allcomein;
    }

    public void setAllcomein(String allcomein) {
        this.allcomein = allcomein == null ? null : allcomein.trim();
    }

    public String getComein() {
        return comein;
    }

    public void setComein(String comein) {
        this.comein = comein == null ? null : comein.trim();
    }

    public String getAllyingyechengben() {
        return allyingyechengben;
    }

    public void setAllyingyechengben(String allyingyechengben) {
        this.allyingyechengben = allyingyechengben == null ? null : allyingyechengben.trim();
    }

    public String getYingyechengben() {
        return yingyechengben;
    }

    public void setYingyechengben(String yingyechengben) {
        this.yingyechengben = yingyechengben == null ? null : yingyechengben.trim();
    }

    public String getAlllirun() {
        return alllirun;
    }

    public void setAlllirun(String alllirun) {
        this.alllirun = alllirun == null ? null : alllirun.trim();
    }

    public String getJinglirun() {
        return jinglirun;
    }

    public void setJinglirun(String jinglirun) {
        this.jinglirun = jinglirun == null ? null : jinglirun.trim();
    }

    public String getEachshouyi() {
        return eachshouyi;
    }

    public void setEachshouyi(String eachshouyi) {
        this.eachshouyi = eachshouyi == null ? null : eachshouyi.trim();
    }
}