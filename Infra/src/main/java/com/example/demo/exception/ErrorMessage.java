package com.example.demo.exception;

import java.util.Date;

public class ErrorMessage {

	private Date date;
	private String errMsg;
	
	public ErrorMessage(Date date, String errMsg)
	{
		this.date = date;
		this.errMsg = errMsg;
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
