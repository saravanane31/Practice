package com.saravanan.collections;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add(null);
		set.add("saravanan");
		set.add(null);
		set.add("saravanan");
		System.out.println(set.size());
		
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		HashSet<Employee> hashSet = new HashSet<Employee>();
		hashSet.add(emp1);
		hashSet.add(emp2);
		hashSet.add(emp3);
		hashSet.add(emp4);
		System.out.println(hashSet.size());
		Iterator<Employee> it = hashSet.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.getId()+"=="+emp.getName()+"=="+emp.getDob());
		}
		
		HashSet<String> empSet = (HashSet<String>) hashSet.clone();
		System.out.println(empSet.size());
		Iterator<String> it1 = empSet.iterator();
		while(it1.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.getName());
		}
		
	}

}
