package com.saravanan.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1L, "saravanan", 26, "saravanane31@gmail.com", 4);
		Employee e2 = new Employee(2L, "arun", 27, "arun@gmail.com", 4);
		Employee e3 = new Employee(3L, "barani", 26, "barani@gmail.com", 4);
		Employee e4 = new Employee(4L, "vijay", 30, "vijay@gmail.com", 7);
		Employee e5 = new Employee(6L, "elavarasan", 29, "elavarasan@gmail.com", 7);
		Employee e6 = new Employee(5L, "biswajit", 25, "biswajit@gmail.com", 3);
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		
		System.out.println(Arrays.toString(employee.toArray()));
		
		Collections.sort(employee);
		
		System.out.println(Arrays.toString(employee.toArray()));
		
		SortById sortById = new SortById();
		
		Collections.sort(employee,sortById);
		
		System.out.println(Arrays.toString(employee.toArray()));
		
		SoryByAge sortByAge = new SoryByAge();
		
		Collections.sort(employee, sortByAge);
		
		System.out.println(Arrays.toString(employee.toArray()));
		
	}

}
