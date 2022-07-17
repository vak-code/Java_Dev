package com.vishal.core;

public class ArrayInitializerMinMaxDemo {
	//Using a different way to initialize array values
	public static void main(String[] args)
	{
		int min,max,i;
		int[] intArr= {20,-44,0,48,4884,-84849,94,9775,2,-3};
		
		min = max = intArr[0];
		
		for(i=1;i<intArr.length;i++)
		{
			if(min>intArr[i])
				min=intArr[i];
			if(max<intArr[i])
				max=intArr[i];
		}
		
		System.out.println("Min : "+min+" Max : "+max);
		
	}
}
