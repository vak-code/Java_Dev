package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);
		
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		
		Arrays.sort(beanDefinitionNames);
		
		for(String beanDefinitionName:beanDefinitionNames) {
			//System.out.println(beanDefinitionName);
		}
	}

}
