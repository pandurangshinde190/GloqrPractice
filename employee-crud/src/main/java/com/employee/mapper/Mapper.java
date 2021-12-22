package com.employee.mapper;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import com.employee.http.exception.CustomException;



@Component
public class Mapper {

	public <T1, T> List<T> convertToDtos(List<T1> srcObjs, Class<T> targetClass) {
		List<T> dtos = new ArrayList<>();
		srcObjs.forEach(srcObj -> {
			T t = convert(srcObj, targetClass);
			dtos.add(t);
		});
		return dtos;
	}

	public <T> T convertToEntity(Object srcObj, Class<T> targetClass) {
		return convert(srcObj, targetClass);
	}

	public <T> T convertToDto(Object srcObj, Class<T> targetClass) {
		return convert(srcObj, targetClass);
	}

	

	private <T> T convert(Object srcObj, Class<T> targetClass) {
		T targetObj = null;

		try {
			targetObj = new ModelMapper().map(srcObj, targetClass);
		} catch (Exception e) {
			throw new CustomException("Exception in convertion.message:- " + e.getMessage(),
					HttpStatus.INTERNAL_SERVER_ERROR, e);
		}
		return targetObj;
	}

}
