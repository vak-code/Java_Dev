package com.vishal.classobjects.objects;

public class Device {

	private String deviceType;
	private int deviceID;
	private Vendor vendor;
	
	public void upgradeDevice()
	{
		System.out.println("Device upgraded");
	}
	
	public void repairDevice()
	{
		System.out.println("Device repaired");
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public int getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(int deviceID) {
		this.deviceID = deviceID;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}
	
}
