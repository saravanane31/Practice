package com.saravanan.accessmodifiers.duplicate;

import com.saravanan.accessmodifiers.Roo;

public class RooSubClass extends Roo{

	public static void main(String[] args) {
		RooSubClass subClass=new RooSubClass();
		subClass.doRooSubClass();
	}
	
	public void doRooSubClass(){
		System.out.println(doRooThings());
	}
}
