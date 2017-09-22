package com.stock.pojo;

public class Market {
    private String maUuid;

    private String maCharacter;

    private String maConsumplevel;

    private String maConsumpsize;

    private String maGeneral;

    private String maProspect;

    private String maEnvironment;

    private String productUuid;

    public String getMaUuid() {
        return maUuid;
    }

    public void setMaUuid(String maUuid) {
        this.maUuid = maUuid == null ? null : maUuid.trim();
    }

    public String getMaCharacter() {
        return maCharacter;
    }

    public void setMaCharacter(String maCharacter) {
        this.maCharacter = maCharacter == null ? null : maCharacter.trim();
    }

    public String getMaConsumplevel() {
        return maConsumplevel;
    }

    public void setMaConsumplevel(String maConsumplevel) {
        this.maConsumplevel = maConsumplevel == null ? null : maConsumplevel.trim();
    }

    public String getMaConsumpsize() {
        return maConsumpsize;
    }

    public void setMaConsumpsize(String maConsumpsize) {
        this.maConsumpsize = maConsumpsize == null ? null : maConsumpsize.trim();
    }

    public String getMaGeneral() {
        return maGeneral;
    }

    public void setMaGeneral(String maGeneral) {
        this.maGeneral = maGeneral == null ? null : maGeneral.trim();
    }

    public String getMaProspect() {
        return maProspect;
    }

    public void setMaProspect(String maProspect) {
        this.maProspect = maProspect == null ? null : maProspect.trim();
    }

    public String getMaEnvironment() {
        return maEnvironment;
    }

    public void setMaEnvironment(String maEnvironment) {
        this.maEnvironment = maEnvironment == null ? null : maEnvironment.trim();
    }

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid == null ? null : productUuid.trim();
    }
}