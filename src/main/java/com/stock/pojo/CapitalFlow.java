package com.stock.pojo;

public class CapitalFlow {
    private Integer flowId;

    private String flowCode;

    private String flowName;

    private String sbigDayActiveInCount;

    private String sbigDayActiveInMoney;

    private String sbigDayPassitiveInCount;

    private String sbigDayPassitiveInMoney;

    private String sbigDayActiveOutCount;

    private String sbigDayActiveOutMoney;

    private String sbigDayPassitiveOutCount;

    private String sbigDayPassitiveOutMoney;

    private String bigDayActiveInCount;

    private String bigDayActiveInMoney;

    private String bigDayPassitiveInCount;

    private String bigDayPassitiveInMoney;

    private String bigDayActiveOutCount;

    private String bigDayActiveOutMoney;

    private String bigDayPassitiveOutCount;

    private String bigDayPassitiveOutMoney;

    private String sbigWeekActiveInCount;

    private String sbigWeekActiveInMoney;

    private String sbigWeekPassitiveInCount;

    private String sbigWeekPassitiveInMoney;

    private String sbigWeekActiveOutCount;

    private String sbigWeekActiveOutMoney;

    private String sbigWeekPassitiveOutCount;

    private String sbigWeekPassitiveOutMoney;

    private String bigWeekActiveInCount;

    private String bigWeekActiveInMoney;

    private String bigWeekPassitiveInCount;

    private String bigWeekPassitiveInMoney;

    private String bigWeekActiveOutCount;

    private String bigWeekActiveOutMoney;

    private String bigWeekPassitiveOutCount;

    private String bigWeekPassitiveOutMoney;
    
    private String flowinCount;

	private String flowinMoney;
	
	private String flowoutCount;

	private String flowoutMoney;
	
	private String dayFlowinRate;
	
	private String netFlowinCount;
	
	private String currentPrice;

	private String updownRate;
	
	private  Company company;


	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getDayFlowinRate() {
		return dayFlowinRate;
	}

	public void setDayFlowinRate(String dayFlowinRate) {
		this.dayFlowinRate = dayFlowinRate;
	}

	public String getNetFlowinCount() {
		return netFlowinCount;
	}

	public void setNetFlowinCount(String netFlowinCount) {
		this.netFlowinCount = netFlowinCount;
	}

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getUpdownRate() {
		return updownRate;
	}

	public void setUpdownRate(String updownRate) {
		this.updownRate = updownRate;
	}


	
	public String getFlowoutCount() {
		return flowoutCount;
	}

	public void setFlowoutCount(String flowoutCount) {
		this.flowoutCount = flowoutCount;
	}

	public String getFlowoutMoney() {
		return flowoutMoney;
	}

	public void setFlowoutMoney(String flowoutMoney) {
		this.flowoutMoney = flowoutMoney;
	}

	
	public String getFlowinCount() {
		return flowinCount;
	}
	
	public void setFlowinCount(String flowinCount) {
		this.flowinCount = flowinCount;
	}
	
	public String getFlowinMoney() {
		return flowinMoney;
	}
	
	public void setFlowinMoney(String flowinMoney) {
		this.flowinMoney = flowinMoney;
	}

    public Integer getFlowId() {
        return flowId;
    }

    public void setFlowId(Integer flowId) {
        this.flowId = flowId;
    }

    public String getFlowCode() {
        return flowCode;
    }

    public void setFlowCode(String flowCode) {
        this.flowCode = flowCode == null ? null : flowCode.trim();
    }

    public String getFlowName() {
        return flowName;
    }

    public void setFlowName(String flowName) {
        this.flowName = flowName == null ? null : flowName.trim();
    }

    public String getSbigDayActiveInCount() {
        return sbigDayActiveInCount;
    }

    public void setSbigDayActiveInCount(String sbigDayActiveInCount) {
        this.sbigDayActiveInCount = sbigDayActiveInCount == null ? null : sbigDayActiveInCount.trim();
    }

    public String getSbigDayActiveInMoney() {
        return sbigDayActiveInMoney;
    }

    public void setSbigDayActiveInMoney(String sbigDayActiveInMoney) {
        this.sbigDayActiveInMoney = sbigDayActiveInMoney == null ? null : sbigDayActiveInMoney.trim();
    }

    public String getSbigDayPassitiveInCount() {
        return sbigDayPassitiveInCount;
    }

    public void setSbigDayPassitiveInCount(String sbigDayPassitiveInCount) {
        this.sbigDayPassitiveInCount = sbigDayPassitiveInCount == null ? null : sbigDayPassitiveInCount.trim();
    }

    public String getSbigDayPassitiveInMoney() {
        return sbigDayPassitiveInMoney;
    }

