package com.saravanan.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Processor implements Runnable{
	
	private Object lock = new Object();
	public static int finalOutput=0;
	private int i;
	
	public Processor(int i) {
		// TODO Auto-generated constructor stub
		this.i =i;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("starting-----"+i);
		//synchronized (lock) {
			finalOutput=finalOutput+i;
			System.out.println("finaloutput=="+finalOutput);
		//}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ending----"+i);
	}
	
}

public class ThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newFixedThreadPool(2);
		int[] array = {50,20,100,30};
		for(int i=0;i<4;i++){
			executor.submit(new Processor(array[i]));
		}
		
		executor.shutdown();
		System.out.println("All task submitted");
		
		try {
			executor.awaitTermination(100, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("All task Executed");
		System.out.println("Processor FinalOutput value =="+Processor.finalOutput);
	}

}
