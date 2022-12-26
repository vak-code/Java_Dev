package com.vishal.assignments;

public class ReverseDigits {

//	private int temp = 0;
//	String reverse = "";
//	
//	public String getReverse(int num)
//	{
//		//num = num
//		
//		while(num >= 10)
//		{
//			temp = num % 10;
//			num -= temp;
//			num /= 10;
//			
//			reverse += temp;
//			System.out.println(num + " |  " + temp + " | " + reverse);
//		}
//
//		reverse += num;
//		
//		System.out.println("Rev : " + reverse);
//		return reverse;
//	}
	
	
	public static void main(String[] args) {
		
		int num = 1234567899;
		
		int reversed =0, temp =0;
		
		while(num != 0)
		{
			temp = num % 10;
			num /= 10;
			
			System.out.println("temp = " + temp + " num = " + num + " reversed = " + reversed);
			
			if(reversed >= Integer.MAX_VALUE/10 )
				break;
			
			if(reversed <= Integer.MIN_VALUE/10 )
				break;
			
			reversed = (reversed * 10) + temp;
			System.out.println("temp = " + temp + " num = " + num + " reversed = " + reversed);
			System.out.println();
				
		}
		
		System.out.println("Integer.MAX_VALUE = "+ Integer.MAX_VALUE/10);
		System.out.println("Integer.MAX_VALUE = "+ Integer.MIN_VALUE/10);
		System.out.println(reversed);
	}
	
}

//998765432
//1397719729
//
//214748364
//214748364
