package com.in28minutes.rest.webservices.restfulwebservics.helloworld;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.webservices.restfulwebservics.user.User;
import com.in28minutes.rest.webservices.restfulwebservics.user.UserDaoService;

//Controller
@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	//GET method
	//URI - /hello-world
	//method - "Hello World"
	//@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	@GetMapping(path="/hello-world") 
	public String helloWorld() {
		return "Hello World 2";
		
	}
	
	@GetMapping(path="/hello-world-bean") 
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World Bean");
		
	}
	@GetMapping(path="/hello-world/path-variable/{name}") 
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
		
	}

	@GetMapping(path="/hello-world-internationalized") 
	public String helloWorldInternationalized(@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageSource.getMessage("good.morning.message", null, LocaleContextHolder.getLocale());
	}
}
