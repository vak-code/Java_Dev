package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TicketsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(TicketsApplication.class, args);
		String[] beanDefinitionNames = beanContext.getBeanDefinitionNames();
		
//		for(String i : beanDefinitionNames)
//			System.out.println(i);
	}

}
