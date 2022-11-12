package com.GlLab6.CollegeFest.DebateRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
public class LoginController {
		
@GetMapping("/LoginPage")
	public String collegeLoginPage(){
		return "login";
}
}
