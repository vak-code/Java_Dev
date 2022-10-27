package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Order;

@SpringBootApplication
public class OrderBeanScopeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext beanContext = SpringApplication.run(OrderBeanScopeApplication.class, args);
		
		Order order1 = beanContext.getBean(Order.class);
		System.out.println("Order 1 = " + order1);
		System.out.println("Order 1 id = " + order1.getOrderId());
		System.out.println("Order 1 item = " + order1.getItem());
		order1.getItem().setItemId(100);
		order1.getItem().setItemPrice(100);
		System.out.println("Order 1 item values = " + order1.getItem().getItemId() + " " + order1.getItem().getItemPrice());
		
		order1.setOrderId(101);
		Order order2 = beanContext.getBean(Order.class);
		System.out.println("Order 2 = " + order2);
		System.out.println("Order 2 id = " + order2.getOrderId());
		System.out.println("Order 2 item = " + order2.getItem());
		System.out.println("Order 1 item values = " + order2.getItem().getItemId() + " " + order2.getItem().getItemPrice());
		
	}

}
