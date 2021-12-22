package com.employee.util;

import java.util.UUID;

import org.springframework.http.HttpStatus;

import com.employee.http.exception.CustomException;




public class UuidUtil {

	private UuidUtil() {
		throw new CustomException("Utility Class. Can't Initiate.", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public static String getUuid(String str) {
		return str.toLowerCase().trim().replaceAll("[^a-zA-Z0-9\\s]", "").replaceAll("\\s", "-") + "-"
				+ RandomAlphaNumCharGenerator.randomString(4) + RandomAlphaNumCharGenerator.randomNumber(10000);

	}

	public static String getUuid() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
