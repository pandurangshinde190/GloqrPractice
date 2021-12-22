package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeDto;

public interface SearchService {
	public List<String> getSearchItemSuggestions(String searchText, int maxResult);
}
