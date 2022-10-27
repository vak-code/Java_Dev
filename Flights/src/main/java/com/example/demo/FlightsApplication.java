package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FlightsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(FlightsApplication.class, args);
		String[] beanDefinitionNames = beanContext.getBeanDefinitionNames();
		
	//	for(String i : beanDefinitionNames)
			//System.out.println(i);
		
		
	}

}
