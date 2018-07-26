package com.stock.pojo;

public class HolderyearstatisticWithBLOBs extends Holderyearstatistic {
    private String stockde;

    private String stock;

    private String industrydalei;

    private String industrydaleide;

    private String industrymenlei;

    private String industrymenleide;

    private String stockareade;

    private String stockarea;

    public String getStockde() {
        return stockde;
    }

    public void setStockde(String stockde) {
        this.stockde = stockde == null ? null : stockde.trim();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public String getIndustrydalei() {
        return industrydalei;
    }

    public void setIndustrydalei(String industrydalei) {
        this.industrydalei = industrydalei == null ? null : industrydalei.trim();
    }

    public String getIndustrydaleide() {
        return industrydaleide;
    }

    public void setIndustrydaleide(String industrydaleide) {
        this.industrydaleide = industrydaleide == null ? null : industrydaleide.trim();
    }

    public String getIndustrymenlei() {
        return industrymenlei;
    }

    public void setIndustrymenlei(String industrymenlei) {
        this.industrymenlei = industrymenlei == null ? null : industrymenlei.trim();
    }

    public String getIndustrymenleide() {
        return industrymenleide;
    }

    public void setIndustrymenleide(String industrymenleide) {
        this.industrymenleide = industrymenleide == null ? null : industrymenleide.trim();
    }

    public String getStockareade() {
        return stockareade;
    }

    public void setStockareade(String stockareade) {
        this.stockareade = stockareade == null ? null : stockareade.trim();
    }

    public String getStockarea() {
        return stockarea;
    }

    public void setStockarea(String stockarea) {
        this.stockarea = stockarea == null ? null : stockarea.trim();
    }
}