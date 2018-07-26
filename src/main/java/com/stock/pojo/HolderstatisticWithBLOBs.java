package com.stock.pojo;

public class HolderstatisticWithBLOBs extends Holderstatistic {
    private String havingStock;

    private String havingStockde;

    private String industryDalei;

    private String industryMenlei;

    private String daleiperfert;

    private String menleiperferct;

    public String getHavingStock() {
        return havingStock;
    }

    public void setHavingStock(String havingStock) {
        this.havingStock = havingStock == null ? null : havingStock.trim();
    }

    public String getHavingStockde() {
        return havingStockde;
    }

    public void setHavingStockde(String havingStockde) {
        this.havingStockde = havingStockde == null ? null : havingStockde.trim();
    }

    public String getIndustryDalei() {
        return industryDalei;
    }

    public void setIndustryDalei(String industryDalei) {
        this.industryDalei = industryDalei == null ? null : industryDalei.trim();
    }

    public String getIndustryMenlei() {
        return industryMenlei;
    }

    public void setIndustryMenlei(String industryMenlei) {
        this.industryMenlei = industryMenlei == null ? null : industryMenlei.trim();
    }

    public String getDaleiperfert() {
        return daleiperfert;
    }

    public void setDaleiperfert(String daleiperfert) {
        this.daleiperfert = daleiperfert == null ? null : daleiperfert.trim();
    }

    public String getMenleiperferct() {
        return menleiperferct;
    }

    public void setMenleiperferct(String menleiperferct) {
        this.menleiperferct = menleiperferct == null ? null : menleiperferct.trim();
    }
}