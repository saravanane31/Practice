package com.saravanan.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("saravanan");
		list.add("seduraman");
		String[] array = list.toArray(new String[list.size()]);
		
		System.out.println(array.length);
		String[] array1 = Arrays.copyOf(array, 5);
		System.out.println(Arrays.toString(array)+"==="+array.length);
		System.out.println(Arrays.toString(array1));
		List<String> list2 = new ArrayList<String>(Arrays.asList(array1));
		System.out.println(list2.size());
		Iterator<String> it = list2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}
		
		
	}

}
