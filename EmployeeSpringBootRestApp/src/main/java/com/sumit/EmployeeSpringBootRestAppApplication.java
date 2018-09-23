package com.sumit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sumit.entity.Employee;
import com.sumit.service.EmployeeService;

@SpringBootApplication
public class EmployeeSpringBootRestAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext =SpringApplication.run(EmployeeSpringBootRestAppApplication.class, args);
	
		EmployeeService employeeService=applicationContext.getBean("employeeService", EmployeeService.class);
	
	Employee employee=new Employee();
	employee.setFirst_name("sumit");
	employee.setLast_name("payasi");
	employee.setCity("pune");
	employee.setZip_code(1234);
	
	employeeService.addEmployee(employee);
	
	}
}
