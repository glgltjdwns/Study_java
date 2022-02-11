package com.urdomain.lecture.ch04;

public class IfNestedExample {

	public static void main(String[] args) {
//		int score = 98;
//		String grade = "";
//		
//		if(score >= 90) {
//			if(score >= 95) {
//				grade = "A+" ; //범위 90~94
//			} else {
//				grade = "A"; 
//				
//			}
//		}
//		System.out.println("학점은 :" + grade );
//	
//	
		
		int score = 98;
		String grade = "";

		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";

			}
		if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		}
		if (score >= 60) {
			if (score >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}

			if (score >= 50) {
				grade = "F";

			} else {
				grade = "F";
			}

			System.out.println("학점은 :" + grade );
	
	
	
	
	
		
		
		
		
		
		
// a+, a, b+, b ,c+ , c, d+, d, f
		// A가 B보다 큰경우에는 '>'를 출력한다.
		// A가 B보다 작은 경우에는 '<'를 출력한다	
		// A와 B가 같은 경우에는 '=='를 출력한		
		
	}

	}
}
}



