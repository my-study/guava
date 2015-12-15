package com.hailiang.study.guava.common.collect;

import com.google.common.collect.ComparisonChain;

public class Person implements Comparable<Person> {
	private String firstName;
	private String lastName;
	private int zipCode;

	public Person(String firstName, String lastName, int zipCode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.zipCode = zipCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int compareTo(Person that) {
		return ComparisonChain.start()
			.compare(this.firstName, that.firstName)
			.compare(this.lastName, that.lastName)
			.result();
	}
}
