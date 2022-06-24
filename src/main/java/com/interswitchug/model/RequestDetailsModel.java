package com.interswitchug.model;

public class RequestDetailsModel {
	
	private String username;
	private String password;
	private String reference;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	@Override
	public String toString() {
		return "RequestDetailsModel [username=" + username + ", password=" + password + ", reference=" + reference
				+ "]";
	}
	
	

}
