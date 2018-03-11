package org.spring.basic.xmlanno.repository;

import java.util.ArrayList;
import java.util.List;

import org.spring.basic.xmlanno.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository("employeeRepository")
public class EmployeeRepositoryImpl implements EmployeeRepository {
	@Value("${dbUserName}")
	private String dbUserName;
	/* (non-Javadoc)
	 * @see org.spring.basic.xmlanno.repository.EmployeeRepository#findAll()
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
	@Override
	public String toString() {
		return "EmployeeRepositoryImpl [dbUserName=" + dbUserName + "]";
	}
}
