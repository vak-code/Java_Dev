package com.example.demo.model;

public class User {
	String userName;
	String userType;

	public String getUserType() {
		return userType;
	}

	public String getUserName() {
		return userName;
	}

	public User(String userName, String userType) {
		this.userName = userName;
		this.userType = userType;
	}

}
