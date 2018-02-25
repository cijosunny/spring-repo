package org.spring.mvc.repo;

import java.util.List;

import org.spring.mvc.model.Employee;

public interface IEmployeeRepo {

	Employee createEmployee(Employee employee);

	List<Employee> findAllEmployee();

}