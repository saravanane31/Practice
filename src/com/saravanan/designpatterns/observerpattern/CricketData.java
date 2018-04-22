package com.saravanan.designpatterns.observerpattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject {
	
	private int score;
	private int wicket;
	private float over;
	
	private List<Observer> list = null;
	
	public CricketData() {
		// TODO Auto-generated constructor stub
		list = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		// TODO Auto-generated method stub
		list.remove(list.indexOf(observer));
	}

	public int getScore() {
		return 99;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getWicket() {
		return 3;
	}

	public void setWicket(int wicket) {
		this.wicket = wicket;
	}

	public float getOver() {
		return 10.4F;
	}

	public void setOver(float over) {
		this.over = over;
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for(Iterator<Observer> it=list.iterator(); it.hasNext();){
			Observer o = it.next();
			o.update(score, wicket, over);
		}
	}
	
	public void dataChange(){
		score = getScore();
		wicket = getWicket();
		over = getOver();
		notifyObserver();
	}

}
