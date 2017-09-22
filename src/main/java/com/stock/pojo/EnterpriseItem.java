package com.stock.pojo;

public class EnterpriseItem {
    private String enterUuid;

    private String enterName;

    private String enterContent;

    private String enterOrder;

    @Override
	public String toString(){
		
		return "\n EnterpriseItem [enterUuid=" + enterUuid
				+ ", enterName=" + enterName
				+ ", enterContent=" + enterContent
				+ ", enterOrder=" + enterOrder
				+ "]";
	}
    
    public String getEnterUuid() {
        return enterUuid;
    }

    public void setEnterUuid(String enterUuid) {
        this.enterUuid = enterUuid == null ? null : enterUuid.trim();
    }

    public String getEnterName() {
        return enterName;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName == null ? null : enterName.trim();
    }

    public String getEnterContent() {
        return enterContent;
    }

    public void setEnterContent(String enterContent) {
        this.enterContent = enterContent == null ? null : enterContent.trim();
    }

    public String getEnterOrder() {
        return enterOrder;
    }

    public void setEnterOrder(String enterOrder) {
        this.enterOrder = enterOrder == null ? null : enterOrder.trim();
    }
}