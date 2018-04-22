package com.saravanan.immutable;

import java.lang.reflect.Field;

//import com.mysql.jdbc.Field;

public class MainClass {

	public static void main(String[] args) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
		// TODO Auto-generated method stub
		Age age = new Age(1991, 10, 31);
		ImmutableStudent immutable = new ImmutableStudent(1, "saravanan", age);
		System.out.println(immutable.getId()+"=="+immutable.getName()+"=="+immutable.getAge().getYear());
		immutable.getAge().setYear(1660);
		System.out.println(immutable.getId()+"=="+immutable.getName()+"=="+immutable.getAge().getYear());
		Class<ImmutableStudent> immu = ImmutableStudent.class;
		Field field = immu.getDeclaredField("id");
		field.setAccessible(true);
		field.set(immutable, 5);
		System.out.println(immutable.getId()+"=="+immutable.getName()+"=="+immutable.getAge().getYear());
	}

	
}
