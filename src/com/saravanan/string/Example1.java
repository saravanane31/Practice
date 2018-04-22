package com.saravanan.string;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String A = "hello";
		String B = "java";
		String C = A.concat(B);
		System.out.println(C.length());
		int value = A.compareTo(B);
		String lexicographically=(value>0)?"Yes":"No";
		System.out.println(lexicographically);
		System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));

	}

}
