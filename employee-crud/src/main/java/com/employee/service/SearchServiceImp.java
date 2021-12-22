package com.employee.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.apache.lucene.search.Query;
import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.jpa.FullTextQuery;
import org.hibernate.search.jpa.Search;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.entity.Employee;
import com.employee.mapper.Mapper;
import com.employee.repository.EmployeeRepository;

@Service
public class SearchServiceImp implements SearchService {
	
	
	@Autowired
	private Mapper mapper;
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<String> getSearchItemSuggestions(String searchText, int maxResult) {
	
//		Employee employee = employeeRepository.findByEmployeeUuid(uuid);	

		FullTextEntityManager fullTextEntityManager = Search.getFullTextEntityManager(entityManager);

		QueryBuilder queryBuilder = fullTextEntityManager.getSearchFactory().buildQueryBuilder()
				.forEntity(Employee.class).get();

		Query query1 = queryBuilder.keyword().onField("employeeName").matching(searchText).createQuery();

		Query finalQuery = queryBuilder.bool().must(query1).createQuery();


		FullTextQuery queryResult = fullTextEntityManager.createFullTextQuery(finalQuery, Employee.class);
		queryResult.setFirstResult(0);
		queryResult.setMaxResults(maxResult);
		
		

		

		@SuppressWarnings("unchecked")
		List<Employee> results = queryResult.getResultList();

		List<String> employeeList = new ArrayList<>();

		for (Employee employee : results) 
		{
			employeeList.add(employee.getEmployeeName());
		}
		return employeeList;
		

	}

	private Query activeQuery(QueryBuilder queryBuilder, Class<Employee> class1) {
		
		return queryBuilder.keyword().onField("bookUuid").matching("employeeName").createQuery();
	}


}
