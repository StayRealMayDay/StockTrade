package com.stock.pojo;

public class Product {
    private String productUuid;

    private String pdName;

    private String pdType;

    private String pdPractical;

    private String pdPrinciple;

    private String pdDescription;

    private String pdBusinessmodel;

    private String pdTechnology;

    private String pdMarket;

    private String pdInnovation;

    private String pdUrl;

    private String pdEvalue;

    private String pdProtime;

    private String userUuid;

    private String projectUuid;

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid == null ? null : productUuid.trim();
    }

    public String getPdName() {
        return pdName;
    }

    public void setPdName(String pdName) {
        this.pdName = pdName == null ? null : pdName.trim();
    }

    public String getPdType() {
        return pdType;
    }

    public void setPdType(String pdType) {
        this.pdType = pdType == null ? null : pdType.trim();
    }

    public String getPdPractical() {
        return pdPractical;
    }

    public void setPdPractical(String pdPractical) {
        this.pdPractical = pdPractical == null ? null : pdPractical.trim();
    }

    public String getPdPrinciple() {
        return pdPrinciple;
    }

    public void setPdPrinciple(String pdPrinciple) {
        this.pdPrinciple = pdPrinciple == null ? null : pdPrinciple.trim();
    }

    public String getPdDescription() {
        return pdDescription;
    }

    public void setPdDescription(String pdDescription) {
        this.pdDescription = pdDescription == null ? null : pdDescription.trim();
    }

    public String getPdBusinessmodel() {
        return pdBusinessmodel;
    }

    public void setPdBusinessmodel(String pdBusinessmodel) {
        this.pdBusinessmodel = pdBusinessmodel == null ? null : pdBusinessmodel.trim();
    }

    public String getPdTechnology() {
        return pdTechnology;
    }

    public void setPdTechnology(String pdTechnology) {
        this.pdTechnology = pdTechnology == null ? null : pdTechnology.trim();
    }

    public String getPdMarket() {
        return pdMarket;
    }

    public void setPdMarket(String pdMarket) {
        this.pdMarket = pdMarket == null ? null : pdMarket.trim();
    }

    public String getPdInnovation() {
        return pdInnovation;
    }

    public void setPdInnovation(String pdInnovation) {
        this.pdInnovation = pdInnovation == null ? null : pdInnovation.trim();
    }

    public String getPdUrl() {
        return pdUrl;
    }

    public void setPdUrl(String pdUrl) {
        this.pdUrl = pdUrl == null ? null : pdUrl.trim();
    }

    public String getPdEvalue() {
        return pdEvalue;
    }

    public void setPdEvalue(String pdEvalue) {
        this.pdEvalue = pdEvalue == null ? null : pdEvalue.trim();
    }

    public String getPdProtime() {
        return pdProtime;
    }

    public void setPdProtime(String pdProtime) {
        this.pdProtime = pdProtime == null ? null : pdProtime.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }
}