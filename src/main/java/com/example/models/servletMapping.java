package com.example.models;

public class servletMapping {
	
	private String servletMapName;
	private String servletMapUrl;
	

	public servletMapping(String servletMapName, String servletMapUrl) {
		this.servletMapName = servletMapName;
		this.servletMapUrl = servletMapUrl;
	}
	
	public String getServletMapName() {
		return servletMapName;
	}

	public void setServletMapName(String servletMapName) {
		this.servletMapName = servletMapName;
	}

	public String getServletMapUrl() {
		return servletMapUrl;
	}

	public void setServletMapUrl(String servletMapUrl) {
		this.servletMapUrl = servletMapUrl;
	}

	@Override
	public String toString() {
		return "servletMapping [servletMapName=" + servletMapName + ", servletMapUrl=" + servletMapUrl + "]";
	}
	
	
	

}
