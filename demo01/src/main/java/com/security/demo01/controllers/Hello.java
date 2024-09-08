package com.security.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	@GetMapping("/")
	public static String greet() 
	{
		return "<h1>Welcome Home </h1>";
	}

}
