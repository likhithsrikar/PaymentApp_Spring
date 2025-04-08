package com.likhith.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DashBoardController {

	@Controller
	public class DashboardController {
		
		
	
		
		@RequestMapping("/addbankaccount")
		public String addBankAccount() {
			return "addBankAcc";
		}
		
		
		@RequestMapping("/statementrequest")
		public String editBankAccount() {
			return "statementrequest";
		}
		
		
	}
}
	 
