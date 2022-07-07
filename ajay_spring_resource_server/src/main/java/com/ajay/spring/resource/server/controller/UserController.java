package com.ajay.spring.resource.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/api/user")
	public String[] getUsers() {
		return new String[] {"ajay","divya","vijender"};
	}
}
