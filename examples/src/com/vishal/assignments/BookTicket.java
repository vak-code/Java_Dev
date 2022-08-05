package com.vishal.assignments;

import com.vishal.classobjects.objects.Bank;

//This class makes use of Ticket system class
public class BookTicket {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		
		bank.setBankID(01);
		bank.setBankName("SBI");
		
		Bank bank2 = new Bank();
		
		bank2.setBankID(02);
		bank2.setBankName("SBI");
		
		System.out.println("bank1 : " + bank.getBankID() + " " + bank.getBankName());
		System.out.println("bank2 : " + bank2.getBankID() + " " + bank2.getBankName());
		System.out.println("hash : " + bank.hashCode());
		System.out.println("hash : " + bank2.hashCode());
		System.out.println("equals : " + bank.equals(bank2));
	}

}
