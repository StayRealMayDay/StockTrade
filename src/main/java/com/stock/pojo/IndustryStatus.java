package com.stock.pojo;

public class IndustryStatus {
    private Integer id;

    private String industryName;

    private String pe;

    private String roeAve;

    private String peTtm;

    private String peForecast;

    private String pb;

    private String ps;

    private String roeDiluted;

    private String roa;

    private String revenueIncreaseRate;

    private String netprofitGrowthRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustryName() {
        return industryName;
    }

    public void setIndustryName(String industryName) {
        this.industryName = industryName == null ? null : industryName.trim();
    }

    public String getPe() {
        return pe;
    }

    public void setPe(String pe) {
        this.pe = pe == null ? null : pe.trim();
    }

    public String getRoeAve() {
        return roeAve;
    }

    public void setRoeAve(String roeAve) {
        this.roeAve = roeAve == null ? null : roeAve.trim();
    }

    public String getPeTtm() {
        return peTtm;
    }

    public void setPeTtm(String peTtm) {
        this.peTtm = peTtm == null ? null : peTtm.trim();
    }

    public String getPeForecast() {
        return peForecast;
    }

    public void setPeForecast(String peForecast) {
        this.peForecast = peForecast == null ? null : peForecast.trim();
    }

    public String getPb() {
        return pb;
    }

    public void setPb(String pb) {
        this.pb = pb == null ? null : pb.trim();
    }

    public String getPs() {
        return ps;
    }

    public void setPs(String ps) {
        this.ps = ps == null ? null : ps.trim();
    }

    public String getRoeDiluted() {
        return roeDiluted;
    }

    public void setRoeDiluted(String roeDiluted) {
        this.roeDiluted = roeDiluted == null ? null : roeDiluted.trim();
    }

    public String getRoa() {
        return roa;
    }

    public void setRoa(String roa) {
        this.roa = roa == null ? null : roa.trim();
    }

    public String getRevenueIncreaseRate() {
        return revenueIncreaseRate;
    }

    public void setRevenueIncreaseRate(String revenueIncreaseRate) {
        this.revenueIncreaseRate = revenueIncreaseRate == null ? null : revenueIncreaseRate.trim();
    }

    public String getNetprofitGrowthRate() {
        return netprofitGrowthRate;
    }

    public void setNetprofitGrowthRate(String netprofitGrowthRate) {
        this.netprofitGrowthRate = netprofitGrowthRate == null ? null : netprofitGrowthRate.trim();
    }
}