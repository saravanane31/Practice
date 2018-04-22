package com.saravanan;

class Bird {
static{
	System.out.println("static bird");
}
	{System.out.println("b1");}
	
	public Bird() {
		// TODO Auto-generated constructor stub
		super();
		
		System.out.println("b2");
	}
}

class Raptor extends Bird{
	static{
		System.out.println("r1");
	}
	
	public Raptor() {
		// TODO Auto-generated constructor stub
		super();
		System.out.println("r2");
	}
	{System.out.println("r3");}
	static{
		System.out.println("r4");
	}
}

public class ConstructorWorks extends Raptor{
	public static void main(String[] args) {
		System.out.println("pre");
		new ConstructorWorks();
		new ConstructorWorks();
		System.out.println("hawk");
	}
}