package com.employee.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.employee.http.response.CustomHttpResponse;



@Component
public class ResponseMaker {

	private <T> CustomHttpResponse<T> getObj(HttpStatus status) {
		return new CustomHttpResponse<>(status.value(), status);
	}

	public <T> ResponseEntity<CustomHttpResponse<T>> successResponse(T data, HttpStatus status) {
		CustomHttpResponse<T> response = getObj(status);
		response.setData(data);

		return new ResponseEntity<>(response, status);
	}

	public <T> ResponseEntity<CustomHttpResponse<T>> errorResponse(String message, HttpStatus status) {
		CustomHttpResponse<T> response = getObj(status);
		response.setMessage(message);
		response.setError(true);

		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	

}
