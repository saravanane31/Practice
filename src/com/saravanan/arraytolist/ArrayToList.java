package com.saravanan.arraytolist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = {"one","two","three","four"};
		
		List sList = Arrays.asList(sa);
		
		System.out.println(sList.size());
		System.out.println(sList.get(2));
		
		sList.set(3, "six");
		sa[1]="five";
		
		System.out.println(sa.toString());
		System.out.println(Arrays.toString(sList.toArray()));

	}

}
