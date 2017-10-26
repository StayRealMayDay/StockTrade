package com.stock.pojo;

public class SystemLog {
    private String sloguuid;

    private String slogdescription;

    private String slogmethod;

    private String slogtype;

    private String slogrequestip;

    private String slogexceptioncode;

    private String slogexceptiondetail;

    private String slogparams;

    private String slogcreateby;

    private String slogcreatedate;

    public String getSloguuid() {
        return sloguuid;
    }

    public void setSloguuid(String sloguuid) {
        this.sloguuid = sloguuid == null ? null : sloguuid.trim();
    }

    public String getSlogdescription() {
        return slogdescription;
    }

    public void setSlogdescription(String slogdescription) {
        this.slogdescription = slogdescription == null ? null : slogdescription.trim();
    }

    public String getSlogmethod() {
        return slogmethod;
    }

    public void setSlogmethod(String slogmethod) {
        this.slogmethod = slogmethod == null ? null : slogmethod.trim();
    }

    public String getSlogtype() {
        return slogtype;
    }

    public void setSlogtype(String slogtype) {
        this.slogtype = slogtype == null ? null : slogtype.trim();
    }

    public String getSlogrequestip() {
        return slogrequestip;
    }

    public void setSlogrequestip(String slogrequestip) {
        this.slogrequestip = slogrequestip == null ? null : slogrequestip.trim();
    }

    public String getSlogexceptioncode() {
        return slogexceptioncode;
    }

    public void setSlogexceptioncode(String slogexceptioncode) {
        this.slogexceptioncode = slogexceptioncode == null ? null : slogexceptioncode.trim();
    }

    public String getSlogexceptiondetail() {
        return slogexceptiondetail;
    }

    public void setSlogexceptiondetail(String slogexceptiondetail) {
        this.slogexceptiondetail = slogexceptiondetail == null ? null : slogexceptiondetail.trim();
    }

    public String getSlogparams() {
        return slogparams;
    }

    public void setSlogparams(String slogparams) {
        this.slogparams = slogparams == null ? null : slogparams.trim();
    }

    public String getSlogcreateby() {
        return slogcreateby;
    }

    public void setSlogcreateby(String slogcreateby) {
        this.slogcreateby = slogcreateby == null ? null : slogcreateby.trim();
    }

    public String getSlogcreatedate() {
        return slogcreatedate;
    }

    public void setSlogcreatedate(String slogcreatedate) {
        this.slogcreatedate = slogcreatedate == null ? null : slogcreatedate.trim();
    }
}