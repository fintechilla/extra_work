package com.in28minutes.rest.webservices.restfulwebservics.versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonVersioningController {
	
	//URI versioning
	@GetMapping(path="v1/person")
	public PersonV1 personV1() {
		return new PersonV1("Bob Charlie");
	}
	@GetMapping(path="v2/person")
	public PersonV2 peronV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Request Parameter versioning
	//http://localhost:8080/person/param?version=1
	@GetMapping(value="/person/param", params="version=1")
	public PersonV1 paramV1() {
		return new PersonV1("Bob Charlie");
	}
	@GetMapping(value="/person/param", params="version=2")
	public PersonV2 paramV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Header param
	//http://localhost:8080/person/header
	//Key: X-API-VERSION Value:2
	@GetMapping(value="/person/header", headers="X-API-VERSION=1")
	public PersonV1 headerV1() {
		return new PersonV1("Bob Charlie");
	}
	@GetMapping(value="/person/header", headers="X-API-VERSION=2")
	public PersonV2 headerV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}
	
	//Media type versioning - 
	//Produces a.k.a "context versioning" or "accept header" aka mime type versioning
	//http://localhost:8080/person/produces
	//key: Accept, value: application/vnd.company.app-v1+json 
	@GetMapping(value="/person/produces", produces="application/vnd.company.app-v1+json")
	public PersonV1 producesV1() {
		return new PersonV1("Bob Charlie");
	}
	@GetMapping(value="/person/produces", produces = "application/vnd.company.app-v2+json")
	public PersonV2 producesV2() {
		return new PersonV2(new Name("Bob", "Charlie"));
	}

}
