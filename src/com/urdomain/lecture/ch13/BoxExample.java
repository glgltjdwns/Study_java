package com.urdomain.lecture.ch13;

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		//Box 객체중에서 한개 즉 지네릭 타입은 String 으로 된 것 이다.
		//String t;
		box.set("김모시깽이");
		String str = box.get();
		System.out.println("str: " + str);
		
		Box<Integer> box2 = new Box<Integer>();
		//t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number: " + number);
		
		

		

	}

}
