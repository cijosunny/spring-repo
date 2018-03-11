package org.spring.basic.java;

import org.spring.basic.java.repository.EmployeeRepository;
import org.spring.basic.java.service.CustomerService;
import org.spring.basic.java.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		/*------------- Using Setter Injection -------------*/
		CustomerService customerService = context.getBean("customerService", CustomerService.class);
		System.out.println(customerService.findAll().get(0));
		/*------------- Using Setter Injection -------------*/
		
		/*------------- Using Constructor Injection -------------*/
		CustomerService customerService2 = context.getBean("customerService2", CustomerService.class);
		System.out.println(customerService2.findAll().get(0).getFirstname());
		/*------------- Using Constructor Injection -------------*/
		
		
		/*------------- Using Autowiring -------------*/
		System.out.println("Member Variable Injection");
		System.out.println(customerService.findAllStudentsBean().get(0));
		System.out.println(customerService.findAllStudentsBeanQualifier().get(0));
		System.out.println(customerService.findAllStudentsAutowireQualifier().get(0));
		
		System.out.println("Setter autowiring");
		System.out.println(customerService.findAllEmployees().get(0));
		System.out.println(customerService.findAllEmployeesSetterAutowireQualifier().get(0));
		/*------------- Using Autowiring -------------*/
		
		/*--------- Service & Repository Autowired ----------*/
		System.out.println("@Service & @Repository & @Configuration,@ComponentScan({package1,package2})");
		UserService userService = context.getBean("userService", UserService.class);
		System.out.println(userService.findAllUsers().get(0));
		/*--------- Service & Repository Autowired ----------*/
		
		
		/*---------------- Bean Scopes--------------------*/
		UserService userService2 = context.getBean("userService", UserService.class);
		System.out.println(userService2);
		
		UserService userService3 = context.getBean("userService", UserService.class);
		System.out.println(userService3);
		/*---------------- Bean Scopes--------------------*/
		
		EmployeeRepository employeeRepository = context.getBean("employeeRepository2", EmployeeRepository.class);
		System.out.println(employeeRepository);
		
	}
}
