package com.example.demo.exception;

import java.util.Date;

public class ErrorMessage {

	Date date;
	String errorMsg;
	
	public ErrorMessage(Date date, String e)
	{
		this.date = date;
		this.errorMsg = e;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
	
}
