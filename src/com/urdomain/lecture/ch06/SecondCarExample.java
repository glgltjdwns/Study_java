package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		
		SecondCar secondCar = new SecondCar();
		
		
		secondCar.company = "현대자동차";
		
		System.out.println("secondCar.company: " + secondCar.company);
		System.out.println("secondCar.model: " + secondCar.model);
		System.out.println("secondCar.color: " + secondCar.color);
		System.out.println("secondCar.maxSpeed: " + secondCar.maxSpeed);
		
		
		SecondCar secondCar1 = new SecondCar("팰리세이드");
		
		System.out.println("---------------");
		System.out.println("secondCar.company: " + secondCar1.company);
		System.out.println("secondCar.model: " + secondCar1.model);
		System.out.println("secondCar.color: " + secondCar1.color);
		System.out.println("secondCar.maxSpeed: " + secondCar1.maxSpeed);
		
		
		
		SecondCar secondCar2 = new SecondCar("산타페","파랑");
		
		System.out.println("---------------");
		System.out.println("secondCar.company: " + secondCar2.company);
		System.out.println("secondCar.model: " + secondCar2.model);
		System.out.println("secondCar.color: " + secondCar2.color);
		System.out.println("secondCar.maxSpeed: " + secondCar2.maxSpeed);
	
		SecondCar secondCar3 = new SecondCar("쏘나타","빨강",260);
		
		System.out.println("---------------");
		System.out.println("secondCar.company: " + secondCar3.company);
		System.out.println("secondCar.model: " + secondCar3.model);
		System.out.println("secondCar.color: " + secondCar3.color);
		System.out.println("secondCar.maxSpeed: " + secondCar3.maxSpeed);
	}

}
