package com.stock.pojo;

public class Milestone {
    private String msUuid;

    private String msEvent;

    private String msHappentime;

    private String msDescription;

    private String msNeedresource;

    private String msProfitstatus;

    private String msProfitamount;

    private String msCostcontrol;

    private String projectUuid;

    public String getMsUuid() {
        return msUuid;
    }

    public void setMsUuid(String msUuid) {
        this.msUuid = msUuid == null ? null : msUuid.trim();
    }

    public String getMsEvent() {
        return msEvent;
    }

    public void setMsEvent(String msEvent) {
        this.msEvent = msEvent == null ? null : msEvent.trim();
    }

    public String getMsHappentime() {
        return msHappentime;
    }

    public void setMsHappentime(String msHappentime) {
        this.msHappentime = msHappentime == null ? null : msHappentime.trim();
    }

    public String getMsDescription() {
        return msDescription;
    }

    public void setMsDescription(String msDescription) {
        this.msDescription = msDescription == null ? null : msDescription.trim();
    }

    public String getMsNeedresource() {
        return msNeedresource;
    }

    public void setMsNeedresource(String msNeedresource) {
        this.msNeedresource = msNeedresource == null ? null : msNeedresource.trim();
    }

    public String getMsProfitstatus() {
        return msProfitstatus;
    }

    public void setMsProfitstatus(String msProfitstatus) {
        this.msProfitstatus = msProfitstatus == null ? null : msProfitstatus.trim();
    }

    public String getMsProfitamount() {
        return msProfitamount;
    }

    public void setMsProfitamount(String msProfitamount) {
        this.msProfitamount = msProfitamount == null ? null : msProfitamount.trim();
    }

    public String getMsCostcontrol() {
        return msCostcontrol;
    }

    public void setMsCostcontrol(String msCostcontrol) {
        this.msCostcontrol = msCostcontrol == null ? null : msCostcontrol.trim();
    }

    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid == null ? null : projectUuid.trim();
    }
}