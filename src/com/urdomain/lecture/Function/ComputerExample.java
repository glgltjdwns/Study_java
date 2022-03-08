package com.urdomain.lecture.Function;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		Computer computer = new Computer();	
		
		int a = 7;
		
		
		System.out.println("원의 반지름: " + a);
		System.out.println();
		
		
		
		System.out.println("원면적: " + calculator.PAI_1 * a * a);
		
		System.out.println("원면적: " + computer.PAI_2 * a * a);

	}
}
