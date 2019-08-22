package com.pack.springreact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.pack.springreact.model.User;
import com.pack.springreact.service.UserService;

@RestController
public class ReactController {

	@CrossOrigin(origins = "*")
	@GetMapping("/")
	public String getdata() {
		return "Hello";
	}
}
