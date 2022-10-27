package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("singleton")
@Component
public class Customer {

	private int id;
	
	@Autowired
	private WishList wl;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public WishList getWl() {
		return wl;
	}

	public void setWl(WishList wl) {
		this.wl = wl;
	}

}
