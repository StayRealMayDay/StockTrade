package com.stock.pojo;

public class Holderyearstatistic {
    private Integer id;

    private Integer num;

    private String stockholder;

    private String year;

    private Integer industrydaleisum;

    private Integer industrymenleisum;

    private Float hurate;

    private Float shenrate;

    private Integer xingweisum;

    private Integer stocksum;

    private String sumtouzixingwei;

    private String sumstockgeshu;

    private String sumofmenlei;

    private String sumofdalei;

    private String threeproprorty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getStockholder() {
        return stockholder;
    }

    public void setStockholder(String stockholder) {
        this.stockholder = stockholder == null ? null : stockholder.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public Integer getIndustrydaleisum() {
        return industrydaleisum;
    }

    public void setIndustrydaleisum(Integer industrydaleisum) {
        this.industrydaleisum = industrydaleisum;
    }

    public Integer getIndustrymenleisum() {
        return industrymenleisum;
    }

    public void setIndustrymenleisum(Integer industrymenleisum) {
        this.industrymenleisum = industrymenleisum;
    }

    public Float getHurate() {
        return hurate;
    }

    public void setHurate(Float hurate) {
        this.hurate = hurate;
    }

    public Float getShenrate() {
        return shenrate;
    }

    public void setShenrate(Float shenrate) {
        this.shenrate = shenrate;
    }

    public Integer getXingweisum() {
        return xingweisum;
    }

    public void setXingweisum(Integer xingweisum) {
        this.xingweisum = xingweisum;
    }

    public Integer getStocksum() {
        return stocksum;
    }

    public void setStocksum(Integer stocksum) {
        this.stocksum = stocksum;
    }

    public String getSumtouzixingwei() {
        return sumtouzixingwei;
    }

    public void setSumtouzixingwei(String sumtouzixingwei) {
        this.sumtouzixingwei = sumtouzixingwei == null ? null : sumtouzixingwei.trim();
    }

    public String getSumstockgeshu() {
        return sumstockgeshu;
    }

    public void setSumstockgeshu(String sumstockgeshu) {
        this.sumstockgeshu = sumstockgeshu == null ? null : sumstockgeshu.trim();
    }

    public String getSumofmenlei() {
        return sumofmenlei;
    }

    public void setSumofmenlei(String sumofmenlei) {
        this.sumofmenlei = sumofmenlei == null ? null : sumofmenlei.trim();
    }

    public String getSumofdalei() {
        return sumofdalei;
    }

    public void setSumofdalei(String sumofdalei) {
        this.sumofdalei = sumofdalei == null ? null : sumofdalei.trim();
    }

    public String getThreeproprorty() {
        return threeproprorty;
    }

    public void setThreeproprorty(String threeproprorty) {
        this.threeproprorty = threeproprorty == null ? null : threeproprorty.trim();
    }
}