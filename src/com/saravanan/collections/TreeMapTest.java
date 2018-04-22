package com.saravanan.collections;

import java.util.Date;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Employee, String> map = new TreeMap<Employee, String>();
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		map.put(emp1, null);
		map.put(emp2, null);
		map.put(emp3, null);
		map.put(emp4, null);
		
	}

}
