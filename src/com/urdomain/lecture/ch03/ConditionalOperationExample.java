package com.urdomain.lecture.ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		
		int score = 85;
		
//		char grade = (score > 90 ? 'A' : 'B');
		char grade = (score > 90 ? 'A' :(score >80 ? 'B' : 'C') );
	
		System.out.println("gread: " + grade); // B
	}

}
