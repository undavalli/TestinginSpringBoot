package com.test.raj.TestingUsingSpringBoot;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.raj.TestingUsingSpringBoot.Entity.Employee;
import com.test.raj.TestingUsingSpringBoot.Repository.EmployeeRepo;
import com.test.raj.TestingUsingSpringBoot.Service.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=TestingUsingSpringBootApplication.class)
public class EmployeeServiceTest {
	
	@MockBean
	EmployeeRepo empRepo;
	
	@Autowired
	EmployeeService empService;
	
	@Before
	public void setData() {
		Employee emp = new Employee("alex");
		
		Mockito.when(empRepo.findByName(emp.getName())).thenReturn(emp);
	}
	
	@Test
	public void testData() {
		Employee emp = new Employee("alex");
		
		assertEquals(empService.employeeGetName("alex").getName(), emp.getName());
	}

}
