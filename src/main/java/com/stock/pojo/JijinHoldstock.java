package com.stock.pojo;

public class JijinHoldstock {
    private Integer id;

    private String stockId;

    private String datestop;

    private String jijinId;

    private String jijinName;

    private String guanlicompany;

    private String holdstocknum;

    private String holdestockrate;

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

    public String getDatestop() {
        return datestop;
    }

    public void setDatestop(String datestop) {
        this.datestop = datestop == null ? null : datestop.trim();
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

    public String getGuanlicompany() {
        return guanlicompany;
    }

    public void setGuanlicompany(String guanlicompany) {
        this.guanlicompany = guanlicompany == null ? null : guanlicompany.trim();
    }

    public String getHoldstocknum() {
        return holdstocknum;
    }

    public void setHoldstocknum(String holdstocknum) {
        this.holdstocknum = holdstocknum == null ? null : holdstocknum.trim();
    }

    public String getHoldestockrate() {
        return holdestockrate;
    }

    public void setHoldestockrate(String holdestockrate) {
        this.holdestockrate = holdestockrate == null ? null : holdestockrate.trim();
    }
}