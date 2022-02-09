package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z ;
	
		System.out.println("--------------------");
		
		x++; //11
		++x; //12
		
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		System.out.println("x=" + x); //12
		
		System.out.println("--------------------");
		
		y--; //8
		--y;//8 
		System.out.println("y=" + y); //8
		
		System.out.println("--------------------");
		z = x++; //12
		System.out.println("z=" + x); //12
		System.out.println("x=" + x); //13
		
		System.out.println("--------------------");
		z = ++x;
		System.out.println("z=" + x); // 14
		System.out.println("x=" + x);//	14
		System.out.println("--------------------"); //x 15 y 8
		z = ++x + y++;
		System.out.println("z=" + z);  // 23
		System.out.println("x=" + x); // 15
		System.out.println("y=" + y); // 9
		
		
		
		
	}

}
