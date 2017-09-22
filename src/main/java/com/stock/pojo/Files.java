package com.stock.pojo;

public class Files {
    private String fileUuid;

    private String fileType;

    private String fileName;

    private String fileUrl;

    private String fileSize;

    private String fileTime;

    private String userUuid;
    
    @Override
	public String toString(){
		
		return "\n Files [fileUuid=" + fileUuid
				+ ", fileType=" + fileType
				+ ", fileName=" + fileName
				+ ", fileUrl=" + fileUrl
				+ ", fileSize=" + fileSize
				+ ", fileTime=" + fileTime
				+ ", userUuid=" + userUuid
				+ "]";
	}

    public String getFileUuid() {
        return fileUuid;
    }

    public void setFileUuid(String fileUuid) {
        this.fileUuid = fileUuid == null ? null : fileUuid.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl == null ? null : fileUrl.trim();
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFileTime() {
        return fileTime;
    }

    public void setFileTime(String fileTime) {
        this.fileTime = fileTime == null ? null : fileTime.trim();
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid == null ? null : userUuid.trim();
    }
}