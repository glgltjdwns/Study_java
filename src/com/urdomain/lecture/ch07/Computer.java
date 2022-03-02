package com.urdomain.lecture.ch07;

public class Computer extends Calculator {

	@Override
	public double areaCarcle(double r) {
		System.out.println("Calculator 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
	

}
