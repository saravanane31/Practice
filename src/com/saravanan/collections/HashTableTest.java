package com.saravanan.collections;

import java.util.Date;
import java.util.Hashtable;

public class HashTableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Employee, String> table = new Hashtable<Employee, String>();
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		
		table.put(emp1, "saravanan");
		table.put(emp2, "selvakumar");
		table.put(emp3, "seduraman");
		table.put(emp4, "saravanan");
		
		System.out.println(table.size());
		System.out.println(table.toString());
		
	}

}
