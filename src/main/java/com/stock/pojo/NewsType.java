package com.stock.pojo;

public class NewsType {
    private String newsTypeId;

    private String newTypeName;

    private String newsTypeRemark;

    private Integer newsTypeNum;

    private String flag;

    public String getNewsTypeId() {
        return newsTypeId;
    }

    public void setNewsTypeId(String newsTypeId) {
        this.newsTypeId = newsTypeId == null ? null : newsTypeId.trim();
    }

    public String getNewTypeName() {
        return newTypeName;
    }

    public void setNewTypeName(String newTypeName) {
        this.newTypeName = newTypeName == null ? null : newTypeName.trim();
    }

    public String getNewsTypeRemark() {
        return newsTypeRemark;
    }

    public void setNewsTypeRemark(String newsTypeRemark) {
        this.newsTypeRemark = newsTypeRemark == null ? null : newsTypeRemark.trim();
    }

    public Integer getNewsTypeNum() {
        return newsTypeNum;
    }

    public void setNewsTypeNum(Integer newsTypeNum) {
        this.newsTypeNum = newsTypeNum;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}