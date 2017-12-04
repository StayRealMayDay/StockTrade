package com.stock.pojo;

public class Statistics {
    private Integer statisticsId;

    private String statisticsName;

    private Integer statisticsNum;

    public Integer getStatisticsId() {
        return statisticsId;
    }

    public void setStatisticsId(Integer statisticsId) {
        this.statisticsId = statisticsId;
    }

    public String getStatisticsName() {
        return statisticsName;
    }

    public void setStatisticsName(String statisticsName) {
        this.statisticsName = statisticsName == null ? null : statisticsName.trim();
    }

    public Integer getStatisticsNum() {
        return statisticsNum;
    }

    public void setStatisticsNum(Integer statisticsNum) {
        this.statisticsNum = statisticsNum;
    }
}