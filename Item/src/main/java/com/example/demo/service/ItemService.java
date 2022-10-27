package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.model.Item;

@Service
public class ItemService {

	@Value("${postMsg}")
	String postMsg;
	
	@Autowired
	Environment env;
	
	
	public Item getItemSrvc() {
		//return "Get Item from Service";
		return new Item("iPhone",999.99,"Apple");
	}

	public String postItemSrvc() {
		return postMsg;
	}

	public String putItemSrvc() {
		return env.getProperty("putMsg");
	}

	public String delItemSrvc() {
		return env.getProperty("delMsg");
	}

}
