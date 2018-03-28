package com.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Login")
public class LoginController {

	@RequestMapping("/login")
	public String login(){
		
		
		return "login/login.jsp";
		
	}
}
