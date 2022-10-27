package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.demo.service.MovieType;

@Component
@Qualifier("drama")
public class DramaMovie implements MovieType {

	@Override
	public String getMovie() {
		// TODO Auto-generated method stub
		return "DRAMA MOVIEW";
	}

}
