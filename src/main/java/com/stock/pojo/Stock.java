package com.stock.pojo;

import java.util.Date;

public class Stock {
    private Integer stockId;

    private String stockCd;

    private String securities;

    private String listSectorId;

    private String listSector;

    private String transCurr;

    private String secShortName;

    private String secFullName;

    private String listStatus;

    private Date listDate;

    private Date delistDate;

    private String stockTypeId;

    private String stockType;

    private String marketCountry;

    private Integer partyId;

    private String totalShares;

    private String nonrestFloatShares;

    private String nonrestFloatCapitalStock;

    private String officeAddr;

    private String primeOperating;

    private Date endDate;

    private String totalEquity;

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCd() {
        return stockCd;
    }

    public void setStockCd(String stockCd) {
        this.stockCd = stockCd == null ? null : stockCd.trim();
    }

    public String getSecurities() {
        return securities;
    }

    public void setSecurities(String securities) {
        this.securities = securities == null ? null : securities.trim();
    }

    public String getListSectorId() {
        return listSectorId;
    }

    public void setListSectorId(String listSectorId) {
        this.listSectorId = listSectorId == null ? null : listSectorId.trim();
    }

    public String getListSector() {
        return listSector;
    }

    public void setListSector(String listSector) {
        this.listSector = listSector == null ? null : listSector.trim();
    }

    public String getTransCurr() {
        return transCurr;
    }

    public void setTransCurr(String transCurr) {
        this.transCurr = transCurr == null ? null : transCurr.trim();
    }

    public String getSecShortName() {
        return secShortName;
    }

    public void setSecShortName(String secShortName) {
        this.secShortName = secShortName == null ? null : secShortName.trim();
    }

    public String getSecFullName() {
        return secFullName;
    }

    public void setSecFullName(String secFullName) {
        this.secFullName = secFullName == null ? null : secFullName.trim();
    }

    public String getListStatus() {
        return listStatus;
    }

    public void setListStatus(String listStatus) {
        this.listStatus = listStatus == null ? null : listStatus.trim();
    }

    public Date getListDate() {
        return listDate;
    }

    public void setListDate(Date listDate) {
        this.listDate = listDate;
    }

    public Date getDelistDate() {
        return delistDate;
    }

    public void setDelistDate(Date delistDate) {
        this.delistDate = delistDate;
    }

    public String getStockTypeId() {
        return stockTypeId;
    }

    public void setStockTypeId(String stockTypeId) {
        this.stockTypeId = stockTypeId == null ? null : stockTypeId.trim();
    }

    public String getStockType() {
        return stockType;
    }

    public void setStockType(String stockType) {
        this.stockType = stockType == null ? null : stockType.trim();
    }

    public String getMarketCountry() {
        return marketCountry;
    }

    public void setMarketCountry(String marketCountry) {
        this.marketCountry = marketCountry == null ? null : marketCountry.trim();
    }

    public Integer getPartyId() {
        return partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public String getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(String totalShares) {
        this.totalShares = totalShares == null ? null : totalShares.trim();
    }

    public String getNonrestFloatShares() {
        return nonrestFloatShares;
    }

    public void setNonrestFloatShares(String nonrestFloatShares) {
        this.nonrestFloatShares = nonrestFloatShares == null ? null : nonrestFloatShares.trim();
    }

    public String getNonrestFloatCapitalStock() {
        return nonrestFloatCapitalStock;
    }

    public void setNonrestFloatCapitalStock(String nonrestFloatCapitalStock) {
        this.nonrestFloatCapitalStock = nonrestFloatCapitalStock == null ? null : nonrestFloatCapitalStock.trim();
    }

    public String getOfficeAddr() {
        return officeAddr;
    }

    public void setOfficeAddr(String officeAddr) {
        this.officeAddr = officeAddr == null ? null : officeAddr.trim();
    }

    public String getPrimeOperating() {
        return primeOperating;
    }

    public void setPrimeOperating(String primeOperating) {
        this.primeOperating = primeOperating == null ? null : primeOperating.trim();
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTotalEquity() {
        return totalEquity;
    }

    public void setTotalEquity(String totalEquity) {
        this.totalEquity = totalEquity == null ? null : totalEquity.trim();
    }
}