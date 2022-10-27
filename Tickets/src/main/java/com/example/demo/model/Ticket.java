package com.example.demo.model;


public class Ticket {

	private int tktNum;
	private String tktDate;
	
	public Ticket(int num, String date)
	{
		this.tktNum = num;
		this.tktDate = date;
	}

	public int getTktNum() {
		return tktNum;
	}

	public void setTktNum(int tktNum) {
		this.tktNum = tktNum;
	}

	public String getTktDate() {
		return tktDate;
	}

	public void setTktDate(String tktDate) {
		this.tktDate = tktDate;
	}
}
