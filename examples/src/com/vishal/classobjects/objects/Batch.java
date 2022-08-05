package com.vishal.classobjects.objects;

public class Batch {

	private int batchID;
	private char batchStatus;
	
	public void runBatch()
	{
		System.out.println("Batch started successfully");
	}

	public void deleteBatch()
	{
		System.out.println("Batch deleted");
	}
	
	public int getBatchID() {
		return batchID;
	}

	public void setBatchID(int batchID) {
		this.batchID = batchID;
	}

	public char getBatchStatus() {
		return batchStatus;
	}

	public void setBatchStatus(char batchStatus) {
		this.batchStatus = batchStatus;
	}
	
}
