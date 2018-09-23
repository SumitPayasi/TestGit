package com.sumit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sumit.dao.EmloyeeDao;
import com.sumit.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmloyeeDao employeeDao;

	public Employee addEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}

	public Employee getEmployeeById(Integer Id) {
		return employeeDao.findOne(Id);
	}
	

}
