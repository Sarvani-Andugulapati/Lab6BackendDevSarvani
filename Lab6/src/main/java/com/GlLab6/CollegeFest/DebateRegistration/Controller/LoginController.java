package com.GlLab6.CollegeFest.DebateRegistration.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
@GetMapping("/LoginPage")
	public String collegeLoginPage(){
		return "login";
}
}
