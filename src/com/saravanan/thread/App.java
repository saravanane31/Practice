package com.saravanan.thread;

class Runner extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++){
			System.out.println("hello--");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner = new Runner();
		runner.start();
	}

}
