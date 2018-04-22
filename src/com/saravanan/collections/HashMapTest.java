package com.saravanan.collections;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "seduraman");
		map.put(2, "saravanan");
		map.put(3, "selvakumar");
		Set set = map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> ent = (Entry<Integer, String>) it.next();
			System.out.println(ent.getKey()+"=="+ent.getValue());
		}
		Employee emp1 = new Employee(1, "saravanan", new Date());
		Employee emp2 = new Employee(2, "selvakumar", new Date());
		Employee emp3 = new Employee(3, "seduraman", new Date());
		Employee emp4 = new Employee(1, "saravanan", new Date());
		HashMap<Employee,String> map1 = new HashMap<Employee, String>();
		map1.put(emp1, "first");
		map1.put(emp2, "second");
		map1.put(emp3, "three");
		map1.put(emp4, "four");
		System.out.println(map1.size());
		Set set1 = map1.entrySet();
		Iterator it1 = set1.iterator();
		while(it1.hasNext()){
			Map.Entry<Employee, String> ment=(Entry<Employee, String>) it1.next();
			System.out.println(ment.getKey()+"=="+ment.getValue());
		}
	}

}
