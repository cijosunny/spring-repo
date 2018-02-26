package org.spring.refer.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml","dao.xml");
		Employee employee = context.getBean("sam",Employee.class);
		System.out.println(employee);
	}
}
