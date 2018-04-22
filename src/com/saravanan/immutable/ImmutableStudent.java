package com.saravanan.immutable;

public final class ImmutableStudent {

	private final int id;
	private final String name;
	private final Age age;
	
	public ImmutableStudent(int id, String name, Age age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		return new Age(age.getYear(), age.getMonth(), age.getDate());
	}
	
	
	
}