    public void setSbigDayPassitiveInMoney(String sbigDayPassitiveInMoney) {
        this.sbigDayPassitiveInMoney = sbigDayPassitiveInMoney == null ? null : sbigDayPassitiveInMoney.trim();
    }

    public String getSbigDayActiveOutCount() {
        return sbigDayActiveOutCount;
    }

    public void setSbigDayActiveOutCount(String sbigDayActiveOutCount) {
        this.sbigDayActiveOutCount = sbigDayActiveOutCount == null ? null : sbigDayActiveOutCount.trim();
    }

    public String getSbigDayActiveOutMoney() {
        return sbigDayActiveOutMoney;
    }

    public void setSbigDayActiveOutMoney(String sbigDayActiveOutMoney) {
        this.sbigDayActiveOutMoney = sbigDayActiveOutMoney == null ? null : sbigDayActiveOutMoney.trim();
    }

    public String getSbigDayPassitiveOutCount() {
        return sbigDayPassitiveOutCount;
    }

    public void setSbigDayPassitiveOutCount(String sbigDayPassitiveOutCount) {
        this.sbigDayPassitiveOutCount = sbigDayPassitiveOutCount == null ? null : sbigDayPassitiveOutCount.trim();
    }

    public String getSbigDayPassitiveOutMoney() {
        return sbigDayPassitiveOutMoney;
    }

    public void setSbigDayPassitiveOutMoney(String sbigDayPassitiveOutMoney) {
        this.sbigDayPassitiveOutMoney = sbigDayPassitiveOutMoney == null ? null : sbigDayPassitiveOutMoney.trim();
    }

    public String getBigDayActiveInCount() {
        return bigDayActiveInCount;
    }

    public void setBigDayActiveInCount(String bigDayActiveInCount) {
        this.bigDayActiveInCount = bigDayActiveInCount == null ? null : bigDayActiveInCount.trim();
    }

    public String getBigDayActiveInMoney() {
        return bigDayActiveInMoney;
    }

    public void setBigDayActiveInMoney(String bigDayActiveInMoney) {
        this.bigDayActiveInMoney = bigDayActiveInMoney == null ? null : bigDayActiveInMoney.trim();
    }

    public String getBigDayPassitiveInCount() {
        return bigDayPassitiveInCount;
    }

    public void setBigDayPassitiveInCount(String bigDayPassitiveInCount) {
        this.bigDayPassitiveInCount = bigDayPassitiveInCount == null ? null : bigDayPassitiveInCount.trim();
    }

    public String getBigDayPassitiveInMoney() {
        return bigDayPassitiveInMoney;
    }

    public void setBigDayPassitiveInMoney(String bigDayPassitiveInMoney) {
        this.bigDayPassitiveInMoney = bigDayPassitiveInMoney == null ? null : bigDayPassitiveInMoney.trim();
    }

    public String getBigDayActiveOutCount() {
        return bigDayActiveOutCount;
    }

    public void setBigDayActiveOutCount(String bigDayActiveOutCount) {
        this.bigDayActiveOutCount = bigDayActiveOutCount == null ? null : bigDayActiveOutCount.trim();
    }

    public String getBigDayActiveOutMoney() {
        return bigDayActiveOutMoney;
    }

    public void setBigDayActiveOutMoney(String bigDayActiveOutMoney) {
        this.bigDayActiveOutMoney = bigDayActiveOutMoney == null ? null : bigDayActiveOutMoney.trim();
    }

    public String getBigDayPassitiveOutCount() {
        return bigDayPassitiveOutCount;
    }

    public void setBigDayPassitiveOutCount(String bigDayPassitiveOutCount) {
        this.bigDayPassitiveOutCount = bigDayPassitiveOutCount == null ? null : bigDayPassitiveOutCount.trim();
    }

    public String getBigDayPassitiveOutMoney() {
        return bigDayPassitiveOutMoney;
    }

    public void setBigDayPassitiveOutMoney(String bigDayPassitiveOutMoney) {
        this.bigDayPassitiveOutMoney = bigDayPassitiveOutMoney == null ? null : bigDayPassitiveOutMoney.trim();
    }

    public String getSbigWeekActiveInCount() {
        return sbigWeekActiveInCount;
    }

    public void setSbigWeekActiveInCount(String sbigWeekActiveInCount) {
        this.sbigWeekActiveInCount = sbigWeekActiveInCount == null ? null : sbigWeekActiveInCount.trim();
    }

    public String getSbigWeekActiveInMoney() {
        return sbigWeekActiveInMoney;
    }

    public void setSbigWeekActiveInMoney(String sbigWeekActiveInMoney) {
        this.sbigWeekActiveInMoney = sbigWeekActiveInMoney == null ? null : sbigWeekActiveInMoney.trim();
    }

