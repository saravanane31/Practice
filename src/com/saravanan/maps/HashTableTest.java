package com.saravanan.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> table = new Hashtable<String, String>();
		table.put("one", "elangovan");
		table.put("two", "elangovan");
		System.out.println(table.size());
		
		HashMap<String, String> map	 = new HashMap<String, String>();
		map.put("one", "elangovan");
		map.put(null, null);
		System.out.println(map.size());

		TreeMap<String, String> tree= new TreeMap<String, String>();
		tree.put("one", "elangovan");
		tree.put("two", null);
		tree.put("three",null);
		System.out.println(tree.size());
	}

}
