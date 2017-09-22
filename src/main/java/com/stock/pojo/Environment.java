package com.stock.pojo;

public class Environment {
    private String enviroUuid;

    private String enviroMacro;

    private String enviroMicro;

    private String enviroPolicy;

    private String enviroEconomy;

    private String enviroCulture;

    private String enviroTechnology;

    private String enviroEvalue;

    private String maUuid;

    public String getEnviroUuid() {
        return enviroUuid;
    }

    public void setEnviroUuid(String enviroUuid) {
        this.enviroUuid = enviroUuid == null ? null : enviroUuid.trim();
    }

    public String getEnviroMacro() {
        return enviroMacro;
    }

    public void setEnviroMacro(String enviroMacro) {
        this.enviroMacro = enviroMacro == null ? null : enviroMacro.trim();
    }

    public String getEnviroMicro() {
        return enviroMicro;
    }

    public void setEnviroMicro(String enviroMicro) {
        this.enviroMicro = enviroMicro == null ? null : enviroMicro.trim();
    }

    public String getEnviroPolicy() {
        return enviroPolicy;
    }

    public void setEnviroPolicy(String enviroPolicy) {
        this.enviroPolicy = enviroPolicy == null ? null : enviroPolicy.trim();
    }

    public String getEnviroEconomy() {
        return enviroEconomy;
    }

    public void setEnviroEconomy(String enviroEconomy) {
        this.enviroEconomy = enviroEconomy == null ? null : enviroEconomy.trim();
    }

    public String getEnviroCulture() {
        return enviroCulture;
    }

    public void setEnviroCulture(String enviroCulture) {
        this.enviroCulture = enviroCulture == null ? null : enviroCulture.trim();
    }

    public String getEnviroTechnology() {
        return enviroTechnology;
    }

    public void setEnviroTechnology(String enviroTechnology) {
        this.enviroTechnology = enviroTechnology == null ? null : enviroTechnology.trim();
    }

    public String getEnviroEvalue() {
        return enviroEvalue;
    }

    public void setEnviroEvalue(String enviroEvalue) {
        this.enviroEvalue = enviroEvalue == null ? null : enviroEvalue.trim();
    }

    public String getMaUuid() {
        return maUuid;
    }

    public void setMaUuid(String maUuid) {
        this.maUuid = maUuid == null ? null : maUuid.trim();
    }
}