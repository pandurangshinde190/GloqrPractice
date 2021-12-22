package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDto;
import com.employee.http.response.CustomHttpResponse;
import com.employee.service.SearchService;
import com.employee.util.ResponseMaker;



@RestController
@CrossOrigin(origins = "*")
@RequestMapping("emp")
public class SearchController
{
	@Autowired
	private SearchService searchService;
	
	@Autowired
	private ResponseMaker responseMaker;
	

	
	@GetMapping("/employees")
	public ResponseEntity<CustomHttpResponse<List<String>>> getAutoSuggestedResults(
			@RequestParam(value = "searchText") String searchText,
			@RequestParam(value = "maxResult", defaultValue = "10") int maxResult) {

		List<String> searchedEmployeeName = searchService.getSearchItemSuggestions(searchText, maxResult);
		return responseMaker.successResponse(searchedEmployeeName, HttpStatus.OK);
	}
	
}
