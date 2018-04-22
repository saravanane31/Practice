package com.saravanan.accessmodifiers;

public class Toon extends Test{

	public static void main(String[] args) {
		/*Cloo cloo=new Cloo();
		System.out.println(cloo.doRooThings());*/
		//System.out.println(testing(6,7));
	}
	
	public void test(){
		System.out.println(testing(6,7));
	}
}


class Test{
	int testing(int x,int y){
		return x+y;
	};
}
