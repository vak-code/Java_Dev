package com.example.demo.exception;
import java.util.Date;



public class ErrorMessage {

	private Date date;

	private String errorMsg;



	public ErrorMessage(Date date, String errorMsg) {

		this.date=date;

		this.errorMsg=errorMsg;

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