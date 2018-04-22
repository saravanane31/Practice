package com.saravanan.designpatterns.observerpattern;

public class AverageScoreDisplay implements Observer {

	@Override
	public void update(int score, int wicket, float over) {
		// TODO Auto-generated method stub
		System.out.println("Average Score Display is called");
		System.out.println(score);
		System.out.println(wicket);
		System.out.println(over);
	}

}
