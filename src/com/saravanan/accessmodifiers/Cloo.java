package com.saravanan.accessmodifiers;

public class Cloo extends Roo{

	private static String name;
	
	private static final String TEST="SARAVANAN";
	public static void main(String[] args) {
		Cloo cloo=new Cloo();
		cloo.clooThings();
		
	}
	
	public static void test(){
		System.out.println(name);
	}
	
	public void clooThings(){
		System.out.println(doRooThings());
		System.out.println(name);
	}
	
	public void returnTest(){
		System.out.println("before return statement");
		return;
	}
}
