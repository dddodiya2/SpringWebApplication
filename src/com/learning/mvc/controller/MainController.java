package com.learning.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.mvc.model.Student;

@Controller
public class MainController {

	@RequestMapping("/")
	public String homePage() {
		return "home";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "StudentForm";
	}

	@RequestMapping("/processForm")
	public String processForm(HttpServletRequest request, Model model) {
		
		Student student = new Student();
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		
		model.addAttribute("student", student); 		
		
		return "confirmationPage";
	}
	
	//pre-processing for data binding
	@InitBinder
	public void initBinder(WebDataBinder databinder) {
		System.out.println("Init binder method called");
		StringTrimmerEditor stringEditor = new StringTrimmerEditor(true);
		databinder.registerCustomEditor(String.class, stringEditor);
	}
	
	
	@RequestMapping("/showForm1")
	public String showForm1(Model model) {		
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "StudentForm1";
	}
	
	@RequestMapping("/processForm1")
	public String processForm1(@Valid @ModelAttribute("student") Student theStudent, BindingResult validationResult ) {
		
		//if error then show StudentForm1
		// if no error then show confirmation page
		
		if(validationResult.hasErrors()) {
			return "StudentForm1";
		}else {		
			
			///I can add some more data to model ..... and send it to next page 
			///Data specific to form as well		
			
			return "confirmationPage1";
		}
		
	}
	
}
