package com.vishal.strings;

//Using string in switch case
public class StringSwitch {
	
	public static void main(String[] args)
	{
		String command  = "cancel";
		
		switch (command)
		{
		
		case "connect":
			
			System.out.println("Connecting...");
			break;
		
		case "cancel":
			
			System.out.println("Cancelling...");
			break;
			
		case "disconnect":
			
			System.out.println("disconnecting...");
			break;
			
		default:
			
			System.out.println("Command Error...");
			break;
			
		
		}
	}

}
