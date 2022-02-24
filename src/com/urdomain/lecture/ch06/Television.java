package com.urdomain.lecture.ch06;

public class Television {
	
	public static String company = "Samsung";
	public static String model = "OLDE";
	public static String info;
	public String version = "1.0";
	
	
	static {
		info = company + " " + model;
//		info = company + " " + model + version; static 가아니면 들어갈수가 없다 에러
	}
	
	
	
}
