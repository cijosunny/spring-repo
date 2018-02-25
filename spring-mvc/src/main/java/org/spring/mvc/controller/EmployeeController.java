package org.spring.mvc.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.spring.mvc.model.Employee;
import org.spring.mvc.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private IEmployeeService employeeService;
	
	@ModelAttribute("employee")
    public Employee formBackingObject() {
        return new Employee();
    }
	
	@GetMapping("/all")
	public String getEmployeeCreate(Locale locale,Model model) {
		model.addAttribute("employees", employeeService.findAllEmployee());
		return "index";
	}
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute("employee")@Valid Employee employee, BindingResult result, Model model){
		if (result.hasErrors()) {
            model.addAttribute("employees", employeeService.findAllEmployee());
            return "index";
        }
		employeeService.createEmployee(employee);
		return "redirect:/employee/all";
	}
}
