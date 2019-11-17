package com.test.raj.TestingUsingSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.raj.TestingUsingSpringBoot.Entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
	
	public Employee findByName(String name);

}
