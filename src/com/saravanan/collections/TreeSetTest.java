package com.saravanan.collections;

import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<String>();
		set.add("seduraman");
		set.add("selvakumar");
		set.add("saravanan");
		System.out.println(set.size());
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		TreeSet<Employee> treeSet = new TreeSet<Employee>();
		treeSet.add(emp3);
		treeSet.add(emp2);
		treeSet.add(emp1);
		treeSet.add(emp4);
		System.out.println(treeSet.headSet(emp3).size());
		System.out.println(treeSet.size());
		Iterator<Employee> it1 = treeSet.iterator();
		while(it1.hasNext()){
			Employee emp = it1.next();
			System.out.println(emp.getId()+"=="+emp.getName());
		}
		
		
	}

}
