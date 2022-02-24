package com.urdomain.lecture.ch06;

public class Person {

	final String nation = "korea";  // 1번 초기화
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {   // 2번초기화
		
		this.ssn = ssn;
		this.name = name;
	}
	
	
}
