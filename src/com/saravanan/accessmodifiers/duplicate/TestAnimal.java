package com.saravanan.accessmodifiers.duplicate;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal a = new Animal();
		Horse h = new Horse();
		
		Animal ah=new Horse();
		
		a.eat();
		//h.eat();
		h.superAnimal();
		
		ah.eat();
		
	}

}
