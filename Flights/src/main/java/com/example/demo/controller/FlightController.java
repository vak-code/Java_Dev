package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@RestController
public class FlightController {
	
	@Autowired
	FlightService flightServ;
	
	@GetMapping("flight")
	public Flight getFlight()
	{
		log.info("CUSTOM INFO get flights");
		return flightServ.getFlightServ();
	}
	
	@GetMapping("error")
	public void getFlightError()
	{
		log.info("CUSTOM INFO get flights ERROR");
		Flight f = null;
		f.getFlightNumber();
	}
	
	@PostMapping("flight")
	public Flight postFlight(@RequestBody Flight flight)
	{
		Flight newFlight = new Flight();
		
		newFlight.setFlightNumber(flight.getFlightNumber());
		newFlight.setFromCity(flight.getToCity());
		newFlight.setToCity(flight.getFromCity());
		
		log.debug("CUSTOM DEBUG post flight");
		return newFlight;
		//return flightServ.postFlightServ();
	}
	
	@PutMapping("flight")
	public String putFlight()
	{
		log.warn("CUSTOM WARN put flight");
		return flightServ.putFlightSrv();
	}
	
	@DeleteMapping("flight")
	public String delFlight()
	{
		log.error("CUSTOM ERR delete flight");
		return flightServ.delFlightServ();
	}

}
