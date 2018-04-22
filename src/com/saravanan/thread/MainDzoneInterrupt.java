package com.saravanan.thread;

public class MainDzoneInterrupt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new DzoneInterrupt());
		t1.start();
		Thread.sleep(3000);
		t1.interrupt();
		t1.join(1000);
	}

}
