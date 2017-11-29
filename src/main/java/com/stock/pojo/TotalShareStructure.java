package com.stock.pojo;

public class TotalShareStructure {
    private String id;

    private String stockId;

    private String date;

    private String stockTotal;

    private String stockATotal;

    private String stockCirculate;

    private String stockLimit;

    private String changeReason;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getStockTotal() {
        return stockTotal;
    }

    public void setStockTotal(String stockTotal) {
        this.stockTotal = stockTotal == null ? null : stockTotal.trim();
    }

    public String getStockATotal() {
        return stockATotal;
    }

    public void setStockATotal(String stockATotal) {
        this.stockATotal = stockATotal == null ? null : stockATotal.trim();
    }

    public String getStockCirculate() {
        return stockCirculate;
    }

    public void setStockCirculate(String stockCirculate) {
        this.stockCirculate = stockCirculate == null ? null : stockCirculate.trim();
    }

    public String getStockLimit() {
        return stockLimit;
    }

    public void setStockLimit(String stockLimit) {
        this.stockLimit = stockLimit == null ? null : stockLimit.trim();
    }

    public String getChangeReason() {
        return changeReason;
    }

    public void setChangeReason(String changeReason) {
        this.changeReason = changeReason == null ? null : changeReason.trim();
    }
}