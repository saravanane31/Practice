package com.saravanan.thread;

public class ProducerConsumer {

	public  void producer() throws InterruptedException{
		synchronized (this) {
			System.out.println("Started the Producer");
			wait();
			System.out.println("Resumeddd");
		}
		
	}
	
	public  void consumer() throws InterruptedException{
		Thread.sleep(2000);
		synchronized (this) {
			System.out.println("started the consumer method");
			notify();
			System.out.println("notify called");
			Thread.sleep(5000);
			System.out.println("after thread sleep");
		}
	}
}
