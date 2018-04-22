package com.saravanan.designpatterns.observerpattern;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observer ob1 = new CurrentScoreDisplay();
		Observer ob2 = new AverageScoreDisplay();
		CricketData cricket = new CricketData();
		cricket.addObserver(ob1);
		cricket.addObserver(ob2);
		
		cricket.dataChange();
		System.out.println("------------------------------");
		
		cricket.removeObserver(ob2);
		cricket.dataChange();
	}

}
