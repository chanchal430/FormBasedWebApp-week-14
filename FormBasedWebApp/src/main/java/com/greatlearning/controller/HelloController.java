package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	// how to use model - used to transfer data between different layers of our web application(like from code to UI)

	// Model, ,,ModelMap and ModelAndView to define a model in spring mvc
	// Model --> used to add attributes to the model
	// ModelMap --> defines a holder for model attributes and is primarily designed
	// for adding attributes
	// ModelAndView --> holder for Model and View template

	@RequestMapping("/hello")
	public String welcome(ModelMap model) {//holder for model attribute and adds attributes to the model

		model.addAttribute("message", "hello and welcome to the project"); //name of the attribute and its value as parameters respectively
		return "hello";
	}
}
