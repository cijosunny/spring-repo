package org.spring.refer.basic.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.refer.basic.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
	private String dbUserName;
	/* (non-Javadoc)
	 * @see org.spring.refer.basic.repository.HibernateRepository#findAll()
	 */
	@Override
	public List<Employee> findAll(){
		List<Employee> employees = new ArrayList<>();
		Employee employee = new Employee();
		employee.setFirstname("Cijo");
		employee.setLastname("Sunny");
		employees.add(employee);
		return employees;
	}
	
	public void setDbUserName(String dbUserName) {
		this.dbUserName = dbUserName;
	}

	@Override
	public String toString() {
		return "EmployeeRepositoryImpl [dbUserName=" + dbUserName + "]";
	}
}
