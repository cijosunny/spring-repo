package org.spring.basic.xmlanno;

import org.spring.basic.xmlanno.repository.EmployeeRepository;
import org.spring.basic.xmlanno.service.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);
		System.out.println(employeeService.findAll().get(0).getFirstname());;
		System.out.println(employeeService.findAllStudents().get(0).getFirstname());;
		System.out.println(employeeService.findAllCustomers().get(0).getFirstname());;
		
		EmployeeRepository employeeRepository = context.getBean("employeeRepository", EmployeeRepository.class);
		System.out.println(employeeRepository);
	}
}
