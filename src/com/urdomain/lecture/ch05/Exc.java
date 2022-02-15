package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {

		int[] aaa = {2,3,4,5,6,7,8,9};
		int[] bbb = {2,3,4,5,6,7,8,9};
		
		int result=0;
				
		for(int i=0; i<aaa.length; i++) {
			System.out.println("★ " + aaa[i] + "단 ★");
			System.out.println("===========");
			for(int j=0; j<bbb.length; j++) {
				result = aaa[i]*bbb[j];
				System.out.println(aaa[i] + " X " + bbb[j] + " = " + result);
			}
			System.out.println("===========");
		}

		
		
		
		
		
		
		
	}

}


