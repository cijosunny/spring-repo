package org.spring.mvc.service;

import java.util.List;

import org.spring.mvc.model.Employee;

public interface IEmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> findAllEmployee();

}