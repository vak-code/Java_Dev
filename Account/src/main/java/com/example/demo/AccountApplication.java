package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AccountApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(AccountApplication.class, args);
		
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		
		Arrays.sort(beanDefinitionNames);
		for(String i : beanDefinitionNames)
		{
		//	System.out.println(i);
		}
	}

}