    public String getSbigWeekPassitiveInCount() {
        return sbigWeekPassitiveInCount;
    }

    public void setSbigWeekPassitiveInCount(String sbigWeekPassitiveInCount) {
        this.sbigWeekPassitiveInCount = sbigWeekPassitiveInCount == null ? null : sbigWeekPassitiveInCount.trim();
    }

    public String getSbigWeekPassitiveInMoney() {
        return sbigWeekPassitiveInMoney;
    }

    public void setSbigWeekPassitiveInMoney(String sbigWeekPassitiveInMoney) {
        this.sbigWeekPassitiveInMoney = sbigWeekPassitiveInMoney == null ? null : sbigWeekPassitiveInMoney.trim();
    }

    public String getSbigWeekActiveOutCount() {
        return sbigWeekActiveOutCount;
    }

    public void setSbigWeekActiveOutCount(String sbigWeekActiveOutCount) {
        this.sbigWeekActiveOutCount = sbigWeekActiveOutCount == null ? null : sbigWeekActiveOutCount.trim();
    }

    public String getSbigWeekActiveOutMoney() {
        return sbigWeekActiveOutMoney;
    }

    public void setSbigWeekActiveOutMoney(String sbigWeekActiveOutMoney) {
        this.sbigWeekActiveOutMoney = sbigWeekActiveOutMoney == null ? null : sbigWeekActiveOutMoney.trim();
    }

    public String getSbigWeekPassitiveOutCount() {
        return sbigWeekPassitiveOutCount;
    }

    public void setSbigWeekPassitiveOutCount(String sbigWeekPassitiveOutCount) {
        this.sbigWeekPassitiveOutCount = sbigWeekPassitiveOutCount == null ? null : sbigWeekPassitiveOutCount.trim();
    }

    public String getSbigWeekPassitiveOutMoney() {
        return sbigWeekPassitiveOutMoney;
    }

    public void setSbigWeekPassitiveOutMoney(String sbigWeekPassitiveOutMoney) {
        this.sbigWeekPassitiveOutMoney = sbigWeekPassitiveOutMoney == null ? null : sbigWeekPassitiveOutMoney.trim();
    }

    public String getBigWeekActiveInCount() {
        return bigWeekActiveInCount;
    }

    public void setBigWeekActiveInCount(String bigWeekActiveInCount) {
        this.bigWeekActiveInCount = bigWeekActiveInCount == null ? null : bigWeekActiveInCount.trim();
    }

    public String getBigWeekActiveInMoney() {
        return bigWeekActiveInMoney;
    }

    public void setBigWeekActiveInMoney(String bigWeekActiveInMoney) {
        this.bigWeekActiveInMoney = bigWeekActiveInMoney == null ? null : bigWeekActiveInMoney.trim();
    }

    public String getBigWeekPassitiveInCount() {
        return bigWeekPassitiveInCount;
    }

    public void setBigWeekPassitiveInCount(String bigWeekPassitiveInCount) {
        this.bigWeekPassitiveInCount = bigWeekPassitiveInCount == null ? null : bigWeekPassitiveInCount.trim();
    }

    public String getBigWeekPassitiveInMoney() {
        return bigWeekPassitiveInMoney;
    }

    public void setBigWeekPassitiveInMoney(String bigWeekPassitiveInMoney) {
        this.bigWeekPassitiveInMoney = bigWeekPassitiveInMoney == null ? null : bigWeekPassitiveInMoney.trim();
    }

    public String getBigWeekActiveOutCount() {
        return bigWeekActiveOutCount;
    }

    public void setBigWeekActiveOutCount(String bigWeekActiveOutCount) {
        this.bigWeekActiveOutCount = bigWeekActiveOutCount == null ? null : bigWeekActiveOutCount.trim();
    }

    public String getBigWeekActiveOutMoney() {
        return bigWeekActiveOutMoney;
    }

    public void setBigWeekActiveOutMoney(String bigWeekActiveOutMoney) {
        this.bigWeekActiveOutMoney = bigWeekActiveOutMoney == null ? null : bigWeekActiveOutMoney.trim();
    }

    public String getBigWeekPassitiveOutCount() {
        return bigWeekPassitiveOutCount;
    }

    public void setBigWeekPassitiveOutCount(String bigWeekPassitiveOutCount) {
        this.bigWeekPassitiveOutCount = bigWeekPassitiveOutCount == null ? null : bigWeekPassitiveOutCount.trim();
    }

    public String getBigWeekPassitiveOutMoney() {
        return bigWeekPassitiveOutMoney;
    }

    public void setBigWeekPassitiveOutMoney(String bigWeekPassitiveOutMoney) {
        this.bigWeekPassitiveOutMoney = bigWeekPassitiveOutMoney == null ? null : bigWeekPassitiveOutMoney.trim();
    }
}