package com.urdomain.lecture.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		
//		int[] score; //선언
//		
//		int score2[];	//선언
//		
//		int[] score3 = {1,2,3,4,5,6,7,8,9,10};    // 객체 생성
//		
//		int score4[] = {4,5,6};	   // 객체 생성
//		
//		double[] score6 = {1,2,3,4,};
//		
//		String[] strArray = {"장영원","전지현","장동건","고소영"};
		
//		입력이 되는 데이터 타입이 동일해야 된다. 
//		순서는 무조건 0 부터 시작한다. index
//		총갯수를 원할하게 늘릴수 없다.
		
		int[] score = {83,90,87,99};
		
		System.out.println("score[0]: " + score[0]);
		System.out.println("score[1]: " + score[1]);
		System.out.println("score[2]: " + score[2]);
		System.out.println("score[3]: " + score[3]);
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			
			sum += score[i];
			
		}
		double avg =  sum / 4.0;
//		double avg =  (double)sum /4;  위 또는 아래 사용
		
		System.out.println("총합은 : " + sum);
		System.out.println("평균은 : " + avg);
		
 	}

}
