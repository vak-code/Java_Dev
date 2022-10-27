package com.example.demo.service.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.MovieType;

@Component
@Primary
public class ComedyMovie implements MovieType {

	@Override
	public String getMovie() {
		// TODO Auto-generated method stub
		return "COMEDY MOVIEw";
	}

}
