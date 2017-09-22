package com.stock.pojo;

public class EvaRecord {
    private String erUuid;

    private String erValue;

    private String projectUuid;

    private String productUuid;

    private String erOptionUuid;
    
    private String erInParent;
    
    private String erType;
    
    private String erEvaUuid;
    
    public String getErType() {
		return erType;
	}

	public void setErType(String erType) {
		this.erType = erType;
	}

	public String getErEvaUuid() {
		return erEvaUuid;
	}

	public void setErEvaUuid(String erEvaUuid) {
		this.erEvaUuid = erEvaUuid;
	}

	public String getErUuid() {
        return erUuid;
    }

    public void setErUuid(String erUuid) {
        this.erUuid = erUuid == null ? null : erUuid.trim();
    }

    public String getErValue() {
        return erValue;
    }

    public void setErValue(String erValue) {
        this.erValue = erValue == null ? null : erValue.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }

    public String getProductUuid() {
        return productUuid;
    }

    public void setProductUuid(String productUuid) {
        this.productUuid = productUuid == null ? null : productUuid.trim();
    }

	public String getErOptionUuid() {
		return erOptionUuid;
	}

	public void setErOptionUuid(String erOptionUuid) {
		this.erOptionUuid = erOptionUuid;
	}

	public String getErInParent() {
		return erInParent;
	}

	public void setErInParent(String erInParent) {
		this.erInParent = erInParent;
	}
    
}