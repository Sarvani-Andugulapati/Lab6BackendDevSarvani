package com.GlLab6.CollegeFest.DebateRegistration.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.GlLab6.CollegeFest")
public class CollegeConfig {
	
	@Bean
	public ViewResolver viewresolver() {
		InternalResourceViewResolver viewresolver= new InternalResourceViewResolver();
		
		viewresolver.setPrefix("/WEB-INF/views/");
		viewresolver.setSuffix(".jsp");
	}

}
