//package com.example.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class AccountSecurityConfig extends WebSecurityConfigurerAdapter{
//
//	protected void configure(HttpSecurity http) throws Exception {
//		
//		http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
//		http.formLogin();
//		http.httpBasic();
//		http.csrf().disable();
//	}
//}
