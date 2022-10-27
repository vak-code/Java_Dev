package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Flight;

@Service
public class FlightService {

	@Value("${delMsg}")
	String delMsg;
	
	@Autowired
	Environment env;
	
	public Flight getFlightServ() {
		//return "Get Flights from Service";
		return new Flight(1234,"Mumbai","Delhi");

	}

	public String postFlightServ() {
		return env.getProperty("postMsg");

	}

	public String putFlightSrv() {
		return env.getProperty("putMsg");

	}

	public String delFlightServ() {
		return delMsg;

	}

	
}
