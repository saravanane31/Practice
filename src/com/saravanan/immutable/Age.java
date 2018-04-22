package com.saravanan.immutable;

public class Age {

	private int year;
	private int month;
	private int date;
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public Age(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	
}
