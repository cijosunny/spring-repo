package org.spring.basic.xmlanno.service;

import java.util.List;

import org.spring.basic.xmlanno.model.Customer;
import org.spring.basic.xmlanno.model.Employee;
import org.spring.basic.xmlanno.model.Student;
import org.spring.basic.xmlanno.repository.CustomerRepository;
import org.spring.basic.xmlanno.repository.EmployeeRepository;
import org.spring.basic.xmlanno.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	private StudentRepository studentRepository;
	
	private CustomerRepository customerRepository;
	
	@Autowired
	public EmployeeServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	/* (non-Javadoc)
	 * @see org.spring.basic.xmlanno.service.EmployeeService#findAll()
	 */
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public List<Customer> findAllCustomers(){
		return customerRepository.findAll();
	}

	@Autowired
	public void setStudentRepository(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
}
