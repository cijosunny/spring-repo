package org.spring.basic.xmlanno.service;

import java.util.List;

import org.spring.basic.xmlanno.model.Customer;
import org.spring.basic.xmlanno.model.Employee;
import org.spring.basic.xmlanno.model.Student;

public interface EmployeeService {

	List<Employee> findAll();
	List<Student> findAllStudents();
	List<Customer> findAllCustomers();
}