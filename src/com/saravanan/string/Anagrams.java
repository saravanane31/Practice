package com.saravanan.string;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "anagrama";
		String s2 = "marganam";
		String copyOfS1 = s1.replaceAll("\\s", "");
		String copyOfS2 = s2.replace("\\s", "");
		boolean result =false;
		if(copyOfS1.length()==copyOfS2.length()){
			result =checkAnagrams(copyOfS1, copyOfS2);
		}
		if(result){
			System.out.println("Anagrams");
		}else{
			System.out.println("Not Anagrams");
		}
	}
	
	private static boolean checkAnagrams(String s1, String s2){
		char[] s1charArr = s1.toLowerCase().toCharArray();
		char[] s2charArr = s2.toLowerCase().toCharArray();
		
		Arrays.sort(s1charArr);
		Arrays.sort(s2charArr);
		
		boolean value = Arrays.equals(s1charArr, s2charArr);
		return value;
	}

}
