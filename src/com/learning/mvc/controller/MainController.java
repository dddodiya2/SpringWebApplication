package com.learning.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping("/showForm1")
	public String showForm1(Model model) {		
		Student theStudent = new Student();
		model.addAttribute("student", theStudent);
		return "StudentForm1";
	}
	
	@RequestMapping("/processForm1")
	public String processForm1(@ModelAttribute("student") Student theStudent) {
		System.out.println("The Student is : " + theStudent.getFirstName() + " " + theStudent.getLastName());
		return "confirmationPage1";
	}
	
}
