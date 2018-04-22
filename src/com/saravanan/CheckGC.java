package com.saravanan;

import java.util.Date;

public class CheckGC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		System.out.println("Memory available before create object=="+rt.totalMemory());
		System.out.println("Free memory available===="+rt.freeMemory());
		
		Date d=null;
		
		for(int i=0;i<10;i++){
			d=new Date();
			d=null;
			System.out.println("Free memory available===="+rt.freeMemory());
			rt.gc();
			System.out.println(rt.freeMemory());
		}
		
		System.out.println("Free memory available===="+rt.freeMemory());
		
	}

}
