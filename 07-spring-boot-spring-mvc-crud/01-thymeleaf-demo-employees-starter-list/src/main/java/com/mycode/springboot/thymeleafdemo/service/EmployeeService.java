package com.mycode.springboot.thymeleafdemo.service;

import java.util.List;

import com.mycode.springboot.thymeleafdemo.entity.Employee;

public interface EmployeeService {

	List<Employee> findAll();
	
	Employee findById(int theId);
	
	void save(Employee theEmployee);
	
	void deleteById(int theId);
	
}
