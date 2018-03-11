package org.spring.refer.basic.service;

import java.util.List;

import org.spring.refer.basic.model.Employee;
import org.spring.refer.basic.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl() {
	}

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	/* (non-Javadoc)
	 * @see org.spring.refer.basic.service.CustomerService#findAll()
	 */
	@Override
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

	public void setEmployeeRepository(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
}
