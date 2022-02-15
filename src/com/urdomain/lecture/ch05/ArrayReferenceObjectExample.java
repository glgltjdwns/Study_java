package com.urdomain.lecture.ch05;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		
//		갯수만 우선 정하고 데이터는 나중에 채워 넣겠다.
		String[] strArray = new String[3];
		
		strArray[0] = "최성준";
		strArray[1] = "최성준";
		strArray[2] = new String ("최성준");
		
//		String strArray1 ="최성준";
//		String strArray2 ="최성준";
//		String strArray3 =new String ("최성준");
		
		for(int i=0; i<strArray.length; i++) {
			
			System.out.println(strArray[i]);
		}
		
		
		System.out.println(strArray[0] == strArray[1]); // true
		System.out.println(strArray[0] == strArray[2]); // false
		
		System.out.println(strArray[0].equals(strArray[1])); // true
		System.out.println(strArray[0].equals(strArray[2])); // true
		
//		equals : String 객체의 함수 : 문자열비교
		
		

		
	}

}
