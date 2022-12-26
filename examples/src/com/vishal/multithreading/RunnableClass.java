package com.vishal.multithreading;

public class RunnableClass {

	public static void main(String[] args) {
		
		Thread myThread ;
		
		for(int i=0; i<10 ; i++)
		{
			myThread = new Thread(new RunnacleClassThread());
			myThread.start();
			System.out.println("Thread STARTED isAlive " + myThread.isAlive());
			System.out.println("Thread STARTED activeCount " + myThread.activeCount());
			System.out.println("Thread STARTED getId " + myThread.toString());
		}
	}
}

class RunnacleClassThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread running activeCount " + Thread.activeCount());
		System.out.println("Thread running currentThread " + Thread.currentThread());
		Thread.yield();
		System.out.println("Thread running + " + Thread.MAX_PRIORITY);
		System.out.println("Thread running getAllStackTraces " + Thread.getAllStackTraces());
	}
}