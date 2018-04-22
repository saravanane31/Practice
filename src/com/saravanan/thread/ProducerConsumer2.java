package com.saravanan.thread;

import java.util.LinkedList;

public class ProducerConsumer2 {
	
	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT =10;
	private Object lock = new Object();

	public void producer() throws InterruptedException{
		int value=0;
		while(true){
			
			
			synchronized (lock) {
				while(list.size()==LIMIT){
					lock.wait();
				}
				list.add(value++);
				lock.notify();
			}
		}
	}
	
	public void consumer() throws InterruptedException{
		while(true){
			synchronized (lock) {
				while(list.size()==0){
					lock.wait();
				}
				int value = list.removeFirst();
				System.out.println("List Size=="+list.size());
				System.out.println("removed Value=="+value);
				lock.notify();
			}
			Thread.sleep(1000);
		}
		
	}
}
