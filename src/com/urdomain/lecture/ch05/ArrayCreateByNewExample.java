package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
//		int[] score = {83,90,87,99};
		
		int[] arr1 = new int[3]; 
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		
		
		
		
		double[] arr2 = new double[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		arr2[0] = 1.0;
		arr2[1] = 2.0;
		arr2[2] = 3.0;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
		arr3[0] = "장영원";
		arr3[1] = "전지현";
		arr3[2] = "장동건";
		
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}
		
	}

}
