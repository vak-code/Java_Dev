package com.vishal.singleton;

public class SingletonClass {

	private String value;
	private  SingletonClass singleClassObject ;
	
	private SingletonClass()
	{
		if(singleClassObject!=null)
			singleClassObject = singleClassObject;
	}
	
	public   SingletonClass getInstance()
	{
			synchronized(this)
			{
				if(this.singleClassObject == null)
				{
					this.singleClassObject = new SingletonClass();
					return this.singleClassObject;
				}
				else
					return this.singleClassObject;
			}
			
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}
	
	public void showValue()
	{
		System.out.println("Value is = "+value);
	}
}
