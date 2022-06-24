package com.interswitchug.utils;

public class ServiceConstants {
	
	
	private String vendorUsername;
	private String vendorPassword;
	
	
	public String getVendorUsername() {
		return vendorUsername;
	}
	public void setVendorUsername(String vendorUsername) {
		this.vendorUsername = vendorUsername;
	}
	public String getVendorPassword() {
		return vendorPassword;
	}
	public void setVendorPassword(String vendorPassword) {
		this.vendorPassword = vendorPassword;
	}
	
	
	@Override
	public String toString() {
		return "ServiceConstants [vendorUsername=" + vendorUsername + ", vendorPassword=" + vendorPassword + "]";
	}
	
}
