package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Infra;

@Service
public class InfraService {

	@Value("${getMsg}")
	String getMsg;

	@Value("${delMsg}")
	String delMsg;
	
	@Autowired
	Environment env;

	public Infra getInfraSrvc() {
		//return getMsg;
		return new Infra(1234,"RAM");
	}

	public String postInfraSrvc() {
		return env.getProperty("postMsg");
	}

	public String putInfraSrvc() {
		return env.getProperty("putMsg");
	}
	
	
	public String delInfraSrvc() {
		return delMsg;
	}

}
