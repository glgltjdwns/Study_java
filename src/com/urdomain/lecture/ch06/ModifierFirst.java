package com.urdomain.lecture.ch06;

public class ModifierFirst {		// class : public, (default)만 가능
	
	public String name = "";		// f
	public String ssn = "";
	
	public ModifierFirst(String ssn){
		this.ssn = ssn;
	}

	public int add(int x , int y) {
		return x + y;
	}
	
}
