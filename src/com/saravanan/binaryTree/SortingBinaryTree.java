package com.saravanan.binaryTree;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.sun.org.apache.xalan.internal.xsltc.runtime.Hashtable;

public class SortingBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set = new TreeSet<Integer>();
		
		//set.add(null);
		set.add(1);
		System.out.println(set.size());
		
		Hashtable table = new Hashtable();
		table.put("a", "abc");
		table.put("b", "abcc");
		table.put("d", "value d");
		table.put("c", "value c");
		

System.out.println(table.toString());
	}
	
	

}
