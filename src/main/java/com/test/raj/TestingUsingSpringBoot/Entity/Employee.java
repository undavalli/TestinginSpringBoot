package com.test.raj.TestingUsingSpringBoot.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="employee")
public class Employee {
	
	public Employee(String string) {
		
		this.name = string;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Size(min=3, max=10)
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
