package com.in28minutes.rest.webservices.restfulwebservics.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloWorldController {
	
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

}
