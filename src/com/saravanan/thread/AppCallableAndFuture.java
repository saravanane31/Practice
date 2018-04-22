package com.saravanan.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AppCallableAndFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(2);
		int[] array = {50,20,30,100};
		List<Future<Integer>> list = new ArrayList<Future<Integer>>();
		for(int i=0;i<4;i++){
			Future<Integer> future = executor.submit(new CallableAndFuture(array[i]));
			list.add(future);
		}
		int finalCount =0;
		for(Future<Integer> future:list){
			try {
				finalCount +=future.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("finalCount=="+finalCount);
		executor.shutdown();
	}

}
