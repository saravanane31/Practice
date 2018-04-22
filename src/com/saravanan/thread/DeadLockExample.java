package com.saravanan.thread;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockExample {
	
	Account account1 = new Account();
	Account account2 = new Account();
	
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquireLock(Lock firstLock, Lock secondLock) throws InterruptedException{
		while(true){
			boolean getFirstLock = false;
			boolean getSecondLock = false;
			
			try{
				getFirstLock = firstLock.tryLock();
				getSecondLock = secondLock.tryLock();
			}finally{
				if(getFirstLock && getSecondLock){
					return;
				}
				if(getFirstLock){
					firstLock.unlock();
				}
				if(getSecondLock){
					secondLock.unlock();
				}
			}
			Thread.sleep(1);
		}
	}
	
	public void firstThread() throws InterruptedException{
		Random random = new Random();
		//acquireLock(lock1, lock2);
		try{
		Account.fundTransfer(account1, account2, random.nextInt(100));
		
		}finally{
		/*lock1.unlock();
		lock2.unlock();*/
		}
	}
	
	public void secondThread() throws InterruptedException{
		Random random = new Random();
		//acquireLock(lock2, lock1);
		try{
		Account.fundTransfer(account2, account1, random.nextInt(100));
		
		}finally{
		/*lock2.unlock();
		lock1.unlock();*/
		}
	}
	
	public void finished(){
		System.out.println("Account 1 ="+account1.getBalance());
		System.out.println("Account 2 ="+ account2.getBalance());
		System.out.println("Total=="+(account1.getBalance()+account2.getBalance()));
	}

}
