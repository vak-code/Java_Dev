package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Address;
import com.example.demo.beans.Customer;

@SpringBootApplication
public class SpringBootBeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(SpringBootBeanScopeApplication.class, args);

		Customer customer = beanContext.getBean(Customer.class);
		customer.setCustName("Aman");
		System.out.println(customer);

		Customer customer1 = beanContext.getBean(Customer.class);

		System.out.println(customer1);
		System.out.println(customer1.getCustName());
		
		
		Address address1 = beanContext.getBean(Address.class);
		address1.setCity("Mumbai");
		System.out.println(address1);

		Address address2 = beanContext.getBean(Address.class);
		System.out.println(address2.getCity());
		System.out.println(address2);
		
		System.out.println("Prototype inside Singleton:");
		
		System.out.println(customer.getAddress());
		System.out.println(customer1.getAddress());
	}

}
