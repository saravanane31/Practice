package com.saravanan.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();
		list.add("saravanan");
		list.add("seduraman");
		list.add("selvakumar");
		String[] array = list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(array));
		LinkedList<String> list1 = new LinkedList<String>(Arrays.asList(array));
		ListIterator<String> it = list1.listIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
		
		
	}

}
