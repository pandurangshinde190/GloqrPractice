package com.employee.util;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.HttpStatus;

import com.employee.http.exception.CustomException;




public class RandomAlphaNumCharGenerator {

	private RandomAlphaNumCharGenerator() {
		throw new CustomException("Utility Class. Can't Initiate.", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	public static Integer randomNumber(int length) {
		return new Random().nextInt(length);
	}

	public static String randomString(int length) {
		return RandomStringUtils.randomAlphabetic(length);

	}
}
