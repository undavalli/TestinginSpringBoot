package com.test.raj.TestingUsingSpringBoot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.test.raj.TestingUsingSpringBoot.Entity.Employee;
import com.test.raj.TestingUsingSpringBoot.Repository.EmployeeRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepoTest {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Test
	public void Test_findByName() {
		Employee emp = new Employee("alex");
		testEntityManager.persist(emp);
		testEntityManager.flush();
		
		Employee found = empRepo.findByName("alex");
		
		assertEquals(found.getName(), emp.getName() );
		
	}
}
