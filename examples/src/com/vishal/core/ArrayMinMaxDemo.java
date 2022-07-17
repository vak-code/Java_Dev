package com.vishal.core;

public class ArrayMinMaxDemo {

	//finding min and max value from an array of 10
	public static void main(String[] args)
	{
		int min,max;
		int[] intArr=new int[10];
		
		intArr[0]=98;
		intArr[1]=-30;
		intArr[2]=10938;
		intArr[3]=746;
		intArr[4]=0;
		intArr[5]=-340;
		intArr[6]=4;
		intArr[7]=-43;
		intArr[8]=444;
		intArr[9]=323;
		
		min = max = intArr[0];
		
		for(int i=1;i<intArr.length;i++)
			if(min>intArr[i])
				min=intArr[i];
			else if(max<intArr[i])
				max=intArr[i];
		
		System.out.println("Min : "+min+" Max : "+max);
						
	}
	
}
