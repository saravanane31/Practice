package com.saravanan.trickyJournalDev;

public class Trick1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(T.x);
	}

}

class T{
	//public static  int x =100;
	public static final int x=100;
	
	static{
		System.out.println("T static block loaded");
	}
}

/*
 * public static int x=100
 * output:
 * T static block loaded
 * 100
 * 
 * 
 * public static final int x=100;
 * output;
 * 100
 * */
 