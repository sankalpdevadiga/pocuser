package com.pocuserproject.repository.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
	
	@RequestMapping("/helloUser")
	public String getUser() {
		return "Hello user";
	}
	
	@RequestMapping("/helloAdmin")
	public String getAdmin() {
		return "hello admin";
	}

}
