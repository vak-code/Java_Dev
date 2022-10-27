package com.example.demo.exception;

import java.util.Date;

public class ErrorMsg {

	Date date;
	String msg;
	
	public ErrorMsg(Date date, String msg)
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
