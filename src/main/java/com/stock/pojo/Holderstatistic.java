package com.stock.pojo;

public class Holderstatistic {
    private Integer id;

    private String stockholder;

    private String earliytime;

    private String earlyyear;

    private String latesttime;

    private String lateyear;

    private Integer sumtouzixingwei;

    private Integer sumstockgeshu;

    private Integer sumofdalei;

    private Integer sumofmenlei;

    private String diquinfo;

    private String holderproporty;

    private String threeproprorty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockholder() {
        return stockholder;
    }

    public void setStockholder(String stockholder) {
        this.stockholder = stockholder == null ? null : stockholder.trim();
    }

    public String getEarliytime() {
        return earliytime;
    }

    public void setEarliytime(String earliytime) {
        this.earliytime = earliytime == null ? null : earliytime.trim();
    }

    public String getEarlyyear() {
        return earlyyear;
    }

    public void setEarlyyear(String earlyyear) {
        this.earlyyear = earlyyear == null ? null : earlyyear.trim();
    }

    public String getLatesttime() {
        return latesttime;
    }

    public void setLatesttime(String latesttime) {
        this.latesttime = latesttime == null ? null : latesttime.trim();
    }

    public String getLateyear() {
        return lateyear;
    }

    public void setLateyear(String lateyear) {
        this.lateyear = lateyear == null ? null : lateyear.trim();
    }

    public Integer getSumtouzixingwei() {
        return sumtouzixingwei;
    }

    public void setSumtouzixingwei(Integer sumtouzixingwei) {
        this.sumtouzixingwei = sumtouzixingwei;
    }

    public Integer getSumstockgeshu() {
        return sumstockgeshu;
    }

    public void setSumstockgeshu(Integer sumstockgeshu) {
        this.sumstockgeshu = sumstockgeshu;
    }

    public Integer getSumofdalei() {
        return sumofdalei;
    }

    public void setSumofdalei(Integer sumofdalei) {
        this.sumofdalei = sumofdalei;
    }

    public Integer getSumofmenlei() {
        return sumofmenlei;
    }

    public void setSumofmenlei(Integer sumofmenlei) {
        this.sumofmenlei = sumofmenlei;
    }

    public String getDiquinfo() {
        return diquinfo;
    }

    public void setDiquinfo(String diquinfo) {
        this.diquinfo = diquinfo == null ? null : diquinfo.trim();
    }

    public String getHolderproporty() {
        return holderproporty;
    }

    public void setHolderproporty(String holderproporty) {
        this.holderproporty = holderproporty == null ? null : holderproporty.trim();
    }

    public String getThreeproprorty() {
        return threeproprorty;
    }

    public void setThreeproprorty(String threeproprorty) {
        this.threeproprorty = threeproprorty == null ? null : threeproprorty.trim();
    }
}