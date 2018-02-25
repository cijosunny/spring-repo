package org.spring.mvc.repo;

import java.util.List;

import org.hibernate.SessionFactory;
import org.spring.mvc.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepo implements IEmployeeRepo {
	@Autowired
	private SessionFactory sf;
	
	/* (non-Javadoc)
	 * @see org.spring.mvc.repo.IEmployeeRepo#createEmployee(org.spring.mvc.model.Employee)
	 */
	@Override
	public Employee createEmployee(Employee employee){
		sf.getCurrentSession().save(employee);
		return employee;
	}
	
	/* (non-Javadoc)
	 * @see org.spring.mvc.repo.IEmployeeRepo#findAllEmployee()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> findAllEmployee(){
		return sf.getCurrentSession().createQuery("from Employee").getResultList();
	}
}
