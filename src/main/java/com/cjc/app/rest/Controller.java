package com.cjc.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/welcome")
	public String welcome() {
		System.out.println("Inside welcome");
		return "inside Welcome";
	}
	
	@GetMapping(value = "/student")
	public void student() {
		System.out.println("Inside Student");
	}
	
	@GetMapping(value = "/greet")
	public void greet() {
		System.out.println("Inside Student");
	}
	
	@GetMapping(value = "/employee")
	public void employee() {
		System.out.println("Inside Student");
	}
}
