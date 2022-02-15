package com.urdomain.lecture.ch04;

public class Test {

	public static void main(String[] args) {
		
//		
//		int sum = 0;
//		for(int i= 1; i<=10; i++ ) {
////			sum += i;
//			sum = sum + i;
		
		int sum = 0;
		int sum2 = 1;
		
		for (int i=1; i<=9; i++) {
			
			for(int j=2; j<=9; j++) {
				sum += i;
				sum2 += j;
				
				System.out.println(i + "x" + j + " = " + i*j);
				
			}
			
		}
		System.out.println(sum);
		System.out.println(sum2);

	}

}
