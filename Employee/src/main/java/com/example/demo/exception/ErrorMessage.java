package com.example.demo.exception;

import java.util.Date;

public class ErrorMessage {

	Date date;
	String errMsg;
	
	public ErrorMessage(Date date, String msg)
	{
		this.date = date;
		this.errMsg = msg;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
}
