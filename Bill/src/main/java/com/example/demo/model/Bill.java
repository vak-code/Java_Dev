package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

	Bill() {}
	
	@Id
	private Long billId;
	private double billAmt;
	private String billDate;
	
	public Bill(Long billId, double billAmt, String billDate)
	{
		this.billId = billId;
		this.billAmt = billAmt;
		this.billDate = billDate;
	}

	public Long getBillId() {
		return billId;
	}

	public void setBillId(Long billId) {
		this.billId = billId;
	}

	public double getBillAmt() {
		return billAmt;
	}

	public void setBillAmt(double billAmt) {
		this.billAmt = billAmt;
	}

	public String getBillDate() {
		return billDate;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	
	
}
