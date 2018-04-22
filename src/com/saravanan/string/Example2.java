package com.saravanan.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Helloworld";
		System.out.println(s.substring(3, 7));
		
		String t="welcometojava";
		System.out.println(t.length());
		List<String> tList = new ArrayList<String>();
		int j =3;
		for(int i=0;i<t.length();i++){
			
			tList.add(t.substring(i,j));
			if(j>=t.length()){
				break;
			}
			j++;
		}
		Collections.sort(tList);
		System.out.println(Arrays.asList(tList));
		System.out.println(tList.get(0));
		System.out.println(tList.get(tList.size()-1));
		
		
	}

}
