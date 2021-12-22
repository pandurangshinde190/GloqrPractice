package com.employee.http.response;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_DEFAULT)
public class CustomHttpResponse<T> {

	private String message;
	private int code;
	private HttpStatus status;
	private boolean error;
	private T data;
	private CustomErrorResponse errorResponse;

	public CustomHttpResponse(int code, HttpStatus status) {
		super();
		this.code = code;
		this.status = status;
	}

	public CustomHttpResponse() {
		super();
	}

	public boolean isError() {
		return error;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public CustomErrorResponse getErrorResponse() {
		return errorResponse;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public void setErrorResponse(CustomErrorResponse errorResponse) {
		this.errorResponse = errorResponse;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
