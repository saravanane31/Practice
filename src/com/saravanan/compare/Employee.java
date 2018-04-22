package com.saravanan.compare;

public class Employee implements Comparable<Employee> {

	private Long id;
	private String name;
	private int age;
	private String emailId;
	private int experience;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Long id, String name, int age, String emailId,
			int experience) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.emailId = emailId;
		this.experience = experience;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+age+" "+emailId+" "+experience;
	}
	
	
}
