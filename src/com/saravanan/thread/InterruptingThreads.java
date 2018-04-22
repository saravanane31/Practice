package com.saravanan.thread;

public class InterruptingThreads extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			System.out.println(i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterruptingThreads t1 = new InterruptingThreads();
		t1.start();
		t1.interrupt();
	}

}
