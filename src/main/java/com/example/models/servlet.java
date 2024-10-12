package com.example.models;

import java.util.ArrayList;

public class servlet {
	
	private String servletName;
	private String servletClass;
	private ArrayList<initParam> initParamList;
	
	
	public servlet(String servletName, String servletClass, ArrayList<initParam> initParamList) {
		this.servletName = servletName;
		this.servletClass = servletClass;
		this.initParamList = initParamList;
	}


	public String getServletName() {
		return servletName;
	}


	public void setServletName(String servletName) {
		this.servletName = servletName;
	}


	public String getServletClass() {
		return servletClass;
	}


	public void setServletClass(String servletClass) {
		this.servletClass = servletClass;
	}


	public ArrayList<initParam> getInitParamList() {
		return initParamList;
	}


	public void setInitParamList(ArrayList<initParam> initParamList) {
		this.initParamList = initParamList;
	}


	@Override
	public String toString() {
		return "servlet [servletName=" + servletName + ", servletClass=" + servletClass + ", initParamList="
				+ initParamList + "]";
	}
	
	

	
	

}
