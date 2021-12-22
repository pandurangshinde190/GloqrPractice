package com.employee.http.response;

public class CustomErrorResponse {

	private int errorCode;
	private String errorMessage;
	private String typeDisplayName;

	public CustomErrorResponse(int errorCode, String errorMessage,String typeDisplayName) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.typeDisplayName = typeDisplayName;
	}

	public CustomErrorResponse() {
		super();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String getTypeDisplayName() {
		return typeDisplayName;
	}
}
