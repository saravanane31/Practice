package com.saravanan.thread;

class Runner implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<9;i++){
			System.out.println("Hello---");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class AppRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new Runner());
		thread.start();
	}

}
