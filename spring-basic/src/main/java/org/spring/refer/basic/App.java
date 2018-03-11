package org.spring.refer.basic;

import org.spring.refer.basic.model.Employee;
import org.spring.refer.basic.repository.EmployeeRepository;
import org.spring.refer.basic.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml","dao.xml");
		Employee employee = context.getBean("sam",Employee.class);
		System.out.println(employee);
		
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println("Setter Injection "+employeeService.findAll().get(0).getFirstname());
		
		EmployeeService employeeService2 = context.getBean("employeeService2", EmployeeService.class);
		System.out.println("Constructor Injection "+employeeService2.findAll().get(0).getFirstname());
		
		EmployeeService employeeService3 = context.getBean("employeeService3", EmployeeService.class);
		System.out.println("Autowire by constructor "+employeeService3.findAll().get(0).getFirstname());
		
		EmployeeService employeeService4 = context.getBean("employeeService4", EmployeeService.class);
		System.out.println("Autowire by type "+employeeService4.findAll().get(0).getFirstname());
		
		EmployeeService employeeService5 = context.getBean("employeeService5", EmployeeService.class);
		System.out.println("Autowire by name "+employeeService5.findAll().get(0).getFirstname());
		
		EmployeeRepository employeeRepository = context.getBean("employeeRepository", EmployeeRepository.class);
		System.out.println(employeeRepository);
	}
}
