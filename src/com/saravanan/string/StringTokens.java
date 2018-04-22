package com.saravanan.string;

import java.util.Arrays;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="He is a very very good boy, isn't he?";
		
		String[] sArray = s.split("\\s/\\,/\\?/\\'");
		System.out.println(Arrays.toString(sArray));
	}

}
