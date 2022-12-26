package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitBreakerController {

private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/test-api")
	@CircuitBreaker(name="test-api", fallbackMethod = "fallbackResponse")
	public String testCall() {
		logger.info("test api called");
		
		ResponseEntity<String> responseEntity = new RestTemplate().getForEntity("http://localhost:8099", String.class);
		
		return responseEntity.getBody();
	}
	
	public String fallbackResponse(Exception ex) {
		return "Fallback called";
	}
}
