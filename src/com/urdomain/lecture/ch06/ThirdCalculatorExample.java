package com.urdomain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		ThirdCalculator thridCalculator = new ThirdCalculator();
		
		double result1 = thridCalculator.areaRectangle(10); // 정사각형
		
		double result2 = thridCalculator.areaRectangle(10, 20); // 직사각형
		
		System.out.println("사각형의 넓이: " + result1);
		System.out.println("사각형의 넓이: " + result2);
	}

}
