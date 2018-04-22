package com.saravanan.collections;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> linkedSet = new LinkedHashSet<String>();
		linkedSet.add("saravanan");
		linkedSet.add("selvakumar");
		linkedSet.add("seduraman");
		linkedSet.add("saravanan");
		System.out.println(linkedSet.size());
		Iterator<String> it = linkedSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		LinkedHashSet<Employee> set = new LinkedHashSet<Employee>();
		set.add(emp1);
		set.add(emp3);
		set.add(emp4);
		set.add(null);
		set.add(null);
		
		System.out.println(set.size());
		Iterator<Employee> it1 = set.iterator();
		while(it1.hasNext()){
			Employee emp = it1.next();
			System.out.println(emp.getId()+"=="+emp.getName()+"=="+emp.getDob());
		}
	}

}
