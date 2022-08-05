package com.vishal.assignments;

public class SumOfDigits {

	
	  public int getSum(int num) { 
		  
			int temp=0, sum=0;
			num = Math.abs(num);
			while(num >= 10)
			{
				temp = num % 10;
				num -= temp;
				num /= 10;
				sum += temp;
				System.out.println(temp + " " + sum + " " + num);
			}
			sum += num;
			System.out.println(sum);
			return sum;
		  
	  }
	   
	
		/*
		 * public static void main(String[] args) {
		 * 
		 * int digit = 12345, temp, sum=0;
		 * 
		 * while(digit >= 10) { temp = digit % 10; digit -= temp; digit /= 10; sum +=
		 * temp; System.out.println(temp + " " + sum + " " + digit); } sum += digit;
		 * System.out.println(sum); }
		 */
}

