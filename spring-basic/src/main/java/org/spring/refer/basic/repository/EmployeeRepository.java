package org.spring.refer.basic.repository;

import java.util.List;

import org.spring.refer.basic.model.Employee;

public interface EmployeeRepository {

	List<Employee> findAll();

}