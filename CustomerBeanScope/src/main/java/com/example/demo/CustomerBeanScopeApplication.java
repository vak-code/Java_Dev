package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Customer;

@SpringBootApplication
public class CustomerBeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(CustomerBeanScopeApplication.class, args);
		
		Customer c1 = beanContext.getBean(Customer.class);
		Customer c2 = beanContext.getBean(Customer.class);
		
		c1.setId(123);
		c1.getWl().setWishId(123);
		c1.getWl().setWishStr("Peace");
		
		System.out.println("customer c1 = " + c1);
		System.out.println("customer c2 = " + c2);
		
		System.out.println();
		
		System.out.println("c1.get ID = " + c1.getId());
		System.out.println("c2.get ID = " + c2.getId());
	
		
		System.out.println();
		
		System.out.println("c1.getWl().getWishId = " + c1.getWl().getWishId());
		System.out.println("c1.getWl().getWishStr = " + c1.getWl().getWishStr());
		System.out.println();
		System.out.println("c2.getWl().getWishId = " + c2.getWl().getWishId());
		System.out.println("c2.getWl().getWishStr = " + c2.getWl().getWishStr());
	}

}
