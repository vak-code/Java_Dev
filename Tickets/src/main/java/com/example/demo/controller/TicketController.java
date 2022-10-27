package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class TicketController {

	@Autowired
	TicketService tktServ;
	
	@GetMapping("ticket")
	public Ticket getTicket()
	{
		log.info("CUSTOM INFO get ticket");
		return tktServ.getTicketServ();
	}
	
	@GetMapping("error")
	public void getTicketError()
	{
		log.info("CUSTOM INFO get ticket Error function");
		int i = 10 / 0;
	}
	
	@PostMapping("ticket")
	public String postTicket()
	{
		log.debug("CUSTOM DEBUG post ticket");
		return tktServ.postTicketServ();
	}
	
	@PutMapping("ticket")
	public String putTicket()
	{
		log.warn("CUSTOM WARN put ticket");
		return tktServ.putTicketServ();
	}
	
	@DeleteMapping("ticket")
	public String delTicket()
	{
		log.error("CUSTOM ERR delete ticket");
		return tktServ.delTicketServ();
	}
	
}
