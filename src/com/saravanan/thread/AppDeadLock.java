package com.saravanan.thread;

public class AppDeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppDeadLock app = new AppDeadLock();
		//while(true){
		app.doWork();
		//}
	}

	public void doWork(){
		final DeadLockExample deadLock = new DeadLockExample();
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					deadLock.firstThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					deadLock.secondThread();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		
		deadLock.finished();
	}
}
