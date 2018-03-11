package org.spring.basic.java.service;

import java.util.List;

import org.spring.basic.java.model.Customer;
import org.spring.basic.java.model.Employee;
import org.spring.basic.java.model.Student;

public interface CustomerService {

	List<Customer> findAll();
	List<Student> findAllStudentsBean();
	List<Student> findAllStudentsBeanQualifier();
	List<Student> findAllStudentsAutowireQualifier();
	
	List<Employee> findAllEmployees();
	List<Employee> findAllEmployeesSetterAutowireQualifier();

}