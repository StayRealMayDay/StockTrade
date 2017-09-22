package com.stock.pojo;

public class News {
    private String newsUuid;

    private String newsTitle;

    private String newsContent;

    private String newsTime;

    private String newsOrigin;

    private String newsAuthor;

    private String newsHot;

    private String newsType;

    public String getNewsUuid() {
        return newsUuid;
    }

    public void setNewsUuid(String newsUuid) {
        this.newsUuid = newsUuid == null ? null : newsUuid.trim();
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNewsTime() {
        return newsTime;
    }

    public void setNewsTime(String newsTime) {
        this.newsTime = newsTime == null ? null : newsTime.trim();
    }

    public String getNewsOrigin() {
        return newsOrigin;
    }

    public void setNewsOrigin(String newsOrigin) {
        this.newsOrigin = newsOrigin == null ? null : newsOrigin.trim();
    }

    public String getNewsAuthor() {
        return newsAuthor;
    }

    public void setNewsAuthor(String newsAuthor) {
        this.newsAuthor = newsAuthor == null ? null : newsAuthor.trim();
    }

    public String getNewsHot() {
        return newsHot;
    }

    public void setNewsHot(String newsHot) {
        this.newsHot = newsHot == null ? null : newsHot.trim();
    }

    public String getNewsType() {
        return newsType;
    }

    public void setNewsType(String newsType) {
        this.newsType = newsType == null ? null : newsType.trim();
    }
}