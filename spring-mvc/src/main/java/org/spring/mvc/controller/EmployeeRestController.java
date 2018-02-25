package org.spring.mvc.controller;

import java.util.List;

import org.spring.mvc.model.Employee;
import org.spring.mvc.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/employee/")
public class EmployeeRestController {
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping("/all")
	public List<Employee> getAllEmployees() {
		return employeeService.findAllEmployee();
	}
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee employee){
		employeeService.createEmployee(employee);
		return "index";
	}
}
