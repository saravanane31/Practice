package com.saravanan.accessmodifiers.duplicate;

public class Tablet extends Electronic implements Gadget {

	@Override
	public void doSuff() {
		// TODO Auto-generated method stub
		System.out.println("show book");
	}

	public static void main(String[] args) {
		new Tablet().getPower();
		new Tablet().doSuff();
	}
}
