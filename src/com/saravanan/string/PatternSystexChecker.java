package com.saravanan.string;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSystexChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="([A-Z])(.+)";
		String s2="[AZ[a-z](a-z)";
		String s3="batcatpat(nat";
		
		try{
			Pattern.compile(s3);
			System.out.println("Valid");
		}catch(PatternSyntaxException e){
			System.out.println("Invalid");
		}
		
	}

}
