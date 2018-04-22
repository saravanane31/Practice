package com.saravanan.string;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="java";
		StringBuffer sBuffer = new StringBuffer(s);
		//StringBuffer buffer = new StringBuffer(s);
		System.out.println(sBuffer);
		System.out.println(sBuffer.reverse());
		System.out.println("Palindrome using String Buffer=="+sBuffer.toString().equals(sBuffer.reverse().toString()));
		
		//Using Char Array;
		
		char[] chArr = s.toCharArray();
		char[] reChArr = new char[chArr.length];
		for(int i=0;i<chArr.length;i++){
			reChArr[i]=chArr[chArr.length-i-1];
		}
		
		System.out.println("reverse ch array=="+Arrays.toString(reChArr));
		System.out.println(String.valueOf(reChArr));
		System.out.println("Palindrome using char array=="+s.equals(String.valueOf(reChArr)));
	}

}
