package com.saravanan.thread;

public class AppProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppProducerConsumer app = new AppProducerConsumer();
		app.doWork();
	}
	
	private void doWork(){
		final ProducerConsumer producer = new ProducerConsumer();
		
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					producer.producer();
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
					producer.consumer();
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
	}

}
