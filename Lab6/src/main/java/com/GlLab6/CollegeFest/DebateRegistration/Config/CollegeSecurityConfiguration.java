package com.GlLab6.CollegeFest.DebateRegistration.Config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

public class CollegeSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		UserBuilder users= User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
		.withUser(users.username("Prisha").password("welcome").roles("STUDENT"))
		.withUser(users.username("Rishab").password("welcome").roles("PRINCIPAL"))
		.withUser(users.username("Puneet").password("welcome").roles("ADMIN"));	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests()
		.anyRequest().authenticated()
		.and()
		.formLogin()
		.loginPage("/LoginPage")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll();
	}

}
