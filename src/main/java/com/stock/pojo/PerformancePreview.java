package com.stock.pojo;

public class PerformancePreview {
    private Integer id;

    private String stockCode;

    private String stockName;

    private String previewType;

    private String previewAbstract;

    private String previewAmplitude;

    private String netProfitUplimit;

    private String netProfitDownlimit;

    private String previewDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode == null ? null : stockCode.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getPreviewType() {
        return previewType;
    }

    public void setPreviewType(String previewType) {
        this.previewType = previewType == null ? null : previewType.trim();
    }

    public String getPreviewAbstract() {
        return previewAbstract;
    }

    public void setPreviewAbstract(String previewAbstract) {
        this.previewAbstract = previewAbstract == null ? null : previewAbstract.trim();
    }

    public String getPreviewAmplitude() {
        return previewAmplitude;
    }

    public void setPreviewAmplitude(String previewAmplitude) {
        this.previewAmplitude = previewAmplitude == null ? null : previewAmplitude.trim();
    }

    public String getNetProfitUplimit() {
        return netProfitUplimit;
    }

    public void setNetProfitUplimit(String netProfitUplimit) {
        this.netProfitUplimit = netProfitUplimit == null ? null : netProfitUplimit.trim();
    }

    public String getNetProfitDownlimit() {
        return netProfitDownlimit;
    }

    public void setNetProfitDownlimit(String netProfitDownlimit) {
        this.netProfitDownlimit = netProfitDownlimit == null ? null : netProfitDownlimit.trim();
    }

    public String getPreviewDate() {
        return previewDate;
    }

    public void setPreviewDate(String previewDate) {
        this.previewDate = previewDate == null ? null : previewDate.trim();
    }
}