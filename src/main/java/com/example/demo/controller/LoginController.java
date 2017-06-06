package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	
	@RequestMapping(value="login",method = RequestMethod.POST) 
	public String login(@RequestParam ("username") String username,@RequestParam ("username") String password,HttpServletRequest request, HttpServletResponse response) {
		if(username.equals("mathesh")&&password.equals("mathesh")) {
			 HttpSession session = request.getSession();
			    String user = (String)request.getAttribute("username");
			    session.setAttribute("UserName", user);
			
			return "/home";	
		}
		else {
			return "error";
		}
		
	}
	@RequestMapping(value="logout") 
	public String logout(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();  
	     session.invalidate();  
	     return "login";  
		}
	
}
