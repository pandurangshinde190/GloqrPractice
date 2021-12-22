package com.javatechie.report.EmployeeController;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.report.entity.Employee;
import com.javatechie.report.repository.EmployeeRepository;
import com.javatechie.report.service.ReportService;

import net.sf.jasperreports.engine.JRException;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private ReportService service;

    @PostMapping("/insertEmployees")
    public String insertData(@RequestBody Employee employee)
    {
    	service.save(employee);
		return "Data Save Successfully";
    	
    }
    
    
    @GetMapping("/getEmployees")
    public List<Employee> getEmployees() {

        return repository.findAll();
    }

    @GetMapping("/report/{format}")
    public String generateReport(@PathVariable String format) throws FileNotFoundException, JRException {
        return service.exportReport(format);
    }
}
