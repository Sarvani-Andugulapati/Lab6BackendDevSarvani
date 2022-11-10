package com.GlLab6.CollegeFest.DebateRegistration.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollegeController {
	@GetMapping("/")
	public String showHome() {
		return "home";
	}

}
