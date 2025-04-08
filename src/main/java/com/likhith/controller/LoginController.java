package com.likhith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String doGet() {
		System.out.println("This is login method");
		return "login";
	}
		}