package com.stock.pojo;

public class Blog {
    private String blogId;

    private String blogTittle;

    private String blogAuthor;

    private String blogContent;

    private String blogClicknum;

    private String blogRenqi;

    private String blogDate;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBlogTittle() {
        return blogTittle;
    }

    public void setBlogTittle(String blogTittle) {
        this.blogTittle = blogTittle == null ? null : blogTittle.trim();
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor == null ? null : blogAuthor.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogClicknum() {
        return blogClicknum;
    }

    public void setBlogClicknum(String blogClicknum) {
        this.blogClicknum = blogClicknum == null ? null : blogClicknum.trim();
    }

    public String getBlogRenqi() {
        return blogRenqi;
    }

    public void setBlogRenqi(String blogRenqi) {
        this.blogRenqi = blogRenqi == null ? null : blogRenqi.trim();
    }

    public String getBlogDate() {
        return blogDate;
    }

    public void setBlogDate(String blogDate) {
        this.blogDate = blogDate == null ? null : blogDate.trim();
    }
}