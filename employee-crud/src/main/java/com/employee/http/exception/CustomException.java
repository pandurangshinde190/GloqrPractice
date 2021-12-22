package com.employee.http.exception;

import org.springframework.http.HttpStatus;

public class CustomException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private final HttpStatus status;

	public CustomException(String message, HttpStatus status) {
		super(message);
		this.status = status;
	}

	public CustomException(String message, HttpStatus status, Throwable e) {
		super(message, e);
		this.status = status;
	}

	public HttpStatus getStatus() {
		return status;
	}

}
