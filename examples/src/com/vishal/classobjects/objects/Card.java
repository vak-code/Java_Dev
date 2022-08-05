package com.vishal.classobjects.objects;

import java.util.Objects;

public class Card {

	private int cardNumber;
	private char cardType;
	private Account account;
	
	public void issueCard()
	{
		System.out.println("Card issued!");
	}
	
	public void debitCard(double amount)
	{
		double tempBal = this.account.getBalance();
		tempBal -= amount;
		this.account.setBalance(tempBal);
		System.out.println("Card debited");
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public char getCardType() {
		return cardType;
	}

	public void setCardType(char cardType) {
		this.cardType = cardType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	@Override
	public int hashCode()
	{
		return Objects.hash(this.cardNumber, this.cardType, this.account);
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(o == null)
			return false;
		if(!(o instanceof Card))
			return false;
		if(o == this)
			return true;
		
		Card temp = (Card) o;
		
		return (this.cardNumber == temp.cardNumber && this.cardType == temp.cardType && this.account.equals(temp.account));
		
	}
}
