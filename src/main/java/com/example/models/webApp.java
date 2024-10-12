package com.example.models;

import java.util.ArrayList;

public class webApp {
	
	private ArrayList<servlet> servletList;
	private ArrayList<servletMapping> servletMapList;
	private taglib taglib;
	
	public webApp(ArrayList<servlet> servletList, ArrayList<servletMapping> servletMapList,taglib taglib) {
		this.servletList = servletList;
		this.servletMapList = servletMapList;
		this.taglib = taglib;
	}

	public ArrayList<servlet> getServletList() {
		return servletList;
	}

	public void setServletList(ArrayList<servlet> servletList) {
		this.servletList = servletList;
	}

	public ArrayList<servletMapping> getServletMapList() {
		return servletMapList;
	}

	public void setServletMapList(ArrayList<servletMapping> servletMapList) {
		this.servletMapList = servletMapList;
	}

	public taglib getTaglib() {
		return taglib;
	}

	public void setTaglib(taglib taglib) {
		this.taglib = taglib;
	}

	@Override
	public String toString() {
		return "webApp [servletList=" + servletList + ", servletMapList=" + servletMapList + ", taglib=" + taglib + "]";
	}
	
	
	
	
	

}
