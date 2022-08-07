package com.example.demo.controller;


import java.util.logging.Logger;
import java.util.logging.Level;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {
	
	Logger log = Logger.getLogger(LoggingController.class.getName());
	@GetMapping
	public String getMethod()
	{
		log.info("INFO Custom info");
		log.log(Level.WARNING,"String");
		log.log(Level.ALL,"For ALL");
		log.log(Level.OFF,"turning off");
		return "Get";
	}

}
