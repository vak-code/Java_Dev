package com.example.demo.exception;

import java.util.Date;

public class ExceptionMessage {

	private Date date;
	private String msg;
	
	public ExceptionMessage() {}
	
	public ExceptionMessage(Date date, String msg) 
	{
		this.date = date;
		this.msg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
