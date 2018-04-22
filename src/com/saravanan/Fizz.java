package com.saravanan;

public class Fizz {

	int x=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Fizz f1 = new Fizz();
		Fizz f2 = new Fizz();
		Fizz f3 = FizzSwitch(f1, f2);
		System.out.println(f1.x);
		System.out.println((f1==f3)+" "+(f1.x == f3.x));
		
		for(int i=0;i<5;++i){
			System.out.println(i);
		}
		
		int noOfPets=4;
		int sizeOfYard=10;
		String value=(noOfPets<4)?"Pets count ok":(sizeOfYard>8)?"Pets limit on edge":"out of edge";
		System.out.println(value);
		
		System.out.println("---------------");
		for(int i=0;i<=5;i++){
			System.out.println(i);
		}
		
		for(int x=0;x<=5;++x){
			System.out.println("X="+x);
		}
	}
	
	static Fizz FizzSwitch(Fizz x, Fizz y){
		final Fizz z = x;
		z.x = 6;
		return z;
	}

}
