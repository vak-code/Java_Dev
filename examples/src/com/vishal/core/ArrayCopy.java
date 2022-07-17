package com.vishal.core;

//Class to copy one array to other
public class ArrayCopy {

	
	//this is main method from where the execution starts
	public static void main(String[] args)
	{
		//declaring a counter and 2 arrays
		int i;
		int[] arr1=new int[10];
		int[] arr2=new int[10];
		
		for(i=0;i<arr1.length;i++)
			arr1[i]=i*2;
		
		//copying arr1 to arr2
		if(arr2.length>=arr1.length)
			for(i=0;i<arr2.length;i++)
				arr2[i]=arr1[i];
		
		for(i=0;i<arr2.length;i++)
			System.out.print(arr2[i]+" ");
	}
}
