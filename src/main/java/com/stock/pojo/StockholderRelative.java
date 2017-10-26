package com.stock.pojo;

public class StockholderRelative {
    private String stockholderRelativeid;

    private String stock;

    private String deadline;

    private String declarationDate;

    private String stockholderDeclare;

    private String stockholderTotal;

    private String stockholdAve;

    private String time;

    public String getStockholderRelativeid() {
        return stockholderRelativeid;
    }

    public void setStockholderRelativeid(String stockholderRelativeid) {
        this.stockholderRelativeid = stockholderRelativeid == null ? null : stockholderRelativeid.trim();
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock == null ? null : stock.trim();
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline == null ? null : deadline.trim();
    }

    public String getDeclarationDate() {
        return declarationDate;
    }

    public void setDeclarationDate(String declarationDate) {
        this.declarationDate = declarationDate == null ? null : declarationDate.trim();
    }

    public String getStockholderDeclare() {
        return stockholderDeclare;
    }

    public void setStockholderDeclare(String stockholderDeclare) {
        this.stockholderDeclare = stockholderDeclare == null ? null : stockholderDeclare.trim();
    }

    public String getStockholderTotal() {
        return stockholderTotal;
    }

    public void setStockholderTotal(String stockholderTotal) {
        this.stockholderTotal = stockholderTotal == null ? null : stockholderTotal.trim();
    }

    public String getStockholdAve() {
        return stockholdAve;
    }

    public void setStockholdAve(String stockholdAve) {
        this.stockholdAve = stockholdAve == null ? null : stockholdAve.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}