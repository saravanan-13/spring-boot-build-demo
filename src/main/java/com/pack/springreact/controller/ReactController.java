package com.pack.springreact.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReactController {

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/")
	public String getdata() {
		return "SUCCESS";
	}
}
