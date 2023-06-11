package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.greatlearning.pojo.Employee;



@Controller
@RequestMapping("/employee")// we can write full url on the method also, instead of writing like this
public class EmployeeController {

	@RequestMapping("/registrationForm")
	public String showRegistrationForm(ModelMap model) {

		Employee employee = new Employee();

		model.addAttribute("employeeModel", employee);
		return "employee-form";
	}

	// The @ModelAttribute annotation refer to the property of the model object and
	// is used
	// to prepare the model data. This annotation bind a method variable or the
	// model object to a named
	// model attribute
	@RequestMapping("/processForm")
	public String showProcessForm(@ModelAttribute("employeeModel") Employee employee) {
		
		return "registration-confirmation";
	}
}
