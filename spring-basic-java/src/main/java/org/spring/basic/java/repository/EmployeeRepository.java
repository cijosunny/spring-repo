package org.spring.basic.java.repository;

import java.util.List;

import org.spring.basic.java.model.Employee;


public interface EmployeeRepository {

	List<Employee> findAll();

}