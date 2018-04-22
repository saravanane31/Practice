package com.saravanan.compare;

import java.util.Comparator;

public class SoryByAge implements Comparator<Employee> {

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getAge()>emp2.getAge()){
			return 1;
		}else if (emp1.getAge()<emp2.getAge()){
			return -1;
		}
		return 0;
	}

}
