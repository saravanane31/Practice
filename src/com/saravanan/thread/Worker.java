package com.saravanan.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	
	private Random random = new Random();
	
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inside worker......");
		Worker worker = new Worker();
		worker.startThread();
		
	}

	private void startThread(){
		long start = System.currentTimeMillis();
		//process();
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				process();
				
			}
			
		});
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				process();
				
			}
			
		});
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		System.out.println(list1.size()+"==="+list2.size());
	}
	
	private void process(){
		for(int i=0;i<1000;i++){
			stageProcess1();
			stageProcess2();
		}
	}
	
	private void stageProcess1(){
		
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
		
	}
	
	private void stageProcess2(){
		
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list2.add(random.nextInt(100));
		}
		
	}
}
