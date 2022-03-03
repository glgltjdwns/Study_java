package com.urdomain.lecture.ch07;

public abstract class Animal {
	public String kind;
	
//  생성자 
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();
//	public abstract void sound(Striing m);
	
}
