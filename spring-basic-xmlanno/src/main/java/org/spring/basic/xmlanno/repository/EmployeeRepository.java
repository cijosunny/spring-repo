package org.spring.basic.xmlanno.repository;

import java.util.List;

import org.spring.basic.xmlanno.model.Employee;

public interface EmployeeRepository {

	List<Employee> findAll();

}