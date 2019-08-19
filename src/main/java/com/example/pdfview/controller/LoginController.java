package com.example.pdfview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.pdfview.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
@SessionAttributes("name")
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	
	@RequestMapping(value="/login",
			method =RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
			return "login";
		
	}
	
	@RequestMapping(value="/login",
			method=RequestMethod.POST)
	public String showViewPage(ModelMap model,
			@RequestParam String name,
			@RequestParam String password) {
		boolean isValidUser = service.validateUser(name,password);
			if(!isValidUser) {
				model.put("errorMessage", "Invalid Credentials");
				return "login";
			}
			model.put("name", name);
			model.put("password", password);
		return "viewpage";
	}
	
	
}
