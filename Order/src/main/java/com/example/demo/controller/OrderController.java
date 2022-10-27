package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;
import com.example.demo.service.OrderService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
//	@GetMapping("/orders")
//	public Order getOrders()
//	{
//		log.info("CUSTOM log INFO order get");
//		return orderService.getServ();
//	}
	
	@GetMapping("/orders/{id}")
	public String getOrder(@PathVariable int id)
	{
		
		log.info("CUSTOM log INFO order get");
		return orderService.getOrder(id);
	}
	
	@GetMapping("/orders")
	public String getQP(@RequestParam(value="sort",required=false) String sortOrder,@RequestParam(value="page",defaultValue = "007") String page)
	{
		log.info("CUSTOM log INFO order get");
		return "Orders endpoint called with Sorting order " + sortOrder + " and page = " + page;
	}
	
	@GetMapping("/error")
	public void getOrderError()
	{
		
		log.info("CUSTOM log INFO order get Error function");
		int i = 10/0;
	}
	
	
	@PostMapping("order")
	public String postOrder()
	{
		log.debug("CUSTOM log DEBUG post order called");
		return orderService.postServ();
	}
	
	@PutMapping("order")
	public String putOrder()
	{
		log.warn("CUSTOM log WARN put order called");
		return orderService.putServ();
	}
	
	@DeleteMapping("order")
	public String delOrder()
	{
		log.error("CUSTOM log ERR delete order called");
		return orderService.delSrv();
	}

}







