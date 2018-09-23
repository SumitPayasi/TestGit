package com.sumit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sumit.entity.Employee;
import com.sumit.service.EmployeeService;

@RestController
@RequestMapping(value="api/employee")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(value="/add")
	public Employee addEmployee(@RequestBody Employee employee){
		return employeeService.addEmployee(employee);
		
	}
	
	@GetMapping(value="/{Id}")
	public Employee getEmployeeById(@PathVariable("Id") Integer Id){
		return employeeService.getEmployeeById(Id);
	}
	

}
