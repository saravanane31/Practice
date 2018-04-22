package com.saravanan.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor1 implements Runnable{
	
	private CountDownLatch latch;
	
	public Processor1(CountDownLatch latch) {
		// TODO Auto-generated constructor stub
		this.latch=latch;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("started");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("run completed");
		latch.countDown();
		System.out.println(latch.getCount());
		
	}
	
}

public  class CountDownLatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountDownLatch latch = new CountDownLatch(3);
		ExecutorService executor = Executors.newFixedThreadPool(3);
		for(int i=0;i<3;i++){
			executor.submit(new Processor1(latch));
		}
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Completed");
	}

}
