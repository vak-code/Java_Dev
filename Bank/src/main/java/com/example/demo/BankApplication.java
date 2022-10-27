package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(BankApplication.class, args);
		
		String[] beanDefinitionNames = beanContext.getBeanDefinitionNames();
		
		Arrays.sort(beanDefinitionNames);
		
//		for(String i : beanDefinitionNames)
//			System.out.println(i);
		
		
	}

}
