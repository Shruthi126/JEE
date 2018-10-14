package org.shruthi.rest.messenger.bean;

import javax.ws.rs.CookieParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.QueryParam;

public class MessageBeanParam {
	
	private	@MatrixParam("matrixP") String matrixParam;
	private	@HeaderParam("authToken") String authToken;
	private	@CookieParam("cookie") String cookie;
	private	@QueryParam("year") int year;
	
	
	public String getMatrixParam() {
		return matrixParam;
	}
	public void setMatrixParam(String matrixParam) {
		this.matrixParam = matrixParam;
	}
	public String getAuthToken() {
		return authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getCookie() {
		return cookie;
	}
	public void setCookie(String cookie) {
		this.cookie = cookie;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

}
