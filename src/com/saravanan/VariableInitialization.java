package com.saravanan;

public class VariableInitialization {

	private int age;
	
	private String name="saravanan";
	private String firstName="null";
	private String lastName = null;
	private String empty ="";
	
	private int[] names;
	
	public static void main(String[] args) {
		int number;
		VariableInitialization v = new VariableInitialization();
		v.age=10;
		System.out.println(v.age);
		System.out.println((v.names));
		VariableInitialization v2=v;
		System.out.println(v+"==="+v2);
		
		System.out.println(v2.age);
		v.age=15;
		System.out.println(v2.age);
		
	}
}
