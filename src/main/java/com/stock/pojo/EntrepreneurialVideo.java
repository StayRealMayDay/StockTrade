package com.stock.pojo;

public class EntrepreneurialVideo {

	private String fileUuid;

    private String fileType;

    private String fileName;

    private String fileUrl;

    private String fileSize;

    private String fileTime;

    private String userUuid;
    
    private String userName;
    
    private String enterpriseItemId;
    
    private String item;
    
    private String frUuid;

    @Override
	public String toString(){
		
		return "\n Files [fileUuid=" + fileUuid
				+ ", fileType=" + fileType
				+ ", fileName=" + fileName
				+ ", fileUrl=" + fileUrl
				+ ", fileSize=" + fileSize
				+ ", fileTime=" + fileTime
				+ ", userUuid=" + userUuid
				+ ", userName=" + userName
				+ ", enterpriseItemId=" + enterpriseItemId
				+ ", item=" + item
				+ ", frUuid=" + frUuid
				+ "]";
	}
    
	public String getFileUuid() {
		return fileUuid;
	}

	public void setFileUuid(String fileUuid) {
		this.fileUuid = fileUuid;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileSize() {
		return fileSize;
	}

	public void setFileSize(String fileSize) {
		this.fileSize = fileSize;
	}

	public String getFileTime() {
		return fileTime;
	}

	public void setFileTime(String fileTime) {
		this.fileTime = fileTime;
	}

	public String getUserUuid() {
		return userUuid;
	}

	public void setUserUuid(String userUuid) {
		this.userUuid = userUuid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEnterpriseItemId() {
		return enterpriseItemId;
	}

	public void setEnterpriseItemId(String enterpriseItemId) {
		this.enterpriseItemId = enterpriseItemId;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getFrUuid() {
		return frUuid;
	}

	public void setFrUuid(String frUuid) {
		this.frUuid = frUuid;
	}
    
    
}
