package com.sdw.crawlerproxy.model;

public class ProxyInfo {
	private String sourceSite;
	private String sourceUrl;
	private ProxyType type;
	private String country;
	private String ip;
	private int port;
	public String getSourceSite() {
		return sourceSite;
	}
	public void setSourceSite(String sourceSite) {
		this.sourceSite = sourceSite;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
	public ProxyType getType() {
		return type;
	}
	public void setType(ProxyType type) {
		this.type = type;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "ProxyInfo [sourceSite=" + sourceSite + ", sourceUrl=" + sourceUrl + ", type=" + type + ", country="
				+ country + ", ip=" + ip + ", port=" + port + "]";
	}
	
	
}
