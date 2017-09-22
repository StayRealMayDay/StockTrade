package com.stock.pojo;

public class FileRelation {
    private String frUuid;

    private String fileUuid;

    private String objectUuid;
    
    private String type;
    
    @Override
	public String toString(){
		
		return "\n FileRelation [frUuid=" + frUuid
				+ ", fileUuid=" + fileUuid
				+ ", objectUuid=" + objectUuid
				+ ", type=" + type
				+ "]";
	}

    public String getFrUuid() {
        return frUuid;
    }

    public void setFrUuid(String frUuid) {
        this.frUuid = frUuid == null ? null : frUuid.trim();
    }

    public String getFileUuid() {
        return fileUuid;
    }

    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid == null ? null : fileUuid.trim();
    }

    public String getObjectUuid() {
        return objectUuid;
    }

    public void setObjectUuid(String objectUuid) {
        this.objectUuid = objectUuid == null ? null : objectUuid.trim();
    }

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
}