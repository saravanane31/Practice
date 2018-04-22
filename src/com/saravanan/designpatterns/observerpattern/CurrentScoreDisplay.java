package com.saravanan.designpatterns.observerpattern;

public class CurrentScoreDisplay implements Observer{

	@Override
	public void update(int score, int wicket, float over) {
		// TODO Auto-generated method stub
		System.out.println("Current Score Display called");
		System.out.println(score);
		System.out.println(wicket);
		System.out.println(over);
	}

}
