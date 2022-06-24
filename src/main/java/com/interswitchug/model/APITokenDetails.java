package com.interswitchug.model;

public class APITokenDetails {
	String message; 
	String statusCode; 
	Boolean isAuthenticated; 
	String token; 
	String reference;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public Boolean getIsAuthenticated() {
		return isAuthenticated;
	}
	public void setIsAuthenticated(Boolean isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	@Override
	public String toString() {
		return "APITokenDetails [message=" + message + ", statusCode=" + statusCode + ", isAuthenticated="
				+ isAuthenticated + ", token=" + token + ", reference=" + reference + "]";
	} 
	
	        


}
