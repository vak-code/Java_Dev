//package com.example.demo.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@Configuration
//public class BillSecurityConfiguration extends WebSecurityConfigurerAdapter
//{
//	protected void configure(HttpSecurity http) throws Exception
//	{
//		http.authorizeRequests((requests) -> requests.anyRequest().authenticated());
//		http.httpBasic();
//		http.formLogin();
//		http.csrf().disable();
//	}
//}