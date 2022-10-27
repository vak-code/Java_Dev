package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.MovieType;

@RestController
public class MovieDIController {

	@Autowired
	@Qualifier("drama")
	MovieType movieType;
	
	@GetMapping
	public String getMovie()
	{
		return movieType.getMovie();
	}
}
