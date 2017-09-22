package com.stock.pojo;

public class Relation {
    private String reUuid;

    private String reType;

    private String projectUuid;

    private String userUuid;

    private String reOperation;
    
    private String reTime;
    
    private String reqUuid;

    public String getReUuid() {
        return reUuid;
    }

    public void setReUuid(String reUuid) {
        this.reUuid = reUuid == null ? null : reUuid.trim();
    }

    public String getReType() {
        return reType;
    }

    public void setReType(String reType) {
        this.reType = reType == null ? null : reType.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }

    public String getReOperation() {
        return reOperation;
    }

    public void setReOperation(String reOperation) {
        this.reOperation = reOperation == null ? null : reOperation.trim();
    }

	public String getReTime() {
		return reTime;
	}

	public void setReTime(String reTime) {
		this.reTime = reTime == null ? null : reTime.trim();
	}

	public String getReqUuid() {
		return reqUuid;
	}

	public void setReqUuid(String reqUuid) {
		this.reqUuid = reqUuid;
	}
}