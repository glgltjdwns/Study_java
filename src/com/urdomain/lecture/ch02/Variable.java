package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
// 		변수 명명법
//   	첫글자 소문자 그리고 다음 문자열 부터는 대문자
//		모든 변수명은 붙여서 사용
		String fullName = " Wonyoung Chang " ;
		String name = " Wonyoung " ;		


//      대소문자 구분함

		int roomNumber = 1 ;
		int roomnumber = 2 ;
		
		System.out.println("roomNumber: " +  roomNumber);
		System.out.println("roomnumber: " +  roomnumber);
		
// 		예약어는 사용 할 수 없다
// 		int int = 2 ; 	//error
	
		
//  	변수 선언 과 사용
// 		변수 선언
//		변수 초기화 (선운후 처음으로 값 저장)
		int a = 1;	// 선언 : 사용 할수 없다
//		a = 1;	// 대입
		int b = 2; // 선언과 초기화
		
		int c = 0;
		
		c = a + b;
		
		System.out.println(c);
//		변수 초기화 하여야 메모리에 생성 되고 연산에 이용 될 수 있다.


//		-----------------------------------------------
		
//		그래서 변수 선언시 초기화를 하는 습관을 들이자
		
//		정수형은 0
//		실수형은 0.0
//		문자형은 '' 또는 ""

		boolean defaultNy = false; //true
		boolean delNy = false;	//true
		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg = ' ';
		
		String hh = "";
				
		
//		변수 사용 (변수값 저장 & 변수값 읽음)
		
//		리터럴 = 데이터이다
//		ex)정수형리리컬 = 정수형데이터
				
//  	이스케이프 문자
		System.out.println(c);
		System.out.println("Wonyoung Chang");
		System.out.println("Wonyoung : " +  c  + " wram!!");
		
		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		System.out.println("\t\t한칸들여쓰기");
		
		System.out.println("한줄바꿈");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈");
		
		System.out.println("\'나는생각한다\'");
		System.out.println("쏘크라테스가 말했다 \"나는 존재한다.\"");
		System.out.println("\\");
		
		System.out.println("asdfgas");
		System.out.println("asdfgas");
		
//		변수의 범위
//		변수는 선언된 블럭 내에서만 사용 가능하다.
		
		if(a == 1) {
			int aaa = 10 ;
			int bbb = aaa + a;
			System.out.println("bbb: " + bbb);
		} else {
						
		}
		
		
//		System.out.println("bbb: " + bbb); // error
		
		
		
//		boolean defaultNy = 1;

	}

}
