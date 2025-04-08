package com.likhith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddBankAccController {
	
	@GetMapping("/addbankaccount")
	public String doGet() {
		System.out.println("This is adding bank account method");
		return "addbankaccount";

}
}
