package com.saravanan.thread;

import java.util.Scanner;

class Runners extends Thread{
	
	private volatile  boolean running = true;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(running){
			System.out.println(" Hello while loop");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void shutDown(){
		running=false;
	}
}

public class ThreadShutDown {

	public static void main(String[] args) {
		Runners runner = new Runners();
		runner.start();
		System.out.println("Please Enter to stop thread");
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		runner.shutDown();
	}

}
