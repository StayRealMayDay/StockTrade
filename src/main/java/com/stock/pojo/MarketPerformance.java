package com.stock.pojo;

public class MarketPerformance {
    private Integer id;

    private String industryName;

    private String oneWeek;

    private String oneMonth;

    private String threeMonth;

    private String currentYear;

    private String oneYear;

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

    public String getOneWeek() {
        return oneWeek;
    }

    public void setOneWeek(String oneWeek) {
        this.oneWeek = oneWeek == null ? null : oneWeek.trim();
    }

    public String getOneMonth() {
        return oneMonth;
    }

    public void setOneMonth(String oneMonth) {
        this.oneMonth = oneMonth == null ? null : oneMonth.trim();
    }

    public String getThreeMonth() {
        return threeMonth;
    }

    public void setThreeMonth(String threeMonth) {
        this.threeMonth = threeMonth == null ? null : threeMonth.trim();
    }

    public String getCurrentYear() {
        return currentYear;
    }

    public void setCurrentYear(String currentYear) {
        this.currentYear = currentYear == null ? null : currentYear.trim();
    }

    public String getOneYear() {
        return oneYear;
    }

    public void setOneYear(String oneYear) {
        this.oneYear = oneYear == null ? null : oneYear.trim();
    }
}