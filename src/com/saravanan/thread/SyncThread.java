package com.saravanan.thread;

public class SyncThread {

	private int count =0;
	
	private synchronized void increment(){
		count++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SyncThread syn=new SyncThread();
		syn.doWork();
	}

	private void doWork(){
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					increment();
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				for(int i=0;i<10000;i++){
					increment();
				}
				
			}
			
		});
		
		t1.start();
		/*
		try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("count is"+count);
	}
}
