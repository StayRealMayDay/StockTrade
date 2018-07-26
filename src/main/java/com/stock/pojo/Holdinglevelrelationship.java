package com.stock.pojo;

public class Holdinglevelrelationship {
    private String id;

    private String stockId;

    private String controlshareholder;

    private String controlshareholderinfor;

    private String actualcontroller;

    private String actualcontrollerinfor;

    private String finalcontrol;

    private String finalcontrolinfor;

    private String institutionnamefrom;

    private String institutionnameto;

    private String holdvalue;

    private String time;

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

    public String getControlshareholder() {
        return controlshareholder;
    }

    public void setControlshareholder(String controlshareholder) {
        this.controlshareholder = controlshareholder == null ? null : controlshareholder.trim();
    }

    public String getControlshareholderinfor() {
        return controlshareholderinfor;
    }

    public void setControlshareholderinfor(String controlshareholderinfor) {
        this.controlshareholderinfor = controlshareholderinfor == null ? null : controlshareholderinfor.trim();
    }

    public String getActualcontroller() {
        return actualcontroller;
    }

    public void setActualcontroller(String actualcontroller) {
        this.actualcontroller = actualcontroller == null ? null : actualcontroller.trim();
    }

    public String getActualcontrollerinfor() {
        return actualcontrollerinfor;
    }

    public void setActualcontrollerinfor(String actualcontrollerinfor) {
        this.actualcontrollerinfor = actualcontrollerinfor == null ? null : actualcontrollerinfor.trim();
    }

    public String getFinalcontrol() {
        return finalcontrol;
    }

    public void setFinalcontrol(String finalcontrol) {
        this.finalcontrol = finalcontrol == null ? null : finalcontrol.trim();
    }

    public String getFinalcontrolinfor() {
        return finalcontrolinfor;
    }

    public void setFinalcontrolinfor(String finalcontrolinfor) {
        this.finalcontrolinfor = finalcontrolinfor == null ? null : finalcontrolinfor.trim();
    }

    public String getInstitutionnamefrom() {
        return institutionnamefrom;
    }

    public void setInstitutionnamefrom(String institutionnamefrom) {
        this.institutionnamefrom = institutionnamefrom == null ? null : institutionnamefrom.trim();
    }

    public String getInstitutionnameto() {
        return institutionnameto;
    }

    public void setInstitutionnameto(String institutionnameto) {
        this.institutionnameto = institutionnameto == null ? null : institutionnameto.trim();
    }

    public String getHoldvalue() {
        return holdvalue;
    }

    public void setHoldvalue(String holdvalue) {
        this.holdvalue = holdvalue == null ? null : holdvalue.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }
}