package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ticket;

@Service
public class TicketService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	public Ticket getTicketServ() {
		return new Ticket(1234,"31-aug-2022");
	}

	public String postTicketServ() {
		return postMsg;
	}

	public String putTicketServ() {
		return env.getProperty("putMsg");
	}

	public String delTicketServ() {
		return env.getProperty("delMsg");
	}

}
