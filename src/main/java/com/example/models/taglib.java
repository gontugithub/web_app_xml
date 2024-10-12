package com.example.models;

public class taglib {
	
	private String taglibUri;
	private String taglibLocation;
	
	public taglib(String taglibUri, String taglibLocation) {
		this.taglibUri = taglibUri;
		this.taglibLocation = taglibLocation;
	}
	
	public String getTaglibUri() {
		return taglibUri;
	}
	public void setTaglibUri(String taglibUri) {
		this.taglibUri = taglibUri;
	}
	public String getTaglibLocation() {
		return taglibLocation;
	}
	public void setTaglibLocation(String taglibLocation) {
		this.taglibLocation = taglibLocation;
	}
	
	@Override
	public String toString() {
		return "taglib [taglibUri=" + taglibUri + ", taglibLocation=" + taglibLocation + "]";
	}
	
	

}
