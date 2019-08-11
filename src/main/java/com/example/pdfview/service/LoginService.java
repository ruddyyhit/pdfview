package com.example.pdfview.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// TODO Auto-generated method stub
		return userid.equalsIgnoreCase("user")
				&& password.equalsIgnoreCase("12345");
	}

}
