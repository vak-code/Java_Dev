package com.vishal.classobjects;

class CBR
{
	int a, b;
	
	CBR(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	void change(CBR ob)
	{
		ob.a = ob.a + ob.a;
		ob.b = ob.b - 2;
	}
}

public class CallByRefDemo {

	public static void main(String[]  args)
	{
		CBR ob = new CBR(10, 20);
		
		System.out.println("ob. a = " + ob.a + " ob.b = " + ob.b);
		
		ob.change(ob);
		
		System.out.println("ob. a = " + ob.a + " ob.b = " + ob.b);
	}
	
}
