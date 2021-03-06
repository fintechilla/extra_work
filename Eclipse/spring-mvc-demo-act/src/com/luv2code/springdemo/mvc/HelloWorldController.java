package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	// need a controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
		
	}
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
//		System.out.println();
		return "helloworld";
	}
	// new controller method to read form data and
	// add data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		// convert the data to all caps
		theName = theName.toUpperCase();
		System.out.println("theName a/toUpper= " + theName);
		// create message
		String result = "Yo! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		System.out.println("message: " + model.getAttribute("message"));
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();
		System.out.println("theName a/toUpper= " + theName);
		// create message
		String result = "Hey My Friend from v3! " + theName;
		// add message to the model
		model.addAttribute("message", result);
		System.out.println("message: " + model.getAttribute("message"));
		return "helloworld";
	}

}
