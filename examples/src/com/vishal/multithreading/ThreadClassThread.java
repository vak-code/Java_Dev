package com.vishal.multithreading;

public class ThreadClassThread {

	public static void main(String[] args) {
		
		ThreadClass myThread = new ThreadClass();
		
		for(int i=0; i<10 ; i++)
		{
			myThread = new ThreadClass();
			myThread.start();
			System.out.println("Thread STARTED isAlive " + myThread.isAlive());
			System.out.println("Thread STARTED activeCount " + myThread.activeCount());
			System.out.println("Thread STARTED getId " + myThread.toString());
		}
	}
}

 class ThreadClass extends Thread
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