package com.stock.pojo;

public class Innovation {
    private String innoUuid;

    private String innoLevel;

    private String innoDescription;

    private String innoProve;

    private String productUuid;

    public String getInnoUuid() {
        return innoUuid;
    }

    public void setInnoUuid(String innoUuid) {
        this.innoUuid = innoUuid == null ? null : innoUuid.trim();
    }

    public String getInnoLevel() {
        return innoLevel;
    }

    public void setInnoLevel(String innoLevel) {
        this.innoLevel = innoLevel == null ? null : innoLevel.trim();
    }

    public String getInnoDescription() {
        return innoDescription;
    }

    public void setInnoDescription(String innoDescription) {
        this.innoDescription = innoDescription == null ? null : innoDescription.trim();
    }

    public String getInnoProve() {
        return innoProve;
    }

    public void setInnoProve(String innoProve) {
        this.innoProve = innoProve == null ? null : innoProve.trim();
    }

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid == null ? null : productUuid.trim();
    }
}