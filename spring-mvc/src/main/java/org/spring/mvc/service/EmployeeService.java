package org.spring.mvc.service;

import java.util.List;

import org.spring.mvc.model.Employee;
import org.spring.mvc.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService implements IEmployeeService  {
	@Autowired
	private IEmployeeRepo employeeRepo;
	
	/* (non-Javadoc)
	 * @see org.spring.mvc.service.IEmployeeService#createEmployee(org.spring.mvc.model.Employee)
	 */
	@Override
	@Transactional
	public Employee createEmployee(Employee employee){
		return employeeRepo.createEmployee(employee);
	}
	
	/* (non-Javadoc)
	 * @see org.spring.mvc.service.IEmployeeService#findAllEmployee()
	 */
	@Override
	@Transactional
	public List<Employee> findAllEmployee(){
		return employeeRepo.findAllEmployee();
	}
}
