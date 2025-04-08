package com.likhith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashBoardController {

	@GetMapping("/dashboard")
	public String doGet() {
		System.out.println("This is dashboard");
		return "dashboard";
}
	}
