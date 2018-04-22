package com.saravanan.string;

public class JavaStringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="He is a very very good boy, isn't he?";
		
		if(s.length()==0){
			System.out.println("string length 0");
			return;
		}
		
		String[] sArray = s.split("[^a-zA-Z]+");
		System.out.println(sArray.length);
		for(String a:sArray){
			System.out.println(a);
		}
	}

}
