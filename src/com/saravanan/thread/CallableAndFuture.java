package com.saravanan.thread;

import java.util.concurrent.Callable;

public class CallableAndFuture implements Callable<Integer> {

	private int count ;
	
	public CallableAndFuture(int count) {
		// TODO Auto-generated constructor stub
		this.count =count;
	}
	
	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return count;
	}

}
