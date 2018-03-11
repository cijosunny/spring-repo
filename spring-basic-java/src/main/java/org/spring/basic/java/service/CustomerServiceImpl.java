package org.spring.basic.java.service;

import java.util.List;

import org.spring.basic.java.model.Customer;
import org.spring.basic.java.model.Employee;
import org.spring.basic.java.model.Student;
import org.spring.basic.java.repository.CustomerRepository;
import org.spring.basic.java.repository.EmployeeRepository;
import org.spring.basic.java.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRepository customerRepository;
	
	@Autowired
	@Qualifier("studentRepository")		//If Both @Bean annotated methods
	private StudentRepository studentRepository;
	
	@Autowired
	@Qualifier("studentRepository2")	//If Both @Bean annotated methods
	private StudentRepository studentRepository2;
	
	@Autowired
	@Qualifier("studentRepository3")	//If Both @Bean annotated methods
	private StudentRepository studentRepository3;
	
	private EmployeeRepository employeeRepository;
	
	private EmployeeRepository employeeRepository2;
	
	public CustomerServiceImpl() {
		System.out.println("Default Constructor#CustomerServiceImpl");
	}

	/**
	 * For Constructor Injection
	 * @param customerRepository
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor Injection");
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see org.spring.basic.java.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	
	@Override
	public List<Employee> findAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> findAllEmployeesSetterAutowireQualifier() {
		return employeeRepository2.findAll();
	}

	@Override
	public List<Student> findAllStudentsAutowireQualifier() {
		return studentRepository3.findAll();
	}

	@Override
	public List<Student> findAllStudentsBean() {
		return studentRepository.findAll();
	}

	@Override
	public List<Student> findAllStudentsBeanQualifier() {
		return studentRepository2.findAll();
	}

	/**
	 * For Setter Injection
	 * @param customerRepository
	 */
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter Injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	@Qualifier("employeeRepository")
	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Autowired
	@Qualifier("employeeRepository2")
	public void setEmployeeRepository2(EmployeeRepository employeeRepository2) {
		this.employeeRepository2 = employeeRepository2;
	}
}
