package de.hampager.dap4j.models;

public class Address {

    private String ipAddr;
    private Integer port;

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Address(String ipAddr, Integer port) {
        this.ipAddr = ipAddr;
        this.port = port;
    }
}