package org.spring.basic.java;

import org.spring.basic.java.repository.CustomerRepository;
import org.spring.basic.java.repository.CustomerRepositoryImpl;
import org.spring.basic.java.repository.EmployeeRepository;
import org.spring.basic.java.repository.EmployeeRepositoryImpl;
import org.spring.basic.java.repository.StudentRepository;
import org.spring.basic.java.repository.StudentRepositoryImpl;
import org.spring.basic.java.service.CustomerService;
import org.spring.basic.java.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"org.spring.basic.java"})
@PropertySource("application.properties")
public class AppConfig {
	@Bean(name = "customerService")
	public CustomerService getCustomerService(){
		/***
		 * Setter Injection
		 */
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}
	
	@Bean(name = "customerService2")
	public CustomerService getCustomerService2(){
		/***
		 * Constructor Injection
		 */
		return new CustomerServiceImpl(getCustomerRepository());
	}
	
	@Bean(name = "customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new CustomerRepositoryImpl();
	}
	/*------------ Two @Bean and one @Repository annotation of StudentRepository  -----------------*/
	@Bean(name = "studentRepository")
	public StudentRepository getStudentRepository(){
		return new StudentRepositoryImpl("First");
	}
	
	@Bean(name = "studentRepository2")
	public StudentRepository getStudentRepository2(){
		return new StudentRepositoryImpl("Second");
	}
	/*------------ Two @Bean and one @Repository annotation of StudentRepository  -----------------*/
	
	/*------------ One @Bean and One @Repository annotation of EmployeeRepository ------------------*/
	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository(){
		return new EmployeeRepositoryImpl();
	}
	/*------------ One @Bean and One @Repository annotation of EmployeeRepository ------------------*/
	
	
	/*--------------For Reading From Property File----------------*/
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	/*--------------For Reading From Property File----------------*/
}
