package com.test.raj.TestingUsingSpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.raj.TestingUsingSpringBoot.Entity.Employee;
import com.test.raj.TestingUsingSpringBoot.Repository.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	
	public Employee employeeGetName(String name) {
		return employeeRepo.findByName(name);
	}

}
