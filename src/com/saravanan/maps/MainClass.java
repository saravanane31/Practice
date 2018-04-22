package com.saravanan.maps;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog("tommy");
		MainClass mainClass = new MainClass();
		System.out.println(dog.getName());
		mainClass.testMethod(dog);
		System.out.println(dog.getName());
	}

	public void testMethod(Dog dog){
		dog.setName("mani");
	}
}
