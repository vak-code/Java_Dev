package com.example.demo.model;

public class Infra {

	private int resourceId;
	private String resourceType;

	public Infra(int resId, String resType) {
		this.resourceId = resId;
		this.resourceType = resType;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

}
