package com.example.demo.model;

public class Order {

	private int orderId;
	private String orderStatus;
	
	public Order(int orderId, String status)
	{
		this.orderId = orderId;
		this.orderStatus = status;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
}
