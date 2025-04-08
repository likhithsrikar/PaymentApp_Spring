package com.likhith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.likhith.entities.UserEntity;
import com.likhith.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
		
		
		@Autowired
		UserService userService;
		
		@GetMapping("/login")
		public String loginPage(){
			return "login";
		}
		
		@PostMapping("/login")
		public String loginUser(
				@RequestParam(name = "username") String username,
				@RequestParam(name = "password") String password,
				Model model,HttpSession session
				){
			UserEntity loggedInUser=userService.validateUser(username, password);
			
			if(loggedInUser!=null) {
				session.setAttribute("userId", loggedInUser.getUser_id());
				session.setAttribute("username", loggedInUser.getUser_name());
				
				return "redirect:/dashboard";
			}else {
				return "login";
			}
		
		
		
	}
		}